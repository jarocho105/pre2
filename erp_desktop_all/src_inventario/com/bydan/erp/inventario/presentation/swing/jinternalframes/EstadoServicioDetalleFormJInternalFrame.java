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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.EstadoServicioConstantesFunciones;

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
public class EstadoServicioDetalleFormJInternalFrame extends EstadoServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoServicio;
	
	protected JMenuBar jmenuBarDetalleEstadoServicio;
	
	protected JMenu jmenuDetalleEstadoServicio;
	protected JMenu jmenuDetalleArchivoEstadoServicio;
	protected JMenu jmenuDetalleAccionesEstadoServicio;
	protected JMenu jmenuDetalleDatosEstadoServicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoServicio;	
	protected GridBagConstraints gridBagConstraintsEstadoServicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoServicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoServicio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoServicioSessionBean estadoservicioSessionBean;
	
	
	
		
	
	public EstadoServicioLogic estadoservicioLogic;
	
	public JScrollPane jScrollPanelDatosEstadoServicio;
	public JScrollPane jScrollPanelDatosEdicionEstadoServicio;
	public JScrollPane jScrollPanelDatosGeneralEstadoServicio;
	
	protected JPanel jPanelCamposEstadoServicio;    
	protected JPanel jPanelCamposOcultosEstadoServicio;    	
	protected JPanel jPanelAccionesEstadoServicio;
	protected JPanel jPanelAccionesFormularioEstadoServicio;
    
	
	
	protected Integer iXPanelCamposEstadoServicio=0;
	protected Integer iYPanelCamposEstadoServicio=0;
	
	protected Integer iXPanelCamposOcultosEstadoServicio=0;
	protected Integer iYPanelCamposOcultosEstadoServicio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoServicio;
	public JButton jButtonModificarEstadoServicio;
	public JButton jButtonActualizarEstadoServicio;
    public JButton jButtonEliminarEstadoServicio;
	public JButton jButtonCancelarEstadoServicio;
    public JButton jButtonGuardarCambiosEstadoServicio;
	public JButton jButtonGuardarCambiosTablaEstadoServicio;
	protected JButton jButtonCerrarEstadoServicio;
	
	
	protected JButton jButtonProcesarInformacionEstadoServicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoServicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoServicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoServicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoServicio;
	protected JButton jButtonModificarToolBarEstadoServicio;
	protected JButton jButtonActualizarToolBarEstadoServicio;
    protected JButton jButtonEliminarToolBarEstadoServicio;
	protected JButton jButtonCancelarToolBarEstadoServicio;
    protected JButton jButtonGuardarCambiosToolBarEstadoServicio;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoServicio;
	protected JButton jButtonCerrarToolBarEstadoServicio;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoServicio;
	protected JMenuItem jMenuItemModificarEstadoServicio;
	protected JMenuItem jMenuItemActualizarEstadoServicio;
    protected JMenuItem jMenuItemEliminarEstadoServicio;
	protected JMenuItem jMenuItemCancelarEstadoServicio;
    protected JMenuItem jMenuItemGuardarCambiosEstadoServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoServicio;
	protected JMenuItem jMenuItemCerrarEstadoServicio;
	protected JMenuItem jMenuItemDetalleCerrarEstadoServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoServicio;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoServicio;
	protected JMenuItem jMenuItemMostrarOcultarEstadoServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoServicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoServicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoServicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoServicio;
	public JLabel jLabelIdEstadoServicio;
	public JTextFieldMe jTextFieldidEstadoServicio;
	public JButton jButtonidEstadoServicioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoServicio;
	public JLabel jLabelcodigoEstadoServicio;
	public JTextField jTextFieldcodigoEstadoServicio;
	public JButton jButtoncodigoEstadoServicioBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoServicio;
	public JLabel jLabelnombreEstadoServicio;
	public JTextField jTextFieldnombreEstadoServicio;
	public JButton jButtonnombreEstadoServicioBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoEstadoServicio;
	public JLabel jLabeles_defectoEstadoServicio;
	public JCheckBox jCheckBoxes_defectoEstadoServicio;
	public JButton jButtones_defectoEstadoServicioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoServicio;
	
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
	
	public EstadoServicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoServicio=new JPanel();
				this.jPanelAccionesFormularioEstadoServicio=new JPanel();
				this.jmenuBarDetalleEstadoServicio=new JMenuBar();
				this.jTtoolBarDetalleEstadoServicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoServicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoServicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoServicio() {
		return this.jButtonActualizarToolBarEstadoServicio;
	}
	
	public JButton getjButtonEliminarToolBarEstadoServicio() {
		return this.jButtonEliminarToolBarEstadoServicio;
	}
	
	public JButton getjButtonCancelarToolBarEstadoServicio() {
		return this.jButtonCancelarToolBarEstadoServicio;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoServicio() {
		return this.jButtonProcesarInformacionEstadoServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoServicio)	{
		this.jButtonProcesarInformacionEstadoServicio = jButtonProcesarInformacionEstadoServicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoServicio() {
		return this.jComboBoxTiposAccionesEstadoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoServicio(
			JComboBox jComboBoxTiposRelacionesEstadoServicio) {
		this.jComboBoxTiposRelacionesEstadoServicio = jComboBoxTiposRelacionesEstadoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoServicio(
			JComboBox jComboBoxTiposAccionesEstadoServicio) {
		this.jComboBoxTiposAccionesEstadoServicio = jComboBoxTiposAccionesEstadoServicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoServicio() {
		return this.jComboBoxTiposAccionesFormularioEstadoServicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoServicio(
			JComboBox jComboBoxTiposAccionesFormularioEstadoServicio) {
		this.jComboBoxTiposAccionesFormularioEstadoServicio = jComboBoxTiposAccionesFormularioEstadoServicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoservicioSessionBean=new EstadoServicioSessionBean();
		
		this.estadoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoservicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoServicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoServicio=new JButtonMe();
				this.jButtonModificarToolBarEstadoServicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoServicio,this.jTtoolBarDetalleEstadoServicio,
							"actualizar","actualizar","Actualizar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoServicio,this.jTtoolBarDetalleEstadoServicio,
							"eliminar","eliminar","Eliminar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoServicio,this.jTtoolBarDetalleEstadoServicio,
							"cancelar","cancelar","Cancelar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoServicio,this.jTtoolBarDetalleEstadoServicio,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoServicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoServicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoServicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoServicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoServicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoServicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoServicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoServicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoServicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoServicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoServicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoServicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoServicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoServicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoServicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoServicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoServicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoServicio.add(this.jMenuItemDetalleCerrarEstadoServicio);
		
		this.jmenuDetalleAccionesEstadoServicio.add(this.jMenuItemActualizarEstadoServicio);
		this.jmenuDetalleAccionesEstadoServicio.add(this.jMenuItemEliminarEstadoServicio);
		this.jmenuDetalleAccionesEstadoServicio.add(this.jMenuItemCancelarEstadoServicio);		
		
		//this.jmenuDetalleDatosEstadoServicio.add(this.jMenuItemDetalleAbrirOrderByEstadoServicio);				
		this.jmenuDetalleDatosEstadoServicio.add(this.jMenuItemDetalleMostarOcultarEstadoServicio);				
				
		//this.jmenuDetalleAccionesEstadoServicio.add(this.jMenuItemGuardarCambiosEstadoServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoServicio.add(this.jmenuDetalleArchivoEstadoServicio);		
		this.jmenuBarDetalleEstadoServicio.add(this.jmenuDetalleAccionesEstadoServicio);		
		this.jmenuBarDetalleEstadoServicio.add(this.jmenuDetalleDatosEstadoServicio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoServicio);				
	}
	
	
	public void inicializarElementosCamposEstadoServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoServicio = new JLabelMe();
		jLabelIdEstadoServicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoServicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoServicio.setToolTipText(EstadoServicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoServicio= new GridBagLayout();

		this.jPanelidEstadoServicio.setLayout(this.gridaBagLayoutEstadoServicio);

		jTextFieldidEstadoServicio = new JTextFieldMe();
		jTextFieldidEstadoServicio.setText("Id");

		jTextFieldidEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoServicio = new JLabelMe();
		this.jLabelcodigoEstadoServicio.setText(""+EstadoServicioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoServicio.setToolTipText("Codigo");
		this.jLabelcodigoEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoServicio.setToolTipText(EstadoServicioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoServicio = new GridBagLayout();
		this.jPanelcodigoEstadoServicio.setLayout(this.gridaBagLayoutEstadoServicio);


		jTextFieldcodigoEstadoServicio= new JTextFieldMe();

		jTextFieldcodigoEstadoServicio.setEnabled(false);
		jTextFieldcodigoEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoServicioBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoServicioBusqueda.setText("U");
		this.jButtoncodigoEstadoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoServicioBusqueda"));

		if(this.estadoservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoServicioBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoServicio = new JLabelMe();
		this.jLabelnombreEstadoServicio.setText(""+EstadoServicioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoServicio.setToolTipText("Nombre");
		this.jLabelnombreEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoServicio.setToolTipText(EstadoServicioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoServicio = new GridBagLayout();
		this.jPanelnombreEstadoServicio.setLayout(this.gridaBagLayoutEstadoServicio);


		jTextFieldnombreEstadoServicio= new JTextFieldMe();

		jTextFieldnombreEstadoServicio.setEnabled(false);
		jTextFieldnombreEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreEstadoServicioBusqueda= new JButtonMe();
		this.jButtonnombreEstadoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoServicioBusqueda.setText("U");
		this.jButtonnombreEstadoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreEstadoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreEstadoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoServicioBusqueda"));

		if(this.estadoservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoServicioBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoEstadoServicio = new JLabelMe();
		this.jLabeles_defectoEstadoServicio.setText(""+EstadoServicioConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoEstadoServicio.setToolTipText("Es Defecto");
		this.jLabeles_defectoEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoEstadoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoEstadoServicio.setToolTipText(EstadoServicioConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutEstadoServicio = new GridBagLayout();
		this.jPaneles_defectoEstadoServicio.setLayout(this.gridaBagLayoutEstadoServicio);


		jCheckBoxes_defectoEstadoServicio= new JCheckBoxMe();
		jCheckBoxes_defectoEstadoServicio.setEnabled(false);

		jCheckBoxes_defectoEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoEstadoServicioBusqueda= new JButtonMe();
		this.jButtones_defectoEstadoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoEstadoServicioBusqueda.setText("U");
		this.jButtones_defectoEstadoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoEstadoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoEstadoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoEstadoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoEstadoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoEstadoServicioBusqueda"));

		if(this.estadoservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoEstadoServicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoServicio() {
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
		//this.jInternalFrameDetalleEstadoServicio = new EstadoServicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Servicio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoServicio= new GridBagLayout();
		

		
		String sToolTipEstadoServicio="";
		sToolTipEstadoServicio=EstadoServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoServicio+="(Inventario.EstadoServicio)";
		}
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoServicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoServicio = new JButtonMe();
		this.jButtonModificarEstadoServicio = new JButtonMe();
        this.jButtonActualizarEstadoServicio = new JButtonMe();
        this.jButtonEliminarEstadoServicio = new JButtonMe();
        this.jButtonCancelarEstadoServicio = new JButtonMe();
        this.jButtonGuardarCambiosEstadoServicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoServicio = new JButtonMe();
		this.jButtonCerrarEstadoServicio = new JButtonMe();
		
		this.jScrollPanelDatosEstadoServicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoServicio = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoServicio = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Servicio";
		
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Servicioes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoServicio.setName("jPanelCamposEstadoServicio"); 

		this.jPanelCamposOcultosEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoServicio.setName("jPanelCamposOcultosEstadoServicio"); 

        this.jPanelAccionesEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoServicio.setToolTipText("Acciones");
        this.jPanelAccionesEstadoServicio.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoServicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoServicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoServicio.setText("Nuevo");
		this.jButtonModificarEstadoServicio.setText("Editar");
        this.jButtonActualizarEstadoServicio.setText("Actualizar");
        this.jButtonEliminarEstadoServicio.setText("Eliminar");
        this.jButtonCancelarEstadoServicio.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoServicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoServicio.setText("Guardar");
		this.jButtonCerrarEstadoServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoServicio,"nuevo_button","Nuevo",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoServicio,"modificar_button","Editar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoServicio,"actualizar_button","Actualizar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoServicio,"eliminar_button","Eliminar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoServicio,"cancelar_button","Cancelar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoServicio,"guardarcambios_button","Guardar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoServicio,"guardarcambiostabla_button","Guardar",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoServicio,"cerrar_button","Salir",this.estadoservicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoServicio.setToolTipText("Nuevo"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoServicio.setToolTipText("Editar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoServicio.setToolTipText("Actualizar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoServicio.setToolTipText("Eliminar)"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoServicio.setToolTipText("Cancelar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoServicio.setToolTipText("Guardar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoServicio.setToolTipText("Guardar"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoServicio.setToolTipText("Salir"+" "+EstadoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoServicio";
		inputMap = this.jButtonNuevoEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoServicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoServicio";
		inputMap = this.jButtonActualizarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoServicio"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoServicio";
		inputMap = this.jButtonEliminarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoServicio"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoServicio";
		inputMap = this.jButtonCancelarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoServicio"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoServicio";
		inputMap = this.jButtonCerrarEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoServicio";
		inputMap = this.jButtonGuardarCambiosTablaEstadoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoServicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoServicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoServicio.setToolTipText("Nuevo EstadoServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoServicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoServicio.setToolTipText("Sin Cerrar Ventana EstadoServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoServicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoServicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoServicio.setText("Accion");
		this.jComboBoxTiposAccionesEstadoServicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoServicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoServicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoServicio = new JLabelMe();
		
		this.jLabelAccionesEstadoServicio.setText("Acciones");		
		this.jLabelAccionesEstadoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoServicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoServicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoServicio=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoServicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoServicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoServicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoServicio = new GridBagLayout();
		
		this.jPanelCamposEstadoServicio.setLayout(gridaBagLayoutCamposEstadoServicio);
		this.jPanelCamposOcultosEstadoServicio.setLayout(gridaBagLayoutCamposOcultosEstadoServicio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 0;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoServicio.add(jLabelIdEstadoServicio, this.gridBagConstraintsEstadoServicio);



	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 1;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoServicio.add(jTextFieldidEstadoServicio, this.gridBagConstraintsEstadoServicio);


	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 0;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoServicio.add(jLabelcodigoEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = 0;
		this.gridBagConstraintsEstadoServicio.gridx = 2;
		this.gridBagConstraintsEstadoServicio.ipadx = 0;
		this.gridBagConstraintsEstadoServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoServicio.add(jButtoncodigoEstadoServicioBusqueda, this.gridBagConstraintsEstadoServicio);
	}

	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 1;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoServicio.add(jTextFieldcodigoEstadoServicio, this.gridBagConstraintsEstadoServicio);


	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 0;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoServicio.add(jLabelnombreEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = 0;
		this.gridBagConstraintsEstadoServicio.gridx = 2;
		this.gridBagConstraintsEstadoServicio.ipadx = 0;
		this.gridBagConstraintsEstadoServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoServicio.add(jButtonnombreEstadoServicioBusqueda, this.gridBagConstraintsEstadoServicio);
	}

	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 1;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoServicio.add(jTextFieldnombreEstadoServicio, this.gridBagConstraintsEstadoServicio);


	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 0;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoEstadoServicio.add(jLabeles_defectoEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		//this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoServicio.gridy = 0;
		this.gridBagConstraintsEstadoServicio.gridx = 2;
		this.gridBagConstraintsEstadoServicio.ipadx = 0;
		this.gridBagConstraintsEstadoServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoEstadoServicio.add(jButtones_defectoEstadoServicioBusqueda, this.gridBagConstraintsEstadoServicio);
	}

	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoServicio.gridy = 0;
	this.gridBagConstraintsEstadoServicio.gridx = 1;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoEstadoServicio.add(jCheckBoxes_defectoEstadoServicio, this.gridBagConstraintsEstadoServicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoServicio.gridy = iYPanelCamposEstadoServicio;
	this.gridBagConstraintsEstadoServicio.gridx = iXPanelCamposEstadoServicio++;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoServicio.add(this.jPanelidEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(iXPanelCamposEstadoServicio % 1==0) {
		iXPanelCamposEstadoServicio=0;
		iYPanelCamposEstadoServicio++;
	}
	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoServicio.gridy = iYPanelCamposEstadoServicio;
	this.gridBagConstraintsEstadoServicio.gridx = iXPanelCamposEstadoServicio++;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoServicio.add(this.jPanelcodigoEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(iXPanelCamposEstadoServicio % 1==0) {
		iXPanelCamposEstadoServicio=0;
		iYPanelCamposEstadoServicio++;
	}
	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoServicio.gridy = iYPanelCamposEstadoServicio;
	this.gridBagConstraintsEstadoServicio.gridx = iXPanelCamposEstadoServicio++;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoServicio.add(this.jPanelnombreEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(iXPanelCamposEstadoServicio % 1==0) {
		iXPanelCamposEstadoServicio=0;
		iYPanelCamposEstadoServicio++;
	}
	this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoServicio.gridy = iYPanelCamposEstadoServicio;
	this.gridBagConstraintsEstadoServicio.gridx = iXPanelCamposEstadoServicio++;
	this.gridBagConstraintsEstadoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoServicio.add(this.jPaneles_defectoEstadoServicio, this.gridBagConstraintsEstadoServicio);



	if(iXPanelCamposEstadoServicio % 1==0) {
		iXPanelCamposEstadoServicio=0;
		iYPanelCamposEstadoServicio++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoServicio= new GridBagLayout();
		this.jPanelAccionesEstadoServicio.setLayout(gridaBagLayoutAccionesEstadoServicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoServicio= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoServicio.setLayout(gridaBagLayoutAccionesFormularioEstadoServicio);
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoServicio.add(this.jComboBoxTiposAccionesFormularioEstadoServicio, this.gridBagConstraintsEstadoServicio);

		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoServicio.add(this.jCheckBoxPostAccionNuevoEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoServicio.add(this.jCheckBoxPostAccionSinCerrarEstadoServicio, this.gridBagConstraintsEstadoServicio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoservicioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoservicioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoServicio.add(this.jCheckBoxPostAccionSinMensajeEstadoServicio, this.gridBagConstraintsEstadoServicio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = 0;
		this.gridBagConstraintsEstadoServicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoServicio.add(this.jButtonModificarEstadoServicio, this.gridBagConstraintsEstadoServicio);							

		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoServicio.gridy = 0;
		this.gridBagConstraintsEstadoServicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoServicio.add(this.jButtonEliminarEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
			
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = 0;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoServicio.add(this.jButtonActualizarEstadoServicio, this.gridBagConstraintsEstadoServicio);


		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = 0;		
		this.gridBagConstraintsEstadoServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoServicio.add(this.jButtonGuardarCambiosEstadoServicio, this.gridBagConstraintsEstadoServicio);	
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = 0;		
		this.gridBagConstraintsEstadoServicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoServicio.add(this.jButtonCancelarEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoServicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoservicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();						
			this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoServicio.gridx = 0;		
			//this.gridBagConstraintsEstadoServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoServicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoServicio.gridx =0;
		this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoServicio, this.gridBagConstraintsEstadoServicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoServicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoServicio = new EstadoServicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Servicio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Servicio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Servicio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoServicioModel estadoservicioModel=new EstadoServicioModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoServicioModel.EstadoServicioFocusTraversalPolicy estadoservicioFocusTraversalPolicy = estadoservicioModel.new EstadoServicioFocusTraversalPolicy(this);
			
			//estadoservicioFocusTraversalPolicy.setestadoservicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoservicioModel);
			
			
			this.jContentPaneDetalleEstadoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoServicio = new GridBagLayout();	
			this.jContentPaneDetalleEstadoServicio.setLayout(gridaBagLayoutDetalleEstadoServicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoServicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
				this.gridBagConstraintsEstadoServicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoServicio.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoServicio.add(jTtoolBarDetalleEstadoServicio, gridBagConstraintsEstadoServicio);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoServicio=   new JScrollPane(jContentPaneDetalleEstadoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoServicio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoServicio.gridx = 0;
	        
			this.jContentPaneDetalleEstadoServicio.add(jPanelCamposEstadoServicio, gridBagConstraintsEstadoServicio);
			
			
			
			
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
						&& estadoservicioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadoservicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoServicio= new GridBagConstraints();
						this.gridBagConstraintsEstadoServicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoServicio.gridx = 0;
						this.jContentPaneDetalleEstadoServicio.add(this.jTabbedPaneRelacionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoServicio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoServicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
					this.gridBagConstraintsEstadoServicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoServicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoServicio.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoServicio.add(jPanelCamposOcultosEstadoServicio, gridBagConstraintsEstadoServicio);
				
					this.jPanelCamposOcultosEstadoServicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoServicio.gridx = 0;
	        this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoServicio.add(this.jPanelAccionesFormularioEstadoServicio, this.gridBagConstraintsEstadoServicio);							
			
			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
	        this.gridBagConstraintsEstadoServicio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoServicio.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoServicio.add(this.jPanelAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoServicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoServicio=   new JScrollPane(this.jPanelCamposEstadoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoServicio.gridx = 0;
			this.gridBagConstraintsEstadoServicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoServicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoServicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoServicio, this.gridBagConstraintsEstadoServicio);			
			
			this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
			this.gridBagConstraintsEstadoServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoServicio, this.gridBagConstraintsEstadoServicio);
			
			
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoServicio, this.gridBagConstraintsEstadoServicio);
		
			
		this.gridBagConstraintsEstadoServicio = new GridBagConstraints();
		this.gridBagConstraintsEstadoServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoServicio, this.gridBagConstraintsEstadoServicio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoServicio;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoServicio;
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
