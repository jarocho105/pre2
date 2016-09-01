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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.inventario.util.EstadoDetalleOrdenCompraConstantesFunciones;

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
public class EstadoDetalleOrdenCompraDetalleFormJInternalFrame extends EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetalleOrdenCompra;
	
	protected JMenuBar jmenuBarDetalleEstadoDetalleOrdenCompra;
	
	protected JMenu jmenuDetalleEstadoDetalleOrdenCompra;
	protected JMenu jmenuDetalleArchivoEstadoDetalleOrdenCompra;
	protected JMenu jmenuDetalleAccionesEstadoDetalleOrdenCompra;
	protected JMenu jmenuDetalleDatosEstadoDetalleOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleOrdenCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetalleOrdenCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean;
	
	

	public DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=null;
	public DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleOrdenCompra=false;
	public DetalleOrdenCompraSessionBean detalleordencompraSessionBean;
	
		
	
	public EstadoDetalleOrdenCompraLogic estadodetalleordencompraLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleOrdenCompra;
	
	protected JPanel jPanelCamposEstadoDetalleOrdenCompra;    
	protected JPanel jPanelCamposOcultosEstadoDetalleOrdenCompra;    	
	protected JPanel jPanelAccionesEstadoDetalleOrdenCompra;
	protected JPanel jPanelAccionesFormularioEstadoDetalleOrdenCompra;
    
	
	
	protected Integer iXPanelCamposEstadoDetalleOrdenCompra=0;
	protected Integer iYPanelCamposEstadoDetalleOrdenCompra=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetalleOrdenCompra=0;
	protected Integer iYPanelCamposOcultosEstadoDetalleOrdenCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetalleOrdenCompra;
	public JButton jButtonModificarEstadoDetalleOrdenCompra;
	public JButton jButtonActualizarEstadoDetalleOrdenCompra;
    public JButton jButtonEliminarEstadoDetalleOrdenCompra;
	public JButton jButtonCancelarEstadoDetalleOrdenCompra;
    public JButton jButtonGuardarCambiosEstadoDetalleOrdenCompra;
	public JButton jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra;
	protected JButton jButtonCerrarEstadoDetalleOrdenCompra;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetalleOrdenCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonModificarToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonActualizarToolBarEstadoDetalleOrdenCompra;
    protected JButton jButtonEliminarToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonCancelarToolBarEstadoDetalleOrdenCompra;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonCerrarToolBarEstadoDetalleOrdenCompra;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemModificarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemActualizarEstadoDetalleOrdenCompra;
    protected JMenuItem jMenuItemEliminarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemCancelarEstadoDetalleOrdenCompra;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemCerrarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleOrdenCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleOrdenCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleOrdenCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetalleOrdenCompra;
	public JLabel jLabelIdEstadoDetalleOrdenCompra;
	public JTextFieldMe jTextFieldidEstadoDetalleOrdenCompra;
	public JButton jButtonidEstadoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetalleOrdenCompra;
	public JLabel jLabelcodigoEstadoDetalleOrdenCompra;
	public JTextField jTextFieldcodigoEstadoDetalleOrdenCompra;
	public JButton jButtoncodigoEstadoDetalleOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetalleOrdenCompra;
	public JLabel jLabelnombreEstadoDetalleOrdenCompra;
	public JTextArea jTextAreanombreEstadoDetalleOrdenCompra;
	public JScrollPane jscrollPanenombreEstadoDetalleOrdenCompra;
	public JButton jButtonnombreEstadoDetalleOrdenCompraBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetalleOrdenCompra;
	
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
	
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetalleOrdenCompra=new JPanel();
				this.jPanelAccionesFormularioEstadoDetalleOrdenCompra=new JPanel();
				this.jmenuBarDetalleEstadoDetalleOrdenCompra=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetalleOrdenCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetalleOrdenCompra() {
		return this.jButtonActualizarToolBarEstadoDetalleOrdenCompra;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetalleOrdenCompra() {
		return this.jButtonEliminarToolBarEstadoDetalleOrdenCompra;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetalleOrdenCompra() {
		return this.jButtonCancelarToolBarEstadoDetalleOrdenCompra;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetalleOrdenCompra() {
		return this.jButtonProcesarInformacionEstadoDetalleOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleOrdenCompra)	{
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra = jButtonProcesarInformacionEstadoDetalleOrdenCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra = jComboBoxTiposRelacionesEstadoDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposAccionesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra = jComboBoxTiposAccionesEstadoDetalleOrdenCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra = jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
		
		this.estadodetalleordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetalleOrdenCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetalleOrdenCompra=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetalleOrdenCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetalleOrdenCompra,this.jTtoolBarDetalleEstadoDetalleOrdenCompra,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetalleOrdenCompra,this.jTtoolBarDetalleEstadoDetalleOrdenCompra,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetalleOrdenCompra,this.jTtoolBarDetalleEstadoDetalleOrdenCompra,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra,this.jTtoolBarDetalleEstadoDetalleOrdenCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetalleOrdenCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetalleOrdenCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetalleOrdenCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetalleOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetalleOrdenCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetalleOrdenCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetalleOrdenCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetalleOrdenCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetalleOrdenCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetalleOrdenCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetalleOrdenCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetalleOrdenCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetalleOrdenCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetalleOrdenCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetalleOrdenCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetalleOrdenCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetalleOrdenCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetalleOrdenCompra.add(this.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra);
		
		this.jmenuDetalleAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemActualizarEstadoDetalleOrdenCompra);
		this.jmenuDetalleAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemEliminarEstadoDetalleOrdenCompra);
		this.jmenuDetalleAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemCancelarEstadoDetalleOrdenCompra);		
		
		//this.jmenuDetalleDatosEstadoDetalleOrdenCompra.add(this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra);				
		this.jmenuDetalleDatosEstadoDetalleOrdenCompra.add(this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra);				
				
		//this.jmenuDetalleAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetalleOrdenCompra.add(this.jmenuDetalleArchivoEstadoDetalleOrdenCompra);		
		this.jmenuBarDetalleEstadoDetalleOrdenCompra.add(this.jmenuDetalleAccionesEstadoDetalleOrdenCompra);		
		this.jmenuBarDetalleEstadoDetalleOrdenCompra.add(this.jmenuDetalleDatosEstadoDetalleOrdenCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDetalleOrdenCompra.add(this.jmenuDetalleEstadoDetalleOrdenCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetalleOrdenCompra);				
	}
	
	
	public void inicializarElementosCamposEstadoDetalleOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetalleOrdenCompra = new JLabelMe();
		jLabelIdEstadoDetalleOrdenCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetalleOrdenCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetalleOrdenCompra.setToolTipText(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetalleOrdenCompra= new GridBagLayout();

		this.jPanelidEstadoDetalleOrdenCompra.setLayout(this.gridaBagLayoutEstadoDetalleOrdenCompra);

		jTextFieldidEstadoDetalleOrdenCompra = new JTextFieldMe();
		jTextFieldidEstadoDetalleOrdenCompra.setText("Id");

		jTextFieldidEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetalleOrdenCompra = new JLabelMe();
		this.jLabelcodigoEstadoDetalleOrdenCompra.setText(""+EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetalleOrdenCompra.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetalleOrdenCompra.setToolTipText(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetalleOrdenCompra = new GridBagLayout();
		this.jPanelcodigoEstadoDetalleOrdenCompra.setLayout(this.gridaBagLayoutEstadoDetalleOrdenCompra);


		jTextFieldcodigoEstadoDetalleOrdenCompra= new JTextFieldMe();

		jTextFieldcodigoEstadoDetalleOrdenCompra.setEnabled(false);
		jTextFieldcodigoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setText("U");
		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetalleOrdenCompraBusqueda"));

		if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetalleOrdenCompra = new JLabelMe();
		this.jLabelnombreEstadoDetalleOrdenCompra.setText(""+EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetalleOrdenCompra.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetalleOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetalleOrdenCompra.setToolTipText(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetalleOrdenCompra = new GridBagLayout();
		this.jPanelnombreEstadoDetalleOrdenCompra.setLayout(this.gridaBagLayoutEstadoDetalleOrdenCompra);


		jTextAreanombreEstadoDetalleOrdenCompra= new JTextAreaMe();
		jTextAreanombreEstadoDetalleOrdenCompra.setEnabled(false);
		jTextAreanombreEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleOrdenCompra.setLineWrap(true);
		jTextAreanombreEstadoDetalleOrdenCompra.setWrapStyleWord(true);
		jTextAreanombreEstadoDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDetalleOrdenCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDetalleOrdenCompra = new JScrollPane(jTextAreanombreEstadoDetalleOrdenCompra);
		jscrollPanenombreEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setText("U");
		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetalleOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetalleOrdenCompraBusqueda"));

		if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetalleOrdenCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetalleOrdenCompra() {
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
		//this.jInternalFrameDetalleEstadoDetalleOrdenCompra = new EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Orden Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleOrdenCompra= new GridBagLayout();
		

		
		String sToolTipEstadoDetalleOrdenCompra="";
		sToolTipEstadoDetalleOrdenCompra=EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleOrdenCompra+="(Inventario.EstadoDetalleOrdenCompra)";
		}
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleOrdenCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonModificarEstadoDetalleOrdenCompra = new JButtonMe();
        this.jButtonActualizarEstadoDetalleOrdenCompra = new JButtonMe();
        this.jButtonEliminarEstadoDetalleOrdenCompra = new JButtonMe();
        this.jButtonCancelarEstadoDetalleOrdenCompra = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarEstadoDetalleOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Orden Compra";
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetalleOrdenCompra.setName("jPanelCamposEstadoDetalleOrdenCompra"); 

		this.jPanelCamposOcultosEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetalleOrdenCompra.setName("jPanelCamposOcultosEstadoDetalleOrdenCompra"); 

        this.jPanelAccionesEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleOrdenCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetalleOrdenCompra.setText("Nuevo");
		this.jButtonModificarEstadoDetalleOrdenCompra.setText("Editar");
        this.jButtonActualizarEstadoDetalleOrdenCompra.setText("Actualizar");
        this.jButtonEliminarEstadoDetalleOrdenCompra.setText("Eliminar");
        this.jButtonCancelarEstadoDetalleOrdenCompra.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetalleOrdenCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.setText("Guardar");
		this.jButtonCerrarEstadoDetalleOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleOrdenCompra,"nuevo_button","Nuevo",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetalleOrdenCompra,"modificar_button","Editar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetalleOrdenCompra,"actualizar_button","Actualizar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetalleOrdenCompra,"eliminar_button","Eliminar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetalleOrdenCompra,"cancelar_button","Cancelar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetalleOrdenCompra,"guardarcambios_button","Guardar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra,"guardarcambiostabla_button","Guardar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleOrdenCompra,"cerrar_button","Salir",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetalleOrdenCompra.setToolTipText("Nuevo"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetalleOrdenCompra.setToolTipText("Editar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetalleOrdenCompra.setToolTipText("Actualizar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetalleOrdenCompra.setToolTipText("Eliminar)"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetalleOrdenCompra.setToolTipText("Cancelar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetalleOrdenCompra.setToolTipText("Guardar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.setToolTipText("Guardar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleOrdenCompra.setToolTipText("Salir"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleOrdenCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonActualizarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetalleOrdenCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonEliminarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetalleOrdenCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonCancelarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetalleOrdenCompra"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonCerrarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleOrdenCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra.setToolTipText("Nuevo EstadoDetalleOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra.setToolTipText("Sin Cerrar Ventana EstadoDetalleOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetalleOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleOrdenCompra.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetalleOrdenCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetalleOrdenCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetalleOrdenCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetalleOrdenCompra = new GridBagLayout();
		
		this.jPanelCamposEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutCamposEstadoDetalleOrdenCompra);
		this.jPanelCamposOcultosEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutCamposOcultosEstadoDetalleOrdenCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetalleOrdenCompra.add(jLabelIdEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);



	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetalleOrdenCompra.add(jTextFieldidEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);


	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetalleOrdenCompra.add(jLabelcodigoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetalleOrdenCompra.add(jButtoncodigoEstadoDetalleOrdenCompraBusqueda, this.gridBagConstraintsEstadoDetalleOrdenCompra);
	}

	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetalleOrdenCompra.add(jTextFieldcodigoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);


	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetalleOrdenCompra.add(jLabelnombreEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 2;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetalleOrdenCompra.add(jButtonnombreEstadoDetalleOrdenCompraBusqueda, this.gridBagConstraintsEstadoDetalleOrdenCompra);
	}

	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 1;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetalleOrdenCompra.add(jscrollPanenombreEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iYPanelCamposEstadoDetalleOrdenCompra;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iXPanelCamposEstadoDetalleOrdenCompra++;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleOrdenCompra.add(this.jPanelidEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);



	if(iXPanelCamposEstadoDetalleOrdenCompra % 1==0) {
		iXPanelCamposEstadoDetalleOrdenCompra=0;
		iYPanelCamposEstadoDetalleOrdenCompra++;
	}
	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iYPanelCamposEstadoDetalleOrdenCompra;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iXPanelCamposEstadoDetalleOrdenCompra++;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleOrdenCompra.add(this.jPanelcodigoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);



	if(iXPanelCamposEstadoDetalleOrdenCompra % 1==0) {
		iXPanelCamposEstadoDetalleOrdenCompra=0;
		iYPanelCamposEstadoDetalleOrdenCompra++;
	}
	this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iYPanelCamposEstadoDetalleOrdenCompra;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iXPanelCamposEstadoDetalleOrdenCompra++;
	this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleOrdenCompra.add(this.jPanelnombreEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);



	if(iXPanelCamposEstadoDetalleOrdenCompra % 1==0) {
		iXPanelCamposEstadoDetalleOrdenCompra=0;
		iYPanelCamposEstadoDetalleOrdenCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleOrdenCompra= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutAccionesEstadoDetalleOrdenCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetalleOrdenCompra= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutAccionesFormularioEstadoDetalleOrdenCompra);
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.add(this.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);

		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.add(this.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.add(this.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleOrdenCompra.add(this.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleOrdenCompra.add(this.jButtonModificarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);							

		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleOrdenCompra.add(this.jButtonEliminarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
			
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleOrdenCompra.add(this.jButtonActualizarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);


		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleOrdenCompra.add(this.jButtonGuardarCambiosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);	
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleOrdenCompra.add(this.jButtonCancelarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleOrdenCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetalleOrdenCompra = new EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Orden Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Orden Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Orden Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetalleOrdenCompraModel estadodetalleordencompraModel=new EstadoDetalleOrdenCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetalleOrdenCompraModel.EstadoDetalleOrdenCompraFocusTraversalPolicy estadodetalleordencompraFocusTraversalPolicy = estadodetalleordencompraModel.new EstadoDetalleOrdenCompraFocusTraversalPolicy(this);
			
			//estadodetalleordencompraFocusTraversalPolicy.setestadodetalleordencompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetalleordencompraModel);
			
			
			this.jContentPaneDetalleEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetalleOrdenCompra = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutDetalleEstadoDetalleOrdenCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleOrdenCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(jTtoolBarDetalleEstadoDetalleOrdenCompra, gridBagConstraintsEstadoDetalleOrdenCompra);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra=   new JScrollPane(jContentPaneDetalleEstadoDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(jPanelCamposEstadoDetalleOrdenCompra, gridBagConstraintsEstadoDetalleOrdenCompra);
			
			
			
			
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
						&& estadodetalleordencompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(this.puedeCargarPorParteDetalleOrdenCompra,false,-1);
					
					if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetalleOrdenCompra= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
						this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetalleOrdenCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetalleOrdenCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(jPanelCamposOcultosEstadoDetalleOrdenCompra, gridBagConstraintsEstadoDetalleOrdenCompra);
				
					this.jPanelCamposOcultosEstadoDetalleOrdenCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
	        this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(this.jPanelAccionesFormularioEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);							
			
			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(this.jPanelAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetalleOrdenCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra=   new JScrollPane(this.jPanelCamposEstadoDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
			
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
			
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetalleOrdenCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		this.detalleordencompraSessionBean.setConGuardarRelaciones(false);
		this.detalleordencompraSessionBean.setEsGuardarRelacionado(true);

		this.detalleordencompraBeanSwingJInternalFrame=null;//new DetalleOrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleordencompraBeanSwingJInternalFramePopup=new DetalleOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {

				DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleordencompraSessionBean.setEsGuardarRelacionado(true);

				this.detalleordencompraBeanSwingJInternalFrame=new DetalleOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleordencompraBeanSwingJInternalFrame.setdetalleordencompraSessionBean(this.detalleordencompraSessionBean);

				//this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleOrdenCompra.add(this.detalleordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleOrdenCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.add("Detalle Orden Compras",this.detalleordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setComponentAt(iIndexTab,this.detalleordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
				this.detalleordencompraBeanSwingJInternalFrame=null;//new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleOrdenCompra) {
					this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.add("Detalle Orden Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleOrdenCompraBeanSwingJInternalFrame(List<EstadoDetalleOrdenCompra> estadodetalleordencompras,EstadoDetalleOrdenCompra estadodetalleordencompra,DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleordencompraBeanSwingJInternalFrame=new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleordencompraBeanSwingJInternalFrame.getDetalleOrdenCompraLogic().setConnexion(this.estadodetalleordencompraLogic.getConnexion());

					detalleordencompraBeanSwingJInternalFrame.setestadodetalleordencomprasForeignKey(estadodetalleordencompras);
					detalleordencompraBeanSwingJInternalFrame.setestadodetalleordencompraForeignKey(estadodetalleordencompra);
					detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setlidEstadoDetalleOrdenCompraActual(estadodetalleordencompra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleOrdenCompra(detalleordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.setid_estado_detalle_orden_compraFK_IdEstadoDetalleOrdenCompra(estadodetalleordencompra.getId());

					if(!this.conCargarFormDetalle) {
						detalleordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleOrdenCompraForeignKey(estadodetalleordencompra,1,false,true,true);
					detalleordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleOrdenCompra");
					detalleordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleOrdenCompra");
					detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleOrdenCompra("n",detalleordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("relacionado");
					} else {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("no_relacionado");
					}

					detalleordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleOrdenCompra().setVisible(false);

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
