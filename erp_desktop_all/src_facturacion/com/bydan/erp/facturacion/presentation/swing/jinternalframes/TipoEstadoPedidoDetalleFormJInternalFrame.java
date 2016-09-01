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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoEstadoPedidoConstantesFunciones;

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
public class TipoEstadoPedidoDetalleFormJInternalFrame extends TipoEstadoPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEstadoPedido;
	
	protected JMenuBar jmenuBarDetalleTipoEstadoPedido;
	
	protected JMenu jmenuDetalleTipoEstadoPedido;
	protected JMenu jmenuDetalleArchivoTipoEstadoPedido;
	protected JMenu jmenuDetalleAccionesTipoEstadoPedido;
	protected JMenu jmenuDetalleDatosTipoEstadoPedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEstadoPedido;	
	protected GridBagConstraints gridBagConstraintsTipoEstadoPedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEstadoPedidoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEstadoPedido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoEstadoPedidoSessionBean tipoestadopedidoSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoEstadoPedidoLogic tipoestadopedidoLogic;
	
	public JScrollPane jScrollPanelDatosTipoEstadoPedido;
	public JScrollPane jScrollPanelDatosEdicionTipoEstadoPedido;
	public JScrollPane jScrollPanelDatosGeneralTipoEstadoPedido;
	
	protected JPanel jPanelCamposTipoEstadoPedido;    
	protected JPanel jPanelCamposOcultosTipoEstadoPedido;    	
	protected JPanel jPanelAccionesTipoEstadoPedido;
	protected JPanel jPanelAccionesFormularioTipoEstadoPedido;
    
	
	
	protected Integer iXPanelCamposTipoEstadoPedido=0;
	protected Integer iYPanelCamposTipoEstadoPedido=0;
	
	protected Integer iXPanelCamposOcultosTipoEstadoPedido=0;
	protected Integer iYPanelCamposOcultosTipoEstadoPedido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEstadoPedido;
	public JButton jButtonModificarTipoEstadoPedido;
	public JButton jButtonActualizarTipoEstadoPedido;
    public JButton jButtonEliminarTipoEstadoPedido;
	public JButton jButtonCancelarTipoEstadoPedido;
    public JButton jButtonGuardarCambiosTipoEstadoPedido;
	public JButton jButtonGuardarCambiosTablaTipoEstadoPedido;
	protected JButton jButtonCerrarTipoEstadoPedido;
	
	
	protected JButton jButtonProcesarInformacionTipoEstadoPedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEstadoPedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEstadoPedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEstadoPedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEstadoPedido;
	protected JButton jButtonModificarToolBarTipoEstadoPedido;
	protected JButton jButtonActualizarToolBarTipoEstadoPedido;
    protected JButton jButtonEliminarToolBarTipoEstadoPedido;
	protected JButton jButtonCancelarToolBarTipoEstadoPedido;
    protected JButton jButtonGuardarCambiosToolBarTipoEstadoPedido;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEstadoPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEstadoPedido;
	protected JButton jButtonCerrarToolBarTipoEstadoPedido;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEstadoPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEstadoPedido;
	protected JMenuItem jMenuItemModificarTipoEstadoPedido;
	protected JMenuItem jMenuItemActualizarTipoEstadoPedido;
    protected JMenuItem jMenuItemEliminarTipoEstadoPedido;
	protected JMenuItem jMenuItemCancelarTipoEstadoPedido;
    protected JMenuItem jMenuItemGuardarCambiosTipoEstadoPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEstadoPedido;
	protected JMenuItem jMenuItemCerrarTipoEstadoPedido;
	protected JMenuItem jMenuItemDetalleCerrarTipoEstadoPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEstadoPedido;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEstadoPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEstadoPedido;
	protected JMenuItem jMenuItemMostrarOcultarTipoEstadoPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEstadoPedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEstadoPedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEstadoPedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEstadoPedido;
	public JLabel jLabelIdTipoEstadoPedido;
	public JTextFieldMe jTextFieldidTipoEstadoPedido;
	public JButton jButtonidTipoEstadoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEstadoPedido;
	public JLabel jLabelnombreTipoEstadoPedido;
	public JTextArea jTextAreanombreTipoEstadoPedido;
	public JScrollPane jscrollPanenombreTipoEstadoPedido;
	public JButton jButtonnombreTipoEstadoPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoEstadoPedido;
	public JLabel jLabelid_paisTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoEstadoPedido;
	public JButton jButtonid_paisTipoEstadoPedido= new JButtonMe();
	public JButton jButtonid_paisTipoEstadoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoEstadoPedidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEstadoPedido;
	
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
	
	public TipoEstadoPedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEstadoPedido=new JPanel();
				this.jPanelAccionesFormularioTipoEstadoPedido=new JPanel();
				this.jmenuBarDetalleTipoEstadoPedido=new JMenuBar();
				this.jTtoolBarDetalleTipoEstadoPedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEstadoPedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEstadoPedido() {
		return this.jButtonActualizarToolBarTipoEstadoPedido;
	}
	
	public JButton getjButtonEliminarToolBarTipoEstadoPedido() {
		return this.jButtonEliminarToolBarTipoEstadoPedido;
	}
	
	public JButton getjButtonCancelarToolBarTipoEstadoPedido() {
		return this.jButtonCancelarToolBarTipoEstadoPedido;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEstadoPedido() {
		return this.jButtonProcesarInformacionTipoEstadoPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEstadoPedido)	{
		this.jButtonProcesarInformacionTipoEstadoPedido = jButtonProcesarInformacionTipoEstadoPedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEstadoPedido() {
		return this.jComboBoxTiposAccionesTipoEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEstadoPedido(
			JComboBox jComboBoxTiposRelacionesTipoEstadoPedido) {
		this.jComboBoxTiposRelacionesTipoEstadoPedido = jComboBoxTiposRelacionesTipoEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEstadoPedido(
			JComboBox jComboBoxTiposAccionesTipoEstadoPedido) {
		this.jComboBoxTiposAccionesTipoEstadoPedido = jComboBoxTiposAccionesTipoEstadoPedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEstadoPedido() {
		return this.jComboBoxTiposAccionesFormularioTipoEstadoPedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEstadoPedido(
			JComboBox jComboBoxTiposAccionesFormularioTipoEstadoPedido) {
		this.jComboBoxTiposAccionesFormularioTipoEstadoPedido = jComboBoxTiposAccionesFormularioTipoEstadoPedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
		
		this.tipoestadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoestadopedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEstadoPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Estado Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEstadoPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEstadoPedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEstadoPedido=new JButtonMe();
				this.jButtonModificarToolBarTipoEstadoPedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEstadoPedido,this.jTtoolBarDetalleTipoEstadoPedido,
							"actualizar","actualizar","Actualizar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEstadoPedido,this.jTtoolBarDetalleTipoEstadoPedido,
							"eliminar","eliminar","Eliminar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEstadoPedido,this.jTtoolBarDetalleTipoEstadoPedido,
							"cancelar","cancelar","Cancelar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEstadoPedido,this.jTtoolBarDetalleTipoEstadoPedido,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEstadoPedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEstadoPedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEstadoPedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEstadoPedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEstadoPedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEstadoPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEstadoPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEstadoPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEstadoPedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEstadoPedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEstadoPedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEstadoPedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEstadoPedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEstadoPedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEstadoPedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEstadoPedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEstadoPedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEstadoPedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEstadoPedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEstadoPedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEstadoPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEstadoPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEstadoPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEstadoPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEstadoPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEstadoPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEstadoPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEstadoPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEstadoPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEstadoPedido.add(this.jMenuItemDetalleCerrarTipoEstadoPedido);
		
		this.jmenuDetalleAccionesTipoEstadoPedido.add(this.jMenuItemActualizarTipoEstadoPedido);
		this.jmenuDetalleAccionesTipoEstadoPedido.add(this.jMenuItemEliminarTipoEstadoPedido);
		this.jmenuDetalleAccionesTipoEstadoPedido.add(this.jMenuItemCancelarTipoEstadoPedido);		
		
		//this.jmenuDetalleDatosTipoEstadoPedido.add(this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido);				
		this.jmenuDetalleDatosTipoEstadoPedido.add(this.jMenuItemDetalleMostarOcultarTipoEstadoPedido);				
				
		//this.jmenuDetalleAccionesTipoEstadoPedido.add(this.jMenuItemGuardarCambiosTipoEstadoPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEstadoPedido.add(this.jmenuDetalleArchivoTipoEstadoPedido);		
		this.jmenuBarDetalleTipoEstadoPedido.add(this.jmenuDetalleAccionesTipoEstadoPedido);		
		this.jmenuBarDetalleTipoEstadoPedido.add(this.jmenuDetalleDatosTipoEstadoPedido);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEstadoPedido);				
	}
	
	
	public void inicializarElementosCamposTipoEstadoPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEstadoPedido = new JLabelMe();
		jLabelIdTipoEstadoPedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEstadoPedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEstadoPedido.setToolTipText(TipoEstadoPedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEstadoPedido= new GridBagLayout();

		this.jPanelidTipoEstadoPedido.setLayout(this.gridaBagLayoutTipoEstadoPedido);

		jTextFieldidTipoEstadoPedido = new JTextFieldMe();
		jTextFieldidTipoEstadoPedido.setText("Id");

		jTextFieldidTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoEstadoPedido = new JLabelMe();
		this.jLabelnombreTipoEstadoPedido.setText(""+TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEstadoPedido.setToolTipText("Nombre");
		this.jLabelnombreTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEstadoPedido.setToolTipText(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEstadoPedido = new GridBagLayout();
		this.jPanelnombreTipoEstadoPedido.setLayout(this.gridaBagLayoutTipoEstadoPedido);


		jTextAreanombreTipoEstadoPedido= new JTextAreaMe();
		jTextAreanombreTipoEstadoPedido.setEnabled(false);
		jTextAreanombreTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstadoPedido.setLineWrap(true);
		jTextAreanombreTipoEstadoPedido.setWrapStyleWord(true);
		jTextAreanombreTipoEstadoPedido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEstadoPedido.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEstadoPedido = new JScrollPane(jTextAreanombreTipoEstadoPedido);
		jscrollPanenombreTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEstadoPedidoBusqueda= new JButtonMe();
		this.jButtonnombreTipoEstadoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEstadoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEstadoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEstadoPedidoBusqueda.setText("U");
		this.jButtonnombreTipoEstadoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEstadoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEstadoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEstadoPedidoBusqueda"));

		if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEstadoPedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEstadoPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoEstadoPedido = new JLabelMe();
		this.jLabelid_paisTipoEstadoPedido.setText(""+TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoEstadoPedido.setToolTipText("Pais");
		this.jLabelid_paisTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoEstadoPedido.setToolTipText(TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoEstadoPedido = new GridBagLayout();
		this.jPanelid_paisTipoEstadoPedido.setLayout(this.gridaBagLayoutTipoEstadoPedido);


		jComboBoxid_paisTipoEstadoPedido= new JComboBoxMe();
		jComboBoxid_paisTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoEstadoPedido= new JButtonMe();
		this.jButtonid_paisTipoEstadoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoEstadoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoEstadoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoEstadoPedido.setText("Buscar");
		this.jButtonid_paisTipoEstadoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoEstadoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoEstadoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoEstadoPedido"));

		this.jButtonid_paisTipoEstadoPedidoBusqueda= new JButtonMe();
		this.jButtonid_paisTipoEstadoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoEstadoPedidoBusqueda.setText("U");
		this.jButtonid_paisTipoEstadoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoEstadoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoEstadoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoEstadoPedidoBusqueda"));

		if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoEstadoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoEstadoPedidoUpdate= new JButtonMe();
		this.jButtonid_paisTipoEstadoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoEstadoPedidoUpdate.setText("U");
		this.jButtonid_paisTipoEstadoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoEstadoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoEstadoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoEstadoPedidoUpdate"));



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
		//this.jInternalFrameDetalleTipoEstadoPedido = new TipoEstadoPedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Estado Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEstadoPedido= new GridBagLayout();
		

		
		String sToolTipTipoEstadoPedido="";
		sToolTipTipoEstadoPedido=TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEstadoPedido+="(Facturacion.TipoEstadoPedido)";
		}
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEstadoPedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEstadoPedido = new JButtonMe();
		this.jButtonModificarTipoEstadoPedido = new JButtonMe();
        this.jButtonActualizarTipoEstadoPedido = new JButtonMe();
        this.jButtonEliminarTipoEstadoPedido = new JButtonMe();
        this.jButtonCancelarTipoEstadoPedido = new JButtonMe();
        this.jButtonGuardarCambiosTipoEstadoPedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEstadoPedido = new JButtonMe();
		this.jButtonCerrarTipoEstadoPedido = new JButtonMe();
		
		this.jScrollPanelDatosTipoEstadoPedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEstadoPedido = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEstadoPedido = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Estado Pedido";
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEstadoPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEstadoPedido.setName("jPanelCamposTipoEstadoPedido"); 

		this.jPanelCamposOcultosTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEstadoPedido.setName("jPanelCamposOcultosTipoEstadoPedido"); 

        this.jPanelAccionesTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEstadoPedido.setToolTipText("Acciones");
        this.jPanelAccionesTipoEstadoPedido.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEstadoPedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEstadoPedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEstadoPedido.setText("Nuevo");
		this.jButtonModificarTipoEstadoPedido.setText("Editar");
        this.jButtonActualizarTipoEstadoPedido.setText("Actualizar");
        this.jButtonEliminarTipoEstadoPedido.setText("Eliminar");
        this.jButtonCancelarTipoEstadoPedido.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEstadoPedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.setText("Guardar");
		this.jButtonCerrarTipoEstadoPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEstadoPedido,"nuevo_button","Nuevo",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEstadoPedido,"modificar_button","Editar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEstadoPedido,"actualizar_button","Actualizar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEstadoPedido,"eliminar_button","Eliminar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEstadoPedido,"cancelar_button","Cancelar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEstadoPedido,"guardarcambios_button","Guardar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEstadoPedido,"guardarcambiostabla_button","Guardar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEstadoPedido,"cerrar_button","Salir",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEstadoPedido.setToolTipText("Nuevo"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEstadoPedido.setToolTipText("Editar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEstadoPedido.setToolTipText("Actualizar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEstadoPedido.setToolTipText("Eliminar)"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEstadoPedido.setToolTipText("Cancelar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEstadoPedido.setToolTipText("Guardar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.setToolTipText("Guardar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEstadoPedido.setToolTipText("Salir"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEstadoPedido";
		inputMap = this.jButtonNuevoTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEstadoPedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEstadoPedido";
		inputMap = this.jButtonActualizarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEstadoPedido"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEstadoPedido";
		inputMap = this.jButtonEliminarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEstadoPedido"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEstadoPedido";
		inputMap = this.jButtonCancelarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEstadoPedido"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEstadoPedido";
		inputMap = this.jButtonCerrarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEstadoPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEstadoPedido";
		inputMap = this.jButtonGuardarCambiosTablaTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEstadoPedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEstadoPedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEstadoPedido.setToolTipText("Nuevo TipoEstadoPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEstadoPedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEstadoPedido.setToolTipText("Sin Cerrar Ventana TipoEstadoPedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEstadoPedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEstadoPedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEstadoPedido.setText("Accion");
		this.jComboBoxTiposAccionesTipoEstadoPedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEstadoPedido = new JLabelMe();
		
		this.jLabelAccionesTipoEstadoPedido.setText("Acciones");		
		this.jLabelAccionesTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEstadoPedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEstadoPedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEstadoPedido=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEstadoPedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEstadoPedido = new GridBagLayout();
		
		this.jPanelCamposTipoEstadoPedido.setLayout(gridaBagLayoutCamposTipoEstadoPedido);
		this.jPanelCamposOcultosTipoEstadoPedido.setLayout(gridaBagLayoutCamposOcultosTipoEstadoPedido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
	this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEstadoPedido.add(jLabelIdTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);



	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
	this.gridBagConstraintsTipoEstadoPedido.gridx = 1;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEstadoPedido.add(jTextFieldidTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);


	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
	this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoEstadoPedido.add(jLabelid_paisTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
		this.gridBagConstraintsTipoEstadoPedido.gridx = 2;
		this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
		this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoEstadoPedido.add(jButtonid_paisTipoEstadoPedidoBusqueda, this.gridBagConstraintsTipoEstadoPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
		this.gridBagConstraintsTipoEstadoPedido.gridx = 3;
		this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
		this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoEstadoPedido.add(jButtonid_paisTipoEstadoPedidoUpdate, this.gridBagConstraintsTipoEstadoPedido);
	}

	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
	this.gridBagConstraintsTipoEstadoPedido.gridx = 1;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoEstadoPedido.add(jComboBoxid_paisTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);


	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
	this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEstadoPedido.add(jLabelnombreTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
		this.gridBagConstraintsTipoEstadoPedido.gridx = 2;
		this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
		this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEstadoPedido.add(jButtonnombreTipoEstadoPedidoBusqueda, this.gridBagConstraintsTipoEstadoPedido);
	}

	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
	this.gridBagConstraintsTipoEstadoPedido.gridx = 1;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEstadoPedido.add(jscrollPanenombreTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstadoPedido.gridy = iYPanelCamposTipoEstadoPedido;
	this.gridBagConstraintsTipoEstadoPedido.gridx = iXPanelCamposTipoEstadoPedido++;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstadoPedido.add(this.jPanelidTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);



	if(iXPanelCamposTipoEstadoPedido % 1==0) {
		iXPanelCamposTipoEstadoPedido=0;
		iYPanelCamposTipoEstadoPedido++;
	}
	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstadoPedido.gridy = iYPanelCamposTipoEstadoPedido;
	this.gridBagConstraintsTipoEstadoPedido.gridx = iXPanelCamposTipoEstadoPedido++;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstadoPedido.add(this.jPanelid_paisTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);



	if(iXPanelCamposTipoEstadoPedido % 1==0) {
		iXPanelCamposTipoEstadoPedido=0;
		iYPanelCamposTipoEstadoPedido++;
	}
	this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstadoPedido.gridy = iYPanelCamposTipoEstadoPedido;
	this.gridBagConstraintsTipoEstadoPedido.gridx = iXPanelCamposTipoEstadoPedido++;
	this.gridBagConstraintsTipoEstadoPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstadoPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstadoPedido.add(this.jPanelnombreTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);



	if(iXPanelCamposTipoEstadoPedido % 1==0) {
		iXPanelCamposTipoEstadoPedido=0;
		iYPanelCamposTipoEstadoPedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEstadoPedido= new GridBagLayout();
		this.jPanelAccionesTipoEstadoPedido.setLayout(gridaBagLayoutAccionesTipoEstadoPedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEstadoPedido= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEstadoPedido.setLayout(gridaBagLayoutAccionesFormularioTipoEstadoPedido);
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEstadoPedido.add(this.jComboBoxTiposAccionesFormularioTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);

		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEstadoPedido.add(this.jCheckBoxPostAccionNuevoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEstadoPedido.add(this.jCheckBoxPostAccionSinCerrarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEstadoPedido.add(this.jCheckBoxPostAccionSinMensajeTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEstadoPedido.add(this.jButtonModificarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);							

		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
		this.gridBagConstraintsTipoEstadoPedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEstadoPedido.add(this.jButtonEliminarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
			
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEstadoPedido.add(this.jButtonActualizarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);


		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEstadoPedido.add(this.jButtonGuardarCambiosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);	
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;		
		this.gridBagConstraintsTipoEstadoPedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEstadoPedido.add(this.jButtonCancelarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEstadoPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEstadoPedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();						
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;		
			//this.gridBagConstraintsTipoEstadoPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEstadoPedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEstadoPedido.gridx =0;
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEstadoPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEstadoPedido = new TipoEstadoPedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Estado Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Estado Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Estado Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEstadoPedidoModel tipoestadopedidoModel=new TipoEstadoPedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEstadoPedidoModel.TipoEstadoPedidoFocusTraversalPolicy tipoestadopedidoFocusTraversalPolicy = tipoestadopedidoModel.new TipoEstadoPedidoFocusTraversalPolicy(this);
			
			//tipoestadopedidoFocusTraversalPolicy.settipoestadopedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoestadopedidoModel);
			
			
			this.jContentPaneDetalleTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEstadoPedido = new GridBagLayout();	
			this.jContentPaneDetalleTipoEstadoPedido.setLayout(gridaBagLayoutDetalleTipoEstadoPedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEstadoPedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEstadoPedido.add(jTtoolBarDetalleTipoEstadoPedido, gridBagConstraintsTipoEstadoPedido);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEstadoPedido=   new JScrollPane(jContentPaneDetalleTipoEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEstadoPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
	        
			this.jContentPaneDetalleTipoEstadoPedido.add(jPanelCamposTipoEstadoPedido, gridBagConstraintsTipoEstadoPedido);
			
			
			
			
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
						&& tipoestadopedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEstadoPedido= new GridBagConstraints();
						this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
						this.jContentPaneDetalleTipoEstadoPedido.add(this.jTabbedPaneRelacionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEstadoPedido.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEstadoPedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
					this.gridBagConstraintsTipoEstadoPedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEstadoPedido.add(jPanelCamposOcultosTipoEstadoPedido, gridBagConstraintsTipoEstadoPedido);
				
					this.jPanelCamposOcultosTipoEstadoPedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
	        this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEstadoPedido.add(this.jPanelAccionesFormularioTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);							
			
			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
	        this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEstadoPedido.add(this.jPanelAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEstadoPedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEstadoPedido=   new JScrollPane(this.jPanelCamposTipoEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEstadoPedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
			
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
			
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEstadoPedido;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEstadoPedido;
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
