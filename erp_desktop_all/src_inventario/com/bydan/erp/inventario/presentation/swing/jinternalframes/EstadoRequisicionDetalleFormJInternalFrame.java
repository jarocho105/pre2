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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.EstadoRequisicionConstantesFunciones;

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
public class EstadoRequisicionDetalleFormJInternalFrame extends EstadoRequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoRequisicion;
	
	protected JMenuBar jmenuBarDetalleEstadoRequisicion;
	
	protected JMenu jmenuDetalleEstadoRequisicion;
	protected JMenu jmenuDetalleArchivoEstadoRequisicion;
	protected JMenu jmenuDetalleAccionesEstadoRequisicion;
	protected JMenu jmenuDetalleDatosEstadoRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRequisicion;	
	protected GridBagConstraints gridBagConstraintsEstadoRequisicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoRequisicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoRequisicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRequisicionSessionBean estadorequisicionSessionBean;
	
	

	public RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame=null;
	public RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRequisicionCompra=false;
	public RequisicionCompraSessionBean requisicioncompraSessionBean;
	
		
	
	public EstadoRequisicionLogic estadorequisicionLogic;
	
	public JScrollPane jScrollPanelDatosEstadoRequisicion;
	public JScrollPane jScrollPanelDatosEdicionEstadoRequisicion;
	public JScrollPane jScrollPanelDatosGeneralEstadoRequisicion;
	
	protected JPanel jPanelCamposEstadoRequisicion;    
	protected JPanel jPanelCamposOcultosEstadoRequisicion;    	
	protected JPanel jPanelAccionesEstadoRequisicion;
	protected JPanel jPanelAccionesFormularioEstadoRequisicion;
    
	
	
	protected Integer iXPanelCamposEstadoRequisicion=0;
	protected Integer iYPanelCamposEstadoRequisicion=0;
	
	protected Integer iXPanelCamposOcultosEstadoRequisicion=0;
	protected Integer iYPanelCamposOcultosEstadoRequisicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoRequisicion;
	public JButton jButtonModificarEstadoRequisicion;
	public JButton jButtonActualizarEstadoRequisicion;
    public JButton jButtonEliminarEstadoRequisicion;
	public JButton jButtonCancelarEstadoRequisicion;
    public JButton jButtonGuardarCambiosEstadoRequisicion;
	public JButton jButtonGuardarCambiosTablaEstadoRequisicion;
	protected JButton jButtonCerrarEstadoRequisicion;
	
	
	protected JButton jButtonProcesarInformacionEstadoRequisicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoRequisicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRequisicion;
	protected JButton jButtonModificarToolBarEstadoRequisicion;
	protected JButton jButtonActualizarToolBarEstadoRequisicion;
    protected JButton jButtonEliminarToolBarEstadoRequisicion;
	protected JButton jButtonCancelarToolBarEstadoRequisicion;
    protected JButton jButtonGuardarCambiosToolBarEstadoRequisicion;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRequisicion;
	protected JButton jButtonCerrarToolBarEstadoRequisicion;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRequisicion;
	protected JMenuItem jMenuItemModificarEstadoRequisicion;
	protected JMenuItem jMenuItemActualizarEstadoRequisicion;
    protected JMenuItem jMenuItemEliminarEstadoRequisicion;
	protected JMenuItem jMenuItemCancelarEstadoRequisicion;
    protected JMenuItem jMenuItemGuardarCambiosEstadoRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRequisicion;
	protected JMenuItem jMenuItemCerrarEstadoRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRequisicion;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRequisicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRequisicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoRequisicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoRequisicion;
	public JLabel jLabelIdEstadoRequisicion;
	public JTextFieldMe jTextFieldidEstadoRequisicion;
	public JButton jButtonidEstadoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoRequisicion;
	public JLabel jLabelcodigoEstadoRequisicion;
	public JTextField jTextFieldcodigoEstadoRequisicion;
	public JButton jButtoncodigoEstadoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoRequisicion;
	public JLabel jLabelnombreEstadoRequisicion;
	public JTextField jTextFieldnombreEstadoRequisicion;
	public JButton jButtonnombreEstadoRequisicionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoRequisicion;
	
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
	
	public EstadoRequisicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoRequisicion=new JPanel();
				this.jPanelAccionesFormularioEstadoRequisicion=new JPanel();
				this.jmenuBarDetalleEstadoRequisicion=new JMenuBar();
				this.jTtoolBarDetalleEstadoRequisicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoRequisicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRequisicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoRequisicion() {
		return this.jButtonActualizarToolBarEstadoRequisicion;
	}
	
	public JButton getjButtonEliminarToolBarEstadoRequisicion() {
		return this.jButtonEliminarToolBarEstadoRequisicion;
	}
	
	public JButton getjButtonCancelarToolBarEstadoRequisicion() {
		return this.jButtonCancelarToolBarEstadoRequisicion;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoRequisicion() {
		return this.jButtonProcesarInformacionEstadoRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRequisicion)	{
		this.jButtonProcesarInformacionEstadoRequisicion = jButtonProcesarInformacionEstadoRequisicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRequisicion() {
		return this.jComboBoxTiposAccionesEstadoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRequisicion(
			JComboBox jComboBoxTiposRelacionesEstadoRequisicion) {
		this.jComboBoxTiposRelacionesEstadoRequisicion = jComboBoxTiposRelacionesEstadoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRequisicion(
			JComboBox jComboBoxTiposAccionesEstadoRequisicion) {
		this.jComboBoxTiposAccionesEstadoRequisicion = jComboBoxTiposAccionesEstadoRequisicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoRequisicion() {
		return this.jComboBoxTiposAccionesFormularioEstadoRequisicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoRequisicion(
			JComboBox jComboBoxTiposAccionesFormularioEstadoRequisicion) {
		this.jComboBoxTiposAccionesFormularioEstadoRequisicion = jComboBoxTiposAccionesFormularioEstadoRequisicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
		
		this.estadorequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadorequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadorequisicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Requisicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoRequisicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoRequisicion=new JButtonMe();
				this.jButtonModificarToolBarEstadoRequisicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoRequisicion,this.jTtoolBarDetalleEstadoRequisicion,
							"actualizar","actualizar","Actualizar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoRequisicion,this.jTtoolBarDetalleEstadoRequisicion,
							"eliminar","eliminar","Eliminar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoRequisicion,this.jTtoolBarDetalleEstadoRequisicion,
							"cancelar","cancelar","Cancelar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoRequisicion,this.jTtoolBarDetalleEstadoRequisicion,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoRequisicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoRequisicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoRequisicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoRequisicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoRequisicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoRequisicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoRequisicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoRequisicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoRequisicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoRequisicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoRequisicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoRequisicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoRequisicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoRequisicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoRequisicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoRequisicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoRequisicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoRequisicion.add(this.jMenuItemDetalleCerrarEstadoRequisicion);
		
		this.jmenuDetalleAccionesEstadoRequisicion.add(this.jMenuItemActualizarEstadoRequisicion);
		this.jmenuDetalleAccionesEstadoRequisicion.add(this.jMenuItemEliminarEstadoRequisicion);
		this.jmenuDetalleAccionesEstadoRequisicion.add(this.jMenuItemCancelarEstadoRequisicion);		
		
		//this.jmenuDetalleDatosEstadoRequisicion.add(this.jMenuItemDetalleAbrirOrderByEstadoRequisicion);				
		this.jmenuDetalleDatosEstadoRequisicion.add(this.jMenuItemDetalleMostarOcultarEstadoRequisicion);				
				
		//this.jmenuDetalleAccionesEstadoRequisicion.add(this.jMenuItemGuardarCambiosEstadoRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoRequisicion.add(this.jmenuDetalleArchivoEstadoRequisicion);		
		this.jmenuBarDetalleEstadoRequisicion.add(this.jmenuDetalleAccionesEstadoRequisicion);		
		this.jmenuBarDetalleEstadoRequisicion.add(this.jmenuDetalleDatosEstadoRequisicion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoRequisicion.add(this.jmenuDetalleEstadoRequisicion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoRequisicion);				
	}
	
	
	public void inicializarElementosCamposEstadoRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoRequisicion = new JLabelMe();
		jLabelIdEstadoRequisicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoRequisicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoRequisicion.setToolTipText(EstadoRequisicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoRequisicion= new GridBagLayout();

		this.jPanelidEstadoRequisicion.setLayout(this.gridaBagLayoutEstadoRequisicion);

		jTextFieldidEstadoRequisicion = new JTextFieldMe();
		jTextFieldidEstadoRequisicion.setText("Id");

		jTextFieldidEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoRequisicion = new JLabelMe();
		this.jLabelcodigoEstadoRequisicion.setText(""+EstadoRequisicionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoRequisicion.setToolTipText("Codigo");
		this.jLabelcodigoEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoRequisicion.setToolTipText(EstadoRequisicionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoRequisicion = new GridBagLayout();
		this.jPanelcodigoEstadoRequisicion.setLayout(this.gridaBagLayoutEstadoRequisicion);


		jTextFieldcodigoEstadoRequisicion= new JTextFieldMe();

		jTextFieldcodigoEstadoRequisicion.setEnabled(false);
		jTextFieldcodigoEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoRequisicionBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoRequisicionBusqueda.setText("U");
		this.jButtoncodigoEstadoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoRequisicionBusqueda"));

		if(this.estadorequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoRequisicionBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoRequisicion = new JLabelMe();
		this.jLabelnombreEstadoRequisicion.setText(""+EstadoRequisicionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoRequisicion.setToolTipText("Nombre");
		this.jLabelnombreEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoRequisicion.setToolTipText(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoRequisicion = new GridBagLayout();
		this.jPanelnombreEstadoRequisicion.setLayout(this.gridaBagLayoutEstadoRequisicion);


		jTextFieldnombreEstadoRequisicion= new JTextFieldMe();

		jTextFieldnombreEstadoRequisicion.setEnabled(false);
		jTextFieldnombreEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreEstadoRequisicionBusqueda= new JButtonMe();
		this.jButtonnombreEstadoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoRequisicionBusqueda.setText("U");
		this.jButtonnombreEstadoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreEstadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreEstadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoRequisicionBusqueda"));

		if(this.estadorequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoRequisicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoRequisicion() {
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
		//this.jInternalFrameDetalleEstadoRequisicion = new EstadoRequisicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Requisicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRequisicion= new GridBagLayout();
		

		
		String sToolTipEstadoRequisicion="";
		sToolTipEstadoRequisicion=EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRequisicion+="(Inventario.EstadoRequisicion)";
		}
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRequisicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoRequisicion = new JButtonMe();
		this.jButtonModificarEstadoRequisicion = new JButtonMe();
        this.jButtonActualizarEstadoRequisicion = new JButtonMe();
        this.jButtonEliminarEstadoRequisicion = new JButtonMe();
        this.jButtonCancelarEstadoRequisicion = new JButtonMe();
        this.jButtonGuardarCambiosEstadoRequisicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoRequisicion = new JButtonMe();
		this.jButtonCerrarEstadoRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRequisicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoRequisicion = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoRequisicion = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Requisicion";
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Requisiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoRequisicion.setName("jPanelCamposEstadoRequisicion"); 

		this.jPanelCamposOcultosEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoRequisicion.setName("jPanelCamposOcultosEstadoRequisicion"); 

        this.jPanelAccionesEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRequisicion.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoRequisicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoRequisicion.setText("Nuevo");
		this.jButtonModificarEstadoRequisicion.setText("Editar");
        this.jButtonActualizarEstadoRequisicion.setText("Actualizar");
        this.jButtonEliminarEstadoRequisicion.setText("Eliminar");
        this.jButtonCancelarEstadoRequisicion.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoRequisicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoRequisicion.setText("Guardar");
		this.jButtonCerrarEstadoRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRequisicion,"nuevo_button","Nuevo",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoRequisicion,"modificar_button","Editar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoRequisicion,"actualizar_button","Actualizar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoRequisicion,"eliminar_button","Eliminar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoRequisicion,"cancelar_button","Cancelar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoRequisicion,"guardarcambios_button","Guardar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRequisicion,"guardarcambiostabla_button","Guardar",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRequisicion,"cerrar_button","Salir",this.estadorequisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoRequisicion.setToolTipText("Nuevo"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoRequisicion.setToolTipText("Editar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoRequisicion.setToolTipText("Actualizar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoRequisicion.setToolTipText("Eliminar)"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoRequisicion.setToolTipText("Cancelar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoRequisicion.setToolTipText("Guardar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoRequisicion.setToolTipText("Guardar"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRequisicion.setToolTipText("Salir"+" "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRequisicion";
		inputMap = this.jButtonNuevoEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRequisicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoRequisicion";
		inputMap = this.jButtonActualizarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoRequisicion"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoRequisicion";
		inputMap = this.jButtonEliminarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoRequisicion"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoRequisicion";
		inputMap = this.jButtonCancelarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoRequisicion"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoRequisicion";
		inputMap = this.jButtonCerrarEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRequisicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoRequisicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoRequisicion.setToolTipText("Nuevo EstadoRequisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoRequisicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoRequisicion.setToolTipText("Sin Cerrar Ventana EstadoRequisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoRequisicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoRequisicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRequisicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoRequisicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoRequisicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoRequisicion = new JLabelMe();
		
		this.jLabelAccionesEstadoRequisicion.setText("Acciones");		
		this.jLabelAccionesEstadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoRequisicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoRequisicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoRequisicion=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoRequisicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRequisicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRequisicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoRequisicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoRequisicion = new GridBagLayout();
		
		this.jPanelCamposEstadoRequisicion.setLayout(gridaBagLayoutCamposEstadoRequisicion);
		this.jPanelCamposOcultosEstadoRequisicion.setLayout(gridaBagLayoutCamposOcultosEstadoRequisicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRequisicion.gridy = 0;
	this.gridBagConstraintsEstadoRequisicion.gridx = 0;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoRequisicion.add(jLabelIdEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);



	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRequisicion.gridy = 0;
	this.gridBagConstraintsEstadoRequisicion.gridx = 1;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoRequisicion.add(jTextFieldidEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);


	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRequisicion.gridy = 0;
	this.gridBagConstraintsEstadoRequisicion.gridx = 0;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoRequisicion.add(jLabelcodigoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;
		this.gridBagConstraintsEstadoRequisicion.gridx = 2;
		this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
		this.gridBagConstraintsEstadoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoRequisicion.add(jButtoncodigoEstadoRequisicionBusqueda, this.gridBagConstraintsEstadoRequisicion);
	}

	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRequisicion.gridy = 0;
	this.gridBagConstraintsEstadoRequisicion.gridx = 1;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoRequisicion.add(jTextFieldcodigoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);


	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRequisicion.gridy = 0;
	this.gridBagConstraintsEstadoRequisicion.gridx = 0;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoRequisicion.add(jLabelnombreEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;
		this.gridBagConstraintsEstadoRequisicion.gridx = 2;
		this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
		this.gridBagConstraintsEstadoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoRequisicion.add(jButtonnombreEstadoRequisicionBusqueda, this.gridBagConstraintsEstadoRequisicion);
	}

	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRequisicion.gridy = 0;
	this.gridBagConstraintsEstadoRequisicion.gridx = 1;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoRequisicion.add(jTextFieldnombreEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRequisicion.gridy = iYPanelCamposEstadoRequisicion;
	this.gridBagConstraintsEstadoRequisicion.gridx = iXPanelCamposEstadoRequisicion++;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRequisicion.add(this.jPanelidEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);



	if(iXPanelCamposEstadoRequisicion % 1==0) {
		iXPanelCamposEstadoRequisicion=0;
		iYPanelCamposEstadoRequisicion++;
	}
	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRequisicion.gridy = iYPanelCamposEstadoRequisicion;
	this.gridBagConstraintsEstadoRequisicion.gridx = iXPanelCamposEstadoRequisicion++;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRequisicion.add(this.jPanelcodigoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);



	if(iXPanelCamposEstadoRequisicion % 1==0) {
		iXPanelCamposEstadoRequisicion=0;
		iYPanelCamposEstadoRequisicion++;
	}
	this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRequisicion.gridy = iYPanelCamposEstadoRequisicion;
	this.gridBagConstraintsEstadoRequisicion.gridx = iXPanelCamposEstadoRequisicion++;
	this.gridBagConstraintsEstadoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRequisicion.add(this.jPanelnombreEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);



	if(iXPanelCamposEstadoRequisicion % 1==0) {
		iXPanelCamposEstadoRequisicion=0;
		iYPanelCamposEstadoRequisicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoRequisicion= new GridBagLayout();
		this.jPanelAccionesEstadoRequisicion.setLayout(gridaBagLayoutAccionesEstadoRequisicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoRequisicion= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoRequisicion.setLayout(gridaBagLayoutAccionesFormularioEstadoRequisicion);
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRequisicion.add(this.jComboBoxTiposAccionesFormularioEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);

		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRequisicion.add(this.jCheckBoxPostAccionNuevoEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRequisicion.add(this.jCheckBoxPostAccionSinCerrarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRequisicion.add(this.jCheckBoxPostAccionSinMensajeEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoRequisicion.add(this.jButtonModificarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);							

		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;
		this.gridBagConstraintsEstadoRequisicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoRequisicion.add(this.jButtonEliminarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
			
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRequisicion.add(this.jButtonActualizarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);


		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;		
		this.gridBagConstraintsEstadoRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRequisicion.add(this.jButtonGuardarCambiosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);	
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = 0;		
		this.gridBagConstraintsEstadoRequisicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoRequisicion.add(this.jButtonCancelarEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRequisicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRequisicion.gridx = 0;		
			//this.gridBagConstraintsEstadoRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRequisicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRequisicion.gridx =0;
		this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoRequisicion = new EstadoRequisicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Requisicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Requisicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Requisicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoRequisicionModel estadorequisicionModel=new EstadoRequisicionModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoRequisicionModel.EstadoRequisicionFocusTraversalPolicy estadorequisicionFocusTraversalPolicy = estadorequisicionModel.new EstadoRequisicionFocusTraversalPolicy(this);
			
			//estadorequisicionFocusTraversalPolicy.setestadorequisicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadorequisicionModel);
			
			
			this.jContentPaneDetalleEstadoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoRequisicion = new GridBagLayout();	
			this.jContentPaneDetalleEstadoRequisicion.setLayout(gridaBagLayoutDetalleEstadoRequisicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRequisicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoRequisicion.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoRequisicion.add(jTtoolBarDetalleEstadoRequisicion, gridBagConstraintsEstadoRequisicion);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoRequisicion=   new JScrollPane(jContentPaneDetalleEstadoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoRequisicion.gridx = 0;
	        
			this.jContentPaneDetalleEstadoRequisicion.add(jPanelCamposEstadoRequisicion, gridBagConstraintsEstadoRequisicion);
			
			
			
			
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
						&& estadorequisicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRequisicionCompra(this.puedeCargarPorParteRequisicionCompra,false,-1);
					
					if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoRequisicion= new GridBagConstraints();
						this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoRequisicion.gridx = 0;
						this.jContentPaneDetalleEstadoRequisicion.add(this.jTabbedPaneRelacionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoRequisicion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRequisicionCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoRequisicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
					this.gridBagConstraintsEstadoRequisicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoRequisicion.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoRequisicion.add(jPanelCamposOcultosEstadoRequisicion, gridBagConstraintsEstadoRequisicion);
				
					this.jPanelCamposOcultosEstadoRequisicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoRequisicion.gridx = 0;
	        this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoRequisicion.add(this.jPanelAccionesFormularioEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);							
			
			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
	        this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoRequisicion.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoRequisicion.add(this.jPanelAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoRequisicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoRequisicion=   new JScrollPane(this.jPanelCamposEstadoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRequisicion.gridx = 0;
			this.gridBagConstraintsEstadoRequisicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoRequisicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoRequisicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);			
			
			this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
			
			
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		
			
		this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRequisicion, this.gridBagConstraintsEstadoRequisicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoRequisicion;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoRequisicion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRequisicionCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
		this.requisicioncompraSessionBean.setConGuardarRelaciones(true);
		this.requisicioncompraSessionBean.setEsGuardarRelacionado(true);

		this.requisicioncompraBeanSwingJInternalFrame=null;//new RequisicionCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.requisicioncompraBeanSwingJInternalFramePopup=new RequisicionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.requisicioncompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {

				RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;
				RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.requisicioncompraSessionBean.setEsGuardarRelacionado(true);

				this.requisicioncompraBeanSwingJInternalFrame=new RequisicionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.requisicioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.requisicioncompraBeanSwingJInternalFrame.setrequisicioncompraSessionBean(this.requisicioncompraSessionBean);

				//this.gridBagConstraintsEstadoRequisicion = new GridBagConstraints();
				//this.gridBagConstraintsEstadoRequisicion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoRequisicion.gridx = 0;
				//this.jContentPaneDetalleEstadoRequisicion.add(this.requisicioncompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoRequisicion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoRequisicion.add("Requisicion Compras",this.requisicioncompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoRequisicion.setComponentAt(iIndexTab,this.requisicioncompraBeanSwingJInternalFrame.getContentPane());
				}

				//RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.requisicioncompraSessionBean.setEsGuardarRelacionado(false);
				this.requisicioncompraBeanSwingJInternalFrame=null;//new RequisicionCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRequisicionCompra) {
					this.jTabbedPaneRelacionesEstadoRequisicion.add("Requisicion Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRequisicionCompraBeanSwingJInternalFrame(List<EstadoRequisicion> estadorequisicions,EstadoRequisicion estadorequisicion,RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//requisicioncompraBeanSwingJInternalFrame=new RequisicionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					requisicioncompraBeanSwingJInternalFrame.getRequisicionCompraLogic().setConnexion(this.estadorequisicionLogic.getConnexion());

					requisicioncompraBeanSwingJInternalFrame.setestadorequisicioncomprasForeignKey(estadorequisicions);
					requisicioncompraBeanSwingJInternalFrame.setestadorequisicioncompraForeignKey(estadorequisicion);
					requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRequisicionCompra(true);
					requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setlidEstadoRequisicionCompraActual(estadorequisicion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					requisicioncompraBeanSwingJInternalFrame.cargarCombosForeignKeyRequisicionCompra(requisicioncompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					requisicioncompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoRequisicionCompra(true);
					requisicioncompraBeanSwingJInternalFrame.setid_estado_requisicion_compraFK_IdEstadoRequisicionCompra(estadorequisicion.getId());

					if(!this.conCargarFormDetalle) {
						requisicioncompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					requisicioncompraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoRequisicionCompraForeignKey(estadorequisicion,1,false,true,true);
					requisicioncompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					requisicioncompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoRequisicion");
					requisicioncompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoRequisicion");
					requisicioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaRequisicionCompra(true);
					requisicioncompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRequisicionCompra("n",requisicioncompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, requisicioncompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					requisicioncompraBeanSwingJInternalFrame.setAutoscrolls(true);
					requisicioncompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						requisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsRequisicionCompra("relacionado");
					} else {
						requisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsRequisicionCompra("no_relacionado");
					}

					requisicioncompraBeanSwingJInternalFrame.getjButtonRecargarInformacionRequisicionCompra().setVisible(false);

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
