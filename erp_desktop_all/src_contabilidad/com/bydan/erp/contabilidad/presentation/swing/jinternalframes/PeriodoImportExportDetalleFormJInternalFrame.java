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
import com.bydan.erp.contabilidad.util.PeriodoImportExportConstantesFunciones;

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
public class PeriodoImportExportDetalleFormJInternalFrame extends PeriodoImportExportBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePeriodoImportExport;
	
	protected JMenuBar jmenuBarDetallePeriodoImportExport;
	
	protected JMenu jmenuDetallePeriodoImportExport;
	protected JMenu jmenuDetalleArchivoPeriodoImportExport;
	protected JMenu jmenuDetalleAccionesPeriodoImportExport;
	protected JMenu jmenuDetalleDatosPeriodoImportExport;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPeriodoImportExport;	
	protected GridBagConstraints gridBagConstraintsPeriodoImportExport;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PeriodoImportExportBeanSwingJInternalFrameAdditional jInternalFrameDetallePeriodoImportExport;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PeriodoImportExportSessionBean periodoimportexportSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PeriodoImportExportLogic periodoimportexportLogic;
	
	public JScrollPane jScrollPanelDatosPeriodoImportExport;
	public JScrollPane jScrollPanelDatosEdicionPeriodoImportExport;
	public JScrollPane jScrollPanelDatosGeneralPeriodoImportExport;
	
	protected JPanel jPanelCamposPeriodoImportExport;    
	protected JPanel jPanelCamposOcultosPeriodoImportExport;    	
	protected JPanel jPanelAccionesPeriodoImportExport;
	protected JPanel jPanelAccionesFormularioPeriodoImportExport;
    
	
	
	protected Integer iXPanelCamposPeriodoImportExport=0;
	protected Integer iYPanelCamposPeriodoImportExport=0;
	
	protected Integer iXPanelCamposOcultosPeriodoImportExport=0;
	protected Integer iYPanelCamposOcultosPeriodoImportExport=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPeriodoImportExport;
	public JButton jButtonModificarPeriodoImportExport;
	public JButton jButtonActualizarPeriodoImportExport;
    public JButton jButtonEliminarPeriodoImportExport;
	public JButton jButtonCancelarPeriodoImportExport;
    public JButton jButtonGuardarCambiosPeriodoImportExport;
	public JButton jButtonGuardarCambiosTablaPeriodoImportExport;
	protected JButton jButtonCerrarPeriodoImportExport;
	
	
	protected JButton jButtonProcesarInformacionPeriodoImportExport;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPeriodoImportExport;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPeriodoImportExport;
	protected JCheckBox jCheckBoxPostAccionSinMensajePeriodoImportExport;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPeriodoImportExport;
	protected JButton jButtonModificarToolBarPeriodoImportExport;
	protected JButton jButtonActualizarToolBarPeriodoImportExport;
    protected JButton jButtonEliminarToolBarPeriodoImportExport;
	protected JButton jButtonCancelarToolBarPeriodoImportExport;
    protected JButton jButtonGuardarCambiosToolBarPeriodoImportExport;
	protected JButton jButtonGuardarCambiosTablaToolBarPeriodoImportExport;
	protected JButton jButtonMostrarOcultarTablaToolBarPeriodoImportExport;
	protected JButton jButtonCerrarToolBarPeriodoImportExport;
	
	protected JButton jButtonProcesarInformacionToolBarPeriodoImportExport;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPeriodoImportExport;
	protected JMenuItem jMenuItemModificarPeriodoImportExport;
	protected JMenuItem jMenuItemActualizarPeriodoImportExport;
    protected JMenuItem jMenuItemEliminarPeriodoImportExport;
	protected JMenuItem jMenuItemCancelarPeriodoImportExport;
    protected JMenuItem jMenuItemGuardarCambiosPeriodoImportExport;
	protected JMenuItem jMenuItemGuardarCambiosTablaPeriodoImportExport;
	protected JMenuItem jMenuItemCerrarPeriodoImportExport;
	protected JMenuItem jMenuItemDetalleCerrarPeriodoImportExport;
	protected JMenuItem jMenuItemDetalleMostarOcultarPeriodoImportExport;
	
	protected JMenuItem jMenuItemProcesarInformacionPeriodoImportExport;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPeriodoImportExport;
	protected JMenuItem jMenuItemMostrarOcultarPeriodoImportExport;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPeriodoImportExport;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPeriodoImportExport;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPeriodoImportExport;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPeriodoImportExport;
	public JLabel jLabelIdPeriodoImportExport;
	public JTextFieldMe jTextFieldidPeriodoImportExport;
	public JButton jButtonidPeriodoImportExportBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPeriodoImportExport;
	public JLabel jLabelcodigoPeriodoImportExport;
	public JTextField jTextFieldcodigoPeriodoImportExport;
	public JButton jButtoncodigoPeriodoImportExportBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioPeriodoImportExport;
	public JLabel jLabelid_anioPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPeriodoImportExport;
	public JButton jButtonid_anioPeriodoImportExport= new JButtonMe();
	public JButton jButtonid_anioPeriodoImportExportUpdate= new JButtonMe();
	public JButton jButtonid_anioPeriodoImportExportBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPeriodoImportExport;
	public JLabel jLabelid_mesPeriodoImportExport;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPeriodoImportExport;
	public JButton jButtonid_mesPeriodoImportExport= new JButtonMe();
	public JButton jButtonid_mesPeriodoImportExportUpdate= new JButtonMe();
	public JButton jButtonid_mesPeriodoImportExportBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPeriodoImportExport;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PeriodoImportExportDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPeriodoImportExport=new JPanel();
				this.jPanelAccionesFormularioPeriodoImportExport=new JPanel();
				this.jmenuBarDetallePeriodoImportExport=new JMenuBar();
				this.jTtoolBarDetallePeriodoImportExport=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PeriodoImportExportDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PeriodoImportExportDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PeriodoImportExport No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPeriodoImportExport() {
		return this.jButtonActualizarToolBarPeriodoImportExport;
	}
	
	public JButton getjButtonEliminarToolBarPeriodoImportExport() {
		return this.jButtonEliminarToolBarPeriodoImportExport;
	}
	
	public JButton getjButtonCancelarToolBarPeriodoImportExport() {
		return this.jButtonCancelarToolBarPeriodoImportExport;
	}		
	
	public JButton getjButtonProcesarInformacionPeriodoImportExport() {
		return this.jButtonProcesarInformacionPeriodoImportExport;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPeriodoImportExport)	{
		this.jButtonProcesarInformacionPeriodoImportExport = jButtonProcesarInformacionPeriodoImportExport;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPeriodoImportExport() {
		return this.jComboBoxTiposAccionesPeriodoImportExport;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPeriodoImportExport(
			JComboBox jComboBoxTiposRelacionesPeriodoImportExport) {
		this.jComboBoxTiposRelacionesPeriodoImportExport = jComboBoxTiposRelacionesPeriodoImportExport;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPeriodoImportExport(
			JComboBox jComboBoxTiposAccionesPeriodoImportExport) {
		this.jComboBoxTiposAccionesPeriodoImportExport = jComboBoxTiposAccionesPeriodoImportExport;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPeriodoImportExport() {
		return this.jComboBoxTiposAccionesFormularioPeriodoImportExport;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPeriodoImportExport(
			JComboBox jComboBoxTiposAccionesFormularioPeriodoImportExport) {
		this.jComboBoxTiposAccionesFormularioPeriodoImportExport = jComboBoxTiposAccionesFormularioPeriodoImportExport;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
		
		this.periodoimportexportSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoimportexportSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.periodoimportexportSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PeriodoImportExportJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PeriodoImportExportJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PeriodoImportExportJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Periodo Importar Exportar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
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
	
		PeriodoImportExportJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePeriodoImportExport= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPeriodoImportExport=new JButtonMe();
				this.jButtonModificarToolBarPeriodoImportExport=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPeriodoImportExport,this.jTtoolBarDetallePeriodoImportExport,
							"actualizar","actualizar","Actualizar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPeriodoImportExport,this.jTtoolBarDetallePeriodoImportExport,
							"eliminar","eliminar","Eliminar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPeriodoImportExport,this.jTtoolBarDetallePeriodoImportExport,
							"cancelar","cancelar","Cancelar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPeriodoImportExport=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPeriodoImportExport,this.jTtoolBarDetallePeriodoImportExport,
							"guardarcambios","guardarcambios","Guardar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePeriodoImportExport=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePeriodoImportExport=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPeriodoImportExport=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPeriodoImportExport=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPeriodoImportExport=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPeriodoImportExport= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPeriodoImportExport.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPeriodoImportExport,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPeriodoImportExport= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPeriodoImportExport.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPeriodoImportExport,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPeriodoImportExport= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPeriodoImportExport.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPeriodoImportExport,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPeriodoImportExport= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPeriodoImportExport.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPeriodoImportExport,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPeriodoImportExport= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPeriodoImportExport.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPeriodoImportExport,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPeriodoImportExport= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPeriodoImportExport.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPeriodoImportExport,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPeriodoImportExport= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPeriodoImportExport.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPeriodoImportExport,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPeriodoImportExport= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPeriodoImportExport.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPeriodoImportExport,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPeriodoImportExport= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPeriodoImportExport.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPeriodoImportExport,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPeriodoImportExport= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPeriodoImportExport.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPeriodoImportExport,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPeriodoImportExport.add(this.jMenuItemDetalleCerrarPeriodoImportExport);
		
		this.jmenuDetalleAccionesPeriodoImportExport.add(this.jMenuItemActualizarPeriodoImportExport);
		this.jmenuDetalleAccionesPeriodoImportExport.add(this.jMenuItemEliminarPeriodoImportExport);
		this.jmenuDetalleAccionesPeriodoImportExport.add(this.jMenuItemCancelarPeriodoImportExport);		
		
		//this.jmenuDetalleDatosPeriodoImportExport.add(this.jMenuItemDetalleAbrirOrderByPeriodoImportExport);				
		this.jmenuDetalleDatosPeriodoImportExport.add(this.jMenuItemDetalleMostarOcultarPeriodoImportExport);				
				
		//this.jmenuDetalleAccionesPeriodoImportExport.add(this.jMenuItemGuardarCambiosPeriodoImportExport);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePeriodoImportExport.add(this.jmenuDetalleArchivoPeriodoImportExport);		
		this.jmenuBarDetallePeriodoImportExport.add(this.jmenuDetalleAccionesPeriodoImportExport);		
		this.jmenuBarDetallePeriodoImportExport.add(this.jmenuDetalleDatosPeriodoImportExport);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePeriodoImportExport);				
	}
	
	
	public void inicializarElementosCamposPeriodoImportExport() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPeriodoImportExport = new JLabelMe();
		jLabelIdPeriodoImportExport.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPeriodoImportExport = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPeriodoImportExport.setToolTipText(PeriodoImportExportConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPeriodoImportExport= new GridBagLayout();

		this.jPanelidPeriodoImportExport.setLayout(this.gridaBagLayoutPeriodoImportExport);

		jTextFieldidPeriodoImportExport = new JTextFieldMe();
		jTextFieldidPeriodoImportExport.setText("Id");

		jTextFieldidPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPeriodoImportExport = new JLabelMe();
		this.jLabelcodigoPeriodoImportExport.setText(""+PeriodoImportExportConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPeriodoImportExport.setToolTipText("Codigo");
		this.jLabelcodigoPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPeriodoImportExport=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPeriodoImportExport.setToolTipText(PeriodoImportExportConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPeriodoImportExport = new GridBagLayout();
		this.jPanelcodigoPeriodoImportExport.setLayout(this.gridaBagLayoutPeriodoImportExport);


		jTextFieldcodigoPeriodoImportExport= new JTextFieldMe();

		jTextFieldcodigoPeriodoImportExport.setEnabled(false);
		jTextFieldcodigoPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPeriodoImportExportBusqueda= new JButtonMe();
		this.jButtoncodigoPeriodoImportExportBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPeriodoImportExportBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPeriodoImportExportBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPeriodoImportExportBusqueda.setText("U");
		this.jButtoncodigoPeriodoImportExportBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPeriodoImportExportBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPeriodoImportExportBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPeriodoImportExportBusqueda"));

		if(this.periodoimportexportSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPeriodoImportExportBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPeriodoImportExport() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioPeriodoImportExport = new JLabelMe();
		this.jLabelid_anioPeriodoImportExport.setText(""+PeriodoImportExportConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPeriodoImportExport.setToolTipText("Anio");
		this.jLabelid_anioPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPeriodoImportExport=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPeriodoImportExport.setToolTipText(PeriodoImportExportConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPeriodoImportExport = new GridBagLayout();
		this.jPanelid_anioPeriodoImportExport.setLayout(this.gridaBagLayoutPeriodoImportExport);


		jComboBoxid_anioPeriodoImportExport= new JComboBoxMe();
		jComboBoxid_anioPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioPeriodoImportExport= new JButtonMe();
		this.jButtonid_anioPeriodoImportExport.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodoImportExport.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodoImportExport.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPeriodoImportExport.setText("Buscar");
		this.jButtonid_anioPeriodoImportExport.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPeriodoImportExport.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoImportExport,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoImportExport"));

		this.jButtonid_anioPeriodoImportExportBusqueda= new JButtonMe();
		this.jButtonid_anioPeriodoImportExportBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoImportExportBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoImportExportBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPeriodoImportExportBusqueda.setText("U");
		this.jButtonid_anioPeriodoImportExportBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPeriodoImportExportBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoImportExportBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoImportExportBusqueda"));

		if(this.periodoimportexportSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPeriodoImportExportBusqueda.setVisible(false);		}

		this.jButtonid_anioPeriodoImportExportUpdate= new JButtonMe();
		this.jButtonid_anioPeriodoImportExportUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoImportExportUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPeriodoImportExportUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPeriodoImportExportUpdate.setText("U");
		this.jButtonid_anioPeriodoImportExportUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPeriodoImportExportUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPeriodoImportExportUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPeriodoImportExportUpdate"));



					
		this.jLabelid_mesPeriodoImportExport = new JLabelMe();
		this.jLabelid_mesPeriodoImportExport.setText(""+PeriodoImportExportConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPeriodoImportExport.setToolTipText("Mes");
		this.jLabelid_mesPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPeriodoImportExport=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPeriodoImportExport.setToolTipText(PeriodoImportExportConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPeriodoImportExport = new GridBagLayout();
		this.jPanelid_mesPeriodoImportExport.setLayout(this.gridaBagLayoutPeriodoImportExport);


		jComboBoxid_mesPeriodoImportExport= new JComboBoxMe();
		jComboBoxid_mesPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesPeriodoImportExport= new JButtonMe();
		this.jButtonid_mesPeriodoImportExport.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodoImportExport.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodoImportExport.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPeriodoImportExport.setText("Buscar");
		this.jButtonid_mesPeriodoImportExport.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPeriodoImportExport.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoImportExport,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoImportExport"));

		this.jButtonid_mesPeriodoImportExportBusqueda= new JButtonMe();
		this.jButtonid_mesPeriodoImportExportBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoImportExportBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoImportExportBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPeriodoImportExportBusqueda.setText("U");
		this.jButtonid_mesPeriodoImportExportBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPeriodoImportExportBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoImportExportBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoImportExportBusqueda"));

		if(this.periodoimportexportSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPeriodoImportExportBusqueda.setVisible(false);		}

		this.jButtonid_mesPeriodoImportExportUpdate= new JButtonMe();
		this.jButtonid_mesPeriodoImportExportUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoImportExportUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPeriodoImportExportUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPeriodoImportExportUpdate.setText("U");
		this.jButtonid_mesPeriodoImportExportUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPeriodoImportExportUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPeriodoImportExportUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPeriodoImportExportUpdate"));



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
		//this.jInternalFrameDetallePeriodoImportExport = new PeriodoImportExportBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Periodo Importar Exportar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPeriodoImportExport= new GridBagLayout();
		

		
		String sToolTipPeriodoImportExport="";
		sToolTipPeriodoImportExport=PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPeriodoImportExport+="(Contabilidad.PeriodoImportExport)";
		}
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			sToolTipPeriodoImportExport+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPeriodoImportExport = new JButtonMe();
		this.jButtonModificarPeriodoImportExport = new JButtonMe();
        this.jButtonActualizarPeriodoImportExport = new JButtonMe();
        this.jButtonEliminarPeriodoImportExport = new JButtonMe();
        this.jButtonCancelarPeriodoImportExport = new JButtonMe();
        this.jButtonGuardarCambiosPeriodoImportExport = new JButtonMe();
		this.jButtonGuardarCambiosTablaPeriodoImportExport = new JButtonMe();
		this.jButtonCerrarPeriodoImportExport = new JButtonMe();
		
		this.jScrollPanelDatosPeriodoImportExport = new JScrollPane();   
        this.jScrollPanelDatosEdicionPeriodoImportExport = new JScrollPane();
		this.jScrollPanelDatosGeneralPeriodoImportExport = new JScrollPane();
				
		
		
		this.jPanelCamposPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Periodo Importar Exportar";
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Periodo Importar Exportars" + this.sPath));
		} else {
			this.jScrollPanelDatosPeriodoImportExport.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPeriodoImportExport.setName("jPanelCamposPeriodoImportExport"); 

		this.jPanelCamposOcultosPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPeriodoImportExport.setName("jPanelCamposOcultosPeriodoImportExport"); 

        this.jPanelAccionesPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPeriodoImportExport.setToolTipText("Acciones");
        this.jPanelAccionesPeriodoImportExport.setName("Acciones"); 

		this.jPanelAccionesFormularioPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPeriodoImportExport.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPeriodoImportExport.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPeriodoImportExport.setText("Nuevo");
		this.jButtonModificarPeriodoImportExport.setText("Editar");
        this.jButtonActualizarPeriodoImportExport.setText("Actualizar");
        this.jButtonEliminarPeriodoImportExport.setText("Eliminar");
        this.jButtonCancelarPeriodoImportExport.setText("Cancelar");
        this.jButtonGuardarCambiosPeriodoImportExport.setText("Guardar");
		this.jButtonGuardarCambiosTablaPeriodoImportExport.setText("Guardar");
		this.jButtonCerrarPeriodoImportExport.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPeriodoImportExport,"nuevo_button","Nuevo",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPeriodoImportExport,"modificar_button","Editar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPeriodoImportExport,"actualizar_button","Actualizar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPeriodoImportExport,"eliminar_button","Eliminar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPeriodoImportExport,"cancelar_button","Cancelar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPeriodoImportExport,"guardarcambios_button","Guardar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPeriodoImportExport,"guardarcambiostabla_button","Guardar",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPeriodoImportExport,"cerrar_button","Salir",this.periodoimportexportSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPeriodoImportExport.setToolTipText("Nuevo"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPeriodoImportExport.setToolTipText("Editar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPeriodoImportExport.setToolTipText("Actualizar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPeriodoImportExport.setToolTipText("Eliminar)"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPeriodoImportExport.setToolTipText("Cancelar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPeriodoImportExport.setToolTipText("Guardar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPeriodoImportExport.setToolTipText("Guardar"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPeriodoImportExport.setToolTipText("Salir"+" "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPeriodoImportExport";
		inputMap = this.jButtonNuevoPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPeriodoImportExport.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPeriodoImportExport"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPeriodoImportExport";
		inputMap = this.jButtonActualizarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPeriodoImportExport"));
		
		//ELIMINAR
		sMapKey = "EliminarPeriodoImportExport";
		inputMap = this.jButtonEliminarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPeriodoImportExport"));
		
		//CANCELAR	
		sMapKey = "CancelarPeriodoImportExport";
		inputMap = this.jButtonCancelarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPeriodoImportExport"));
		
		//CERRAR		
		sMapKey = "CerrarPeriodoImportExport";
		inputMap = this.jButtonCerrarPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPeriodoImportExport"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPeriodoImportExport";
		inputMap = this.jButtonGuardarCambiosTablaPeriodoImportExport.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPeriodoImportExport"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPeriodoImportExport = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPeriodoImportExport.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPeriodoImportExport.setToolTipText("Nuevo PeriodoImportExport");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPeriodoImportExport = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPeriodoImportExport.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPeriodoImportExport.setToolTipText("Sin Cerrar Ventana PeriodoImportExport");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePeriodoImportExport = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePeriodoImportExport.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePeriodoImportExport.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPeriodoImportExport.setText("Accion");
		this.jComboBoxTiposAccionesPeriodoImportExport.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPeriodoImportExport = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPeriodoImportExport.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPeriodoImportExport.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPeriodoImportExport = new JLabelMe();
		
		this.jLabelAccionesPeriodoImportExport.setText("Acciones");		
		this.jLabelAccionesPeriodoImportExport.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoImportExport.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPeriodoImportExport.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPeriodoImportExport();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPeriodoImportExport();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPeriodoImportExport=new JTabbedPane();
		this.jTabbedPaneRelacionesPeriodoImportExport.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPeriodoImportExport,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPeriodoImportExport.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoImportExport.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPeriodoImportExport.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPeriodoImportExport.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodoImportExport.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPeriodoImportExport.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPeriodoImportExport, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPeriodoImportExport = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPeriodoImportExport = new GridBagLayout();
		
		this.jPanelCamposPeriodoImportExport.setLayout(gridaBagLayoutCamposPeriodoImportExport);
		this.jPanelCamposOcultosPeriodoImportExport.setLayout(gridaBagLayoutCamposOcultosPeriodoImportExport);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPeriodoImportExport.add(jLabelIdPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 1;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPeriodoImportExport.add(jTextFieldidPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);


	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPeriodoImportExport.add(jLabelcodigoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = 2;
		this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
		this.gridBagConstraintsPeriodoImportExport.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPeriodoImportExport.add(jButtoncodigoPeriodoImportExportBusqueda, this.gridBagConstraintsPeriodoImportExport);
	}

	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 1;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPeriodoImportExport.add(jTextFieldcodigoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);


	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPeriodoImportExport.add(jLabelid_anioPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = 2;
		this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
		this.gridBagConstraintsPeriodoImportExport.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPeriodoImportExport.add(jButtonid_anioPeriodoImportExportBusqueda, this.gridBagConstraintsPeriodoImportExport);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = 3;
		this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
		this.gridBagConstraintsPeriodoImportExport.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPeriodoImportExport.add(jButtonid_anioPeriodoImportExportUpdate, this.gridBagConstraintsPeriodoImportExport);
	}

	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 1;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPeriodoImportExport.add(jComboBoxid_anioPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);


	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPeriodoImportExport.add(jLabelid_mesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = 2;
		this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
		this.gridBagConstraintsPeriodoImportExport.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPeriodoImportExport.add(jButtonid_mesPeriodoImportExportBusqueda, this.gridBagConstraintsPeriodoImportExport);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		//this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = 3;
		this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
		this.gridBagConstraintsPeriodoImportExport.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPeriodoImportExport.add(jButtonid_mesPeriodoImportExportUpdate, this.gridBagConstraintsPeriodoImportExport);
	}

	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPeriodoImportExport.gridy = 0;
	this.gridBagConstraintsPeriodoImportExport.gridx = 1;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPeriodoImportExport.add(jComboBoxid_mesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoImportExport.gridy = iYPanelCamposPeriodoImportExport;
	this.gridBagConstraintsPeriodoImportExport.gridx = iXPanelCamposPeriodoImportExport++;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoImportExport.add(this.jPanelidPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(iXPanelCamposPeriodoImportExport % 1==0) {
		iXPanelCamposPeriodoImportExport=0;
		iYPanelCamposPeriodoImportExport++;
	}
	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoImportExport.gridy = iYPanelCamposPeriodoImportExport;
	this.gridBagConstraintsPeriodoImportExport.gridx = iXPanelCamposPeriodoImportExport++;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoImportExport.add(this.jPanelcodigoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(iXPanelCamposPeriodoImportExport % 1==0) {
		iXPanelCamposPeriodoImportExport=0;
		iYPanelCamposPeriodoImportExport++;
	}
	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoImportExport.gridy = iYPanelCamposPeriodoImportExport;
	this.gridBagConstraintsPeriodoImportExport.gridx = iXPanelCamposPeriodoImportExport++;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoImportExport.add(this.jPanelid_anioPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(iXPanelCamposPeriodoImportExport % 1==0) {
		iXPanelCamposPeriodoImportExport=0;
		iYPanelCamposPeriodoImportExport++;
	}
	this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPeriodoImportExport.gridy = iYPanelCamposPeriodoImportExport;
	this.gridBagConstraintsPeriodoImportExport.gridx = iXPanelCamposPeriodoImportExport++;
	this.gridBagConstraintsPeriodoImportExport.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPeriodoImportExport.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPeriodoImportExport.add(this.jPanelid_mesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);



	if(iXPanelCamposPeriodoImportExport % 1==0) {
		iXPanelCamposPeriodoImportExport=0;
		iYPanelCamposPeriodoImportExport++;
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
			
		GridBagLayout gridaBagLayoutAccionesPeriodoImportExport= new GridBagLayout();
		this.jPanelAccionesPeriodoImportExport.setLayout(gridaBagLayoutAccionesPeriodoImportExport);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPeriodoImportExport= new GridBagLayout();
		this.jPanelAccionesFormularioPeriodoImportExport.setLayout(gridaBagLayoutAccionesFormularioPeriodoImportExport);
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodoImportExport.add(this.jComboBoxTiposAccionesFormularioPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPeriodoImportExport.add(this.jCheckBoxPostAccionNuevoPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodoImportExport.add(this.jCheckBoxPostAccionSinCerrarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPeriodoImportExport.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPeriodoImportExport.add(this.jCheckBoxPostAccionSinMensajePeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccion++;
			
		this.jPanelAccionesPeriodoImportExport.add(this.jButtonModificarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);							

		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;
		this.gridBagConstraintsPeriodoImportExport.gridx =iPosXAccion++;
			
		this.jPanelAccionesPeriodoImportExport.add(this.jButtonEliminarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
			
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodoImportExport.add(this.jButtonActualizarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);


		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;		
		this.gridBagConstraintsPeriodoImportExport.gridx = iPosXAccion++;
		
		this.jPanelAccionesPeriodoImportExport.add(this.jButtonGuardarCambiosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);	
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = 0;		
		this.gridBagConstraintsPeriodoImportExport.gridx =iPosXAccion++;
		
		this.jPanelAccionesPeriodoImportExport.add(this.jButtonCancelarPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPeriodoImportExport = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPeriodoImportExport);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();						
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;		
			//this.gridBagConstraintsPeriodoImportExport.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPeriodoImportExport.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPeriodoImportExport.gridx =0;
		this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPeriodoImportExport.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePeriodoImportExport = new PeriodoImportExportBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Periodo Importar Exportar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Periodo Importar Exportar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Importar Exportar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PeriodoImportExportModel periodoimportexportModel=new PeriodoImportExportModel(this);
			
			//SI USARA CLASE INTERNA
			//PeriodoImportExportModel.PeriodoImportExportFocusTraversalPolicy periodoimportexportFocusTraversalPolicy = periodoimportexportModel.new PeriodoImportExportFocusTraversalPolicy(this);
			
			//periodoimportexportFocusTraversalPolicy.setperiodoimportexportJInternalFrame(this);
			
			this.setFocusTraversalPolicy(periodoimportexportModel);
			
			
			this.jContentPaneDetallePeriodoImportExport = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePeriodoImportExport = new GridBagLayout();	
			this.jContentPaneDetallePeriodoImportExport.setLayout(gridaBagLayoutDetallePeriodoImportExport);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPeriodoImportExport = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
				this.gridBagConstraintsPeriodoImportExport.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPeriodoImportExport.gridx = 0;
					
				
				this.jContentPaneDetallePeriodoImportExport.add(jTtoolBarDetallePeriodoImportExport, gridBagConstraintsPeriodoImportExport);								
				
}
			
			this.jScrollPanelDatosEdicionPeriodoImportExport=   new JScrollPane(jContentPaneDetallePeriodoImportExport,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodoImportExport.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoImportExport.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoImportExport.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPeriodoImportExport=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPeriodoImportExport.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoImportExport.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPeriodoImportExport.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPeriodoImportExport.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	        
			this.jContentPaneDetallePeriodoImportExport.add(jPanelCamposPeriodoImportExport, gridBagConstraintsPeriodoImportExport);
			
			
			
			
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
						&& periodoimportexportSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPeriodoImportExport= new GridBagConstraints();
						this.gridBagConstraintsPeriodoImportExport.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPeriodoImportExport.gridx = 0;
						this.jContentPaneDetallePeriodoImportExport.add(this.jTabbedPaneRelacionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPeriodoImportExport.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPeriodoImportExport.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
					this.gridBagConstraintsPeriodoImportExport.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPeriodoImportExport.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPeriodoImportExport.gridx = 0;
					
				
					this.jContentPaneDetallePeriodoImportExport.add(jPanelCamposOcultosPeriodoImportExport, gridBagConstraintsPeriodoImportExport);
				
					this.jPanelCamposOcultosPeriodoImportExport.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	        this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePeriodoImportExport.add(this.jPanelAccionesFormularioPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);							
			
			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
	        this.gridBagConstraintsPeriodoImportExport.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPeriodoImportExport.gridx = 0;
	        
			
			this.jContentPaneDetallePeriodoImportExport.add(this.jPanelAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPeriodoImportExport);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPeriodoImportExport=   new JScrollPane(this.jPanelCamposPeriodoImportExport,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPeriodoImportExport.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoImportExport.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPeriodoImportExport.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;
			this.gridBagConstraintsPeriodoImportExport.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPeriodoImportExport.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPeriodoImportExport.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);			
			
			this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
			this.gridBagConstraintsPeriodoImportExport.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPeriodoImportExport.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
			
			
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		
			
		this.gridBagConstraintsPeriodoImportExport = new GridBagConstraints();
		this.gridBagConstraintsPeriodoImportExport.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPeriodoImportExport.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPeriodoImportExport, this.gridBagConstraintsPeriodoImportExport);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPeriodoImportExport;//jContentPane;
		
		return jScrollPanelDatosEdicionPeriodoImportExport;
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
