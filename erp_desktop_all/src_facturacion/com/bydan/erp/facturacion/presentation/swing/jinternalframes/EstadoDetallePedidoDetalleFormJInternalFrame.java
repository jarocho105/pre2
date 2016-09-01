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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.EstadoDetallePedidoConstantesFunciones;

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
public class EstadoDetallePedidoDetalleFormJInternalFrame extends EstadoDetallePedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetallePedido;
	
	protected JMenuBar jmenuBarDetalleEstadoDetallePedido;
	
	protected JMenu jmenuDetalleEstadoDetallePedido;
	protected JMenu jmenuDetalleArchivoEstadoDetallePedido;
	protected JMenu jmenuDetalleAccionesEstadoDetallePedido;
	protected JMenu jmenuDetalleDatosEstadoDetallePedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetallePedido;	
	protected GridBagConstraints gridBagConstraintsEstadoDetallePedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetallePedidoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetallePedido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean;
	
	

	public DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFrame=null;
	public DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleConsignacion=false;
	public DetalleConsignacionSessionBean detalleconsignacionSessionBean;

	public DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFrame=null;
	public DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedidoExpor=false;
	public DetallePedidoExporSessionBean detallepedidoexporSessionBean;
	
		
	
	public EstadoDetallePedidoLogic estadodetallepedidoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetallePedido;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetallePedido;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetallePedido;
	
	protected JPanel jPanelCamposEstadoDetallePedido;    
	protected JPanel jPanelCamposOcultosEstadoDetallePedido;    	
	protected JPanel jPanelAccionesEstadoDetallePedido;
	protected JPanel jPanelAccionesFormularioEstadoDetallePedido;
    
	
	
	protected Integer iXPanelCamposEstadoDetallePedido=0;
	protected Integer iYPanelCamposEstadoDetallePedido=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetallePedido=0;
	protected Integer iYPanelCamposOcultosEstadoDetallePedido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetallePedido;
	public JButton jButtonModificarEstadoDetallePedido;
	public JButton jButtonActualizarEstadoDetallePedido;
    public JButton jButtonEliminarEstadoDetallePedido;
	public JButton jButtonCancelarEstadoDetallePedido;
    public JButton jButtonGuardarCambiosEstadoDetallePedido;
	public JButton jButtonGuardarCambiosTablaEstadoDetallePedido;
	protected JButton jButtonCerrarEstadoDetallePedido;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetallePedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetallePedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetallePedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetallePedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetallePedido;
	protected JButton jButtonModificarToolBarEstadoDetallePedido;
	protected JButton jButtonActualizarToolBarEstadoDetallePedido;
    protected JButton jButtonEliminarToolBarEstadoDetallePedido;
	protected JButton jButtonCancelarToolBarEstadoDetallePedido;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetallePedido;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetallePedido;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetallePedido;
	protected JButton jButtonCerrarToolBarEstadoDetallePedido;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetallePedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetallePedido;
	protected JMenuItem jMenuItemModificarEstadoDetallePedido;
	protected JMenuItem jMenuItemActualizarEstadoDetallePedido;
    protected JMenuItem jMenuItemEliminarEstadoDetallePedido;
	protected JMenuItem jMenuItemCancelarEstadoDetallePedido;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetallePedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetallePedido;
	protected JMenuItem jMenuItemCerrarEstadoDetallePedido;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetallePedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetallePedido;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetallePedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetallePedido;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetallePedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetallePedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetallePedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetallePedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetallePedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetallePedido;
	public JLabel jLabelIdEstadoDetallePedido;
	public JTextFieldMe jTextFieldidEstadoDetallePedido;
	public JButton jButtonidEstadoDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetallePedido;
	public JLabel jLabelcodigoEstadoDetallePedido;
	public JTextField jTextFieldcodigoEstadoDetallePedido;
	public JButton jButtoncodigoEstadoDetallePedidoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetallePedido;
	public JLabel jLabelnombreEstadoDetallePedido;
	public JTextArea jTextAreanombreEstadoDetallePedido;
	public JScrollPane jscrollPanenombreEstadoDetallePedido;
	public JButton jButtonnombreEstadoDetallePedidoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetallePedido;
	
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
	
	public EstadoDetallePedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetallePedido=new JPanel();
				this.jPanelAccionesFormularioEstadoDetallePedido=new JPanel();
				this.jmenuBarDetalleEstadoDetallePedido=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetallePedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetallePedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetallePedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetallePedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetallePedido() {
		return this.jButtonActualizarToolBarEstadoDetallePedido;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetallePedido() {
		return this.jButtonEliminarToolBarEstadoDetallePedido;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetallePedido() {
		return this.jButtonCancelarToolBarEstadoDetallePedido;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetallePedido() {
		return this.jButtonProcesarInformacionEstadoDetallePedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetallePedido)	{
		this.jButtonProcesarInformacionEstadoDetallePedido = jButtonProcesarInformacionEstadoDetallePedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetallePedido() {
		return this.jComboBoxTiposAccionesEstadoDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetallePedido(
			JComboBox jComboBoxTiposRelacionesEstadoDetallePedido) {
		this.jComboBoxTiposRelacionesEstadoDetallePedido = jComboBoxTiposRelacionesEstadoDetallePedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetallePedido(
			JComboBox jComboBoxTiposAccionesEstadoDetallePedido) {
		this.jComboBoxTiposAccionesEstadoDetallePedido = jComboBoxTiposAccionesEstadoDetallePedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetallePedido() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetallePedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetallePedido(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetallePedido) {
		this.jComboBoxTiposAccionesFormularioEstadoDetallePedido = jComboBoxTiposAccionesFormularioEstadoDetallePedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
		
		this.estadodetallepedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetallepedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetallepedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
		//this.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetallePedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetallePedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetallePedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetallePedido=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetallePedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetallePedido,this.jTtoolBarDetalleEstadoDetallePedido,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetallePedido,this.jTtoolBarDetalleEstadoDetallePedido,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetallePedido,this.jTtoolBarDetalleEstadoDetallePedido,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetallePedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetallePedido,this.jTtoolBarDetalleEstadoDetallePedido,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetallePedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetallePedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetallePedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetallePedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetallePedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetallePedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetallePedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetallePedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetallePedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetallePedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetallePedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetallePedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetallePedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetallePedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetallePedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetallePedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetallePedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetallePedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetallePedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetallePedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetallePedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetallePedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetallePedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetallePedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetallePedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetallePedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetallePedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetallePedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetallePedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetallePedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetallePedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetallePedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetallePedido.add(this.jMenuItemDetalleCerrarEstadoDetallePedido);
		
		this.jmenuDetalleAccionesEstadoDetallePedido.add(this.jMenuItemActualizarEstadoDetallePedido);
		this.jmenuDetalleAccionesEstadoDetallePedido.add(this.jMenuItemEliminarEstadoDetallePedido);
		this.jmenuDetalleAccionesEstadoDetallePedido.add(this.jMenuItemCancelarEstadoDetallePedido);		
		
		//this.jmenuDetalleDatosEstadoDetallePedido.add(this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido);				
		this.jmenuDetalleDatosEstadoDetallePedido.add(this.jMenuItemDetalleMostarOcultarEstadoDetallePedido);				
				
		//this.jmenuDetalleAccionesEstadoDetallePedido.add(this.jMenuItemGuardarCambiosEstadoDetallePedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetallePedido.add(this.jmenuDetalleArchivoEstadoDetallePedido);		
		this.jmenuBarDetalleEstadoDetallePedido.add(this.jmenuDetalleAccionesEstadoDetallePedido);		
		this.jmenuBarDetalleEstadoDetallePedido.add(this.jmenuDetalleDatosEstadoDetallePedido);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDetallePedido.add(this.jmenuDetalleEstadoDetallePedido);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetallePedido);				
	}
	
	
	public void inicializarElementosCamposEstadoDetallePedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetallePedido = new JLabelMe();
		jLabelIdEstadoDetallePedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetallePedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetallePedido.setToolTipText(EstadoDetallePedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetallePedido= new GridBagLayout();

		this.jPanelidEstadoDetallePedido.setLayout(this.gridaBagLayoutEstadoDetallePedido);

		jTextFieldidEstadoDetallePedido = new JTextFieldMe();
		jTextFieldidEstadoDetallePedido.setText("Id");

		jTextFieldidEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetallePedido = new JLabelMe();
		this.jLabelcodigoEstadoDetallePedido.setText(""+EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetallePedido.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetallePedido.setToolTipText(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetallePedido = new GridBagLayout();
		this.jPanelcodigoEstadoDetallePedido.setLayout(this.gridaBagLayoutEstadoDetallePedido);


		jTextFieldcodigoEstadoDetallePedido= new JTextFieldMe();

		jTextFieldcodigoEstadoDetallePedido.setEnabled(false);
		jTextFieldcodigoEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetallePedidoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetallePedidoBusqueda.setText("U");
		this.jButtoncodigoEstadoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetallePedidoBusqueda"));

		if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetallePedidoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetallePedido = new JLabelMe();
		this.jLabelnombreEstadoDetallePedido.setText(""+EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetallePedido.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetallePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetallePedido.setToolTipText(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetallePedido = new GridBagLayout();
		this.jPanelnombreEstadoDetallePedido.setLayout(this.gridaBagLayoutEstadoDetallePedido);


		jTextAreanombreEstadoDetallePedido= new JTextAreaMe();
		jTextAreanombreEstadoDetallePedido.setEnabled(false);
		jTextAreanombreEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetallePedido.setLineWrap(true);
		jTextAreanombreEstadoDetallePedido.setWrapStyleWord(true);
		jTextAreanombreEstadoDetallePedido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDetallePedido.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDetallePedido = new JScrollPane(jTextAreanombreEstadoDetallePedido);
		jscrollPanenombreEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDetallePedidoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetallePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetallePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetallePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetallePedidoBusqueda.setText("U");
		this.jButtonnombreEstadoDetallePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetallePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetallePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetallePedidoBusqueda"));

		if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetallePedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetallePedido() {
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
		//this.jInternalFrameDetalleEstadoDetallePedido = new EstadoDetallePedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetallePedido= new GridBagLayout();
		

		
		String sToolTipEstadoDetallePedido="";
		sToolTipEstadoDetallePedido=EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetallePedido+="(Facturacion.EstadoDetallePedido)";
		}
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetallePedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetallePedido = new JButtonMe();
		this.jButtonModificarEstadoDetallePedido = new JButtonMe();
        this.jButtonActualizarEstadoDetallePedido = new JButtonMe();
        this.jButtonEliminarEstadoDetallePedido = new JButtonMe();
        this.jButtonCancelarEstadoDetallePedido = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetallePedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetallePedido = new JButtonMe();
		this.jButtonCerrarEstadoDetallePedido = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetallePedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetallePedido = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetallePedido = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Pedido";
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetallePedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetallePedido.setName("jPanelCamposEstadoDetallePedido"); 

		this.jPanelCamposOcultosEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetallePedido.setName("jPanelCamposOcultosEstadoDetallePedido"); 

        this.jPanelAccionesEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetallePedido.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetallePedido.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetallePedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetallePedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetallePedido.setText("Nuevo");
		this.jButtonModificarEstadoDetallePedido.setText("Editar");
        this.jButtonActualizarEstadoDetallePedido.setText("Actualizar");
        this.jButtonEliminarEstadoDetallePedido.setText("Eliminar");
        this.jButtonCancelarEstadoDetallePedido.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetallePedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.setText("Guardar");
		this.jButtonCerrarEstadoDetallePedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetallePedido,"nuevo_button","Nuevo",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetallePedido,"modificar_button","Editar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetallePedido,"actualizar_button","Actualizar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetallePedido,"eliminar_button","Eliminar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetallePedido,"cancelar_button","Cancelar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetallePedido,"guardarcambios_button","Guardar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetallePedido,"guardarcambiostabla_button","Guardar",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetallePedido,"cerrar_button","Salir",this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetallePedido.setToolTipText("Nuevo"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetallePedido.setToolTipText("Editar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetallePedido.setToolTipText("Actualizar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetallePedido.setToolTipText("Eliminar)"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetallePedido.setToolTipText("Cancelar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetallePedido.setToolTipText("Guardar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.setToolTipText("Guardar"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetallePedido.setToolTipText("Salir"+" "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetallePedido";
		inputMap = this.jButtonNuevoEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetallePedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetallePedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetallePedido";
		inputMap = this.jButtonActualizarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetallePedido"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetallePedido";
		inputMap = this.jButtonEliminarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetallePedido"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetallePedido";
		inputMap = this.jButtonCancelarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetallePedido"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetallePedido";
		inputMap = this.jButtonCerrarEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetallePedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetallePedido";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetallePedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetallePedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetallePedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetallePedido.setToolTipText("Nuevo EstadoDetallePedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetallePedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetallePedido.setToolTipText("Sin Cerrar Ventana EstadoDetallePedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetallePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetallePedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetallePedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetallePedido.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetallePedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetallePedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetallePedido = new JLabelMe();
		
		this.jLabelAccionesEstadoDetallePedido.setText("Acciones");		
		this.jLabelAccionesEstadoDetallePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetallePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetallePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetallePedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetallePedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetallePedido=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetallePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetallePedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetallePedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetallePedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetallePedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetallePedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetallePedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetallePedido = new GridBagLayout();
		
		this.jPanelCamposEstadoDetallePedido.setLayout(gridaBagLayoutCamposEstadoDetallePedido);
		this.jPanelCamposOcultosEstadoDetallePedido.setLayout(gridaBagLayoutCamposOcultosEstadoDetallePedido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
	this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetallePedido.add(jLabelIdEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);



	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
	this.gridBagConstraintsEstadoDetallePedido.gridx = 1;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetallePedido.add(jTextFieldidEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);


	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
	this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetallePedido.add(jLabelcodigoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
		this.gridBagConstraintsEstadoDetallePedido.gridx = 2;
		this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
		this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetallePedido.add(jButtoncodigoEstadoDetallePedidoBusqueda, this.gridBagConstraintsEstadoDetallePedido);
	}

	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
	this.gridBagConstraintsEstadoDetallePedido.gridx = 1;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetallePedido.add(jTextFieldcodigoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);


	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
	this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetallePedido.add(jLabelnombreEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
		this.gridBagConstraintsEstadoDetallePedido.gridx = 2;
		this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
		this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetallePedido.add(jButtonnombreEstadoDetallePedidoBusqueda, this.gridBagConstraintsEstadoDetallePedido);
	}

	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
	this.gridBagConstraintsEstadoDetallePedido.gridx = 1;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetallePedido.add(jscrollPanenombreEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetallePedido.gridy = iYPanelCamposEstadoDetallePedido;
	this.gridBagConstraintsEstadoDetallePedido.gridx = iXPanelCamposEstadoDetallePedido++;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetallePedido.add(this.jPanelidEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);



	if(iXPanelCamposEstadoDetallePedido % 1==0) {
		iXPanelCamposEstadoDetallePedido=0;
		iYPanelCamposEstadoDetallePedido++;
	}
	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetallePedido.gridy = iYPanelCamposEstadoDetallePedido;
	this.gridBagConstraintsEstadoDetallePedido.gridx = iXPanelCamposEstadoDetallePedido++;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetallePedido.add(this.jPanelcodigoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);



	if(iXPanelCamposEstadoDetallePedido % 1==0) {
		iXPanelCamposEstadoDetallePedido=0;
		iYPanelCamposEstadoDetallePedido++;
	}
	this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetallePedido.gridy = iYPanelCamposEstadoDetallePedido;
	this.gridBagConstraintsEstadoDetallePedido.gridx = iXPanelCamposEstadoDetallePedido++;
	this.gridBagConstraintsEstadoDetallePedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetallePedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetallePedido.add(this.jPanelnombreEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);



	if(iXPanelCamposEstadoDetallePedido % 1==0) {
		iXPanelCamposEstadoDetallePedido=0;
		iYPanelCamposEstadoDetallePedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetallePedido= new GridBagLayout();
		this.jPanelAccionesEstadoDetallePedido.setLayout(gridaBagLayoutAccionesEstadoDetallePedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetallePedido= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetallePedido.setLayout(gridaBagLayoutAccionesFormularioEstadoDetallePedido);
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetallePedido.add(this.jComboBoxTiposAccionesFormularioEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);

		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetallePedido.add(this.jCheckBoxPostAccionNuevoEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetallePedido.add(this.jCheckBoxPostAccionSinCerrarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetallePedido.add(this.jCheckBoxPostAccionSinMensajeEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetallePedido.add(this.jButtonModificarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);							

		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;
		this.gridBagConstraintsEstadoDetallePedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetallePedido.add(this.jButtonEliminarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
			
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetallePedido.add(this.jButtonActualizarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);


		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetallePedido.add(this.jButtonGuardarCambiosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);	
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = 0;		
		this.gridBagConstraintsEstadoDetallePedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetallePedido.add(this.jButtonCancelarEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetallePedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetallePedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetallePedido.gridx = 0;		
			//this.gridBagConstraintsEstadoDetallePedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetallePedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetallePedido.gridx =0;
		this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetallePedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetallePedido = new EstadoDetallePedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetallePedidoModel estadodetallepedidoModel=new EstadoDetallePedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetallePedidoModel.EstadoDetallePedidoFocusTraversalPolicy estadodetallepedidoFocusTraversalPolicy = estadodetallepedidoModel.new EstadoDetallePedidoFocusTraversalPolicy(this);
			
			//estadodetallepedidoFocusTraversalPolicy.setestadodetallepedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetallepedidoModel);
			
			
			this.jContentPaneDetalleEstadoDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetallePedido = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetallePedido.setLayout(gridaBagLayoutDetalleEstadoDetallePedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetallePedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetallePedido.add(jTtoolBarDetalleEstadoDetallePedido, gridBagConstraintsEstadoDetallePedido);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetallePedido=   new JScrollPane(jContentPaneDetalleEstadoDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetallePedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetallePedido.add(jPanelCamposEstadoDetallePedido, gridBagConstraintsEstadoDetallePedido);
			
			
			
			
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
						&& estadodetallepedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(this.puedeCargarPorParteDetalleConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(this.puedeCargarPorParteDetallePedidoExpor,false,-1);
					
					if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetallePedido= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
						this.jContentPaneDetalleEstadoDetallePedido.add(this.jTabbedPaneRelacionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetallePedido.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetallePedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetallePedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetallePedido.add(jPanelCamposOcultosEstadoDetallePedido, gridBagConstraintsEstadoDetallePedido);
				
					this.jPanelCamposOcultosEstadoDetallePedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
	        this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetallePedido.add(this.jPanelAccionesFormularioEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);							
			
			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetallePedido.add(this.jPanelAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetallePedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetallePedido=   new JScrollPane(this.jPanelCamposEstadoDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetallePedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetallePedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetallePedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
			this.gridBagConstraintsEstadoDetallePedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetallePedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetallePedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);			
			
			this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetallePedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
			
			
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		
			
		this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetallePedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetallePedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetallePedido, this.gridBagConstraintsEstadoDetallePedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetallePedido;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetallePedido;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
		this.detalleconsignacionSessionBean.setConGuardarRelaciones(false);
		this.detalleconsignacionSessionBean.setEsGuardarRelacionado(true);

		this.detalleconsignacionBeanSwingJInternalFrame=null;//new DetalleConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleconsignacionBeanSwingJInternalFramePopup=new DetalleConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleconsignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {

				DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleconsignacionSessionBean.setEsGuardarRelacionado(true);

				this.detalleconsignacionBeanSwingJInternalFrame=new DetalleConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleconsignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleconsignacionBeanSwingJInternalFrame.setdetalleconsignacionSessionBean(this.detalleconsignacionSessionBean);

				//this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
				//this.jContentPaneDetalleEstadoDetallePedido.add(this.detalleconsignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetallePedido);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetallePedido.add("Detalle Consignacions",this.detalleconsignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetallePedido.setComponentAt(iIndexTab,this.detalleconsignacionBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleconsignacionSessionBean.setEsGuardarRelacionado(false);
				this.detalleconsignacionBeanSwingJInternalFrame=null;//new DetalleConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleConsignacion) {
					this.jTabbedPaneRelacionesEstadoDetallePedido.add("Detalle Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
		this.detallepedidoexporSessionBean.setConGuardarRelaciones(false);
		this.detallepedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidoexporBeanSwingJInternalFrame=null;//new DetallePedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidoexporBeanSwingJInternalFramePopup=new DetallePedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidoexporBeanSwingJInternalFrame=new DetallePedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidoexporBeanSwingJInternalFrame.setdetallepedidoexporSessionBean(this.detallepedidoexporSessionBean);

				//this.gridBagConstraintsEstadoDetallePedido = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetallePedido.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetallePedido.gridx = 0;
				//this.jContentPaneDetalleEstadoDetallePedido.add(this.detallepedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetallePedido);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetallePedido.add("Detalle Pedido Exportacions",this.detallepedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetallePedido.setComponentAt(iIndexTab,this.detallepedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidoexporBeanSwingJInternalFrame=null;//new DetallePedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedidoExpor) {
					this.jTabbedPaneRelacionesEstadoDetallePedido.add("Detalle Pedido Exportacions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleConsignacionBeanSwingJInternalFrame(List<EstadoDetallePedido> estadodetallepedidos,EstadoDetallePedido estadodetallepedido,DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleconsignacionBeanSwingJInternalFrame=new DetalleConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleconsignacionBeanSwingJInternalFrame.getDetalleConsignacionLogic().setConnexion(this.estadodetallepedidoLogic.getConnexion());

					detalleconsignacionBeanSwingJInternalFrame.setestadodetallepedidosForeignKey(estadodetallepedidos);
					detalleconsignacionBeanSwingJInternalFrame.setestadodetallepedidoForeignKey(estadodetallepedido);
					detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetallePedido(true);
					detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setlidEstadoDetallePedidoActual(estadodetallepedido.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleconsignacionBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleConsignacion(detalleconsignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleconsignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetallePedido(true);
					detalleconsignacionBeanSwingJInternalFrame.setid_estado_detalle_pedidoFK_IdEstadoDetallePedido(estadodetallepedido.getId());

					if(!this.conCargarFormDetalle) {
						detalleconsignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleconsignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetallePedidoForeignKey(estadodetallepedido,1,false,true,true);
					detalleconsignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleconsignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetallePedido");
					detalleconsignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetallePedido");
					detalleconsignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleConsignacion(true);
					detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleConsignacion("n",detalleconsignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleconsignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleconsignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleconsignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleConsignacion("relacionado");
					} else {
						detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleConsignacion("no_relacionado");
					}

					detalleconsignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleConsignacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetallePedidoExporBeanSwingJInternalFrame(List<EstadoDetallePedido> estadodetallepedidos,EstadoDetallePedido estadodetallepedido,DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidoexporBeanSwingJInternalFrame=new DetallePedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidoexporBeanSwingJInternalFrame.getDetallePedidoExporLogic().setConnexion(this.estadodetallepedidoLogic.getConnexion());

					detallepedidoexporBeanSwingJInternalFrame.setestadodetallepedidoexporsForeignKey(estadodetallepedidos);
					detallepedidoexporBeanSwingJInternalFrame.setestadodetallepedidoexporForeignKey(estadodetallepedido);
					detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetallePedidoExpor(true);
					detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setlidEstadoDetallePedidoExporActual(estadodetallepedido.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedidoExpor(detallepedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetallePedidoExpor(true);
					detallepedidoexporBeanSwingJInternalFrame.setid_estado_detalle_pedidoFK_IdEstadoDetallePedidoExpor(estadodetallepedido.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetallePedidoExporForeignKey(estadodetallepedido,1,false,true,true);
					detallepedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetallePedido");
					detallepedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetallePedido");
					detallepedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoExpor(true);
					detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedidoExpor("n",detallepedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoExpor("relacionado");
					} else {
						detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoExpor("no_relacionado");
					}

					detallepedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedidoExpor().setVisible(false);

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
