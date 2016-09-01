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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.EstadoPedidoCompraConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class EstadoPedidoCompraDetalleFormJInternalFrame extends EstadoPedidoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPedidoCompra;
	
	protected JMenuBar jmenuBarDetalleEstadoPedidoCompra;
	
	protected JMenu jmenuDetalleEstadoPedidoCompra;
	protected JMenu jmenuDetalleArchivoEstadoPedidoCompra;
	protected JMenu jmenuDetalleAccionesEstadoPedidoCompra;
	protected JMenu jmenuDetalleDatosEstadoPedidoCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPedidoCompra;	
	protected GridBagConstraints gridBagConstraintsEstadoPedidoCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPedidoCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPedidoCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPedidoCompraSessionBean estadopedidocompraSessionBean;
	
	
	
		
	
	public EstadoPedidoCompraLogic estadopedidocompraLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPedidoCompra;
	public JScrollPane jScrollPanelDatosEdicionEstadoPedidoCompra;
	public JScrollPane jScrollPanelDatosGeneralEstadoPedidoCompra;
	
	protected JPanel jPanelCamposEstadoPedidoCompra;    
	protected JPanel jPanelCamposOcultosEstadoPedidoCompra;    	
	protected JPanel jPanelAccionesEstadoPedidoCompra;
	protected JPanel jPanelAccionesFormularioEstadoPedidoCompra;
    
	
	
	protected Integer iXPanelCamposEstadoPedidoCompra=0;
	protected Integer iYPanelCamposEstadoPedidoCompra=0;
	
	protected Integer iXPanelCamposOcultosEstadoPedidoCompra=0;
	protected Integer iYPanelCamposOcultosEstadoPedidoCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPedidoCompra;
	public JButton jButtonModificarEstadoPedidoCompra;
	public JButton jButtonActualizarEstadoPedidoCompra;
    public JButton jButtonEliminarEstadoPedidoCompra;
	public JButton jButtonCancelarEstadoPedidoCompra;
    public JButton jButtonGuardarCambiosEstadoPedidoCompra;
	public JButton jButtonGuardarCambiosTablaEstadoPedidoCompra;
	protected JButton jButtonCerrarEstadoPedidoCompra;
	
	
	protected JButton jButtonProcesarInformacionEstadoPedidoCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPedidoCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPedidoCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPedidoCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPedidoCompra;
	protected JButton jButtonModificarToolBarEstadoPedidoCompra;
	protected JButton jButtonActualizarToolBarEstadoPedidoCompra;
    protected JButton jButtonEliminarToolBarEstadoPedidoCompra;
	protected JButton jButtonCancelarToolBarEstadoPedidoCompra;
    protected JButton jButtonGuardarCambiosToolBarEstadoPedidoCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPedidoCompra;
	protected JButton jButtonCerrarToolBarEstadoPedidoCompra;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPedidoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPedidoCompra;
	protected JMenuItem jMenuItemModificarEstadoPedidoCompra;
	protected JMenuItem jMenuItemActualizarEstadoPedidoCompra;
    protected JMenuItem jMenuItemEliminarEstadoPedidoCompra;
	protected JMenuItem jMenuItemCancelarEstadoPedidoCompra;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPedidoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPedidoCompra;
	protected JMenuItem jMenuItemCerrarEstadoPedidoCompra;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPedidoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPedidoCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPedidoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPedidoCompra;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPedidoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPedidoCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPedidoCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPedidoCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPedidoCompra;
	public JLabel jLabelIdEstadoPedidoCompra;
	public JTextFieldMe jTextFieldidEstadoPedidoCompra;
	public JButton jButtonidEstadoPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoPedidoCompra;
	public JLabel jLabelcodigoEstadoPedidoCompra;
	public JTextField jTextFieldcodigoEstadoPedidoCompra;
	public JButton jButtoncodigoEstadoPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPedidoCompra;
	public JLabel jLabelnombreEstadoPedidoCompra;
	public JTextArea jTextAreanombreEstadoPedidoCompra;
	public JScrollPane jscrollPanenombreEstadoPedidoCompra;
	public JButton jButtonnombreEstadoPedidoCompraBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPedidoCompra;
	
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
	
	public EstadoPedidoCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPedidoCompra=new JPanel();
				this.jPanelAccionesFormularioEstadoPedidoCompra=new JPanel();
				this.jmenuBarDetalleEstadoPedidoCompra=new JMenuBar();
				this.jTtoolBarDetalleEstadoPedidoCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPedidoCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPedidoCompra() {
		return this.jButtonActualizarToolBarEstadoPedidoCompra;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPedidoCompra() {
		return this.jButtonEliminarToolBarEstadoPedidoCompra;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPedidoCompra() {
		return this.jButtonCancelarToolBarEstadoPedidoCompra;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPedidoCompra() {
		return this.jButtonProcesarInformacionEstadoPedidoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPedidoCompra)	{
		this.jButtonProcesarInformacionEstadoPedidoCompra = jButtonProcesarInformacionEstadoPedidoCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPedidoCompra() {
		return this.jComboBoxTiposAccionesEstadoPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPedidoCompra(
			JComboBox jComboBoxTiposRelacionesEstadoPedidoCompra) {
		this.jComboBoxTiposRelacionesEstadoPedidoCompra = jComboBoxTiposRelacionesEstadoPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPedidoCompra(
			JComboBox jComboBoxTiposAccionesEstadoPedidoCompra) {
		this.jComboBoxTiposAccionesEstadoPedidoCompra = jComboBoxTiposAccionesEstadoPedidoCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPedidoCompra() {
		return this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPedidoCompra(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPedidoCompra) {
		this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra = jComboBoxTiposAccionesFormularioEstadoPedidoCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
		
		this.estadopedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopedidocompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPedidoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPedidoCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPedidoCompra=new JButtonMe();
				this.jButtonModificarToolBarEstadoPedidoCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPedidoCompra,this.jTtoolBarDetalleEstadoPedidoCompra,
							"actualizar","actualizar","Actualizar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPedidoCompra,this.jTtoolBarDetalleEstadoPedidoCompra,
							"eliminar","eliminar","Eliminar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPedidoCompra,this.jTtoolBarDetalleEstadoPedidoCompra,
							"cancelar","cancelar","Cancelar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPedidoCompra,this.jTtoolBarDetalleEstadoPedidoCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPedidoCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPedidoCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPedidoCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPedidoCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPedidoCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPedidoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPedidoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPedidoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPedidoCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPedidoCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPedidoCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPedidoCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPedidoCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPedidoCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPedidoCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPedidoCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPedidoCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPedidoCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPedidoCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPedidoCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPedidoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPedidoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPedidoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPedidoCompra.add(this.jMenuItemDetalleCerrarEstadoPedidoCompra);
		
		this.jmenuDetalleAccionesEstadoPedidoCompra.add(this.jMenuItemActualizarEstadoPedidoCompra);
		this.jmenuDetalleAccionesEstadoPedidoCompra.add(this.jMenuItemEliminarEstadoPedidoCompra);
		this.jmenuDetalleAccionesEstadoPedidoCompra.add(this.jMenuItemCancelarEstadoPedidoCompra);		
		
		//this.jmenuDetalleDatosEstadoPedidoCompra.add(this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra);				
		this.jmenuDetalleDatosEstadoPedidoCompra.add(this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra);				
				
		//this.jmenuDetalleAccionesEstadoPedidoCompra.add(this.jMenuItemGuardarCambiosEstadoPedidoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPedidoCompra.add(this.jmenuDetalleArchivoEstadoPedidoCompra);		
		this.jmenuBarDetalleEstadoPedidoCompra.add(this.jmenuDetalleAccionesEstadoPedidoCompra);		
		this.jmenuBarDetalleEstadoPedidoCompra.add(this.jmenuDetalleDatosEstadoPedidoCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPedidoCompra);				
	}
	
	
	public void inicializarElementosCamposEstadoPedidoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPedidoCompra = new JLabelMe();
		jLabelIdEstadoPedidoCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPedidoCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPedidoCompra.setToolTipText(EstadoPedidoCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPedidoCompra= new GridBagLayout();

		this.jPanelidEstadoPedidoCompra.setLayout(this.gridaBagLayoutEstadoPedidoCompra);

		jTextFieldidEstadoPedidoCompra = new JTextFieldMe();
		jTextFieldidEstadoPedidoCompra.setText("Id");

		jTextFieldidEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoPedidoCompra = new JLabelMe();
		this.jLabelcodigoEstadoPedidoCompra.setText(""+EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoPedidoCompra.setToolTipText("Codigo");
		this.jLabelcodigoEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoPedidoCompra.setToolTipText(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoPedidoCompra = new GridBagLayout();
		this.jPanelcodigoEstadoPedidoCompra.setLayout(this.gridaBagLayoutEstadoPedidoCompra);


		jTextFieldcodigoEstadoPedidoCompra= new JTextFieldMe();

		jTextFieldcodigoEstadoPedidoCompra.setEnabled(false);
		jTextFieldcodigoEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoPedidoCompraBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoPedidoCompraBusqueda.setText("U");
		this.jButtoncodigoEstadoPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoPedidoCompraBusqueda"));

		if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoPedidoCompra = new JLabelMe();
		this.jLabelnombreEstadoPedidoCompra.setText(""+EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPedidoCompra.setToolTipText("Nombre");
		this.jLabelnombreEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPedidoCompra.setToolTipText(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPedidoCompra = new GridBagLayout();
		this.jPanelnombreEstadoPedidoCompra.setLayout(this.gridaBagLayoutEstadoPedidoCompra);


		jTextAreanombreEstadoPedidoCompra= new JTextAreaMe();
		jTextAreanombreEstadoPedidoCompra.setEnabled(false);
		jTextAreanombreEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedidoCompra.setLineWrap(true);
		jTextAreanombreEstadoPedidoCompra.setWrapStyleWord(true);
		jTextAreanombreEstadoPedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoPedidoCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoPedidoCompra = new JScrollPane(jTextAreanombreEstadoPedidoCompra);
		jscrollPanenombreEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoPedidoCompraBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPedidoCompraBusqueda.setText("U");
		this.jButtonnombreEstadoPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPedidoCompraBusqueda"));

		if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPedidoCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPedidoCompra() {
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
		//this.jInternalFrameDetalleEstadoPedidoCompra = new EstadoPedidoCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Pedido Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPedidoCompra= new GridBagLayout();
		

		
		String sToolTipEstadoPedidoCompra="";
		sToolTipEstadoPedidoCompra=EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPedidoCompra+="(Importaciones.EstadoPedidoCompra)";
		}
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPedidoCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPedidoCompra = new JButtonMe();
		this.jButtonModificarEstadoPedidoCompra = new JButtonMe();
        this.jButtonActualizarEstadoPedidoCompra = new JButtonMe();
        this.jButtonEliminarEstadoPedidoCompra = new JButtonMe();
        this.jButtonCancelarEstadoPedidoCompra = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPedidoCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra = new JButtonMe();
		this.jButtonCerrarEstadoPedidoCompra = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPedidoCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPedidoCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPedidoCompra = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pedido Compra";
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPedidoCompra.setName("jPanelCamposEstadoPedidoCompra"); 

		this.jPanelCamposOcultosEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPedidoCompra.setName("jPanelCamposOcultosEstadoPedidoCompra"); 

        this.jPanelAccionesEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPedidoCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPedidoCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPedidoCompra.setText("Nuevo");
		this.jButtonModificarEstadoPedidoCompra.setText("Editar");
        this.jButtonActualizarEstadoPedidoCompra.setText("Actualizar");
        this.jButtonEliminarEstadoPedidoCompra.setText("Eliminar");
        this.jButtonCancelarEstadoPedidoCompra.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPedidoCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.setText("Guardar");
		this.jButtonCerrarEstadoPedidoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPedidoCompra,"nuevo_button","Nuevo",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPedidoCompra,"modificar_button","Editar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPedidoCompra,"actualizar_button","Actualizar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPedidoCompra,"eliminar_button","Eliminar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPedidoCompra,"cancelar_button","Cancelar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPedidoCompra,"guardarcambios_button","Guardar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPedidoCompra,"guardarcambiostabla_button","Guardar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPedidoCompra,"cerrar_button","Salir",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPedidoCompra.setToolTipText("Nuevo"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPedidoCompra.setToolTipText("Editar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPedidoCompra.setToolTipText("Actualizar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPedidoCompra.setToolTipText("Eliminar)"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPedidoCompra.setToolTipText("Cancelar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPedidoCompra.setToolTipText("Guardar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.setToolTipText("Guardar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPedidoCompra.setToolTipText("Salir"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPedidoCompra";
		inputMap = this.jButtonNuevoEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPedidoCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPedidoCompra";
		inputMap = this.jButtonActualizarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPedidoCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPedidoCompra";
		inputMap = this.jButtonEliminarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPedidoCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPedidoCompra";
		inputMap = this.jButtonCancelarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPedidoCompra"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPedidoCompra";
		inputMap = this.jButtonCerrarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPedidoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPedidoCompra";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPedidoCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPedidoCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPedidoCompra.setToolTipText("Nuevo EstadoPedidoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra.setToolTipText("Sin Cerrar Ventana EstadoPedidoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPedidoCompra.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPedidoCompra = new JLabelMe();
		
		this.jLabelAccionesEstadoPedidoCompra.setText("Acciones");		
		this.jLabelAccionesEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPedidoCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPedidoCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPedidoCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPedidoCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPedidoCompra = new GridBagLayout();
		
		this.jPanelCamposEstadoPedidoCompra.setLayout(gridaBagLayoutCamposEstadoPedidoCompra);
		this.jPanelCamposOcultosEstadoPedidoCompra.setLayout(gridaBagLayoutCamposOcultosEstadoPedidoCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPedidoCompra.add(jLabelIdEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);



	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = 1;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPedidoCompra.add(jTextFieldidEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);


	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoPedidoCompra.add(jLabelcodigoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 2;
		this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
		this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoPedidoCompra.add(jButtoncodigoEstadoPedidoCompraBusqueda, this.gridBagConstraintsEstadoPedidoCompra);
	}

	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = 1;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoPedidoCompra.add(jTextFieldcodigoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);


	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPedidoCompra.add(jLabelnombreEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 2;
		this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
		this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPedidoCompra.add(jButtonnombreEstadoPedidoCompraBusqueda, this.gridBagConstraintsEstadoPedidoCompra);
	}

	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = 1;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPedidoCompra.add(jscrollPanenombreEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = iYPanelCamposEstadoPedidoCompra;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = iXPanelCamposEstadoPedidoCompra++;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedidoCompra.add(this.jPanelidEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);



	if(iXPanelCamposEstadoPedidoCompra % 1==0) {
		iXPanelCamposEstadoPedidoCompra=0;
		iYPanelCamposEstadoPedidoCompra++;
	}
	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = iYPanelCamposEstadoPedidoCompra;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = iXPanelCamposEstadoPedidoCompra++;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedidoCompra.add(this.jPanelcodigoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);



	if(iXPanelCamposEstadoPedidoCompra % 1==0) {
		iXPanelCamposEstadoPedidoCompra=0;
		iYPanelCamposEstadoPedidoCompra++;
	}
	this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedidoCompra.gridy = iYPanelCamposEstadoPedidoCompra;
	this.gridBagConstraintsEstadoPedidoCompra.gridx = iXPanelCamposEstadoPedidoCompra++;
	this.gridBagConstraintsEstadoPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedidoCompra.add(this.jPanelnombreEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);



	if(iXPanelCamposEstadoPedidoCompra % 1==0) {
		iXPanelCamposEstadoPedidoCompra=0;
		iYPanelCamposEstadoPedidoCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPedidoCompra= new GridBagLayout();
		this.jPanelAccionesEstadoPedidoCompra.setLayout(gridaBagLayoutAccionesEstadoPedidoCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPedidoCompra= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPedidoCompra.setLayout(gridaBagLayoutAccionesFormularioEstadoPedidoCompra);
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPedidoCompra.add(this.jComboBoxTiposAccionesFormularioEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);

		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPedidoCompra.add(this.jCheckBoxPostAccionNuevoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPedidoCompra.add(this.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPedidoCompra.add(this.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPedidoCompra.add(this.jButtonModificarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);							

		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
		this.gridBagConstraintsEstadoPedidoCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPedidoCompra.add(this.jButtonEliminarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
			
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPedidoCompra.add(this.jButtonActualizarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);


		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPedidoCompra.add(this.jButtonGuardarCambiosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);	
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPedidoCompra.add(this.jButtonCancelarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPedidoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPedidoCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;		
			//this.gridBagConstraintsEstadoPedidoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPedidoCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedidoCompra.gridx =0;
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPedidoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPedidoCompra = new EstadoPedidoCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Pedido Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Pedido Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Pedido Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoPedidoCompraModel estadopedidocompraModel=new EstadoPedidoCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPedidoCompraModel.EstadoPedidoCompraFocusTraversalPolicy estadopedidocompraFocusTraversalPolicy = estadopedidocompraModel.new EstadoPedidoCompraFocusTraversalPolicy(this);
			
			//estadopedidocompraFocusTraversalPolicy.setestadopedidocompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadopedidocompraModel);
			
			
			this.jContentPaneDetalleEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPedidoCompra = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPedidoCompra.setLayout(gridaBagLayoutDetalleEstadoPedidoCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPedidoCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPedidoCompra.add(jTtoolBarDetalleEstadoPedidoCompra, gridBagConstraintsEstadoPedidoCompra);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPedidoCompra=   new JScrollPane(jContentPaneDetalleEstadoPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPedidoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPedidoCompra.add(jPanelCamposEstadoPedidoCompra, gridBagConstraintsEstadoPedidoCompra);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& estadopedidocompraSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPedidoCompra= new GridBagConstraints();
						this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
						this.jContentPaneDetalleEstadoPedidoCompra.add(this.jTabbedPaneRelacionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPedidoCompra.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPedidoCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
					this.gridBagConstraintsEstadoPedidoCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPedidoCompra.add(jPanelCamposOcultosEstadoPedidoCompra, gridBagConstraintsEstadoPedidoCompra);
				
					this.jPanelCamposOcultosEstadoPedidoCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
	        this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPedidoCompra.add(this.jPanelAccionesFormularioEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);							
			
			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPedidoCompra.add(this.jPanelAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPedidoCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPedidoCompra=   new JScrollPane(this.jPanelCamposEstadoPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPedidoCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
			
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
			
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPedidoCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPedidoCompra;
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
