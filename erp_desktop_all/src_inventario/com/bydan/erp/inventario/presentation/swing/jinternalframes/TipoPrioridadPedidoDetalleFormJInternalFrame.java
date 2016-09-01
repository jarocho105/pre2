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
import com.bydan.erp.inventario.util.TipoPrioridadPedidoConstantesFunciones;

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
public class TipoPrioridadPedidoDetalleFormJInternalFrame extends TipoPrioridadPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPrioridadPedido;
	
	protected JMenuBar jmenuBarDetalleTipoPrioridadPedido;
	
	protected JMenu jmenuDetalleTipoPrioridadPedido;
	protected JMenu jmenuDetalleArchivoTipoPrioridadPedido;
	protected JMenu jmenuDetalleAccionesTipoPrioridadPedido;
	protected JMenu jmenuDetalleDatosTipoPrioridadPedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrioridadPedido;	
	protected GridBagConstraints gridBagConstraintsTipoPrioridadPedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPrioridadPedidoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPrioridadPedido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoPrioridadPedidoSessionBean tipoprioridadpedidoSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoPrioridadPedidoLogic tipoprioridadpedidoLogic;
	
	public JScrollPane jScrollPanelDatosTipoPrioridadPedido;
	public JScrollPane jScrollPanelDatosEdicionTipoPrioridadPedido;
	public JScrollPane jScrollPanelDatosGeneralTipoPrioridadPedido;
	
	protected JPanel jPanelCamposTipoPrioridadPedido;    
	protected JPanel jPanelCamposOcultosTipoPrioridadPedido;    	
	protected JPanel jPanelAccionesTipoPrioridadPedido;
	protected JPanel jPanelAccionesFormularioTipoPrioridadPedido;
    
	
	
	protected Integer iXPanelCamposTipoPrioridadPedido=0;
	protected Integer iYPanelCamposTipoPrioridadPedido=0;
	
	protected Integer iXPanelCamposOcultosTipoPrioridadPedido=0;
	protected Integer iYPanelCamposOcultosTipoPrioridadPedido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPrioridadPedido;
	public JButton jButtonModificarTipoPrioridadPedido;
	public JButton jButtonActualizarTipoPrioridadPedido;
    public JButton jButtonEliminarTipoPrioridadPedido;
	public JButton jButtonCancelarTipoPrioridadPedido;
    public JButton jButtonGuardarCambiosTipoPrioridadPedido;
	public JButton jButtonGuardarCambiosTablaTipoPrioridadPedido;
	protected JButton jButtonCerrarTipoPrioridadPedido;
	
	
	protected JButton jButtonProcesarInformacionTipoPrioridadPedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPrioridadPedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPrioridadPedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPrioridadPedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrioridadPedido;
	protected JButton jButtonModificarToolBarTipoPrioridadPedido;
	protected JButton jButtonActualizarToolBarTipoPrioridadPedido;
    protected JButton jButtonEliminarToolBarTipoPrioridadPedido;
	protected JButton jButtonCancelarToolBarTipoPrioridadPedido;
    protected JButton jButtonGuardarCambiosToolBarTipoPrioridadPedido;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrioridadPedido;
	protected JButton jButtonCerrarToolBarTipoPrioridadPedido;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPrioridadPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrioridadPedido;
	protected JMenuItem jMenuItemModificarTipoPrioridadPedido;
	protected JMenuItem jMenuItemActualizarTipoPrioridadPedido;
    protected JMenuItem jMenuItemEliminarTipoPrioridadPedido;
	protected JMenuItem jMenuItemCancelarTipoPrioridadPedido;
    protected JMenuItem jMenuItemGuardarCambiosTipoPrioridadPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrioridadPedido;
	protected JMenuItem jMenuItemCerrarTipoPrioridadPedido;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrioridadPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrioridadPedido;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPrioridadPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrioridadPedido;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrioridadPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrioridadPedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrioridadPedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPrioridadPedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPrioridadPedido;
	public JLabel jLabelIdTipoPrioridadPedido;
	public JLabel jLabelidTipoPrioridadPedido;
	public JButton jButtonidTipoPrioridadPedidoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPrioridadPedido;
	public JLabel jLabelnombreTipoPrioridadPedido;
	public JTextArea jTextAreanombreTipoPrioridadPedido;
	public JScrollPane jscrollPanenombreTipoPrioridadPedido;
	public JButton jButtonnombreTipoPrioridadPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoPrioridadPedido;
	public JLabel jLabelid_paisTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoPrioridadPedido;
	public JButton jButtonid_paisTipoPrioridadPedido= new JButtonMe();
	public JButton jButtonid_paisTipoPrioridadPedidoUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoPrioridadPedidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPrioridadPedido;
	
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
	
	public TipoPrioridadPedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPrioridadPedido=new JPanel();
				this.jPanelAccionesFormularioTipoPrioridadPedido=new JPanel();
				this.jmenuBarDetalleTipoPrioridadPedido=new JMenuBar();
				this.jTtoolBarDetalleTipoPrioridadPedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPrioridadPedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPrioridadPedido() {
		return this.jButtonActualizarToolBarTipoPrioridadPedido;
	}
	
	public JButton getjButtonEliminarToolBarTipoPrioridadPedido() {
		return this.jButtonEliminarToolBarTipoPrioridadPedido;
	}
	
	public JButton getjButtonCancelarToolBarTipoPrioridadPedido() {
		return this.jButtonCancelarToolBarTipoPrioridadPedido;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPrioridadPedido() {
		return this.jButtonProcesarInformacionTipoPrioridadPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrioridadPedido)	{
		this.jButtonProcesarInformacionTipoPrioridadPedido = jButtonProcesarInformacionTipoPrioridadPedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrioridadPedido() {
		return this.jComboBoxTiposAccionesTipoPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrioridadPedido(
			JComboBox jComboBoxTiposRelacionesTipoPrioridadPedido) {
		this.jComboBoxTiposRelacionesTipoPrioridadPedido = jComboBoxTiposRelacionesTipoPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrioridadPedido(
			JComboBox jComboBoxTiposAccionesTipoPrioridadPedido) {
		this.jComboBoxTiposAccionesTipoPrioridadPedido = jComboBoxTiposAccionesTipoPrioridadPedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPrioridadPedido() {
		return this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPrioridadPedido(
			JComboBox jComboBoxTiposAccionesFormularioTipoPrioridadPedido) {
		this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido = jComboBoxTiposAccionesFormularioTipoPrioridadPedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
		
		this.tipoprioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrioridadPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prioridad Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPrioridadPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPrioridadPedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPrioridadPedido=new JButtonMe();
				this.jButtonModificarToolBarTipoPrioridadPedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPrioridadPedido,this.jTtoolBarDetalleTipoPrioridadPedido,
							"actualizar","actualizar","Actualizar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPrioridadPedido,this.jTtoolBarDetalleTipoPrioridadPedido,
							"eliminar","eliminar","Eliminar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPrioridadPedido,this.jTtoolBarDetalleTipoPrioridadPedido,
							"cancelar","cancelar","Cancelar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPrioridadPedido,this.jTtoolBarDetalleTipoPrioridadPedido,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPrioridadPedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPrioridadPedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPrioridadPedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPrioridadPedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPrioridadPedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrioridadPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrioridadPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrioridadPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPrioridadPedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPrioridadPedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPrioridadPedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPrioridadPedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPrioridadPedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPrioridadPedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPrioridadPedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPrioridadPedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPrioridadPedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPrioridadPedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPrioridadPedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPrioridadPedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPrioridadPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrioridadPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrioridadPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrioridadPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrioridadPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrioridadPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPrioridadPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPrioridadPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPrioridadPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPrioridadPedido.add(this.jMenuItemDetalleCerrarTipoPrioridadPedido);
		
		this.jmenuDetalleAccionesTipoPrioridadPedido.add(this.jMenuItemActualizarTipoPrioridadPedido);
		this.jmenuDetalleAccionesTipoPrioridadPedido.add(this.jMenuItemEliminarTipoPrioridadPedido);
		this.jmenuDetalleAccionesTipoPrioridadPedido.add(this.jMenuItemCancelarTipoPrioridadPedido);		
		
		//this.jmenuDetalleDatosTipoPrioridadPedido.add(this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido);				
		this.jmenuDetalleDatosTipoPrioridadPedido.add(this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido);				
				
		//this.jmenuDetalleAccionesTipoPrioridadPedido.add(this.jMenuItemGuardarCambiosTipoPrioridadPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPrioridadPedido.add(this.jmenuDetalleArchivoTipoPrioridadPedido);		
		this.jmenuBarDetalleTipoPrioridadPedido.add(this.jmenuDetalleAccionesTipoPrioridadPedido);		
		this.jmenuBarDetalleTipoPrioridadPedido.add(this.jmenuDetalleDatosTipoPrioridadPedido);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPrioridadPedido);				
	}
	
	
	public void inicializarElementosCamposTipoPrioridadPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPrioridadPedido = new JLabelMe();
		jLabelIdTipoPrioridadPedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPrioridadPedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPrioridadPedido.setToolTipText(TipoPrioridadPedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPrioridadPedido= new GridBagLayout();

		this.jPanelidTipoPrioridadPedido.setLayout(this.gridaBagLayoutTipoPrioridadPedido);

		jLabelidTipoPrioridadPedido = new JLabel();
		jLabelidTipoPrioridadPedido.setText("Id");

		jLabelidTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoPrioridadPedido = new JLabelMe();
		this.jLabelnombreTipoPrioridadPedido.setText(""+TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPrioridadPedido.setToolTipText("Nombre");
		this.jLabelnombreTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPrioridadPedido.setToolTipText(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPrioridadPedido = new GridBagLayout();
		this.jPanelnombreTipoPrioridadPedido.setLayout(this.gridaBagLayoutTipoPrioridadPedido);


		jTextAreanombreTipoPrioridadPedido= new JTextAreaMe();
		jTextAreanombreTipoPrioridadPedido.setEnabled(false);
		jTextAreanombreTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrioridadPedido.setLineWrap(true);
		jTextAreanombreTipoPrioridadPedido.setWrapStyleWord(true);
		jTextAreanombreTipoPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPrioridadPedido.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPrioridadPedido = new JScrollPane(jTextAreanombreTipoPrioridadPedido);
		jscrollPanenombreTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPrioridadPedidoBusqueda= new JButtonMe();
		this.jButtonnombreTipoPrioridadPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrioridadPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrioridadPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPrioridadPedidoBusqueda.setText("U");
		this.jButtonnombreTipoPrioridadPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPrioridadPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPrioridadPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPrioridadPedidoBusqueda"));

		if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPrioridadPedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPrioridadPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoPrioridadPedido = new JLabelMe();
		this.jLabelid_paisTipoPrioridadPedido.setText(""+TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoPrioridadPedido.setToolTipText("Pais");
		this.jLabelid_paisTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoPrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoPrioridadPedido.setToolTipText(TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoPrioridadPedido = new GridBagLayout();
		this.jPanelid_paisTipoPrioridadPedido.setLayout(this.gridaBagLayoutTipoPrioridadPedido);


		jComboBoxid_paisTipoPrioridadPedido= new JComboBoxMe();
		jComboBoxid_paisTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoPrioridadPedido= new JButtonMe();
		this.jButtonid_paisTipoPrioridadPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoPrioridadPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoPrioridadPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoPrioridadPedido.setText("Buscar");
		this.jButtonid_paisTipoPrioridadPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoPrioridadPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoPrioridadPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoPrioridadPedido"));

		this.jButtonid_paisTipoPrioridadPedidoBusqueda= new JButtonMe();
		this.jButtonid_paisTipoPrioridadPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoPrioridadPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoPrioridadPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoPrioridadPedidoBusqueda.setText("U");
		this.jButtonid_paisTipoPrioridadPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoPrioridadPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoPrioridadPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoPrioridadPedidoBusqueda"));

		if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoPrioridadPedidoBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoPrioridadPedidoUpdate= new JButtonMe();
		this.jButtonid_paisTipoPrioridadPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoPrioridadPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoPrioridadPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoPrioridadPedidoUpdate.setText("U");
		this.jButtonid_paisTipoPrioridadPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoPrioridadPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoPrioridadPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoPrioridadPedidoUpdate"));



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
		//this.jInternalFrameDetalleTipoPrioridadPedido = new TipoPrioridadPedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Prioridad Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrioridadPedido= new GridBagLayout();
		

		
		String sToolTipTipoPrioridadPedido="";
		sToolTipTipoPrioridadPedido=TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrioridadPedido+="(Inventario.TipoPrioridadPedido)";
		}
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrioridadPedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPrioridadPedido = new JButtonMe();
		this.jButtonModificarTipoPrioridadPedido = new JButtonMe();
        this.jButtonActualizarTipoPrioridadPedido = new JButtonMe();
        this.jButtonEliminarTipoPrioridadPedido = new JButtonMe();
        this.jButtonCancelarTipoPrioridadPedido = new JButtonMe();
        this.jButtonGuardarCambiosTipoPrioridadPedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido = new JButtonMe();
		this.jButtonCerrarTipoPrioridadPedido = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrioridadPedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPrioridadPedido = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPrioridadPedido = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prioridad Pedido";
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPrioridadPedido.setName("jPanelCamposTipoPrioridadPedido"); 

		this.jPanelCamposOcultosTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPrioridadPedido.setName("jPanelCamposOcultosTipoPrioridadPedido"); 

        this.jPanelAccionesTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrioridadPedido.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrioridadPedido.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPrioridadPedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPrioridadPedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPrioridadPedido.setText("Nuevo");
		this.jButtonModificarTipoPrioridadPedido.setText("Editar");
        this.jButtonActualizarTipoPrioridadPedido.setText("Actualizar");
        this.jButtonEliminarTipoPrioridadPedido.setText("Eliminar");
        this.jButtonCancelarTipoPrioridadPedido.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPrioridadPedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.setText("Guardar");
		this.jButtonCerrarTipoPrioridadPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrioridadPedido,"nuevo_button","Nuevo",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPrioridadPedido,"modificar_button","Editar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPrioridadPedido,"actualizar_button","Actualizar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPrioridadPedido,"eliminar_button","Eliminar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPrioridadPedido,"cancelar_button","Cancelar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPrioridadPedido,"guardarcambios_button","Guardar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrioridadPedido,"guardarcambiostabla_button","Guardar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrioridadPedido,"cerrar_button","Salir",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPrioridadPedido.setToolTipText("Nuevo"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPrioridadPedido.setToolTipText("Editar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPrioridadPedido.setToolTipText("Actualizar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPrioridadPedido.setToolTipText("Eliminar)"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPrioridadPedido.setToolTipText("Cancelar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPrioridadPedido.setToolTipText("Guardar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.setToolTipText("Guardar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrioridadPedido.setToolTipText("Salir"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrioridadPedido";
		inputMap = this.jButtonNuevoTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrioridadPedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPrioridadPedido";
		inputMap = this.jButtonActualizarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPrioridadPedido"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPrioridadPedido";
		inputMap = this.jButtonEliminarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPrioridadPedido"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPrioridadPedido";
		inputMap = this.jButtonCancelarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPrioridadPedido"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPrioridadPedido";
		inputMap = this.jButtonCerrarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrioridadPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrioridadPedido";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrioridadPedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPrioridadPedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPrioridadPedido.setToolTipText("Nuevo TipoPrioridadPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido.setToolTipText("Sin Cerrar Ventana TipoPrioridadPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrioridadPedido.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPrioridadPedido = new JLabelMe();
		
		this.jLabelAccionesTipoPrioridadPedido.setText("Acciones");		
		this.jLabelAccionesTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPrioridadPedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPrioridadPedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPrioridadPedido=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPrioridadPedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPrioridadPedido = new GridBagLayout();
		
		this.jPanelCamposTipoPrioridadPedido.setLayout(gridaBagLayoutCamposTipoPrioridadPedido);
		this.jPanelCamposOcultosTipoPrioridadPedido.setLayout(gridaBagLayoutCamposOcultosTipoPrioridadPedido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPrioridadPedido.add(jLabelIdTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);



	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = 1;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPrioridadPedido.add(jLabelidTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);


	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoPrioridadPedido.add(jLabelid_paisTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 2;
		this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoPrioridadPedido.add(jButtonid_paisTipoPrioridadPedidoBusqueda, this.gridBagConstraintsTipoPrioridadPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 3;
		this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoPrioridadPedido.add(jButtonid_paisTipoPrioridadPedidoUpdate, this.gridBagConstraintsTipoPrioridadPedido);
	}

	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = 1;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoPrioridadPedido.add(jComboBoxid_paisTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);


	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPrioridadPedido.add(jLabelnombreTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 2;
		this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPrioridadPedido.add(jButtonnombreTipoPrioridadPedidoBusqueda, this.gridBagConstraintsTipoPrioridadPedido);
	}

	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = 1;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPrioridadPedido.add(jscrollPanenombreTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = iYPanelCamposTipoPrioridadPedido;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = iXPanelCamposTipoPrioridadPedido++;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrioridadPedido.add(this.jPanelidTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);



	if(iXPanelCamposTipoPrioridadPedido % 1==0) {
		iXPanelCamposTipoPrioridadPedido=0;
		iYPanelCamposTipoPrioridadPedido++;
	}
	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = iYPanelCamposTipoPrioridadPedido;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = iXPanelCamposTipoPrioridadPedido++;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrioridadPedido.add(this.jPanelid_paisTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);



	if(iXPanelCamposTipoPrioridadPedido % 1==0) {
		iXPanelCamposTipoPrioridadPedido=0;
		iYPanelCamposTipoPrioridadPedido++;
	}
	this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadPedido.gridy = iYPanelCamposTipoPrioridadPedido;
	this.gridBagConstraintsTipoPrioridadPedido.gridx = iXPanelCamposTipoPrioridadPedido++;
	this.gridBagConstraintsTipoPrioridadPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrioridadPedido.add(this.jPanelnombreTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);



	if(iXPanelCamposTipoPrioridadPedido % 1==0) {
		iXPanelCamposTipoPrioridadPedido=0;
		iYPanelCamposTipoPrioridadPedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPrioridadPedido= new GridBagLayout();
		this.jPanelAccionesTipoPrioridadPedido.setLayout(gridaBagLayoutAccionesTipoPrioridadPedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPrioridadPedido= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPrioridadPedido.setLayout(gridaBagLayoutAccionesFormularioTipoPrioridadPedido);
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrioridadPedido.add(this.jComboBoxTiposAccionesFormularioTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);

		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrioridadPedido.add(this.jCheckBoxPostAccionNuevoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrioridadPedido.add(this.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrioridadPedido.add(this.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPrioridadPedido.add(this.jButtonModificarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);							

		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		this.gridBagConstraintsTipoPrioridadPedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPrioridadPedido.add(this.jButtonEliminarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
			
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrioridadPedido.add(this.jButtonActualizarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);


		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrioridadPedido.add(this.jButtonGuardarCambiosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);	
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPrioridadPedido.add(this.jButtonCancelarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrioridadPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrioridadPedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;		
			//this.gridBagConstraintsTipoPrioridadPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrioridadPedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrioridadPedido.gridx =0;
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrioridadPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPrioridadPedido = new TipoPrioridadPedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Prioridad Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Prioridad Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prioridad Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPrioridadPedidoModel tipoprioridadpedidoModel=new TipoPrioridadPedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPrioridadPedidoModel.TipoPrioridadPedidoFocusTraversalPolicy tipoprioridadpedidoFocusTraversalPolicy = tipoprioridadpedidoModel.new TipoPrioridadPedidoFocusTraversalPolicy(this);
			
			//tipoprioridadpedidoFocusTraversalPolicy.settipoprioridadpedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprioridadpedidoModel);
			
			
			this.jContentPaneDetalleTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPrioridadPedido = new GridBagLayout();	
			this.jContentPaneDetalleTipoPrioridadPedido.setLayout(gridaBagLayoutDetalleTipoPrioridadPedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrioridadPedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPrioridadPedido.add(jTtoolBarDetalleTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPrioridadPedido=   new JScrollPane(jContentPaneDetalleTipoPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPrioridadPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
	        
			this.jContentPaneDetalleTipoPrioridadPedido.add(jPanelCamposTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);
			
			
			
			
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
						&& tipoprioridadpedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPrioridadPedido= new GridBagConstraints();
						this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
						this.jContentPaneDetalleTipoPrioridadPedido.add(this.jTabbedPaneRelacionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPrioridadPedido.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPrioridadPedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
					this.gridBagConstraintsTipoPrioridadPedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPrioridadPedido.add(jPanelCamposOcultosTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);
				
					this.jPanelCamposOcultosTipoPrioridadPedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
	        this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPrioridadPedido.add(this.jPanelAccionesFormularioTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);							
			
			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
	        this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPrioridadPedido.add(this.jPanelAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPrioridadPedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPrioridadPedido=   new JScrollPane(this.jPanelCamposTipoPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPrioridadPedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
			
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
			
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPrioridadPedido;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPrioridadPedido;
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
