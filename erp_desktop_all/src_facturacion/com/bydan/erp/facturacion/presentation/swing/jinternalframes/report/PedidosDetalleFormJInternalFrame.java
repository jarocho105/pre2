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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.PedidosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class PedidosDetalleFormJInternalFrame extends PedidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidos;
	
	protected JMenuBar jmenuBarDetallePedidos;
	
	protected JMenu jmenuDetallePedidos;
	protected JMenu jmenuDetalleArchivoPedidos;
	protected JMenu jmenuDetalleAccionesPedidos;
	protected JMenu jmenuDetalleDatosPedidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidos;	
	protected GridBagConstraints gridBagConstraintsPedidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidosBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedido="";
	
	public PedidosSessionBean pedidosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EstadoPedidoSessionBean estadopedidoSessionBean;	
	
	public PedidosLogic pedidosLogic;
	
	public JScrollPane jScrollPanelDatosPedidos;
	public JScrollPane jScrollPanelDatosEdicionPedidos;
	public JScrollPane jScrollPanelDatosGeneralPedidos;
	
	protected JPanel jPanelCamposPedidos;    
	protected JPanel jPanelCamposOcultosPedidos;    	
	protected JPanel jPanelAccionesPedidos;
	protected JPanel jPanelAccionesFormularioPedidos;
    
	
	
	protected Integer iXPanelCamposPedidos=0;
	protected Integer iYPanelCamposPedidos=0;
	
	protected Integer iXPanelCamposOcultosPedidos=0;
	protected Integer iYPanelCamposOcultosPedidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidos;
	public JButton jButtonModificarPedidos;
	public JButton jButtonActualizarPedidos;
    public JButton jButtonEliminarPedidos;
	public JButton jButtonCancelarPedidos;
    public JButton jButtonGuardarCambiosPedidos;
	public JButton jButtonGuardarCambiosTablaPedidos;
	protected JButton jButtonCerrarPedidos;
	
	
	protected JButton jButtonProcesarInformacionPedidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidos;
	protected JButton jButtonModificarToolBarPedidos;
	protected JButton jButtonActualizarToolBarPedidos;
    protected JButton jButtonEliminarToolBarPedidos;
	protected JButton jButtonCancelarToolBarPedidos;
    protected JButton jButtonGuardarCambiosToolBarPedidos;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidos;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidos;
	protected JButton jButtonCerrarToolBarPedidos;
	
	protected JButton jButtonProcesarInformacionToolBarPedidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidos;
	protected JMenuItem jMenuItemModificarPedidos;
	protected JMenuItem jMenuItemActualizarPedidos;
    protected JMenuItem jMenuItemEliminarPedidos;
	protected JMenuItem jMenuItemCancelarPedidos;
    protected JMenuItem jMenuItemGuardarCambiosPedidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidos;
	protected JMenuItem jMenuItemCerrarPedidos;
	protected JMenuItem jMenuItemDetalleCerrarPedidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidos;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidos;
	protected JMenuItem jMenuItemMostrarOcultarPedidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidos;
	public JLabel jLabelIdPedidos;
	public JLabel jLabelidPedidos;
	public JButton jButtonidPedidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdePedidos;
	public JLabel jLabelfecha_emision_desdePedidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdePedidos;

	public JDateChooser jDateChooserfecha_emision_desdePedidos;
	public JButton jButtonfecha_emision_desdePedidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaPedidos;
	public JLabel jLabelfecha_emision_hastaPedidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaPedidos;

	public JDateChooser jDateChooserfecha_emision_hastaPedidos;
	public JButton jButtonfecha_emision_hastaPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clientePedidos;
	public JLabel jLabelnombre_completo_clientePedidos;
	public JTextArea jTextAreanombre_completo_clientePedidos;
	public JScrollPane jscrollPanenombre_completo_clientePedidos;
	public JButton jButtonnombre_completo_clientePedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_monedaPedidos;
	public JLabel jLabelnombre_monedaPedidos;
	public JTextField jTextFieldnombre_monedaPedidos;
	public JButton jButtonnombre_monedaPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaPedidos;
	public JLabel jLabelnombre_zonaPedidos;
	public JTextField jTextFieldnombre_zonaPedidos;
	public JButton jButtonnombre_zonaPedidosBusqueda= new JButtonMe();

	public JPanel jPanelnumeroPedidos;
	public JLabel jLabelnumeroPedidos;
	public JTextField jTextFieldnumeroPedidos;
	public JButton jButtonnumeroPedidosBusqueda= new JButtonMe();

	public JPanel jPanelivaPedidos;
	public JLabel jLabelivaPedidos;
	public JTextField jTextFieldivaPedidos;
	public JButton jButtonivaPedidosBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorPedidos;
	public JLabel jLabeldescuento_valorPedidos;
	public JTextField jTextFielddescuento_valorPedidos;
	public JButton jButtondescuento_valorPedidosBusqueda= new JButtonMe();

	public JPanel jPanelotroPedidos;
	public JLabel jLabelotroPedidos;
	public JTextField jTextFieldotroPedidos;
	public JButton jButtonotroPedidosBusqueda= new JButtonMe();

	public JPanel jPaneltotalPedidos;
	public JLabel jLabeltotalPedidos;
	public JTextField jTextFieldtotalPedidos;
	public JButton jButtontotalPedidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoPedidos;
	public JLabel jLabelfecha_vencimientoPedidos;
	//public JFormattedTextField jDateChooserfecha_vencimientoPedidos;

	public JDateChooser jDateChooserfecha_vencimientoPedidos;
	public JButton jButtonfecha_vencimientoPedidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPedidos;
	public JLabel jLabelfecha_emisionPedidos;
	//public JFormattedTextField jDateChooserfecha_emisionPedidos;

	public JDateChooser jDateChooserfecha_emisionPedidos;
	public JButton jButtonfecha_emisionPedidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidos;
	public JLabel jLabelid_empresaPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidos;
	public JButton jButtonid_empresaPedidos= new JButtonMe();
	public JButton jButtonid_empresaPedidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidosBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedidoPedidos;
	public JLabel jLabelid_estado_pedidoPedidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoPedidos;
	public JButton jButtonid_estado_pedidoPedidos= new JButtonMe();
	public JButton jButtonid_estado_pedidoPedidosUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoPedidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidos=new JPanel();
				this.jPanelAccionesFormularioPedidos=new JPanel();
				this.jmenuBarDetallePedidos=new JMenuBar();
				this.jTtoolBarDetallePedidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Pedidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedidos() {
		return this.jButtonActualizarToolBarPedidos;
	}
	
	public JButton getjButtonEliminarToolBarPedidos() {
		return this.jButtonEliminarToolBarPedidos;
	}
	
	public JButton getjButtonCancelarToolBarPedidos() {
		return this.jButtonCancelarToolBarPedidos;
	}		
	
	public JButton getjButtonProcesarInformacionPedidos() {
		return this.jButtonProcesarInformacionPedidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidos)	{
		this.jButtonProcesarInformacionPedidos = jButtonProcesarInformacionPedidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidos() {
		return this.jComboBoxTiposAccionesPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidos(
			JComboBox jComboBoxTiposRelacionesPedidos) {
		this.jComboBoxTiposRelacionesPedidos = jComboBoxTiposRelacionesPedidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidos(
			JComboBox jComboBoxTiposAccionesPedidos) {
		this.jComboBoxTiposAccionesPedidos = jComboBoxTiposAccionesPedidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidos() {
		return this.jComboBoxTiposAccionesFormularioPedidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidos(
			JComboBox jComboBoxTiposAccionesFormularioPedidos) {
		this.jComboBoxTiposAccionesFormularioPedidos = jComboBoxTiposAccionesFormularioPedidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidosSessionBean=new PedidosSessionBean();
		
		this.pedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedidos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidos=new JButtonMe();
				this.jButtonModificarToolBarPedidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidos,this.jTtoolBarDetallePedidos,
							"actualizar","actualizar","Actualizar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidos,this.jTtoolBarDetallePedidos,
							"eliminar","eliminar","Eliminar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidos,this.jTtoolBarDetallePedidos,
							"cancelar","cancelar","Cancelar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidos,this.jTtoolBarDetallePedidos,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidos.add(this.jMenuItemDetalleCerrarPedidos);
		
		this.jmenuDetalleAccionesPedidos.add(this.jMenuItemActualizarPedidos);
		this.jmenuDetalleAccionesPedidos.add(this.jMenuItemEliminarPedidos);
		this.jmenuDetalleAccionesPedidos.add(this.jMenuItemCancelarPedidos);		
		
		//this.jmenuDetalleDatosPedidos.add(this.jMenuItemDetalleAbrirOrderByPedidos);				
		this.jmenuDetalleDatosPedidos.add(this.jMenuItemDetalleMostarOcultarPedidos);				
				
		//this.jmenuDetalleAccionesPedidos.add(this.jMenuItemGuardarCambiosPedidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidos.add(this.jmenuDetalleArchivoPedidos);		
		this.jmenuBarDetallePedidos.add(this.jmenuDetalleAccionesPedidos);		
		this.jmenuBarDetallePedidos.add(this.jmenuDetalleDatosPedidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePedidos);				
	}
	
	
	public void inicializarElementosCamposPedidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidos = new JLabelMe();
		jLabelIdPedidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidos= new GridBagLayout();

		this.jPanelidPedidos.setLayout(this.gridaBagLayoutPedidos);

		jLabelidPedidos = new JLabel();
		jLabelidPedidos.setText("Id");

		jLabelidPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdePedidos = new JLabelMe();
		this.jLabelfecha_emision_desdePedidos.setText(""+PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdePedidos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdePedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdePedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdePedidos.setToolTipText(PedidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelfecha_emision_desdePedidos.setLayout(this.gridaBagLayoutPedidos);


		//jFormattedTextFieldfecha_emision_desdePedidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdePedidos= new JDateChooser();
		jDateChooserfecha_emision_desdePedidos.setEnabled(false);
		jDateChooserfecha_emision_desdePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdePedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdePedidos.setDate(new Date());
		jDateChooserfecha_emision_desdePedidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdePedidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdePedidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdePedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdePedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdePedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdePedidosBusqueda.setText("U");
		this.jButtonfecha_emision_desdePedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdePedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdePedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdePedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdePedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdePedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdePedidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaPedidos = new JLabelMe();
		this.jLabelfecha_emision_hastaPedidos.setText(""+PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaPedidos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelfecha_emision_hastaPedidos.setLayout(this.gridaBagLayoutPedidos);


		//jFormattedTextFieldfecha_emision_hastaPedidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaPedidos= new JDateChooser();
		jDateChooserfecha_emision_hastaPedidos.setEnabled(false);
		jDateChooserfecha_emision_hastaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaPedidos.setDate(new Date());
		jDateChooserfecha_emision_hastaPedidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaPedidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaPedidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaPedidosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clientePedidos = new JLabelMe();
		this.jLabelnombre_completo_clientePedidos.setText(""+PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clientePedidos.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clientePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clientePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clientePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clientePedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clientePedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clientePedidos.setToolTipText(PedidosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelnombre_completo_clientePedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextAreanombre_completo_clientePedidos= new JTextAreaMe();
		jTextAreanombre_completo_clientePedidos.setEnabled(false);
		jTextAreanombre_completo_clientePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clientePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clientePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clientePedidos.setLineWrap(true);
		jTextAreanombre_completo_clientePedidos.setWrapStyleWord(true);
		jTextAreanombre_completo_clientePedidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clientePedidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clientePedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clientePedidos = new JScrollPane(jTextAreanombre_completo_clientePedidos);
		jscrollPanenombre_completo_clientePedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clientePedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clientePedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clientePedidosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clientePedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clientePedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clientePedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clientePedidosBusqueda.setText("U");
		this.jButtonnombre_completo_clientePedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clientePedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clientePedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clientePedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clientePedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clientePedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clientePedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_monedaPedidos = new JLabelMe();
		this.jLabelnombre_monedaPedidos.setText(""+PedidosConstantesFunciones.LABEL_NOMBREMONEDA+" : *");
		this.jLabelnombre_monedaPedidos.setToolTipText("Nombre Moneda");
		this.jLabelnombre_monedaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_monedaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_monedaPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_monedaPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_NOMBREMONEDA);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelnombre_monedaPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFieldnombre_monedaPedidos= new JTextFieldMe();

		jTextFieldnombre_monedaPedidos.setEnabled(false);
		jTextFieldnombre_monedaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_monedaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_monedaPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_monedaPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_monedaPedidosBusqueda.setText("U");
		this.jButtonnombre_monedaPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_monedaPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_monedaPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_monedaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_monedaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_monedaPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_monedaPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaPedidos = new JLabelMe();
		this.jLabelnombre_zonaPedidos.setText(""+PedidosConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaPedidos.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelnombre_zonaPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFieldnombre_zonaPedidos= new JTextFieldMe();

		jTextFieldnombre_zonaPedidos.setEnabled(false);
		jTextFieldnombre_zonaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaPedidosBusqueda= new JButtonMe();
		this.jButtonnombre_zonaPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaPedidosBusqueda.setText("U");
		this.jButtonnombre_zonaPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaPedidosBusqueda.setVisible(false);		}


					
		this.jLabelnumeroPedidos = new JLabelMe();
		this.jLabelnumeroPedidos.setText(""+PedidosConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroPedidos.setToolTipText("Numero");
		this.jLabelnumeroPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelnumeroPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFieldnumeroPedidos= new JTextFieldMe();

		jTextFieldnumeroPedidos.setEnabled(false);
		jTextFieldnumeroPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroPedidosBusqueda= new JButtonMe();
		this.jButtonnumeroPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroPedidosBusqueda.setText("U");
		this.jButtonnumeroPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroPedidosBusqueda.setVisible(false);		}


					
		this.jLabelivaPedidos = new JLabelMe();
		this.jLabelivaPedidos.setText(""+PedidosConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaPedidos.setToolTipText("Iva");
		this.jLabelivaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelivaPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFieldivaPedidos= new JTextFieldMe();
		jTextFieldivaPedidos.setEnabled(false);
		jTextFieldivaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaPedidos.setText("0.0");

		this.jButtonivaPedidosBusqueda= new JButtonMe();
		this.jButtonivaPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaPedidosBusqueda.setText("U");
		this.jButtonivaPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaPedidosBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorPedidos = new JLabelMe();
		this.jLabeldescuento_valorPedidos.setText(""+PedidosConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorPedidos.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPaneldescuento_valorPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFielddescuento_valorPedidos= new JTextFieldMe();
		jTextFielddescuento_valorPedidos.setEnabled(false);
		jTextFielddescuento_valorPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorPedidos.setText("0.0");

		this.jButtondescuento_valorPedidosBusqueda= new JButtonMe();
		this.jButtondescuento_valorPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorPedidosBusqueda.setText("U");
		this.jButtondescuento_valorPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorPedidosBusqueda.setVisible(false);		}


					
		this.jLabelotroPedidos = new JLabelMe();
		this.jLabelotroPedidos.setText(""+PedidosConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroPedidos.setToolTipText("Otro");
		this.jLabelotroPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelotroPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFieldotroPedidos= new JTextFieldMe();
		jTextFieldotroPedidos.setEnabled(false);
		jTextFieldotroPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroPedidos.setText("0.0");

		this.jButtonotroPedidosBusqueda= new JButtonMe();
		this.jButtonotroPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroPedidosBusqueda.setText("U");
		this.jButtonotroPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroPedidosBusqueda.setVisible(false);		}


					
		this.jLabeltotalPedidos = new JLabelMe();
		this.jLabeltotalPedidos.setText(""+PedidosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPedidos.setToolTipText("Total");
		this.jLabeltotalPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPaneltotalPedidos.setLayout(this.gridaBagLayoutPedidos);


		jTextFieldtotalPedidos= new JTextFieldMe();
		jTextFieldtotalPedidos.setEnabled(false);
		jTextFieldtotalPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPedidos.setText("0.0");

		this.jButtontotalPedidosBusqueda= new JButtonMe();
		this.jButtontotalPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPedidosBusqueda.setText("U");
		this.jButtontotalPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPedidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoPedidos = new JLabelMe();
		this.jLabelfecha_vencimientoPedidos.setText(""+PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoPedidos.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelfecha_vencimientoPedidos.setLayout(this.gridaBagLayoutPedidos);


		//jFormattedTextFieldfecha_vencimientoPedidos= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoPedidos= new JDateChooser();
		jDateChooserfecha_vencimientoPedidos.setEnabled(false);
		jDateChooserfecha_vencimientoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoPedidos.setDate(new Date());
		jDateChooserfecha_vencimientoPedidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoPedidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoPedidosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoPedidosBusqueda.setText("U");
		this.jButtonfecha_vencimientoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoPedidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPedidos = new JLabelMe();
		this.jLabelfecha_emisionPedidos.setText(""+PedidosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPedidos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelfecha_emisionPedidos.setLayout(this.gridaBagLayoutPedidos);


		//jFormattedTextFieldfecha_emisionPedidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPedidos= new JDateChooser();
		jDateChooserfecha_emisionPedidos.setEnabled(false);
		jDateChooserfecha_emisionPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPedidos.setDate(new Date());
		jDateChooserfecha_emisionPedidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPedidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPedidosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPedidosBusqueda.setText("U");
		this.jButtonfecha_emisionPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPedidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidos = new JLabelMe();
		this.jLabelid_empresaPedidos.setText(""+PedidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidos.setToolTipText("Empresa");
		this.jLabelid_empresaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelid_empresaPedidos.setLayout(this.gridaBagLayoutPedidos);


		jComboBoxid_empresaPedidos= new JComboBoxMe();
		jComboBoxid_empresaPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidos.setEnabled(false);

		this.jButtonid_empresaPedidos= new JButtonMe();
		this.jButtonid_empresaPedidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidos.setText("Buscar");
		this.jButtonid_empresaPedidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidos"));

		this.jButtonid_empresaPedidosBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidosBusqueda.setText("U");
		this.jButtonid_empresaPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidosUpdate= new JButtonMe();
		this.jButtonid_empresaPedidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidosUpdate.setText("U");
		this.jButtonid_empresaPedidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidosUpdate"));



					
		this.jLabelid_estado_pedidoPedidos = new JLabelMe();
		this.jLabelid_estado_pedidoPedidos.setText(""+PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO+" : *");
		this.jLabelid_estado_pedidoPedidos.setToolTipText("Estado Pedo");
		this.jLabelid_estado_pedidoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedidoPedidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedidoPedidos.setToolTipText(PedidosConstantesFunciones.LABEL_IDESTADOPEDIDO);
		this.gridaBagLayoutPedidos = new GridBagLayout();
		this.jPanelid_estado_pedidoPedidos.setLayout(this.gridaBagLayoutPedidos);


		jComboBoxid_estado_pedidoPedidos= new JComboBoxMe();
		jComboBoxid_estado_pedidoPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoPedidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedidoPedidos= new JButtonMe();
		this.jButtonid_estado_pedidoPedidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedidos.setText("Buscar");
		this.jButtonid_estado_pedidoPedidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedidoPedidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedidoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidos"));

		this.jButtonid_estado_pedidoPedidosBusqueda= new JButtonMe();
		this.jButtonid_estado_pedidoPedidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoPedidosBusqueda.setText("U");
		this.jButtonid_estado_pedidoPedidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedidoPedidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedidoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidosBusqueda"));

		if(this.pedidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedidoPedidosBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedidoPedidosUpdate= new JButtonMe();
		this.jButtonid_estado_pedidoPedidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoPedidosUpdate.setText("U");
		this.jButtonid_estado_pedidoPedidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedidoPedidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedidoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidosUpdate"));



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
		//this.jInternalFrameDetallePedidos = new PedidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidos= new GridBagLayout();
		

		
		String sToolTipPedidos="";
		sToolTipPedidos=PedidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidos+="(Facturacion.Pedidos)";
		}
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidos = new JButtonMe();
		this.jButtonModificarPedidos = new JButtonMe();
        this.jButtonActualizarPedidos = new JButtonMe();
        this.jButtonEliminarPedidos = new JButtonMe();
        this.jButtonCancelarPedidos = new JButtonMe();
        this.jButtonGuardarCambiosPedidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidos = new JButtonMe();
		this.jButtonCerrarPedidos = new JButtonMe();
		
		this.jScrollPanelDatosPedidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidos = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidos = new JScrollPane();
				
		
		
		this.jPanelCamposPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedidos";
		
		if(!this.pedidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPedidos.setName("jPanelCamposPedidos"); 

		this.jPanelCamposOcultosPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidos.setName("jPanelCamposOcultosPedidos"); 

        this.jPanelAccionesPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidos.setToolTipText("Acciones");
        this.jPanelAccionesPedidos.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidos.setText("Nuevo");
		this.jButtonModificarPedidos.setText("Editar");
        this.jButtonActualizarPedidos.setText("Actualizar");
        this.jButtonEliminarPedidos.setText("Eliminar");
        this.jButtonCancelarPedidos.setText("Cancelar");
        this.jButtonGuardarCambiosPedidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidos.setText("Guardar");
		this.jButtonCerrarPedidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidos,"nuevo_button","Nuevo",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidos,"modificar_button","Editar",this.pedidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidos,"actualizar_button","Actualizar",this.pedidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidos,"eliminar_button","Eliminar",this.pedidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidos,"cancelar_button","Cancelar",this.pedidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidos,"guardarcambios_button","Guardar",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidos,"guardarcambiostabla_button","Guardar",this.pedidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidos,"cerrar_button","Salir",this.pedidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidos.setToolTipText("Nuevo"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidos.setToolTipText("Editar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidos.setToolTipText("Actualizar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidos.setToolTipText("Eliminar)"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidos.setToolTipText("Cancelar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidos.setToolTipText("Guardar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidos.setToolTipText("Guardar"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidos.setToolTipText("Salir"+" "+PedidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidos";
		inputMap = this.jButtonNuevoPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidos";
		inputMap = this.jButtonActualizarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidos"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidos";
		inputMap = this.jButtonEliminarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidos"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidos";
		inputMap = this.jButtonCancelarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidos"));
		
		//CERRAR		
		sMapKey = "CerrarPedidos";
		inputMap = this.jButtonCerrarPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidos";
		inputMap = this.jButtonGuardarCambiosTablaPedidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidos.setToolTipText("Nuevo Pedidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidos.setToolTipText("Sin Cerrar Ventana Pedidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidos.setText("Accion");
		this.jComboBoxTiposAccionesPedidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidos = new JLabelMe();
		
		this.jLabelAccionesPedidos.setText("Acciones");		
		this.jLabelAccionesPedidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidos=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidos = new GridBagLayout();
		
		this.jPanelCamposPedidos.setLayout(gridaBagLayoutCamposPedidos);
		this.jPanelCamposOcultosPedidos.setLayout(gridaBagLayoutCamposOcultosPedidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidos.add(jLabelIdPedidos, this.gridBagConstraintsPedidos);



	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidos.add(jLabelidPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidos.add(jLabelid_empresaPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidos.add(jButtonid_empresaPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 3;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidos.add(jButtonid_empresaPedidosUpdate, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidos.add(jComboBoxid_empresaPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedidoPedidos.add(jLabelid_estado_pedidoPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoPedidos.add(jButtonid_estado_pedidoPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 3;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoPedidos.add(jButtonid_estado_pedidoPedidosUpdate, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedidoPedidos.add(jComboBoxid_estado_pedidoPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdePedidos.add(jLabelfecha_emision_desdePedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdePedidos.add(jButtonfecha_emision_desdePedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdePedidos.add(jDateChooserfecha_emision_desdePedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaPedidos.add(jLabelfecha_emision_hastaPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaPedidos.add(jButtonfecha_emision_hastaPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaPedidos.add(jDateChooserfecha_emision_hastaPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clientePedidos.add(jLabelnombre_completo_clientePedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clientePedidos.add(jButtonnombre_completo_clientePedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clientePedidos.add(jscrollPanenombre_completo_clientePedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_monedaPedidos.add(jLabelnombre_monedaPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_monedaPedidos.add(jButtonnombre_monedaPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_monedaPedidos.add(jTextFieldnombre_monedaPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaPedidos.add(jLabelnombre_zonaPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaPedidos.add(jButtonnombre_zonaPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaPedidos.add(jTextFieldnombre_zonaPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroPedidos.add(jLabelnumeroPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroPedidos.add(jButtonnumeroPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroPedidos.add(jTextFieldnumeroPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaPedidos.add(jLabelivaPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaPedidos.add(jButtonivaPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaPedidos.add(jTextFieldivaPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorPedidos.add(jLabeldescuento_valorPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorPedidos.add(jButtondescuento_valorPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorPedidos.add(jTextFielddescuento_valorPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroPedidos.add(jLabelotroPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroPedidos.add(jButtonotroPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroPedidos.add(jTextFieldotroPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalPedidos.add(jLabeltotalPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPedidos.add(jButtontotalPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalPedidos.add(jTextFieldtotalPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoPedidos.add(jLabelfecha_vencimientoPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoPedidos.add(jButtonfecha_vencimientoPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoPedidos.add(jDateChooserfecha_vencimientoPedidos, this.gridBagConstraintsPedidos);


	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 0;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPedidos.add(jLabelfecha_emisionPedidos, this.gridBagConstraintsPedidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		//this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = 2;
		this.gridBagConstraintsPedidos.ipadx = 0;
		this.gridBagConstraintsPedidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPedidos.add(jButtonfecha_emisionPedidosBusqueda, this.gridBagConstraintsPedidos);
	}

	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidos.gridy = 0;
	this.gridBagConstraintsPedidos.gridx = 1;
	this.gridBagConstraintsPedidos.ipadx = 0;
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPedidos.add(jDateChooserfecha_emisionPedidos, this.gridBagConstraintsPedidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelidPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelid_estado_pedidoPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelfecha_emision_desdePedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelfecha_emision_hastaPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelnombre_completo_clientePedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelnombre_monedaPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelnombre_zonaPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelnumeroPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelivaPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPaneldescuento_valorPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelotroPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPaneltotalPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelfecha_vencimientoPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidos.add(this.jPanelfecha_emisionPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposPedidos % 2==0) {
		iXPanelCamposPedidos=0;
		iYPanelCamposPedidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidos = new GridBagConstraints();
	this.gridBagConstraintsPedidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidos.gridy = iYPanelCamposOcultosPedidos;
	this.gridBagConstraintsPedidos.gridx = iXPanelCamposOcultosPedidos++;
	this.gridBagConstraintsPedidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidos.add(this.jPanelid_empresaPedidos, this.gridBagConstraintsPedidos);



	if(iXPanelCamposOcultosPedidos % 2==0) {
		iXPanelCamposOcultosPedidos=0;
		iYPanelCamposOcultosPedidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesPedidos= new GridBagLayout();
		this.jPanelAccionesPedidos.setLayout(gridaBagLayoutAccionesPedidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidos= new GridBagLayout();
		this.jPanelAccionesFormularioPedidos.setLayout(gridaBagLayoutAccionesFormularioPedidos);
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidos.add(this.jComboBoxTiposAccionesFormularioPedidos, this.gridBagConstraintsPedidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidos.add(this.jButtonModificarPedidos, this.gridBagConstraintsPedidos);							

		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidos.gridy = 0;
		this.gridBagConstraintsPedidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidos.add(this.jButtonEliminarPedidos, this.gridBagConstraintsPedidos);
		
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = 0;		
		this.gridBagConstraintsPedidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidos.add(this.jButtonActualizarPedidos, this.gridBagConstraintsPedidos);


		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = 0;		
		this.gridBagConstraintsPedidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidos.add(this.jButtonGuardarCambiosPedidos, this.gridBagConstraintsPedidos);	
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = 0;		
		this.gridBagConstraintsPedidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidos.add(this.jButtonCancelarPedidos, this.gridBagConstraintsPedidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidos = new GridBagConstraints();						
			this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidos.gridx = 0;		
			//this.gridBagConstraintsPedidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidos.gridx =0;
		this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidos, this.gridBagConstraintsPedidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidos = new PedidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidosModel pedidosModel=new PedidosModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidosModel.PedidosFocusTraversalPolicy pedidosFocusTraversalPolicy = pedidosModel.new PedidosFocusTraversalPolicy(this);
			
			//pedidosFocusTraversalPolicy.setpedidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidosModel);
			
			
			this.jContentPaneDetallePedidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidos = new GridBagLayout();	
			this.jContentPaneDetallePedidos.setLayout(gridaBagLayoutDetallePedidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPedidos = new GridBagConstraints();
				this.gridBagConstraintsPedidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPedidos.gridx = 0;
					
				
				this.jContentPaneDetallePedidos.add(jTtoolBarDetallePedidos, gridBagConstraintsPedidos);								
				
}
			
			this.jScrollPanelDatosEdicionPedidos=   new JScrollPane(jContentPaneDetallePedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPedidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidos.gridx = 0;
	        
			this.jContentPaneDetallePedidos.add(jPanelCamposPedidos, gridBagConstraintsPedidos);
			
			
			
			
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
						//&& pedidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pedidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidos= new GridBagConstraints();
						this.gridBagConstraintsPedidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidos.gridx = 0;
						this.jContentPaneDetallePedidos.add(this.jTabbedPaneRelacionesPedidos, this.gridBagConstraintsPedidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidos = new GridBagConstraints();
					this.gridBagConstraintsPedidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidos.gridx = 0;
					
				
					this.jContentPaneDetallePedidos.add(jPanelCamposOcultosPedidos, gridBagConstraintsPedidos);
				
					this.jPanelCamposOcultosPedidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPedidos.gridx = 0;
	        this.gridBagConstraintsPedidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidos.add(this.jPanelAccionesFormularioPedidos, this.gridBagConstraintsPedidos);							
			
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
	        this.gridBagConstraintsPedidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPedidos.gridx = 0;
	        
			
			this.jContentPaneDetallePedidos.add(this.jPanelAccionesPedidos, this.gridBagConstraintsPedidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidos=   new JScrollPane(this.jPanelCamposPedidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidos.gridx = 0;
			this.gridBagConstraintsPedidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidos, this.gridBagConstraintsPedidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidos, this.gridBagConstraintsPedidos);			
			
			this.gridBagConstraintsPedidos = new GridBagConstraints();
			this.gridBagConstraintsPedidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidos, this.gridBagConstraintsPedidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidos, this.gridBagConstraintsPedidos);
			
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidos, this.gridBagConstraintsPedidos);
		
			
		this.gridBagConstraintsPedidos = new GridBagConstraints();
		this.gridBagConstraintsPedidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidos, this.gridBagConstraintsPedidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidos;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidos;
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
