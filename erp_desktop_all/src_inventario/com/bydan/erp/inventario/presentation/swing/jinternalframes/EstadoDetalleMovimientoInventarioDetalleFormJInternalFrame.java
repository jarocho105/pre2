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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.EstadoDetalleMovimientoInventarioConstantesFunciones;

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
public class EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame extends EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarDetalleEstadoDetalleMovimientoInventario;
	
	protected JMenu jmenuDetalleEstadoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleArchivoEstadoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleAccionesEstadoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleDatosEstadoDetalleMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleMovimientoInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetalleMovimientoInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean;
	
	

	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;
	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMovimientoInventario=false;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	
		
	
	public EstadoDetalleMovimientoInventarioLogic estadodetallemovimientoinventarioLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario;
	
	protected JPanel jPanelCamposEstadoDetalleMovimientoInventario;    
	protected JPanel jPanelCamposOcultosEstadoDetalleMovimientoInventario;    	
	protected JPanel jPanelAccionesEstadoDetalleMovimientoInventario;
	protected JPanel jPanelAccionesFormularioEstadoDetalleMovimientoInventario;
    
	
	
	protected Integer iXPanelCamposEstadoDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposEstadoDetalleMovimientoInventario=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposOcultosEstadoDetalleMovimientoInventario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetalleMovimientoInventario;
	public JButton jButtonModificarEstadoDetalleMovimientoInventario;
	public JButton jButtonActualizarEstadoDetalleMovimientoInventario;
    public JButton jButtonEliminarEstadoDetalleMovimientoInventario;
	public JButton jButtonCancelarEstadoDetalleMovimientoInventario;
    public JButton jButtonGuardarCambiosEstadoDetalleMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario;
	protected JButton jButtonCerrarEstadoDetalleMovimientoInventario;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetalleMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonModificarToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonActualizarToolBarEstadoDetalleMovimientoInventario;
    protected JButton jButtonEliminarToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonCancelarToolBarEstadoDetalleMovimientoInventario;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonCerrarToolBarEstadoDetalleMovimientoInventario;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemModificarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemActualizarEstadoDetalleMovimientoInventario;
    protected JMenuItem jMenuItemEliminarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCancelarEstadoDetalleMovimientoInventario;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCerrarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleMovimientoInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleMovimientoInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetalleMovimientoInventario;
	public JLabel jLabelIdEstadoDetalleMovimientoInventario;
	public JTextFieldMe jTextFieldidEstadoDetalleMovimientoInventario;
	public JButton jButtonidEstadoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetalleMovimientoInventario;
	public JLabel jLabelcodigoEstadoDetalleMovimientoInventario;
	public JTextField jTextFieldcodigoEstadoDetalleMovimientoInventario;
	public JButton jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetalleMovimientoInventario;
	public JLabel jLabelnombreEstadoDetalleMovimientoInventario;
	public JTextArea jTextAreanombreEstadoDetalleMovimientoInventario;
	public JScrollPane jscrollPanenombreEstadoDetalleMovimientoInventario;
	public JButton jButtonnombreEstadoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetalleMovimientoInventario;
	
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
	
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetalleMovimientoInventario=new JPanel();
				this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario=new JPanel();
				this.jmenuBarDetalleEstadoDetalleMovimientoInventario=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetalleMovimientoInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetalleMovimientoInventario() {
		return this.jButtonActualizarToolBarEstadoDetalleMovimientoInventario;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetalleMovimientoInventario() {
		return this.jButtonEliminarToolBarEstadoDetalleMovimientoInventario;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetalleMovimientoInventario() {
		return this.jButtonCancelarToolBarEstadoDetalleMovimientoInventario;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetalleMovimientoInventario() {
		return this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleMovimientoInventario)	{
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario = jButtonProcesarInformacionEstadoDetalleMovimientoInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario = jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario = jComboBoxTiposAccionesEstadoDetalleMovimientoInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario = jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
		
		this.estadodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetalleMovimientoInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetalleMovimientoInventario=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetalleMovimientoInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarDetalleEstadoDetalleMovimientoInventario,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarDetalleEstadoDetalleMovimientoInventario,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarDetalleEstadoDetalleMovimientoInventario,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarDetalleEstadoDetalleMovimientoInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetalleMovimientoInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetalleMovimientoInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetalleMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetalleMovimientoInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetalleMovimientoInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetalleMovimientoInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetalleMovimientoInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetalleMovimientoInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetalleMovimientoInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetalleMovimientoInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetalleMovimientoInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetalleMovimientoInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetalleMovimientoInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetalleMovimientoInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetalleMovimientoInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetalleMovimientoInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetalleMovimientoInventario.add(this.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario);
		
		this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemActualizarEstadoDetalleMovimientoInventario);
		this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemEliminarEstadoDetalleMovimientoInventario);
		this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemCancelarEstadoDetalleMovimientoInventario);		
		
		//this.jmenuDetalleDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario);				
		this.jmenuDetalleDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario);				
				
		//this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetalleMovimientoInventario.add(this.jmenuDetalleArchivoEstadoDetalleMovimientoInventario);		
		this.jmenuBarDetalleEstadoDetalleMovimientoInventario.add(this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario);		
		this.jmenuBarDetalleEstadoDetalleMovimientoInventario.add(this.jmenuDetalleDatosEstadoDetalleMovimientoInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDetalleMovimientoInventario.add(this.jmenuDetalleEstadoDetalleMovimientoInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetalleMovimientoInventario);				
	}
	
	
	public void inicializarElementosCamposEstadoDetalleMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetalleMovimientoInventario = new JLabelMe();
		jLabelIdEstadoDetalleMovimientoInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetalleMovimientoInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetalleMovimientoInventario.setToolTipText(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetalleMovimientoInventario= new GridBagLayout();

		this.jPanelidEstadoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutEstadoDetalleMovimientoInventario);

		jTextFieldidEstadoDetalleMovimientoInventario = new JTextFieldMe();
		jTextFieldidEstadoDetalleMovimientoInventario.setText("Id");

		jTextFieldidEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelcodigoEstadoDetalleMovimientoInventario.setText(""+EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetalleMovimientoInventario.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetalleMovimientoInventario.setToolTipText(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelcodigoEstadoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutEstadoDetalleMovimientoInventario);


		jTextFieldcodigoEstadoDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldcodigoEstadoDetalleMovimientoInventario.setEnabled(false);
		jTextFieldcodigoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetalleMovimientoInventarioBusqueda"));

		if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelnombreEstadoDetalleMovimientoInventario.setText(""+EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetalleMovimientoInventario.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetalleMovimientoInventario.setToolTipText(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelnombreEstadoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutEstadoDetalleMovimientoInventario);


		jTextAreanombreEstadoDetalleMovimientoInventario= new JTextAreaMe();
		jTextAreanombreEstadoDetalleMovimientoInventario.setEnabled(false);
		jTextAreanombreEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleMovimientoInventario.setLineWrap(true);
		jTextAreanombreEstadoDetalleMovimientoInventario.setWrapStyleWord(true);
		jTextAreanombreEstadoDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDetalleMovimientoInventario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDetalleMovimientoInventario = new JScrollPane(jTextAreanombreEstadoDetalleMovimientoInventario);
		jscrollPanenombreEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetalleMovimientoInventarioBusqueda"));

		if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetalleMovimientoInventario() {
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
		//this.jInternalFrameDetalleEstadoDetalleMovimientoInventario = new EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Movimiento Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleMovimientoInventario= new GridBagLayout();
		

		
		String sToolTipEstadoDetalleMovimientoInventario="";
		sToolTipEstadoDetalleMovimientoInventario=EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleMovimientoInventario+="(Inventario.EstadoDetalleMovimientoInventario)";
		}
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleMovimientoInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonModificarEstadoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonActualizarEstadoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonEliminarEstadoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonCancelarEstadoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarEstadoDetalleMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Movimiento Inventario";
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetalleMovimientoInventario.setName("jPanelCamposEstadoDetalleMovimientoInventario"); 

		this.jPanelCamposOcultosEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetalleMovimientoInventario.setName("jPanelCamposOcultosEstadoDetalleMovimientoInventario"); 

        this.jPanelAccionesEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleMovimientoInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetalleMovimientoInventario.setText("Nuevo");
		this.jButtonModificarEstadoDetalleMovimientoInventario.setText("Editar");
        this.jButtonActualizarEstadoDetalleMovimientoInventario.setText("Actualizar");
        this.jButtonEliminarEstadoDetalleMovimientoInventario.setText("Eliminar");
        this.jButtonCancelarEstadoDetalleMovimientoInventario.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.setText("Guardar");
		this.jButtonCerrarEstadoDetalleMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleMovimientoInventario,"nuevo_button","Nuevo",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetalleMovimientoInventario,"modificar_button","Editar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetalleMovimientoInventario,"actualizar_button","Actualizar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetalleMovimientoInventario,"eliminar_button","Eliminar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetalleMovimientoInventario,"cancelar_button","Cancelar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetalleMovimientoInventario,"guardarcambios_button","Guardar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleMovimientoInventario,"cerrar_button","Salir",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetalleMovimientoInventario.setToolTipText("Nuevo"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetalleMovimientoInventario.setToolTipText("Editar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetalleMovimientoInventario.setToolTipText("Actualizar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetalleMovimientoInventario.setToolTipText("Eliminar)"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.setToolTipText("Guardar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.setToolTipText("Guardar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleMovimientoInventario.setToolTipText("Salir"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleMovimientoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonActualizarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetalleMovimientoInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonEliminarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetalleMovimientoInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonCancelarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetalleMovimientoInventario"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleMovimientoInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario.setToolTipText("Nuevo EstadoDetalleMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario.setToolTipText("Sin Cerrar Ventana EstadoDetalleMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetalleMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetalleMovimientoInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetalleMovimientoInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetalleMovimientoInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jPanelCamposEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposEstadoDetalleMovimientoInventario);
		this.jPanelCamposOcultosEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposOcultosEstadoDetalleMovimientoInventario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetalleMovimientoInventario.add(jLabelIdEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);



	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetalleMovimientoInventario.add(jTextFieldidEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);


	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetalleMovimientoInventario.add(jLabelcodigoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetalleMovimientoInventario.add(jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
	}

	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetalleMovimientoInventario.add(jTextFieldcodigoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);


	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetalleMovimientoInventario.add(jLabelnombreEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetalleMovimientoInventario.add(jButtonnombreEstadoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
	}

	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetalleMovimientoInventario.add(jscrollPanenombreEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iYPanelCamposEstadoDetalleMovimientoInventario;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iXPanelCamposEstadoDetalleMovimientoInventario++;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleMovimientoInventario.add(this.jPanelidEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);



	if(iXPanelCamposEstadoDetalleMovimientoInventario % 1==0) {
		iXPanelCamposEstadoDetalleMovimientoInventario=0;
		iYPanelCamposEstadoDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iYPanelCamposEstadoDetalleMovimientoInventario;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iXPanelCamposEstadoDetalleMovimientoInventario++;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleMovimientoInventario.add(this.jPanelcodigoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);



	if(iXPanelCamposEstadoDetalleMovimientoInventario % 1==0) {
		iXPanelCamposEstadoDetalleMovimientoInventario=0;
		iYPanelCamposEstadoDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iYPanelCamposEstadoDetalleMovimientoInventario;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iXPanelCamposEstadoDetalleMovimientoInventario++;
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleMovimientoInventario.add(this.jPanelnombreEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);



	if(iXPanelCamposEstadoDetalleMovimientoInventario % 1==0) {
		iXPanelCamposEstadoDetalleMovimientoInventario=0;
		iYPanelCamposEstadoDetalleMovimientoInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesEstadoDetalleMovimientoInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesFormularioEstadoDetalleMovimientoInventario);
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);

		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.add(this.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.add(this.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario.add(this.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleMovimientoInventario.add(this.jButtonModificarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);							

		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleMovimientoInventario.add(this.jButtonEliminarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleMovimientoInventario.add(this.jButtonActualizarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);


		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleMovimientoInventario.add(this.jButtonGuardarCambiosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);	
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleMovimientoInventario.add(this.jButtonCancelarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleMovimientoInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetalleMovimientoInventario = new EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Movimiento Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Movimiento Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Movimiento Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetalleMovimientoInventarioModel estadodetallemovimientoinventarioModel=new EstadoDetalleMovimientoInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetalleMovimientoInventarioModel.EstadoDetalleMovimientoInventarioFocusTraversalPolicy estadodetallemovimientoinventarioFocusTraversalPolicy = estadodetallemovimientoinventarioModel.new EstadoDetalleMovimientoInventarioFocusTraversalPolicy(this);
			
			//estadodetallemovimientoinventarioFocusTraversalPolicy.setestadodetallemovimientoinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetallemovimientoinventarioModel);
			
			
			this.jContentPaneDetalleEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetalleMovimientoInventario = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutDetalleEstadoDetalleMovimientoInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleMovimientoInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(jTtoolBarDetalleEstadoDetalleMovimientoInventario, gridBagConstraintsEstadoDetalleMovimientoInventario);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario=   new JScrollPane(jContentPaneDetalleEstadoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(jPanelCamposEstadoDetalleMovimientoInventario, gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			
			
			
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
						&& estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(this.puedeCargarPorParteDetalleMovimientoInventario,false,-1);
					
					if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetalleMovimientoInventario= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
						this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetalleMovimientoInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(jPanelCamposOcultosEstadoDetalleMovimientoInventario, gridBagConstraintsEstadoDetalleMovimientoInventario);
				
					this.jPanelCamposOcultosEstadoDetalleMovimientoInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
	        this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);							
			
			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(this.jPanelAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario=   new JScrollPane(this.jPanelCamposEstadoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		this.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
		this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

		this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {

				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

				this.detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemovimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemovimientoinventarioBeanSwingJInternalFrame.setdetallemovimientoinventarioSessionBean(this.detallemovimientoinventarioSessionBean);

				//this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleMovimientoInventario.add(this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleMovimientoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.add("Detalle Movimiento Inventarios",this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setComponentAt(iIndexTab,this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMovimientoInventario) {
					this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.add("Detalle Movimiento Inventarios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios,EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().setConnexion(this.estadodetallemovimientoinventarioLogic.getConnexion());

					detallemovimientoinventarioBeanSwingJInternalFrame.setestadodetallemovimientoinventariosForeignKey(estadodetallemovimientoinventarios);
					detallemovimientoinventarioBeanSwingJInternalFrame.setestadodetallemovimientoinventarioForeignKey(estadodetallemovimientoinventario);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setlidEstadoDetalleMovimientoInventarioActual(estadodetallemovimientoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemovimientoinventarioBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setid_estado_detalle_movimiento_inventarioFK_IdEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario.getId());

					if(!this.conCargarFormDetalle) {
						detallemovimientoinventarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleMovimientoInventarioForeignKey(estadodetallemovimientoinventario,1,false,true,true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemovimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleMovimientoInventario");
					detallemovimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleMovimientoInventario");
					detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMovimientoInventario("n",detallemovimientoinventarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemovimientoinventarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemovimientoinventarioBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("relacionado");
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMovimientoInventario().setVisible(false);

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
