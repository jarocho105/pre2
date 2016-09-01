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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.PeriodoAsistenciaConstantesFunciones;

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
public class PeriodoAsistenciaDetalleFormJInternalFrame extends PeriodoAsistenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePeriodoAsistencia;
	
	protected JMenuBar jmenuBarDetallePeriodoAsistencia;
	
	protected JMenu jmenuDetallePeriodoAsistencia;
	protected JMenu jmenuDetalleArchivoPeriodoAsistencia;
	protected JMenu jmenuDetalleAccionesPeriodoAsistencia;
	protected JMenu jmenuDetalleDatosPeriodoAsistencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodoAsistencia;	
	protected GridBagConstraints gridBagConstraintsPeriodoAsistencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PeriodoAsistenciaBeanSwingJInternalFrameAdditional jInternalFrameDetallePeriodoAsistencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public PeriodoAsistenciaSessionBean periodoasistenciaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;	
	
	public PeriodoAsistenciaLogic periodoasistenciaLogic;
	
	public JScrollPane jScrollPanelDatosPeriodoAsistencia;
	public JScrollPane jScrollPanelDatosEdicionPeriodoAsistencia;
	public JScrollPane jScrollPanelDatosGeneralPeriodoAsistencia;
	
	protected JPanel jPanelCamposPeriodoAsistencia;    
	protected JPanel jPanelCamposOcultosPeriodoAsistencia;    	
	protected JPanel jPanelAccionesPeriodoAsistencia;
	protected JPanel jPanelAccionesFormularioPeriodoAsistencia;
    
	
	
	protected Integer iXPanelCamposPeriodoAsistencia=0;
	protected Integer iYPanelCamposPeriodoAsistencia=0;
	
	protected Integer iXPanelCamposOcultosPeriodoAsistencia=0;
	protected Integer iYPanelCamposOcultosPeriodoAsistencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPeriodoAsistencia;
	public JButton jButtonModificarPeriodoAsistencia;
	public JButton jButtonActualizarPeriodoAsistencia;
    public JButton jButtonEliminarPeriodoAsistencia;
	public JButton jButtonCancelarPeriodoAsistencia;
    public JButton jButtonGuardarCambiosPeriodoAsistencia;
	public JButton jButtonGuardarCambiosTablaPeriodoAsistencia;
	protected JButton jButtonCerrarPeriodoAsistencia;
	
	
	protected JButton jButtonProcesarInformacionPeriodoAsistencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPeriodoAsistencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPeriodoAsistencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajePeriodoAsistencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodoAsistencia;
	protected JButton jButtonModificarToolBarPeriodoAsistencia;
	protected JButton jButtonActualizarToolBarPeriodoAsistencia;
    protected JButton jButtonEliminarToolBarPeriodoAsistencia;
	protected JButton jButtonCancelarToolBarPeriodoAsistencia;
    protected JButton jButtonGuardarCambiosToolBarPeriodoAsistencia;
	protected JButton jButtonGuardarCambiosTablaToolBarPeriodoAsistencia;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodoAsistencia;
	protected JButton jButtonCerrarToolBarPeriodoAsistencia;
	
	protected JButton jButtonProcesarInformacionToolBarPeriodoAsistencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodoAsistencia;
	protected JMenuItem jMenuItemModificarPeriodoAsistencia;
	protected JMenuItem jMenuItemActualizarPeriodoAsistencia;
    protected JMenuItem jMenuItemEliminarPeriodoAsistencia;
	protected JMenuItem jMenuItemCancelarPeriodoAsistencia;
    protected JMenuItem jMenuItemGuardarCambiosPeriodoAsistencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodoAsistencia;
	protected JMenuItem jMenuItemCerrarPeriodoAsistencia;
	protected JMenuItem jMenuItemDetalleCerrarPeriodoAsistencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodoAsistencia;
	
	protected JMenuItem jMenuItemProcesarInformacionPeriodoAsistencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodoAsistencia;
	protected JMenuItem jMenuItemMostrarOcultarPeriodoAsistencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodoAsistencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodoAsistencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPeriodoAsistencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPeriodoAsistencia;
	public JLabel jLabelIdPeriodoAsistencia;
	public JLabel jLabelidPeriodoAsistencia;
	public JButton jButtonidPeriodoAsistenciaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioPeriodoAsistencia;
	public JLabel jLabelfecha_inicioPeriodoAsistencia;
	//public JFormattedTextField jDateChooserfecha_inicioPeriodoAsistencia;

	public JDateChooser jDateChooserfecha_inicioPeriodoAsistencia;
	public JButton jButtonfecha_inicioPeriodoAsistenciaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finPeriodoAsistencia;
	public JLabel jLabelfecha_finPeriodoAsistencia;
	//public JFormattedTextField jDateChooserfecha_finPeriodoAsistencia;

	public JDateChooser jDateChooserfecha_finPeriodoAsistencia;
	public JButton jButtonfecha_finPeriodoAsistenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPeriodoAsistencia;
	public JLabel jLabelid_empresaPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPeriodoAsistencia;
	public JButton jButtonid_empresaPeriodoAsistencia= new JButtonMe();
	public JButton jButtonid_empresaPeriodoAsistenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaPeriodoAsistenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPeriodoAsistencia;
	public JLabel jLabelid_ejercicioPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPeriodoAsistencia;
	public JButton jButtonid_ejercicioPeriodoAsistencia= new JButtonMe();
	public JButton jButtonid_ejercicioPeriodoAsistenciaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPeriodoAsistenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPeriodoAsistencia;
	public JLabel jLabelid_periodoPeriodoAsistencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPeriodoAsistencia;
	public JButton jButtonid_periodoPeriodoAsistencia= new JButtonMe();
	public JButton jButtonid_periodoPeriodoAsistenciaUpdate= new JButtonMe();
	public JButton jButtonid_periodoPeriodoAsistenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPeriodoAsistencia;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PeriodoAsistenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPeriodoAsistencia=new JPanel();
				this.jPanelAccionesFormularioPeriodoAsistencia=new JPanel();
				this.jmenuBarDetallePeriodoAsistencia=new JMenuBar();
				this.jTtoolBarDetallePeriodoAsistencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PeriodoAsistenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoAsistenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PeriodoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPeriodoAsistencia() {
		return this.jButtonActualizarToolBarPeriodoAsistencia;
	}
	
	public JButton getjButtonEliminarToolBarPeriodoAsistencia() {
		return this.jButtonEliminarToolBarPeriodoAsistencia;
	}
	
	public JButton getjButtonCancelarToolBarPeriodoAsistencia() {
		return this.jButtonCancelarToolBarPeriodoAsistencia;
	}		
	
	public JButton getjButtonProcesarInformacionPeriodoAsistencia() {
		return this.jButtonProcesarInformacionPeriodoAsistencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodoAsistencia)	{
		this.jButtonProcesarInformacionPeriodoAsistencia = jButtonProcesarInformacionPeriodoAsistencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodoAsistencia() {
		return this.jComboBoxTiposAccionesPeriodoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodoAsistencia(
			JComboBox jComboBoxTiposRelacionesPeriodoAsistencia) {
		this.jComboBoxTiposRelacionesPeriodoAsistencia = jComboBoxTiposRelacionesPeriodoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodoAsistencia(
			JComboBox jComboBoxTiposAccionesPeriodoAsistencia) {
		this.jComboBoxTiposAccionesPeriodoAsistencia = jComboBoxTiposAccionesPeriodoAsistencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPeriodoAsistencia() {
		return this.jComboBoxTiposAccionesFormularioPeriodoAsistencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPeriodoAsistencia(
			JComboBox jComboBoxTiposAccionesFormularioPeriodoAsistencia) {
		this.jComboBoxTiposAccionesFormularioPeriodoAsistencia = jComboBoxTiposAccionesFormularioPeriodoAsistencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
		
		this.periodoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periodoasistenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoAsistenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo Asistencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		PeriodoAsistenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePeriodoAsistencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPeriodoAsistencia=new JButtonMe();
				this.jButtonModificarToolBarPeriodoAsistencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPeriodoAsistencia,this.jTtoolBarDetallePeriodoAsistencia,
							"actualizar","actualizar","Actualizar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPeriodoAsistencia,this.jTtoolBarDetallePeriodoAsistencia,
							"eliminar","eliminar","Eliminar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPeriodoAsistencia,this.jTtoolBarDetallePeriodoAsistencia,
							"cancelar","cancelar","Cancelar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPeriodoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPeriodoAsistencia,this.jTtoolBarDetallePeriodoAsistencia,
							"guardarcambios","guardarcambios","Guardar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePeriodoAsistencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePeriodoAsistencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPeriodoAsistencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPeriodoAsistencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPeriodoAsistencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodoAsistencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodoAsistencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodoAsistencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPeriodoAsistencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPeriodoAsistencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPeriodoAsistencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPeriodoAsistencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPeriodoAsistencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPeriodoAsistencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPeriodoAsistencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPeriodoAsistencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPeriodoAsistencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPeriodoAsistencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPeriodoAsistencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPeriodoAsistencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPeriodoAsistencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodoAsistencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodoAsistencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodoAsistencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodoAsistencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodoAsistencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPeriodoAsistencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPeriodoAsistencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPeriodoAsistencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPeriodoAsistencia.add(this.jMenuItemDetalleCerrarPeriodoAsistencia);
		
		this.jmenuDetalleAccionesPeriodoAsistencia.add(this.jMenuItemActualizarPeriodoAsistencia);
		this.jmenuDetalleAccionesPeriodoAsistencia.add(this.jMenuItemEliminarPeriodoAsistencia);
		this.jmenuDetalleAccionesPeriodoAsistencia.add(this.jMenuItemCancelarPeriodoAsistencia);		
		
		//this.jmenuDetalleDatosPeriodoAsistencia.add(this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia);				
		this.jmenuDetalleDatosPeriodoAsistencia.add(this.jMenuItemDetalleMostarOcultarPeriodoAsistencia);				
				
		//this.jmenuDetalleAccionesPeriodoAsistencia.add(this.jMenuItemGuardarCambiosPeriodoAsistencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePeriodoAsistencia.add(this.jmenuDetalleArchivoPeriodoAsistencia);		
		this.jmenuBarDetallePeriodoAsistencia.add(this.jmenuDetalleAccionesPeriodoAsistencia);		
		this.jmenuBarDetallePeriodoAsistencia.add(this.jmenuDetalleDatosPeriodoAsistencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePeriodoAsistencia);				
	}
	
	
	public void inicializarElementosCamposPeriodoAsistencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPeriodoAsistencia = new JLabelMe();
		jLabelIdPeriodoAsistencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPeriodoAsistencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPeriodoAsistencia.setToolTipText(PeriodoAsistenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPeriodoAsistencia= new GridBagLayout();

		this.jPanelidPeriodoAsistencia.setLayout(this.gridaBagLayoutPeriodoAsistencia);

		jLabelidPeriodoAsistencia = new JLabel();
		jLabelidPeriodoAsistencia.setText("Id");

		jLabelidPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioPeriodoAsistencia = new JLabelMe();
		this.jLabelfecha_inicioPeriodoAsistencia.setText(""+PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioPeriodoAsistencia.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioPeriodoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioPeriodoAsistencia.setToolTipText(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		this.jPanelfecha_inicioPeriodoAsistencia.setLayout(this.gridaBagLayoutPeriodoAsistencia);


		//jFormattedTextFieldfecha_inicioPeriodoAsistencia= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioPeriodoAsistencia= new JDateChooser();
		jDateChooserfecha_inicioPeriodoAsistencia.setEnabled(false);
		jDateChooserfecha_inicioPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioPeriodoAsistencia.setDate(new Date());
		jDateChooserfecha_inicioPeriodoAsistencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioPeriodoAsistencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setText("U");
		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioPeriodoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioPeriodoAsistenciaBusqueda"));

		if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioPeriodoAsistenciaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finPeriodoAsistencia = new JLabelMe();
		this.jLabelfecha_finPeriodoAsistencia.setText(""+PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finPeriodoAsistencia.setToolTipText("Fecha Fin");
		this.jLabelfecha_finPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finPeriodoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finPeriodoAsistencia.setToolTipText(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		this.jPanelfecha_finPeriodoAsistencia.setLayout(this.gridaBagLayoutPeriodoAsistencia);


		//jFormattedTextFieldfecha_finPeriodoAsistencia= new JFormattedTextFieldMe();

		jDateChooserfecha_finPeriodoAsistencia= new JDateChooser();
		jDateChooserfecha_finPeriodoAsistencia.setEnabled(false);
		jDateChooserfecha_finPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finPeriodoAsistencia.setDate(new Date());
		jDateChooserfecha_finPeriodoAsistencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finPeriodoAsistencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finPeriodoAsistenciaBusqueda= new JButtonMe();
		this.jButtonfecha_finPeriodoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPeriodoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPeriodoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finPeriodoAsistenciaBusqueda.setText("U");
		this.jButtonfecha_finPeriodoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finPeriodoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finPeriodoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finPeriodoAsistenciaBusqueda"));

		if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finPeriodoAsistenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPeriodoAsistencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPeriodoAsistencia = new JLabelMe();
		this.jLabelid_empresaPeriodoAsistencia.setText(""+PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPeriodoAsistencia.setToolTipText("Empresa");
		this.jLabelid_empresaPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPeriodoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPeriodoAsistencia.setToolTipText(PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		this.jPanelid_empresaPeriodoAsistencia.setLayout(this.gridaBagLayoutPeriodoAsistencia);


		jComboBoxid_empresaPeriodoAsistencia= new JComboBoxMe();
		jComboBoxid_empresaPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPeriodoAsistencia.setEnabled(false);

		this.jButtonid_empresaPeriodoAsistencia= new JButtonMe();
		this.jButtonid_empresaPeriodoAsistencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPeriodoAsistencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPeriodoAsistencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPeriodoAsistencia.setText("Buscar");
		this.jButtonid_empresaPeriodoAsistencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPeriodoAsistencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPeriodoAsistencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPeriodoAsistencia"));

		this.jButtonid_empresaPeriodoAsistenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaPeriodoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPeriodoAsistenciaBusqueda.setText("U");
		this.jButtonid_empresaPeriodoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPeriodoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPeriodoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPeriodoAsistenciaBusqueda"));

		if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPeriodoAsistenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaPeriodoAsistenciaUpdate= new JButtonMe();
		this.jButtonid_empresaPeriodoAsistenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoAsistenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPeriodoAsistenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPeriodoAsistenciaUpdate.setText("U");
		this.jButtonid_empresaPeriodoAsistenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPeriodoAsistenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPeriodoAsistenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPeriodoAsistenciaUpdate"));



					
		this.jLabelid_ejercicioPeriodoAsistencia = new JLabelMe();
		this.jLabelid_ejercicioPeriodoAsistencia.setText(""+PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPeriodoAsistencia.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPeriodoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPeriodoAsistencia.setToolTipText(PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		this.jPanelid_ejercicioPeriodoAsistencia.setLayout(this.gridaBagLayoutPeriodoAsistencia);


		jComboBoxid_ejercicioPeriodoAsistencia= new JComboBoxMe();
		jComboBoxid_ejercicioPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPeriodoAsistencia.setEnabled(false);

		this.jButtonid_ejercicioPeriodoAsistencia= new JButtonMe();
		this.jButtonid_ejercicioPeriodoAsistencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPeriodoAsistencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPeriodoAsistencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPeriodoAsistencia.setText("Buscar");
		this.jButtonid_ejercicioPeriodoAsistencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPeriodoAsistencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPeriodoAsistencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPeriodoAsistencia"));

		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setText("U");
		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPeriodoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPeriodoAsistenciaBusqueda"));

		if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPeriodoAsistenciaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPeriodoAsistenciaUpdate= new JButtonMe();
		this.jButtonid_ejercicioPeriodoAsistenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoAsistenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPeriodoAsistenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPeriodoAsistenciaUpdate.setText("U");
		this.jButtonid_ejercicioPeriodoAsistenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPeriodoAsistenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPeriodoAsistenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPeriodoAsistenciaUpdate"));



					
		this.jLabelid_periodoPeriodoAsistencia = new JLabelMe();
		this.jLabelid_periodoPeriodoAsistencia.setText(""+PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPeriodoAsistencia.setToolTipText("Periodo");
		this.jLabelid_periodoPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPeriodoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPeriodoAsistencia.setToolTipText(PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		this.jPanelid_periodoPeriodoAsistencia.setLayout(this.gridaBagLayoutPeriodoAsistencia);


		jComboBoxid_periodoPeriodoAsistencia= new JComboBoxMe();
		jComboBoxid_periodoPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPeriodoAsistencia.setEnabled(false);

		this.jButtonid_periodoPeriodoAsistencia= new JButtonMe();
		this.jButtonid_periodoPeriodoAsistencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPeriodoAsistencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPeriodoAsistencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPeriodoAsistencia.setText("Buscar");
		this.jButtonid_periodoPeriodoAsistencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPeriodoAsistencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPeriodoAsistencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPeriodoAsistencia"));

		this.jButtonid_periodoPeriodoAsistenciaBusqueda= new JButtonMe();
		this.jButtonid_periodoPeriodoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPeriodoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPeriodoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPeriodoAsistenciaBusqueda.setText("U");
		this.jButtonid_periodoPeriodoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPeriodoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPeriodoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPeriodoAsistenciaBusqueda"));

		if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPeriodoAsistenciaBusqueda.setVisible(false);		}

		this.jButtonid_periodoPeriodoAsistenciaUpdate= new JButtonMe();
		this.jButtonid_periodoPeriodoAsistenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPeriodoAsistenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPeriodoAsistenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPeriodoAsistenciaUpdate.setText("U");
		this.jButtonid_periodoPeriodoAsistenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPeriodoAsistenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPeriodoAsistenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPeriodoAsistenciaUpdate"));



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
		//this.jInternalFrameDetallePeriodoAsistencia = new PeriodoAsistenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Periodo Asistencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodoAsistencia= new GridBagLayout();
		

		
		String sToolTipPeriodoAsistencia="";
		sToolTipPeriodoAsistencia=PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodoAsistencia+="(Nomina.PeriodoAsistencia)";
		}
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodoAsistencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPeriodoAsistencia = new JButtonMe();
		this.jButtonModificarPeriodoAsistencia = new JButtonMe();
        this.jButtonActualizarPeriodoAsistencia = new JButtonMe();
        this.jButtonEliminarPeriodoAsistencia = new JButtonMe();
        this.jButtonCancelarPeriodoAsistencia = new JButtonMe();
        this.jButtonGuardarCambiosPeriodoAsistencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaPeriodoAsistencia = new JButtonMe();
		this.jButtonCerrarPeriodoAsistencia = new JButtonMe();
		
		this.jScrollPanelDatosPeriodoAsistencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionPeriodoAsistencia = new JScrollPane();
		this.jScrollPanelDatosGeneralPeriodoAsistencia = new JScrollPane();
				
		
		
		this.jPanelCamposPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo Asistencia";
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Asistencias" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodoAsistencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPeriodoAsistencia.setName("jPanelCamposPeriodoAsistencia"); 

		this.jPanelCamposOcultosPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPeriodoAsistencia.setName("jPanelCamposOcultosPeriodoAsistencia"); 

        this.jPanelAccionesPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodoAsistencia.setToolTipText("Acciones");
        this.jPanelAccionesPeriodoAsistencia.setName("Acciones"); 

		this.jPanelAccionesFormularioPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPeriodoAsistencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPeriodoAsistencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPeriodoAsistencia.setText("Nuevo");
		this.jButtonModificarPeriodoAsistencia.setText("Editar");
        this.jButtonActualizarPeriodoAsistencia.setText("Actualizar");
        this.jButtonEliminarPeriodoAsistencia.setText("Eliminar");
        this.jButtonCancelarPeriodoAsistencia.setText("Cancelar");
        this.jButtonGuardarCambiosPeriodoAsistencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.setText("Guardar");
		this.jButtonCerrarPeriodoAsistencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodoAsistencia,"nuevo_button","Nuevo",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPeriodoAsistencia,"modificar_button","Editar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPeriodoAsistencia,"actualizar_button","Actualizar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPeriodoAsistencia,"eliminar_button","Eliminar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPeriodoAsistencia,"cancelar_button","Cancelar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPeriodoAsistencia,"guardarcambios_button","Guardar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodoAsistencia,"guardarcambiostabla_button","Guardar",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodoAsistencia,"cerrar_button","Salir",this.periodoasistenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPeriodoAsistencia.setToolTipText("Nuevo"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPeriodoAsistencia.setToolTipText("Editar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPeriodoAsistencia.setToolTipText("Actualizar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPeriodoAsistencia.setToolTipText("Eliminar)"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPeriodoAsistencia.setToolTipText("Cancelar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPeriodoAsistencia.setToolTipText("Guardar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.setToolTipText("Guardar"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodoAsistencia.setToolTipText("Salir"+" "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodoAsistencia";
		inputMap = this.jButtonNuevoPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodoAsistencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPeriodoAsistencia";
		inputMap = this.jButtonActualizarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPeriodoAsistencia"));
		
		//ELIMINAR
		sMapKey = "EliminarPeriodoAsistencia";
		inputMap = this.jButtonEliminarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPeriodoAsistencia"));
		
		//CANCELAR	
		sMapKey = "CancelarPeriodoAsistencia";
		inputMap = this.jButtonCancelarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPeriodoAsistencia"));
		
		//CERRAR		
		sMapKey = "CerrarPeriodoAsistencia";
		inputMap = this.jButtonCerrarPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodoAsistencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodoAsistencia";
		inputMap = this.jButtonGuardarCambiosTablaPeriodoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodoAsistencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPeriodoAsistencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPeriodoAsistencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPeriodoAsistencia.setToolTipText("Nuevo PeriodoAsistencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPeriodoAsistencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPeriodoAsistencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPeriodoAsistencia.setToolTipText("Sin Cerrar Ventana PeriodoAsistencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePeriodoAsistencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePeriodoAsistencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePeriodoAsistencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodoAsistencia.setText("Accion");
		this.jComboBoxTiposAccionesPeriodoAsistencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPeriodoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPeriodoAsistencia = new JLabelMe();
		
		this.jLabelAccionesPeriodoAsistencia.setText("Acciones");		
		this.jLabelAccionesPeriodoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPeriodoAsistencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPeriodoAsistencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPeriodoAsistencia=new JTabbedPane();
		this.jTabbedPaneRelacionesPeriodoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPeriodoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPeriodoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPeriodoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPeriodoAsistencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPeriodoAsistencia = new GridBagLayout();
		
		this.jPanelCamposPeriodoAsistencia.setLayout(gridaBagLayoutCamposPeriodoAsistencia);
		this.jPanelCamposOcultosPeriodoAsistencia.setLayout(gridaBagLayoutCamposOcultosPeriodoAsistencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPeriodoAsistencia.add(jLabelIdPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 1;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPeriodoAsistencia.add(jLabelidPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPeriodoAsistencia.add(jLabelid_empresaPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 2;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPeriodoAsistencia.add(jButtonid_empresaPeriodoAsistenciaBusqueda, this.gridBagConstraintsPeriodoAsistencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 3;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPeriodoAsistencia.add(jButtonid_empresaPeriodoAsistenciaUpdate, this.gridBagConstraintsPeriodoAsistencia);
	}

	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 1;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPeriodoAsistencia.add(jComboBoxid_empresaPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPeriodoAsistencia.add(jLabelid_ejercicioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 2;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPeriodoAsistencia.add(jButtonid_ejercicioPeriodoAsistenciaBusqueda, this.gridBagConstraintsPeriodoAsistencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 3;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPeriodoAsistencia.add(jButtonid_ejercicioPeriodoAsistenciaUpdate, this.gridBagConstraintsPeriodoAsistencia);
	}

	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 1;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPeriodoAsistencia.add(jComboBoxid_ejercicioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPeriodoAsistencia.add(jLabelid_periodoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 2;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPeriodoAsistencia.add(jButtonid_periodoPeriodoAsistenciaBusqueda, this.gridBagConstraintsPeriodoAsistencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 3;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPeriodoAsistencia.add(jButtonid_periodoPeriodoAsistenciaUpdate, this.gridBagConstraintsPeriodoAsistencia);
	}

	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 1;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPeriodoAsistencia.add(jComboBoxid_periodoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioPeriodoAsistencia.add(jLabelfecha_inicioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 2;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioPeriodoAsistencia.add(jButtonfecha_inicioPeriodoAsistenciaBusqueda, this.gridBagConstraintsPeriodoAsistencia);
	}

	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 1;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioPeriodoAsistencia.add(jDateChooserfecha_inicioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finPeriodoAsistencia.add(jLabelfecha_finPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = 2;
		this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
		this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finPeriodoAsistencia.add(jButtonfecha_finPeriodoAsistenciaBusqueda, this.gridBagConstraintsPeriodoAsistencia);
	}

	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
	this.gridBagConstraintsPeriodoAsistencia.gridx = 1;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finPeriodoAsistencia.add(jDateChooserfecha_finPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoAsistencia.gridy = iYPanelCamposPeriodoAsistencia;
	this.gridBagConstraintsPeriodoAsistencia.gridx = iXPanelCamposPeriodoAsistencia++;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoAsistencia.add(this.jPanelidPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(iXPanelCamposPeriodoAsistencia % 1==0) {
		iXPanelCamposPeriodoAsistencia=0;
		iYPanelCamposPeriodoAsistencia++;
	}
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoAsistencia.gridy = iYPanelCamposPeriodoAsistencia;
	this.gridBagConstraintsPeriodoAsistencia.gridx = iXPanelCamposPeriodoAsistencia++;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoAsistencia.add(this.jPanelfecha_inicioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(iXPanelCamposPeriodoAsistencia % 1==0) {
		iXPanelCamposPeriodoAsistencia=0;
		iYPanelCamposPeriodoAsistencia++;
	}
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoAsistencia.gridy = iYPanelCamposPeriodoAsistencia;
	this.gridBagConstraintsPeriodoAsistencia.gridx = iXPanelCamposPeriodoAsistencia++;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoAsistencia.add(this.jPanelfecha_finPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(iXPanelCamposPeriodoAsistencia % 1==0) {
		iXPanelCamposPeriodoAsistencia=0;
		iYPanelCamposPeriodoAsistencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoAsistencia.gridy = iYPanelCamposOcultosPeriodoAsistencia;
	this.gridBagConstraintsPeriodoAsistencia.gridx = iXPanelCamposOcultosPeriodoAsistencia++;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPeriodoAsistencia.add(this.jPanelid_empresaPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(iXPanelCamposOcultosPeriodoAsistencia % 1==0) {
		iXPanelCamposOcultosPeriodoAsistencia=0;
		iYPanelCamposOcultosPeriodoAsistencia++;
	}
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoAsistencia.gridy = iYPanelCamposOcultosPeriodoAsistencia;
	this.gridBagConstraintsPeriodoAsistencia.gridx = iXPanelCamposOcultosPeriodoAsistencia++;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPeriodoAsistencia.add(this.jPanelid_ejercicioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(iXPanelCamposOcultosPeriodoAsistencia % 1==0) {
		iXPanelCamposOcultosPeriodoAsistencia=0;
		iYPanelCamposOcultosPeriodoAsistencia++;
	}
	this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoAsistencia.gridy = iYPanelCamposOcultosPeriodoAsistencia;
	this.gridBagConstraintsPeriodoAsistencia.gridx = iXPanelCamposOcultosPeriodoAsistencia++;
	this.gridBagConstraintsPeriodoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPeriodoAsistencia.add(this.jPanelid_periodoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);



	if(iXPanelCamposOcultosPeriodoAsistencia % 1==0) {
		iXPanelCamposOcultosPeriodoAsistencia=0;
		iYPanelCamposOcultosPeriodoAsistencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesPeriodoAsistencia= new GridBagLayout();
		this.jPanelAccionesPeriodoAsistencia.setLayout(gridaBagLayoutAccionesPeriodoAsistencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPeriodoAsistencia= new GridBagLayout();
		this.jPanelAccionesFormularioPeriodoAsistencia.setLayout(gridaBagLayoutAccionesFormularioPeriodoAsistencia);
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodoAsistencia.add(this.jComboBoxTiposAccionesFormularioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodoAsistencia.add(this.jCheckBoxPostAccionNuevoPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodoAsistencia.add(this.jCheckBoxPostAccionSinCerrarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodoAsistencia.add(this.jCheckBoxPostAccionSinMensajePeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesPeriodoAsistencia.add(this.jButtonModificarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);							

		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;
		this.gridBagConstraintsPeriodoAsistencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesPeriodoAsistencia.add(this.jButtonEliminarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
			
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodoAsistencia.add(this.jButtonActualizarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);


		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodoAsistencia.add(this.jButtonGuardarCambiosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);	
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = 0;		
		this.gridBagConstraintsPeriodoAsistencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesPeriodoAsistencia.add(this.jButtonCancelarPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodoAsistencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodoAsistencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();						
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoAsistencia.gridx = 0;		
			//this.gridBagConstraintsPeriodoAsistencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodoAsistencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodoAsistencia.gridx =0;
		this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodoAsistencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePeriodoAsistencia = new PeriodoAsistenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Periodo Asistencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Periodo Asistencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Asistencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PeriodoAsistenciaModel periodoasistenciaModel=new PeriodoAsistenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//PeriodoAsistenciaModel.PeriodoAsistenciaFocusTraversalPolicy periodoasistenciaFocusTraversalPolicy = periodoasistenciaModel.new PeriodoAsistenciaFocusTraversalPolicy(this);
			
			//periodoasistenciaFocusTraversalPolicy.setperiodoasistenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(periodoasistenciaModel);
			
			
			this.jContentPaneDetallePeriodoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePeriodoAsistencia = new GridBagLayout();	
			this.jContentPaneDetallePeriodoAsistencia.setLayout(gridaBagLayoutDetallePeriodoAsistencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodoAsistencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
				this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
					
				
				this.jContentPaneDetallePeriodoAsistencia.add(jTtoolBarDetallePeriodoAsistencia, gridBagConstraintsPeriodoAsistencia);								
				
}
			
			this.jScrollPanelDatosEdicionPeriodoAsistencia=   new JScrollPane(jContentPaneDetallePeriodoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPeriodoAsistencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	        
			this.jContentPaneDetallePeriodoAsistencia.add(jPanelCamposPeriodoAsistencia, gridBagConstraintsPeriodoAsistencia);
			
			
			
			
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
						&& periodoasistenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPeriodoAsistencia= new GridBagConstraints();
						this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
						this.jContentPaneDetallePeriodoAsistencia.add(this.jTabbedPaneRelacionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPeriodoAsistencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPeriodoAsistencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
					this.gridBagConstraintsPeriodoAsistencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
					
				
					this.jContentPaneDetallePeriodoAsistencia.add(jPanelCamposOcultosPeriodoAsistencia, gridBagConstraintsPeriodoAsistencia);
				
					this.jPanelCamposOcultosPeriodoAsistencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	        this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePeriodoAsistencia.add(this.jPanelAccionesFormularioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);							
			
			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
	        this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
	        
			
			this.jContentPaneDetallePeriodoAsistencia.add(this.jPanelAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPeriodoAsistencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPeriodoAsistencia=   new JScrollPane(this.jPanelCamposPeriodoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
			this.gridBagConstraintsPeriodoAsistencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPeriodoAsistencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPeriodoAsistencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);			
			
			this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsPeriodoAsistencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
			
			
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		
			
		this.gridBagConstraintsPeriodoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsPeriodoAsistencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoAsistencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodoAsistencia, this.gridBagConstraintsPeriodoAsistencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPeriodoAsistencia;//jContentPane;
		
		return jScrollPanelDatosEdicionPeriodoAsistencia;
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
