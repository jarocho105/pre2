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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;



import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.EstadoComisionConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class EstadoComisionDetalleFormJInternalFrame extends EstadoComisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoComision;
	
	protected JMenuBar jmenuBarDetalleEstadoComision;
	
	protected JMenu jmenuDetalleEstadoComision;
	protected JMenu jmenuDetalleArchivoEstadoComision;
	protected JMenu jmenuDetalleAccionesEstadoComision;
	protected JMenu jmenuDetalleDatosEstadoComision;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoComision;	
	protected GridBagConstraints gridBagConstraintsEstadoComision;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoComisionBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoComision;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoComisionSessionBean estadocomisionSessionBean;
	
	
	
		
	
	public EstadoComisionLogic estadocomisionLogic;
	
	public JScrollPane jScrollPanelDatosEstadoComision;
	public JScrollPane jScrollPanelDatosEdicionEstadoComision;
	public JScrollPane jScrollPanelDatosGeneralEstadoComision;
	
	protected JPanel jPanelCamposEstadoComision;    
	protected JPanel jPanelCamposOcultosEstadoComision;    	
	protected JPanel jPanelAccionesEstadoComision;
	protected JPanel jPanelAccionesFormularioEstadoComision;
    
	
	
	protected Integer iXPanelCamposEstadoComision=0;
	protected Integer iYPanelCamposEstadoComision=0;
	
	protected Integer iXPanelCamposOcultosEstadoComision=0;
	protected Integer iYPanelCamposOcultosEstadoComision=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoComision;
	public JButton jButtonModificarEstadoComision;
	public JButton jButtonActualizarEstadoComision;
    public JButton jButtonEliminarEstadoComision;
	public JButton jButtonCancelarEstadoComision;
    public JButton jButtonGuardarCambiosEstadoComision;
	public JButton jButtonGuardarCambiosTablaEstadoComision;
	protected JButton jButtonCerrarEstadoComision;
	
	
	protected JButton jButtonProcesarInformacionEstadoComision;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoComision;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoComision;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoComision;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoComision;
	protected JButton jButtonModificarToolBarEstadoComision;
	protected JButton jButtonActualizarToolBarEstadoComision;
    protected JButton jButtonEliminarToolBarEstadoComision;
	protected JButton jButtonCancelarToolBarEstadoComision;
    protected JButton jButtonGuardarCambiosToolBarEstadoComision;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoComision;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoComision;
	protected JButton jButtonCerrarToolBarEstadoComision;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoComision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoComision;
	protected JMenuItem jMenuItemModificarEstadoComision;
	protected JMenuItem jMenuItemActualizarEstadoComision;
    protected JMenuItem jMenuItemEliminarEstadoComision;
	protected JMenuItem jMenuItemCancelarEstadoComision;
    protected JMenuItem jMenuItemGuardarCambiosEstadoComision;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoComision;
	protected JMenuItem jMenuItemCerrarEstadoComision;
	protected JMenuItem jMenuItemDetalleCerrarEstadoComision;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoComision;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoComision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoComision;
	protected JMenuItem jMenuItemMostrarOcultarEstadoComision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoComision;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoComision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoComision;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoComision;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoComision;
	public JLabel jLabelIdEstadoComision;
	public JTextFieldMe jTextFieldidEstadoComision;
	public JButton jButtonidEstadoComisionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoComision;
	public JLabel jLabelcodigoEstadoComision;
	public JTextField jTextFieldcodigoEstadoComision;
	public JButton jButtoncodigoEstadoComisionBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoComision;
	public JLabel jLabelnombreEstadoComision;
	public JTextArea jTextAreanombreEstadoComision;
	public JScrollPane jscrollPanenombreEstadoComision;
	public JButton jButtonnombreEstadoComisionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoComision;
	
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
	
	public EstadoComisionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoComision=new JPanel();
				this.jPanelAccionesFormularioEstadoComision=new JPanel();
				this.jmenuBarDetalleEstadoComision=new JMenuBar();
				this.jTtoolBarDetalleEstadoComision=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoComisionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoComisionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoComision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoComision() {
		return this.jButtonActualizarToolBarEstadoComision;
	}
	
	public JButton getjButtonEliminarToolBarEstadoComision() {
		return this.jButtonEliminarToolBarEstadoComision;
	}
	
	public JButton getjButtonCancelarToolBarEstadoComision() {
		return this.jButtonCancelarToolBarEstadoComision;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoComision() {
		return this.jButtonProcesarInformacionEstadoComision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoComision)	{
		this.jButtonProcesarInformacionEstadoComision = jButtonProcesarInformacionEstadoComision;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoComision() {
		return this.jComboBoxTiposAccionesEstadoComision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoComision(
			JComboBox jComboBoxTiposRelacionesEstadoComision) {
		this.jComboBoxTiposRelacionesEstadoComision = jComboBoxTiposRelacionesEstadoComision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoComision(
			JComboBox jComboBoxTiposAccionesEstadoComision) {
		this.jComboBoxTiposAccionesEstadoComision = jComboBoxTiposAccionesEstadoComision;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoComision() {
		return this.jComboBoxTiposAccionesFormularioEstadoComision;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoComision(
			JComboBox jComboBoxTiposAccionesFormularioEstadoComision) {
		this.jComboBoxTiposAccionesFormularioEstadoComision = jComboBoxTiposAccionesFormularioEstadoComision;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadocomisionSessionBean=new EstadoComisionSessionBean();
		
		this.estadocomisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocomisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocomisionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoComisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoComisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoComisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Comision MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoComisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoComision= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoComision=new JButtonMe();
				this.jButtonModificarToolBarEstadoComision=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoComision,this.jTtoolBarDetalleEstadoComision,
							"actualizar","actualizar","Actualizar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoComision,this.jTtoolBarDetalleEstadoComision,
							"eliminar","eliminar","Eliminar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoComision,this.jTtoolBarDetalleEstadoComision,
							"cancelar","cancelar","Cancelar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoComision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoComision,this.jTtoolBarDetalleEstadoComision,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoComision=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoComision=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoComision=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoComision=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoComision=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoComision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoComision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoComision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoComision= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoComision.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoComision,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoComision= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoComision.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoComision,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoComision= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoComision.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoComision,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoComision= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoComision.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoComision,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoComision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoComision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoComision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoComision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoComision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoComision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoComision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoComision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoComision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoComision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoComision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoComision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoComision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoComision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoComision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoComision.add(this.jMenuItemDetalleCerrarEstadoComision);
		
		this.jmenuDetalleAccionesEstadoComision.add(this.jMenuItemActualizarEstadoComision);
		this.jmenuDetalleAccionesEstadoComision.add(this.jMenuItemEliminarEstadoComision);
		this.jmenuDetalleAccionesEstadoComision.add(this.jMenuItemCancelarEstadoComision);		
		
		//this.jmenuDetalleDatosEstadoComision.add(this.jMenuItemDetalleAbrirOrderByEstadoComision);				
		this.jmenuDetalleDatosEstadoComision.add(this.jMenuItemDetalleMostarOcultarEstadoComision);				
				
		//this.jmenuDetalleAccionesEstadoComision.add(this.jMenuItemGuardarCambiosEstadoComision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoComision.add(this.jmenuDetalleArchivoEstadoComision);		
		this.jmenuBarDetalleEstadoComision.add(this.jmenuDetalleAccionesEstadoComision);		
		this.jmenuBarDetalleEstadoComision.add(this.jmenuDetalleDatosEstadoComision);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoComision);				
	}
	
	
	public void inicializarElementosCamposEstadoComision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoComision = new JLabelMe();
		jLabelIdEstadoComision.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoComision = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoComision.setToolTipText(EstadoComisionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoComision= new GridBagLayout();

		this.jPanelidEstadoComision.setLayout(this.gridaBagLayoutEstadoComision);

		jTextFieldidEstadoComision = new JTextFieldMe();
		jTextFieldidEstadoComision.setText("Id");

		jTextFieldidEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoComision = new JLabelMe();
		this.jLabelcodigoEstadoComision.setText(""+EstadoComisionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoComision.setToolTipText("Codigo");
		this.jLabelcodigoEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoComision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoComision.setToolTipText(EstadoComisionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoComision = new GridBagLayout();
		this.jPanelcodigoEstadoComision.setLayout(this.gridaBagLayoutEstadoComision);


		jTextFieldcodigoEstadoComision= new JTextFieldMe();

		jTextFieldcodigoEstadoComision.setEnabled(false);
		jTextFieldcodigoEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoComisionBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoComisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoComisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoComisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoComisionBusqueda.setText("U");
		this.jButtoncodigoEstadoComisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoComisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoComisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoComision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoComision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoComisionBusqueda"));

		if(this.estadocomisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoComisionBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoComision = new JLabelMe();
		this.jLabelnombreEstadoComision.setText(""+EstadoComisionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoComision.setToolTipText("Nombre");
		this.jLabelnombreEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoComision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoComision.setToolTipText(EstadoComisionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoComision = new GridBagLayout();
		this.jPanelnombreEstadoComision.setLayout(this.gridaBagLayoutEstadoComision);


		jTextAreanombreEstadoComision= new JTextAreaMe();
		jTextAreanombreEstadoComision.setEnabled(false);
		jTextAreanombreEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoComision.setLineWrap(true);
		jTextAreanombreEstadoComision.setWrapStyleWord(true);
		jTextAreanombreEstadoComision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoComision.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoComision = new JScrollPane(jTextAreanombreEstadoComision);
		jscrollPanenombreEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoComisionBusqueda= new JButtonMe();
		this.jButtonnombreEstadoComisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoComisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoComisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoComisionBusqueda.setText("U");
		this.jButtonnombreEstadoComisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoComisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoComisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoComision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoComision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoComisionBusqueda"));

		if(this.estadocomisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoComisionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoComision() {
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
		//this.jInternalFrameDetalleEstadoComision = new EstadoComisionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Comision DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoComision= new GridBagLayout();
		

		
		String sToolTipEstadoComision="";
		sToolTipEstadoComision=EstadoComisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoComision+="(Comisiones.EstadoComision)";
		}
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoComision+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoComision = new JButtonMe();
		this.jButtonModificarEstadoComision = new JButtonMe();
        this.jButtonActualizarEstadoComision = new JButtonMe();
        this.jButtonEliminarEstadoComision = new JButtonMe();
        this.jButtonCancelarEstadoComision = new JButtonMe();
        this.jButtonGuardarCambiosEstadoComision = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoComision = new JButtonMe();
		this.jButtonCerrarEstadoComision = new JButtonMe();
		
		this.jScrollPanelDatosEstadoComision = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoComision = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoComision = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Comision";
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Comisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoComision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoComision.setName("jPanelCamposEstadoComision"); 

		this.jPanelCamposOcultosEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoComision.setName("jPanelCamposOcultosEstadoComision"); 

        this.jPanelAccionesEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoComision.setToolTipText("Acciones");
        this.jPanelAccionesEstadoComision.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoComision.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoComision.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoComision.setText("Nuevo");
		this.jButtonModificarEstadoComision.setText("Editar");
        this.jButtonActualizarEstadoComision.setText("Actualizar");
        this.jButtonEliminarEstadoComision.setText("Eliminar");
        this.jButtonCancelarEstadoComision.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoComision.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoComision.setText("Guardar");
		this.jButtonCerrarEstadoComision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoComision,"nuevo_button","Nuevo",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoComision,"modificar_button","Editar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoComision,"actualizar_button","Actualizar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoComision,"eliminar_button","Eliminar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoComision,"cancelar_button","Cancelar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoComision,"guardarcambios_button","Guardar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoComision,"guardarcambiostabla_button","Guardar",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoComision,"cerrar_button","Salir",this.estadocomisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoComision.setToolTipText("Nuevo"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoComision.setToolTipText("Editar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoComision.setToolTipText("Actualizar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoComision.setToolTipText("Eliminar)"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoComision.setToolTipText("Cancelar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoComision.setToolTipText("Guardar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoComision.setToolTipText("Guardar"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoComision.setToolTipText("Salir"+" "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoComision";
		inputMap = this.jButtonNuevoEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoComision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoComision"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoComision";
		inputMap = this.jButtonActualizarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoComision"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoComision";
		inputMap = this.jButtonEliminarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoComision"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoComision";
		inputMap = this.jButtonCancelarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoComision"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoComision";
		inputMap = this.jButtonCerrarEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoComision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoComision";
		inputMap = this.jButtonGuardarCambiosTablaEstadoComision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoComision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoComision"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoComision = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoComision.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoComision.setToolTipText("Nuevo EstadoComision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoComision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoComision.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoComision.setToolTipText("Sin Cerrar Ventana EstadoComision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoComision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoComision.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoComision.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoComision.setText("Accion");
		this.jComboBoxTiposAccionesEstadoComision.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoComision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoComision.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoComision.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoComision = new JLabelMe();
		
		this.jLabelAccionesEstadoComision.setText("Acciones");		
		this.jLabelAccionesEstadoComision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoComision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoComision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoComision();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoComision();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoComision=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoComision,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoComision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoComision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoComision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoComision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoComision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoComision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoComision.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoComision, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoComision = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoComision = new GridBagLayout();
		
		this.jPanelCamposEstadoComision.setLayout(gridaBagLayoutCamposEstadoComision);
		this.jPanelCamposOcultosEstadoComision.setLayout(gridaBagLayoutCamposOcultosEstadoComision);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoComision.gridy = 0;
	this.gridBagConstraintsEstadoComision.gridx = 0;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoComision.add(jLabelIdEstadoComision, this.gridBagConstraintsEstadoComision);



	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoComision.gridy = 0;
	this.gridBagConstraintsEstadoComision.gridx = 1;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoComision.add(jTextFieldidEstadoComision, this.gridBagConstraintsEstadoComision);


	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoComision.gridy = 0;
	this.gridBagConstraintsEstadoComision.gridx = 0;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoComision.add(jLabelcodigoEstadoComision, this.gridBagConstraintsEstadoComision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		//this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = 0;
		this.gridBagConstraintsEstadoComision.gridx = 2;
		this.gridBagConstraintsEstadoComision.ipadx = 0;
		this.gridBagConstraintsEstadoComision.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoComision.add(jButtoncodigoEstadoComisionBusqueda, this.gridBagConstraintsEstadoComision);
	}

	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoComision.gridy = 0;
	this.gridBagConstraintsEstadoComision.gridx = 1;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoComision.add(jTextFieldcodigoEstadoComision, this.gridBagConstraintsEstadoComision);


	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoComision.gridy = 0;
	this.gridBagConstraintsEstadoComision.gridx = 0;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoComision.add(jLabelnombreEstadoComision, this.gridBagConstraintsEstadoComision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		//this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoComision.gridy = 0;
		this.gridBagConstraintsEstadoComision.gridx = 2;
		this.gridBagConstraintsEstadoComision.ipadx = 0;
		this.gridBagConstraintsEstadoComision.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoComision.add(jButtonnombreEstadoComisionBusqueda, this.gridBagConstraintsEstadoComision);
	}

	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoComision.gridy = 0;
	this.gridBagConstraintsEstadoComision.gridx = 1;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoComision.add(jscrollPanenombreEstadoComision, this.gridBagConstraintsEstadoComision);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoComision.gridy = iYPanelCamposEstadoComision;
	this.gridBagConstraintsEstadoComision.gridx = iXPanelCamposEstadoComision++;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoComision.add(this.jPanelidEstadoComision, this.gridBagConstraintsEstadoComision);



	if(iXPanelCamposEstadoComision % 1==0) {
		iXPanelCamposEstadoComision=0;
		iYPanelCamposEstadoComision++;
	}
	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoComision.gridy = iYPanelCamposEstadoComision;
	this.gridBagConstraintsEstadoComision.gridx = iXPanelCamposEstadoComision++;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoComision.add(this.jPanelcodigoEstadoComision, this.gridBagConstraintsEstadoComision);



	if(iXPanelCamposEstadoComision % 1==0) {
		iXPanelCamposEstadoComision=0;
		iYPanelCamposEstadoComision++;
	}
	this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoComision.gridy = iYPanelCamposEstadoComision;
	this.gridBagConstraintsEstadoComision.gridx = iXPanelCamposEstadoComision++;
	this.gridBagConstraintsEstadoComision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoComision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoComision.add(this.jPanelnombreEstadoComision, this.gridBagConstraintsEstadoComision);



	if(iXPanelCamposEstadoComision % 1==0) {
		iXPanelCamposEstadoComision=0;
		iYPanelCamposEstadoComision++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoComision= new GridBagLayout();
		this.jPanelAccionesEstadoComision.setLayout(gridaBagLayoutAccionesEstadoComision);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoComision= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoComision.setLayout(gridaBagLayoutAccionesFormularioEstadoComision);
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoComision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoComision.add(this.jComboBoxTiposAccionesFormularioEstadoComision, this.gridBagConstraintsEstadoComision);

		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoComision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoComision.add(this.jCheckBoxPostAccionNuevoEstadoComision, this.gridBagConstraintsEstadoComision);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoComision.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoComision.add(this.jCheckBoxPostAccionSinCerrarEstadoComision, this.gridBagConstraintsEstadoComision);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoComision.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoComision.add(this.jCheckBoxPostAccionSinMensajeEstadoComision, this.gridBagConstraintsEstadoComision);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = 0;
		this.gridBagConstraintsEstadoComision.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoComision.add(this.jButtonModificarEstadoComision, this.gridBagConstraintsEstadoComision);							

		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoComision.gridy = 0;
		this.gridBagConstraintsEstadoComision.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoComision.add(this.jButtonEliminarEstadoComision, this.gridBagConstraintsEstadoComision);
		
			
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = 0;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoComision.add(this.jButtonActualizarEstadoComision, this.gridBagConstraintsEstadoComision);


		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = 0;		
		this.gridBagConstraintsEstadoComision.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoComision.add(this.jButtonGuardarCambiosEstadoComision, this.gridBagConstraintsEstadoComision);	
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = 0;		
		this.gridBagConstraintsEstadoComision.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoComision.add(this.jButtonCancelarEstadoComision, this.gridBagConstraintsEstadoComision);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoComision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoComision);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();						
			this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoComision.gridx = 0;		
			//this.gridBagConstraintsEstadoComision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoComision.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoComision.gridx =0;
		this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoComision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoComision, this.gridBagConstraintsEstadoComision);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoComision = new EstadoComisionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Comision DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Comision DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Comision Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoComisionModel estadocomisionModel=new EstadoComisionModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoComisionModel.EstadoComisionFocusTraversalPolicy estadocomisionFocusTraversalPolicy = estadocomisionModel.new EstadoComisionFocusTraversalPolicy(this);
			
			//estadocomisionFocusTraversalPolicy.setestadocomisionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadocomisionModel);
			
			
			this.jContentPaneDetalleEstadoComision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoComision = new GridBagLayout();	
			this.jContentPaneDetalleEstadoComision.setLayout(gridaBagLayoutDetalleEstadoComision);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoComision = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoComision = new GridBagConstraints();
				this.gridBagConstraintsEstadoComision.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoComision.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoComision.add(jTtoolBarDetalleEstadoComision, gridBagConstraintsEstadoComision);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoComision=   new JScrollPane(jContentPaneDetalleEstadoComision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoComision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoComision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoComision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoComision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoComision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoComision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoComision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoComision.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoComision.gridx = 0;
	        
			this.jContentPaneDetalleEstadoComision.add(jPanelCamposEstadoComision, gridBagConstraintsEstadoComision);
			
			
			
			
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
						&& estadocomisionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoComision= new GridBagConstraints();
						this.gridBagConstraintsEstadoComision.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoComision.gridx = 0;
						this.jContentPaneDetalleEstadoComision.add(this.jTabbedPaneRelacionesEstadoComision, this.gridBagConstraintsEstadoComision);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoComision.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoComision.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoComision = new GridBagConstraints();
					this.gridBagConstraintsEstadoComision.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoComision.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoComision.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoComision.add(jPanelCamposOcultosEstadoComision, gridBagConstraintsEstadoComision);
				
					this.jPanelCamposOcultosEstadoComision.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoComision.gridx = 0;
	        this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoComision.add(this.jPanelAccionesFormularioEstadoComision, this.gridBagConstraintsEstadoComision);							
			
			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
	        this.gridBagConstraintsEstadoComision.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoComision.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoComision.add(this.jPanelAccionesEstadoComision, this.gridBagConstraintsEstadoComision);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoComision);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoComision=   new JScrollPane(this.jPanelCamposEstadoComision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoComision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoComision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoComision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoComision.gridx = 0;
			this.gridBagConstraintsEstadoComision.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoComision.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoComision.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoComision, this.gridBagConstraintsEstadoComision);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoComision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoComision, this.gridBagConstraintsEstadoComision);			
			
			this.gridBagConstraintsEstadoComision = new GridBagConstraints();
			this.gridBagConstraintsEstadoComision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoComision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoComision, this.gridBagConstraintsEstadoComision);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoComision, this.gridBagConstraintsEstadoComision);
			
			
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoComision, this.gridBagConstraintsEstadoComision);
		
			
		this.gridBagConstraintsEstadoComision = new GridBagConstraints();
		this.gridBagConstraintsEstadoComision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoComision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoComision, this.gridBagConstraintsEstadoComision);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoComision;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoComision;
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
