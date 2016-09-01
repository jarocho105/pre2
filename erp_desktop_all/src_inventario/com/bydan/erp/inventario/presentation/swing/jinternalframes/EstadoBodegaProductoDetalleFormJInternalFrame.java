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
import com.bydan.erp.inventario.util.EstadoBodegaProductoConstantesFunciones;

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
public class EstadoBodegaProductoDetalleFormJInternalFrame extends EstadoBodegaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoBodegaProducto;
	
	protected JMenuBar jmenuBarDetalleEstadoBodegaProducto;
	
	protected JMenu jmenuDetalleEstadoBodegaProducto;
	protected JMenu jmenuDetalleArchivoEstadoBodegaProducto;
	protected JMenu jmenuDetalleAccionesEstadoBodegaProducto;
	protected JMenu jmenuDetalleDatosEstadoBodegaProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoBodegaProducto;	
	protected GridBagConstraints gridBagConstraintsEstadoBodegaProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoBodegaProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoBodegaProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoBodegaProductoSessionBean estadobodegaproductoSessionBean;
	
	
	
		
	
	public EstadoBodegaProductoLogic estadobodegaproductoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoBodegaProducto;
	public JScrollPane jScrollPanelDatosEdicionEstadoBodegaProducto;
	public JScrollPane jScrollPanelDatosGeneralEstadoBodegaProducto;
	
	protected JPanel jPanelCamposEstadoBodegaProducto;    
	protected JPanel jPanelCamposOcultosEstadoBodegaProducto;    	
	protected JPanel jPanelAccionesEstadoBodegaProducto;
	protected JPanel jPanelAccionesFormularioEstadoBodegaProducto;
    
	
	
	protected Integer iXPanelCamposEstadoBodegaProducto=0;
	protected Integer iYPanelCamposEstadoBodegaProducto=0;
	
	protected Integer iXPanelCamposOcultosEstadoBodegaProducto=0;
	protected Integer iYPanelCamposOcultosEstadoBodegaProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoBodegaProducto;
	public JButton jButtonModificarEstadoBodegaProducto;
	public JButton jButtonActualizarEstadoBodegaProducto;
    public JButton jButtonEliminarEstadoBodegaProducto;
	public JButton jButtonCancelarEstadoBodegaProducto;
    public JButton jButtonGuardarCambiosEstadoBodegaProducto;
	public JButton jButtonGuardarCambiosTablaEstadoBodegaProducto;
	protected JButton jButtonCerrarEstadoBodegaProducto;
	
	
	protected JButton jButtonProcesarInformacionEstadoBodegaProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoBodegaProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoBodegaProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoBodegaProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoBodegaProducto;
	protected JButton jButtonModificarToolBarEstadoBodegaProducto;
	protected JButton jButtonActualizarToolBarEstadoBodegaProducto;
    protected JButton jButtonEliminarToolBarEstadoBodegaProducto;
	protected JButton jButtonCancelarToolBarEstadoBodegaProducto;
    protected JButton jButtonGuardarCambiosToolBarEstadoBodegaProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoBodegaProducto;
	protected JButton jButtonCerrarToolBarEstadoBodegaProducto;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoBodegaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoBodegaProducto;
	protected JMenuItem jMenuItemModificarEstadoBodegaProducto;
	protected JMenuItem jMenuItemActualizarEstadoBodegaProducto;
    protected JMenuItem jMenuItemEliminarEstadoBodegaProducto;
	protected JMenuItem jMenuItemCancelarEstadoBodegaProducto;
    protected JMenuItem jMenuItemGuardarCambiosEstadoBodegaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoBodegaProducto;
	protected JMenuItem jMenuItemCerrarEstadoBodegaProducto;
	protected JMenuItem jMenuItemDetalleCerrarEstadoBodegaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoBodegaProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoBodegaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoBodegaProducto;
	protected JMenuItem jMenuItemMostrarOcultarEstadoBodegaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoBodegaProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoBodegaProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoBodegaProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoBodegaProducto;
	public JLabel jLabelIdEstadoBodegaProducto;
	public JTextFieldMe jTextFieldidEstadoBodegaProducto;
	public JButton jButtonidEstadoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoBodegaProducto;
	public JLabel jLabelcodigoEstadoBodegaProducto;
	public JTextField jTextFieldcodigoEstadoBodegaProducto;
	public JButton jButtoncodigoEstadoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoBodegaProducto;
	public JLabel jLabelnombreEstadoBodegaProducto;
	public JTextArea jTextAreanombreEstadoBodegaProducto;
	public JScrollPane jscrollPanenombreEstadoBodegaProducto;
	public JButton jButtonnombreEstadoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoEstadoBodegaProducto;
	public JLabel jLabeles_defectoEstadoBodegaProducto;
	public JCheckBox jCheckBoxes_defectoEstadoBodegaProducto;
	public JButton jButtones_defectoEstadoBodegaProductoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoBodegaProducto;
	
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
	
	public EstadoBodegaProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoBodegaProducto=new JPanel();
				this.jPanelAccionesFormularioEstadoBodegaProducto=new JPanel();
				this.jmenuBarDetalleEstadoBodegaProducto=new JMenuBar();
				this.jTtoolBarDetalleEstadoBodegaProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoBodegaProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoBodegaProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoBodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoBodegaProducto() {
		return this.jButtonActualizarToolBarEstadoBodegaProducto;
	}
	
	public JButton getjButtonEliminarToolBarEstadoBodegaProducto() {
		return this.jButtonEliminarToolBarEstadoBodegaProducto;
	}
	
	public JButton getjButtonCancelarToolBarEstadoBodegaProducto() {
		return this.jButtonCancelarToolBarEstadoBodegaProducto;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoBodegaProducto() {
		return this.jButtonProcesarInformacionEstadoBodegaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoBodegaProducto)	{
		this.jButtonProcesarInformacionEstadoBodegaProducto = jButtonProcesarInformacionEstadoBodegaProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoBodegaProducto() {
		return this.jComboBoxTiposAccionesEstadoBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoBodegaProducto(
			JComboBox jComboBoxTiposRelacionesEstadoBodegaProducto) {
		this.jComboBoxTiposRelacionesEstadoBodegaProducto = jComboBoxTiposRelacionesEstadoBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoBodegaProducto(
			JComboBox jComboBoxTiposAccionesEstadoBodegaProducto) {
		this.jComboBoxTiposAccionesEstadoBodegaProducto = jComboBoxTiposAccionesEstadoBodegaProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoBodegaProducto() {
		return this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoBodegaProducto(
			JComboBox jComboBoxTiposAccionesFormularioEstadoBodegaProducto) {
		this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto = jComboBoxTiposAccionesFormularioEstadoBodegaProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
		
		this.estadobodegaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadobodegaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadobodegaproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoBodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoBodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoBodegaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Bodega Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoBodegaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoBodegaProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoBodegaProducto=new JButtonMe();
				this.jButtonModificarToolBarEstadoBodegaProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoBodegaProducto,this.jTtoolBarDetalleEstadoBodegaProducto,
							"actualizar","actualizar","Actualizar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoBodegaProducto,this.jTtoolBarDetalleEstadoBodegaProducto,
							"eliminar","eliminar","Eliminar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoBodegaProducto,this.jTtoolBarDetalleEstadoBodegaProducto,
							"cancelar","cancelar","Cancelar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoBodegaProducto,this.jTtoolBarDetalleEstadoBodegaProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoBodegaProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoBodegaProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoBodegaProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoBodegaProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoBodegaProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoBodegaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoBodegaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoBodegaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoBodegaProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoBodegaProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoBodegaProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoBodegaProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoBodegaProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoBodegaProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoBodegaProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoBodegaProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoBodegaProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoBodegaProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoBodegaProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoBodegaProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoBodegaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoBodegaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoBodegaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoBodegaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoBodegaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoBodegaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoBodegaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoBodegaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoBodegaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoBodegaProducto.add(this.jMenuItemDetalleCerrarEstadoBodegaProducto);
		
		this.jmenuDetalleAccionesEstadoBodegaProducto.add(this.jMenuItemActualizarEstadoBodegaProducto);
		this.jmenuDetalleAccionesEstadoBodegaProducto.add(this.jMenuItemEliminarEstadoBodegaProducto);
		this.jmenuDetalleAccionesEstadoBodegaProducto.add(this.jMenuItemCancelarEstadoBodegaProducto);		
		
		//this.jmenuDetalleDatosEstadoBodegaProducto.add(this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto);				
		this.jmenuDetalleDatosEstadoBodegaProducto.add(this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto);				
				
		//this.jmenuDetalleAccionesEstadoBodegaProducto.add(this.jMenuItemGuardarCambiosEstadoBodegaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoBodegaProducto.add(this.jmenuDetalleArchivoEstadoBodegaProducto);		
		this.jmenuBarDetalleEstadoBodegaProducto.add(this.jmenuDetalleAccionesEstadoBodegaProducto);		
		this.jmenuBarDetalleEstadoBodegaProducto.add(this.jmenuDetalleDatosEstadoBodegaProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoBodegaProducto);				
	}
	
	
	public void inicializarElementosCamposEstadoBodegaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoBodegaProducto = new JLabelMe();
		jLabelIdEstadoBodegaProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoBodegaProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoBodegaProducto.setToolTipText(EstadoBodegaProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoBodegaProducto= new GridBagLayout();

		this.jPanelidEstadoBodegaProducto.setLayout(this.gridaBagLayoutEstadoBodegaProducto);

		jTextFieldidEstadoBodegaProducto = new JTextFieldMe();
		jTextFieldidEstadoBodegaProducto.setText("Id");

		jTextFieldidEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoBodegaProducto = new JLabelMe();
		this.jLabelcodigoEstadoBodegaProducto.setText(""+EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoBodegaProducto.setToolTipText("Codigo");
		this.jLabelcodigoEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoBodegaProducto.setToolTipText(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoBodegaProducto = new GridBagLayout();
		this.jPanelcodigoEstadoBodegaProducto.setLayout(this.gridaBagLayoutEstadoBodegaProducto);


		jTextFieldcodigoEstadoBodegaProducto= new JTextFieldMe();

		jTextFieldcodigoEstadoBodegaProducto.setEnabled(false);
		jTextFieldcodigoEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoBodegaProductoBusqueda.setText("U");
		this.jButtoncodigoEstadoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoBodegaProductoBusqueda"));

		if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoBodegaProducto = new JLabelMe();
		this.jLabelnombreEstadoBodegaProducto.setText(""+EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoBodegaProducto.setToolTipText("Nombre");
		this.jLabelnombreEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoBodegaProducto.setToolTipText(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoBodegaProducto = new GridBagLayout();
		this.jPanelnombreEstadoBodegaProducto.setLayout(this.gridaBagLayoutEstadoBodegaProducto);


		jTextAreanombreEstadoBodegaProducto= new JTextAreaMe();
		jTextAreanombreEstadoBodegaProducto.setEnabled(false);
		jTextAreanombreEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoBodegaProducto.setLineWrap(true);
		jTextAreanombreEstadoBodegaProducto.setWrapStyleWord(true);
		jTextAreanombreEstadoBodegaProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoBodegaProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoBodegaProducto = new JScrollPane(jTextAreanombreEstadoBodegaProducto);
		jscrollPanenombreEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoBodegaProductoBusqueda.setText("U");
		this.jButtonnombreEstadoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoBodegaProductoBusqueda"));

		if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoEstadoBodegaProducto = new JLabelMe();
		this.jLabeles_defectoEstadoBodegaProducto.setText(""+EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoEstadoBodegaProducto.setToolTipText("Es Defecto");
		this.jLabeles_defectoEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoEstadoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoEstadoBodegaProducto.setToolTipText(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutEstadoBodegaProducto = new GridBagLayout();
		this.jPaneles_defectoEstadoBodegaProducto.setLayout(this.gridaBagLayoutEstadoBodegaProducto);


		jCheckBoxes_defectoEstadoBodegaProducto= new JCheckBoxMe();
		jCheckBoxes_defectoEstadoBodegaProducto.setEnabled(false);

		jCheckBoxes_defectoEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoEstadoBodegaProductoBusqueda= new JButtonMe();
		this.jButtones_defectoEstadoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoEstadoBodegaProductoBusqueda.setText("U");
		this.jButtones_defectoEstadoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoEstadoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoEstadoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoEstadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoEstadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoEstadoBodegaProductoBusqueda"));

		if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoEstadoBodegaProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoBodegaProducto() {
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
		//this.jInternalFrameDetalleEstadoBodegaProducto = new EstadoBodegaProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Bodega Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoBodegaProducto= new GridBagLayout();
		

		
		String sToolTipEstadoBodegaProducto="";
		sToolTipEstadoBodegaProducto=EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoBodegaProducto+="(Inventario.EstadoBodegaProducto)";
		}
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoBodegaProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoBodegaProducto = new JButtonMe();
		this.jButtonModificarEstadoBodegaProducto = new JButtonMe();
        this.jButtonActualizarEstadoBodegaProducto = new JButtonMe();
        this.jButtonEliminarEstadoBodegaProducto = new JButtonMe();
        this.jButtonCancelarEstadoBodegaProducto = new JButtonMe();
        this.jButtonGuardarCambiosEstadoBodegaProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto = new JButtonMe();
		this.jButtonCerrarEstadoBodegaProducto = new JButtonMe();
		
		this.jScrollPanelDatosEstadoBodegaProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoBodegaProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoBodegaProducto = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Bodega Producto";
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Bodega Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoBodegaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoBodegaProducto.setName("jPanelCamposEstadoBodegaProducto"); 

		this.jPanelCamposOcultosEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoBodegaProducto.setName("jPanelCamposOcultosEstadoBodegaProducto"); 

        this.jPanelAccionesEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoBodegaProducto.setToolTipText("Acciones");
        this.jPanelAccionesEstadoBodegaProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoBodegaProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoBodegaProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoBodegaProducto.setText("Nuevo");
		this.jButtonModificarEstadoBodegaProducto.setText("Editar");
        this.jButtonActualizarEstadoBodegaProducto.setText("Actualizar");
        this.jButtonEliminarEstadoBodegaProducto.setText("Eliminar");
        this.jButtonCancelarEstadoBodegaProducto.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoBodegaProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.setText("Guardar");
		this.jButtonCerrarEstadoBodegaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoBodegaProducto,"nuevo_button","Nuevo",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoBodegaProducto,"modificar_button","Editar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoBodegaProducto,"actualizar_button","Actualizar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoBodegaProducto,"eliminar_button","Eliminar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoBodegaProducto,"cancelar_button","Cancelar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoBodegaProducto,"guardarcambios_button","Guardar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoBodegaProducto,"guardarcambiostabla_button","Guardar",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoBodegaProducto,"cerrar_button","Salir",this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoBodegaProducto.setToolTipText("Nuevo"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoBodegaProducto.setToolTipText("Editar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoBodegaProducto.setToolTipText("Actualizar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoBodegaProducto.setToolTipText("Eliminar)"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoBodegaProducto.setToolTipText("Cancelar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoBodegaProducto.setToolTipText("Guardar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.setToolTipText("Guardar"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoBodegaProducto.setToolTipText("Salir"+" "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoBodegaProducto";
		inputMap = this.jButtonNuevoEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoBodegaProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoBodegaProducto";
		inputMap = this.jButtonActualizarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoBodegaProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoBodegaProducto";
		inputMap = this.jButtonEliminarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoBodegaProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoBodegaProducto";
		inputMap = this.jButtonCancelarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoBodegaProducto"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoBodegaProducto";
		inputMap = this.jButtonCerrarEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoBodegaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoBodegaProducto";
		inputMap = this.jButtonGuardarCambiosTablaEstadoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoBodegaProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoBodegaProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoBodegaProducto.setToolTipText("Nuevo EstadoBodegaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto.setToolTipText("Sin Cerrar Ventana EstadoBodegaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoBodegaProducto.setText("Accion");
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoBodegaProducto = new JLabelMe();
		
		this.jLabelAccionesEstadoBodegaProducto.setText("Acciones");		
		this.jLabelAccionesEstadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoBodegaProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoBodegaProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoBodegaProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoBodegaProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoBodegaProducto = new GridBagLayout();
		
		this.jPanelCamposEstadoBodegaProducto.setLayout(gridaBagLayoutCamposEstadoBodegaProducto);
		this.jPanelCamposOcultosEstadoBodegaProducto.setLayout(gridaBagLayoutCamposOcultosEstadoBodegaProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoBodegaProducto.add(jLabelIdEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 1;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoBodegaProducto.add(jTextFieldidEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);


	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoBodegaProducto.add(jLabelcodigoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 2;
		this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
		this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoBodegaProducto.add(jButtoncodigoEstadoBodegaProductoBusqueda, this.gridBagConstraintsEstadoBodegaProducto);
	}

	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 1;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoBodegaProducto.add(jTextFieldcodigoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);


	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoBodegaProducto.add(jLabelnombreEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 2;
		this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
		this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoBodegaProducto.add(jButtonnombreEstadoBodegaProductoBusqueda, this.gridBagConstraintsEstadoBodegaProducto);
	}

	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 1;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoBodegaProducto.add(jscrollPanenombreEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);


	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoEstadoBodegaProducto.add(jLabeles_defectoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 2;
		this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
		this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoEstadoBodegaProducto.add(jButtones_defectoEstadoBodegaProductoBusqueda, this.gridBagConstraintsEstadoBodegaProducto);
	}

	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = 1;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoEstadoBodegaProducto.add(jCheckBoxes_defectoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = iYPanelCamposEstadoBodegaProducto;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = iXPanelCamposEstadoBodegaProducto++;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoBodegaProducto.add(this.jPanelidEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(iXPanelCamposEstadoBodegaProducto % 1==0) {
		iXPanelCamposEstadoBodegaProducto=0;
		iYPanelCamposEstadoBodegaProducto++;
	}
	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = iYPanelCamposEstadoBodegaProducto;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = iXPanelCamposEstadoBodegaProducto++;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoBodegaProducto.add(this.jPanelcodigoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(iXPanelCamposEstadoBodegaProducto % 1==0) {
		iXPanelCamposEstadoBodegaProducto=0;
		iYPanelCamposEstadoBodegaProducto++;
	}
	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = iYPanelCamposEstadoBodegaProducto;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = iXPanelCamposEstadoBodegaProducto++;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoBodegaProducto.add(this.jPanelnombreEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(iXPanelCamposEstadoBodegaProducto % 1==0) {
		iXPanelCamposEstadoBodegaProducto=0;
		iYPanelCamposEstadoBodegaProducto++;
	}
	this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoBodegaProducto.gridy = iYPanelCamposEstadoBodegaProducto;
	this.gridBagConstraintsEstadoBodegaProducto.gridx = iXPanelCamposEstadoBodegaProducto++;
	this.gridBagConstraintsEstadoBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoBodegaProducto.add(this.jPaneles_defectoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);



	if(iXPanelCamposEstadoBodegaProducto % 1==0) {
		iXPanelCamposEstadoBodegaProducto=0;
		iYPanelCamposEstadoBodegaProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoBodegaProducto= new GridBagLayout();
		this.jPanelAccionesEstadoBodegaProducto.setLayout(gridaBagLayoutAccionesEstadoBodegaProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoBodegaProducto= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoBodegaProducto.setLayout(gridaBagLayoutAccionesFormularioEstadoBodegaProducto);
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoBodegaProducto.add(this.jComboBoxTiposAccionesFormularioEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);

		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoBodegaProducto.add(this.jCheckBoxPostAccionNuevoEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoBodegaProducto.add(this.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoBodegaProducto.add(this.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoBodegaProducto.add(this.jButtonModificarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);							

		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;
		this.gridBagConstraintsEstadoBodegaProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoBodegaProducto.add(this.jButtonEliminarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
			
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoBodegaProducto.add(this.jButtonActualizarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);


		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoBodegaProducto.add(this.jButtonGuardarCambiosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);	
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = 0;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoBodegaProducto.add(this.jButtonCancelarEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoBodegaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoBodegaProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();						
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;		
			//this.gridBagConstraintsEstadoBodegaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoBodegaProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoBodegaProducto.gridx =0;
		this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoBodegaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoBodegaProducto = new EstadoBodegaProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Bodega Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Bodega Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Bodega Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoBodegaProductoModel estadobodegaproductoModel=new EstadoBodegaProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoBodegaProductoModel.EstadoBodegaProductoFocusTraversalPolicy estadobodegaproductoFocusTraversalPolicy = estadobodegaproductoModel.new EstadoBodegaProductoFocusTraversalPolicy(this);
			
			//estadobodegaproductoFocusTraversalPolicy.setestadobodegaproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadobodegaproductoModel);
			
			
			this.jContentPaneDetalleEstadoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoBodegaProducto = new GridBagLayout();	
			this.jContentPaneDetalleEstadoBodegaProducto.setLayout(gridaBagLayoutDetalleEstadoBodegaProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoBodegaProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
				this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoBodegaProducto.add(jTtoolBarDetalleEstadoBodegaProducto, gridBagConstraintsEstadoBodegaProducto);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoBodegaProducto=   new JScrollPane(jContentPaneDetalleEstadoBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoBodegaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	        
			this.jContentPaneDetalleEstadoBodegaProducto.add(jPanelCamposEstadoBodegaProducto, gridBagConstraintsEstadoBodegaProducto);
			
			
			
			
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
						&& estadobodegaproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoBodegaProducto= new GridBagConstraints();
						this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
						this.jContentPaneDetalleEstadoBodegaProducto.add(this.jTabbedPaneRelacionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoBodegaProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoBodegaProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
					this.gridBagConstraintsEstadoBodegaProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoBodegaProducto.add(jPanelCamposOcultosEstadoBodegaProducto, gridBagConstraintsEstadoBodegaProducto);
				
					this.jPanelCamposOcultosEstadoBodegaProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	        this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoBodegaProducto.add(this.jPanelAccionesFormularioEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);							
			
			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
	        this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoBodegaProducto.add(this.jPanelAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoBodegaProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoBodegaProducto=   new JScrollPane(this.jPanelCamposEstadoBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
			this.gridBagConstraintsEstadoBodegaProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoBodegaProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoBodegaProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);			
			
			this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
			
			
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		
			
		this.gridBagConstraintsEstadoBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsEstadoBodegaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoBodegaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoBodegaProducto, this.gridBagConstraintsEstadoBodegaProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoBodegaProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoBodegaProducto;
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
