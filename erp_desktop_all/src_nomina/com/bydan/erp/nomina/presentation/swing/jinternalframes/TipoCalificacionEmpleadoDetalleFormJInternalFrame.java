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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoCalificacionEmpleadoConstantesFunciones;

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
public class TipoCalificacionEmpleadoDetalleFormJInternalFrame extends TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCalificacionEmpleado;
	
	protected JMenuBar jmenuBarDetalleTipoCalificacionEmpleado;
	
	protected JMenu jmenuDetalleTipoCalificacionEmpleado;
	protected JMenu jmenuDetalleArchivoTipoCalificacionEmpleado;
	protected JMenu jmenuDetalleAccionesTipoCalificacionEmpleado;
	protected JMenu jmenuDetalleDatosTipoCalificacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCalificacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoCalificacionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCalificacionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	
	

	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;
	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCalificacionEmpleado=false;
	public CalificacionEmpleadoSessionBean calificacionempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoCalificacionEmpleado;
	
	protected JPanel jPanelCamposTipoCalificacionEmpleado;    
	protected JPanel jPanelCamposOcultosTipoCalificacionEmpleado;    	
	protected JPanel jPanelAccionesTipoCalificacionEmpleado;
	protected JPanel jPanelAccionesFormularioTipoCalificacionEmpleado;
    
	
	
	protected Integer iXPanelCamposTipoCalificacionEmpleado=0;
	protected Integer iYPanelCamposTipoCalificacionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosTipoCalificacionEmpleado=0;
	protected Integer iYPanelCamposOcultosTipoCalificacionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCalificacionEmpleado;
	public JButton jButtonModificarTipoCalificacionEmpleado;
	public JButton jButtonActualizarTipoCalificacionEmpleado;
    public JButton jButtonEliminarTipoCalificacionEmpleado;
	public JButton jButtonCancelarTipoCalificacionEmpleado;
    public JButton jButtonGuardarCambiosTipoCalificacionEmpleado;
	public JButton jButtonGuardarCambiosTablaTipoCalificacionEmpleado;
	protected JButton jButtonCerrarTipoCalificacionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionTipoCalificacionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCalificacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCalificacionEmpleado;
	protected JButton jButtonModificarToolBarTipoCalificacionEmpleado;
	protected JButton jButtonActualizarToolBarTipoCalificacionEmpleado;
    protected JButton jButtonEliminarToolBarTipoCalificacionEmpleado;
	protected JButton jButtonCancelarToolBarTipoCalificacionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarTipoCalificacionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCalificacionEmpleado;
	protected JButton jButtonCerrarToolBarTipoCalificacionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCalificacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemModificarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemActualizarTipoCalificacionEmpleado;
    protected JMenuItem jMenuItemEliminarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemCancelarTipoCalificacionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemCerrarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoCalificacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCalificacionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCalificacionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCalificacionEmpleado;
	public JLabel jLabelIdTipoCalificacionEmpleado;
	public JLabel jLabelidTipoCalificacionEmpleado;
	public JButton jButtonidTipoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCalificacionEmpleado;
	public JLabel jLabelcodigoTipoCalificacionEmpleado;
	public JTextField jTextFieldcodigoTipoCalificacionEmpleado;
	public JButton jButtoncodigoTipoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCalificacionEmpleado;
	public JLabel jLabelnombreTipoCalificacionEmpleado;
	public JTextArea jTextAreanombreTipoCalificacionEmpleado;
	public JScrollPane jscrollPanenombreTipoCalificacionEmpleado;
	public JButton jButtonnombreTipoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCalificacionEmpleado;
	public JLabel jLabelid_empresaTipoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCalificacionEmpleado;
	public JButton jButtonid_empresaTipoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaTipoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCalificacionEmpleado;
	
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
	
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCalificacionEmpleado=new JPanel();
				this.jPanelAccionesFormularioTipoCalificacionEmpleado=new JPanel();
				this.jmenuBarDetalleTipoCalificacionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleTipoCalificacionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalificacionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCalificacionEmpleado() {
		return this.jButtonActualizarToolBarTipoCalificacionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarTipoCalificacionEmpleado() {
		return this.jButtonEliminarToolBarTipoCalificacionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarTipoCalificacionEmpleado() {
		return this.jButtonCancelarToolBarTipoCalificacionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCalificacionEmpleado() {
		return this.jButtonProcesarInformacionTipoCalificacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCalificacionEmpleado)	{
		this.jButtonProcesarInformacionTipoCalificacionEmpleado = jButtonProcesarInformacionTipoCalificacionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCalificacionEmpleado() {
		return this.jComboBoxTiposAccionesTipoCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoCalificacionEmpleado) {
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado = jComboBoxTiposRelacionesTipoCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposAccionesTipoCalificacionEmpleado) {
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado = jComboBoxTiposAccionesTipoCalificacionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCalificacionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCalificacionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado) {
		this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado = jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
		
		this.tipocalificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCalificacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Calificacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCalificacionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCalificacionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarTipoCalificacionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCalificacionEmpleado,this.jTtoolBarDetalleTipoCalificacionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCalificacionEmpleado,this.jTtoolBarDetalleTipoCalificacionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCalificacionEmpleado,this.jTtoolBarDetalleTipoCalificacionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado,this.jTtoolBarDetalleTipoCalificacionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCalificacionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCalificacionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCalificacionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCalificacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCalificacionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCalificacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCalificacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCalificacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCalificacionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCalificacionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCalificacionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCalificacionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCalificacionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCalificacionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCalificacionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCalificacionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCalificacionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCalificacionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCalificacionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCalificacionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCalificacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCalificacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCalificacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCalificacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCalificacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCalificacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCalificacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCalificacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCalificacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCalificacionEmpleado.add(this.jMenuItemDetalleCerrarTipoCalificacionEmpleado);
		
		this.jmenuDetalleAccionesTipoCalificacionEmpleado.add(this.jMenuItemActualizarTipoCalificacionEmpleado);
		this.jmenuDetalleAccionesTipoCalificacionEmpleado.add(this.jMenuItemEliminarTipoCalificacionEmpleado);
		this.jmenuDetalleAccionesTipoCalificacionEmpleado.add(this.jMenuItemCancelarTipoCalificacionEmpleado);		
		
		//this.jmenuDetalleDatosTipoCalificacionEmpleado.add(this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado);				
		this.jmenuDetalleDatosTipoCalificacionEmpleado.add(this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado);				
				
		//this.jmenuDetalleAccionesTipoCalificacionEmpleado.add(this.jMenuItemGuardarCambiosTipoCalificacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCalificacionEmpleado.add(this.jmenuDetalleArchivoTipoCalificacionEmpleado);		
		this.jmenuBarDetalleTipoCalificacionEmpleado.add(this.jmenuDetalleAccionesTipoCalificacionEmpleado);		
		this.jmenuBarDetalleTipoCalificacionEmpleado.add(this.jmenuDetalleDatosTipoCalificacionEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCalificacionEmpleado.add(this.jmenuDetalleTipoCalificacionEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCalificacionEmpleado);				
	}
	
	
	public void inicializarElementosCamposTipoCalificacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCalificacionEmpleado = new JLabelMe();
		jLabelIdTipoCalificacionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCalificacionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCalificacionEmpleado.setToolTipText(TipoCalificacionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCalificacionEmpleado= new GridBagLayout();

		this.jPanelidTipoCalificacionEmpleado.setLayout(this.gridaBagLayoutTipoCalificacionEmpleado);

		jLabelidTipoCalificacionEmpleado = new JLabel();
		jLabelidTipoCalificacionEmpleado.setText("Id");

		jLabelidTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCalificacionEmpleado = new JLabelMe();
		this.jLabelcodigoTipoCalificacionEmpleado.setText(""+TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCalificacionEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCalificacionEmpleado.setToolTipText(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCalificacionEmpleado = new GridBagLayout();
		this.jPanelcodigoTipoCalificacionEmpleado.setLayout(this.gridaBagLayoutTipoCalificacionEmpleado);


		jTextFieldcodigoTipoCalificacionEmpleado= new JTextFieldMe();

		jTextFieldcodigoTipoCalificacionEmpleado.setEnabled(false);
		jTextFieldcodigoTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCalificacionEmpleadoBusqueda"));

		if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCalificacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCalificacionEmpleado = new JLabelMe();
		this.jLabelnombreTipoCalificacionEmpleado.setText(""+TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCalificacionEmpleado.setToolTipText("Nombre");
		this.jLabelnombreTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCalificacionEmpleado.setToolTipText(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCalificacionEmpleado = new GridBagLayout();
		this.jPanelnombreTipoCalificacionEmpleado.setLayout(this.gridaBagLayoutTipoCalificacionEmpleado);


		jTextAreanombreTipoCalificacionEmpleado= new JTextAreaMe();
		jTextAreanombreTipoCalificacionEmpleado.setEnabled(false);
		jTextAreanombreTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalificacionEmpleado.setLineWrap(true);
		jTextAreanombreTipoCalificacionEmpleado.setWrapStyleWord(true);
		jTextAreanombreTipoCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCalificacionEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCalificacionEmpleado = new JScrollPane(jTextAreanombreTipoCalificacionEmpleado);
		jscrollPanenombreTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCalificacionEmpleadoBusqueda"));

		if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCalificacionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCalificacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCalificacionEmpleado = new JLabelMe();
		this.jLabelid_empresaTipoCalificacionEmpleado.setText(""+TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCalificacionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCalificacionEmpleado.setToolTipText(TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_empresaTipoCalificacionEmpleado.setLayout(this.gridaBagLayoutTipoCalificacionEmpleado);


		jComboBoxid_empresaTipoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCalificacionEmpleado.setEnabled(false);

		this.jButtonid_empresaTipoCalificacionEmpleado= new JButtonMe();
		this.jButtonid_empresaTipoCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCalificacionEmpleado.setText("Buscar");
		this.jButtonid_empresaTipoCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCalificacionEmpleado"));

		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCalificacionEmpleadoBusqueda"));

		if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaTipoCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCalificacionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleTipoCalificacionEmpleado = new TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Calificacion Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCalificacionEmpleado= new GridBagLayout();
		

		
		String sToolTipTipoCalificacionEmpleado="";
		sToolTipTipoCalificacionEmpleado=TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCalificacionEmpleado+="(Nomina.TipoCalificacionEmpleado)";
		}
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCalificacionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonModificarTipoCalificacionEmpleado = new JButtonMe();
        this.jButtonActualizarTipoCalificacionEmpleado = new JButtonMe();
        this.jButtonEliminarTipoCalificacionEmpleado = new JButtonMe();
        this.jButtonCancelarTipoCalificacionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarTipoCalificacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoCalificacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCalificacionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCalificacionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Calificacion Empleado";
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calificacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCalificacionEmpleado.setName("jPanelCamposTipoCalificacionEmpleado"); 

		this.jPanelCamposOcultosTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCalificacionEmpleado.setName("jPanelCamposOcultosTipoCalificacionEmpleado"); 

        this.jPanelAccionesTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCalificacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoCalificacionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCalificacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCalificacionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCalificacionEmpleado.setText("Nuevo");
		this.jButtonModificarTipoCalificacionEmpleado.setText("Editar");
        this.jButtonActualizarTipoCalificacionEmpleado.setText("Actualizar");
        this.jButtonEliminarTipoCalificacionEmpleado.setText("Eliminar");
        this.jButtonCancelarTipoCalificacionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCalificacionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.setText("Guardar");
		this.jButtonCerrarTipoCalificacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCalificacionEmpleado,"nuevo_button","Nuevo",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCalificacionEmpleado,"modificar_button","Editar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCalificacionEmpleado,"actualizar_button","Actualizar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCalificacionEmpleado,"eliminar_button","Eliminar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCalificacionEmpleado,"cancelar_button","Cancelar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCalificacionEmpleado,"guardarcambios_button","Guardar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado,"guardarcambiostabla_button","Guardar",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCalificacionEmpleado,"cerrar_button","Salir",this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCalificacionEmpleado.setToolTipText("Nuevo"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCalificacionEmpleado.setToolTipText("Editar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCalificacionEmpleado.setToolTipText("Actualizar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCalificacionEmpleado.setToolTipText("Eliminar)"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCalificacionEmpleado.setToolTipText("Cancelar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCalificacionEmpleado.setToolTipText("Guardar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.setToolTipText("Guardar"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCalificacionEmpleado.setToolTipText("Salir"+" "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCalificacionEmpleado";
		inputMap = this.jButtonNuevoTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCalificacionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCalificacionEmpleado";
		inputMap = this.jButtonActualizarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCalificacionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCalificacionEmpleado";
		inputMap = this.jButtonEliminarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCalificacionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCalificacionEmpleado";
		inputMap = this.jButtonCancelarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCalificacionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCalificacionEmpleado";
		inputMap = this.jButtonCerrarTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCalificacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCalificacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCalificacionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado.setToolTipText("Nuevo TipoCalificacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado.setToolTipText("Sin Cerrar Ventana TipoCalificacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCalificacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoCalificacionEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCalificacionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCalificacionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCalificacionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCalificacionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCalificacionEmpleado = new GridBagLayout();
		
		this.jPanelCamposTipoCalificacionEmpleado.setLayout(gridaBagLayoutCamposTipoCalificacionEmpleado);
		this.jPanelCamposOcultosTipoCalificacionEmpleado.setLayout(gridaBagLayoutCamposOcultosTipoCalificacionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCalificacionEmpleado.add(jLabelIdTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCalificacionEmpleado.add(jLabelidTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);


	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCalificacionEmpleado.add(jLabelid_empresaTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCalificacionEmpleado.add(jButtonid_empresaTipoCalificacionEmpleadoBusqueda, this.gridBagConstraintsTipoCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCalificacionEmpleado.add(jButtonid_empresaTipoCalificacionEmpleadoUpdate, this.gridBagConstraintsTipoCalificacionEmpleado);
	}

	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCalificacionEmpleado.add(jComboBoxid_empresaTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);


	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCalificacionEmpleado.add(jLabelcodigoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCalificacionEmpleado.add(jButtoncodigoTipoCalificacionEmpleadoBusqueda, this.gridBagConstraintsTipoCalificacionEmpleado);
	}

	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCalificacionEmpleado.add(jTextFieldcodigoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);


	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCalificacionEmpleado.add(jLabelnombreTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCalificacionEmpleado.add(jButtonnombreTipoCalificacionEmpleadoBusqueda, this.gridBagConstraintsTipoCalificacionEmpleado);
	}

	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCalificacionEmpleado.add(jscrollPanenombreTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iYPanelCamposTipoCalificacionEmpleado;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iXPanelCamposTipoCalificacionEmpleado++;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalificacionEmpleado.add(this.jPanelidTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(iXPanelCamposTipoCalificacionEmpleado % 1==0) {
		iXPanelCamposTipoCalificacionEmpleado=0;
		iYPanelCamposTipoCalificacionEmpleado++;
	}
	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iYPanelCamposTipoCalificacionEmpleado;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iXPanelCamposTipoCalificacionEmpleado++;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalificacionEmpleado.add(this.jPanelcodigoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(iXPanelCamposTipoCalificacionEmpleado % 1==0) {
		iXPanelCamposTipoCalificacionEmpleado=0;
		iYPanelCamposTipoCalificacionEmpleado++;
	}
	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iYPanelCamposTipoCalificacionEmpleado;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iXPanelCamposTipoCalificacionEmpleado++;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalificacionEmpleado.add(this.jPanelnombreTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(iXPanelCamposTipoCalificacionEmpleado % 1==0) {
		iXPanelCamposTipoCalificacionEmpleado=0;
		iYPanelCamposTipoCalificacionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iYPanelCamposOcultosTipoCalificacionEmpleado;
	this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iXPanelCamposOcultosTipoCalificacionEmpleado++;
	this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCalificacionEmpleado.add(this.jPanelid_empresaTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);



	if(iXPanelCamposOcultosTipoCalificacionEmpleado % 1==0) {
		iXPanelCamposOcultosTipoCalificacionEmpleado=0;
		iYPanelCamposOcultosTipoCalificacionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCalificacionEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoCalificacionEmpleado.setLayout(gridaBagLayoutAccionesTipoCalificacionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCalificacionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCalificacionEmpleado.setLayout(gridaBagLayoutAccionesFormularioTipoCalificacionEmpleado);
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCalificacionEmpleado.add(this.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCalificacionEmpleado.add(this.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCalificacionEmpleado.add(this.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCalificacionEmpleado.add(this.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCalificacionEmpleado.add(this.jButtonModificarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);							

		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCalificacionEmpleado.add(this.jButtonEliminarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
			
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCalificacionEmpleado.add(this.jButtonActualizarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);


		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCalificacionEmpleado.add(this.jButtonGuardarCambiosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);	
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCalificacionEmpleado.add(this.jButtonCancelarTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCalificacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCalificacionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoCalificacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCalificacionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =0;
		this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCalificacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCalificacionEmpleado = new TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Calificacion Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Calificacion Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Calificacion Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCalificacionEmpleadoModel tipocalificacionempleadoModel=new TipoCalificacionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCalificacionEmpleadoModel.TipoCalificacionEmpleadoFocusTraversalPolicy tipocalificacionempleadoFocusTraversalPolicy = tipocalificacionempleadoModel.new TipoCalificacionEmpleadoFocusTraversalPolicy(this);
			
			//tipocalificacionempleadoFocusTraversalPolicy.settipocalificacionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocalificacionempleadoModel);
			
			
			this.jContentPaneDetalleTipoCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCalificacionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleTipoCalificacionEmpleado.setLayout(gridaBagLayoutDetalleTipoCalificacionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCalificacionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCalificacionEmpleado.add(jTtoolBarDetalleTipoCalificacionEmpleado, gridBagConstraintsTipoCalificacionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado=   new JScrollPane(jContentPaneDetalleTipoCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleTipoCalificacionEmpleado.add(jPanelCamposTipoCalificacionEmpleado, gridBagConstraintsTipoCalificacionEmpleado);
			
			
			
			
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
						&& tipocalificacionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(this.puedeCargarPorParteCalificacionEmpleado,false,-1);
					
					if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCalificacionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
						this.jContentPaneDetalleTipoCalificacionEmpleado.add(this.jTabbedPaneRelacionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCalificacionEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCalificacionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsTipoCalificacionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCalificacionEmpleado.add(jPanelCamposOcultosTipoCalificacionEmpleado, gridBagConstraintsTipoCalificacionEmpleado);
				
					this.jPanelCamposOcultosTipoCalificacionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	        this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCalificacionEmpleado.add(this.jPanelAccionesFormularioTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);							
			
			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCalificacionEmpleado.add(this.jPanelAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCalificacionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado=   new JScrollPane(this.jPanelCamposTipoCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
			this.gridBagConstraintsTipoCalificacionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCalificacionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);			
			
			this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
			
			
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		
			
		this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoCalificacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalificacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCalificacionEmpleado, this.gridBagConstraintsTipoCalificacionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCalificacionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCalificacionEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		this.calificacionempleadoSessionBean.setConGuardarRelaciones(false);
		this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.calificacionempleadoBeanSwingJInternalFramePopup=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.calificacionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {

				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.calificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.calificacionempleadoBeanSwingJInternalFrame.setcalificacionempleadoSessionBean(this.calificacionempleadoSessionBean);

				//this.gridBagConstraintsTipoCalificacionEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsTipoCalificacionEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCalificacionEmpleado.gridx = 0;
				//this.jContentPaneDetalleTipoCalificacionEmpleado.add(this.calificacionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCalificacionEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCalificacionEmpleado.add("Calificacion Empleados",this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCalificacionEmpleado.setComponentAt(iIndexTab,this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCalificacionEmpleado) {
					this.jTabbedPaneRelacionesTipoCalificacionEmpleado.add("Calificacion Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCalificacionEmpleadoBeanSwingJInternalFrame(List<TipoCalificacionEmpleado> tipocalificacionempleados,TipoCalificacionEmpleado tipocalificacionempleado,CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					calificacionempleadoBeanSwingJInternalFrame.getCalificacionEmpleadoLogic().setConnexion(this.tipocalificacionempleadoLogic.getConnexion());

					calificacionempleadoBeanSwingJInternalFrame.settipocalificacionempleadosForeignKey(tipocalificacionempleados);
					calificacionempleadoBeanSwingJInternalFrame.settipocalificacionempleadoForeignKey(tipocalificacionempleado);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setlidTipoCalificacionEmpleadoActual(tipocalificacionempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					calificacionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyCalificacionEmpleado(calificacionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					calificacionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCalificacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.setid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado(tipocalificacionempleado.getId());

					if(!this.conCargarFormDetalle) {
						calificacionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					calificacionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCalificacionEmpleadoForeignKey(tipocalificacionempleado,1,false,true,true);
					calificacionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					calificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCalificacionEmpleado");
					calificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCalificacionEmpleado");
					calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCalificacionEmpleado("n",calificacionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, calificacionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					calificacionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					calificacionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("relacionado");
					} else {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("no_relacionado");
					}

					calificacionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionCalificacionEmpleado().setVisible(false);

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
