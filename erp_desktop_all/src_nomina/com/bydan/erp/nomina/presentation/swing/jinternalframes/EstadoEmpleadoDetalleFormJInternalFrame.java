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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.EstadoEmpleadoConstantesFunciones;

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
public class EstadoEmpleadoDetalleFormJInternalFrame extends EstadoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoEmpleado;
	
	protected JMenuBar jmenuBarDetalleEstadoEmpleado;
	
	protected JMenu jmenuDetalleEstadoEmpleado;
	protected JMenu jmenuDetalleArchivoEstadoEmpleado;
	protected JMenu jmenuDetalleAccionesEstadoEmpleado;
	protected JMenu jmenuDetalleDatosEstadoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoEmpleado;	
	protected GridBagConstraints gridBagConstraintsEstadoEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoEmpleadoSessionBean estadoempleadoSessionBean;
	
	

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	public CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFrame=null;
	public CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCierreRolMensual=false;
	public CierreRolMensualSessionBean cierrerolmensualSessionBean;
	
		
	
	public EstadoEmpleadoLogic estadoempleadoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEstadoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEstadoEmpleado;
	
	protected JPanel jPanelCamposEstadoEmpleado;    
	protected JPanel jPanelCamposOcultosEstadoEmpleado;    	
	protected JPanel jPanelAccionesEstadoEmpleado;
	protected JPanel jPanelAccionesFormularioEstadoEmpleado;
    
	
	
	protected Integer iXPanelCamposEstadoEmpleado=0;
	protected Integer iYPanelCamposEstadoEmpleado=0;
	
	protected Integer iXPanelCamposOcultosEstadoEmpleado=0;
	protected Integer iYPanelCamposOcultosEstadoEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoEmpleado;
	public JButton jButtonModificarEstadoEmpleado;
	public JButton jButtonActualizarEstadoEmpleado;
    public JButton jButtonEliminarEstadoEmpleado;
	public JButton jButtonCancelarEstadoEmpleado;
    public JButton jButtonGuardarCambiosEstadoEmpleado;
	public JButton jButtonGuardarCambiosTablaEstadoEmpleado;
	protected JButton jButtonCerrarEstadoEmpleado;
	
	
	protected JButton jButtonProcesarInformacionEstadoEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoEmpleado;
	protected JButton jButtonModificarToolBarEstadoEmpleado;
	protected JButton jButtonActualizarToolBarEstadoEmpleado;
    protected JButton jButtonEliminarToolBarEstadoEmpleado;
	protected JButton jButtonCancelarToolBarEstadoEmpleado;
    protected JButton jButtonGuardarCambiosToolBarEstadoEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoEmpleado;
	protected JButton jButtonCerrarToolBarEstadoEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoEmpleado;
	protected JMenuItem jMenuItemModificarEstadoEmpleado;
	protected JMenuItem jMenuItemActualizarEstadoEmpleado;
    protected JMenuItem jMenuItemEliminarEstadoEmpleado;
	protected JMenuItem jMenuItemCancelarEstadoEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosEstadoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoEmpleado;
	protected JMenuItem jMenuItemCerrarEstadoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEstadoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEstadoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoEmpleado;
	public JLabel jLabelIdEstadoEmpleado;
	public JLabel jLabelidEstadoEmpleado;
	public JButton jButtonidEstadoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoEmpleado;
	public JLabel jLabelcodigoEstadoEmpleado;
	public JTextField jTextFieldcodigoEstadoEmpleado;
	public JButton jButtoncodigoEstadoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoEmpleado;
	public JLabel jLabelnombreEstadoEmpleado;
	public JTextArea jTextAreanombreEstadoEmpleado;
	public JScrollPane jscrollPanenombreEstadoEmpleado;
	public JButton jButtonnombreEstadoEmpleadoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoEmpleado;
	
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
	
	public EstadoEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoEmpleado=new JPanel();
				this.jPanelAccionesFormularioEstadoEmpleado=new JPanel();
				this.jmenuBarDetalleEstadoEmpleado=new JMenuBar();
				this.jTtoolBarDetalleEstadoEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoEmpleado() {
		return this.jButtonActualizarToolBarEstadoEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarEstadoEmpleado() {
		return this.jButtonEliminarToolBarEstadoEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarEstadoEmpleado() {
		return this.jButtonCancelarToolBarEstadoEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoEmpleado() {
		return this.jButtonProcesarInformacionEstadoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoEmpleado)	{
		this.jButtonProcesarInformacionEstadoEmpleado = jButtonProcesarInformacionEstadoEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoEmpleado() {
		return this.jComboBoxTiposAccionesEstadoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoEmpleado(
			JComboBox jComboBoxTiposRelacionesEstadoEmpleado) {
		this.jComboBoxTiposRelacionesEstadoEmpleado = jComboBoxTiposRelacionesEstadoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoEmpleado(
			JComboBox jComboBoxTiposAccionesEstadoEmpleado) {
		this.jComboBoxTiposAccionesEstadoEmpleado = jComboBoxTiposAccionesEstadoEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoEmpleado() {
		return this.jComboBoxTiposAccionesFormularioEstadoEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioEstadoEmpleado) {
		this.jComboBoxTiposAccionesFormularioEstadoEmpleado = jComboBoxTiposAccionesFormularioEstadoEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
		
		this.estadoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoEmpleado=new JButtonMe();
				this.jButtonModificarToolBarEstadoEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoEmpleado,this.jTtoolBarDetalleEstadoEmpleado,
							"actualizar","actualizar","Actualizar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoEmpleado,this.jTtoolBarDetalleEstadoEmpleado,
							"eliminar","eliminar","Eliminar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoEmpleado,this.jTtoolBarDetalleEstadoEmpleado,
							"cancelar","cancelar","Cancelar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoEmpleado,this.jTtoolBarDetalleEstadoEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoEmpleado.add(this.jMenuItemDetalleCerrarEstadoEmpleado);
		
		this.jmenuDetalleAccionesEstadoEmpleado.add(this.jMenuItemActualizarEstadoEmpleado);
		this.jmenuDetalleAccionesEstadoEmpleado.add(this.jMenuItemEliminarEstadoEmpleado);
		this.jmenuDetalleAccionesEstadoEmpleado.add(this.jMenuItemCancelarEstadoEmpleado);		
		
		//this.jmenuDetalleDatosEstadoEmpleado.add(this.jMenuItemDetalleAbrirOrderByEstadoEmpleado);				
		this.jmenuDetalleDatosEstadoEmpleado.add(this.jMenuItemDetalleMostarOcultarEstadoEmpleado);				
				
		//this.jmenuDetalleAccionesEstadoEmpleado.add(this.jMenuItemGuardarCambiosEstadoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoEmpleado.add(this.jmenuDetalleArchivoEstadoEmpleado);		
		this.jmenuBarDetalleEstadoEmpleado.add(this.jmenuDetalleAccionesEstadoEmpleado);		
		this.jmenuBarDetalleEstadoEmpleado.add(this.jmenuDetalleDatosEstadoEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoEmpleado.add(this.jmenuDetalleEstadoEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoEmpleado);				
	}
	
	
	public void inicializarElementosCamposEstadoEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoEmpleado = new JLabelMe();
		jLabelIdEstadoEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoEmpleado.setToolTipText(EstadoEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoEmpleado= new GridBagLayout();

		this.jPanelidEstadoEmpleado.setLayout(this.gridaBagLayoutEstadoEmpleado);

		jLabelidEstadoEmpleado = new JLabel();
		jLabelidEstadoEmpleado.setText("Id");

		jLabelidEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoEmpleado = new JLabelMe();
		this.jLabelcodigoEstadoEmpleado.setText(""+EstadoEmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoEmpleado.setToolTipText(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoEmpleado = new GridBagLayout();
		this.jPanelcodigoEstadoEmpleado.setLayout(this.gridaBagLayoutEstadoEmpleado);


		jTextFieldcodigoEstadoEmpleado= new JTextFieldMe();

		jTextFieldcodigoEstadoEmpleado.setEnabled(false);
		jTextFieldcodigoEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoEmpleadoBusqueda.setText("U");
		this.jButtoncodigoEstadoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoEmpleadoBusqueda"));

		if(this.estadoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoEmpleado = new JLabelMe();
		this.jLabelnombreEstadoEmpleado.setText(""+EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoEmpleado.setToolTipText("Nombre");
		this.jLabelnombreEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoEmpleado.setToolTipText(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoEmpleado = new GridBagLayout();
		this.jPanelnombreEstadoEmpleado.setLayout(this.gridaBagLayoutEstadoEmpleado);


		jTextAreanombreEstadoEmpleado= new JTextAreaMe();
		jTextAreanombreEstadoEmpleado.setEnabled(false);
		jTextAreanombreEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoEmpleado.setLineWrap(true);
		jTextAreanombreEstadoEmpleado.setWrapStyleWord(true);
		jTextAreanombreEstadoEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoEmpleado.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoEmpleado = new JScrollPane(jTextAreanombreEstadoEmpleado);
		jscrollPanenombreEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoEmpleadoBusqueda.setText("U");
		this.jButtonnombreEstadoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoEmpleadoBusqueda"));

		if(this.estadoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoEmpleado() {
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
		//this.jInternalFrameDetalleEstadoEmpleado = new EstadoEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoEmpleado= new GridBagLayout();
		

		
		String sToolTipEstadoEmpleado="";
		sToolTipEstadoEmpleado=EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoEmpleado+="(Nomina.EstadoEmpleado)";
		}
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoEmpleado = new JButtonMe();
		this.jButtonModificarEstadoEmpleado = new JButtonMe();
        this.jButtonActualizarEstadoEmpleado = new JButtonMe();
        this.jButtonEliminarEstadoEmpleado = new JButtonMe();
        this.jButtonCancelarEstadoEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosEstadoEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoEmpleado = new JButtonMe();
		this.jButtonCerrarEstadoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEstadoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Empleado";
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoEmpleado.setName("jPanelCamposEstadoEmpleado"); 

		this.jPanelCamposOcultosEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoEmpleado.setName("jPanelCamposOcultosEstadoEmpleado"); 

        this.jPanelAccionesEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEstadoEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoEmpleado.setText("Nuevo");
		this.jButtonModificarEstadoEmpleado.setText("Editar");
        this.jButtonActualizarEstadoEmpleado.setText("Actualizar");
        this.jButtonEliminarEstadoEmpleado.setText("Eliminar");
        this.jButtonCancelarEstadoEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoEmpleado.setText("Guardar");
		this.jButtonCerrarEstadoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoEmpleado,"nuevo_button","Nuevo",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoEmpleado,"modificar_button","Editar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoEmpleado,"actualizar_button","Actualizar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoEmpleado,"eliminar_button","Eliminar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoEmpleado,"cancelar_button","Cancelar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoEmpleado,"guardarcambios_button","Guardar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoEmpleado,"guardarcambiostabla_button","Guardar",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoEmpleado,"cerrar_button","Salir",this.estadoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoEmpleado.setToolTipText("Nuevo"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoEmpleado.setToolTipText("Editar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoEmpleado.setToolTipText("Actualizar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoEmpleado.setToolTipText("Eliminar)"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoEmpleado.setToolTipText("Cancelar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoEmpleado.setToolTipText("Guardar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoEmpleado.setToolTipText("Guardar"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoEmpleado.setToolTipText("Salir"+" "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoEmpleado";
		inputMap = this.jButtonNuevoEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoEmpleado";
		inputMap = this.jButtonActualizarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoEmpleado";
		inputMap = this.jButtonEliminarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoEmpleado";
		inputMap = this.jButtonCancelarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoEmpleado";
		inputMap = this.jButtonCerrarEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEstadoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoEmpleado.setToolTipText("Nuevo EstadoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoEmpleado.setToolTipText("Sin Cerrar Ventana EstadoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEstadoEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoEmpleado = new JLabelMe();
		
		this.jLabelAccionesEstadoEmpleado.setText("Acciones");		
		this.jLabelAccionesEstadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoEmpleado = new GridBagLayout();
		
		this.jPanelCamposEstadoEmpleado.setLayout(gridaBagLayoutCamposEstadoEmpleado);
		this.jPanelCamposOcultosEstadoEmpleado.setLayout(gridaBagLayoutCamposOcultosEstadoEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoEmpleado.gridx = 0;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoEmpleado.add(jLabelIdEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);



	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoEmpleado.gridx = 1;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoEmpleado.add(jLabelidEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);


	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoEmpleado.gridx = 0;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoEmpleado.add(jLabelcodigoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoEmpleado.gridx = 2;
		this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
		this.gridBagConstraintsEstadoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoEmpleado.add(jButtoncodigoEstadoEmpleadoBusqueda, this.gridBagConstraintsEstadoEmpleado);
	}

	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoEmpleado.gridx = 1;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoEmpleado.add(jTextFieldcodigoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);


	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoEmpleado.gridx = 0;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoEmpleado.add(jLabelnombreEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoEmpleado.gridx = 2;
		this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
		this.gridBagConstraintsEstadoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoEmpleado.add(jButtonnombreEstadoEmpleadoBusqueda, this.gridBagConstraintsEstadoEmpleado);
	}

	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoEmpleado.gridx = 1;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoEmpleado.add(jscrollPanenombreEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoEmpleado.gridy = iYPanelCamposEstadoEmpleado;
	this.gridBagConstraintsEstadoEmpleado.gridx = iXPanelCamposEstadoEmpleado++;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoEmpleado.add(this.jPanelidEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);



	if(iXPanelCamposEstadoEmpleado % 1==0) {
		iXPanelCamposEstadoEmpleado=0;
		iYPanelCamposEstadoEmpleado++;
	}
	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoEmpleado.gridy = iYPanelCamposEstadoEmpleado;
	this.gridBagConstraintsEstadoEmpleado.gridx = iXPanelCamposEstadoEmpleado++;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoEmpleado.add(this.jPanelcodigoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);



	if(iXPanelCamposEstadoEmpleado % 1==0) {
		iXPanelCamposEstadoEmpleado=0;
		iYPanelCamposEstadoEmpleado++;
	}
	this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoEmpleado.gridy = iYPanelCamposEstadoEmpleado;
	this.gridBagConstraintsEstadoEmpleado.gridx = iXPanelCamposEstadoEmpleado++;
	this.gridBagConstraintsEstadoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoEmpleado.add(this.jPanelnombreEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);



	if(iXPanelCamposEstadoEmpleado % 1==0) {
		iXPanelCamposEstadoEmpleado=0;
		iYPanelCamposEstadoEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoEmpleado= new GridBagLayout();
		this.jPanelAccionesEstadoEmpleado.setLayout(gridaBagLayoutAccionesEstadoEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoEmpleado.setLayout(gridaBagLayoutAccionesFormularioEstadoEmpleado);
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoEmpleado.add(this.jComboBoxTiposAccionesFormularioEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);

		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoEmpleado.add(this.jCheckBoxPostAccionNuevoEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoEmpleado.add(this.jCheckBoxPostAccionSinCerrarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoEmpleado.add(this.jCheckBoxPostAccionSinMensajeEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoEmpleado.add(this.jButtonModificarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);							

		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoEmpleado.add(this.jButtonEliminarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
			
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoEmpleado.add(this.jButtonActualizarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);


		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;		
		this.gridBagConstraintsEstadoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoEmpleado.add(this.jButtonGuardarCambiosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);	
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = 0;		
		this.gridBagConstraintsEstadoEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoEmpleado.add(this.jButtonCancelarEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoEmpleado.gridx = 0;		
			//this.gridBagConstraintsEstadoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoEmpleado.gridx =0;
		this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoEmpleado = new EstadoEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoEmpleadoModel estadoempleadoModel=new EstadoEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoEmpleadoModel.EstadoEmpleadoFocusTraversalPolicy estadoempleadoFocusTraversalPolicy = estadoempleadoModel.new EstadoEmpleadoFocusTraversalPolicy(this);
			
			//estadoempleadoFocusTraversalPolicy.setestadoempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoempleadoModel);
			
			
			this.jContentPaneDetalleEstadoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleEstadoEmpleado.setLayout(gridaBagLayoutDetalleEstadoEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoEmpleado.add(jTtoolBarDetalleEstadoEmpleado, gridBagConstraintsEstadoEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoEmpleado=   new JScrollPane(jContentPaneDetalleEstadoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleEstadoEmpleado.add(jPanelCamposEstadoEmpleado, gridBagConstraintsEstadoEmpleado);
			
			
			
			
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
						&& estadoempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCierreRolMensual(this.puedeCargarPorParteCierreRolMensual,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					
					if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoEmpleado= new GridBagConstraints();
						this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoEmpleado.gridx = 0;
						this.jContentPaneDetalleEstadoEmpleado.add(this.jTabbedPaneRelacionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCierreRolMensual(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
					this.gridBagConstraintsEstadoEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoEmpleado.add(jPanelCamposOcultosEstadoEmpleado, gridBagConstraintsEstadoEmpleado);
				
					this.jPanelCamposOcultosEstadoEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoEmpleado.gridx = 0;
	        this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoEmpleado.add(this.jPanelAccionesFormularioEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);							
			
			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoEmpleado.add(this.jPanelAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoEmpleado=   new JScrollPane(this.jPanelCamposEstadoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoEmpleado.gridx = 0;
			this.gridBagConstraintsEstadoEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);			
			
			this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
			
			
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		
			
		this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoEmpleado, this.gridBagConstraintsEstadoEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCierreRolMensual(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		this.cierrerolmensualSessionBean.setConGuardarRelaciones(false);
		this.cierrerolmensualSessionBean.setEsGuardarRelacionado(true);

		this.cierrerolmensualBeanSwingJInternalFrame=null;//new CierreRolMensualBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cierrerolmensualBeanSwingJInternalFramePopup=new CierreRolMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cierrerolmensualBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {

				CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cierrerolmensualSessionBean.setEsGuardarRelacionado(true);

				this.cierrerolmensualBeanSwingJInternalFrame=new CierreRolMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cierrerolmensualBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cierrerolmensualBeanSwingJInternalFrame.setcierrerolmensualSessionBean(this.cierrerolmensualSessionBean);

				//this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoEmpleado.gridx = 0;
				//this.jContentPaneDetalleEstadoEmpleado.add(this.cierrerolmensualBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoEmpleado.add("Cierre Rol Mensuales",this.cierrerolmensualBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoEmpleado.setComponentAt(iIndexTab,this.cierrerolmensualBeanSwingJInternalFrame.getContentPane());
				}

				//CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cierrerolmensualSessionBean.setEsGuardarRelacionado(false);
				this.cierrerolmensualBeanSwingJInternalFrame=null;//new CierreRolMensualBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCierreRolMensual) {
					this.jTabbedPaneRelacionesEstadoEmpleado.add("Cierre Rol Mensuales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsEstadoEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEstadoEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoEmpleado.gridx = 0;
				//this.jContentPaneDetalleEstadoEmpleado.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoEmpleado.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoEmpleado.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesEstadoEmpleado.add("Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoBeanSwingJInternalFrame(List<EstadoEmpleado> estadoempleados,EstadoEmpleado estadoempleado,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.estadoempleadoLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.setestadoempleadosForeignKey(estadoempleados);
					empleadoBeanSwingJInternalFrame.setestadoempleadoForeignKey(estadoempleado);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoEmpleado(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidEstadoEmpleadoActual(estadoempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoEmpleado(true);
					empleadoBeanSwingJInternalFrame.setid_estado_empleadoFK_IdEstadoEmpleado(estadoempleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoEmpleadoForeignKey(estadoempleado,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoEmpleado");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoEmpleado");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCierreRolMensualBeanSwingJInternalFrame(List<EstadoEmpleado> estadoempleados,EstadoEmpleado estadoempleado,CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cierrerolmensualBeanSwingJInternalFrame=new CierreRolMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cierrerolmensualBeanSwingJInternalFrame.getCierreRolMensualLogic().setConnexion(this.estadoempleadoLogic.getConnexion());

					cierrerolmensualBeanSwingJInternalFrame.setestadoempleadosForeignKey(estadoempleados);
					cierrerolmensualBeanSwingJInternalFrame.setestadoempleadoForeignKey(estadoempleado);
					cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setisBusquedaDesdeForeignKeySesionEstadoEmpleado(true);
					cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setlidEstadoEmpleadoActual(estadoempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cierrerolmensualBeanSwingJInternalFrame.cargarCombosForeignKeyCierreRolMensual(cierrerolmensualBeanSwingJInternalFrame.isCargarCombosDependencia);
					cierrerolmensualBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoEmpleado(true);
					cierrerolmensualBeanSwingJInternalFrame.setid_estado_empleadoFK_IdEstadoEmpleado(estadoempleado.getId());

					if(!this.conCargarFormDetalle) {
						cierrerolmensualBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cierrerolmensualBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoEmpleadoForeignKey(estadoempleado,1,false,true,true);
					cierrerolmensualBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cierrerolmensualBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoEmpleado");
					cierrerolmensualBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoEmpleado");
					cierrerolmensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaCierreRolMensual(true);
					cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCierreRolMensual("n",cierrerolmensualBeanSwingJInternalFrame.isGuardarCambiosEnLote, cierrerolmensualBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cierrerolmensualBeanSwingJInternalFrame.setAutoscrolls(true);
					cierrerolmensualBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoPanelsCierreRolMensual("relacionado");
					} else {
						cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoPanelsCierreRolMensual("no_relacionado");
					}

					cierrerolmensualBeanSwingJInternalFrame.getjButtonRecargarInformacionCierreRolMensual().setVisible(false);

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
