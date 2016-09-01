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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoCierrePeriodoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoCierrePeriodoDetalleFormJInternalFrame extends ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCierrePeriodo;
	
	protected JMenuBar jmenuBarDetalleProcesoCierrePeriodo;
	
	protected JMenu jmenuDetalleProcesoCierrePeriodo;
	protected JMenu jmenuDetalleArchivoProcesoCierrePeriodo;
	protected JMenu jmenuDetalleAccionesProcesoCierrePeriodo;
	protected JMenu jmenuDetalleDatosProcesoCierrePeriodo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierrePeriodo;	
	protected GridBagConstraints gridBagConstraintsProcesoCierrePeriodo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCierrePeriodo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EstadoPeriodoBeanSwingJInternalFrame estadoperiodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoperiodo="";
	
	public ProcesoCierrePeriodoSessionBean procesocierreperiodoSessionBean;
	
	
	
	
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EstadoPeriodoSessionBean estadoperiodoSessionBean;	
	
	public ProcesoCierrePeriodoLogic procesocierreperiodoLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCierrePeriodo;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierrePeriodo;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierrePeriodo;
	
	protected JPanel jPanelCamposProcesoCierrePeriodo;    
	protected JPanel jPanelCamposOcultosProcesoCierrePeriodo;    	
	protected JPanel jPanelAccionesProcesoCierrePeriodo;
	protected JPanel jPanelAccionesFormularioProcesoCierrePeriodo;
    
	
	
	protected Integer iXPanelCamposProcesoCierrePeriodo=0;
	protected Integer iYPanelCamposProcesoCierrePeriodo=0;
	
	protected Integer iXPanelCamposOcultosProcesoCierrePeriodo=0;
	protected Integer iYPanelCamposOcultosProcesoCierrePeriodo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCierrePeriodo;
	public JButton jButtonModificarProcesoCierrePeriodo;
	public JButton jButtonActualizarProcesoCierrePeriodo;
    public JButton jButtonEliminarProcesoCierrePeriodo;
	public JButton jButtonCancelarProcesoCierrePeriodo;
    public JButton jButtonGuardarCambiosProcesoCierrePeriodo;
	public JButton jButtonGuardarCambiosTablaProcesoCierrePeriodo;
	protected JButton jButtonCerrarProcesoCierrePeriodo;
	
	
	protected JButton jButtonProcesarInformacionProcesoCierrePeriodo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCierrePeriodo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierrePeriodo;
	protected JButton jButtonModificarToolBarProcesoCierrePeriodo;
	protected JButton jButtonActualizarToolBarProcesoCierrePeriodo;
    protected JButton jButtonEliminarToolBarProcesoCierrePeriodo;
	protected JButton jButtonCancelarToolBarProcesoCierrePeriodo;
    protected JButton jButtonGuardarCambiosToolBarProcesoCierrePeriodo;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierrePeriodo;
	protected JButton jButtonCerrarToolBarProcesoCierrePeriodo;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCierrePeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierrePeriodo;
	protected JMenuItem jMenuItemModificarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemActualizarProcesoCierrePeriodo;
    protected JMenuItem jMenuItemEliminarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemCancelarProcesoCierrePeriodo;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCierrePeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierrePeriodo;
	protected JMenuItem jMenuItemCerrarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierrePeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierrePeriodo;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierrePeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierrePeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierrePeriodo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierrePeriodo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCierrePeriodo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCierrePeriodo;
	public JLabel jLabelIdProcesoCierrePeriodo;
	public JLabel jLabelidProcesoCierrePeriodo;
	public JButton jButtonidProcesoCierrePeriodoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioProcesoCierrePeriodo;
	public JLabel jLabelid_ejercicioProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProcesoCierrePeriodo;
	public JButton jButtonid_ejercicioProcesoCierrePeriodo= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoCierrePeriodoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoCierrePeriodoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoProcesoCierrePeriodo;
	public JLabel jLabelid_periodoProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoProcesoCierrePeriodo;
	public JButton jButtonid_periodoProcesoCierrePeriodo= new JButtonMe();
	public JButton jButtonid_periodoProcesoCierrePeriodoUpdate= new JButtonMe();
	public JButton jButtonid_periodoProcesoCierrePeriodoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_periodoProcesoCierrePeriodo;
	public JLabel jLabelid_estado_periodoProcesoCierrePeriodo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_periodoProcesoCierrePeriodo;
	public JButton jButtonid_estado_periodoProcesoCierrePeriodo= new JButtonMe();
	public JButton jButtonid_estado_periodoProcesoCierrePeriodoUpdate= new JButtonMe();
	public JButton jButtonid_estado_periodoProcesoCierrePeriodoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCierrePeriodo;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCierrePeriodoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCierrePeriodo=new JPanel();
				this.jPanelAccionesFormularioProcesoCierrePeriodo=new JPanel();
				this.jmenuBarDetalleProcesoCierrePeriodo=new JMenuBar();
				this.jTtoolBarDetalleProcesoCierrePeriodo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCierrePeriodoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierrePeriodoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierrePeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCierrePeriodo() {
		return this.jButtonActualizarToolBarProcesoCierrePeriodo;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCierrePeriodo() {
		return this.jButtonEliminarToolBarProcesoCierrePeriodo;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCierrePeriodo() {
		return this.jButtonCancelarToolBarProcesoCierrePeriodo;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCierrePeriodo() {
		return this.jButtonProcesarInformacionProcesoCierrePeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierrePeriodo)	{
		this.jButtonProcesarInformacionProcesoCierrePeriodo = jButtonProcesarInformacionProcesoCierrePeriodo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierrePeriodo() {
		return this.jComboBoxTiposAccionesProcesoCierrePeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposRelacionesProcesoCierrePeriodo) {
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo = jComboBoxTiposRelacionesProcesoCierrePeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierrePeriodo(
			JComboBox jComboBoxTiposAccionesProcesoCierrePeriodo) {
		this.jComboBoxTiposAccionesProcesoCierrePeriodo = jComboBoxTiposAccionesProcesoCierrePeriodo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCierrePeriodo() {
		return this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCierrePeriodo(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCierrePeriodo) {
		this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo = jComboBoxTiposAccionesFormularioProcesoCierrePeriodo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
		
		this.procesocierreperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierreperiodoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierrePeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierrePeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierrePeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cierre Periodo Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCierrePeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCierrePeriodo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCierrePeriodo=new JButtonMe();
				this.jButtonModificarToolBarProcesoCierrePeriodo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCierrePeriodo,this.jTtoolBarDetalleProcesoCierrePeriodo,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCierrePeriodo,this.jTtoolBarDetalleProcesoCierrePeriodo,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCierrePeriodo,this.jTtoolBarDetalleProcesoCierrePeriodo,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCierrePeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCierrePeriodo,this.jTtoolBarDetalleProcesoCierrePeriodo,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCierrePeriodo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCierrePeriodo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCierrePeriodo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCierrePeriodo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCierrePeriodo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierrePeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierrePeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierrePeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCierrePeriodo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCierrePeriodo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCierrePeriodo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCierrePeriodo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCierrePeriodo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCierrePeriodo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCierrePeriodo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCierrePeriodo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCierrePeriodo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCierrePeriodo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCierrePeriodo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCierrePeriodo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCierrePeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierrePeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierrePeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierrePeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierrePeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierrePeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCierrePeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCierrePeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCierrePeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierrePeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCierrePeriodo.add(this.jMenuItemDetalleCerrarProcesoCierrePeriodo);
		
		this.jmenuDetalleAccionesProcesoCierrePeriodo.add(this.jMenuItemActualizarProcesoCierrePeriodo);
		this.jmenuDetalleAccionesProcesoCierrePeriodo.add(this.jMenuItemEliminarProcesoCierrePeriodo);
		this.jmenuDetalleAccionesProcesoCierrePeriodo.add(this.jMenuItemCancelarProcesoCierrePeriodo);		
		
		//this.jmenuDetalleDatosProcesoCierrePeriodo.add(this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo);				
		this.jmenuDetalleDatosProcesoCierrePeriodo.add(this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo);				
				
		//this.jmenuDetalleAccionesProcesoCierrePeriodo.add(this.jMenuItemGuardarCambiosProcesoCierrePeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCierrePeriodo.add(this.jmenuDetalleArchivoProcesoCierrePeriodo);		
		this.jmenuBarDetalleProcesoCierrePeriodo.add(this.jmenuDetalleAccionesProcesoCierrePeriodo);		
		this.jmenuBarDetalleProcesoCierrePeriodo.add(this.jmenuDetalleDatosProcesoCierrePeriodo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCierrePeriodo);				
	}
	
	
	public void inicializarElementosCamposProcesoCierrePeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCierrePeriodo = new JLabelMe();
		jLabelIdProcesoCierrePeriodo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCierrePeriodo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCierrePeriodo.setToolTipText(ProcesoCierrePeriodoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCierrePeriodo= new GridBagLayout();

		this.jPanelidProcesoCierrePeriodo.setLayout(this.gridaBagLayoutProcesoCierrePeriodo);

		jLabelidProcesoCierrePeriodo = new JLabel();
		jLabelidProcesoCierrePeriodo.setText("Id");

		jLabelidProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoCierrePeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_ejercicioProcesoCierrePeriodo = new JLabelMe();
		this.jLabelid_ejercicioProcesoCierrePeriodo.setText(""+ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProcesoCierrePeriodo.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProcesoCierrePeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProcesoCierrePeriodo.setToolTipText(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProcesoCierrePeriodo = new GridBagLayout();
		this.jPanelid_ejercicioProcesoCierrePeriodo.setLayout(this.gridaBagLayoutProcesoCierrePeriodo);


		jComboBoxid_ejercicioProcesoCierrePeriodo= new JComboBoxMe();
		jComboBoxid_ejercicioProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProcesoCierrePeriodo.setEnabled(false);

		this.jButtonid_ejercicioProcesoCierrePeriodo= new JButtonMe();
		this.jButtonid_ejercicioProcesoCierrePeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoCierrePeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoCierrePeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoCierrePeriodo.setText("Buscar");
		this.jButtonid_ejercicioProcesoCierrePeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProcesoCierrePeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoCierrePeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoCierrePeriodo"));

		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setText("U");
		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoCierrePeriodoBusqueda"));

		if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProcesoCierrePeriodoUpdate= new JButtonMe();
		this.jButtonid_ejercicioProcesoCierrePeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoCierrePeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoCierrePeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoCierrePeriodoUpdate.setText("U");
		this.jButtonid_ejercicioProcesoCierrePeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProcesoCierrePeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoCierrePeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoCierrePeriodoUpdate"));



					
		this.jLabelid_periodoProcesoCierrePeriodo = new JLabelMe();
		this.jLabelid_periodoProcesoCierrePeriodo.setText(""+ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoProcesoCierrePeriodo.setToolTipText("Periodo");
		this.jLabelid_periodoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoProcesoCierrePeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoProcesoCierrePeriodo.setToolTipText(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutProcesoCierrePeriodo = new GridBagLayout();
		this.jPanelid_periodoProcesoCierrePeriodo.setLayout(this.gridaBagLayoutProcesoCierrePeriodo);


		jComboBoxid_periodoProcesoCierrePeriodo= new JComboBoxMe();
		jComboBoxid_periodoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoProcesoCierrePeriodo.setEnabled(false);

		this.jButtonid_periodoProcesoCierrePeriodo= new JButtonMe();
		this.jButtonid_periodoProcesoCierrePeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoCierrePeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoCierrePeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProcesoCierrePeriodo.setText("Buscar");
		this.jButtonid_periodoProcesoCierrePeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoProcesoCierrePeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoCierrePeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoCierrePeriodo"));

		this.jButtonid_periodoProcesoCierrePeriodoBusqueda= new JButtonMe();
		this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setText("U");
		this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoCierrePeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoCierrePeriodoBusqueda"));

		if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoProcesoCierrePeriodoBusqueda.setVisible(false);		}

		this.jButtonid_periodoProcesoCierrePeriodoUpdate= new JButtonMe();
		this.jButtonid_periodoProcesoCierrePeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoCierrePeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProcesoCierrePeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProcesoCierrePeriodoUpdate.setText("U");
		this.jButtonid_periodoProcesoCierrePeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoProcesoCierrePeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProcesoCierrePeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProcesoCierrePeriodoUpdate"));



					
		this.jLabelid_estado_periodoProcesoCierrePeriodo = new JLabelMe();
		this.jLabelid_estado_periodoProcesoCierrePeriodo.setText(""+ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO+" : *");
		this.jLabelid_estado_periodoProcesoCierrePeriodo.setToolTipText("Estado Periodo");
		this.jLabelid_estado_periodoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_periodoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_periodoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_periodoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_periodoProcesoCierrePeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_periodoProcesoCierrePeriodo.setToolTipText(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
		this.gridaBagLayoutProcesoCierrePeriodo = new GridBagLayout();
		this.jPanelid_estado_periodoProcesoCierrePeriodo.setLayout(this.gridaBagLayoutProcesoCierrePeriodo);


		jComboBoxid_estado_periodoProcesoCierrePeriodo= new JComboBoxMe();
		jComboBoxid_estado_periodoProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_periodoProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_periodoProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_periodoProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_periodoProcesoCierrePeriodo= new JButtonMe();
		this.jButtonid_estado_periodoProcesoCierrePeriodo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_periodoProcesoCierrePeriodo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_periodoProcesoCierrePeriodo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_periodoProcesoCierrePeriodo.setText("Buscar");
		this.jButtonid_estado_periodoProcesoCierrePeriodo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_periodoProcesoCierrePeriodo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_periodoProcesoCierrePeriodo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_periodoProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_periodoProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_periodoProcesoCierrePeriodo"));

		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda= new JButtonMe();
		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setText("U");
		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_periodoProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_periodoProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_periodoProcesoCierrePeriodoBusqueda"));

		if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.setVisible(false);		}

		this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate= new JButtonMe();
		this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.setText("U");
		this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_periodoProcesoCierrePeriodoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_periodoProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_periodoProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_periodoProcesoCierrePeriodoUpdate"));



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
		//this.jInternalFrameDetalleProcesoCierrePeriodo = new ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cierre Periodo Mensual DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierrePeriodo= new GridBagLayout();
		

		
		String sToolTipProcesoCierrePeriodo="";
		sToolTipProcesoCierrePeriodo=ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierrePeriodo+="(Contabilidad.ProcesoCierrePeriodo)";
		}
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierrePeriodo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCierrePeriodo = new JButtonMe();
		this.jButtonModificarProcesoCierrePeriodo = new JButtonMe();
        this.jButtonActualizarProcesoCierrePeriodo = new JButtonMe();
        this.jButtonEliminarProcesoCierrePeriodo = new JButtonMe();
        this.jButtonCancelarProcesoCierrePeriodo = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCierrePeriodo = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo = new JButtonMe();
		this.jButtonCerrarProcesoCierrePeriodo = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierrePeriodo = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCierrePeriodo = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCierrePeriodo = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cierre Periodo Mensual";
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Periodo Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierrePeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCierrePeriodo.setName("jPanelCamposProcesoCierrePeriodo"); 

		this.jPanelCamposOcultosProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCierrePeriodo.setName("jPanelCamposOcultosProcesoCierrePeriodo"); 

        this.jPanelAccionesProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierrePeriodo.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierrePeriodo.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCierrePeriodo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCierrePeriodo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCierrePeriodo.setText("Nuevo");
		this.jButtonModificarProcesoCierrePeriodo.setText("Editar");
        this.jButtonActualizarProcesoCierrePeriodo.setText("Actualizar");
        this.jButtonEliminarProcesoCierrePeriodo.setText("Eliminar");
        this.jButtonCancelarProcesoCierrePeriodo.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCierrePeriodo.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.setText("Guardar");
		this.jButtonCerrarProcesoCierrePeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierrePeriodo,"nuevo_button","Nuevo",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCierrePeriodo,"modificar_button","Editar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCierrePeriodo,"actualizar_button","Actualizar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCierrePeriodo,"eliminar_button","Eliminar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCierrePeriodo,"cancelar_button","Cancelar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCierrePeriodo,"guardarcambios_button","Guardar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierrePeriodo,"guardarcambiostabla_button","Guardar",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierrePeriodo,"cerrar_button","Salir",this.procesocierreperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCierrePeriodo.setToolTipText("Nuevo"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCierrePeriodo.setToolTipText("Editar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCierrePeriodo.setToolTipText("Actualizar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCierrePeriodo.setToolTipText("Eliminar)"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCierrePeriodo.setToolTipText("Cancelar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCierrePeriodo.setToolTipText("Guardar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.setToolTipText("Guardar"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierrePeriodo.setToolTipText("Salir"+" "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierrePeriodo";
		inputMap = this.jButtonNuevoProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierrePeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierrePeriodo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCierrePeriodo";
		inputMap = this.jButtonActualizarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCierrePeriodo"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCierrePeriodo";
		inputMap = this.jButtonEliminarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCierrePeriodo"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCierrePeriodo";
		inputMap = this.jButtonCancelarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCierrePeriodo"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierrePeriodo";
		inputMap = this.jButtonCerrarProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierrePeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierrePeriodo";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierrePeriodo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCierrePeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCierrePeriodo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCierrePeriodo.setToolTipText("Nuevo ProcesoCierrePeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo.setToolTipText("Sin Cerrar Ventana ProcesoCierrePeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierrePeriodo.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCierrePeriodo = new JLabelMe();
		
		this.jLabelAccionesProcesoCierrePeriodo.setText("Acciones");		
		this.jLabelAccionesProcesoCierrePeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierrePeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierrePeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCierrePeriodo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCierrePeriodo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCierrePeriodo=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCierrePeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCierrePeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCierrePeriodo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCierrePeriodo = new GridBagLayout();
		
		this.jPanelCamposProcesoCierrePeriodo.setLayout(gridaBagLayoutCamposProcesoCierrePeriodo);
		this.jPanelCamposOcultosProcesoCierrePeriodo.setLayout(gridaBagLayoutCamposOcultosProcesoCierrePeriodo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCierrePeriodo.add(jLabelIdProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCierrePeriodo.add(jLabelidProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);


	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioProcesoCierrePeriodo.add(jLabelid_ejercicioProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 2;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoCierrePeriodo.add(jButtonid_ejercicioProcesoCierrePeriodoBusqueda, this.gridBagConstraintsProcesoCierrePeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 3;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoCierrePeriodo.add(jButtonid_ejercicioProcesoCierrePeriodoUpdate, this.gridBagConstraintsProcesoCierrePeriodo);
	}

	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioProcesoCierrePeriodo.add(jComboBoxid_ejercicioProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);


	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoProcesoCierrePeriodo.add(jLabelid_periodoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 2;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoCierrePeriodo.add(jButtonid_periodoProcesoCierrePeriodoBusqueda, this.gridBagConstraintsProcesoCierrePeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 3;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProcesoCierrePeriodo.add(jButtonid_periodoProcesoCierrePeriodoUpdate, this.gridBagConstraintsProcesoCierrePeriodo);
	}

	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoProcesoCierrePeriodo.add(jComboBoxid_periodoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);


	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_periodoProcesoCierrePeriodo.add(jLabelid_estado_periodoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 2;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_periodoProcesoCierrePeriodo.add(jButtonid_estado_periodoProcesoCierrePeriodoBusqueda, this.gridBagConstraintsProcesoCierrePeriodo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 3;
		this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_periodoProcesoCierrePeriodo.add(jButtonid_estado_periodoProcesoCierrePeriodoUpdate, this.gridBagConstraintsProcesoCierrePeriodo);
	}

	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = 1;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_periodoProcesoCierrePeriodo.add(jComboBoxid_estado_periodoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = iYPanelCamposProcesoCierrePeriodo;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = iXPanelCamposProcesoCierrePeriodo++;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierrePeriodo.add(this.jPanelidProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(iXPanelCamposProcesoCierrePeriodo % 1==0) {
		iXPanelCamposProcesoCierrePeriodo=0;
		iYPanelCamposProcesoCierrePeriodo++;
	}
	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = iYPanelCamposProcesoCierrePeriodo;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = iXPanelCamposProcesoCierrePeriodo++;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierrePeriodo.add(this.jPanelid_estado_periodoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(iXPanelCamposProcesoCierrePeriodo % 1==0) {
		iXPanelCamposProcesoCierrePeriodo=0;
		iYPanelCamposProcesoCierrePeriodo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = iYPanelCamposOcultosProcesoCierrePeriodo;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = iXPanelCamposOcultosProcesoCierrePeriodo++;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCierrePeriodo.add(this.jPanelid_ejercicioProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(iXPanelCamposOcultosProcesoCierrePeriodo % 1==0) {
		iXPanelCamposOcultosProcesoCierrePeriodo=0;
		iYPanelCamposOcultosProcesoCierrePeriodo++;
	}
	this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierrePeriodo.gridy = iYPanelCamposOcultosProcesoCierrePeriodo;
	this.gridBagConstraintsProcesoCierrePeriodo.gridx = iXPanelCamposOcultosProcesoCierrePeriodo++;
	this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierrePeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCierrePeriodo.add(this.jPanelid_periodoProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);



	if(iXPanelCamposOcultosProcesoCierrePeriodo % 1==0) {
		iXPanelCamposOcultosProcesoCierrePeriodo=0;
		iYPanelCamposOcultosProcesoCierrePeriodo++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierrePeriodo= new GridBagLayout();
		this.jPanelAccionesProcesoCierrePeriodo.setLayout(gridaBagLayoutAccionesProcesoCierrePeriodo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCierrePeriodo= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCierrePeriodo.setLayout(gridaBagLayoutAccionesFormularioProcesoCierrePeriodo);
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCierrePeriodo.add(this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCierrePeriodo.add(this.jButtonModificarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);							

		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCierrePeriodo.add(this.jButtonEliminarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
			
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierrePeriodo.add(this.jButtonActualizarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);


		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierrePeriodo.add(this.jButtonGuardarCambiosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);	
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = 0;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCierrePeriodo.add(this.jButtonCancelarProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierrePeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierrePeriodo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;		
			//this.gridBagConstraintsProcesoCierrePeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierrePeriodo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =0;
		this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierrePeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCierrePeriodo = new ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cierre Periodo Mensual DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cierre Periodo Mensual DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cierre Periodo Mensual Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCierrePeriodoModel procesocierreperiodoModel=new ProcesoCierrePeriodoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCierrePeriodoModel.ProcesoCierrePeriodoFocusTraversalPolicy procesocierreperiodoFocusTraversalPolicy = procesocierreperiodoModel.new ProcesoCierrePeriodoFocusTraversalPolicy(this);
			
			//procesocierreperiodoFocusTraversalPolicy.setprocesocierreperiodoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocierreperiodoModel);
			
			
			this.jContentPaneDetalleProcesoCierrePeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCierrePeriodo = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCierrePeriodo.setLayout(gridaBagLayoutDetalleProcesoCierrePeriodo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierrePeriodo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCierrePeriodo.add(jTtoolBarDetalleProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo=   new JScrollPane(jContentPaneDetalleProcesoCierrePeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCierrePeriodo.add(jPanelCamposProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);
			
			
			
			
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
						//&& procesocierreperiodoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCierrePeriodo= new GridBagConstraints();
						this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
						this.jContentPaneDetalleProcesoCierrePeriodo.add(this.jTabbedPaneRelacionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCierrePeriodo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCierrePeriodo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
					this.gridBagConstraintsProcesoCierrePeriodo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCierrePeriodo.add(jPanelCamposOcultosProcesoCierrePeriodo, gridBagConstraintsProcesoCierrePeriodo);
				
					this.jPanelCamposOcultosProcesoCierrePeriodo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	        this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCierrePeriodo.add(this.jPanelAccionesFormularioProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);							
			
			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCierrePeriodo.add(this.jPanelAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCierrePeriodo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo=   new JScrollPane(this.jPanelCamposProcesoCierrePeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
			this.gridBagConstraintsProcesoCierrePeriodo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCierrePeriodo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCierrePeriodo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);			
			
			this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
			
			
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		
			
		this.gridBagConstraintsProcesoCierrePeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierrePeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierrePeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierrePeriodo, this.gridBagConstraintsProcesoCierrePeriodo);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCierrePeriodo.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCierrePeriodo;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCierrePeriodo;
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
