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
import com.bydan.erp.inventario.util.EstadoDetalleInventarioConstantesFunciones;

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
public class EstadoDetalleInventarioDetalleFormJInternalFrame extends EstadoDetalleInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetalleInventario;
	
	protected JMenuBar jmenuBarDetalleEstadoDetalleInventario;
	
	protected JMenu jmenuDetalleEstadoDetalleInventario;
	protected JMenu jmenuDetalleArchivoEstadoDetalleInventario;
	protected JMenu jmenuDetalleAccionesEstadoDetalleInventario;
	protected JMenu jmenuDetalleDatosEstadoDetalleInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetalleInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetalleInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean;
	
	

	public DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFrame=null;
	public DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleCompra=false;
	public DetalleCompraSessionBean detallecompraSessionBean;

	public DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame=null;
	public DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleTransferencia=false;
	public DetalleTransferenciaSessionBean detalletransferenciaSessionBean;
	
		
	
	public EstadoDetalleInventarioLogic estadodetalleinventarioLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetalleInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleInventario;
	
	protected JPanel jPanelCamposEstadoDetalleInventario;    
	protected JPanel jPanelCamposOcultosEstadoDetalleInventario;    	
	protected JPanel jPanelAccionesEstadoDetalleInventario;
	protected JPanel jPanelAccionesFormularioEstadoDetalleInventario;
    
	
	
	protected Integer iXPanelCamposEstadoDetalleInventario=0;
	protected Integer iYPanelCamposEstadoDetalleInventario=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetalleInventario=0;
	protected Integer iYPanelCamposOcultosEstadoDetalleInventario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetalleInventario;
	public JButton jButtonModificarEstadoDetalleInventario;
	public JButton jButtonActualizarEstadoDetalleInventario;
    public JButton jButtonEliminarEstadoDetalleInventario;
	public JButton jButtonCancelarEstadoDetalleInventario;
    public JButton jButtonGuardarCambiosEstadoDetalleInventario;
	public JButton jButtonGuardarCambiosTablaEstadoDetalleInventario;
	protected JButton jButtonCerrarEstadoDetalleInventario;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetalleInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetalleInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetalleInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetalleInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleInventario;
	protected JButton jButtonModificarToolBarEstadoDetalleInventario;
	protected JButton jButtonActualizarToolBarEstadoDetalleInventario;
    protected JButton jButtonEliminarToolBarEstadoDetalleInventario;
	protected JButton jButtonCancelarToolBarEstadoDetalleInventario;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetalleInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleInventario;
	protected JButton jButtonCerrarToolBarEstadoDetalleInventario;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleInventario;
	protected JMenuItem jMenuItemModificarEstadoDetalleInventario;
	protected JMenuItem jMenuItemActualizarEstadoDetalleInventario;
    protected JMenuItem jMenuItemEliminarEstadoDetalleInventario;
	protected JMenuItem jMenuItemCancelarEstadoDetalleInventario;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleInventario;
	protected JMenuItem jMenuItemCerrarEstadoDetalleInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetalleInventario;
	public JLabel jLabelIdEstadoDetalleInventario;
	public JTextFieldMe jTextFieldidEstadoDetalleInventario;
	public JButton jButtonidEstadoDetalleInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetalleInventario;
	public JLabel jLabelcodigoEstadoDetalleInventario;
	public JTextField jTextFieldcodigoEstadoDetalleInventario;
	public JButton jButtoncodigoEstadoDetalleInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetalleInventario;
	public JLabel jLabelnombreEstadoDetalleInventario;
	public JTextArea jTextAreanombreEstadoDetalleInventario;
	public JScrollPane jscrollPanenombreEstadoDetalleInventario;
	public JButton jButtonnombreEstadoDetalleInventarioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetalleInventario;
	
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
	
	public EstadoDetalleInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetalleInventario=new JPanel();
				this.jPanelAccionesFormularioEstadoDetalleInventario=new JPanel();
				this.jmenuBarDetalleEstadoDetalleInventario=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetalleInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetalleInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetalleInventario() {
		return this.jButtonActualizarToolBarEstadoDetalleInventario;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetalleInventario() {
		return this.jButtonEliminarToolBarEstadoDetalleInventario;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetalleInventario() {
		return this.jButtonCancelarToolBarEstadoDetalleInventario;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetalleInventario() {
		return this.jButtonProcesarInformacionEstadoDetalleInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleInventario)	{
		this.jButtonProcesarInformacionEstadoDetalleInventario = jButtonProcesarInformacionEstadoDetalleInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleInventario() {
		return this.jComboBoxTiposAccionesEstadoDetalleInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleInventario(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleInventario) {
		this.jComboBoxTiposRelacionesEstadoDetalleInventario = jComboBoxTiposRelacionesEstadoDetalleInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleInventario(
			JComboBox jComboBoxTiposAccionesEstadoDetalleInventario) {
		this.jComboBoxTiposAccionesEstadoDetalleInventario = jComboBoxTiposAccionesEstadoDetalleInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetalleInventario() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetalleInventario(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleInventario) {
		this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario = jComboBoxTiposAccionesFormularioEstadoDetalleInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
		
		this.estadodetalleinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallecompraSessionBean=new DetalleCompraSessionBean();
		//this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetalleInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetalleInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetalleInventario=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetalleInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetalleInventario,this.jTtoolBarDetalleEstadoDetalleInventario,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetalleInventario,this.jTtoolBarDetalleEstadoDetalleInventario,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetalleInventario,this.jTtoolBarDetalleEstadoDetalleInventario,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetalleInventario,this.jTtoolBarDetalleEstadoDetalleInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetalleInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetalleInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetalleInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetalleInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetalleInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetalleInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetalleInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetalleInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetalleInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetalleInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetalleInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetalleInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetalleInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetalleInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetalleInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetalleInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetalleInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetalleInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetalleInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetalleInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetalleInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetalleInventario.add(this.jMenuItemDetalleCerrarEstadoDetalleInventario);
		
		this.jmenuDetalleAccionesEstadoDetalleInventario.add(this.jMenuItemActualizarEstadoDetalleInventario);
		this.jmenuDetalleAccionesEstadoDetalleInventario.add(this.jMenuItemEliminarEstadoDetalleInventario);
		this.jmenuDetalleAccionesEstadoDetalleInventario.add(this.jMenuItemCancelarEstadoDetalleInventario);		
		
		//this.jmenuDetalleDatosEstadoDetalleInventario.add(this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario);				
		this.jmenuDetalleDatosEstadoDetalleInventario.add(this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario);				
				
		//this.jmenuDetalleAccionesEstadoDetalleInventario.add(this.jMenuItemGuardarCambiosEstadoDetalleInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetalleInventario.add(this.jmenuDetalleArchivoEstadoDetalleInventario);		
		this.jmenuBarDetalleEstadoDetalleInventario.add(this.jmenuDetalleAccionesEstadoDetalleInventario);		
		this.jmenuBarDetalleEstadoDetalleInventario.add(this.jmenuDetalleDatosEstadoDetalleInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDetalleInventario.add(this.jmenuDetalleEstadoDetalleInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetalleInventario);				
	}
	
	
	public void inicializarElementosCamposEstadoDetalleInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetalleInventario = new JLabelMe();
		jLabelIdEstadoDetalleInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetalleInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetalleInventario.setToolTipText(EstadoDetalleInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetalleInventario= new GridBagLayout();

		this.jPanelidEstadoDetalleInventario.setLayout(this.gridaBagLayoutEstadoDetalleInventario);

		jTextFieldidEstadoDetalleInventario = new JTextFieldMe();
		jTextFieldidEstadoDetalleInventario.setText("Id");

		jTextFieldidEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetalleInventario = new JLabelMe();
		this.jLabelcodigoEstadoDetalleInventario.setText(""+EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetalleInventario.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetalleInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetalleInventario.setToolTipText(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetalleInventario = new GridBagLayout();
		this.jPanelcodigoEstadoDetalleInventario.setLayout(this.gridaBagLayoutEstadoDetalleInventario);


		jTextFieldcodigoEstadoDetalleInventario= new JTextFieldMe();

		jTextFieldcodigoEstadoDetalleInventario.setEnabled(false);
		jTextFieldcodigoEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetalleInventarioBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetalleInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetalleInventarioBusqueda.setText("U");
		this.jButtoncodigoEstadoDetalleInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetalleInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetalleInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetalleInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetalleInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetalleInventarioBusqueda"));

		if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetalleInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetalleInventario = new JLabelMe();
		this.jLabelnombreEstadoDetalleInventario.setText(""+EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetalleInventario.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetalleInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetalleInventario.setToolTipText(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetalleInventario = new GridBagLayout();
		this.jPanelnombreEstadoDetalleInventario.setLayout(this.gridaBagLayoutEstadoDetalleInventario);


		jTextAreanombreEstadoDetalleInventario= new JTextAreaMe();
		jTextAreanombreEstadoDetalleInventario.setEnabled(false);
		jTextAreanombreEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleInventario.setLineWrap(true);
		jTextAreanombreEstadoDetalleInventario.setWrapStyleWord(true);
		jTextAreanombreEstadoDetalleInventario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDetalleInventario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDetalleInventario = new JScrollPane(jTextAreanombreEstadoDetalleInventario);
		jscrollPanenombreEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDetalleInventarioBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetalleInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetalleInventarioBusqueda.setText("U");
		this.jButtonnombreEstadoDetalleInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetalleInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetalleInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDetalleInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDetalleInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetalleInventarioBusqueda"));

		if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetalleInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetalleInventario() {
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
		//this.jInternalFrameDetalleEstadoDetalleInventario = new EstadoDetalleInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleInventario= new GridBagLayout();
		

		
		String sToolTipEstadoDetalleInventario="";
		sToolTipEstadoDetalleInventario=EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleInventario+="(Inventario.EstadoDetalleInventario)";
		}
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetalleInventario = new JButtonMe();
		this.jButtonModificarEstadoDetalleInventario = new JButtonMe();
        this.jButtonActualizarEstadoDetalleInventario = new JButtonMe();
        this.jButtonEliminarEstadoDetalleInventario = new JButtonMe();
        this.jButtonCancelarEstadoDetalleInventario = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetalleInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario = new JButtonMe();
		this.jButtonCerrarEstadoDetalleInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetalleInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetalleInventario = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Inventario";
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetalleInventario.setName("jPanelCamposEstadoDetalleInventario"); 

		this.jPanelCamposOcultosEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetalleInventario.setName("jPanelCamposOcultosEstadoDetalleInventario"); 

        this.jPanelAccionesEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetalleInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetalleInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetalleInventario.setText("Nuevo");
		this.jButtonModificarEstadoDetalleInventario.setText("Editar");
        this.jButtonActualizarEstadoDetalleInventario.setText("Actualizar");
        this.jButtonEliminarEstadoDetalleInventario.setText("Eliminar");
        this.jButtonCancelarEstadoDetalleInventario.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetalleInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.setText("Guardar");
		this.jButtonCerrarEstadoDetalleInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleInventario,"nuevo_button","Nuevo",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetalleInventario,"modificar_button","Editar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetalleInventario,"actualizar_button","Actualizar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetalleInventario,"eliminar_button","Eliminar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetalleInventario,"cancelar_button","Cancelar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetalleInventario,"guardarcambios_button","Guardar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleInventario,"guardarcambiostabla_button","Guardar",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleInventario,"cerrar_button","Salir",this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetalleInventario.setToolTipText("Nuevo"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetalleInventario.setToolTipText("Editar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetalleInventario.setToolTipText("Actualizar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetalleInventario.setToolTipText("Eliminar)"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetalleInventario.setToolTipText("Cancelar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetalleInventario.setToolTipText("Guardar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.setToolTipText("Guardar"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleInventario.setToolTipText("Salir"+" "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleInventario";
		inputMap = this.jButtonNuevoEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetalleInventario";
		inputMap = this.jButtonActualizarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetalleInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetalleInventario";
		inputMap = this.jButtonEliminarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetalleInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetalleInventario";
		inputMap = this.jButtonCancelarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetalleInventario"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleInventario";
		inputMap = this.jButtonCerrarEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetalleInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetalleInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetalleInventario.setToolTipText("Nuevo EstadoDetalleInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario.setToolTipText("Sin Cerrar Ventana EstadoDetalleInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetalleInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleInventario.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetalleInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetalleInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetalleInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetalleInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetalleInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetalleInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetalleInventario = new GridBagLayout();
		
		this.jPanelCamposEstadoDetalleInventario.setLayout(gridaBagLayoutCamposEstadoDetalleInventario);
		this.jPanelCamposOcultosEstadoDetalleInventario.setLayout(gridaBagLayoutCamposOcultosEstadoDetalleInventario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetalleInventario.add(jLabelIdEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);



	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = 1;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetalleInventario.add(jTextFieldidEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);


	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetalleInventario.add(jLabelcodigoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 2;
		this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetalleInventario.add(jButtoncodigoEstadoDetalleInventarioBusqueda, this.gridBagConstraintsEstadoDetalleInventario);
	}

	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = 1;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetalleInventario.add(jTextFieldcodigoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);


	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetalleInventario.add(jLabelnombreEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 2;
		this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetalleInventario.add(jButtonnombreEstadoDetalleInventarioBusqueda, this.gridBagConstraintsEstadoDetalleInventario);
	}

	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = 1;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetalleInventario.add(jscrollPanenombreEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = iYPanelCamposEstadoDetalleInventario;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = iXPanelCamposEstadoDetalleInventario++;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleInventario.add(this.jPanelidEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);



	if(iXPanelCamposEstadoDetalleInventario % 1==0) {
		iXPanelCamposEstadoDetalleInventario=0;
		iYPanelCamposEstadoDetalleInventario++;
	}
	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = iYPanelCamposEstadoDetalleInventario;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = iXPanelCamposEstadoDetalleInventario++;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleInventario.add(this.jPanelcodigoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);



	if(iXPanelCamposEstadoDetalleInventario % 1==0) {
		iXPanelCamposEstadoDetalleInventario=0;
		iYPanelCamposEstadoDetalleInventario++;
	}
	this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleInventario.gridy = iYPanelCamposEstadoDetalleInventario;
	this.gridBagConstraintsEstadoDetalleInventario.gridx = iXPanelCamposEstadoDetalleInventario++;
	this.gridBagConstraintsEstadoDetalleInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleInventario.add(this.jPanelnombreEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);



	if(iXPanelCamposEstadoDetalleInventario % 1==0) {
		iXPanelCamposEstadoDetalleInventario=0;
		iYPanelCamposEstadoDetalleInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleInventario= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleInventario.setLayout(gridaBagLayoutAccionesEstadoDetalleInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetalleInventario= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetalleInventario.setLayout(gridaBagLayoutAccionesFormularioEstadoDetalleInventario);
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleInventario.add(this.jComboBoxTiposAccionesFormularioEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);

		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleInventario.add(this.jCheckBoxPostAccionNuevoEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleInventario.add(this.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleInventario.add(this.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleInventario.add(this.jButtonModificarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);							

		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleInventario.add(this.jButtonEliminarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
			
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleInventario.add(this.jButtonActualizarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);


		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleInventario.add(this.jButtonGuardarCambiosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);	
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleInventario.add(this.jButtonCancelarEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleInventario.gridx =0;
		this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetalleInventario = new EstadoDetalleInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetalleInventarioModel estadodetalleinventarioModel=new EstadoDetalleInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetalleInventarioModel.EstadoDetalleInventarioFocusTraversalPolicy estadodetalleinventarioFocusTraversalPolicy = estadodetalleinventarioModel.new EstadoDetalleInventarioFocusTraversalPolicy(this);
			
			//estadodetalleinventarioFocusTraversalPolicy.setestadodetalleinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetalleinventarioModel);
			
			
			this.jContentPaneDetalleEstadoDetalleInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetalleInventario = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetalleInventario.setLayout(gridaBagLayoutDetalleEstadoDetalleInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetalleInventario.add(jTtoolBarDetalleEstadoDetalleInventario, gridBagConstraintsEstadoDetalleInventario);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetalleInventario=   new JScrollPane(jContentPaneDetalleEstadoDetalleInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetalleInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetalleInventario.add(jPanelCamposEstadoDetalleInventario, gridBagConstraintsEstadoDetalleInventario);
			
			
			
			
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
						&& estadodetalleinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleCompra(this.puedeCargarPorParteDetalleCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(this.puedeCargarPorParteDetalleTransferencia,false,-1);
					
					if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetalleInventario= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
						this.jContentPaneDetalleEstadoDetalleInventario.add(this.jTabbedPaneRelacionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetalleInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetalleInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetalleInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetalleInventario.add(jPanelCamposOcultosEstadoDetalleInventario, gridBagConstraintsEstadoDetalleInventario);
				
					this.jPanelCamposOcultosEstadoDetalleInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
	        this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetalleInventario.add(this.jPanelAccionesFormularioEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);							
			
			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetalleInventario.add(this.jPanelAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetalleInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetalleInventario=   new JScrollPane(this.jPanelCamposEstadoDetalleInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
			this.gridBagConstraintsEstadoDetalleInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetalleInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetalleInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);			
			
			this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
			
			
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		
			
		this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleInventario, this.gridBagConstraintsEstadoDetalleInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetalleInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetalleInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallecompraSessionBean=new DetalleCompraSessionBean();
		this.detallecompraSessionBean.setConGuardarRelaciones(false);
		this.detallecompraSessionBean.setEsGuardarRelacionado(true);

		this.detallecompraBeanSwingJInternalFrame=null;//new DetalleCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallecompraBeanSwingJInternalFramePopup=new DetalleCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallecompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallecompraSessionBean.getEsGuardarRelacionado()) {

				DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallecompraSessionBean.setEsGuardarRelacionado(true);

				this.detallecompraBeanSwingJInternalFrame=new DetalleCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallecompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallecompraBeanSwingJInternalFrame.setdetallecompraSessionBean(this.detallecompraSessionBean);

				//this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleInventario.add(this.detallecompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleInventario.add("Detalle Compras",this.detallecompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleInventario.setComponentAt(iIndexTab,this.detallecompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallecompraSessionBean.setEsGuardarRelacionado(false);
				this.detallecompraBeanSwingJInternalFrame=null;//new DetalleCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallecompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleCompra) {
					this.jTabbedPaneRelacionesEstadoDetalleInventario.add("Detalle Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		this.detalletransferenciaSessionBean.setConGuardarRelaciones(false);
		this.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);

		this.detalletransferenciaBeanSwingJInternalFrame=null;//new DetalleTransferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalletransferenciaBeanSwingJInternalFramePopup=new DetalleTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalletransferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {

				DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);

				this.detalletransferenciaBeanSwingJInternalFrame=new DetalleTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalletransferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalletransferenciaBeanSwingJInternalFrame.setdetalletransferenciaSessionBean(this.detalletransferenciaSessionBean);

				//this.gridBagConstraintsEstadoDetalleInventario = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleInventario.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleInventario.add(this.detalletransferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleInventario.add("Detalle Transferencias",this.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleInventario.setComponentAt(iIndexTab,this.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
				this.detalletransferenciaBeanSwingJInternalFrame=null;//new DetalleTransferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleTransferencia) {
					this.jTabbedPaneRelacionesEstadoDetalleInventario.add("Detalle Transferencias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleCompraBeanSwingJInternalFrame(List<EstadoDetalleInventario> estadodetalleinventarios,EstadoDetalleInventario estadodetalleinventario,DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallecompraBeanSwingJInternalFrame=new DetalleCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallecompraBeanSwingJInternalFrame.getDetalleCompraLogic().setConnexion(this.estadodetalleinventarioLogic.getConnexion());

					detallecompraBeanSwingJInternalFrame.setestadodetalleinventariosForeignKey(estadodetalleinventarios);
					detallecompraBeanSwingJInternalFrame.setestadodetalleinventarioForeignKey(estadodetalleinventario);
					detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleInventario(true);
					detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setlidEstadoDetalleInventarioActual(estadodetalleinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallecompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleCompra(detallecompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallecompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleInventario(true);
					detallecompraBeanSwingJInternalFrame.setid_estado_detalle_inventarioFK_IdEstadoDetalleInventario(estadodetalleinventario.getId());

					if(!this.conCargarFormDetalle) {
						detallecompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallecompraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleInventarioForeignKey(estadodetalleinventario,1,false,true,true);
					detallecompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallecompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleInventario");
					detallecompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleInventario");
					detallecompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCompra(true);
					detallecompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleCompra("n",detallecompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallecompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallecompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detallecompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallecompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCompra("relacionado");
					} else {
						detallecompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCompra("no_relacionado");
					}

					detallecompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleTransferenciaBeanSwingJInternalFrame(List<EstadoDetalleInventario> estadodetalleinventarios,EstadoDetalleInventario estadodetalleinventario,DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalletransferenciaBeanSwingJInternalFrame=new DetalleTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalletransferenciaBeanSwingJInternalFrame.getDetalleTransferenciaLogic().setConnexion(this.estadodetalleinventarioLogic.getConnexion());

					detalletransferenciaBeanSwingJInternalFrame.setestadodetalleinventariosForeignKey(estadodetalleinventarios);
					detalletransferenciaBeanSwingJInternalFrame.setestadodetalleinventarioForeignKey(estadodetalleinventario);
					detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleInventario(true);
					detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setlidEstadoDetalleInventarioActual(estadodetalleinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalletransferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleTransferencia(detalletransferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalletransferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleInventario(true);
					detalletransferenciaBeanSwingJInternalFrame.setid_estado_detalle_inventarioFK_IdEstadoDetalleInventario(estadodetalleinventario.getId());

					if(!this.conCargarFormDetalle) {
						detalletransferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalletransferenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleInventarioForeignKey(estadodetalleinventario,1,false,true,true);
					detalletransferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalletransferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleInventario");
					detalletransferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleInventario");
					detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(true);
					detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleTransferencia("n",detalletransferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalletransferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalletransferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalletransferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("relacionado");
					} else {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("no_relacionado");
					}

					detalletransferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleTransferencia().setVisible(false);

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
