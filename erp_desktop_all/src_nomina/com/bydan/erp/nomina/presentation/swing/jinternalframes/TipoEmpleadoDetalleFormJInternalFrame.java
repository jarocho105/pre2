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
import com.bydan.erp.nomina.util.TipoEmpleadoConstantesFunciones;

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
public class TipoEmpleadoDetalleFormJInternalFrame extends TipoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEmpleado;
	
	protected JMenuBar jmenuBarDetalleTipoEmpleado;
	
	protected JMenu jmenuDetalleTipoEmpleado;
	protected JMenu jmenuDetalleArchivoTipoEmpleado;
	protected JMenu jmenuDetalleAccionesTipoEmpleado;
	protected JMenu jmenuDetalleDatosTipoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoEmpleadoSessionBean tipoempleadoSessionBean;
	
	

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoEmpleadoLogic tipoempleadoLogic;
	
	public JScrollPane jScrollPanelDatosTipoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoEmpleado;
	
	protected JPanel jPanelCamposTipoEmpleado;    
	protected JPanel jPanelCamposOcultosTipoEmpleado;    	
	protected JPanel jPanelAccionesTipoEmpleado;
	protected JPanel jPanelAccionesFormularioTipoEmpleado;
    
	
	
	protected Integer iXPanelCamposTipoEmpleado=0;
	protected Integer iYPanelCamposTipoEmpleado=0;
	
	protected Integer iXPanelCamposOcultosTipoEmpleado=0;
	protected Integer iYPanelCamposOcultosTipoEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEmpleado;
	public JButton jButtonModificarTipoEmpleado;
	public JButton jButtonActualizarTipoEmpleado;
    public JButton jButtonEliminarTipoEmpleado;
	public JButton jButtonCancelarTipoEmpleado;
    public JButton jButtonGuardarCambiosTipoEmpleado;
	public JButton jButtonGuardarCambiosTablaTipoEmpleado;
	protected JButton jButtonCerrarTipoEmpleado;
	
	
	protected JButton jButtonProcesarInformacionTipoEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEmpleado;
	protected JButton jButtonModificarToolBarTipoEmpleado;
	protected JButton jButtonActualizarToolBarTipoEmpleado;
    protected JButton jButtonEliminarToolBarTipoEmpleado;
	protected JButton jButtonCancelarToolBarTipoEmpleado;
    protected JButton jButtonGuardarCambiosToolBarTipoEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEmpleado;
	protected JButton jButtonCerrarToolBarTipoEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEmpleado;
	protected JMenuItem jMenuItemModificarTipoEmpleado;
	protected JMenuItem jMenuItemActualizarTipoEmpleado;
    protected JMenuItem jMenuItemEliminarTipoEmpleado;
	protected JMenuItem jMenuItemCancelarTipoEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosTipoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEmpleado;
	protected JMenuItem jMenuItemCerrarTipoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEmpleado;
	public JLabel jLabelIdTipoEmpleado;
	public JLabel jLabelidTipoEmpleado;
	public JButton jButtonidTipoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoEmpleado;
	public JLabel jLabelcodigoTipoEmpleado;
	public JTextField jTextFieldcodigoTipoEmpleado;
	public JButton jButtoncodigoTipoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEmpleado;
	public JLabel jLabelnombreTipoEmpleado;
	public JTextArea jTextAreanombreTipoEmpleado;
	public JScrollPane jscrollPanenombreTipoEmpleado;
	public JButton jButtonnombreTipoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoEmpleado;
	public JLabel jLabelid_empresaTipoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoEmpleado;
	public JButton jButtonid_empresaTipoEmpleado= new JButtonMe();
	public JButton jButtonid_empresaTipoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEmpleado;
	
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
	
	public TipoEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEmpleado=new JPanel();
				this.jPanelAccionesFormularioTipoEmpleado=new JPanel();
				this.jmenuBarDetalleTipoEmpleado=new JMenuBar();
				this.jTtoolBarDetalleTipoEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEmpleado() {
		return this.jButtonActualizarToolBarTipoEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarTipoEmpleado() {
		return this.jButtonEliminarToolBarTipoEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarTipoEmpleado() {
		return this.jButtonCancelarToolBarTipoEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEmpleado() {
		return this.jButtonProcesarInformacionTipoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEmpleado)	{
		this.jButtonProcesarInformacionTipoEmpleado = jButtonProcesarInformacionTipoEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEmpleado() {
		return this.jComboBoxTiposAccionesTipoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoEmpleado) {
		this.jComboBoxTiposRelacionesTipoEmpleado = jComboBoxTiposRelacionesTipoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEmpleado(
			JComboBox jComboBoxTiposAccionesTipoEmpleado) {
		this.jComboBoxTiposAccionesTipoEmpleado = jComboBoxTiposAccionesTipoEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEmpleado() {
		return this.jComboBoxTiposAccionesFormularioTipoEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioTipoEmpleado) {
		this.jComboBoxTiposAccionesFormularioTipoEmpleado = jComboBoxTiposAccionesFormularioTipoEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
		
		this.tipoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEmpleado=new JButtonMe();
				this.jButtonModificarToolBarTipoEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEmpleado,this.jTtoolBarDetalleTipoEmpleado,
							"actualizar","actualizar","Actualizar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEmpleado,this.jTtoolBarDetalleTipoEmpleado,
							"eliminar","eliminar","Eliminar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEmpleado,this.jTtoolBarDetalleTipoEmpleado,
							"cancelar","cancelar","Cancelar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEmpleado,this.jTtoolBarDetalleTipoEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEmpleado.add(this.jMenuItemDetalleCerrarTipoEmpleado);
		
		this.jmenuDetalleAccionesTipoEmpleado.add(this.jMenuItemActualizarTipoEmpleado);
		this.jmenuDetalleAccionesTipoEmpleado.add(this.jMenuItemEliminarTipoEmpleado);
		this.jmenuDetalleAccionesTipoEmpleado.add(this.jMenuItemCancelarTipoEmpleado);		
		
		//this.jmenuDetalleDatosTipoEmpleado.add(this.jMenuItemDetalleAbrirOrderByTipoEmpleado);				
		this.jmenuDetalleDatosTipoEmpleado.add(this.jMenuItemDetalleMostarOcultarTipoEmpleado);				
				
		//this.jmenuDetalleAccionesTipoEmpleado.add(this.jMenuItemGuardarCambiosTipoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEmpleado.add(this.jmenuDetalleArchivoTipoEmpleado);		
		this.jmenuBarDetalleTipoEmpleado.add(this.jmenuDetalleAccionesTipoEmpleado);		
		this.jmenuBarDetalleTipoEmpleado.add(this.jmenuDetalleDatosTipoEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoEmpleado.add(this.jmenuDetalleTipoEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEmpleado);				
	}
	
	
	public void inicializarElementosCamposTipoEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEmpleado = new JLabelMe();
		jLabelIdTipoEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEmpleado.setToolTipText(TipoEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEmpleado= new GridBagLayout();

		this.jPanelidTipoEmpleado.setLayout(this.gridaBagLayoutTipoEmpleado);

		jLabelidTipoEmpleado = new JLabel();
		jLabelidTipoEmpleado.setText("Id");

		jLabelidTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoEmpleado = new JLabelMe();
		this.jLabelcodigoTipoEmpleado.setText(""+TipoEmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoEmpleado.setToolTipText(TipoEmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoEmpleado = new GridBagLayout();
		this.jPanelcodigoTipoEmpleado.setLayout(this.gridaBagLayoutTipoEmpleado);


		jTextFieldcodigoTipoEmpleado= new JTextFieldMe();

		jTextFieldcodigoTipoEmpleado.setEnabled(false);
		jTextFieldcodigoTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoEmpleadoBusqueda.setText("U");
		this.jButtoncodigoTipoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoEmpleadoBusqueda"));

		if(this.tipoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoEmpleado = new JLabelMe();
		this.jLabelnombreTipoEmpleado.setText(""+TipoEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEmpleado.setToolTipText("Nombre");
		this.jLabelnombreTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEmpleado.setToolTipText(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEmpleado = new GridBagLayout();
		this.jPanelnombreTipoEmpleado.setLayout(this.gridaBagLayoutTipoEmpleado);


		jTextAreanombreTipoEmpleado= new JTextAreaMe();
		jTextAreanombreTipoEmpleado.setEnabled(false);
		jTextAreanombreTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEmpleado.setLineWrap(true);
		jTextAreanombreTipoEmpleado.setWrapStyleWord(true);
		jTextAreanombreTipoEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEmpleado = new JScrollPane(jTextAreanombreTipoEmpleado);
		jscrollPanenombreTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreTipoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEmpleadoBusqueda.setText("U");
		this.jButtonnombreTipoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEmpleadoBusqueda"));

		if(this.tipoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoEmpleado = new JLabelMe();
		this.jLabelid_empresaTipoEmpleado.setText(""+TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoEmpleado.setToolTipText(TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoEmpleado = new GridBagLayout();
		this.jPanelid_empresaTipoEmpleado.setLayout(this.gridaBagLayoutTipoEmpleado);


		jComboBoxid_empresaTipoEmpleado= new JComboBoxMe();
		jComboBoxid_empresaTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoEmpleado.setEnabled(false);

		this.jButtonid_empresaTipoEmpleado= new JButtonMe();
		this.jButtonid_empresaTipoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoEmpleado.setText("Buscar");
		this.jButtonid_empresaTipoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEmpleado"));

		this.jButtonid_empresaTipoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaTipoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEmpleadoBusqueda"));

		if(this.tipoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoEmpleadoUpdate.setText("U");
		this.jButtonid_empresaTipoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleTipoEmpleado = new TipoEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEmpleado= new GridBagLayout();
		

		
		String sToolTipTipoEmpleado="";
		sToolTipTipoEmpleado=TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEmpleado+="(Nomina.TipoEmpleado)";
		}
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEmpleado = new JButtonMe();
		this.jButtonModificarTipoEmpleado = new JButtonMe();
        this.jButtonActualizarTipoEmpleado = new JButtonMe();
        this.jButtonEliminarTipoEmpleado = new JButtonMe();
        this.jButtonCancelarTipoEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosTipoEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEmpleado = new JButtonMe();
		this.jButtonCerrarTipoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Empleado";
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEmpleado.setName("jPanelCamposTipoEmpleado"); 

		this.jPanelCamposOcultosTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEmpleado.setName("jPanelCamposOcultosTipoEmpleado"); 

        this.jPanelAccionesTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEmpleado.setText("Nuevo");
		this.jButtonModificarTipoEmpleado.setText("Editar");
        this.jButtonActualizarTipoEmpleado.setText("Actualizar");
        this.jButtonEliminarTipoEmpleado.setText("Eliminar");
        this.jButtonCancelarTipoEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEmpleado.setText("Guardar");
		this.jButtonCerrarTipoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEmpleado,"nuevo_button","Nuevo",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEmpleado,"modificar_button","Editar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEmpleado,"actualizar_button","Actualizar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEmpleado,"eliminar_button","Eliminar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEmpleado,"cancelar_button","Cancelar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEmpleado,"guardarcambios_button","Guardar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEmpleado,"guardarcambiostabla_button","Guardar",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEmpleado,"cerrar_button","Salir",this.tipoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEmpleado.setToolTipText("Nuevo"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEmpleado.setToolTipText("Editar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEmpleado.setToolTipText("Actualizar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEmpleado.setToolTipText("Eliminar)"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEmpleado.setToolTipText("Cancelar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEmpleado.setToolTipText("Guardar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEmpleado.setToolTipText("Guardar"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEmpleado.setToolTipText("Salir"+" "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEmpleado";
		inputMap = this.jButtonNuevoTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEmpleado";
		inputMap = this.jButtonActualizarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEmpleado";
		inputMap = this.jButtonEliminarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEmpleado";
		inputMap = this.jButtonCancelarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEmpleado";
		inputMap = this.jButtonCerrarTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEmpleado.setToolTipText("Nuevo TipoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEmpleado.setToolTipText("Sin Cerrar Ventana TipoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEmpleado = new GridBagLayout();
		
		this.jPanelCamposTipoEmpleado.setLayout(gridaBagLayoutCamposTipoEmpleado);
		this.jPanelCamposOcultosTipoEmpleado.setLayout(gridaBagLayoutCamposOcultosTipoEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEmpleado.add(jLabelIdTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEmpleado.add(jLabelidTipoEmpleado, this.gridBagConstraintsTipoEmpleado);


	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoEmpleado.add(jLabelid_empresaTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx = 2;
		this.gridBagConstraintsTipoEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoEmpleado.add(jButtonid_empresaTipoEmpleadoBusqueda, this.gridBagConstraintsTipoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx = 3;
		this.gridBagConstraintsTipoEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoEmpleado.add(jButtonid_empresaTipoEmpleadoUpdate, this.gridBagConstraintsTipoEmpleado);
	}

	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoEmpleado.add(jComboBoxid_empresaTipoEmpleado, this.gridBagConstraintsTipoEmpleado);


	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoEmpleado.add(jLabelcodigoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx = 2;
		this.gridBagConstraintsTipoEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoEmpleado.add(jButtoncodigoTipoEmpleadoBusqueda, this.gridBagConstraintsTipoEmpleado);
	}

	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoEmpleado.add(jTextFieldcodigoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);


	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 0;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEmpleado.add(jLabelnombreTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx = 2;
		this.gridBagConstraintsTipoEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEmpleado.add(jButtonnombreTipoEmpleadoBusqueda, this.gridBagConstraintsTipoEmpleado);
	}

	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpleado.gridy = 0;
	this.gridBagConstraintsTipoEmpleado.gridx = 1;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEmpleado.add(jscrollPanenombreTipoEmpleado, this.gridBagConstraintsTipoEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpleado.gridy = iYPanelCamposTipoEmpleado;
	this.gridBagConstraintsTipoEmpleado.gridx = iXPanelCamposTipoEmpleado++;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEmpleado.add(this.jPanelidTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(iXPanelCamposTipoEmpleado % 1==0) {
		iXPanelCamposTipoEmpleado=0;
		iYPanelCamposTipoEmpleado++;
	}
	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpleado.gridy = iYPanelCamposTipoEmpleado;
	this.gridBagConstraintsTipoEmpleado.gridx = iXPanelCamposTipoEmpleado++;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEmpleado.add(this.jPanelcodigoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(iXPanelCamposTipoEmpleado % 1==0) {
		iXPanelCamposTipoEmpleado=0;
		iYPanelCamposTipoEmpleado++;
	}
	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpleado.gridy = iYPanelCamposTipoEmpleado;
	this.gridBagConstraintsTipoEmpleado.gridx = iXPanelCamposTipoEmpleado++;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEmpleado.add(this.jPanelnombreTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(iXPanelCamposTipoEmpleado % 1==0) {
		iXPanelCamposTipoEmpleado=0;
		iYPanelCamposTipoEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpleado.gridy = iYPanelCamposOcultosTipoEmpleado;
	this.gridBagConstraintsTipoEmpleado.gridx = iXPanelCamposOcultosTipoEmpleado++;
	this.gridBagConstraintsTipoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoEmpleado.add(this.jPanelid_empresaTipoEmpleado, this.gridBagConstraintsTipoEmpleado);



	if(iXPanelCamposOcultosTipoEmpleado % 1==0) {
		iXPanelCamposOcultosTipoEmpleado=0;
		iYPanelCamposOcultosTipoEmpleado++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoEmpleado.setLayout(gridaBagLayoutAccionesTipoEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEmpleado.setLayout(gridaBagLayoutAccionesFormularioTipoEmpleado);
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEmpleado.add(this.jComboBoxTiposAccionesFormularioTipoEmpleado, this.gridBagConstraintsTipoEmpleado);

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEmpleado.add(this.jCheckBoxPostAccionNuevoTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEmpleado.add(this.jCheckBoxPostAccionSinCerrarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEmpleado.add(this.jCheckBoxPostAccionSinMensajeTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEmpleado.add(this.jButtonModificarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);							

		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpleado.gridy = 0;
		this.gridBagConstraintsTipoEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEmpleado.add(this.jButtonEliminarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
			
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEmpleado.add(this.jButtonActualizarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);


		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEmpleado.add(this.jButtonGuardarCambiosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);	
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEmpleado.add(this.jButtonCancelarTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEmpleado.gridx =0;
		this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEmpleado = new TipoEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEmpleadoModel tipoempleadoModel=new TipoEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEmpleadoModel.TipoEmpleadoFocusTraversalPolicy tipoempleadoFocusTraversalPolicy = tipoempleadoModel.new TipoEmpleadoFocusTraversalPolicy(this);
			
			//tipoempleadoFocusTraversalPolicy.settipoempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoempleadoModel);
			
			
			this.jContentPaneDetalleTipoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleTipoEmpleado.setLayout(gridaBagLayoutDetalleTipoEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEmpleado.add(jTtoolBarDetalleTipoEmpleado, gridBagConstraintsTipoEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEmpleado=   new JScrollPane(jContentPaneDetalleTipoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleTipoEmpleado.add(jPanelCamposTipoEmpleado, gridBagConstraintsTipoEmpleado);
			
			
			
			
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
						&& tipoempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					
					if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEmpleado= new GridBagConstraints();
						this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEmpleado.gridx = 0;
						this.jContentPaneDetalleTipoEmpleado.add(this.jTabbedPaneRelacionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
					this.gridBagConstraintsTipoEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEmpleado.add(jPanelCamposOcultosTipoEmpleado, gridBagConstraintsTipoEmpleado);
				
					this.jPanelCamposOcultosTipoEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoEmpleado.gridx = 0;
	        this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEmpleado.add(this.jPanelAccionesFormularioTipoEmpleado, this.gridBagConstraintsTipoEmpleado);							
			
			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEmpleado.add(this.jPanelAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEmpleado=   new JScrollPane(this.jPanelCamposTipoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEmpleado.gridx = 0;
			this.gridBagConstraintsTipoEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEmpleado, this.gridBagConstraintsTipoEmpleado);			
			
			this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
			
			
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		
			
		this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEmpleado, this.gridBagConstraintsTipoEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEmpleado;
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

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsTipoEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsTipoEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoEmpleado.gridx = 0;
				//this.jContentPaneDetalleTipoEmpleado.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoEmpleado.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoEmpleado.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesTipoEmpleado.add("Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoBeanSwingJInternalFrame(List<TipoEmpleado> tipoempleados,TipoEmpleado tipoempleado,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.tipoempleadoLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.settipoempleadosForeignKey(tipoempleados);
					empleadoBeanSwingJInternalFrame.settipoempleadoForeignKey(tipoempleado);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoEmpleado(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidTipoEmpleadoActual(tipoempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoEmpleado(true);
					empleadoBeanSwingJInternalFrame.setid_tipo_empleadoFK_IdTipoEmpleado(tipoempleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoEmpleadoForeignKey(tipoempleado,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoEmpleado");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoEmpleado");
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
