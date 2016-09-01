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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ProcesarMayorizarConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ProcesarMayorizarDetalleFormJInternalFrame extends ProcesarMayorizarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesarMayorizar;
	
	protected JMenuBar jmenuBarDetalleProcesarMayorizar;
	
	protected JMenu jmenuDetalleProcesarMayorizar;
	protected JMenu jmenuDetalleArchivoProcesarMayorizar;
	protected JMenu jmenuDetalleAccionesProcesarMayorizar;
	protected JMenu jmenuDetalleDatosProcesarMayorizar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesarMayorizar;	
	protected GridBagConstraints gridBagConstraintsProcesarMayorizar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesarMayorizarBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesarMayorizar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";
	
	public ProcesarMayorizarSessionBean procesarmayorizarSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;	
	
	public ProcesarMayorizarLogic procesarmayorizarLogic;
	
	public JScrollPane jScrollPanelDatosProcesarMayorizar;
	public JScrollPane jScrollPanelDatosEdicionProcesarMayorizar;
	public JScrollPane jScrollPanelDatosGeneralProcesarMayorizar;
	
	protected JPanel jPanelCamposProcesarMayorizar;    
	protected JPanel jPanelCamposOcultosProcesarMayorizar;    	
	protected JPanel jPanelAccionesProcesarMayorizar;
	protected JPanel jPanelAccionesFormularioProcesarMayorizar;
    
	
	
	protected Integer iXPanelCamposProcesarMayorizar=0;
	protected Integer iYPanelCamposProcesarMayorizar=0;
	
	protected Integer iXPanelCamposOcultosProcesarMayorizar=0;
	protected Integer iYPanelCamposOcultosProcesarMayorizar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesarMayorizar;
	public JButton jButtonModificarProcesarMayorizar;
	public JButton jButtonActualizarProcesarMayorizar;
    public JButton jButtonEliminarProcesarMayorizar;
	public JButton jButtonCancelarProcesarMayorizar;
    public JButton jButtonGuardarCambiosProcesarMayorizar;
	public JButton jButtonGuardarCambiosTablaProcesarMayorizar;
	protected JButton jButtonCerrarProcesarMayorizar;
	
	
	protected JButton jButtonProcesarInformacionProcesarMayorizar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesarMayorizar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesarMayorizar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesarMayorizar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesarMayorizar;
	protected JButton jButtonModificarToolBarProcesarMayorizar;
	protected JButton jButtonActualizarToolBarProcesarMayorizar;
    protected JButton jButtonEliminarToolBarProcesarMayorizar;
	protected JButton jButtonCancelarToolBarProcesarMayorizar;
    protected JButton jButtonGuardarCambiosToolBarProcesarMayorizar;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesarMayorizar;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesarMayorizar;
	protected JButton jButtonCerrarToolBarProcesarMayorizar;
	
	protected JButton jButtonProcesarInformacionToolBarProcesarMayorizar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesarMayorizar;
	protected JMenuItem jMenuItemModificarProcesarMayorizar;
	protected JMenuItem jMenuItemActualizarProcesarMayorizar;
    protected JMenuItem jMenuItemEliminarProcesarMayorizar;
	protected JMenuItem jMenuItemCancelarProcesarMayorizar;
    protected JMenuItem jMenuItemGuardarCambiosProcesarMayorizar;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesarMayorizar;
	protected JMenuItem jMenuItemCerrarProcesarMayorizar;
	protected JMenuItem jMenuItemDetalleCerrarProcesarMayorizar;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesarMayorizar;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesarMayorizar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesarMayorizar;
	protected JMenuItem jMenuItemMostrarOcultarProcesarMayorizar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesarMayorizar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesarMayorizar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesarMayorizar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesarMayorizar;
	public JLabel jLabelIdProcesarMayorizar;
	public JLabel jLabelidProcesarMayorizar;
	public JButton jButtonidProcesarMayorizarBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesarMayorizar;
	public JLabel jLabelcodigoProcesarMayorizar;
	public JTextField jTextFieldcodigoProcesarMayorizar;
	public JButton jButtoncodigoProcesarMayorizarBusqueda= new JButtonMe();

	public JPanel jPanelnombreProcesarMayorizar;
	public JLabel jLabelnombreProcesarMayorizar;
	public JTextArea jTextAreanombreProcesarMayorizar;
	public JScrollPane jscrollPanenombreProcesarMayorizar;
	public JButton jButtonnombreProcesarMayorizarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesarMayorizar;
	public JLabel jLabelid_anioProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesarMayorizar;
	public JButton jButtonid_anioProcesarMayorizar= new JButtonMe();
	public JButton jButtonid_anioProcesarMayorizarUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesarMayorizarBusqueda= new JButtonMe();

	public JPanel jPanelid_mesProcesarMayorizar;
	public JLabel jLabelid_mesProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProcesarMayorizar;
	public JButton jButtonid_mesProcesarMayorizar= new JButtonMe();
	public JButton jButtonid_mesProcesarMayorizarUpdate= new JButtonMe();
	public JButton jButtonid_mesProcesarMayorizarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoProcesarMayorizar;
	public JLabel jLabelid_tipo_documentoProcesarMayorizar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoProcesarMayorizar;
	public JButton jButtonid_tipo_documentoProcesarMayorizar= new JButtonMe();
	public JButton jButtonid_tipo_documentoProcesarMayorizarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoProcesarMayorizarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesarMayorizar;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesarMayorizarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesarMayorizar=new JPanel();
				this.jPanelAccionesFormularioProcesarMayorizar=new JPanel();
				this.jmenuBarDetalleProcesarMayorizar=new JMenuBar();
				this.jTtoolBarDetalleProcesarMayorizar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesarMayorizarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarMayorizarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesarMayorizar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesarMayorizar() {
		return this.jButtonActualizarToolBarProcesarMayorizar;
	}
	
	public JButton getjButtonEliminarToolBarProcesarMayorizar() {
		return this.jButtonEliminarToolBarProcesarMayorizar;
	}
	
	public JButton getjButtonCancelarToolBarProcesarMayorizar() {
		return this.jButtonCancelarToolBarProcesarMayorizar;
	}		
	
	public JButton getjButtonProcesarInformacionProcesarMayorizar() {
		return this.jButtonProcesarInformacionProcesarMayorizar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesarMayorizar)	{
		this.jButtonProcesarInformacionProcesarMayorizar = jButtonProcesarInformacionProcesarMayorizar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesarMayorizar() {
		return this.jComboBoxTiposAccionesProcesarMayorizar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesarMayorizar(
			JComboBox jComboBoxTiposRelacionesProcesarMayorizar) {
		this.jComboBoxTiposRelacionesProcesarMayorizar = jComboBoxTiposRelacionesProcesarMayorizar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesarMayorizar(
			JComboBox jComboBoxTiposAccionesProcesarMayorizar) {
		this.jComboBoxTiposAccionesProcesarMayorizar = jComboBoxTiposAccionesProcesarMayorizar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesarMayorizar() {
		return this.jComboBoxTiposAccionesFormularioProcesarMayorizar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesarMayorizar(
			JComboBox jComboBoxTiposAccionesFormularioProcesarMayorizar) {
		this.jComboBoxTiposAccionesFormularioProcesarMayorizar = jComboBoxTiposAccionesFormularioProcesarMayorizar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesarmayorizarSessionBean=new ProcesarMayorizarSessionBean();
		
		this.procesarmayorizarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarmayorizarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesarmayorizarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesarMayorizarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesarMayorizarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesarMayorizarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Procesar Mayorizar MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesarMayorizarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesarMayorizar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesarMayorizar=new JButtonMe();
				this.jButtonModificarToolBarProcesarMayorizar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesarMayorizar,this.jTtoolBarDetalleProcesarMayorizar,
							"actualizar","actualizar","Actualizar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesarMayorizar,this.jTtoolBarDetalleProcesarMayorizar,
							"eliminar","eliminar","Eliminar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesarMayorizar,this.jTtoolBarDetalleProcesarMayorizar,
							"cancelar","cancelar","Cancelar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesarMayorizar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesarMayorizar,this.jTtoolBarDetalleProcesarMayorizar,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesarMayorizar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesarMayorizar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesarMayorizar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesarMayorizar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesarMayorizar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesarMayorizar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesarMayorizar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesarMayorizar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesarMayorizar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesarMayorizar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesarMayorizar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesarMayorizar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesarMayorizar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesarMayorizar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesarMayorizar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesarMayorizar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesarMayorizar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesarMayorizar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesarMayorizar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesarMayorizar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesarMayorizar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesarMayorizar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesarMayorizar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesarMayorizar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesarMayorizar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesarMayorizar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesarMayorizar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesarMayorizar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesarMayorizar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesarMayorizar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesarMayorizar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesarMayorizar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesarMayorizar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesarMayorizar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesarMayorizar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesarMayorizar.add(this.jMenuItemDetalleCerrarProcesarMayorizar);
		
		this.jmenuDetalleAccionesProcesarMayorizar.add(this.jMenuItemActualizarProcesarMayorizar);
		this.jmenuDetalleAccionesProcesarMayorizar.add(this.jMenuItemEliminarProcesarMayorizar);
		this.jmenuDetalleAccionesProcesarMayorizar.add(this.jMenuItemCancelarProcesarMayorizar);		
		
		//this.jmenuDetalleDatosProcesarMayorizar.add(this.jMenuItemDetalleAbrirOrderByProcesarMayorizar);				
		this.jmenuDetalleDatosProcesarMayorizar.add(this.jMenuItemDetalleMostarOcultarProcesarMayorizar);				
				
		//this.jmenuDetalleAccionesProcesarMayorizar.add(this.jMenuItemGuardarCambiosProcesarMayorizar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesarMayorizar.add(this.jmenuDetalleArchivoProcesarMayorizar);		
		this.jmenuBarDetalleProcesarMayorizar.add(this.jmenuDetalleAccionesProcesarMayorizar);		
		this.jmenuBarDetalleProcesarMayorizar.add(this.jmenuDetalleDatosProcesarMayorizar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesarMayorizar);				
	}
	
	
	public void inicializarElementosCamposProcesarMayorizar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesarMayorizar = new JLabelMe();
		jLabelIdProcesarMayorizar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesarMayorizar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesarMayorizar.setToolTipText(ProcesarMayorizarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesarMayorizar= new GridBagLayout();

		this.jPanelidProcesarMayorizar.setLayout(this.gridaBagLayoutProcesarMayorizar);

		jLabelidProcesarMayorizar = new JLabel();
		jLabelidProcesarMayorizar.setText("Id");

		jLabelidProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProcesarMayorizar = new JLabelMe();
		this.jLabelcodigoProcesarMayorizar.setText(""+ProcesarMayorizarConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesarMayorizar.setToolTipText("Codigo");
		this.jLabelcodigoProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesarMayorizar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesarMayorizar.setToolTipText(ProcesarMayorizarConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		this.jPanelcodigoProcesarMayorizar.setLayout(this.gridaBagLayoutProcesarMayorizar);


		jTextFieldcodigoProcesarMayorizar= new JTextFieldMe();

		jTextFieldcodigoProcesarMayorizar.setEnabled(false);
		jTextFieldcodigoProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesarMayorizarBusqueda= new JButtonMe();
		this.jButtoncodigoProcesarMayorizarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesarMayorizarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesarMayorizarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesarMayorizarBusqueda.setText("U");
		this.jButtoncodigoProcesarMayorizarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesarMayorizarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesarMayorizarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesarMayorizarBusqueda"));

		if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesarMayorizarBusqueda.setVisible(false);		}


					
		this.jLabelnombreProcesarMayorizar = new JLabelMe();
		this.jLabelnombreProcesarMayorizar.setText(""+ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProcesarMayorizar.setToolTipText("Nombre");
		this.jLabelnombreProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProcesarMayorizar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProcesarMayorizar.setToolTipText(ProcesarMayorizarConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		this.jPanelnombreProcesarMayorizar.setLayout(this.gridaBagLayoutProcesarMayorizar);


		jTextAreanombreProcesarMayorizar= new JTextAreaMe();
		jTextAreanombreProcesarMayorizar.setEnabled(false);
		jTextAreanombreProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProcesarMayorizar.setLineWrap(true);
		jTextAreanombreProcesarMayorizar.setWrapStyleWord(true);
		jTextAreanombreProcesarMayorizar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProcesarMayorizar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProcesarMayorizar = new JScrollPane(jTextAreanombreProcesarMayorizar);
		jscrollPanenombreProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProcesarMayorizarBusqueda= new JButtonMe();
		this.jButtonnombreProcesarMayorizarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesarMayorizarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProcesarMayorizarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProcesarMayorizarBusqueda.setText("U");
		this.jButtonnombreProcesarMayorizarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProcesarMayorizarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProcesarMayorizarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProcesarMayorizarBusqueda"));

		if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProcesarMayorizarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesarMayorizar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesarMayorizar = new JLabelMe();
		this.jLabelid_anioProcesarMayorizar.setText(""+ProcesarMayorizarConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesarMayorizar.setToolTipText("Anio");
		this.jLabelid_anioProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesarMayorizar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesarMayorizar.setToolTipText(ProcesarMayorizarConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		this.jPanelid_anioProcesarMayorizar.setLayout(this.gridaBagLayoutProcesarMayorizar);


		jComboBoxid_anioProcesarMayorizar= new JComboBoxMe();
		jComboBoxid_anioProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesarMayorizar= new JButtonMe();
		this.jButtonid_anioProcesarMayorizar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesarMayorizar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesarMayorizar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesarMayorizar.setText("Buscar");
		this.jButtonid_anioProcesarMayorizar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesarMayorizar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesarMayorizar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesarMayorizar"));

		this.jButtonid_anioProcesarMayorizarBusqueda= new JButtonMe();
		this.jButtonid_anioProcesarMayorizarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarMayorizarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarMayorizarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesarMayorizarBusqueda.setText("U");
		this.jButtonid_anioProcesarMayorizarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesarMayorizarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesarMayorizarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesarMayorizarBusqueda"));

		if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesarMayorizarBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesarMayorizarUpdate= new JButtonMe();
		this.jButtonid_anioProcesarMayorizarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarMayorizarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarMayorizarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesarMayorizarUpdate.setText("U");
		this.jButtonid_anioProcesarMayorizarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesarMayorizarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesarMayorizarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesarMayorizarUpdate"));



					
		this.jLabelid_mesProcesarMayorizar = new JLabelMe();
		this.jLabelid_mesProcesarMayorizar.setText(""+ProcesarMayorizarConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProcesarMayorizar.setToolTipText("Mes");
		this.jLabelid_mesProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProcesarMayorizar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProcesarMayorizar.setToolTipText(ProcesarMayorizarConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		this.jPanelid_mesProcesarMayorizar.setLayout(this.gridaBagLayoutProcesarMayorizar);


		jComboBoxid_mesProcesarMayorizar= new JComboBoxMe();
		jComboBoxid_mesProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProcesarMayorizar= new JButtonMe();
		this.jButtonid_mesProcesarMayorizar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesarMayorizar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesarMayorizar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesarMayorizar.setText("Buscar");
		this.jButtonid_mesProcesarMayorizar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProcesarMayorizar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesarMayorizar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesarMayorizar"));

		this.jButtonid_mesProcesarMayorizarBusqueda= new JButtonMe();
		this.jButtonid_mesProcesarMayorizarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarMayorizarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarMayorizarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesarMayorizarBusqueda.setText("U");
		this.jButtonid_mesProcesarMayorizarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProcesarMayorizarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesarMayorizarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesarMayorizarBusqueda"));

		if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProcesarMayorizarBusqueda.setVisible(false);		}

		this.jButtonid_mesProcesarMayorizarUpdate= new JButtonMe();
		this.jButtonid_mesProcesarMayorizarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarMayorizarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarMayorizarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesarMayorizarUpdate.setText("U");
		this.jButtonid_mesProcesarMayorizarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProcesarMayorizarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesarMayorizarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesarMayorizarUpdate"));



					
		this.jLabelid_tipo_documentoProcesarMayorizar = new JLabelMe();
		this.jLabelid_tipo_documentoProcesarMayorizar.setText(""+ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoProcesarMayorizar.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoProcesarMayorizar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoProcesarMayorizar.setToolTipText(ProcesarMayorizarConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		this.jPanelid_tipo_documentoProcesarMayorizar.setLayout(this.gridaBagLayoutProcesarMayorizar);


		jComboBoxid_tipo_documentoProcesarMayorizar= new JComboBoxMe();
		jComboBoxid_tipo_documentoProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoProcesarMayorizar= new JButtonMe();
		this.jButtonid_tipo_documentoProcesarMayorizar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesarMayorizar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesarMayorizar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesarMayorizar.setText("Buscar");
		this.jButtonid_tipo_documentoProcesarMayorizar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoProcesarMayorizar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesarMayorizar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesarMayorizar"));

		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setText("U");
		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesarMayorizarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesarMayorizarBusqueda"));

		if(this.procesarmayorizarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoProcesarMayorizarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoProcesarMayorizarUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoProcesarMayorizarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesarMayorizarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesarMayorizarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoProcesarMayorizarUpdate.setText("U");
		this.jButtonid_tipo_documentoProcesarMayorizarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoProcesarMayorizarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesarMayorizarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoProcesarMayorizar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesarMayorizar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesarMayorizarUpdate"));



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
		//this.jInternalFrameDetalleProcesarMayorizar = new ProcesarMayorizarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Procesar Mayorizar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesarMayorizar= new GridBagLayout();
		

		
		String sToolTipProcesarMayorizar="";
		sToolTipProcesarMayorizar=ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesarMayorizar+="(ActivosFijos.ProcesarMayorizar)";
		}
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesarMayorizar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesarMayorizar = new JButtonMe();
		this.jButtonModificarProcesarMayorizar = new JButtonMe();
        this.jButtonActualizarProcesarMayorizar = new JButtonMe();
        this.jButtonEliminarProcesarMayorizar = new JButtonMe();
        this.jButtonCancelarProcesarMayorizar = new JButtonMe();
        this.jButtonGuardarCambiosProcesarMayorizar = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesarMayorizar = new JButtonMe();
		this.jButtonCerrarProcesarMayorizar = new JButtonMe();
		
		this.jScrollPanelDatosProcesarMayorizar = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesarMayorizar = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesarMayorizar = new JScrollPane();
				
		
		
		this.jPanelCamposProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Procesar Mayorizar";
		
		if(!this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Mayorizares" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesarMayorizar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesarMayorizar.setName("jPanelCamposProcesarMayorizar"); 

		this.jPanelCamposOcultosProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesarMayorizar.setName("jPanelCamposOcultosProcesarMayorizar"); 

        this.jPanelAccionesProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesarMayorizar.setToolTipText("Acciones");
        this.jPanelAccionesProcesarMayorizar.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesarMayorizar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesarMayorizar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesarMayorizar.setText("Nuevo");
		this.jButtonModificarProcesarMayorizar.setText("Editar");
        this.jButtonActualizarProcesarMayorizar.setText("Actualizar");
        this.jButtonEliminarProcesarMayorizar.setText("Eliminar");
        this.jButtonCancelarProcesarMayorizar.setText("Cancelar");
        this.jButtonGuardarCambiosProcesarMayorizar.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesarMayorizar.setText("Guardar");
		this.jButtonCerrarProcesarMayorizar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesarMayorizar,"nuevo_button","Nuevo",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesarMayorizar,"modificar_button","Editar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesarMayorizar,"actualizar_button","Actualizar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesarMayorizar,"eliminar_button","Eliminar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesarMayorizar,"cancelar_button","Cancelar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesarMayorizar,"guardarcambios_button","Guardar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesarMayorizar,"guardarcambiostabla_button","Guardar",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesarMayorizar,"cerrar_button","Salir",this.procesarmayorizarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesarMayorizar.setToolTipText("Nuevo"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesarMayorizar.setToolTipText("Editar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesarMayorizar.setToolTipText("Actualizar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesarMayorizar.setToolTipText("Eliminar)"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesarMayorizar.setToolTipText("Cancelar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesarMayorizar.setToolTipText("Guardar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesarMayorizar.setToolTipText("Guardar"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesarMayorizar.setToolTipText("Salir"+" "+ProcesarMayorizarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesarMayorizar";
		inputMap = this.jButtonNuevoProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesarMayorizar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesarMayorizar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesarMayorizar";
		inputMap = this.jButtonActualizarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesarMayorizar"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesarMayorizar";
		inputMap = this.jButtonEliminarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesarMayorizar"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesarMayorizar";
		inputMap = this.jButtonCancelarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesarMayorizar"));
		
		//CERRAR		
		sMapKey = "CerrarProcesarMayorizar";
		inputMap = this.jButtonCerrarProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesarMayorizar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesarMayorizar";
		inputMap = this.jButtonGuardarCambiosTablaProcesarMayorizar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesarMayorizar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesarMayorizar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesarMayorizar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesarMayorizar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesarMayorizar.setToolTipText("Nuevo ProcesarMayorizar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesarMayorizar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesarMayorizar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesarMayorizar.setToolTipText("Sin Cerrar Ventana ProcesarMayorizar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesarMayorizar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesarMayorizar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesarMayorizar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesarMayorizar.setText("Accion");
		this.jComboBoxTiposAccionesProcesarMayorizar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesarMayorizar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesarMayorizar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesarMayorizar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesarMayorizar = new JLabelMe();
		
		this.jLabelAccionesProcesarMayorizar.setText("Acciones");		
		this.jLabelAccionesProcesarMayorizar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarMayorizar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarMayorizar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesarMayorizar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesarMayorizar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesarMayorizar=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesarMayorizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesarMayorizar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesarMayorizar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarMayorizar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarMayorizar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesarMayorizar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesarMayorizar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesarMayorizar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesarMayorizar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesarMayorizar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesarMayorizar = new GridBagLayout();
		
		this.jPanelCamposProcesarMayorizar.setLayout(gridaBagLayoutCamposProcesarMayorizar);
		this.jPanelCamposOcultosProcesarMayorizar.setLayout(gridaBagLayoutCamposOcultosProcesarMayorizar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesarMayorizar.add(jLabelIdProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 1;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesarMayorizar.add(jLabelidProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesarMayorizar.add(jLabelid_anioProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 2;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesarMayorizar.add(jButtonid_anioProcesarMayorizarBusqueda, this.gridBagConstraintsProcesarMayorizar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 3;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesarMayorizar.add(jButtonid_anioProcesarMayorizarUpdate, this.gridBagConstraintsProcesarMayorizar);
	}

	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 1;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesarMayorizar.add(jComboBoxid_anioProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProcesarMayorizar.add(jLabelid_mesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 2;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesarMayorizar.add(jButtonid_mesProcesarMayorizarBusqueda, this.gridBagConstraintsProcesarMayorizar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 3;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesarMayorizar.add(jButtonid_mesProcesarMayorizarUpdate, this.gridBagConstraintsProcesarMayorizar);
	}

	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 1;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProcesarMayorizar.add(jComboBoxid_mesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoProcesarMayorizar.add(jLabelid_tipo_documentoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 2;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoProcesarMayorizar.add(jButtonid_tipo_documentoProcesarMayorizarBusqueda, this.gridBagConstraintsProcesarMayorizar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 3;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoProcesarMayorizar.add(jButtonid_tipo_documentoProcesarMayorizarUpdate, this.gridBagConstraintsProcesarMayorizar);
	}

	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 1;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoProcesarMayorizar.add(jComboBoxid_tipo_documentoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesarMayorizar.add(jLabelcodigoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 2;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesarMayorizar.add(jButtoncodigoProcesarMayorizarBusqueda, this.gridBagConstraintsProcesarMayorizar);
	}

	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 1;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesarMayorizar.add(jTextFieldcodigoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProcesarMayorizar.add(jLabelnombreProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		//this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = 2;
		this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
		this.gridBagConstraintsProcesarMayorizar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProcesarMayorizar.add(jButtonnombreProcesarMayorizarBusqueda, this.gridBagConstraintsProcesarMayorizar);
	}

	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarMayorizar.gridy = 0;
	this.gridBagConstraintsProcesarMayorizar.gridx = 1;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProcesarMayorizar.add(jscrollPanenombreProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarMayorizar.gridy = iYPanelCamposProcesarMayorizar;
	this.gridBagConstraintsProcesarMayorizar.gridx = iXPanelCamposProcesarMayorizar++;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarMayorizar.add(this.jPanelidProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(iXPanelCamposProcesarMayorizar % 1==0) {
		iXPanelCamposProcesarMayorizar=0;
		iYPanelCamposProcesarMayorizar++;
	}
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarMayorizar.gridy = iYPanelCamposProcesarMayorizar;
	this.gridBagConstraintsProcesarMayorizar.gridx = iXPanelCamposProcesarMayorizar++;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarMayorizar.add(this.jPanelid_anioProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(iXPanelCamposProcesarMayorizar % 1==0) {
		iXPanelCamposProcesarMayorizar=0;
		iYPanelCamposProcesarMayorizar++;
	}
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarMayorizar.gridy = iYPanelCamposProcesarMayorizar;
	this.gridBagConstraintsProcesarMayorizar.gridx = iXPanelCamposProcesarMayorizar++;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarMayorizar.add(this.jPanelid_mesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(iXPanelCamposProcesarMayorizar % 1==0) {
		iXPanelCamposProcesarMayorizar=0;
		iYPanelCamposProcesarMayorizar++;
	}
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarMayorizar.gridy = iYPanelCamposProcesarMayorizar;
	this.gridBagConstraintsProcesarMayorizar.gridx = iXPanelCamposProcesarMayorizar++;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarMayorizar.add(this.jPanelid_tipo_documentoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(iXPanelCamposProcesarMayorizar % 1==0) {
		iXPanelCamposProcesarMayorizar=0;
		iYPanelCamposProcesarMayorizar++;
	}
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarMayorizar.gridy = iYPanelCamposProcesarMayorizar;
	this.gridBagConstraintsProcesarMayorizar.gridx = iXPanelCamposProcesarMayorizar++;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarMayorizar.add(this.jPanelcodigoProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(iXPanelCamposProcesarMayorizar % 1==0) {
		iXPanelCamposProcesarMayorizar=0;
		iYPanelCamposProcesarMayorizar++;
	}
	this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarMayorizar.gridy = iYPanelCamposProcesarMayorizar;
	this.gridBagConstraintsProcesarMayorizar.gridx = iXPanelCamposProcesarMayorizar++;
	this.gridBagConstraintsProcesarMayorizar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarMayorizar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarMayorizar.add(this.jPanelnombreProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);



	if(iXPanelCamposProcesarMayorizar % 1==0) {
		iXPanelCamposProcesarMayorizar=0;
		iYPanelCamposProcesarMayorizar++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesarMayorizar= new GridBagLayout();
		this.jPanelAccionesProcesarMayorizar.setLayout(gridaBagLayoutAccionesProcesarMayorizar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesarMayorizar= new GridBagLayout();
		this.jPanelAccionesFormularioProcesarMayorizar.setLayout(gridaBagLayoutAccionesFormularioProcesarMayorizar);
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesarMayorizar.add(this.jComboBoxTiposAccionesFormularioProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesarMayorizar.add(this.jButtonModificarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);							

		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;
		this.gridBagConstraintsProcesarMayorizar.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesarMayorizar.add(this.jButtonEliminarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
			
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesarMayorizar.add(this.jButtonActualizarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);


		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;		
		this.gridBagConstraintsProcesarMayorizar.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesarMayorizar.add(this.jButtonGuardarCambiosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);	
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = 0;		
		this.gridBagConstraintsProcesarMayorizar.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesarMayorizar.add(this.jButtonCancelarProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesarMayorizar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesarMayorizar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesarmayorizarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();						
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;		
			//this.gridBagConstraintsProcesarMayorizar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesarMayorizar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesarMayorizar.gridx =0;
		this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesarMayorizar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesarMayorizarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesarMayorizar = new ProcesarMayorizarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Procesar Mayorizar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Procesar Mayorizar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Procesar Mayorizar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesarMayorizarModel procesarmayorizarModel=new ProcesarMayorizarModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesarMayorizarModel.ProcesarMayorizarFocusTraversalPolicy procesarmayorizarFocusTraversalPolicy = procesarmayorizarModel.new ProcesarMayorizarFocusTraversalPolicy(this);
			
			//procesarmayorizarFocusTraversalPolicy.setprocesarmayorizarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesarmayorizarModel);
			
			
			this.jContentPaneDetalleProcesarMayorizar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesarMayorizar = new GridBagLayout();	
			this.jContentPaneDetalleProcesarMayorizar.setLayout(gridaBagLayoutDetalleProcesarMayorizar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesarMayorizar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
				this.gridBagConstraintsProcesarMayorizar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesarMayorizar.gridx = 0;
					
				
				this.jContentPaneDetalleProcesarMayorizar.add(jTtoolBarDetalleProcesarMayorizar, gridBagConstraintsProcesarMayorizar);								
				
}
			
			this.jScrollPanelDatosEdicionProcesarMayorizar=   new JScrollPane(jContentPaneDetalleProcesarMayorizar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesarMayorizar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarMayorizar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarMayorizar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesarMayorizar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesarMayorizar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarMayorizar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarMayorizar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesarMayorizar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	        
			this.jContentPaneDetalleProcesarMayorizar.add(jPanelCamposProcesarMayorizar, gridBagConstraintsProcesarMayorizar);
			
			
			
			
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
						//&& procesarmayorizarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesarmayorizarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesarMayorizar= new GridBagConstraints();
						this.gridBagConstraintsProcesarMayorizar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesarMayorizar.gridx = 0;
						this.jContentPaneDetalleProcesarMayorizar.add(this.jTabbedPaneRelacionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesarMayorizar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesarMayorizar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
					this.gridBagConstraintsProcesarMayorizar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesarMayorizar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesarMayorizar.gridx = 0;
					
				
					this.jContentPaneDetalleProcesarMayorizar.add(jPanelCamposOcultosProcesarMayorizar, gridBagConstraintsProcesarMayorizar);
				
					this.jPanelCamposOcultosProcesarMayorizar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	        this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesarMayorizar.add(this.jPanelAccionesFormularioProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);							
			
			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
	        this.gridBagConstraintsProcesarMayorizar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesarMayorizar.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesarMayorizar.add(this.jPanelAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesarMayorizar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesarMayorizar=   new JScrollPane(this.jPanelCamposProcesarMayorizar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesarMayorizar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarMayorizar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarMayorizar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;
			this.gridBagConstraintsProcesarMayorizar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesarMayorizar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesarMayorizar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);			
			
			this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
			this.gridBagConstraintsProcesarMayorizar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesarMayorizar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
			
			
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		
			
		this.gridBagConstraintsProcesarMayorizar = new GridBagConstraints();
		this.gridBagConstraintsProcesarMayorizar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesarMayorizar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesarMayorizar, this.gridBagConstraintsProcesarMayorizar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesarMayorizar;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesarMayorizar;
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
