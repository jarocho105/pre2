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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.PeriodoConstantesFunciones;

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
public class PeriodoDetalleFormJInternalFrame extends PeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePeriodo;
	
	protected JMenuBar jmenuBarDetallePeriodo;
	
	protected JMenu jmenuDetallePeriodo;
	protected JMenu jmenuDetalleArchivoPeriodo;
	protected JMenu jmenuDetalleAccionesPeriodo;
	protected JMenu jmenuDetalleDatosPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodo;	
	protected GridBagConstraints gridBagConstraintsPeriodo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PeriodoBeanSwingJInternalFrameAdditional jInternalFrameDetallePeriodo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstadoPeriodoBeanSwingJInternalFrame estadoperiodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoperiodo="";
	
	public PeriodoSessionBean periodoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstadoPeriodoSessionBean estadoperiodoSessionBean;	
	
	public PeriodoLogic periodoLogic;
	
	public JScrollPane jScrollPanelDatosPeriodo;
	public JScrollPane jScrollPanelDatosEdicionPeriodo;
	public JScrollPane jScrollPanelDatosGeneralPeriodo;
	
	protected JPanel jPanelCamposPeriodo;    
	protected JPanel jPanelCamposOcultosPeriodo;    	
	protected JPanel jPanelAccionesPeriodo;
	protected JPanel jPanelAccionesFormularioPeriodo;
    
	
	
	protected Integer iXPanelCamposPeriodo=0;
	protected Integer iYPanelCamposPeriodo=0;
	
	protected Integer iXPanelCamposOcultosPeriodo=0;
	protected Integer iYPanelCamposOcultosPeriodo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPeriodo;
	public JButton jButtonModificarPeriodo;
	public JButton jButtonActualizarPeriodo;
    public JButton jButtonEliminarPeriodo;
	public JButton jButtonCancelarPeriodo;
    public JButton jButtonGuardarCambiosPeriodo;
	public JButton jButtonGuardarCambiosTablaPeriodo;
	protected JButton jButtonCerrarPeriodo;
	
	
	protected JButton jButtonProcesarInformacionPeriodo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinMensajePeriodo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodo;
	protected JButton jButtonModificarToolBarPeriodo;
	protected JButton jButtonActualizarToolBarPeriodo;
    protected JButton jButtonEliminarToolBarPeriodo;
	protected JButton jButtonCancelarToolBarPeriodo;
    protected JButton jButtonGuardarCambiosToolBarPeriodo;
	protected JButton jButtonGuardarCambiosTablaToolBarPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodo;
	protected JButton jButtonCerrarToolBarPeriodo;
	
	protected JButton jButtonProcesarInformacionToolBarPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodo;
	protected JMenuItem jMenuItemModificarPeriodo;
	protected JMenuItem jMenuItemActualizarPeriodo;
    protected JMenuItem jMenuItemEliminarPeriodo;
	protected JMenuItem jMenuItemCancelarPeriodo;
    protected JMenuItem jMenuItemGuardarCambiosPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodo;
	protected JMenuItem jMenuItemCerrarPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodo;
	
	protected JMenuItem jMenuItemProcesarInformacionPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPeriodo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPeriodo;
	public JLabel jLabelIdPeriodo;
	public JLabel jLabelidPeriodo;
	public JButton jButtonidPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioPeriodo;
	public JLabel jLabelfecha_inicioPeriodo;
	//public JFormattedTextField jDateChooserfecha_inicioPeriodo;

	public JDateChooser jDateChooserfecha_inicioPeriodo;
	public JButton jButtonfecha_inicioPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finPeriodo;
	public JLabel jLabelfecha_finPeriodo;
	//public JFormattedTextField jDateChooserfecha_finPeriodo;

	public JDateChooser jDateChooserfecha_finPeriodo;
	public JButton jButtonfecha_finPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePeriodo;
	public JLabel jLabelnombrePeriodo;
	public JTextField jTextFieldnombrePeriodo;
	public JButton jButtonnombrePeriodoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPeriodo;
	public JLabel jLabeldescripcionPeriodo;
	public JTextArea jTextAreadescripcionPeriodo;
	public JScrollPane jscrollPanedescripcionPeriodo;
	public JButton jButtondescripcionPeriodoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPeriodo;
	public JLabel jLabelid_empresaPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPeriodo;
	public JButton jButtonid_empresaPeriodo= new JButtonMe();
	public JButton jButtonid_empresaPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPeriodo;
	public JLabel jLabelid_anioPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPeriodo;
	public JButton jButtonid_anioPeriodo= new JButtonMe();
	public JButton jButtonid_anioPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_anioPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPeriodo;
	public JLabel jLabelid_ejercicioPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPeriodo;
	public JButton jButtonid_ejercicioPeriodo= new JButtonMe();
	public JButton jButtonid_ejercicioPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPeriodo;
	public JLabel jLabelid_mesPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPeriodo;
	public JButton jButtonid_mesPeriodo= new JButtonMe();
	public JButton jButtonid_mesPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_mesPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_periodoPeriodo;
	public JLabel jLabelid_estado_periodoPeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_periodoPeriodo;
	public JButton jButtonid_estado_periodoPeriodo= new JButtonMe();
	public JButton jButtonid_estado_periodoPeriodoUpdate= new JButtonMe();
	public JButton jButtonid_estado_periodoPeriodoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPeriodo;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PeriodoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPeriodo=new JPanel();
				this.jPanelAccionesFormularioPeriodo=new JPanel();
				this.jmenuBarDetallePeriodo=new JMenuBar();
				this.jTtoolBarDetallePeriodo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PeriodoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Periodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPeriodo() {
		return this.jButtonActualizarToolBarPeriodo;
	}
	
	public JButton getjButtonEliminarToolBarPeriodo() {
		return this.jButtonEliminarToolBarPeriodo;
	}
	
	public JButton getjButtonCancelarToolBarPeriodo() {
		return this.jButtonCancelarToolBarPeriodo;
	}		
	
	public JButton getjButtonProcesarInformacionPeriodo() {
		return this.jButtonProcesarInformacionPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodo)	{
		this.jButtonProcesarInformacionPeriodo = jButtonProcesarInformacionPeriodo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodo() {
		return this.jComboBoxTiposAccionesPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodo(
			JComboBox jComboBoxTiposRelacionesPeriodo) {
		this.jComboBoxTiposRelacionesPeriodo = jComboBoxTiposRelacionesPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodo(
			JComboBox jComboBoxTiposAccionesPeriodo) {
		this.jComboBoxTiposAccionesPeriodo = jComboBoxTiposAccionesPeriodo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPeriodo() {
		return this.jComboBoxTiposAccionesFormularioPeriodo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPeriodo(
			JComboBox jComboBoxTiposAccionesFormularioPeriodo) {
		this.jComboBoxTiposAccionesFormularioPeriodo = jComboBoxTiposAccionesFormularioPeriodo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.periodoSessionBean=new PeriodoSessionBean();
		
		this.periodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periodoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
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
	
		PeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePeriodo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPeriodo=new JButtonMe();
				this.jButtonModificarToolBarPeriodo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPeriodo,this.jTtoolBarDetallePeriodo,
							"actualizar","actualizar","Actualizar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPeriodo,this.jTtoolBarDetallePeriodo,
							"eliminar","eliminar","Eliminar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPeriodo,this.jTtoolBarDetallePeriodo,
							"cancelar","cancelar","Cancelar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPeriodo,this.jTtoolBarDetallePeriodo,
							"guardarcambios","guardarcambios","Guardar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePeriodo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePeriodo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPeriodo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPeriodo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPeriodo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPeriodo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPeriodo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPeriodo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPeriodo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPeriodo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPeriodo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPeriodo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPeriodo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPeriodo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPeriodo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPeriodo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPeriodo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPeriodo.add(this.jMenuItemDetalleCerrarPeriodo);
		
		this.jmenuDetalleAccionesPeriodo.add(this.jMenuItemActualizarPeriodo);
		this.jmenuDetalleAccionesPeriodo.add(this.jMenuItemEliminarPeriodo);
		this.jmenuDetalleAccionesPeriodo.add(this.jMenuItemCancelarPeriodo);		
		
		//this.jmenuDetalleDatosPeriodo.add(this.jMenuItemDetalleAbrirOrderByPeriodo);				
		this.jmenuDetalleDatosPeriodo.add(this.jMenuItemDetalleMostarOcultarPeriodo);				
				
		//this.jmenuDetalleAccionesPeriodo.add(this.jMenuItemGuardarCambiosPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePeriodo.add(this.jmenuDetalleArchivoPeriodo);		
		this.jmenuBarDetallePeriodo.add(this.jmenuDetalleAccionesPeriodo);		
		this.jmenuBarDetallePeriodo.add(this.jmenuDetalleDatosPeriodo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePeriodo);				
	}
	
	
	public void inicializarElementosCamposPeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPeriodo = new JLabelMe();
		jLabelIdPeriodo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPeriodo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPeriodo= new GridBagLayout();

		this.jPanelidPeriodo.setLayout(this.gridaBagLayoutPeriodo);

		jLabelidPeriodo = new JLabel();
		jLabelidPeriodo.setText("Id");

		jLabelidPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioPeriodo = new JLabelMe();
		this.jLabelfecha_inicioPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioPeriodo.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelfecha_inicioPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		//jFormattedTextFieldfecha_inicioPeriodo= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioPeriodo= new JDateChooser();
		jDateChooserfecha_inicioPeriodo.setEnabled(false);
		jDateChooserfecha_inicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioPeriodo.setDate(new Date());
		jDateChooserfecha_inicioPeriodo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioPeriodo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioPeriodoBusqueda= new JButtonMe();
		this.jButtonfecha_inicioPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioPeriodoBusqueda.setText("U");
		this.jButtonfecha_inicioPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioPeriodoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finPeriodo = new JLabelMe();
		this.jLabelfecha_finPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finPeriodo.setToolTipText("Fecha Fin");
		this.jLabelfecha_finPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelfecha_finPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		//jFormattedTextFieldfecha_finPeriodo= new JFormattedTextFieldMe();

		jDateChooserfecha_finPeriodo= new JDateChooser();
		jDateChooserfecha_finPeriodo.setEnabled(false);
		jDateChooserfecha_finPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finPeriodo.setDate(new Date());
		jDateChooserfecha_finPeriodo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finPeriodo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finPeriodoBusqueda= new JButtonMe();
		this.jButtonfecha_finPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finPeriodoBusqueda.setText("U");
		this.jButtonfecha_finPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finPeriodoBusqueda.setVisible(false);		}


					
		this.jLabelnombrePeriodo = new JLabelMe();
		this.jLabelnombrePeriodo.setText(""+PeriodoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePeriodo.setToolTipText("Nombre");
		this.jLabelnombrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelnombrePeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jTextFieldnombrePeriodo= new JTextFieldMe();

		jTextFieldnombrePeriodo.setEnabled(false);
		jTextFieldnombrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombrePeriodoBusqueda= new JButtonMe();
		this.jButtonnombrePeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePeriodoBusqueda.setText("U");
		this.jButtonnombrePeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePeriodoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPeriodo = new JLabelMe();
		this.jLabeldescripcionPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPeriodo.setToolTipText("Descripcion");
		this.jLabeldescripcionPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPaneldescripcionPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jTextAreadescripcionPeriodo= new JTextAreaMe();
		jTextAreadescripcionPeriodo.setEnabled(false);
		jTextAreadescripcionPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPeriodo.setLineWrap(true);
		jTextAreadescripcionPeriodo.setWrapStyleWord(true);
		jTextAreadescripcionPeriodo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPeriodo.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPeriodo = new JScrollPane(jTextAreadescripcionPeriodo);
		jscrollPanedescripcionPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPeriodoBusqueda= new JButtonMe();
		this.jButtondescripcionPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPeriodoBusqueda.setText("U");
		this.jButtondescripcionPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPeriodoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPeriodo = new JLabelMe();
		this.jLabelid_empresaPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPeriodo.setToolTipText("Empresa");
		this.jLabelid_empresaPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelid_empresaPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jComboBoxid_empresaPeriodo= new JComboBoxMe();
		jComboBoxid_empresaPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPeriodo.setEnabled(false);

		this.jButtonid_empresaPeriodo= new JButtonMe();
		this.jButtonid_empresaPeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPeriodo.setText("Buscar");
		this.jButtonid_empresaPeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPeriodo"));

		this.jButtonid_empresaPeriodoBusqueda= new JButtonMe();
		this.jButtonid_empresaPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPeriodoBusqueda.setText("U");
		this.jButtonid_empresaPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPeriodoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPeriodoUpdate= new JButtonMe();
		this.jButtonid_empresaPeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPeriodoUpdate.setText("U");
		this.jButtonid_empresaPeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPeriodoUpdate"));



					
		this.jLabelid_anioPeriodo = new JLabelMe();
		this.jLabelid_anioPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPeriodo.setToolTipText("Anio");
		this.jLabelid_anioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelid_anioPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jComboBoxid_anioPeriodo= new JComboBoxMe();
		jComboBoxid_anioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioPeriodo= new JButtonMe();
		this.jButtonid_anioPeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodo.setText("Buscar");
		this.jButtonid_anioPeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodo"));

		this.jButtonid_anioPeriodoBusqueda= new JButtonMe();
		this.jButtonid_anioPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPeriodoBusqueda.setText("U");
		this.jButtonid_anioPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPeriodoBusqueda.setVisible(false);		}

		this.jButtonid_anioPeriodoUpdate= new JButtonMe();
		this.jButtonid_anioPeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPeriodoUpdate.setText("U");
		this.jButtonid_anioPeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoUpdate"));



					
		this.jLabelid_ejercicioPeriodo = new JLabelMe();
		this.jLabelid_ejercicioPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPeriodo.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelid_ejercicioPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jComboBoxid_ejercicioPeriodo= new JComboBoxMe();
		jComboBoxid_ejercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioPeriodo= new JButtonMe();
		this.jButtonid_ejercicioPeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPeriodo.setText("Buscar");
		this.jButtonid_ejercicioPeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPeriodo"));

		this.jButtonid_ejercicioPeriodoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPeriodoBusqueda.setText("U");
		this.jButtonid_ejercicioPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPeriodoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPeriodoUpdate= new JButtonMe();
		this.jButtonid_ejercicioPeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPeriodoUpdate.setText("U");
		this.jButtonid_ejercicioPeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPeriodoUpdate"));



					
		this.jLabelid_mesPeriodo = new JLabelMe();
		this.jLabelid_mesPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPeriodo.setToolTipText("Mes");
		this.jLabelid_mesPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelid_mesPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jComboBoxid_mesPeriodo= new JComboBoxMe();
		jComboBoxid_mesPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesPeriodo= new JButtonMe();
		this.jButtonid_mesPeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodo.setText("Buscar");
		this.jButtonid_mesPeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodo"));

		this.jButtonid_mesPeriodoBusqueda= new JButtonMe();
		this.jButtonid_mesPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPeriodoBusqueda.setText("U");
		this.jButtonid_mesPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPeriodoBusqueda.setVisible(false);		}

		this.jButtonid_mesPeriodoUpdate= new JButtonMe();
		this.jButtonid_mesPeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPeriodoUpdate.setText("U");
		this.jButtonid_mesPeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoUpdate"));



					
		this.jLabelid_estado_periodoPeriodo = new JLabelMe();
		this.jLabelid_estado_periodoPeriodo.setText(""+PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO+" : *");
		this.jLabelid_estado_periodoPeriodo.setToolTipText("Estado Periodo");
		this.jLabelid_estado_periodoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_periodoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_periodoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_periodoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_periodoPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_periodoPeriodo.setToolTipText(PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
		this.gridaBagLayoutPeriodo = new GridBagLayout();
		this.jPanelid_estado_periodoPeriodo.setLayout(this.gridaBagLayoutPeriodo);


		jComboBoxid_estado_periodoPeriodo= new JComboBoxMe();
		jComboBoxid_estado_periodoPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_periodoPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_periodoPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_periodoPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_periodoPeriodo= new JButtonMe();
		this.jButtonid_estado_periodoPeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_periodoPeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_periodoPeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_periodoPeriodo.setText("Buscar");
		this.jButtonid_estado_periodoPeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_periodoPeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_periodoPeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_periodoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_periodoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_periodoPeriodo"));

		this.jButtonid_estado_periodoPeriodoBusqueda= new JButtonMe();
		this.jButtonid_estado_periodoPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_periodoPeriodoBusqueda.setText("U");
		this.jButtonid_estado_periodoPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_periodoPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_periodoPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_periodoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_periodoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_periodoPeriodoBusqueda"));

		if(this.periodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_periodoPeriodoBusqueda.setVisible(false);		}

		this.jButtonid_estado_periodoPeriodoUpdate= new JButtonMe();
		this.jButtonid_estado_periodoPeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoPeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoPeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_periodoPeriodoUpdate.setText("U");
		this.jButtonid_estado_periodoPeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_periodoPeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_periodoPeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_periodoPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_periodoPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_periodoPeriodoUpdate"));



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
		//this.jInternalFrameDetallePeriodo = new PeriodoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Periodo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodo= new GridBagLayout();
		

		
		String sToolTipPeriodo="";
		sToolTipPeriodo=PeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodo+="(Contabilidad.Periodo)";
		}
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPeriodo = new JButtonMe();
		this.jButtonModificarPeriodo = new JButtonMe();
        this.jButtonActualizarPeriodo = new JButtonMe();
        this.jButtonEliminarPeriodo = new JButtonMe();
        this.jButtonCancelarPeriodo = new JButtonMe();
        this.jButtonGuardarCambiosPeriodo = new JButtonMe();
		this.jButtonGuardarCambiosTablaPeriodo = new JButtonMe();
		this.jButtonCerrarPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosPeriodo = new JScrollPane();   
        this.jScrollPanelDatosEdicionPeriodo = new JScrollPane();
		this.jScrollPanelDatosGeneralPeriodo = new JScrollPane();
				
		
		
		this.jPanelCamposPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo";
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPeriodo.setName("jPanelCamposPeriodo"); 

		this.jPanelCamposOcultosPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPeriodo.setName("jPanelCamposOcultosPeriodo"); 

        this.jPanelAccionesPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesPeriodo.setName("Acciones"); 

		this.jPanelAccionesFormularioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPeriodo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPeriodo.setText("Nuevo");
		this.jButtonModificarPeriodo.setText("Editar");
        this.jButtonActualizarPeriodo.setText("Actualizar");
        this.jButtonEliminarPeriodo.setText("Eliminar");
        this.jButtonCancelarPeriodo.setText("Cancelar");
        this.jButtonGuardarCambiosPeriodo.setText("Guardar");
		this.jButtonGuardarCambiosTablaPeriodo.setText("Guardar");
		this.jButtonCerrarPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodo,"nuevo_button","Nuevo",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPeriodo,"modificar_button","Editar",this.periodoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPeriodo,"actualizar_button","Actualizar",this.periodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPeriodo,"eliminar_button","Eliminar",this.periodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPeriodo,"cancelar_button","Cancelar",this.periodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPeriodo,"guardarcambios_button","Guardar",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodo,"guardarcambiostabla_button","Guardar",this.periodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodo,"cerrar_button","Salir",this.periodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPeriodo.setToolTipText("Nuevo"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPeriodo.setToolTipText("Editar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPeriodo.setToolTipText("Actualizar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPeriodo.setToolTipText("Eliminar)"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPeriodo.setToolTipText("Cancelar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPeriodo.setToolTipText("Guardar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPeriodo.setToolTipText("Guardar"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodo.setToolTipText("Salir"+" "+PeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodo";
		inputMap = this.jButtonNuevoPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPeriodo";
		inputMap = this.jButtonActualizarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPeriodo"));
		
		//ELIMINAR
		sMapKey = "EliminarPeriodo";
		inputMap = this.jButtonEliminarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPeriodo"));
		
		//CANCELAR	
		sMapKey = "CancelarPeriodo";
		inputMap = this.jButtonCancelarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPeriodo"));
		
		//CERRAR		
		sMapKey = "CerrarPeriodo";
		inputMap = this.jButtonCerrarPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPeriodo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPeriodo.setToolTipText("Nuevo Periodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPeriodo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPeriodo.setToolTipText("Sin Cerrar Ventana Periodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePeriodo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePeriodo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesPeriodo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPeriodo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPeriodo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPeriodo = new JLabelMe();
		
		this.jLabelAccionesPeriodo.setText("Acciones");		
		this.jLabelAccionesPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPeriodo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPeriodo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPeriodo=new JTabbedPane();
		this.jTabbedPaneRelacionesPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPeriodo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPeriodo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPeriodo = new GridBagLayout();
		
		this.jPanelCamposPeriodo.setLayout(gridaBagLayoutCamposPeriodo);
		this.jPanelCamposOcultosPeriodo.setLayout(gridaBagLayoutCamposOcultosPeriodo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPeriodo.add(jLabelIdPeriodo, this.gridBagConstraintsPeriodo);



	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPeriodo.add(jLabelidPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPeriodo.add(jLabelid_empresaPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPeriodo.add(jButtonid_empresaPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 3;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPeriodo.add(jButtonid_empresaPeriodoUpdate, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPeriodo.add(jComboBoxid_empresaPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPeriodo.add(jLabelid_anioPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPeriodo.add(jButtonid_anioPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 3;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPeriodo.add(jButtonid_anioPeriodoUpdate, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPeriodo.add(jComboBoxid_anioPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPeriodo.add(jLabelid_ejercicioPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPeriodo.add(jButtonid_ejercicioPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 3;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPeriodo.add(jButtonid_ejercicioPeriodoUpdate, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPeriodo.add(jComboBoxid_ejercicioPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPeriodo.add(jLabelid_mesPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPeriodo.add(jButtonid_mesPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 3;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPeriodo.add(jButtonid_mesPeriodoUpdate, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPeriodo.add(jComboBoxid_mesPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioPeriodo.add(jLabelfecha_inicioPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioPeriodo.add(jButtonfecha_inicioPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioPeriodo.add(jDateChooserfecha_inicioPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finPeriodo.add(jLabelfecha_finPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finPeriodo.add(jButtonfecha_finPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finPeriodo.add(jDateChooserfecha_finPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePeriodo.add(jLabelnombrePeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePeriodo.add(jButtonnombrePeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePeriodo.add(jTextFieldnombrePeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPeriodo.add(jLabeldescripcionPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPeriodo.add(jButtondescripcionPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPeriodo.add(jscrollPanedescripcionPeriodo, this.gridBagConstraintsPeriodo);


	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 0;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_periodoPeriodo.add(jLabelid_estado_periodoPeriodo, this.gridBagConstraintsPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 2;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_periodoPeriodo.add(jButtonid_estado_periodoPeriodoBusqueda, this.gridBagConstraintsPeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = 3;
		this.gridBagConstraintsPeriodo.ipadx = 0;
		this.gridBagConstraintsPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_periodoPeriodo.add(jButtonid_estado_periodoPeriodoUpdate, this.gridBagConstraintsPeriodo);
	}

	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodo.gridy = 0;
	this.gridBagConstraintsPeriodo.gridx = 1;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_periodoPeriodo.add(jComboBoxid_estado_periodoPeriodo, this.gridBagConstraintsPeriodo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelidPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelid_anioPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelid_ejercicioPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelid_mesPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelfecha_inicioPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelfecha_finPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelnombrePeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPaneldescripcionPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodo.add(this.jPanelid_estado_periodoPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposPeriodo % 1==0) {
		iXPanelCamposPeriodo=0;
		iYPanelCamposPeriodo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPeriodo = new GridBagConstraints();
	this.gridBagConstraintsPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodo.gridy = iYPanelCamposOcultosPeriodo;
	this.gridBagConstraintsPeriodo.gridx = iXPanelCamposOcultosPeriodo++;
	this.gridBagConstraintsPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPeriodo.add(this.jPanelid_empresaPeriodo, this.gridBagConstraintsPeriodo);



	if(iXPanelCamposOcultosPeriodo % 1==0) {
		iXPanelCamposOcultosPeriodo=0;
		iYPanelCamposOcultosPeriodo++;
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
			
		GridBagLayout gridaBagLayoutAccionesPeriodo= new GridBagLayout();
		this.jPanelAccionesPeriodo.setLayout(gridaBagLayoutAccionesPeriodo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPeriodo= new GridBagLayout();
		this.jPanelAccionesFormularioPeriodo.setLayout(gridaBagLayoutAccionesFormularioPeriodo);
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodo.add(this.jComboBoxTiposAccionesFormularioPeriodo, this.gridBagConstraintsPeriodo);

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodo.add(this.jCheckBoxPostAccionNuevoPeriodo, this.gridBagConstraintsPeriodo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.periodoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodo.add(this.jCheckBoxPostAccionSinCerrarPeriodo, this.gridBagConstraintsPeriodo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.periodoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.periodoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodo.add(this.jCheckBoxPostAccionSinMensajePeriodo, this.gridBagConstraintsPeriodo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx = iPosXAccion++;
			
		this.jPanelAccionesPeriodo.add(this.jButtonModificarPeriodo, this.gridBagConstraintsPeriodo);							

		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodo.gridy = 0;
		this.gridBagConstraintsPeriodo.gridx =iPosXAccion++;
			
		this.jPanelAccionesPeriodo.add(this.jButtonEliminarPeriodo, this.gridBagConstraintsPeriodo);
		
			
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = 0;		
		this.gridBagConstraintsPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodo.add(this.jButtonActualizarPeriodo, this.gridBagConstraintsPeriodo);


		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = 0;		
		this.gridBagConstraintsPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodo.add(this.jButtonGuardarCambiosPeriodo, this.gridBagConstraintsPeriodo);	
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = 0;		
		this.gridBagConstraintsPeriodo.gridx =iPosXAccion++;
		
		this.jPanelAccionesPeriodo.add(this.jButtonCancelarPeriodo, this.gridBagConstraintsPeriodo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodo.gridx = 0;		
			//this.gridBagConstraintsPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodo.gridx =0;
		this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodo, this.gridBagConstraintsPeriodo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PeriodoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePeriodo = new PeriodoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Periodo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Periodo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PeriodoModel periodoModel=new PeriodoModel(this);
			
			//SI USARA CLASE INTERNA
			//PeriodoModel.PeriodoFocusTraversalPolicy periodoFocusTraversalPolicy = periodoModel.new PeriodoFocusTraversalPolicy(this);
			
			//periodoFocusTraversalPolicy.setperiodoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(periodoModel);
			
			
			this.jContentPaneDetallePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePeriodo = new GridBagLayout();	
			this.jContentPaneDetallePeriodo.setLayout(gridaBagLayoutDetallePeriodo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPeriodo = new GridBagConstraints();
				this.gridBagConstraintsPeriodo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPeriodo.gridx = 0;
					
				
				this.jContentPaneDetallePeriodo.add(jTtoolBarDetallePeriodo, gridBagConstraintsPeriodo);								
				
}
			
			this.jScrollPanelDatosEdicionPeriodo=   new JScrollPane(jContentPaneDetallePeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPeriodo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPeriodo.gridx = 0;
	        
			this.jContentPaneDetallePeriodo.add(jPanelCamposPeriodo, gridBagConstraintsPeriodo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& periodoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.periodoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPeriodo= new GridBagConstraints();
						this.gridBagConstraintsPeriodo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPeriodo.gridx = 0;
						this.jContentPaneDetallePeriodo.add(this.jTabbedPaneRelacionesPeriodo, this.gridBagConstraintsPeriodo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPeriodo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPeriodo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPeriodo = new GridBagConstraints();
					this.gridBagConstraintsPeriodo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPeriodo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPeriodo.gridx = 0;
					
				
					this.jContentPaneDetallePeriodo.add(jPanelCamposOcultosPeriodo, gridBagConstraintsPeriodo);
				
					this.jPanelCamposOcultosPeriodo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPeriodo.gridx = 0;
	        this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePeriodo.add(this.jPanelAccionesFormularioPeriodo, this.gridBagConstraintsPeriodo);							
			
			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
	        this.gridBagConstraintsPeriodo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPeriodo.gridx = 0;
	        
			
			this.jContentPaneDetallePeriodo.add(this.jPanelAccionesPeriodo, this.gridBagConstraintsPeriodo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPeriodo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPeriodo=   new JScrollPane(this.jPanelCamposPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPeriodo.gridx = 0;
			this.gridBagConstraintsPeriodo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPeriodo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPeriodo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPeriodo, this.gridBagConstraintsPeriodo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPeriodo, this.gridBagConstraintsPeriodo);			
			
			this.gridBagConstraintsPeriodo = new GridBagConstraints();
			this.gridBagConstraintsPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPeriodo, this.gridBagConstraintsPeriodo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodo, this.gridBagConstraintsPeriodo);
			
			
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodo, this.gridBagConstraintsPeriodo);
		
			
		this.gridBagConstraintsPeriodo = new GridBagConstraints();
		this.gridBagConstraintsPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodo, this.gridBagConstraintsPeriodo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPeriodo;//jContentPane;
		
		return jScrollPanelDatosEdicionPeriodo;
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
