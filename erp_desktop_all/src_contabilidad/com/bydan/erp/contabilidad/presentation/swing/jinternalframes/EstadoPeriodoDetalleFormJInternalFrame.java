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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.EstadoPeriodoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class EstadoPeriodoDetalleFormJInternalFrame extends EstadoPeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPeriodo;
	
	protected JMenuBar jmenuBarDetalleEstadoPeriodo;
	
	protected JMenu jmenuDetalleEstadoPeriodo;
	protected JMenu jmenuDetalleArchivoEstadoPeriodo;
	protected JMenu jmenuDetalleAccionesEstadoPeriodo;
	protected JMenu jmenuDetalleDatosEstadoPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPeriodo;	
	protected GridBagConstraints gridBagConstraintsEstadoPeriodo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPeriodoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPeriodo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPeriodoSessionBean estadoperiodoSessionBean;
	
	
	
		
	
	public EstadoPeriodoLogic estadoperiodoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPeriodo;
	public JScrollPane jScrollPanelDatosEdicionEstadoPeriodo;
	public JScrollPane jScrollPanelDatosGeneralEstadoPeriodo;
	
	protected JPanel jPanelCamposEstadoPeriodo;    
	protected JPanel jPanelCamposOcultosEstadoPeriodo;    	
	protected JPanel jPanelAccionesEstadoPeriodo;
	protected JPanel jPanelAccionesFormularioEstadoPeriodo;
    
	
	
	protected Integer iXPanelCamposEstadoPeriodo=0;
	protected Integer iYPanelCamposEstadoPeriodo=0;
	
	protected Integer iXPanelCamposOcultosEstadoPeriodo=0;
	protected Integer iYPanelCamposOcultosEstadoPeriodo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPeriodo;
	public JButton jButtonModificarEstadoPeriodo;
	public JButton jButtonActualizarEstadoPeriodo;
    public JButton jButtonEliminarEstadoPeriodo;
	public JButton jButtonCancelarEstadoPeriodo;
    public JButton jButtonGuardarCambiosEstadoPeriodo;
	public JButton jButtonGuardarCambiosTablaEstadoPeriodo;
	protected JButton jButtonCerrarEstadoPeriodo;
	
	
	protected JButton jButtonProcesarInformacionEstadoPeriodo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPeriodo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPeriodo;
	protected JButton jButtonModificarToolBarEstadoPeriodo;
	protected JButton jButtonActualizarToolBarEstadoPeriodo;
    protected JButton jButtonEliminarToolBarEstadoPeriodo;
	protected JButton jButtonCancelarToolBarEstadoPeriodo;
    protected JButton jButtonGuardarCambiosToolBarEstadoPeriodo;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPeriodo;
	protected JButton jButtonCerrarToolBarEstadoPeriodo;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPeriodo;
	protected JMenuItem jMenuItemModificarEstadoPeriodo;
	protected JMenuItem jMenuItemActualizarEstadoPeriodo;
    protected JMenuItem jMenuItemEliminarEstadoPeriodo;
	protected JMenuItem jMenuItemCancelarEstadoPeriodo;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPeriodo;
	protected JMenuItem jMenuItemCerrarEstadoPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPeriodo;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPeriodo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPeriodo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPeriodo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPeriodo;
	public JLabel jLabelIdEstadoPeriodo;
	public JTextFieldMe jTextFieldidEstadoPeriodo;
	public JButton jButtonidEstadoPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoPeriodo;
	public JLabel jLabelcodigoEstadoPeriodo;
	public JTextField jTextFieldcodigoEstadoPeriodo;
	public JButton jButtoncodigoEstadoPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPeriodo;
	public JLabel jLabelnombreEstadoPeriodo;
	public JTextArea jTextAreanombreEstadoPeriodo;
	public JScrollPane jscrollPanenombreEstadoPeriodo;
	public JButton jButtonnombreEstadoPeriodoBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoEstadoPeriodo;
	public JLabel jLabeles_defectoEstadoPeriodo;
	public JCheckBox jCheckBoxes_defectoEstadoPeriodo;
	public JButton jButtones_defectoEstadoPeriodoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPeriodo;
	
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
	
	public EstadoPeriodoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPeriodo=new JPanel();
				this.jPanelAccionesFormularioEstadoPeriodo=new JPanel();
				this.jmenuBarDetalleEstadoPeriodo=new JMenuBar();
				this.jTtoolBarDetalleEstadoPeriodo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPeriodoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPeriodoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPeriodo() {
		return this.jButtonActualizarToolBarEstadoPeriodo;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPeriodo() {
		return this.jButtonEliminarToolBarEstadoPeriodo;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPeriodo() {
		return this.jButtonCancelarToolBarEstadoPeriodo;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPeriodo() {
		return this.jButtonProcesarInformacionEstadoPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPeriodo)	{
		this.jButtonProcesarInformacionEstadoPeriodo = jButtonProcesarInformacionEstadoPeriodo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPeriodo() {
		return this.jComboBoxTiposAccionesEstadoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPeriodo(
			JComboBox jComboBoxTiposRelacionesEstadoPeriodo) {
		this.jComboBoxTiposRelacionesEstadoPeriodo = jComboBoxTiposRelacionesEstadoPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPeriodo(
			JComboBox jComboBoxTiposAccionesEstadoPeriodo) {
		this.jComboBoxTiposAccionesEstadoPeriodo = jComboBoxTiposAccionesEstadoPeriodo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPeriodo() {
		return this.jComboBoxTiposAccionesFormularioEstadoPeriodo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPeriodo(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPeriodo) {
		this.jComboBoxTiposAccionesFormularioEstadoPeriodo = jComboBoxTiposAccionesFormularioEstadoPeriodo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoperiodoSessionBean=new EstadoPeriodoSessionBean();
		
		this.estadoperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoperiodoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPeriodo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPeriodo=new JButtonMe();
				this.jButtonModificarToolBarEstadoPeriodo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPeriodo,this.jTtoolBarDetalleEstadoPeriodo,
							"actualizar","actualizar","Actualizar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPeriodo,this.jTtoolBarDetalleEstadoPeriodo,
							"eliminar","eliminar","Eliminar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPeriodo,this.jTtoolBarDetalleEstadoPeriodo,
							"cancelar","cancelar","Cancelar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPeriodo,this.jTtoolBarDetalleEstadoPeriodo,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPeriodo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPeriodo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPeriodo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPeriodo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPeriodo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPeriodo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPeriodo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPeriodo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPeriodo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPeriodo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPeriodo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPeriodo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPeriodo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPeriodo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPeriodo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPeriodo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPeriodo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPeriodo.add(this.jMenuItemDetalleCerrarEstadoPeriodo);
		
		this.jmenuDetalleAccionesEstadoPeriodo.add(this.jMenuItemActualizarEstadoPeriodo);
		this.jmenuDetalleAccionesEstadoPeriodo.add(this.jMenuItemEliminarEstadoPeriodo);
		this.jmenuDetalleAccionesEstadoPeriodo.add(this.jMenuItemCancelarEstadoPeriodo);		
		
		//this.jmenuDetalleDatosEstadoPeriodo.add(this.jMenuItemDetalleAbrirOrderByEstadoPeriodo);				
		this.jmenuDetalleDatosEstadoPeriodo.add(this.jMenuItemDetalleMostarOcultarEstadoPeriodo);				
				
		//this.jmenuDetalleAccionesEstadoPeriodo.add(this.jMenuItemGuardarCambiosEstadoPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPeriodo.add(this.jmenuDetalleArchivoEstadoPeriodo);		
		this.jmenuBarDetalleEstadoPeriodo.add(this.jmenuDetalleAccionesEstadoPeriodo);		
		this.jmenuBarDetalleEstadoPeriodo.add(this.jmenuDetalleDatosEstadoPeriodo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPeriodo);				
	}
	
	
	public void inicializarElementosCamposEstadoPeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPeriodo = new JLabelMe();
		jLabelIdEstadoPeriodo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPeriodo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPeriodo.setToolTipText(EstadoPeriodoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPeriodo= new GridBagLayout();

		this.jPanelidEstadoPeriodo.setLayout(this.gridaBagLayoutEstadoPeriodo);

		jTextFieldidEstadoPeriodo = new JTextFieldMe();
		jTextFieldidEstadoPeriodo.setText("Id");

		jTextFieldidEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoPeriodo = new JLabelMe();
		this.jLabelcodigoEstadoPeriodo.setText(""+EstadoPeriodoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoPeriodo.setToolTipText("Codigo");
		this.jLabelcodigoEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoPeriodo.setToolTipText(EstadoPeriodoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoPeriodo = new GridBagLayout();
		this.jPanelcodigoEstadoPeriodo.setLayout(this.gridaBagLayoutEstadoPeriodo);


		jTextFieldcodigoEstadoPeriodo= new JTextFieldMe();

		jTextFieldcodigoEstadoPeriodo.setEnabled(false);
		jTextFieldcodigoEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoPeriodoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoPeriodoBusqueda.setText("U");
		this.jButtoncodigoEstadoPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoPeriodoBusqueda"));

		if(this.estadoperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoPeriodoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoPeriodo = new JLabelMe();
		this.jLabelnombreEstadoPeriodo.setText(""+EstadoPeriodoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPeriodo.setToolTipText("Nombre");
		this.jLabelnombreEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPeriodo.setToolTipText(EstadoPeriodoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPeriodo = new GridBagLayout();
		this.jPanelnombreEstadoPeriodo.setLayout(this.gridaBagLayoutEstadoPeriodo);


		jTextAreanombreEstadoPeriodo= new JTextAreaMe();
		jTextAreanombreEstadoPeriodo.setEnabled(false);
		jTextAreanombreEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPeriodo.setLineWrap(true);
		jTextAreanombreEstadoPeriodo.setWrapStyleWord(true);
		jTextAreanombreEstadoPeriodo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoPeriodo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoPeriodo = new JScrollPane(jTextAreanombreEstadoPeriodo);
		jscrollPanenombreEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoPeriodoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPeriodoBusqueda.setText("U");
		this.jButtonnombreEstadoPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPeriodoBusqueda"));

		if(this.estadoperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPeriodoBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoEstadoPeriodo = new JLabelMe();
		this.jLabeles_defectoEstadoPeriodo.setText(""+EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoEstadoPeriodo.setToolTipText("Es Defecto");
		this.jLabeles_defectoEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoEstadoPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoEstadoPeriodo.setToolTipText(EstadoPeriodoConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutEstadoPeriodo = new GridBagLayout();
		this.jPaneles_defectoEstadoPeriodo.setLayout(this.gridaBagLayoutEstadoPeriodo);


		jCheckBoxes_defectoEstadoPeriodo= new JCheckBoxMe();
		jCheckBoxes_defectoEstadoPeriodo.setEnabled(false);

		jCheckBoxes_defectoEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoEstadoPeriodoBusqueda= new JButtonMe();
		this.jButtones_defectoEstadoPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoEstadoPeriodoBusqueda.setText("U");
		this.jButtones_defectoEstadoPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoEstadoPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoEstadoPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoEstadoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoEstadoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoEstadoPeriodoBusqueda"));

		if(this.estadoperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoEstadoPeriodoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPeriodo() {
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
		//this.jInternalFrameDetalleEstadoPeriodo = new EstadoPeriodoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Periodo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPeriodo= new GridBagLayout();
		

		
		String sToolTipEstadoPeriodo="";
		sToolTipEstadoPeriodo=EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPeriodo+="(Contabilidad.EstadoPeriodo)";
		}
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPeriodo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPeriodo = new JButtonMe();
		this.jButtonModificarEstadoPeriodo = new JButtonMe();
        this.jButtonActualizarEstadoPeriodo = new JButtonMe();
        this.jButtonEliminarEstadoPeriodo = new JButtonMe();
        this.jButtonCancelarEstadoPeriodo = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPeriodo = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPeriodo = new JButtonMe();
		this.jButtonCerrarEstadoPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPeriodo = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPeriodo = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPeriodo = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Periodo";
		
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPeriodo.setName("jPanelCamposEstadoPeriodo"); 

		this.jPanelCamposOcultosEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPeriodo.setName("jPanelCamposOcultosEstadoPeriodo"); 

        this.jPanelAccionesEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPeriodo.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPeriodo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPeriodo.setText("Nuevo");
		this.jButtonModificarEstadoPeriodo.setText("Editar");
        this.jButtonActualizarEstadoPeriodo.setText("Actualizar");
        this.jButtonEliminarEstadoPeriodo.setText("Eliminar");
        this.jButtonCancelarEstadoPeriodo.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPeriodo.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPeriodo.setText("Guardar");
		this.jButtonCerrarEstadoPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPeriodo,"nuevo_button","Nuevo",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPeriodo,"modificar_button","Editar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPeriodo,"actualizar_button","Actualizar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPeriodo,"eliminar_button","Eliminar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPeriodo,"cancelar_button","Cancelar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPeriodo,"guardarcambios_button","Guardar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPeriodo,"guardarcambiostabla_button","Guardar",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPeriodo,"cerrar_button","Salir",this.estadoperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPeriodo.setToolTipText("Nuevo"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPeriodo.setToolTipText("Editar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPeriodo.setToolTipText("Actualizar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPeriodo.setToolTipText("Eliminar)"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPeriodo.setToolTipText("Cancelar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPeriodo.setToolTipText("Guardar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPeriodo.setToolTipText("Guardar"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPeriodo.setToolTipText("Salir"+" "+EstadoPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPeriodo";
		inputMap = this.jButtonNuevoEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPeriodo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPeriodo";
		inputMap = this.jButtonActualizarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPeriodo"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPeriodo";
		inputMap = this.jButtonEliminarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPeriodo"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPeriodo";
		inputMap = this.jButtonCancelarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPeriodo"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPeriodo";
		inputMap = this.jButtonCerrarEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPeriodo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPeriodo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPeriodo.setToolTipText("Nuevo EstadoPeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPeriodo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPeriodo.setToolTipText("Sin Cerrar Ventana EstadoPeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPeriodo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPeriodo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPeriodo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPeriodo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPeriodo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPeriodo = new JLabelMe();
		
		this.jLabelAccionesEstadoPeriodo.setText("Acciones");		
		this.jLabelAccionesEstadoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPeriodo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPeriodo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPeriodo=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPeriodo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPeriodo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPeriodo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPeriodo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPeriodo = new GridBagLayout();
		
		this.jPanelCamposEstadoPeriodo.setLayout(gridaBagLayoutCamposEstadoPeriodo);
		this.jPanelCamposOcultosEstadoPeriodo.setLayout(gridaBagLayoutCamposOcultosEstadoPeriodo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPeriodo.add(jLabelIdEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 1;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPeriodo.add(jTextFieldidEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);


	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoPeriodo.add(jLabelcodigoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;
		this.gridBagConstraintsEstadoPeriodo.gridx = 2;
		this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
		this.gridBagConstraintsEstadoPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoPeriodo.add(jButtoncodigoEstadoPeriodoBusqueda, this.gridBagConstraintsEstadoPeriodo);
	}

	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 1;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoPeriodo.add(jTextFieldcodigoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);


	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPeriodo.add(jLabelnombreEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;
		this.gridBagConstraintsEstadoPeriodo.gridx = 2;
		this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
		this.gridBagConstraintsEstadoPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPeriodo.add(jButtonnombreEstadoPeriodoBusqueda, this.gridBagConstraintsEstadoPeriodo);
	}

	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 1;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPeriodo.add(jscrollPanenombreEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);


	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoEstadoPeriodo.add(jLabeles_defectoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;
		this.gridBagConstraintsEstadoPeriodo.gridx = 2;
		this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
		this.gridBagConstraintsEstadoPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoEstadoPeriodo.add(jButtones_defectoEstadoPeriodoBusqueda, this.gridBagConstraintsEstadoPeriodo);
	}

	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPeriodo.gridy = 0;
	this.gridBagConstraintsEstadoPeriodo.gridx = 1;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoEstadoPeriodo.add(jCheckBoxes_defectoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPeriodo.gridy = iYPanelCamposEstadoPeriodo;
	this.gridBagConstraintsEstadoPeriodo.gridx = iXPanelCamposEstadoPeriodo++;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPeriodo.add(this.jPanelidEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(iXPanelCamposEstadoPeriodo % 1==0) {
		iXPanelCamposEstadoPeriodo=0;
		iYPanelCamposEstadoPeriodo++;
	}
	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPeriodo.gridy = iYPanelCamposEstadoPeriodo;
	this.gridBagConstraintsEstadoPeriodo.gridx = iXPanelCamposEstadoPeriodo++;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPeriodo.add(this.jPanelcodigoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(iXPanelCamposEstadoPeriodo % 1==0) {
		iXPanelCamposEstadoPeriodo=0;
		iYPanelCamposEstadoPeriodo++;
	}
	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPeriodo.gridy = iYPanelCamposEstadoPeriodo;
	this.gridBagConstraintsEstadoPeriodo.gridx = iXPanelCamposEstadoPeriodo++;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPeriodo.add(this.jPanelnombreEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(iXPanelCamposEstadoPeriodo % 1==0) {
		iXPanelCamposEstadoPeriodo=0;
		iYPanelCamposEstadoPeriodo++;
	}
	this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPeriodo.gridy = iYPanelCamposEstadoPeriodo;
	this.gridBagConstraintsEstadoPeriodo.gridx = iXPanelCamposEstadoPeriodo++;
	this.gridBagConstraintsEstadoPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPeriodo.add(this.jPaneles_defectoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);



	if(iXPanelCamposEstadoPeriodo % 1==0) {
		iXPanelCamposEstadoPeriodo=0;
		iYPanelCamposEstadoPeriodo++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPeriodo= new GridBagLayout();
		this.jPanelAccionesEstadoPeriodo.setLayout(gridaBagLayoutAccionesEstadoPeriodo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPeriodo= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPeriodo.setLayout(gridaBagLayoutAccionesFormularioEstadoPeriodo);
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPeriodo.add(this.jComboBoxTiposAccionesFormularioEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);

		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPeriodo.add(this.jCheckBoxPostAccionNuevoEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPeriodo.add(this.jCheckBoxPostAccionSinCerrarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoperiodoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoperiodoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPeriodo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPeriodo.add(this.jCheckBoxPostAccionSinMensajeEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPeriodo.add(this.jButtonModificarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);							

		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;
		this.gridBagConstraintsEstadoPeriodo.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPeriodo.add(this.jButtonEliminarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
			
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPeriodo.add(this.jButtonActualizarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);


		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;		
		this.gridBagConstraintsEstadoPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPeriodo.add(this.jButtonGuardarCambiosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);	
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = 0;		
		this.gridBagConstraintsEstadoPeriodo.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPeriodo.add(this.jButtonCancelarEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPeriodo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPeriodo.gridx = 0;		
			//this.gridBagConstraintsEstadoPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPeriodo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPeriodo.gridx =0;
		this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPeriodoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPeriodo = new EstadoPeriodoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Periodo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Periodo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Periodo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoPeriodoModel estadoperiodoModel=new EstadoPeriodoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPeriodoModel.EstadoPeriodoFocusTraversalPolicy estadoperiodoFocusTraversalPolicy = estadoperiodoModel.new EstadoPeriodoFocusTraversalPolicy(this);
			
			//estadoperiodoFocusTraversalPolicy.setestadoperiodoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoperiodoModel);
			
			
			this.jContentPaneDetalleEstadoPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPeriodo = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPeriodo.setLayout(gridaBagLayoutDetalleEstadoPeriodo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPeriodo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
				this.gridBagConstraintsEstadoPeriodo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPeriodo.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPeriodo.add(jTtoolBarDetalleEstadoPeriodo, gridBagConstraintsEstadoPeriodo);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPeriodo=   new JScrollPane(jContentPaneDetalleEstadoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPeriodo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPeriodo.add(jPanelCamposEstadoPeriodo, gridBagConstraintsEstadoPeriodo);
			
			
			
			
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
						&& estadoperiodoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadoperiodoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPeriodo= new GridBagConstraints();
						this.gridBagConstraintsEstadoPeriodo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPeriodo.gridx = 0;
						this.jContentPaneDetalleEstadoPeriodo.add(this.jTabbedPaneRelacionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPeriodo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPeriodo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
					this.gridBagConstraintsEstadoPeriodo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPeriodo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPeriodo.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPeriodo.add(jPanelCamposOcultosEstadoPeriodo, gridBagConstraintsEstadoPeriodo);
				
					this.jPanelCamposOcultosEstadoPeriodo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	        this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPeriodo.add(this.jPanelAccionesFormularioEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);							
			
			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPeriodo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoPeriodo.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPeriodo.add(this.jPanelAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPeriodo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPeriodo=   new JScrollPane(this.jPanelCamposEstadoPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPeriodo.gridx = 0;
			this.gridBagConstraintsEstadoPeriodo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPeriodo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPeriodo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);			
			
			this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
			this.gridBagConstraintsEstadoPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
			
			
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		
			
		this.gridBagConstraintsEstadoPeriodo = new GridBagConstraints();
		this.gridBagConstraintsEstadoPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPeriodo, this.gridBagConstraintsEstadoPeriodo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPeriodo;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPeriodo;
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
