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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.EstadoRetencionConstantesFunciones;

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
public class EstadoRetencionDetalleFormJInternalFrame extends EstadoRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoRetencion;
	
	protected JMenuBar jmenuBarDetalleEstadoRetencion;
	
	protected JMenu jmenuDetalleEstadoRetencion;
	protected JMenu jmenuDetalleArchivoEstadoRetencion;
	protected JMenu jmenuDetalleAccionesEstadoRetencion;
	protected JMenu jmenuDetalleDatosEstadoRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRetencion;	
	protected GridBagConstraints gridBagConstraintsEstadoRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRetencionSessionBean estadoretencionSessionBean;
	
	

	public ClienteRetencionBeanSwingJInternalFrame clienteretencionBeanSwingJInternalFrame=null;
	public ClienteRetencionBeanSwingJInternalFrame clienteretencionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteClienteRetencion=false;
	public ClienteRetencionSessionBean clienteretencionSessionBean;

	public RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame=null;
	public RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRetencion=false;
	public RetencionSessionBean retencionSessionBean;
	
		
	
	public EstadoRetencionLogic estadoretencionLogic;
	
	public JScrollPane jScrollPanelDatosEstadoRetencion;
	public JScrollPane jScrollPanelDatosEdicionEstadoRetencion;
	public JScrollPane jScrollPanelDatosGeneralEstadoRetencion;
	
	protected JPanel jPanelCamposEstadoRetencion;    
	protected JPanel jPanelCamposOcultosEstadoRetencion;    	
	protected JPanel jPanelAccionesEstadoRetencion;
	protected JPanel jPanelAccionesFormularioEstadoRetencion;
    
	
	
	protected Integer iXPanelCamposEstadoRetencion=0;
	protected Integer iYPanelCamposEstadoRetencion=0;
	
	protected Integer iXPanelCamposOcultosEstadoRetencion=0;
	protected Integer iYPanelCamposOcultosEstadoRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoRetencion;
	public JButton jButtonModificarEstadoRetencion;
	public JButton jButtonActualizarEstadoRetencion;
    public JButton jButtonEliminarEstadoRetencion;
	public JButton jButtonCancelarEstadoRetencion;
    public JButton jButtonGuardarCambiosEstadoRetencion;
	public JButton jButtonGuardarCambiosTablaEstadoRetencion;
	protected JButton jButtonCerrarEstadoRetencion;
	
	
	protected JButton jButtonProcesarInformacionEstadoRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRetencion;
	protected JButton jButtonModificarToolBarEstadoRetencion;
	protected JButton jButtonActualizarToolBarEstadoRetencion;
    protected JButton jButtonEliminarToolBarEstadoRetencion;
	protected JButton jButtonCancelarToolBarEstadoRetencion;
    protected JButton jButtonGuardarCambiosToolBarEstadoRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRetencion;
	protected JButton jButtonCerrarToolBarEstadoRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRetencion;
	protected JMenuItem jMenuItemModificarEstadoRetencion;
	protected JMenuItem jMenuItemActualizarEstadoRetencion;
    protected JMenuItem jMenuItemEliminarEstadoRetencion;
	protected JMenuItem jMenuItemCancelarEstadoRetencion;
    protected JMenuItem jMenuItemGuardarCambiosEstadoRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRetencion;
	protected JMenuItem jMenuItemCerrarEstadoRetencion;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRetencion;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoRetencion;
	public JLabel jLabelIdEstadoRetencion;
	public JTextFieldMe jTextFieldidEstadoRetencion;
	public JButton jButtonidEstadoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoRetencion;
	public JLabel jLabelcodigoEstadoRetencion;
	public JTextField jTextFieldcodigoEstadoRetencion;
	public JButton jButtoncodigoEstadoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoRetencion;
	public JLabel jLabelnombreEstadoRetencion;
	public JTextArea jTextAreanombreEstadoRetencion;
	public JScrollPane jscrollPanenombreEstadoRetencion;
	public JButton jButtonnombreEstadoRetencionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoRetencion;
	
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
	
	public EstadoRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoRetencion=new JPanel();
				this.jPanelAccionesFormularioEstadoRetencion=new JPanel();
				this.jmenuBarDetalleEstadoRetencion=new JMenuBar();
				this.jTtoolBarDetalleEstadoRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoRetencion() {
		return this.jButtonActualizarToolBarEstadoRetencion;
	}
	
	public JButton getjButtonEliminarToolBarEstadoRetencion() {
		return this.jButtonEliminarToolBarEstadoRetencion;
	}
	
	public JButton getjButtonCancelarToolBarEstadoRetencion() {
		return this.jButtonCancelarToolBarEstadoRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoRetencion() {
		return this.jButtonProcesarInformacionEstadoRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRetencion)	{
		this.jButtonProcesarInformacionEstadoRetencion = jButtonProcesarInformacionEstadoRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRetencion() {
		return this.jComboBoxTiposAccionesEstadoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRetencion(
			JComboBox jComboBoxTiposRelacionesEstadoRetencion) {
		this.jComboBoxTiposRelacionesEstadoRetencion = jComboBoxTiposRelacionesEstadoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRetencion(
			JComboBox jComboBoxTiposAccionesEstadoRetencion) {
		this.jComboBoxTiposAccionesEstadoRetencion = jComboBoxTiposAccionesEstadoRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoRetencion() {
		return this.jComboBoxTiposAccionesFormularioEstadoRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoRetencion(
			JComboBox jComboBoxTiposAccionesFormularioEstadoRetencion) {
		this.jComboBoxTiposAccionesFormularioEstadoRetencion = jComboBoxTiposAccionesFormularioEstadoRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoretencionSessionBean=new EstadoRetencionSessionBean();
		
		this.estadoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoretencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteretencionSessionBean=new ClienteRetencionSessionBean();
		//this.retencionSessionBean=new RetencionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoRetencion=new JButtonMe();
				this.jButtonModificarToolBarEstadoRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoRetencion,this.jTtoolBarDetalleEstadoRetencion,
							"actualizar","actualizar","Actualizar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoRetencion,this.jTtoolBarDetalleEstadoRetencion,
							"eliminar","eliminar","Eliminar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoRetencion,this.jTtoolBarDetalleEstadoRetencion,
							"cancelar","cancelar","Cancelar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoRetencion,this.jTtoolBarDetalleEstadoRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoRetencion.add(this.jMenuItemDetalleCerrarEstadoRetencion);
		
		this.jmenuDetalleAccionesEstadoRetencion.add(this.jMenuItemActualizarEstadoRetencion);
		this.jmenuDetalleAccionesEstadoRetencion.add(this.jMenuItemEliminarEstadoRetencion);
		this.jmenuDetalleAccionesEstadoRetencion.add(this.jMenuItemCancelarEstadoRetencion);		
		
		//this.jmenuDetalleDatosEstadoRetencion.add(this.jMenuItemDetalleAbrirOrderByEstadoRetencion);				
		this.jmenuDetalleDatosEstadoRetencion.add(this.jMenuItemDetalleMostarOcultarEstadoRetencion);				
				
		//this.jmenuDetalleAccionesEstadoRetencion.add(this.jMenuItemGuardarCambiosEstadoRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoRetencion.add(this.jmenuDetalleArchivoEstadoRetencion);		
		this.jmenuBarDetalleEstadoRetencion.add(this.jmenuDetalleAccionesEstadoRetencion);		
		this.jmenuBarDetalleEstadoRetencion.add(this.jmenuDetalleDatosEstadoRetencion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoRetencion.add(this.jmenuDetalleEstadoRetencion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoRetencion);				
	}
	
	
	public void inicializarElementosCamposEstadoRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoRetencion = new JLabelMe();
		jLabelIdEstadoRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoRetencion.setToolTipText(EstadoRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoRetencion= new GridBagLayout();

		this.jPanelidEstadoRetencion.setLayout(this.gridaBagLayoutEstadoRetencion);

		jTextFieldidEstadoRetencion = new JTextFieldMe();
		jTextFieldidEstadoRetencion.setText("Id");

		jTextFieldidEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoRetencion = new JLabelMe();
		this.jLabelcodigoEstadoRetencion.setText(""+EstadoRetencionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoRetencion.setToolTipText("Codigo");
		this.jLabelcodigoEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoRetencion.setToolTipText(EstadoRetencionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoRetencion = new GridBagLayout();
		this.jPanelcodigoEstadoRetencion.setLayout(this.gridaBagLayoutEstadoRetencion);


		jTextFieldcodigoEstadoRetencion= new JTextFieldMe();

		jTextFieldcodigoEstadoRetencion.setEnabled(false);
		jTextFieldcodigoEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoRetencionBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoRetencionBusqueda.setText("U");
		this.jButtoncodigoEstadoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoRetencionBusqueda"));

		if(this.estadoretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoRetencion = new JLabelMe();
		this.jLabelnombreEstadoRetencion.setText(""+EstadoRetencionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoRetencion.setToolTipText("Nombre");
		this.jLabelnombreEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoRetencion.setToolTipText(EstadoRetencionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoRetencion = new GridBagLayout();
		this.jPanelnombreEstadoRetencion.setLayout(this.gridaBagLayoutEstadoRetencion);


		jTextAreanombreEstadoRetencion= new JTextAreaMe();
		jTextAreanombreEstadoRetencion.setEnabled(false);
		jTextAreanombreEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRetencion.setLineWrap(true);
		jTextAreanombreEstadoRetencion.setWrapStyleWord(true);
		jTextAreanombreEstadoRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoRetencion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoRetencion = new JScrollPane(jTextAreanombreEstadoRetencion);
		jscrollPanenombreEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoRetencionBusqueda= new JButtonMe();
		this.jButtonnombreEstadoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoRetencionBusqueda.setText("U");
		this.jButtonnombreEstadoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoRetencionBusqueda"));

		if(this.estadoretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoRetencion() {
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
		//this.jInternalFrameDetalleEstadoRetencion = new EstadoRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRetencion= new GridBagLayout();
		

		
		String sToolTipEstadoRetencion="";
		sToolTipEstadoRetencion=EstadoRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRetencion+="(Facturacion.EstadoRetencion)";
		}
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoRetencion = new JButtonMe();
		this.jButtonModificarEstadoRetencion = new JButtonMe();
        this.jButtonActualizarEstadoRetencion = new JButtonMe();
        this.jButtonEliminarEstadoRetencion = new JButtonMe();
        this.jButtonCancelarEstadoRetencion = new JButtonMe();
        this.jButtonGuardarCambiosEstadoRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoRetencion = new JButtonMe();
		this.jButtonCerrarEstadoRetencion = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Retencion";
		
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Retencions" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoRetencion.setName("jPanelCamposEstadoRetencion"); 

		this.jPanelCamposOcultosEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoRetencion.setName("jPanelCamposOcultosEstadoRetencion"); 

        this.jPanelAccionesEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoRetencion.setText("Nuevo");
		this.jButtonModificarEstadoRetencion.setText("Editar");
        this.jButtonActualizarEstadoRetencion.setText("Actualizar");
        this.jButtonEliminarEstadoRetencion.setText("Eliminar");
        this.jButtonCancelarEstadoRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoRetencion.setText("Guardar");
		this.jButtonCerrarEstadoRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRetencion,"nuevo_button","Nuevo",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoRetencion,"modificar_button","Editar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoRetencion,"actualizar_button","Actualizar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoRetencion,"eliminar_button","Eliminar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoRetencion,"cancelar_button","Cancelar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoRetencion,"guardarcambios_button","Guardar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRetencion,"guardarcambiostabla_button","Guardar",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRetencion,"cerrar_button","Salir",this.estadoretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoRetencion.setToolTipText("Nuevo"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoRetencion.setToolTipText("Editar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoRetencion.setToolTipText("Actualizar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoRetencion.setToolTipText("Eliminar)"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoRetencion.setToolTipText("Cancelar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoRetencion.setToolTipText("Guardar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoRetencion.setToolTipText("Guardar"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRetencion.setToolTipText("Salir"+" "+EstadoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRetencion";
		inputMap = this.jButtonNuevoEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoRetencion";
		inputMap = this.jButtonActualizarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoRetencion";
		inputMap = this.jButtonEliminarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoRetencion";
		inputMap = this.jButtonCancelarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoRetencion";
		inputMap = this.jButtonCerrarEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRetencion";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoRetencion.setToolTipText("Nuevo EstadoRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoRetencion.setToolTipText("Sin Cerrar Ventana EstadoRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRetencion.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoRetencion = new JLabelMe();
		
		this.jLabelAccionesEstadoRetencion.setText("Acciones");		
		this.jLabelAccionesEstadoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoRetencion = new GridBagLayout();
		
		this.jPanelCamposEstadoRetencion.setLayout(gridaBagLayoutCamposEstadoRetencion);
		this.jPanelCamposOcultosEstadoRetencion.setLayout(gridaBagLayoutCamposOcultosEstadoRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRetencion.gridy = 0;
	this.gridBagConstraintsEstadoRetencion.gridx = 0;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoRetencion.add(jLabelIdEstadoRetencion, this.gridBagConstraintsEstadoRetencion);



	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRetencion.gridy = 0;
	this.gridBagConstraintsEstadoRetencion.gridx = 1;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoRetencion.add(jTextFieldidEstadoRetencion, this.gridBagConstraintsEstadoRetencion);


	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRetencion.gridy = 0;
	this.gridBagConstraintsEstadoRetencion.gridx = 0;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoRetencion.add(jLabelcodigoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = 0;
		this.gridBagConstraintsEstadoRetencion.gridx = 2;
		this.gridBagConstraintsEstadoRetencion.ipadx = 0;
		this.gridBagConstraintsEstadoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoRetencion.add(jButtoncodigoEstadoRetencionBusqueda, this.gridBagConstraintsEstadoRetencion);
	}

	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRetencion.gridy = 0;
	this.gridBagConstraintsEstadoRetencion.gridx = 1;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoRetencion.add(jTextFieldcodigoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);


	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRetencion.gridy = 0;
	this.gridBagConstraintsEstadoRetencion.gridx = 0;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoRetencion.add(jLabelnombreEstadoRetencion, this.gridBagConstraintsEstadoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRetencion.gridy = 0;
		this.gridBagConstraintsEstadoRetencion.gridx = 2;
		this.gridBagConstraintsEstadoRetencion.ipadx = 0;
		this.gridBagConstraintsEstadoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoRetencion.add(jButtonnombreEstadoRetencionBusqueda, this.gridBagConstraintsEstadoRetencion);
	}

	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRetencion.gridy = 0;
	this.gridBagConstraintsEstadoRetencion.gridx = 1;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoRetencion.add(jscrollPanenombreEstadoRetencion, this.gridBagConstraintsEstadoRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRetencion.gridy = iYPanelCamposEstadoRetencion;
	this.gridBagConstraintsEstadoRetencion.gridx = iXPanelCamposEstadoRetencion++;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRetencion.add(this.jPanelidEstadoRetencion, this.gridBagConstraintsEstadoRetencion);



	if(iXPanelCamposEstadoRetencion % 1==0) {
		iXPanelCamposEstadoRetencion=0;
		iYPanelCamposEstadoRetencion++;
	}
	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRetencion.gridy = iYPanelCamposEstadoRetencion;
	this.gridBagConstraintsEstadoRetencion.gridx = iXPanelCamposEstadoRetencion++;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRetencion.add(this.jPanelcodigoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);



	if(iXPanelCamposEstadoRetencion % 1==0) {
		iXPanelCamposEstadoRetencion=0;
		iYPanelCamposEstadoRetencion++;
	}
	this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRetencion.gridy = iYPanelCamposEstadoRetencion;
	this.gridBagConstraintsEstadoRetencion.gridx = iXPanelCamposEstadoRetencion++;
	this.gridBagConstraintsEstadoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRetencion.add(this.jPanelnombreEstadoRetencion, this.gridBagConstraintsEstadoRetencion);



	if(iXPanelCamposEstadoRetencion % 1==0) {
		iXPanelCamposEstadoRetencion=0;
		iYPanelCamposEstadoRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoRetencion= new GridBagLayout();
		this.jPanelAccionesEstadoRetencion.setLayout(gridaBagLayoutAccionesEstadoRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoRetencion.setLayout(gridaBagLayoutAccionesFormularioEstadoRetencion);
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRetencion.add(this.jComboBoxTiposAccionesFormularioEstadoRetencion, this.gridBagConstraintsEstadoRetencion);

		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRetencion.add(this.jCheckBoxPostAccionNuevoEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRetencion.add(this.jCheckBoxPostAccionSinCerrarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoretencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoretencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRetencion.add(this.jCheckBoxPostAccionSinMensajeEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = 0;
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoRetencion.add(this.jButtonModificarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);							

		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRetencion.gridy = 0;
		this.gridBagConstraintsEstadoRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoRetencion.add(this.jButtonEliminarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
			
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = 0;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRetencion.add(this.jButtonActualizarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);


		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = 0;		
		this.gridBagConstraintsEstadoRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRetencion.add(this.jButtonGuardarCambiosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);	
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = 0;		
		this.gridBagConstraintsEstadoRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoRetencion.add(this.jButtonCancelarEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRetencion.gridx = 0;		
			//this.gridBagConstraintsEstadoRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRetencion.gridx =0;
		this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoRetencion = new EstadoRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoRetencionModel estadoretencionModel=new EstadoRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoRetencionModel.EstadoRetencionFocusTraversalPolicy estadoretencionFocusTraversalPolicy = estadoretencionModel.new EstadoRetencionFocusTraversalPolicy(this);
			
			//estadoretencionFocusTraversalPolicy.setestadoretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoretencionModel);
			
			
			this.jContentPaneDetalleEstadoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoRetencion = new GridBagLayout();	
			this.jContentPaneDetalleEstadoRetencion.setLayout(gridaBagLayoutDetalleEstadoRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
				this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoRetencion.add(jTtoolBarDetalleEstadoRetencion, gridBagConstraintsEstadoRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoRetencion=   new JScrollPane(jContentPaneDetalleEstadoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoRetencion.gridx = 0;
	        
			this.jContentPaneDetalleEstadoRetencion.add(jPanelCamposEstadoRetencion, gridBagConstraintsEstadoRetencion);
			
			
			
			
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
						&& estadoretencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameClienteRetencion(this.puedeCargarPorParteClienteRetencion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencion(this.puedeCargarPorParteRetencion,false,-1);
					
					if(this.estadoretencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoRetencion= new GridBagConstraints();
						this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoRetencion.gridx = 0;
						this.jContentPaneDetalleEstadoRetencion.add(this.jTabbedPaneRelacionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoRetencion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameClienteRetencion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
					this.gridBagConstraintsEstadoRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoRetencion.add(jPanelCamposOcultosEstadoRetencion, gridBagConstraintsEstadoRetencion);
				
					this.jPanelCamposOcultosEstadoRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoRetencion.gridx = 0;
	        this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoRetencion.add(this.jPanelAccionesFormularioEstadoRetencion, this.gridBagConstraintsEstadoRetencion);							
			
			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
	        this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoRetencion.add(this.jPanelAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoRetencion=   new JScrollPane(this.jPanelCamposEstadoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRetencion.gridx = 0;
			this.gridBagConstraintsEstadoRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoRetencion, this.gridBagConstraintsEstadoRetencion);			
			
			this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
			this.gridBagConstraintsEstadoRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
			
			
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		
			
		this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
		this.gridBagConstraintsEstadoRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRetencion, this.gridBagConstraintsEstadoRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoRetencion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameClienteRetencion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteretencionSessionBean=new ClienteRetencionSessionBean();
		this.clienteretencionSessionBean.setConGuardarRelaciones(false);
		this.clienteretencionSessionBean.setEsGuardarRelacionado(true);

		this.clienteretencionBeanSwingJInternalFrame=null;//new ClienteRetencionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteretencionBeanSwingJInternalFramePopup=new ClienteRetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteretencionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteretencionSessionBean.getEsGuardarRelacionado()) {

				ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteretencionSessionBean.setEsGuardarRelacionado(true);

				this.clienteretencionBeanSwingJInternalFrame=new ClienteRetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteretencionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteretencionBeanSwingJInternalFrame.setclienteretencionSessionBean(this.clienteretencionSessionBean);

				//this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
				//this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoRetencion.gridx = 0;
				//this.jContentPaneDetalleEstadoRetencion.add(this.clienteretencionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoRetencion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoRetencion.add("Retenciones",this.clienteretencionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoRetencion.setComponentAt(iIndexTab,this.clienteretencionBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteretencionSessionBean.setEsGuardarRelacionado(false);
				this.clienteretencionBeanSwingJInternalFrame=null;//new ClienteRetencionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteClienteRetencion) {
					this.jTabbedPaneRelacionesEstadoRetencion.add("Retenciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRetencion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.retencionSessionBean=new RetencionSessionBean();
		this.retencionSessionBean.setConGuardarRelaciones(false);
		this.retencionSessionBean.setEsGuardarRelacionado(true);

		this.retencionBeanSwingJInternalFrame=null;//new RetencionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.retencionBeanSwingJInternalFramePopup=new RetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.retencionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.retencionSessionBean.getEsGuardarRelacionado()) {

				RetencionJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
				RetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.retencionSessionBean.setEsGuardarRelacionado(true);

				this.retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.retencionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.retencionBeanSwingJInternalFrame.setretencionSessionBean(this.retencionSessionBean);

				//this.gridBagConstraintsEstadoRetencion = new GridBagConstraints();
				//this.gridBagConstraintsEstadoRetencion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoRetencion.gridx = 0;
				//this.jContentPaneDetalleEstadoRetencion.add(this.retencionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoRetencion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoRetencion.add("Retenciones",this.retencionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoRetencion.setComponentAt(iIndexTab,this.retencionBeanSwingJInternalFrame.getContentPane());
				}

				//RetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.retencionSessionBean.setEsGuardarRelacionado(false);
				this.retencionBeanSwingJInternalFrame=null;//new RetencionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.retencionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRetencion) {
					this.jTabbedPaneRelacionesEstadoRetencion.add("Retenciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteRetencionBeanSwingJInternalFrame(List<EstadoRetencion> estadoretencions,EstadoRetencion estadoretencion,ClienteRetencionBeanSwingJInternalFrame clienteretencionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteretencionBeanSwingJInternalFrame=new ClienteRetencionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteretencionBeanSwingJInternalFrame.getClienteRetencionLogic().setConnexion(this.estadoretencionLogic.getConnexion());

					clienteretencionBeanSwingJInternalFrame.setestadoretencionsForeignKey(estadoretencions);
					clienteretencionBeanSwingJInternalFrame.setestadoretencionForeignKey(estadoretencion);
					clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRetencion(true);
					clienteretencionBeanSwingJInternalFrame.clienteretencionSessionBean.setlidEstadoRetencionActual(estadoretencion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteretencionBeanSwingJInternalFrame.cargarCombosForeignKeyClienteRetencion(clienteretencionBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteretencionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoRetencion(true);
					clienteretencionBeanSwingJInternalFrame.setid_estado_retencionFK_IdEstadoRetencion(estadoretencion.getId());

					if(!this.conCargarFormDetalle) {
						clienteretencionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteretencionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoRetencionForeignKey(estadoretencion,1,false,true,true);
					clienteretencionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteretencionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoRetencion");
					clienteretencionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoRetencion");
					clienteretencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteRetencion(true);
					clienteretencionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesClienteRetencion("n",clienteretencionBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteretencionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteretencionBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteretencionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteretencionBeanSwingJInternalFrame.actualizarEstadoPanelsClienteRetencion("relacionado");
					} else {
						clienteretencionBeanSwingJInternalFrame.actualizarEstadoPanelsClienteRetencion("no_relacionado");
					}

					clienteretencionBeanSwingJInternalFrame.getjButtonRecargarInformacionClienteRetencion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRetencionBeanSwingJInternalFrame(List<EstadoRetencion> estadoretencions,EstadoRetencion estadoretencion,RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					retencionBeanSwingJInternalFrame.getRetencionLogic().setConnexion(this.estadoretencionLogic.getConnexion());

					retencionBeanSwingJInternalFrame.setestadoretencionsForeignKey(estadoretencions);
					retencionBeanSwingJInternalFrame.setestadoretencionForeignKey(estadoretencion);
					retencionBeanSwingJInternalFrame.retencionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRetencion(true);
					retencionBeanSwingJInternalFrame.retencionSessionBean.setlidEstadoRetencionActual(estadoretencion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					retencionBeanSwingJInternalFrame.cargarCombosForeignKeyRetencion(retencionBeanSwingJInternalFrame.isCargarCombosDependencia);
					retencionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoRetencion(true);
					retencionBeanSwingJInternalFrame.setid_estado_retencionFK_IdEstadoRetencion(estadoretencion.getId());

					if(!this.conCargarFormDetalle) {
						retencionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					retencionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoRetencionForeignKey(estadoretencion,1,false,true,true);
					retencionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					retencionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoRetencion");
					retencionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoRetencion");
					retencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencion(true);
					retencionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRetencion("n",retencionBeanSwingJInternalFrame.isGuardarCambiosEnLote, retencionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					retencionBeanSwingJInternalFrame.setAutoscrolls(true);
					retencionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						retencionBeanSwingJInternalFrame.actualizarEstadoPanelsRetencion("relacionado");
					} else {
						retencionBeanSwingJInternalFrame.actualizarEstadoPanelsRetencion("no_relacionado");
					}

					retencionBeanSwingJInternalFrame.getjButtonRecargarInformacionRetencion().setVisible(false);

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
