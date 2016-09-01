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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoPedidoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoPedidoDetalleFormJInternalFrame extends EstadoPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPedido;
	
	protected JMenuBar jmenuBarDetalleEstadoPedido;
	
	protected JMenu jmenuDetalleEstadoPedido;
	protected JMenu jmenuDetalleArchivoEstadoPedido;
	protected JMenu jmenuDetalleAccionesEstadoPedido;
	protected JMenu jmenuDetalleDatosEstadoPedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPedido;	
	protected GridBagConstraints gridBagConstraintsEstadoPedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPedidoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPedido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorgeneral="";
	
	public EstadoPedidoSessionBean estadopedidoSessionBean;
	
	

	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignacion=false;
	public ConsignacionSessionBean consignacionSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;
	
	
	public ColorGeneralSessionBean colorgeneralSessionBean;	
	
	public EstadoPedidoLogic estadopedidoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPedido;
	public JScrollPane jScrollPanelDatosEdicionEstadoPedido;
	public JScrollPane jScrollPanelDatosGeneralEstadoPedido;
	
	protected JPanel jPanelCamposEstadoPedido;    
	protected JPanel jPanelCamposOcultosEstadoPedido;    	
	protected JPanel jPanelAccionesEstadoPedido;
	protected JPanel jPanelAccionesFormularioEstadoPedido;
    
	
	
	protected Integer iXPanelCamposEstadoPedido=0;
	protected Integer iYPanelCamposEstadoPedido=0;
	
	protected Integer iXPanelCamposOcultosEstadoPedido=0;
	protected Integer iYPanelCamposOcultosEstadoPedido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPedido;
	public JButton jButtonModificarEstadoPedido;
	public JButton jButtonActualizarEstadoPedido;
    public JButton jButtonEliminarEstadoPedido;
	public JButton jButtonCancelarEstadoPedido;
    public JButton jButtonGuardarCambiosEstadoPedido;
	public JButton jButtonGuardarCambiosTablaEstadoPedido;
	protected JButton jButtonCerrarEstadoPedido;
	
	
	protected JButton jButtonProcesarInformacionEstadoPedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPedido;
	protected JButton jButtonModificarToolBarEstadoPedido;
	protected JButton jButtonActualizarToolBarEstadoPedido;
    protected JButton jButtonEliminarToolBarEstadoPedido;
	protected JButton jButtonCancelarToolBarEstadoPedido;
    protected JButton jButtonGuardarCambiosToolBarEstadoPedido;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPedido;
	protected JButton jButtonCerrarToolBarEstadoPedido;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPedido;
	protected JMenuItem jMenuItemModificarEstadoPedido;
	protected JMenuItem jMenuItemActualizarEstadoPedido;
    protected JMenuItem jMenuItemEliminarEstadoPedido;
	protected JMenuItem jMenuItemCancelarEstadoPedido;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPedido;
	protected JMenuItem jMenuItemCerrarEstadoPedido;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPedido;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPedido;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPedido;
	public JLabel jLabelIdEstadoPedido;
	public JTextFieldMe jTextFieldidEstadoPedido;
	public JButton jButtonidEstadoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoPedido;
	public JLabel jLabelcodigoEstadoPedido;
	public JTextField jTextFieldcodigoEstadoPedido;
	public JButton jButtoncodigoEstadoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPedido;
	public JLabel jLabelnombreEstadoPedido;
	public JTextArea jTextAreanombreEstadoPedido;
	public JScrollPane jscrollPanenombreEstadoPedido;
	public JButton jButtonnombreEstadoPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_color_generalEstadoPedido;
	public JLabel jLabelid_color_generalEstadoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_generalEstadoPedido;
	public JButton jButtonid_color_generalEstadoPedido= new JButtonMe();
	public JButton jButtonid_color_generalEstadoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_color_generalEstadoPedidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPedido;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadoPedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPedido=new JPanel();
				this.jPanelAccionesFormularioEstadoPedido=new JPanel();
				this.jmenuBarDetalleEstadoPedido=new JMenuBar();
				this.jTtoolBarDetalleEstadoPedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPedido() {
		return this.jButtonActualizarToolBarEstadoPedido;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPedido() {
		return this.jButtonEliminarToolBarEstadoPedido;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPedido() {
		return this.jButtonCancelarToolBarEstadoPedido;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPedido() {
		return this.jButtonProcesarInformacionEstadoPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPedido)	{
		this.jButtonProcesarInformacionEstadoPedido = jButtonProcesarInformacionEstadoPedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPedido() {
		return this.jComboBoxTiposAccionesEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPedido(
			JComboBox jComboBoxTiposRelacionesEstadoPedido) {
		this.jComboBoxTiposRelacionesEstadoPedido = jComboBoxTiposRelacionesEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPedido(
			JComboBox jComboBoxTiposAccionesEstadoPedido) {
		this.jComboBoxTiposAccionesEstadoPedido = jComboBoxTiposAccionesEstadoPedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPedido() {
		return this.jComboBoxTiposAccionesFormularioEstadoPedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPedido(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPedido) {
		this.jComboBoxTiposAccionesFormularioEstadoPedido = jComboBoxTiposAccionesFormularioEstadoPedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
		
		this.estadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.consignacionSessionBean=new ConsignacionSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPedido=new JButtonMe();
				this.jButtonModificarToolBarEstadoPedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPedido,this.jTtoolBarDetalleEstadoPedido,
							"actualizar","actualizar","Actualizar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPedido,this.jTtoolBarDetalleEstadoPedido,
							"eliminar","eliminar","Eliminar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPedido,this.jTtoolBarDetalleEstadoPedido,
							"cancelar","cancelar","Cancelar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPedido,this.jTtoolBarDetalleEstadoPedido,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPedido.add(this.jMenuItemDetalleCerrarEstadoPedido);
		
		this.jmenuDetalleAccionesEstadoPedido.add(this.jMenuItemActualizarEstadoPedido);
		this.jmenuDetalleAccionesEstadoPedido.add(this.jMenuItemEliminarEstadoPedido);
		this.jmenuDetalleAccionesEstadoPedido.add(this.jMenuItemCancelarEstadoPedido);		
		
		//this.jmenuDetalleDatosEstadoPedido.add(this.jMenuItemDetalleAbrirOrderByEstadoPedido);				
		this.jmenuDetalleDatosEstadoPedido.add(this.jMenuItemDetalleMostarOcultarEstadoPedido);				
				
		//this.jmenuDetalleAccionesEstadoPedido.add(this.jMenuItemGuardarCambiosEstadoPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPedido.add(this.jmenuDetalleArchivoEstadoPedido);		
		this.jmenuBarDetalleEstadoPedido.add(this.jmenuDetalleAccionesEstadoPedido);		
		this.jmenuBarDetalleEstadoPedido.add(this.jmenuDetalleDatosEstadoPedido);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoPedido.add(this.jmenuDetalleEstadoPedido);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPedido);				
	}
	
	
	public void inicializarElementosCamposEstadoPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPedido = new JLabelMe();
		jLabelIdEstadoPedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPedido.setToolTipText(EstadoPedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPedido= new GridBagLayout();

		this.jPanelidEstadoPedido.setLayout(this.gridaBagLayoutEstadoPedido);

		jTextFieldidEstadoPedido = new JTextFieldMe();
		jTextFieldidEstadoPedido.setText("Id");

		jTextFieldidEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoPedido = new JLabelMe();
		this.jLabelcodigoEstadoPedido.setText(""+EstadoPedidoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoPedido.setToolTipText("Codigo");
		this.jLabelcodigoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoPedido.setToolTipText(EstadoPedidoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoPedido = new GridBagLayout();
		this.jPanelcodigoEstadoPedido.setLayout(this.gridaBagLayoutEstadoPedido);


		jTextFieldcodigoEstadoPedido= new JTextFieldMe();

		jTextFieldcodigoEstadoPedido.setEnabled(false);
		jTextFieldcodigoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoPedidoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoPedidoBusqueda.setText("U");
		this.jButtoncodigoEstadoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoPedidoBusqueda"));

		if(this.estadopedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoPedido = new JLabelMe();
		this.jLabelnombreEstadoPedido.setText(""+EstadoPedidoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPedido.setToolTipText("Nombre");
		this.jLabelnombreEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPedido.setToolTipText(EstadoPedidoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPedido = new GridBagLayout();
		this.jPanelnombreEstadoPedido.setLayout(this.gridaBagLayoutEstadoPedido);


		jTextAreanombreEstadoPedido= new JTextAreaMe();
		jTextAreanombreEstadoPedido.setEnabled(false);
		jTextAreanombreEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedido.setLineWrap(true);
		jTextAreanombreEstadoPedido.setWrapStyleWord(true);
		jTextAreanombreEstadoPedido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoPedido.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoPedido = new JScrollPane(jTextAreanombreEstadoPedido);
		jscrollPanenombreEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoPedidoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPedidoBusqueda.setText("U");
		this.jButtonnombreEstadoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPedidoBusqueda"));

		if(this.estadopedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_color_generalEstadoPedido = new JLabelMe();
		this.jLabelid_color_generalEstadoPedido.setText(""+EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL+" : *");
		this.jLabelid_color_generalEstadoPedido.setToolTipText("Color General");
		this.jLabelid_color_generalEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_generalEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_generalEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_color_generalEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_color_generalEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_color_generalEstadoPedido.setToolTipText(EstadoPedidoConstantesFunciones.LABEL_IDCOLORGENERAL);
		this.gridaBagLayoutEstadoPedido = new GridBagLayout();
		this.jPanelid_color_generalEstadoPedido.setLayout(this.gridaBagLayoutEstadoPedido);


		jComboBoxid_color_generalEstadoPedido= new JComboBoxMe();
		jComboBoxid_color_generalEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_generalEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_color_generalEstadoPedido= new JButtonMe();
		this.jButtonid_color_generalEstadoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoPedido.setText("Buscar");
		this.jButtonid_color_generalEstadoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_color_generalEstadoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_color_generalEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoPedido"));

		this.jButtonid_color_generalEstadoPedidoBusqueda= new JButtonMe();
		this.jButtonid_color_generalEstadoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_generalEstadoPedidoBusqueda.setText("U");
		this.jButtonid_color_generalEstadoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_color_generalEstadoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_color_generalEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoPedidoBusqueda"));

		if(this.estadopedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_color_generalEstadoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_color_generalEstadoPedidoUpdate= new JButtonMe();
		this.jButtonid_color_generalEstadoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_generalEstadoPedidoUpdate.setText("U");
		this.jButtonid_color_generalEstadoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_color_generalEstadoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_color_generalEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoPedidoUpdate"));



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
		//this.jInternalFrameDetalleEstadoPedido = new EstadoPedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPedido= new GridBagLayout();
		

		
		String sToolTipEstadoPedido="";
		sToolTipEstadoPedido=EstadoPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPedido+="(Facturacion.EstadoPedido)";
		}
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPedido = new JButtonMe();
		this.jButtonModificarEstadoPedido = new JButtonMe();
        this.jButtonActualizarEstadoPedido = new JButtonMe();
        this.jButtonEliminarEstadoPedido = new JButtonMe();
        this.jButtonCancelarEstadoPedido = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPedido = new JButtonMe();
		this.jButtonCerrarEstadoPedido = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPedido = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPedido = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pedido";
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPedido.setName("jPanelCamposEstadoPedido"); 

		this.jPanelCamposOcultosEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPedido.setName("jPanelCamposOcultosEstadoPedido"); 

        this.jPanelAccionesEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPedido.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPedido.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPedido.setText("Nuevo");
		this.jButtonModificarEstadoPedido.setText("Editar");
        this.jButtonActualizarEstadoPedido.setText("Actualizar");
        this.jButtonEliminarEstadoPedido.setText("Eliminar");
        this.jButtonCancelarEstadoPedido.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPedido.setText("Guardar");
		this.jButtonCerrarEstadoPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPedido,"nuevo_button","Nuevo",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPedido,"modificar_button","Editar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPedido,"actualizar_button","Actualizar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPedido,"eliminar_button","Eliminar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPedido,"cancelar_button","Cancelar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPedido,"guardarcambios_button","Guardar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPedido,"guardarcambiostabla_button","Guardar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPedido,"cerrar_button","Salir",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPedido.setToolTipText("Nuevo"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPedido.setToolTipText("Editar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPedido.setToolTipText("Actualizar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPedido.setToolTipText("Eliminar)"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPedido.setToolTipText("Cancelar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPedido.setToolTipText("Guardar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPedido.setToolTipText("Guardar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPedido.setToolTipText("Salir"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPedido";
		inputMap = this.jButtonNuevoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPedido";
		inputMap = this.jButtonActualizarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPedido"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPedido";
		inputMap = this.jButtonEliminarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPedido"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPedido";
		inputMap = this.jButtonCancelarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPedido"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPedido";
		inputMap = this.jButtonCerrarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPedido";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPedido.setToolTipText("Nuevo EstadoPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPedido.setToolTipText("Sin Cerrar Ventana EstadoPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPedido.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPedido = new JLabelMe();
		
		this.jLabelAccionesEstadoPedido.setText("Acciones");		
		this.jLabelAccionesEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPedido=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPedido = new GridBagLayout();
		
		this.jPanelCamposEstadoPedido.setLayout(gridaBagLayoutCamposEstadoPedido);
		this.jPanelCamposOcultosEstadoPedido.setLayout(gridaBagLayoutCamposOcultosEstadoPedido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 0;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPedido.add(jLabelIdEstadoPedido, this.gridBagConstraintsEstadoPedido);



	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 1;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPedido.add(jTextFieldidEstadoPedido, this.gridBagConstraintsEstadoPedido);


	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 0;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoPedido.add(jLabelcodigoEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx = 2;
		this.gridBagConstraintsEstadoPedido.ipadx = 0;
		this.gridBagConstraintsEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoPedido.add(jButtoncodigoEstadoPedidoBusqueda, this.gridBagConstraintsEstadoPedido);
	}

	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 1;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoPedido.add(jTextFieldcodigoEstadoPedido, this.gridBagConstraintsEstadoPedido);


	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 0;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPedido.add(jLabelnombreEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx = 2;
		this.gridBagConstraintsEstadoPedido.ipadx = 0;
		this.gridBagConstraintsEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPedido.add(jButtonnombreEstadoPedidoBusqueda, this.gridBagConstraintsEstadoPedido);
	}

	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 1;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPedido.add(jscrollPanenombreEstadoPedido, this.gridBagConstraintsEstadoPedido);


	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 0;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_color_generalEstadoPedido.add(jLabelid_color_generalEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx = 2;
		this.gridBagConstraintsEstadoPedido.ipadx = 0;
		this.gridBagConstraintsEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_generalEstadoPedido.add(jButtonid_color_generalEstadoPedidoBusqueda, this.gridBagConstraintsEstadoPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx = 3;
		this.gridBagConstraintsEstadoPedido.ipadx = 0;
		this.gridBagConstraintsEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_generalEstadoPedido.add(jButtonid_color_generalEstadoPedidoUpdate, this.gridBagConstraintsEstadoPedido);
	}

	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedido.gridy = 0;
	this.gridBagConstraintsEstadoPedido.gridx = 1;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_color_generalEstadoPedido.add(jComboBoxid_color_generalEstadoPedido, this.gridBagConstraintsEstadoPedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedido.gridy = iYPanelCamposEstadoPedido;
	this.gridBagConstraintsEstadoPedido.gridx = iXPanelCamposEstadoPedido++;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedido.add(this.jPanelidEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(iXPanelCamposEstadoPedido % 1==0) {
		iXPanelCamposEstadoPedido=0;
		iYPanelCamposEstadoPedido++;
	}
	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedido.gridy = iYPanelCamposEstadoPedido;
	this.gridBagConstraintsEstadoPedido.gridx = iXPanelCamposEstadoPedido++;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedido.add(this.jPanelcodigoEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(iXPanelCamposEstadoPedido % 1==0) {
		iXPanelCamposEstadoPedido=0;
		iYPanelCamposEstadoPedido++;
	}
	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedido.gridy = iYPanelCamposEstadoPedido;
	this.gridBagConstraintsEstadoPedido.gridx = iXPanelCamposEstadoPedido++;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedido.add(this.jPanelnombreEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(iXPanelCamposEstadoPedido % 1==0) {
		iXPanelCamposEstadoPedido=0;
		iYPanelCamposEstadoPedido++;
	}
	this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedido.gridy = iYPanelCamposEstadoPedido;
	this.gridBagConstraintsEstadoPedido.gridx = iXPanelCamposEstadoPedido++;
	this.gridBagConstraintsEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedido.add(this.jPanelid_color_generalEstadoPedido, this.gridBagConstraintsEstadoPedido);



	if(iXPanelCamposEstadoPedido % 1==0) {
		iXPanelCamposEstadoPedido=0;
		iYPanelCamposEstadoPedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPedido= new GridBagLayout();
		this.jPanelAccionesEstadoPedido.setLayout(gridaBagLayoutAccionesEstadoPedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPedido= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPedido.setLayout(gridaBagLayoutAccionesFormularioEstadoPedido);
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPedido.add(this.jComboBoxTiposAccionesFormularioEstadoPedido, this.gridBagConstraintsEstadoPedido);

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPedido.add(this.jCheckBoxPostAccionNuevoEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPedido.add(this.jCheckBoxPostAccionSinCerrarEstadoPedido, this.gridBagConstraintsEstadoPedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPedido.add(this.jCheckBoxPostAccionSinMensajeEstadoPedido, this.gridBagConstraintsEstadoPedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPedido.add(this.jButtonModificarEstadoPedido, this.gridBagConstraintsEstadoPedido);							

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPedido.add(this.jButtonEliminarEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
			
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = 0;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPedido.add(this.jButtonActualizarEstadoPedido, this.gridBagConstraintsEstadoPedido);


		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = 0;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPedido.add(this.jButtonGuardarCambiosEstadoPedido, this.gridBagConstraintsEstadoPedido);	
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = 0;		
		this.gridBagConstraintsEstadoPedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPedido.add(this.jButtonCancelarEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedido.gridx = 0;		
			//this.gridBagConstraintsEstadoPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedido.gridx =0;
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPedido, this.gridBagConstraintsEstadoPedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPedido = new EstadoPedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Pedido DATOS");
			
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
		    
			EstadoPedidoModel estadopedidoModel=new EstadoPedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPedidoModel.EstadoPedidoFocusTraversalPolicy estadopedidoFocusTraversalPolicy = estadopedidoModel.new EstadoPedidoFocusTraversalPolicy(this);
			
			//estadopedidoFocusTraversalPolicy.setestadopedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadopedidoModel);
			
			
			this.jContentPaneDetalleEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPedido = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPedido.setLayout(gridaBagLayoutDetalleEstadoPedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPedido.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPedido.add(jTtoolBarDetalleEstadoPedido, gridBagConstraintsEstadoPedido);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPedido=   new JScrollPane(jContentPaneDetalleEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPedido.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPedido.add(jPanelCamposEstadoPedido, gridBagConstraintsEstadoPedido);
			
			
			
			
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
						&& estadopedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(this.puedeCargarPorParteConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					
					if(this.estadopedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPedido= new GridBagConstraints();
						this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPedido.gridx = 0;
						this.jContentPaneDetalleEstadoPedido.add(this.jTabbedPaneRelacionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPedido.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
					this.gridBagConstraintsEstadoPedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPedido.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPedido.add(jPanelCamposOcultosEstadoPedido, gridBagConstraintsEstadoPedido);
				
					this.jPanelCamposOcultosEstadoPedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoPedido.gridx = 0;
	        this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPedido.add(this.jPanelAccionesFormularioEstadoPedido, this.gridBagConstraintsEstadoPedido);							
			
			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoPedido.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPedido.add(this.jPanelAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPedido=   new JScrollPane(this.jPanelCamposEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedido.gridx = 0;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPedido, this.gridBagConstraintsEstadoPedido);			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
			
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
			
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPedido;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPedido;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignacionSessionBean=new ConsignacionSessionBean();
		this.consignacionSessionBean.setConGuardarRelaciones(true);
		this.consignacionSessionBean.setEsGuardarRelacionado(true);

		this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {

				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignacionSessionBean.setEsGuardarRelacionado(true);

				this.consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.consignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignacionBeanSwingJInternalFrame.setconsignacionSessionBean(this.consignacionSessionBean);

				//this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
				//this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoPedido.gridx = 0;
				//this.jContentPaneDetalleEstadoPedido.add(this.consignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoPedido);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoPedido.add("Consignacions",this.consignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoPedido.setComponentAt(iIndexTab,this.consignacionBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignacionSessionBean.setEsGuardarRelacionado(false);
				this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignacion) {
					this.jTabbedPaneRelacionesEstadoPedido.add("Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		this.pedidoexporSessionBean.setConGuardarRelaciones(true);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
				//this.gridBagConstraintsEstadoPedido.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoPedido.gridx = 0;
				//this.jContentPaneDetalleEstadoPedido.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoPedido);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoPedido.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoPedido.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesEstadoPedido.add("Pedido Exportacions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarConsignacionBeanSwingJInternalFrame(List<EstadoPedido> estadopedidos,EstadoPedido estadopedido,ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignacionBeanSwingJInternalFrame.getConsignacionLogic().setConnexion(this.estadopedidoLogic.getConnexion());

					consignacionBeanSwingJInternalFrame.setestadopedidosForeignKey(estadopedidos);
					consignacionBeanSwingJInternalFrame.setestadopedidoForeignKey(estadopedido);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPedido(true);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setlidEstadoPedidoActual(estadopedido.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignacionBeanSwingJInternalFrame.cargarCombosForeignKeyConsignacion(consignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoPedido(true);
					consignacionBeanSwingJInternalFrame.setid_estado_pedidoFK_IdEstadoPedido(estadopedido.getId());

					if(!this.conCargarFormDetalle) {
						consignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoPedidoForeignKey(estadopedido,1,false,true,true);
					consignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoPedido");
					consignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoPedido");
					consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(true);
					consignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignacion("n",consignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					consignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("relacionado");
					} else {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");
					}

					consignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoExporBeanSwingJInternalFrame(List<EstadoPedido> estadopedidos,EstadoPedido estadopedido,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.estadopedidoLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.setestadopedidoexporsForeignKey(estadopedidos);
					pedidoexporBeanSwingJInternalFrame.setestadopedidoexporForeignKey(estadopedido);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidEstadoPedidoExporActual(estadopedido.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.setid_estado_pedidoFK_IdEstadoPedidoExpor(estadopedido.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoPedidoExporForeignKey(estadopedido,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoPedido");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoPedido");
					pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoExpor("n",pedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("relacionado");
					} else {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");
					}

					pedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoExpor().setVisible(false);

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
