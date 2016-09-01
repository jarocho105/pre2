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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.PreguntaEquivalenciaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class PreguntaEquivalenciaDetalleFormJInternalFrame extends PreguntaEquivalenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePreguntaEquivalencia;
	
	protected JMenuBar jmenuBarDetallePreguntaEquivalencia;
	
	protected JMenu jmenuDetallePreguntaEquivalencia;
	protected JMenu jmenuDetalleArchivoPreguntaEquivalencia;
	protected JMenu jmenuDetalleAccionesPreguntaEquivalencia;
	protected JMenu jmenuDetalleDatosPreguntaEquivalencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreguntaEquivalencia;	
	protected GridBagConstraints gridBagConstraintsPreguntaEquivalencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PreguntaEquivalenciaBeanSwingJInternalFrameAdditional jInternalFrameDetallePreguntaEquivalencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PreguntaEquivalenciaSessionBean preguntaequivalenciaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PreguntaEquivalenciaLogic preguntaequivalenciaLogic;
	
	public JScrollPane jScrollPanelDatosPreguntaEquivalencia;
	public JScrollPane jScrollPanelDatosEdicionPreguntaEquivalencia;
	public JScrollPane jScrollPanelDatosGeneralPreguntaEquivalencia;
	
	protected JPanel jPanelCamposPreguntaEquivalencia;    
	protected JPanel jPanelCamposOcultosPreguntaEquivalencia;    	
	protected JPanel jPanelAccionesPreguntaEquivalencia;
	protected JPanel jPanelAccionesFormularioPreguntaEquivalencia;
    
	
	
	protected Integer iXPanelCamposPreguntaEquivalencia=0;
	protected Integer iYPanelCamposPreguntaEquivalencia=0;
	
	protected Integer iXPanelCamposOcultosPreguntaEquivalencia=0;
	protected Integer iYPanelCamposOcultosPreguntaEquivalencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPreguntaEquivalencia;
	public JButton jButtonModificarPreguntaEquivalencia;
	public JButton jButtonActualizarPreguntaEquivalencia;
    public JButton jButtonEliminarPreguntaEquivalencia;
	public JButton jButtonCancelarPreguntaEquivalencia;
    public JButton jButtonGuardarCambiosPreguntaEquivalencia;
	public JButton jButtonGuardarCambiosTablaPreguntaEquivalencia;
	protected JButton jButtonCerrarPreguntaEquivalencia;
	
	
	protected JButton jButtonProcesarInformacionPreguntaEquivalencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPreguntaEquivalencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPreguntaEquivalencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajePreguntaEquivalencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreguntaEquivalencia;
	protected JButton jButtonModificarToolBarPreguntaEquivalencia;
	protected JButton jButtonActualizarToolBarPreguntaEquivalencia;
    protected JButton jButtonEliminarToolBarPreguntaEquivalencia;
	protected JButton jButtonCancelarToolBarPreguntaEquivalencia;
    protected JButton jButtonGuardarCambiosToolBarPreguntaEquivalencia;
	protected JButton jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia;
	protected JButton jButtonMostrarOcultarTablaToolBarPreguntaEquivalencia;
	protected JButton jButtonCerrarToolBarPreguntaEquivalencia;
	
	protected JButton jButtonProcesarInformacionToolBarPreguntaEquivalencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreguntaEquivalencia;
	protected JMenuItem jMenuItemModificarPreguntaEquivalencia;
	protected JMenuItem jMenuItemActualizarPreguntaEquivalencia;
    protected JMenuItem jMenuItemEliminarPreguntaEquivalencia;
	protected JMenuItem jMenuItemCancelarPreguntaEquivalencia;
    protected JMenuItem jMenuItemGuardarCambiosPreguntaEquivalencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreguntaEquivalencia;
	protected JMenuItem jMenuItemCerrarPreguntaEquivalencia;
	protected JMenuItem jMenuItemDetalleCerrarPreguntaEquivalencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreguntaEquivalencia;
	
	protected JMenuItem jMenuItemProcesarInformacionPreguntaEquivalencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreguntaEquivalencia;
	protected JMenuItem jMenuItemMostrarOcultarPreguntaEquivalencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreguntaEquivalencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreguntaEquivalencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPreguntaEquivalencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPreguntaEquivalencia;
	public JLabel jLabelIdPreguntaEquivalencia;
	public JLabel jLabelidPreguntaEquivalencia;
	public JButton jButtonidPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPreguntaEquivalencia;
	public JLabel jLabeldescripcionPreguntaEquivalencia;
	public JTextArea jTextAreadescripcionPreguntaEquivalencia;
	public JScrollPane jscrollPanedescripcionPreguntaEquivalencia;
	public JButton jButtondescripcionPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPaneldesdePreguntaEquivalencia;
	public JLabel jLabeldesdePreguntaEquivalencia;
	public JTextField jTextFielddesdePreguntaEquivalencia;
	public JButton jButtondesdePreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelhastaPreguntaEquivalencia;
	public JLabel jLabelhastaPreguntaEquivalencia;
	public JTextField jTextFieldhastaPreguntaEquivalencia;
	public JButton jButtonhastaPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelordenPreguntaEquivalencia;
	public JLabel jLabelordenPreguntaEquivalencia;
	public JTextField jTextFieldordenPreguntaEquivalencia;
	public JButton jButtonordenPreguntaEquivalenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPreguntaEquivalencia;
	public JLabel jLabelid_empresaPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPreguntaEquivalencia;
	public JButton jButtonid_empresaPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_empresaPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPreguntaEquivalencia;
	public JLabel jLabelid_sucursalPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPreguntaEquivalencia;
	public JButton jButtonid_sucursalPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_sucursalPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPreguntaEquivalencia;
	public JLabel jLabelid_ejercicioPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPreguntaEquivalencia;
	public JButton jButtonid_ejercicioPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_ejercicioPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPreguntaEquivalencia;
	public JLabel jLabelid_periodoPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPreguntaEquivalencia;
	public JButton jButtonid_periodoPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_periodoPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_periodoPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPreguntaEquivalencia;
	public JLabel jLabelid_anioPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPreguntaEquivalencia;
	public JButton jButtonid_anioPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_anioPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_anioPreguntaEquivalenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPreguntaEquivalencia;
	public JLabel jLabelid_mesPreguntaEquivalencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPreguntaEquivalencia;
	public JButton jButtonid_mesPreguntaEquivalencia= new JButtonMe();
	public JButton jButtonid_mesPreguntaEquivalenciaUpdate= new JButtonMe();
	public JButton jButtonid_mesPreguntaEquivalenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPreguntaEquivalencia;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PreguntaEquivalenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPreguntaEquivalencia=new JPanel();
				this.jPanelAccionesFormularioPreguntaEquivalencia=new JPanel();
				this.jmenuBarDetallePreguntaEquivalencia=new JMenuBar();
				this.jTtoolBarDetallePreguntaEquivalencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PreguntaEquivalenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEquivalenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreguntaEquivalencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPreguntaEquivalencia() {
		return this.jButtonActualizarToolBarPreguntaEquivalencia;
	}
	
	public JButton getjButtonEliminarToolBarPreguntaEquivalencia() {
		return this.jButtonEliminarToolBarPreguntaEquivalencia;
	}
	
	public JButton getjButtonCancelarToolBarPreguntaEquivalencia() {
		return this.jButtonCancelarToolBarPreguntaEquivalencia;
	}		
	
	public JButton getjButtonProcesarInformacionPreguntaEquivalencia() {
		return this.jButtonProcesarInformacionPreguntaEquivalencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreguntaEquivalencia)	{
		this.jButtonProcesarInformacionPreguntaEquivalencia = jButtonProcesarInformacionPreguntaEquivalencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreguntaEquivalencia() {
		return this.jComboBoxTiposAccionesPreguntaEquivalencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreguntaEquivalencia(
			JComboBox jComboBoxTiposRelacionesPreguntaEquivalencia) {
		this.jComboBoxTiposRelacionesPreguntaEquivalencia = jComboBoxTiposRelacionesPreguntaEquivalencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreguntaEquivalencia(
			JComboBox jComboBoxTiposAccionesPreguntaEquivalencia) {
		this.jComboBoxTiposAccionesPreguntaEquivalencia = jComboBoxTiposAccionesPreguntaEquivalencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPreguntaEquivalencia() {
		return this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPreguntaEquivalencia(
			JComboBox jComboBoxTiposAccionesFormularioPreguntaEquivalencia) {
		this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia = jComboBoxTiposAccionesFormularioPreguntaEquivalencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
		
		this.preguntaequivalenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntaequivalenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreguntaEquivalenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreguntaEquivalenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreguntaEquivalenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Preguntas Equivalencia MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		PreguntaEquivalenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePreguntaEquivalencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPreguntaEquivalencia=new JButtonMe();
				this.jButtonModificarToolBarPreguntaEquivalencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPreguntaEquivalencia,this.jTtoolBarDetallePreguntaEquivalencia,
							"actualizar","actualizar","Actualizar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPreguntaEquivalencia,this.jTtoolBarDetallePreguntaEquivalencia,
							"eliminar","eliminar","Eliminar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPreguntaEquivalencia,this.jTtoolBarDetallePreguntaEquivalencia,
							"cancelar","cancelar","Cancelar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPreguntaEquivalencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPreguntaEquivalencia,this.jTtoolBarDetallePreguntaEquivalencia,
							"guardarcambios","guardarcambios","Guardar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePreguntaEquivalencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePreguntaEquivalencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPreguntaEquivalencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPreguntaEquivalencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPreguntaEquivalencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreguntaEquivalencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreguntaEquivalencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreguntaEquivalencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPreguntaEquivalencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPreguntaEquivalencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPreguntaEquivalencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPreguntaEquivalencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPreguntaEquivalencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPreguntaEquivalencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPreguntaEquivalencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPreguntaEquivalencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPreguntaEquivalencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPreguntaEquivalencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPreguntaEquivalencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPreguntaEquivalencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPreguntaEquivalencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreguntaEquivalencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreguntaEquivalencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreguntaEquivalencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreguntaEquivalencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreguntaEquivalencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPreguntaEquivalencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPreguntaEquivalencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPreguntaEquivalencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreguntaEquivalencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreguntaEquivalencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreguntaEquivalencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPreguntaEquivalencia.add(this.jMenuItemDetalleCerrarPreguntaEquivalencia);
		
		this.jmenuDetalleAccionesPreguntaEquivalencia.add(this.jMenuItemActualizarPreguntaEquivalencia);
		this.jmenuDetalleAccionesPreguntaEquivalencia.add(this.jMenuItemEliminarPreguntaEquivalencia);
		this.jmenuDetalleAccionesPreguntaEquivalencia.add(this.jMenuItemCancelarPreguntaEquivalencia);		
		
		//this.jmenuDetalleDatosPreguntaEquivalencia.add(this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia);				
		this.jmenuDetalleDatosPreguntaEquivalencia.add(this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia);				
				
		//this.jmenuDetalleAccionesPreguntaEquivalencia.add(this.jMenuItemGuardarCambiosPreguntaEquivalencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePreguntaEquivalencia.add(this.jmenuDetalleArchivoPreguntaEquivalencia);		
		this.jmenuBarDetallePreguntaEquivalencia.add(this.jmenuDetalleAccionesPreguntaEquivalencia);		
		this.jmenuBarDetallePreguntaEquivalencia.add(this.jmenuDetalleDatosPreguntaEquivalencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePreguntaEquivalencia);				
	}
	
	
	public void inicializarElementosCamposPreguntaEquivalencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPreguntaEquivalencia = new JLabelMe();
		jLabelIdPreguntaEquivalencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPreguntaEquivalencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPreguntaEquivalencia= new GridBagLayout();

		this.jPanelidPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);

		jLabelidPreguntaEquivalencia = new JLabel();
		jLabelidPreguntaEquivalencia.setText("Id");

		jLabelidPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionPreguntaEquivalencia = new JLabelMe();
		this.jLabeldescripcionPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPreguntaEquivalencia.setToolTipText("Descripcion");
		this.jLabeldescripcionPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPaneldescripcionPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jTextAreadescripcionPreguntaEquivalencia= new JTextAreaMe();
		jTextAreadescripcionPreguntaEquivalencia.setEnabled(false);
		jTextAreadescripcionPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPreguntaEquivalencia.setLineWrap(true);
		jTextAreadescripcionPreguntaEquivalencia.setWrapStyleWord(true);
		jTextAreadescripcionPreguntaEquivalencia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPreguntaEquivalencia.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPreguntaEquivalencia = new JScrollPane(jTextAreadescripcionPreguntaEquivalencia);
		jscrollPanedescripcionPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtondescripcionPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtondescripcionPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPreguntaEquivalenciaBusqueda.setVisible(false);		}


					
		this.jLabeldesdePreguntaEquivalencia = new JLabelMe();
		this.jLabeldesdePreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE+" : *");
		this.jLabeldesdePreguntaEquivalencia.setToolTipText("Desde");
		this.jLabeldesdePreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldesdePreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldesdePreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldesdePreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldesdePreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldesdePreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPaneldesdePreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jTextFielddesdePreguntaEquivalencia= new JTextFieldMe();
		jTextFielddesdePreguntaEquivalencia.setEnabled(false);
		jTextFielddesdePreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddesdePreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddesdePreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddesdePreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddesdePreguntaEquivalencia.setText("0.0");

		this.jButtondesdePreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtondesdePreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondesdePreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondesdePreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondesdePreguntaEquivalenciaBusqueda.setText("U");
		this.jButtondesdePreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondesdePreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondesdePreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddesdePreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddesdePreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"desdePreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondesdePreguntaEquivalenciaBusqueda.setVisible(false);		}


					
		this.jLabelhastaPreguntaEquivalencia = new JLabelMe();
		this.jLabelhastaPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA+" : *");
		this.jLabelhastaPreguntaEquivalencia.setToolTipText("Hasta");
		this.jLabelhastaPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhastaPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhastaPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhastaPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhastaPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhastaPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelhastaPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jTextFieldhastaPreguntaEquivalencia= new JTextFieldMe();
		jTextFieldhastaPreguntaEquivalencia.setEnabled(false);
		jTextFieldhastaPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhastaPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhastaPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhastaPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhastaPreguntaEquivalencia.setText("0.0");

		this.jButtonhastaPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonhastaPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhastaPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhastaPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhastaPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonhastaPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhastaPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhastaPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhastaPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhastaPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hastaPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhastaPreguntaEquivalenciaBusqueda.setVisible(false);		}


					
		this.jLabelordenPreguntaEquivalencia = new JLabelMe();
		this.jLabelordenPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenPreguntaEquivalencia.setToolTipText("Orden");
		this.jLabelordenPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelordenPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jTextFieldordenPreguntaEquivalencia= new JTextFieldMe();
		jTextFieldordenPreguntaEquivalencia.setEnabled(false);
		jTextFieldordenPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenPreguntaEquivalencia.setText("0");

		this.jButtonordenPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonordenPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonordenPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPreguntaEquivalenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPreguntaEquivalencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPreguntaEquivalencia = new JLabelMe();
		this.jLabelid_empresaPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPreguntaEquivalencia.setToolTipText("Empresa");
		this.jLabelid_empresaPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelid_empresaPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jComboBoxid_empresaPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_empresaPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPreguntaEquivalencia.setEnabled(false);

		this.jButtonid_empresaPreguntaEquivalencia= new JButtonMe();
		this.jButtonid_empresaPreguntaEquivalencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaEquivalencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaEquivalencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaEquivalencia.setText("Buscar");
		this.jButtonid_empresaPreguntaEquivalencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPreguntaEquivalencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaEquivalencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaEquivalencia"));

		this.jButtonid_empresaPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPreguntaEquivalenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPreguntaEquivalenciaUpdate= new JButtonMe();
		this.jButtonid_empresaPreguntaEquivalenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEquivalenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEquivalenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreguntaEquivalenciaUpdate.setText("U");
		this.jButtonid_empresaPreguntaEquivalenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPreguntaEquivalenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaEquivalenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaEquivalenciaUpdate"));



					
		this.jLabelid_sucursalPreguntaEquivalencia = new JLabelMe();
		this.jLabelid_sucursalPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPreguntaEquivalencia.setToolTipText("Sucursal");
		this.jLabelid_sucursalPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelid_sucursalPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jComboBoxid_sucursalPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_sucursalPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPreguntaEquivalencia.setEnabled(false);

		this.jButtonid_sucursalPreguntaEquivalencia= new JButtonMe();
		this.jButtonid_sucursalPreguntaEquivalencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreguntaEquivalencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreguntaEquivalencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreguntaEquivalencia.setText("Buscar");
		this.jButtonid_sucursalPreguntaEquivalencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPreguntaEquivalencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreguntaEquivalencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreguntaEquivalencia"));

		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPreguntaEquivalenciaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPreguntaEquivalenciaUpdate= new JButtonMe();
		this.jButtonid_sucursalPreguntaEquivalenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEquivalenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEquivalenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPreguntaEquivalenciaUpdate.setText("U");
		this.jButtonid_sucursalPreguntaEquivalenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPreguntaEquivalenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreguntaEquivalenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreguntaEquivalenciaUpdate"));



					
		this.jLabelid_ejercicioPreguntaEquivalencia = new JLabelMe();
		this.jLabelid_ejercicioPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPreguntaEquivalencia.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelid_ejercicioPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jComboBoxid_ejercicioPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_ejercicioPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioPreguntaEquivalencia= new JButtonMe();
		this.jButtonid_ejercicioPreguntaEquivalencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPreguntaEquivalencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPreguntaEquivalencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPreguntaEquivalencia.setText("Buscar");
		this.jButtonid_ejercicioPreguntaEquivalencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPreguntaEquivalencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPreguntaEquivalencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPreguntaEquivalencia"));

		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPreguntaEquivalenciaUpdate= new JButtonMe();
		this.jButtonid_ejercicioPreguntaEquivalenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEquivalenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEquivalenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPreguntaEquivalenciaUpdate.setText("U");
		this.jButtonid_ejercicioPreguntaEquivalenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPreguntaEquivalenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPreguntaEquivalenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPreguntaEquivalenciaUpdate"));



					
		this.jLabelid_periodoPreguntaEquivalencia = new JLabelMe();
		this.jLabelid_periodoPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPreguntaEquivalencia.setToolTipText("Periodo");
		this.jLabelid_periodoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelid_periodoPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jComboBoxid_periodoPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_periodoPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodoPreguntaEquivalencia= new JButtonMe();
		this.jButtonid_periodoPreguntaEquivalencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPreguntaEquivalencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPreguntaEquivalencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPreguntaEquivalencia.setText("Buscar");
		this.jButtonid_periodoPreguntaEquivalencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPreguntaEquivalencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPreguntaEquivalencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPreguntaEquivalencia"));

		this.jButtonid_periodoPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPreguntaEquivalenciaBusqueda.setVisible(false);		}

		this.jButtonid_periodoPreguntaEquivalenciaUpdate= new JButtonMe();
		this.jButtonid_periodoPreguntaEquivalenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEquivalenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEquivalenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPreguntaEquivalenciaUpdate.setText("U");
		this.jButtonid_periodoPreguntaEquivalenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPreguntaEquivalenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPreguntaEquivalenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPreguntaEquivalenciaUpdate"));



					
		this.jLabelid_anioPreguntaEquivalencia = new JLabelMe();
		this.jLabelid_anioPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPreguntaEquivalencia.setToolTipText("Anio");
		this.jLabelid_anioPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelid_anioPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jComboBoxid_anioPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_anioPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPreguntaEquivalencia.setEnabled(false);

		this.jButtonid_anioPreguntaEquivalencia= new JButtonMe();
		this.jButtonid_anioPreguntaEquivalencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPreguntaEquivalencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPreguntaEquivalencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPreguntaEquivalencia.setText("Buscar");
		this.jButtonid_anioPreguntaEquivalencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPreguntaEquivalencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPreguntaEquivalencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPreguntaEquivalencia"));

		this.jButtonid_anioPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonid_anioPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonid_anioPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPreguntaEquivalenciaBusqueda.setVisible(false);		}

		this.jButtonid_anioPreguntaEquivalenciaUpdate= new JButtonMe();
		this.jButtonid_anioPreguntaEquivalenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEquivalenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEquivalenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPreguntaEquivalenciaUpdate.setText("U");
		this.jButtonid_anioPreguntaEquivalenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPreguntaEquivalenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPreguntaEquivalenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPreguntaEquivalenciaUpdate"));



					
		this.jLabelid_mesPreguntaEquivalencia = new JLabelMe();
		this.jLabelid_mesPreguntaEquivalencia.setText(""+PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPreguntaEquivalencia.setToolTipText("Mes");
		this.jLabelid_mesPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPreguntaEquivalencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPreguntaEquivalencia.setToolTipText(PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		this.jPanelid_mesPreguntaEquivalencia.setLayout(this.gridaBagLayoutPreguntaEquivalencia);


		jComboBoxid_mesPreguntaEquivalencia= new JComboBoxMe();
		jComboBoxid_mesPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPreguntaEquivalencia.setEnabled(false);

		this.jButtonid_mesPreguntaEquivalencia= new JButtonMe();
		this.jButtonid_mesPreguntaEquivalencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPreguntaEquivalencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPreguntaEquivalencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPreguntaEquivalencia.setText("Buscar");
		this.jButtonid_mesPreguntaEquivalencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPreguntaEquivalencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPreguntaEquivalencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPreguntaEquivalencia"));

		this.jButtonid_mesPreguntaEquivalenciaBusqueda= new JButtonMe();
		this.jButtonid_mesPreguntaEquivalenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEquivalenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEquivalenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPreguntaEquivalenciaBusqueda.setText("U");
		this.jButtonid_mesPreguntaEquivalenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPreguntaEquivalenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPreguntaEquivalenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPreguntaEquivalenciaBusqueda"));

		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPreguntaEquivalenciaBusqueda.setVisible(false);		}

		this.jButtonid_mesPreguntaEquivalenciaUpdate= new JButtonMe();
		this.jButtonid_mesPreguntaEquivalenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEquivalenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEquivalenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPreguntaEquivalenciaUpdate.setText("U");
		this.jButtonid_mesPreguntaEquivalenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPreguntaEquivalenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPreguntaEquivalenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPreguntaEquivalenciaUpdate"));



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
		//this.jInternalFrameDetallePreguntaEquivalencia = new PreguntaEquivalenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Preguntas Equivalencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreguntaEquivalencia= new GridBagLayout();
		

		
		String sToolTipPreguntaEquivalencia="";
		sToolTipPreguntaEquivalencia=PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreguntaEquivalencia+="(Cartera.PreguntaEquivalencia)";
		}
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreguntaEquivalencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPreguntaEquivalencia = new JButtonMe();
		this.jButtonModificarPreguntaEquivalencia = new JButtonMe();
        this.jButtonActualizarPreguntaEquivalencia = new JButtonMe();
        this.jButtonEliminarPreguntaEquivalencia = new JButtonMe();
        this.jButtonCancelarPreguntaEquivalencia = new JButtonMe();
        this.jButtonGuardarCambiosPreguntaEquivalencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia = new JButtonMe();
		this.jButtonCerrarPreguntaEquivalencia = new JButtonMe();
		
		this.jScrollPanelDatosPreguntaEquivalencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionPreguntaEquivalencia = new JScrollPane();
		this.jScrollPanelDatosGeneralPreguntaEquivalencia = new JScrollPane();
				
		
		
		this.jPanelCamposPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Preguntas Equivalencia";
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Preguntas Equivalencias" + this.sPath));
		} else {
			this.jScrollPanelDatosPreguntaEquivalencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPreguntaEquivalencia.setName("jPanelCamposPreguntaEquivalencia"); 

		this.jPanelCamposOcultosPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPreguntaEquivalencia.setName("jPanelCamposOcultosPreguntaEquivalencia"); 

        this.jPanelAccionesPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreguntaEquivalencia.setToolTipText("Acciones");
        this.jPanelAccionesPreguntaEquivalencia.setName("Acciones"); 

		this.jPanelAccionesFormularioPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPreguntaEquivalencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPreguntaEquivalencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPreguntaEquivalencia.setText("Nuevo");
		this.jButtonModificarPreguntaEquivalencia.setText("Editar");
        this.jButtonActualizarPreguntaEquivalencia.setText("Actualizar");
        this.jButtonEliminarPreguntaEquivalencia.setText("Eliminar");
        this.jButtonCancelarPreguntaEquivalencia.setText("Cancelar");
        this.jButtonGuardarCambiosPreguntaEquivalencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.setText("Guardar");
		this.jButtonCerrarPreguntaEquivalencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreguntaEquivalencia,"nuevo_button","Nuevo",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPreguntaEquivalencia,"modificar_button","Editar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPreguntaEquivalencia,"actualizar_button","Actualizar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPreguntaEquivalencia,"eliminar_button","Eliminar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPreguntaEquivalencia,"cancelar_button","Cancelar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPreguntaEquivalencia,"guardarcambios_button","Guardar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreguntaEquivalencia,"guardarcambiostabla_button","Guardar",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreguntaEquivalencia,"cerrar_button","Salir",this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPreguntaEquivalencia.setToolTipText("Nuevo"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPreguntaEquivalencia.setToolTipText("Editar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPreguntaEquivalencia.setToolTipText("Actualizar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPreguntaEquivalencia.setToolTipText("Eliminar)"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPreguntaEquivalencia.setToolTipText("Cancelar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPreguntaEquivalencia.setToolTipText("Guardar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.setToolTipText("Guardar"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreguntaEquivalencia.setToolTipText("Salir"+" "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreguntaEquivalencia";
		inputMap = this.jButtonNuevoPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreguntaEquivalencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreguntaEquivalencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPreguntaEquivalencia";
		inputMap = this.jButtonActualizarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPreguntaEquivalencia"));
		
		//ELIMINAR
		sMapKey = "EliminarPreguntaEquivalencia";
		inputMap = this.jButtonEliminarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPreguntaEquivalencia"));
		
		//CANCELAR	
		sMapKey = "CancelarPreguntaEquivalencia";
		inputMap = this.jButtonCancelarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPreguntaEquivalencia"));
		
		//CERRAR		
		sMapKey = "CerrarPreguntaEquivalencia";
		inputMap = this.jButtonCerrarPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreguntaEquivalencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreguntaEquivalencia";
		inputMap = this.jButtonGuardarCambiosTablaPreguntaEquivalencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreguntaEquivalencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPreguntaEquivalencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPreguntaEquivalencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPreguntaEquivalencia.setToolTipText("Nuevo PreguntaEquivalencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia.setToolTipText("Sin Cerrar Ventana PreguntaEquivalencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePreguntaEquivalencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePreguntaEquivalencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePreguntaEquivalencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreguntaEquivalencia.setText("Accion");
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPreguntaEquivalencia = new JLabelMe();
		
		this.jLabelAccionesPreguntaEquivalencia.setText("Acciones");		
		this.jLabelAccionesPreguntaEquivalencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEquivalencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEquivalencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPreguntaEquivalencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPreguntaEquivalencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPreguntaEquivalencia=new JTabbedPane();
		this.jTabbedPaneRelacionesPreguntaEquivalencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPreguntaEquivalencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPreguntaEquivalencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPreguntaEquivalencia = new GridBagLayout();
		
		this.jPanelCamposPreguntaEquivalencia.setLayout(gridaBagLayoutCamposPreguntaEquivalencia);
		this.jPanelCamposOcultosPreguntaEquivalencia.setLayout(gridaBagLayoutCamposOcultosPreguntaEquivalencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPreguntaEquivalencia.add(jLabelIdPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPreguntaEquivalencia.add(jLabelidPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPreguntaEquivalencia.add(jLabelid_empresaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreguntaEquivalencia.add(jButtonid_empresaPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 3;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreguntaEquivalencia.add(jButtonid_empresaPreguntaEquivalenciaUpdate, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPreguntaEquivalencia.add(jComboBoxid_empresaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPreguntaEquivalencia.add(jLabelid_sucursalPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPreguntaEquivalencia.add(jButtonid_sucursalPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 3;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPreguntaEquivalencia.add(jButtonid_sucursalPreguntaEquivalenciaUpdate, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPreguntaEquivalencia.add(jComboBoxid_sucursalPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPreguntaEquivalencia.add(jLabelid_ejercicioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPreguntaEquivalencia.add(jButtonid_ejercicioPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 3;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPreguntaEquivalencia.add(jButtonid_ejercicioPreguntaEquivalenciaUpdate, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPreguntaEquivalencia.add(jComboBoxid_ejercicioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPreguntaEquivalencia.add(jLabelid_periodoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPreguntaEquivalencia.add(jButtonid_periodoPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 3;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPreguntaEquivalencia.add(jButtonid_periodoPreguntaEquivalenciaUpdate, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPreguntaEquivalencia.add(jComboBoxid_periodoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPreguntaEquivalencia.add(jLabeldescripcionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPreguntaEquivalencia.add(jButtondescripcionPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPreguntaEquivalencia.add(jscrollPanedescripcionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldesdePreguntaEquivalencia.add(jLabeldesdePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldesdePreguntaEquivalencia.add(jButtondesdePreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldesdePreguntaEquivalencia.add(jTextFielddesdePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhastaPreguntaEquivalencia.add(jLabelhastaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelhastaPreguntaEquivalencia.add(jButtonhastaPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhastaPreguntaEquivalencia.add(jTextFieldhastaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPreguntaEquivalencia.add(jLabelordenPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPreguntaEquivalencia.add(jButtonordenPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPreguntaEquivalencia.add(jTextFieldordenPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPreguntaEquivalencia.add(jLabelid_anioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPreguntaEquivalencia.add(jButtonid_anioPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 3;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPreguntaEquivalencia.add(jButtonid_anioPreguntaEquivalenciaUpdate, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPreguntaEquivalencia.add(jComboBoxid_anioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPreguntaEquivalencia.add(jLabelid_mesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 2;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPreguntaEquivalencia.add(jButtonid_mesPreguntaEquivalenciaBusqueda, this.gridBagConstraintsPreguntaEquivalencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 3;
		this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
		this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPreguntaEquivalencia.add(jButtonid_mesPreguntaEquivalenciaUpdate, this.gridBagConstraintsPreguntaEquivalencia);
	}

	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = 1;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPreguntaEquivalencia.add(jComboBoxid_mesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPanelidPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPanelid_ejercicioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPanelid_periodoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPaneldescripcionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPaneldesdePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPanelhastaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEquivalencia.add(this.jPanelordenPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposPreguntaEquivalencia % 1==0) {
		iXPanelCamposPreguntaEquivalencia=0;
		iYPanelCamposPreguntaEquivalencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposOcultosPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposOcultosPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEquivalencia.add(this.jPanelid_empresaPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposOcultosPreguntaEquivalencia % 1==0) {
		iXPanelCamposOcultosPreguntaEquivalencia=0;
		iYPanelCamposOcultosPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposOcultosPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposOcultosPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEquivalencia.add(this.jPanelid_sucursalPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposOcultosPreguntaEquivalencia % 1==0) {
		iXPanelCamposOcultosPreguntaEquivalencia=0;
		iYPanelCamposOcultosPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposOcultosPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposOcultosPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEquivalencia.add(this.jPanelid_anioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposOcultosPreguntaEquivalencia % 1==0) {
		iXPanelCamposOcultosPreguntaEquivalencia=0;
		iYPanelCamposOcultosPreguntaEquivalencia++;
	}
	this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEquivalencia.gridy = iYPanelCamposOcultosPreguntaEquivalencia;
	this.gridBagConstraintsPreguntaEquivalencia.gridx = iXPanelCamposOcultosPreguntaEquivalencia++;
	this.gridBagConstraintsPreguntaEquivalencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEquivalencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEquivalencia.add(this.jPanelid_mesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);



	if(iXPanelCamposOcultosPreguntaEquivalencia % 1==0) {
		iXPanelCamposOcultosPreguntaEquivalencia=0;
		iYPanelCamposOcultosPreguntaEquivalencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesPreguntaEquivalencia= new GridBagLayout();
		this.jPanelAccionesPreguntaEquivalencia.setLayout(gridaBagLayoutAccionesPreguntaEquivalencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPreguntaEquivalencia= new GridBagLayout();
		this.jPanelAccionesFormularioPreguntaEquivalencia.setLayout(gridaBagLayoutAccionesFormularioPreguntaEquivalencia);
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreguntaEquivalencia.add(this.jComboBoxTiposAccionesFormularioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreguntaEquivalencia.add(this.jCheckBoxPostAccionNuevoPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPreguntaEquivalencia.add(this.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPreguntaEquivalencia.add(this.jCheckBoxPostAccionSinMensajePreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesPreguntaEquivalencia.add(this.jButtonModificarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);							

		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;
		this.gridBagConstraintsPreguntaEquivalencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesPreguntaEquivalencia.add(this.jButtonEliminarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreguntaEquivalencia.add(this.jButtonActualizarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);


		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreguntaEquivalencia.add(this.jButtonGuardarCambiosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);	
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = 0;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesPreguntaEquivalencia.add(this.jButtonCancelarPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreguntaEquivalencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreguntaEquivalencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();						
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;		
			//this.gridBagConstraintsPreguntaEquivalencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreguntaEquivalencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreguntaEquivalencia.gridx =0;
		this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreguntaEquivalencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePreguntaEquivalencia = new PreguntaEquivalenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Preguntas Equivalencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Preguntas Equivalencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Preguntas Equivalencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PreguntaEquivalenciaModel preguntaequivalenciaModel=new PreguntaEquivalenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//PreguntaEquivalenciaModel.PreguntaEquivalenciaFocusTraversalPolicy preguntaequivalenciaFocusTraversalPolicy = preguntaequivalenciaModel.new PreguntaEquivalenciaFocusTraversalPolicy(this);
			
			//preguntaequivalenciaFocusTraversalPolicy.setpreguntaequivalenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(preguntaequivalenciaModel);
			
			
			this.jContentPaneDetallePreguntaEquivalencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePreguntaEquivalencia = new GridBagLayout();	
			this.jContentPaneDetallePreguntaEquivalencia.setLayout(gridaBagLayoutDetallePreguntaEquivalencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreguntaEquivalencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
					
				
				this.jContentPaneDetallePreguntaEquivalencia.add(jTtoolBarDetallePreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);								
				
}
			
			this.jScrollPanelDatosEdicionPreguntaEquivalencia=   new JScrollPane(jContentPaneDetallePreguntaEquivalencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPreguntaEquivalencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	        
			this.jContentPaneDetallePreguntaEquivalencia.add(jPanelCamposPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);
			
			
			
			
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
						&& preguntaequivalenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPreguntaEquivalencia= new GridBagConstraints();
						this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
						this.jContentPaneDetallePreguntaEquivalencia.add(this.jTabbedPaneRelacionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPreguntaEquivalencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPreguntaEquivalencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
					this.gridBagConstraintsPreguntaEquivalencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
					
				
					this.jContentPaneDetallePreguntaEquivalencia.add(jPanelCamposOcultosPreguntaEquivalencia, gridBagConstraintsPreguntaEquivalencia);
				
					this.jPanelCamposOcultosPreguntaEquivalencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	        this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePreguntaEquivalencia.add(this.jPanelAccionesFormularioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);							
			
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
	        this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
	        
			
			this.jContentPaneDetallePreguntaEquivalencia.add(this.jPanelAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPreguntaEquivalencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPreguntaEquivalencia=   new JScrollPane(this.jPanelCamposPreguntaEquivalencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreguntaEquivalencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEquivalencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEquivalencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
			this.gridBagConstraintsPreguntaEquivalencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPreguntaEquivalencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPreguntaEquivalencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);			
			
			this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
			
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		
			
		this.gridBagConstraintsPreguntaEquivalencia = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEquivalencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEquivalencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreguntaEquivalencia, this.gridBagConstraintsPreguntaEquivalencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPreguntaEquivalencia;//jContentPane;
		
		return jScrollPanelDatosEdicionPreguntaEquivalencia;
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
