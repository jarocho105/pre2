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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.EstadoMovimientoInventarioConstantesFunciones;

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
public class EstadoMovimientoInventarioDetalleFormJInternalFrame extends EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoMovimientoInventario;
	
	protected JMenuBar jmenuBarDetalleEstadoMovimientoInventario;
	
	protected JMenu jmenuDetalleEstadoMovimientoInventario;
	protected JMenu jmenuDetalleArchivoEstadoMovimientoInventario;
	protected JMenu jmenuDetalleAccionesEstadoMovimientoInventario;
	protected JMenu jmenuDetalleDatosEstadoMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoMovimientoInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoMovimientoInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean;
	
	

	public MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=null;
	public MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMovimientoInventario=false;
	public MovimientoInventarioSessionBean movimientoinventarioSessionBean;
	
		
	
	public EstadoMovimientoInventarioLogic estadomovimientoinventarioLogic;
	
	public JScrollPane jScrollPanelDatosEstadoMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoMovimientoInventario;
	
	protected JPanel jPanelCamposEstadoMovimientoInventario;    
	protected JPanel jPanelCamposOcultosEstadoMovimientoInventario;    	
	protected JPanel jPanelAccionesEstadoMovimientoInventario;
	protected JPanel jPanelAccionesFormularioEstadoMovimientoInventario;
    
	
	
	protected Integer iXPanelCamposEstadoMovimientoInventario=0;
	protected Integer iYPanelCamposEstadoMovimientoInventario=0;
	
	protected Integer iXPanelCamposOcultosEstadoMovimientoInventario=0;
	protected Integer iYPanelCamposOcultosEstadoMovimientoInventario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoMovimientoInventario;
	public JButton jButtonModificarEstadoMovimientoInventario;
	public JButton jButtonActualizarEstadoMovimientoInventario;
    public JButton jButtonEliminarEstadoMovimientoInventario;
	public JButton jButtonCancelarEstadoMovimientoInventario;
    public JButton jButtonGuardarCambiosEstadoMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaEstadoMovimientoInventario;
	protected JButton jButtonCerrarEstadoMovimientoInventario;
	
	
	protected JButton jButtonProcesarInformacionEstadoMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoMovimientoInventario;
	protected JButton jButtonModificarToolBarEstadoMovimientoInventario;
	protected JButton jButtonActualizarToolBarEstadoMovimientoInventario;
    protected JButton jButtonEliminarToolBarEstadoMovimientoInventario;
	protected JButton jButtonCancelarToolBarEstadoMovimientoInventario;
    protected JButton jButtonGuardarCambiosToolBarEstadoMovimientoInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoMovimientoInventario;
	protected JButton jButtonCerrarToolBarEstadoMovimientoInventario;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoMovimientoInventario;
	protected JMenuItem jMenuItemModificarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemActualizarEstadoMovimientoInventario;
    protected JMenuItem jMenuItemEliminarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemCancelarEstadoMovimientoInventario;
    protected JMenuItem jMenuItemGuardarCambiosEstadoMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoMovimientoInventario;
	protected JMenuItem jMenuItemCerrarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoMovimientoInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoMovimientoInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoMovimientoInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoMovimientoInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoMovimientoInventario;
	public JLabel jLabelIdEstadoMovimientoInventario;
	public JTextFieldMe jTextFieldidEstadoMovimientoInventario;
	public JButton jButtonidEstadoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoMovimientoInventario;
	public JLabel jLabelcodigoEstadoMovimientoInventario;
	public JTextField jTextFieldcodigoEstadoMovimientoInventario;
	public JButton jButtoncodigoEstadoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoMovimientoInventario;
	public JLabel jLabelnombreEstadoMovimientoInventario;
	public JTextArea jTextAreanombreEstadoMovimientoInventario;
	public JScrollPane jscrollPanenombreEstadoMovimientoInventario;
	public JButton jButtonnombreEstadoMovimientoInventarioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoMovimientoInventario;
	
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
	
	public EstadoMovimientoInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoMovimientoInventario=new JPanel();
				this.jPanelAccionesFormularioEstadoMovimientoInventario=new JPanel();
				this.jmenuBarDetalleEstadoMovimientoInventario=new JMenuBar();
				this.jTtoolBarDetalleEstadoMovimientoInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoMovimientoInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoMovimientoInventario() {
		return this.jButtonActualizarToolBarEstadoMovimientoInventario;
	}
	
	public JButton getjButtonEliminarToolBarEstadoMovimientoInventario() {
		return this.jButtonEliminarToolBarEstadoMovimientoInventario;
	}
	
	public JButton getjButtonCancelarToolBarEstadoMovimientoInventario() {
		return this.jButtonCancelarToolBarEstadoMovimientoInventario;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoMovimientoInventario() {
		return this.jButtonProcesarInformacionEstadoMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoMovimientoInventario)	{
		this.jButtonProcesarInformacionEstadoMovimientoInventario = jButtonProcesarInformacionEstadoMovimientoInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoMovimientoInventario() {
		return this.jComboBoxTiposAccionesEstadoMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesEstadoMovimientoInventario) {
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario = jComboBoxTiposRelacionesEstadoMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposAccionesEstadoMovimientoInventario) {
		this.jComboBoxTiposAccionesEstadoMovimientoInventario = jComboBoxTiposAccionesEstadoMovimientoInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoMovimientoInventario() {
		return this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoMovimientoInventario(
			JComboBox jComboBoxTiposAccionesFormularioEstadoMovimientoInventario) {
		this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario = jComboBoxTiposAccionesFormularioEstadoMovimientoInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
		
		this.estadomovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadomovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.movimientoinventarioSessionBean=new MovimientoInventarioSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoMovimientoInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoMovimientoInventario=new JButtonMe();
				this.jButtonModificarToolBarEstadoMovimientoInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoMovimientoInventario,this.jTtoolBarDetalleEstadoMovimientoInventario,
							"actualizar","actualizar","Actualizar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoMovimientoInventario,this.jTtoolBarDetalleEstadoMovimientoInventario,
							"eliminar","eliminar","Eliminar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoMovimientoInventario,this.jTtoolBarDetalleEstadoMovimientoInventario,
							"cancelar","cancelar","Cancelar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoMovimientoInventario,this.jTtoolBarDetalleEstadoMovimientoInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoMovimientoInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoMovimientoInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoMovimientoInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoMovimientoInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoMovimientoInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoMovimientoInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoMovimientoInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoMovimientoInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoMovimientoInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoMovimientoInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoMovimientoInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoMovimientoInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoMovimientoInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoMovimientoInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoMovimientoInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoMovimientoInventario.add(this.jMenuItemDetalleCerrarEstadoMovimientoInventario);
		
		this.jmenuDetalleAccionesEstadoMovimientoInventario.add(this.jMenuItemActualizarEstadoMovimientoInventario);
		this.jmenuDetalleAccionesEstadoMovimientoInventario.add(this.jMenuItemEliminarEstadoMovimientoInventario);
		this.jmenuDetalleAccionesEstadoMovimientoInventario.add(this.jMenuItemCancelarEstadoMovimientoInventario);		
		
		//this.jmenuDetalleDatosEstadoMovimientoInventario.add(this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario);				
		this.jmenuDetalleDatosEstadoMovimientoInventario.add(this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario);				
				
		//this.jmenuDetalleAccionesEstadoMovimientoInventario.add(this.jMenuItemGuardarCambiosEstadoMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoMovimientoInventario.add(this.jmenuDetalleArchivoEstadoMovimientoInventario);		
		this.jmenuBarDetalleEstadoMovimientoInventario.add(this.jmenuDetalleAccionesEstadoMovimientoInventario);		
		this.jmenuBarDetalleEstadoMovimientoInventario.add(this.jmenuDetalleDatosEstadoMovimientoInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoMovimientoInventario.add(this.jmenuDetalleEstadoMovimientoInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoMovimientoInventario);				
	}
	
	
	public void inicializarElementosCamposEstadoMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoMovimientoInventario = new JLabelMe();
		jLabelIdEstadoMovimientoInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoMovimientoInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoMovimientoInventario.setToolTipText(EstadoMovimientoInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoMovimientoInventario= new GridBagLayout();

		this.jPanelidEstadoMovimientoInventario.setLayout(this.gridaBagLayoutEstadoMovimientoInventario);

		jTextFieldidEstadoMovimientoInventario = new JTextFieldMe();
		jTextFieldidEstadoMovimientoInventario.setText("Id");

		jTextFieldidEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoMovimientoInventario = new JLabelMe();
		this.jLabelcodigoEstadoMovimientoInventario.setText(""+EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoMovimientoInventario.setToolTipText("Codigo");
		this.jLabelcodigoEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoMovimientoInventario.setToolTipText(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoMovimientoInventario = new GridBagLayout();
		this.jPanelcodigoEstadoMovimientoInventario.setLayout(this.gridaBagLayoutEstadoMovimientoInventario);


		jTextFieldcodigoEstadoMovimientoInventario= new JTextFieldMe();

		jTextFieldcodigoEstadoMovimientoInventario.setEnabled(false);
		jTextFieldcodigoEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setText("U");
		this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoMovimientoInventarioBusqueda"));

		if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoMovimientoInventario = new JLabelMe();
		this.jLabelnombreEstadoMovimientoInventario.setText(""+EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoMovimientoInventario.setToolTipText("Nombre");
		this.jLabelnombreEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoMovimientoInventario.setToolTipText(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoMovimientoInventario = new GridBagLayout();
		this.jPanelnombreEstadoMovimientoInventario.setLayout(this.gridaBagLayoutEstadoMovimientoInventario);


		jTextAreanombreEstadoMovimientoInventario= new JTextAreaMe();
		jTextAreanombreEstadoMovimientoInventario.setEnabled(false);
		jTextAreanombreEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoMovimientoInventario.setLineWrap(true);
		jTextAreanombreEstadoMovimientoInventario.setWrapStyleWord(true);
		jTextAreanombreEstadoMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoMovimientoInventario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoMovimientoInventario = new JScrollPane(jTextAreanombreEstadoMovimientoInventario);
		jscrollPanenombreEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnombreEstadoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoMovimientoInventarioBusqueda.setText("U");
		this.jButtonnombreEstadoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoMovimientoInventarioBusqueda"));

		if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoMovimientoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoMovimientoInventario() {
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
		//this.jInternalFrameDetalleEstadoMovimientoInventario = new EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Movimiento Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoMovimientoInventario= new GridBagLayout();
		

		
		String sToolTipEstadoMovimientoInventario="";
		sToolTipEstadoMovimientoInventario=EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoMovimientoInventario+="(Inventario.EstadoMovimientoInventario)";
		}
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoMovimientoInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoMovimientoInventario = new JButtonMe();
		this.jButtonModificarEstadoMovimientoInventario = new JButtonMe();
        this.jButtonActualizarEstadoMovimientoInventario = new JButtonMe();
        this.jButtonEliminarEstadoMovimientoInventario = new JButtonMe();
        this.jButtonCancelarEstadoMovimientoInventario = new JButtonMe();
        this.jButtonGuardarCambiosEstadoMovimientoInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario = new JButtonMe();
		this.jButtonCerrarEstadoMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoMovimientoInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoMovimientoInventario = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Movimiento Inventario";
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoMovimientoInventario.setName("jPanelCamposEstadoMovimientoInventario"); 

		this.jPanelCamposOcultosEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoMovimientoInventario.setName("jPanelCamposOcultosEstadoMovimientoInventario"); 

        this.jPanelAccionesEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoMovimientoInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoMovimientoInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoMovimientoInventario.setText("Nuevo");
		this.jButtonModificarEstadoMovimientoInventario.setText("Editar");
        this.jButtonActualizarEstadoMovimientoInventario.setText("Actualizar");
        this.jButtonEliminarEstadoMovimientoInventario.setText("Eliminar");
        this.jButtonCancelarEstadoMovimientoInventario.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoMovimientoInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.setText("Guardar");
		this.jButtonCerrarEstadoMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoMovimientoInventario,"nuevo_button","Nuevo",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoMovimientoInventario,"modificar_button","Editar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoMovimientoInventario,"actualizar_button","Actualizar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoMovimientoInventario,"eliminar_button","Eliminar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoMovimientoInventario,"cancelar_button","Cancelar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoMovimientoInventario,"guardarcambios_button","Guardar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoMovimientoInventario,"guardarcambiostabla_button","Guardar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoMovimientoInventario,"cerrar_button","Salir",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoMovimientoInventario.setToolTipText("Nuevo"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoMovimientoInventario.setToolTipText("Editar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoMovimientoInventario.setToolTipText("Actualizar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoMovimientoInventario.setToolTipText("Eliminar)"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoMovimientoInventario.setToolTipText("Guardar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.setToolTipText("Guardar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoMovimientoInventario.setToolTipText("Salir"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoMovimientoInventario";
		inputMap = this.jButtonNuevoEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoMovimientoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoMovimientoInventario";
		inputMap = this.jButtonActualizarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoMovimientoInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoMovimientoInventario";
		inputMap = this.jButtonEliminarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoMovimientoInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoMovimientoInventario";
		inputMap = this.jButtonCancelarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoMovimientoInventario"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoMovimientoInventario";
		inputMap = this.jButtonCerrarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoMovimientoInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoMovimientoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoMovimientoInventario.setToolTipText("Nuevo EstadoMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario.setToolTipText("Sin Cerrar Ventana EstadoMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoMovimientoInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoMovimientoInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoMovimientoInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoMovimientoInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoMovimientoInventario = new GridBagLayout();
		
		this.jPanelCamposEstadoMovimientoInventario.setLayout(gridaBagLayoutCamposEstadoMovimientoInventario);
		this.jPanelCamposOcultosEstadoMovimientoInventario.setLayout(gridaBagLayoutCamposOcultosEstadoMovimientoInventario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoMovimientoInventario.add(jLabelIdEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);



	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = 1;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoMovimientoInventario.add(jTextFieldidEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);


	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoMovimientoInventario.add(jLabelcodigoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 2;
		this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoMovimientoInventario.add(jButtoncodigoEstadoMovimientoInventarioBusqueda, this.gridBagConstraintsEstadoMovimientoInventario);
	}

	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = 1;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoMovimientoInventario.add(jTextFieldcodigoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);


	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoMovimientoInventario.add(jLabelnombreEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 2;
		this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoMovimientoInventario.add(jButtonnombreEstadoMovimientoInventarioBusqueda, this.gridBagConstraintsEstadoMovimientoInventario);
	}

	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = 1;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoMovimientoInventario.add(jscrollPanenombreEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = iYPanelCamposEstadoMovimientoInventario;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = iXPanelCamposEstadoMovimientoInventario++;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoMovimientoInventario.add(this.jPanelidEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);



	if(iXPanelCamposEstadoMovimientoInventario % 1==0) {
		iXPanelCamposEstadoMovimientoInventario=0;
		iYPanelCamposEstadoMovimientoInventario++;
	}
	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = iYPanelCamposEstadoMovimientoInventario;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = iXPanelCamposEstadoMovimientoInventario++;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoMovimientoInventario.add(this.jPanelcodigoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);



	if(iXPanelCamposEstadoMovimientoInventario % 1==0) {
		iXPanelCamposEstadoMovimientoInventario=0;
		iYPanelCamposEstadoMovimientoInventario++;
	}
	this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoMovimientoInventario.gridy = iYPanelCamposEstadoMovimientoInventario;
	this.gridBagConstraintsEstadoMovimientoInventario.gridx = iXPanelCamposEstadoMovimientoInventario++;
	this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoMovimientoInventario.add(this.jPanelnombreEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);



	if(iXPanelCamposEstadoMovimientoInventario % 1==0) {
		iXPanelCamposEstadoMovimientoInventario=0;
		iYPanelCamposEstadoMovimientoInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesEstadoMovimientoInventario.setLayout(gridaBagLayoutAccionesEstadoMovimientoInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoMovimientoInventario.setLayout(gridaBagLayoutAccionesFormularioEstadoMovimientoInventario);
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoMovimientoInventario.add(this.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);

		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoMovimientoInventario.add(this.jCheckBoxPostAccionNuevoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoMovimientoInventario.add(this.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoMovimientoInventario.add(this.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoMovimientoInventario.add(this.jButtonModificarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);							

		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoMovimientoInventario.add(this.jButtonEliminarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
			
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoMovimientoInventario.add(this.jButtonActualizarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);


		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoMovimientoInventario.add(this.jButtonGuardarCambiosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);	
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoMovimientoInventario.add(this.jButtonCancelarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoMovimientoInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =0;
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoMovimientoInventario = new EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Movimiento Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Movimiento Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Movimiento Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoMovimientoInventarioModel estadomovimientoinventarioModel=new EstadoMovimientoInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoMovimientoInventarioModel.EstadoMovimientoInventarioFocusTraversalPolicy estadomovimientoinventarioFocusTraversalPolicy = estadomovimientoinventarioModel.new EstadoMovimientoInventarioFocusTraversalPolicy(this);
			
			//estadomovimientoinventarioFocusTraversalPolicy.setestadomovimientoinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadomovimientoinventarioModel);
			
			
			this.jContentPaneDetalleEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoMovimientoInventario = new GridBagLayout();	
			this.jContentPaneDetalleEstadoMovimientoInventario.setLayout(gridaBagLayoutDetalleEstadoMovimientoInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoMovimientoInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoMovimientoInventario.add(jTtoolBarDetalleEstadoMovimientoInventario, gridBagConstraintsEstadoMovimientoInventario);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario=   new JScrollPane(jContentPaneDetalleEstadoMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
	        
			this.jContentPaneDetalleEstadoMovimientoInventario.add(jPanelCamposEstadoMovimientoInventario, gridBagConstraintsEstadoMovimientoInventario);
			
			
			
			
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
						&& estadomovimientoinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameMovimientoInventario(this.puedeCargarPorParteMovimientoInventario,false,-1);
					
					if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoMovimientoInventario= new GridBagConstraints();
						this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
						this.jContentPaneDetalleEstadoMovimientoInventario.add(this.jTabbedPaneRelacionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoMovimientoInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameMovimientoInventario(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoMovimientoInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
					this.gridBagConstraintsEstadoMovimientoInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoMovimientoInventario.add(jPanelCamposOcultosEstadoMovimientoInventario, gridBagConstraintsEstadoMovimientoInventario);
				
					this.jPanelCamposOcultosEstadoMovimientoInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
	        this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoMovimientoInventario.add(this.jPanelAccionesFormularioEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);							
			
			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
	        this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoMovimientoInventario.add(this.jPanelAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoMovimientoInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario=   new JScrollPane(this.jPanelCamposEstadoMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoMovimientoInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
			
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
			
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoMovimientoInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoMovimientoInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameMovimientoInventario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.movimientoinventarioSessionBean=new MovimientoInventarioSessionBean();
		this.movimientoinventarioSessionBean.setConGuardarRelaciones(true);
		this.movimientoinventarioSessionBean.setEsGuardarRelacionado(true);

		this.movimientoinventarioBeanSwingJInternalFrame=null;//new MovimientoInventarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.movimientoinventarioBeanSwingJInternalFramePopup=new MovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.movimientoinventarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {

				MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.movimientoinventarioSessionBean.setEsGuardarRelacionado(true);

				this.movimientoinventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.movimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.movimientoinventarioBeanSwingJInternalFrame.setmovimientoinventarioSessionBean(this.movimientoinventarioSessionBean);

				//this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
				//this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
				//this.jContentPaneDetalleEstadoMovimientoInventario.add(this.movimientoinventarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoMovimientoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoMovimientoInventario.add("Movimiento Inventarios",this.movimientoinventarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoMovimientoInventario.setComponentAt(iIndexTab,this.movimientoinventarioBeanSwingJInternalFrame.getContentPane());
				}

				//MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.movimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				this.movimientoinventarioBeanSwingJInternalFrame=null;//new MovimientoInventarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMovimientoInventario) {
					this.jTabbedPaneRelacionesEstadoMovimientoInventario.add("Movimiento Inventarios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarMovimientoInventarioBeanSwingJInternalFrame(List<EstadoMovimientoInventario> estadomovimientoinventarios,EstadoMovimientoInventario estadomovimientoinventario,MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//movimientoinventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					movimientoinventarioBeanSwingJInternalFrame.getMovimientoInventarioLogic().setConnexion(this.estadomovimientoinventarioLogic.getConnexion());

					movimientoinventarioBeanSwingJInternalFrame.setestadomovimientoinventariosForeignKey(estadomovimientoinventarios);
					movimientoinventarioBeanSwingJInternalFrame.setestadomovimientoinventarioForeignKey(estadomovimientoinventario);
					movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionEstadoMovimientoInventario(true);
					movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.setlidEstadoMovimientoInventarioActual(estadomovimientoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					movimientoinventarioBeanSwingJInternalFrame.cargarCombosForeignKeyMovimientoInventario(movimientoinventarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					movimientoinventarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoMovimientoInventario(true);
					movimientoinventarioBeanSwingJInternalFrame.setid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventario(estadomovimientoinventario.getId());

					if(!this.conCargarFormDetalle) {
						movimientoinventarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					movimientoinventarioBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoMovimientoInventarioForeignKey(estadomovimientoinventario,1,false,true,true);
					movimientoinventarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					movimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoMovimientoInventario");
					movimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoMovimientoInventario");
					movimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaMovimientoInventario(true);
					movimientoinventarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMovimientoInventario("n",movimientoinventarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, movimientoinventarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					movimientoinventarioBeanSwingJInternalFrame.setAutoscrolls(true);
					movimientoinventarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						movimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoInventario("relacionado");
					} else {
						movimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoInventario("no_relacionado");
					}

					movimientoinventarioBeanSwingJInternalFrame.getjButtonRecargarInformacionMovimientoInventario().setVisible(false);

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
