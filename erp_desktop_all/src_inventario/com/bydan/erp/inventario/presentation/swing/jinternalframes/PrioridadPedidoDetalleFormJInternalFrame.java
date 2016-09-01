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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.PrioridadPedidoConstantesFunciones;

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
public class PrioridadPedidoDetalleFormJInternalFrame extends PrioridadPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePrioridadPedido;
	
	protected JMenuBar jmenuBarDetallePrioridadPedido;
	
	protected JMenu jmenuDetallePrioridadPedido;
	protected JMenu jmenuDetalleArchivoPrioridadPedido;
	protected JMenu jmenuDetalleAccionesPrioridadPedido;
	protected JMenu jmenuDetalleDatosPrioridadPedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPrioridadPedido;	
	protected GridBagConstraints gridBagConstraintsPrioridadPedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PrioridadPedidoBeanSwingJInternalFrameAdditional jInternalFrameDetallePrioridadPedido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PrioridadPedidoSessionBean prioridadpedidoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PrioridadPedidoLogic prioridadpedidoLogic;
	
	public JScrollPane jScrollPanelDatosPrioridadPedido;
	public JScrollPane jScrollPanelDatosEdicionPrioridadPedido;
	public JScrollPane jScrollPanelDatosGeneralPrioridadPedido;
	
	protected JPanel jPanelCamposPrioridadPedido;    
	protected JPanel jPanelCamposOcultosPrioridadPedido;    	
	protected JPanel jPanelAccionesPrioridadPedido;
	protected JPanel jPanelAccionesFormularioPrioridadPedido;
    
	
	
	protected Integer iXPanelCamposPrioridadPedido=0;
	protected Integer iYPanelCamposPrioridadPedido=0;
	
	protected Integer iXPanelCamposOcultosPrioridadPedido=0;
	protected Integer iYPanelCamposOcultosPrioridadPedido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPrioridadPedido;
	public JButton jButtonModificarPrioridadPedido;
	public JButton jButtonActualizarPrioridadPedido;
    public JButton jButtonEliminarPrioridadPedido;
	public JButton jButtonCancelarPrioridadPedido;
    public JButton jButtonGuardarCambiosPrioridadPedido;
	public JButton jButtonGuardarCambiosTablaPrioridadPedido;
	protected JButton jButtonCerrarPrioridadPedido;
	
	
	protected JButton jButtonProcesarInformacionPrioridadPedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPrioridadPedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPrioridadPedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajePrioridadPedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPrioridadPedido;
	protected JButton jButtonModificarToolBarPrioridadPedido;
	protected JButton jButtonActualizarToolBarPrioridadPedido;
    protected JButton jButtonEliminarToolBarPrioridadPedido;
	protected JButton jButtonCancelarToolBarPrioridadPedido;
    protected JButton jButtonGuardarCambiosToolBarPrioridadPedido;
	protected JButton jButtonGuardarCambiosTablaToolBarPrioridadPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarPrioridadPedido;
	protected JButton jButtonCerrarToolBarPrioridadPedido;
	
	protected JButton jButtonProcesarInformacionToolBarPrioridadPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPrioridadPedido;
	protected JMenuItem jMenuItemModificarPrioridadPedido;
	protected JMenuItem jMenuItemActualizarPrioridadPedido;
    protected JMenuItem jMenuItemEliminarPrioridadPedido;
	protected JMenuItem jMenuItemCancelarPrioridadPedido;
    protected JMenuItem jMenuItemGuardarCambiosPrioridadPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaPrioridadPedido;
	protected JMenuItem jMenuItemCerrarPrioridadPedido;
	protected JMenuItem jMenuItemDetalleCerrarPrioridadPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarPrioridadPedido;
	
	protected JMenuItem jMenuItemProcesarInformacionPrioridadPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPrioridadPedido;
	protected JMenuItem jMenuItemMostrarOcultarPrioridadPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPrioridadPedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPrioridadPedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPrioridadPedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPrioridadPedido;
	public JLabel jLabelIdPrioridadPedido;
	public JLabel jLabelidPrioridadPedido;
	public JButton jButtonidPrioridadPedidoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePrioridadPedido;
	public JLabel jLabelnombrePrioridadPedido;
	public JTextField jTextFieldnombrePrioridadPedido;
	public JButton jButtonnombrePrioridadPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldiaPrioridadPedido;
	public JLabel jLabeldiaPrioridadPedido;
	public JTextField jTextFielddiaPrioridadPedido;
	public JButton jButtondiaPrioridadPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPrioridadPedido;
	public JLabel jLabelid_empresaPrioridadPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPrioridadPedido;
	public JButton jButtonid_empresaPrioridadPedido= new JButtonMe();
	public JButton jButtonid_empresaPrioridadPedidoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPrioridadPedidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPrioridadPedido;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PrioridadPedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPrioridadPedido=new JPanel();
				this.jPanelAccionesFormularioPrioridadPedido=new JPanel();
				this.jmenuBarDetallePrioridadPedido=new JMenuBar();
				this.jTtoolBarDetallePrioridadPedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PrioridadPedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PrioridadPedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPrioridadPedido() {
		return this.jButtonActualizarToolBarPrioridadPedido;
	}
	
	public JButton getjButtonEliminarToolBarPrioridadPedido() {
		return this.jButtonEliminarToolBarPrioridadPedido;
	}
	
	public JButton getjButtonCancelarToolBarPrioridadPedido() {
		return this.jButtonCancelarToolBarPrioridadPedido;
	}		
	
	public JButton getjButtonProcesarInformacionPrioridadPedido() {
		return this.jButtonProcesarInformacionPrioridadPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPrioridadPedido)	{
		this.jButtonProcesarInformacionPrioridadPedido = jButtonProcesarInformacionPrioridadPedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPrioridadPedido() {
		return this.jComboBoxTiposAccionesPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPrioridadPedido(
			JComboBox jComboBoxTiposRelacionesPrioridadPedido) {
		this.jComboBoxTiposRelacionesPrioridadPedido = jComboBoxTiposRelacionesPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPrioridadPedido(
			JComboBox jComboBoxTiposAccionesPrioridadPedido) {
		this.jComboBoxTiposAccionesPrioridadPedido = jComboBoxTiposAccionesPrioridadPedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPrioridadPedido() {
		return this.jComboBoxTiposAccionesFormularioPrioridadPedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPrioridadPedido(
			JComboBox jComboBoxTiposAccionesFormularioPrioridadPedido) {
		this.jComboBoxTiposAccionesFormularioPrioridadPedido = jComboBoxTiposAccionesFormularioPrioridadPedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
		
		this.prioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.prioridadpedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PrioridadPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Prioridad Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		PrioridadPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePrioridadPedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPrioridadPedido=new JButtonMe();
				this.jButtonModificarToolBarPrioridadPedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPrioridadPedido,this.jTtoolBarDetallePrioridadPedido,
							"actualizar","actualizar","Actualizar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPrioridadPedido,this.jTtoolBarDetallePrioridadPedido,
							"eliminar","eliminar","Eliminar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPrioridadPedido,this.jTtoolBarDetallePrioridadPedido,
							"cancelar","cancelar","Cancelar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPrioridadPedido,this.jTtoolBarDetallePrioridadPedido,
							"guardarcambios","guardarcambios","Guardar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePrioridadPedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePrioridadPedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPrioridadPedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPrioridadPedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPrioridadPedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPrioridadPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPrioridadPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPrioridadPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPrioridadPedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPrioridadPedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPrioridadPedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPrioridadPedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPrioridadPedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPrioridadPedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPrioridadPedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPrioridadPedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPrioridadPedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPrioridadPedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPrioridadPedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPrioridadPedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPrioridadPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPrioridadPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPrioridadPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPrioridadPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPrioridadPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPrioridadPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPrioridadPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPrioridadPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPrioridadPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPrioridadPedido.add(this.jMenuItemDetalleCerrarPrioridadPedido);
		
		this.jmenuDetalleAccionesPrioridadPedido.add(this.jMenuItemActualizarPrioridadPedido);
		this.jmenuDetalleAccionesPrioridadPedido.add(this.jMenuItemEliminarPrioridadPedido);
		this.jmenuDetalleAccionesPrioridadPedido.add(this.jMenuItemCancelarPrioridadPedido);		
		
		//this.jmenuDetalleDatosPrioridadPedido.add(this.jMenuItemDetalleAbrirOrderByPrioridadPedido);				
		this.jmenuDetalleDatosPrioridadPedido.add(this.jMenuItemDetalleMostarOcultarPrioridadPedido);				
				
		//this.jmenuDetalleAccionesPrioridadPedido.add(this.jMenuItemGuardarCambiosPrioridadPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePrioridadPedido.add(this.jmenuDetalleArchivoPrioridadPedido);		
		this.jmenuBarDetallePrioridadPedido.add(this.jmenuDetalleAccionesPrioridadPedido);		
		this.jmenuBarDetallePrioridadPedido.add(this.jmenuDetalleDatosPrioridadPedido);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePrioridadPedido);				
	}
	
	
	public void inicializarElementosCamposPrioridadPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPrioridadPedido = new JLabelMe();
		jLabelIdPrioridadPedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPrioridadPedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPrioridadPedido.setToolTipText(PrioridadPedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPrioridadPedido= new GridBagLayout();

		this.jPanelidPrioridadPedido.setLayout(this.gridaBagLayoutPrioridadPedido);

		jLabelidPrioridadPedido = new JLabel();
		jLabelidPrioridadPedido.setText("Id");

		jLabelidPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombrePrioridadPedido = new JLabelMe();
		this.jLabelnombrePrioridadPedido.setText(""+PrioridadPedidoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePrioridadPedido.setToolTipText("Nombre");
		this.jLabelnombrePrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePrioridadPedido.setToolTipText(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPrioridadPedido = new GridBagLayout();
		this.jPanelnombrePrioridadPedido.setLayout(this.gridaBagLayoutPrioridadPedido);


		jTextFieldnombrePrioridadPedido= new JTextFieldMe();

		jTextFieldnombrePrioridadPedido.setEnabled(false);
		jTextFieldnombrePrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombrePrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombrePrioridadPedidoBusqueda= new JButtonMe();
		this.jButtonnombrePrioridadPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePrioridadPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePrioridadPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePrioridadPedidoBusqueda.setText("U");
		this.jButtonnombrePrioridadPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePrioridadPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePrioridadPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombrePrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombrePrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePrioridadPedidoBusqueda"));

		if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePrioridadPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldiaPrioridadPedido = new JLabelMe();
		this.jLabeldiaPrioridadPedido.setText(""+PrioridadPedidoConstantesFunciones.LABEL_DIA+" : *");
		this.jLabeldiaPrioridadPedido.setToolTipText("Dia");
		this.jLabeldiaPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiaPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiaPrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiaPrioridadPedido.setToolTipText(PrioridadPedidoConstantesFunciones.LABEL_DIA);
		this.gridaBagLayoutPrioridadPedido = new GridBagLayout();
		this.jPaneldiaPrioridadPedido.setLayout(this.gridaBagLayoutPrioridadPedido);


		jTextFielddiaPrioridadPedido= new JTextFieldMe();
		jTextFielddiaPrioridadPedido.setEnabled(false);
		jTextFielddiaPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiaPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiaPrioridadPedido.setText("0");

		this.jButtondiaPrioridadPedidoBusqueda= new JButtonMe();
		this.jButtondiaPrioridadPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaPrioridadPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaPrioridadPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiaPrioridadPedidoBusqueda.setText("U");
		this.jButtondiaPrioridadPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiaPrioridadPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiaPrioridadPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiaPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiaPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diaPrioridadPedidoBusqueda"));

		if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiaPrioridadPedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPrioridadPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPrioridadPedido = new JLabelMe();
		this.jLabelid_empresaPrioridadPedido.setText(""+PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPrioridadPedido.setToolTipText("Empresa");
		this.jLabelid_empresaPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPrioridadPedido.setToolTipText(PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPrioridadPedido = new GridBagLayout();
		this.jPanelid_empresaPrioridadPedido.setLayout(this.gridaBagLayoutPrioridadPedido);


		jComboBoxid_empresaPrioridadPedido= new JComboBoxMe();
		jComboBoxid_empresaPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPrioridadPedido.setEnabled(false);

		this.jButtonid_empresaPrioridadPedido= new JButtonMe();
		this.jButtonid_empresaPrioridadPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrioridadPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrioridadPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPrioridadPedido.setText("Buscar");
		this.jButtonid_empresaPrioridadPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPrioridadPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrioridadPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrioridadPedido"));

		this.jButtonid_empresaPrioridadPedidoBusqueda= new JButtonMe();
		this.jButtonid_empresaPrioridadPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrioridadPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrioridadPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPrioridadPedidoBusqueda.setText("U");
		this.jButtonid_empresaPrioridadPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPrioridadPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrioridadPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrioridadPedidoBusqueda"));

		if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPrioridadPedidoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPrioridadPedidoUpdate= new JButtonMe();
		this.jButtonid_empresaPrioridadPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrioridadPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPrioridadPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPrioridadPedidoUpdate.setText("U");
		this.jButtonid_empresaPrioridadPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPrioridadPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPrioridadPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPrioridadPedidoUpdate"));



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
		//this.jInternalFrameDetallePrioridadPedido = new PrioridadPedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Prioridad Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPrioridadPedido= new GridBagLayout();
		

		
		String sToolTipPrioridadPedido="";
		sToolTipPrioridadPedido=PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPrioridadPedido+="(Inventario.PrioridadPedido)";
		}
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPrioridadPedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPrioridadPedido = new JButtonMe();
		this.jButtonModificarPrioridadPedido = new JButtonMe();
        this.jButtonActualizarPrioridadPedido = new JButtonMe();
        this.jButtonEliminarPrioridadPedido = new JButtonMe();
        this.jButtonCancelarPrioridadPedido = new JButtonMe();
        this.jButtonGuardarCambiosPrioridadPedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaPrioridadPedido = new JButtonMe();
		this.jButtonCerrarPrioridadPedido = new JButtonMe();
		
		this.jScrollPanelDatosPrioridadPedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionPrioridadPedido = new JScrollPane();
		this.jScrollPanelDatosGeneralPrioridadPedido = new JScrollPane();
				
		
		
		this.jPanelCamposPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Prioridad Pedido";
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Prioridad Pedidoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPrioridadPedido.setName("jPanelCamposPrioridadPedido"); 

		this.jPanelCamposOcultosPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPrioridadPedido.setName("jPanelCamposOcultosPrioridadPedido"); 

        this.jPanelAccionesPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPrioridadPedido.setToolTipText("Acciones");
        this.jPanelAccionesPrioridadPedido.setName("Acciones"); 

		this.jPanelAccionesFormularioPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPrioridadPedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPrioridadPedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPrioridadPedido.setText("Nuevo");
		this.jButtonModificarPrioridadPedido.setText("Editar");
        this.jButtonActualizarPrioridadPedido.setText("Actualizar");
        this.jButtonEliminarPrioridadPedido.setText("Eliminar");
        this.jButtonCancelarPrioridadPedido.setText("Cancelar");
        this.jButtonGuardarCambiosPrioridadPedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaPrioridadPedido.setText("Guardar");
		this.jButtonCerrarPrioridadPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPrioridadPedido,"nuevo_button","Nuevo",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPrioridadPedido,"modificar_button","Editar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPrioridadPedido,"actualizar_button","Actualizar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPrioridadPedido,"eliminar_button","Eliminar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPrioridadPedido,"cancelar_button","Cancelar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPrioridadPedido,"guardarcambios_button","Guardar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPrioridadPedido,"guardarcambiostabla_button","Guardar",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPrioridadPedido,"cerrar_button","Salir",this.prioridadpedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPrioridadPedido.setToolTipText("Nuevo"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPrioridadPedido.setToolTipText("Editar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPrioridadPedido.setToolTipText("Actualizar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPrioridadPedido.setToolTipText("Eliminar)"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPrioridadPedido.setToolTipText("Cancelar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPrioridadPedido.setToolTipText("Guardar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPrioridadPedido.setToolTipText("Guardar"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPrioridadPedido.setToolTipText("Salir"+" "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPrioridadPedido";
		inputMap = this.jButtonNuevoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPrioridadPedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPrioridadPedido";
		inputMap = this.jButtonActualizarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPrioridadPedido"));
		
		//ELIMINAR
		sMapKey = "EliminarPrioridadPedido";
		inputMap = this.jButtonEliminarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPrioridadPedido"));
		
		//CANCELAR	
		sMapKey = "CancelarPrioridadPedido";
		inputMap = this.jButtonCancelarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPrioridadPedido"));
		
		//CERRAR		
		sMapKey = "CerrarPrioridadPedido";
		inputMap = this.jButtonCerrarPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPrioridadPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPrioridadPedido";
		inputMap = this.jButtonGuardarCambiosTablaPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPrioridadPedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPrioridadPedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPrioridadPedido.setToolTipText("Nuevo PrioridadPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPrioridadPedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPrioridadPedido.setToolTipText("Sin Cerrar Ventana PrioridadPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePrioridadPedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePrioridadPedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPrioridadPedido.setText("Accion");
		this.jComboBoxTiposAccionesPrioridadPedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPrioridadPedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPrioridadPedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPrioridadPedido = new JLabelMe();
		
		this.jLabelAccionesPrioridadPedido.setText("Acciones");		
		this.jLabelAccionesPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPrioridadPedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPrioridadPedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPrioridadPedido=new JTabbedPane();
		this.jTabbedPaneRelacionesPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPrioridadPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPrioridadPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPrioridadPedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPrioridadPedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPrioridadPedido = new GridBagLayout();
		
		this.jPanelCamposPrioridadPedido.setLayout(gridaBagLayoutCamposPrioridadPedido);
		this.jPanelCamposOcultosPrioridadPedido.setLayout(gridaBagLayoutCamposOcultosPrioridadPedido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 0;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPrioridadPedido.add(jLabelIdPrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 1;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPrioridadPedido.add(jLabelidPrioridadPedido, this.gridBagConstraintsPrioridadPedido);


	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 0;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPrioridadPedido.add(jLabelid_empresaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx = 2;
		this.gridBagConstraintsPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPrioridadPedido.add(jButtonid_empresaPrioridadPedidoBusqueda, this.gridBagConstraintsPrioridadPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx = 3;
		this.gridBagConstraintsPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPrioridadPedido.add(jButtonid_empresaPrioridadPedidoUpdate, this.gridBagConstraintsPrioridadPedido);
	}

	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 1;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPrioridadPedido.add(jComboBoxid_empresaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);


	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 0;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePrioridadPedido.add(jLabelnombrePrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx = 2;
		this.gridBagConstraintsPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePrioridadPedido.add(jButtonnombrePrioridadPedidoBusqueda, this.gridBagConstraintsPrioridadPedido);
	}

	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 1;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePrioridadPedido.add(jTextFieldnombrePrioridadPedido, this.gridBagConstraintsPrioridadPedido);


	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 0;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiaPrioridadPedido.add(jLabeldiaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx = 2;
		this.gridBagConstraintsPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiaPrioridadPedido.add(jButtondiaPrioridadPedidoBusqueda, this.gridBagConstraintsPrioridadPedido);
	}

	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPrioridadPedido.gridy = 0;
	this.gridBagConstraintsPrioridadPedido.gridx = 1;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiaPrioridadPedido.add(jTextFielddiaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrioridadPedido.gridy = iYPanelCamposPrioridadPedido;
	this.gridBagConstraintsPrioridadPedido.gridx = iXPanelCamposPrioridadPedido++;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrioridadPedido.add(this.jPanelidPrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(iXPanelCamposPrioridadPedido % 1==0) {
		iXPanelCamposPrioridadPedido=0;
		iYPanelCamposPrioridadPedido++;
	}
	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrioridadPedido.gridy = iYPanelCamposPrioridadPedido;
	this.gridBagConstraintsPrioridadPedido.gridx = iXPanelCamposPrioridadPedido++;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrioridadPedido.add(this.jPanelnombrePrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(iXPanelCamposPrioridadPedido % 1==0) {
		iXPanelCamposPrioridadPedido=0;
		iYPanelCamposPrioridadPedido++;
	}
	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrioridadPedido.gridy = iYPanelCamposPrioridadPedido;
	this.gridBagConstraintsPrioridadPedido.gridx = iXPanelCamposPrioridadPedido++;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPrioridadPedido.add(this.jPaneldiaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(iXPanelCamposPrioridadPedido % 1==0) {
		iXPanelCamposPrioridadPedido=0;
		iYPanelCamposPrioridadPedido++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPrioridadPedido.gridy = iYPanelCamposOcultosPrioridadPedido;
	this.gridBagConstraintsPrioridadPedido.gridx = iXPanelCamposOcultosPrioridadPedido++;
	this.gridBagConstraintsPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPrioridadPedido.add(this.jPanelid_empresaPrioridadPedido, this.gridBagConstraintsPrioridadPedido);



	if(iXPanelCamposOcultosPrioridadPedido % 1==0) {
		iXPanelCamposOcultosPrioridadPedido=0;
		iYPanelCamposOcultosPrioridadPedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesPrioridadPedido= new GridBagLayout();
		this.jPanelAccionesPrioridadPedido.setLayout(gridaBagLayoutAccionesPrioridadPedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPrioridadPedido= new GridBagLayout();
		this.jPanelAccionesFormularioPrioridadPedido.setLayout(gridaBagLayoutAccionesFormularioPrioridadPedido);
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPrioridadPedido.add(this.jComboBoxTiposAccionesFormularioPrioridadPedido, this.gridBagConstraintsPrioridadPedido);

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPrioridadPedido.add(this.jCheckBoxPostAccionNuevoPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPrioridadPedido.add(this.jCheckBoxPostAccionSinCerrarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPrioridadPedido.add(this.jCheckBoxPostAccionSinMensajePrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesPrioridadPedido.add(this.jButtonModificarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);							

		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPrioridadPedido.gridy = 0;
		this.gridBagConstraintsPrioridadPedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesPrioridadPedido.add(this.jButtonEliminarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
			
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = 0;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesPrioridadPedido.add(this.jButtonActualizarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);


		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = 0;		
		this.gridBagConstraintsPrioridadPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesPrioridadPedido.add(this.jButtonGuardarCambiosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);	
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = 0;		
		this.gridBagConstraintsPrioridadPedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesPrioridadPedido.add(this.jButtonCancelarPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPrioridadPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPrioridadPedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();						
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPrioridadPedido.gridx = 0;		
			//this.gridBagConstraintsPrioridadPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPrioridadPedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPrioridadPedido.gridx =0;
		this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPrioridadPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePrioridadPedido = new PrioridadPedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Prioridad Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Prioridad Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Prioridad Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PrioridadPedidoModel prioridadpedidoModel=new PrioridadPedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//PrioridadPedidoModel.PrioridadPedidoFocusTraversalPolicy prioridadpedidoFocusTraversalPolicy = prioridadpedidoModel.new PrioridadPedidoFocusTraversalPolicy(this);
			
			//prioridadpedidoFocusTraversalPolicy.setprioridadpedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(prioridadpedidoModel);
			
			
			this.jContentPaneDetallePrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePrioridadPedido = new GridBagLayout();	
			this.jContentPaneDetallePrioridadPedido.setLayout(gridaBagLayoutDetallePrioridadPedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPrioridadPedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
				this.gridBagConstraintsPrioridadPedido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPrioridadPedido.gridx = 0;
					
				
				this.jContentPaneDetallePrioridadPedido.add(jTtoolBarDetallePrioridadPedido, gridBagConstraintsPrioridadPedido);								
				
}
			
			this.jScrollPanelDatosEdicionPrioridadPedido=   new JScrollPane(jContentPaneDetallePrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPrioridadPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPrioridadPedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPrioridadPedido.gridx = 0;
	        
			this.jContentPaneDetallePrioridadPedido.add(jPanelCamposPrioridadPedido, gridBagConstraintsPrioridadPedido);
			
			
			
			
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
						&& prioridadpedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPrioridadPedido= new GridBagConstraints();
						this.gridBagConstraintsPrioridadPedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPrioridadPedido.gridx = 0;
						this.jContentPaneDetallePrioridadPedido.add(this.jTabbedPaneRelacionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPrioridadPedido.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPrioridadPedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
					this.gridBagConstraintsPrioridadPedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPrioridadPedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPrioridadPedido.gridx = 0;
					
				
					this.jContentPaneDetallePrioridadPedido.add(jPanelCamposOcultosPrioridadPedido, gridBagConstraintsPrioridadPedido);
				
					this.jPanelCamposOcultosPrioridadPedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPrioridadPedido.gridx = 0;
	        this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePrioridadPedido.add(this.jPanelAccionesFormularioPrioridadPedido, this.gridBagConstraintsPrioridadPedido);							
			
			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
	        this.gridBagConstraintsPrioridadPedido.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPrioridadPedido.gridx = 0;
	        
			
			this.jContentPaneDetallePrioridadPedido.add(this.jPanelAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPrioridadPedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPrioridadPedido=   new JScrollPane(this.jPanelCamposPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPrioridadPedido.gridx = 0;
			this.gridBagConstraintsPrioridadPedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPrioridadPedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPrioridadPedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPrioridadPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPrioridadPedido, this.gridBagConstraintsPrioridadPedido);			
			
			this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsPrioridadPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPrioridadPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
			
			
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		
			
		this.gridBagConstraintsPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsPrioridadPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPrioridadPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPrioridadPedido, this.gridBagConstraintsPrioridadPedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPrioridadPedido;//jContentPane;
		
		return jScrollPanelDatosEdicionPrioridadPedido;
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
