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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.EstadoRubroConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class EstadoRubroDetalleFormJInternalFrame extends EstadoRubroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoRubro;
	
	protected JMenuBar jmenuBarDetalleEstadoRubro;
	
	protected JMenu jmenuDetalleEstadoRubro;
	protected JMenu jmenuDetalleArchivoEstadoRubro;
	protected JMenu jmenuDetalleAccionesEstadoRubro;
	protected JMenu jmenuDetalleDatosEstadoRubro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRubro;	
	protected GridBagConstraints gridBagConstraintsEstadoRubro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoRubroBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoRubro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRubroSessionBean estadorubroSessionBean;
	
	

	public RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame=null;
	public RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEmpleado=false;
	public RubroEmpleadoSessionBean rubroempleadoSessionBean;
	
		
	
	public EstadoRubroLogic estadorubroLogic;
	
	public JScrollPane jScrollPanelDatosEstadoRubro;
	public JScrollPane jScrollPanelDatosEdicionEstadoRubro;
	public JScrollPane jScrollPanelDatosGeneralEstadoRubro;
	
	protected JPanel jPanelCamposEstadoRubro;    
	protected JPanel jPanelCamposOcultosEstadoRubro;    	
	protected JPanel jPanelAccionesEstadoRubro;
	protected JPanel jPanelAccionesFormularioEstadoRubro;
    
	
	
	protected Integer iXPanelCamposEstadoRubro=0;
	protected Integer iYPanelCamposEstadoRubro=0;
	
	protected Integer iXPanelCamposOcultosEstadoRubro=0;
	protected Integer iYPanelCamposOcultosEstadoRubro=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoRubro;
	public JButton jButtonModificarEstadoRubro;
	public JButton jButtonActualizarEstadoRubro;
    public JButton jButtonEliminarEstadoRubro;
	public JButton jButtonCancelarEstadoRubro;
    public JButton jButtonGuardarCambiosEstadoRubro;
	public JButton jButtonGuardarCambiosTablaEstadoRubro;
	protected JButton jButtonCerrarEstadoRubro;
	
	
	protected JButton jButtonProcesarInformacionEstadoRubro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoRubro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoRubro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoRubro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRubro;
	protected JButton jButtonModificarToolBarEstadoRubro;
	protected JButton jButtonActualizarToolBarEstadoRubro;
    protected JButton jButtonEliminarToolBarEstadoRubro;
	protected JButton jButtonCancelarToolBarEstadoRubro;
    protected JButton jButtonGuardarCambiosToolBarEstadoRubro;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoRubro;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRubro;
	protected JButton jButtonCerrarToolBarEstadoRubro;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoRubro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRubro;
	protected JMenuItem jMenuItemModificarEstadoRubro;
	protected JMenuItem jMenuItemActualizarEstadoRubro;
    protected JMenuItem jMenuItemEliminarEstadoRubro;
	protected JMenuItem jMenuItemCancelarEstadoRubro;
    protected JMenuItem jMenuItemGuardarCambiosEstadoRubro;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRubro;
	protected JMenuItem jMenuItemCerrarEstadoRubro;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRubro;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRubro;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoRubro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRubro;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRubro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRubro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRubro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoRubro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoRubro;
	public JLabel jLabelIdEstadoRubro;
	public JTextFieldMe jTextFieldidEstadoRubro;
	public JButton jButtonidEstadoRubroBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoRubro;
	public JLabel jLabelcodigoEstadoRubro;
	public JTextField jTextFieldcodigoEstadoRubro;
	public JButton jButtoncodigoEstadoRubroBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoRubro;
	public JLabel jLabelnombreEstadoRubro;
	public JTextArea jTextAreanombreEstadoRubro;
	public JScrollPane jscrollPanenombreEstadoRubro;
	public JButton jButtonnombreEstadoRubroBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoRubro;
	
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
	
	public EstadoRubroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoRubro=new JPanel();
				this.jPanelAccionesFormularioEstadoRubro=new JPanel();
				this.jmenuBarDetalleEstadoRubro=new JMenuBar();
				this.jTtoolBarDetalleEstadoRubro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoRubroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoRubro() {
		return this.jButtonActualizarToolBarEstadoRubro;
	}
	
	public JButton getjButtonEliminarToolBarEstadoRubro() {
		return this.jButtonEliminarToolBarEstadoRubro;
	}
	
	public JButton getjButtonCancelarToolBarEstadoRubro() {
		return this.jButtonCancelarToolBarEstadoRubro;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoRubro() {
		return this.jButtonProcesarInformacionEstadoRubro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRubro)	{
		this.jButtonProcesarInformacionEstadoRubro = jButtonProcesarInformacionEstadoRubro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRubro() {
		return this.jComboBoxTiposAccionesEstadoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRubro(
			JComboBox jComboBoxTiposRelacionesEstadoRubro) {
		this.jComboBoxTiposRelacionesEstadoRubro = jComboBoxTiposRelacionesEstadoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRubro(
			JComboBox jComboBoxTiposAccionesEstadoRubro) {
		this.jComboBoxTiposAccionesEstadoRubro = jComboBoxTiposAccionesEstadoRubro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoRubro() {
		return this.jComboBoxTiposAccionesFormularioEstadoRubro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoRubro(
			JComboBox jComboBoxTiposAccionesFormularioEstadoRubro) {
		this.jComboBoxTiposAccionesFormularioEstadoRubro = jComboBoxTiposAccionesFormularioEstadoRubro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadorubroSessionBean=new EstadoRubroSessionBean();
		
		this.estadorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadorubroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRubroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoRubro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoRubro=new JButtonMe();
				this.jButtonModificarToolBarEstadoRubro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoRubro,this.jTtoolBarDetalleEstadoRubro,
							"actualizar","actualizar","Actualizar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoRubro,this.jTtoolBarDetalleEstadoRubro,
							"eliminar","eliminar","Eliminar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoRubro,this.jTtoolBarDetalleEstadoRubro,
							"cancelar","cancelar","Cancelar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoRubro,this.jTtoolBarDetalleEstadoRubro,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoRubro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoRubro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoRubro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoRubro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoRubro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRubro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRubro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRubro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoRubro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoRubro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoRubro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoRubro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoRubro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoRubro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoRubro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoRubro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoRubro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoRubro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoRubro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoRubro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoRubro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRubro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRubro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRubro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRubro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoRubro.add(this.jMenuItemDetalleCerrarEstadoRubro);
		
		this.jmenuDetalleAccionesEstadoRubro.add(this.jMenuItemActualizarEstadoRubro);
		this.jmenuDetalleAccionesEstadoRubro.add(this.jMenuItemEliminarEstadoRubro);
		this.jmenuDetalleAccionesEstadoRubro.add(this.jMenuItemCancelarEstadoRubro);		
		
		//this.jmenuDetalleDatosEstadoRubro.add(this.jMenuItemDetalleAbrirOrderByEstadoRubro);				
		this.jmenuDetalleDatosEstadoRubro.add(this.jMenuItemDetalleMostarOcultarEstadoRubro);				
				
		//this.jmenuDetalleAccionesEstadoRubro.add(this.jMenuItemGuardarCambiosEstadoRubro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoRubro.add(this.jmenuDetalleArchivoEstadoRubro);		
		this.jmenuBarDetalleEstadoRubro.add(this.jmenuDetalleAccionesEstadoRubro);		
		this.jmenuBarDetalleEstadoRubro.add(this.jmenuDetalleDatosEstadoRubro);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoRubro.add(this.jmenuDetalleEstadoRubro);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoRubro);				
	}
	
	
	public void inicializarElementosCamposEstadoRubro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoRubro = new JLabelMe();
		jLabelIdEstadoRubro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoRubro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoRubro.setToolTipText(EstadoRubroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoRubro= new GridBagLayout();

		this.jPanelidEstadoRubro.setLayout(this.gridaBagLayoutEstadoRubro);

		jTextFieldidEstadoRubro = new JTextFieldMe();
		jTextFieldidEstadoRubro.setText("Id");

		jTextFieldidEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoRubro = new JLabelMe();
		this.jLabelcodigoEstadoRubro.setText(""+EstadoRubroConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoRubro.setToolTipText("Codigo");
		this.jLabelcodigoEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoRubro.setToolTipText(EstadoRubroConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoRubro = new GridBagLayout();
		this.jPanelcodigoEstadoRubro.setLayout(this.gridaBagLayoutEstadoRubro);


		jTextFieldcodigoEstadoRubro= new JTextFieldMe();

		jTextFieldcodigoEstadoRubro.setEnabled(false);
		jTextFieldcodigoEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoRubroBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoRubroBusqueda.setText("U");
		this.jButtoncodigoEstadoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoRubroBusqueda"));

		if(this.estadorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoRubroBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoRubro = new JLabelMe();
		this.jLabelnombreEstadoRubro.setText(""+EstadoRubroConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoRubro.setToolTipText("Nombre");
		this.jLabelnombreEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoRubro.setToolTipText(EstadoRubroConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoRubro = new GridBagLayout();
		this.jPanelnombreEstadoRubro.setLayout(this.gridaBagLayoutEstadoRubro);


		jTextAreanombreEstadoRubro= new JTextAreaMe();
		jTextAreanombreEstadoRubro.setEnabled(false);
		jTextAreanombreEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoRubro.setLineWrap(true);
		jTextAreanombreEstadoRubro.setWrapStyleWord(true);
		jTextAreanombreEstadoRubro.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoRubro.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoRubro = new JScrollPane(jTextAreanombreEstadoRubro);
		jscrollPanenombreEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoRubroBusqueda= new JButtonMe();
		this.jButtonnombreEstadoRubroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRubroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoRubroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoRubroBusqueda.setText("U");
		this.jButtonnombreEstadoRubroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoRubroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoRubroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoRubroBusqueda"));

		if(this.estadorubroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoRubroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoRubro() {
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
		//this.jInternalFrameDetalleEstadoRubro = new EstadoRubroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Rubro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRubro= new GridBagLayout();
		

		
		String sToolTipEstadoRubro="";
		sToolTipEstadoRubro=EstadoRubroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRubro+="(Nomina.EstadoRubro)";
		}
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRubro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoRubro = new JButtonMe();
		this.jButtonModificarEstadoRubro = new JButtonMe();
        this.jButtonActualizarEstadoRubro = new JButtonMe();
        this.jButtonEliminarEstadoRubro = new JButtonMe();
        this.jButtonCancelarEstadoRubro = new JButtonMe();
        this.jButtonGuardarCambiosEstadoRubro = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoRubro = new JButtonMe();
		this.jButtonCerrarEstadoRubro = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRubro = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoRubro = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoRubro = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Rubro";
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoRubro.setName("jPanelCamposEstadoRubro"); 

		this.jPanelCamposOcultosEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoRubro.setName("jPanelCamposOcultosEstadoRubro"); 

        this.jPanelAccionesEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRubro.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRubro.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoRubro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoRubro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoRubro.setText("Nuevo");
		this.jButtonModificarEstadoRubro.setText("Editar");
        this.jButtonActualizarEstadoRubro.setText("Actualizar");
        this.jButtonEliminarEstadoRubro.setText("Eliminar");
        this.jButtonCancelarEstadoRubro.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoRubro.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoRubro.setText("Guardar");
		this.jButtonCerrarEstadoRubro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRubro,"nuevo_button","Nuevo",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoRubro,"modificar_button","Editar",this.estadorubroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoRubro,"actualizar_button","Actualizar",this.estadorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoRubro,"eliminar_button","Eliminar",this.estadorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoRubro,"cancelar_button","Cancelar",this.estadorubroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoRubro,"guardarcambios_button","Guardar",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRubro,"guardarcambiostabla_button","Guardar",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRubro,"cerrar_button","Salir",this.estadorubroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoRubro.setToolTipText("Nuevo"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoRubro.setToolTipText("Editar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoRubro.setToolTipText("Actualizar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoRubro.setToolTipText("Eliminar)"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoRubro.setToolTipText("Cancelar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoRubro.setToolTipText("Guardar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoRubro.setToolTipText("Guardar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRubro.setToolTipText("Salir"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRubro";
		inputMap = this.jButtonNuevoEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRubro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoRubro";
		inputMap = this.jButtonActualizarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoRubro"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoRubro";
		inputMap = this.jButtonEliminarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoRubro"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoRubro";
		inputMap = this.jButtonCancelarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoRubro"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoRubro";
		inputMap = this.jButtonCerrarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRubro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRubro";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRubro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoRubro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoRubro.setToolTipText("Nuevo EstadoRubro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoRubro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoRubro.setToolTipText("Sin Cerrar Ventana EstadoRubro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoRubro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoRubro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoRubro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRubro.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRubro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoRubro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoRubro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoRubro = new JLabelMe();
		
		this.jLabelAccionesEstadoRubro.setText("Acciones");		
		this.jLabelAccionesEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoRubro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoRubro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoRubro=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoRubro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoRubro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRubro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoRubro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoRubro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoRubro = new GridBagLayout();
		
		this.jPanelCamposEstadoRubro.setLayout(gridaBagLayoutCamposEstadoRubro);
		this.jPanelCamposOcultosEstadoRubro.setLayout(gridaBagLayoutCamposOcultosEstadoRubro);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRubro.gridy = 0;
	this.gridBagConstraintsEstadoRubro.gridx = 0;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoRubro.add(jLabelIdEstadoRubro, this.gridBagConstraintsEstadoRubro);



	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRubro.gridy = 0;
	this.gridBagConstraintsEstadoRubro.gridx = 1;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoRubro.add(jTextFieldidEstadoRubro, this.gridBagConstraintsEstadoRubro);


	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRubro.gridy = 0;
	this.gridBagConstraintsEstadoRubro.gridx = 0;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoRubro.add(jLabelcodigoEstadoRubro, this.gridBagConstraintsEstadoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = 0;
		this.gridBagConstraintsEstadoRubro.gridx = 2;
		this.gridBagConstraintsEstadoRubro.ipadx = 0;
		this.gridBagConstraintsEstadoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoRubro.add(jButtoncodigoEstadoRubroBusqueda, this.gridBagConstraintsEstadoRubro);
	}

	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRubro.gridy = 0;
	this.gridBagConstraintsEstadoRubro.gridx = 1;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoRubro.add(jTextFieldcodigoEstadoRubro, this.gridBagConstraintsEstadoRubro);


	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRubro.gridy = 0;
	this.gridBagConstraintsEstadoRubro.gridx = 0;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoRubro.add(jLabelnombreEstadoRubro, this.gridBagConstraintsEstadoRubro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = 0;
		this.gridBagConstraintsEstadoRubro.gridx = 2;
		this.gridBagConstraintsEstadoRubro.ipadx = 0;
		this.gridBagConstraintsEstadoRubro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoRubro.add(jButtonnombreEstadoRubroBusqueda, this.gridBagConstraintsEstadoRubro);
	}

	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoRubro.gridy = 0;
	this.gridBagConstraintsEstadoRubro.gridx = 1;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoRubro.add(jscrollPanenombreEstadoRubro, this.gridBagConstraintsEstadoRubro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRubro.gridy = iYPanelCamposEstadoRubro;
	this.gridBagConstraintsEstadoRubro.gridx = iXPanelCamposEstadoRubro++;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRubro.add(this.jPanelidEstadoRubro, this.gridBagConstraintsEstadoRubro);



	if(iXPanelCamposEstadoRubro % 1==0) {
		iXPanelCamposEstadoRubro=0;
		iYPanelCamposEstadoRubro++;
	}
	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRubro.gridy = iYPanelCamposEstadoRubro;
	this.gridBagConstraintsEstadoRubro.gridx = iXPanelCamposEstadoRubro++;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRubro.add(this.jPanelcodigoEstadoRubro, this.gridBagConstraintsEstadoRubro);



	if(iXPanelCamposEstadoRubro % 1==0) {
		iXPanelCamposEstadoRubro=0;
		iYPanelCamposEstadoRubro++;
	}
	this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoRubro.gridy = iYPanelCamposEstadoRubro;
	this.gridBagConstraintsEstadoRubro.gridx = iXPanelCamposEstadoRubro++;
	this.gridBagConstraintsEstadoRubro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoRubro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoRubro.add(this.jPanelnombreEstadoRubro, this.gridBagConstraintsEstadoRubro);



	if(iXPanelCamposEstadoRubro % 1==0) {
		iXPanelCamposEstadoRubro=0;
		iYPanelCamposEstadoRubro++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoRubro= new GridBagLayout();
		this.jPanelAccionesEstadoRubro.setLayout(gridaBagLayoutAccionesEstadoRubro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoRubro= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoRubro.setLayout(gridaBagLayoutAccionesFormularioEstadoRubro);
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRubro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRubro.add(this.jComboBoxTiposAccionesFormularioEstadoRubro, this.gridBagConstraintsEstadoRubro);

		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoRubro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoRubro.add(this.jCheckBoxPostAccionNuevoEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRubro.add(this.jCheckBoxPostAccionSinCerrarEstadoRubro, this.gridBagConstraintsEstadoRubro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoRubro.add(this.jCheckBoxPostAccionSinMensajeEstadoRubro, this.gridBagConstraintsEstadoRubro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = 0;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoRubro.add(this.jButtonModificarEstadoRubro, this.gridBagConstraintsEstadoRubro);							

		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = 0;
		this.gridBagConstraintsEstadoRubro.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoRubro.add(this.jButtonEliminarEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
			
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = 0;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRubro.add(this.jButtonActualizarEstadoRubro, this.gridBagConstraintsEstadoRubro);


		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = 0;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoRubro.add(this.jButtonGuardarCambiosEstadoRubro, this.gridBagConstraintsEstadoRubro);	
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = 0;		
		this.gridBagConstraintsEstadoRubro.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoRubro.add(this.jButtonCancelarEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRubro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRubro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRubro.gridx = 0;		
			//this.gridBagConstraintsEstadoRubro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRubro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRubro.gridx =0;
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRubro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRubro, this.gridBagConstraintsEstadoRubro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoRubro = new EstadoRubroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Rubro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Rubro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Rubro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoRubroModel estadorubroModel=new EstadoRubroModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoRubroModel.EstadoRubroFocusTraversalPolicy estadorubroFocusTraversalPolicy = estadorubroModel.new EstadoRubroFocusTraversalPolicy(this);
			
			//estadorubroFocusTraversalPolicy.setestadorubroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadorubroModel);
			
			
			this.jContentPaneDetalleEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoRubro = new GridBagLayout();	
			this.jContentPaneDetalleEstadoRubro.setLayout(gridaBagLayoutDetalleEstadoRubro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRubro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
				this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoRubro.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoRubro.add(jTtoolBarDetalleEstadoRubro, gridBagConstraintsEstadoRubro);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoRubro=   new JScrollPane(jContentPaneDetalleEstadoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoRubro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoRubro.gridx = 0;
	        
			this.jContentPaneDetalleEstadoRubro.add(jPanelCamposEstadoRubro, gridBagConstraintsEstadoRubro);
			
			
			
			
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
						&& estadorubroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(this.puedeCargarPorParteRubroEmpleado,false,-1);
					
					if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoRubro= new GridBagConstraints();
						this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoRubro.gridx = 0;
						this.jContentPaneDetalleEstadoRubro.add(this.jTabbedPaneRelacionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoRubro.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoRubro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
					this.gridBagConstraintsEstadoRubro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoRubro.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoRubro.add(jPanelCamposOcultosEstadoRubro, gridBagConstraintsEstadoRubro);
				
					this.jPanelCamposOcultosEstadoRubro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoRubro.gridx = 0;
	        this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoRubro.add(this.jPanelAccionesFormularioEstadoRubro, this.gridBagConstraintsEstadoRubro);							
			
			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
	        this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoRubro.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoRubro.add(this.jPanelAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoRubro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoRubro=   new JScrollPane(this.jPanelCamposEstadoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRubro.gridx = 0;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoRubro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRubro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoRubro, this.gridBagConstraintsEstadoRubro);			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoRubro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
			
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
			
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoRubro;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoRubro;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRubroEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		this.rubroempleadoSessionBean.setConGuardarRelaciones(false);
		this.rubroempleadoSessionBean.setEsGuardarRelacionado(true);

		this.rubroempleadoBeanSwingJInternalFrame=null;//new RubroEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroempleadoBeanSwingJInternalFramePopup=new RubroEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {

				RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroempleadoSessionBean.setEsGuardarRelacionado(true);

				this.rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroempleadoBeanSwingJInternalFrame.setrubroempleadoSessionBean(this.rubroempleadoSessionBean);

				//this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
				//this.gridBagConstraintsEstadoRubro.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoRubro.gridx = 0;
				//this.jContentPaneDetalleEstadoRubro.add(this.rubroempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoRubro);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoRubro.add("Rubro Empleados",this.rubroempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoRubro.setComponentAt(iIndexTab,this.rubroempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroempleadoSessionBean.setEsGuardarRelacionado(false);
				this.rubroempleadoBeanSwingJInternalFrame=null;//new RubroEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEmpleado) {
					this.jTabbedPaneRelacionesEstadoRubro.add("Rubro Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRubroEmpleadoBeanSwingJInternalFrame(List<EstadoRubro> estadorubros,EstadoRubro estadorubro,RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroempleadoBeanSwingJInternalFrame.getRubroEmpleadoLogic().setConnexion(this.estadorubroLogic.getConnexion());

					rubroempleadoBeanSwingJInternalFrame.setestadorubrosForeignKey(estadorubros);
					rubroempleadoBeanSwingJInternalFrame.setestadorubroForeignKey(estadorubro);
					rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRubro(true);
					rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setlidEstadoRubroActual(estadorubro.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEmpleado(rubroempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoRubro(true);
					rubroempleadoBeanSwingJInternalFrame.setid_estado_rubroFK_IdEstadoRubro(estadorubro.getId());

					if(!this.conCargarFormDetalle) {
						rubroempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoRubroForeignKey(estadorubro,1,false,true,true);
					rubroempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoRubro");
					rubroempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoRubro");
					rubroempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleado(true);
					rubroempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEmpleado("n",rubroempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("relacionado");
					} else {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("no_relacionado");
					}

					rubroempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEmpleado().setVisible(false);

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
