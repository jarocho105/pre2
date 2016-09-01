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
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.activosfijos.util.report.ProcesarCalcularDepreciacionesConstantesFunciones;

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
public class ProcesarCalcularDepreciacionesDetalleFormJInternalFrame extends ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesarCalcularDepreciaciones;
	
	protected JMenuBar jmenuBarDetalleProcesarCalcularDepreciaciones;
	
	protected JMenu jmenuDetalleProcesarCalcularDepreciaciones;
	protected JMenu jmenuDetalleArchivoProcesarCalcularDepreciaciones;
	protected JMenu jmenuDetalleAccionesProcesarCalcularDepreciaciones;
	protected JMenu jmenuDetalleDatosProcesarCalcularDepreciaciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesarCalcularDepreciaciones;	
	protected GridBagConstraints gridBagConstraintsProcesarCalcularDepreciaciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesarCalcularDepreciaciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";

	protected SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subgrupoactivofijo="";
	
	public ProcesarCalcularDepreciacionesSessionBean procesarcalculardepreciacionesSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;	
	
	public ProcesarCalcularDepreciacionesLogic procesarcalculardepreciacionesLogic;
	
	public JScrollPane jScrollPanelDatosProcesarCalcularDepreciaciones;
	public JScrollPane jScrollPanelDatosEdicionProcesarCalcularDepreciaciones;
	public JScrollPane jScrollPanelDatosGeneralProcesarCalcularDepreciaciones;
	
	protected JPanel jPanelCamposProcesarCalcularDepreciaciones;    
	protected JPanel jPanelCamposOcultosProcesarCalcularDepreciaciones;    	
	protected JPanel jPanelAccionesProcesarCalcularDepreciaciones;
	protected JPanel jPanelAccionesFormularioProcesarCalcularDepreciaciones;
    
	
	
	protected Integer iXPanelCamposProcesarCalcularDepreciaciones=0;
	protected Integer iYPanelCamposProcesarCalcularDepreciaciones=0;
	
	protected Integer iXPanelCamposOcultosProcesarCalcularDepreciaciones=0;
	protected Integer iYPanelCamposOcultosProcesarCalcularDepreciaciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesarCalcularDepreciaciones;
	public JButton jButtonModificarProcesarCalcularDepreciaciones;
	public JButton jButtonActualizarProcesarCalcularDepreciaciones;
    public JButton jButtonEliminarProcesarCalcularDepreciaciones;
	public JButton jButtonCancelarProcesarCalcularDepreciaciones;
    public JButton jButtonGuardarCambiosProcesarCalcularDepreciaciones;
	public JButton jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones;
	protected JButton jButtonCerrarProcesarCalcularDepreciaciones;
	
	
	protected JButton jButtonProcesarInformacionProcesarCalcularDepreciaciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonModificarToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonActualizarToolBarProcesarCalcularDepreciaciones;
    protected JButton jButtonEliminarToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonCancelarToolBarProcesarCalcularDepreciaciones;
    protected JButton jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesarCalcularDepreciaciones;
	protected JButton jButtonCerrarToolBarProcesarCalcularDepreciaciones;
	
	protected JButton jButtonProcesarInformacionToolBarProcesarCalcularDepreciaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemModificarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemActualizarProcesarCalcularDepreciaciones;
    protected JMenuItem jMenuItemEliminarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemCancelarProcesarCalcularDepreciaciones;
    protected JMenuItem jMenuItemGuardarCambiosProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemCerrarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemDetalleCerrarProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesarCalcularDepreciaciones;
	protected JMenuItem jMenuItemMostrarOcultarProcesarCalcularDepreciaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesarCalcularDepreciaciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesarCalcularDepreciaciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesarCalcularDepreciaciones;
	public JLabel jLabelIdProcesarCalcularDepreciaciones;
	public JLabel jLabelidProcesarCalcularDepreciaciones;
	public JButton jButtonidProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesarCalcularDepreciaciones;
	public JLabel jLabelid_anioProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesarCalcularDepreciaciones;
	public JButton jButtonid_anioProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_anioProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_mesProcesarCalcularDepreciaciones;
	public JLabel jLabelid_mesProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProcesarCalcularDepreciaciones;
	public JButton jButtonid_mesProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_mesProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_mesProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones;
	public JLabel jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones;
	public JButton jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones;
	public JLabel jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones;
	public JButton jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesarCalcularDepreciaciones;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesarCalcularDepreciaciones=new JPanel();
				this.jPanelAccionesFormularioProcesarCalcularDepreciaciones=new JPanel();
				this.jmenuBarDetalleProcesarCalcularDepreciaciones=new JMenuBar();
				this.jTtoolBarDetalleProcesarCalcularDepreciaciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCalcularDepreciacionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesarCalcularDepreciaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesarCalcularDepreciaciones() {
		return this.jButtonActualizarToolBarProcesarCalcularDepreciaciones;
	}
	
	public JButton getjButtonEliminarToolBarProcesarCalcularDepreciaciones() {
		return this.jButtonEliminarToolBarProcesarCalcularDepreciaciones;
	}
	
	public JButton getjButtonCancelarToolBarProcesarCalcularDepreciaciones() {
		return this.jButtonCancelarToolBarProcesarCalcularDepreciaciones;
	}		
	
	public JButton getjButtonProcesarInformacionProcesarCalcularDepreciaciones() {
		return this.jButtonProcesarInformacionProcesarCalcularDepreciaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesarCalcularDepreciaciones)	{
		this.jButtonProcesarInformacionProcesarCalcularDepreciaciones = jButtonProcesarInformacionProcesarCalcularDepreciaciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposRelacionesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposRelacionesProcesarCalcularDepreciaciones = jComboBoxTiposRelacionesProcesarCalcularDepreciaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposAccionesProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones = jComboBoxTiposAccionesProcesarCalcularDepreciaciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones() {
		return this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones(
			JComboBox jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones) {
		this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones = jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesarcalculardepreciacionesSessionBean=new ProcesarCalcularDepreciacionesSessionBean();
		
		this.procesarcalculardepreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarcalculardepreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesarCalcularDepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesarCalcularDepreciacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesarCalcularDepreciacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Procesar Calcular Depreciaciones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesarCalcularDepreciacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesarCalcularDepreciaciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesarCalcularDepreciaciones=new JButtonMe();
				this.jButtonModificarToolBarProcesarCalcularDepreciaciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesarCalcularDepreciaciones,this.jTtoolBarDetalleProcesarCalcularDepreciaciones,
							"actualizar","actualizar","Actualizar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesarCalcularDepreciaciones,this.jTtoolBarDetalleProcesarCalcularDepreciaciones,
							"eliminar","eliminar","Eliminar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesarCalcularDepreciaciones,this.jTtoolBarDetalleProcesarCalcularDepreciaciones,
							"cancelar","cancelar","Cancelar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesarCalcularDepreciaciones,this.jTtoolBarDetalleProcesarCalcularDepreciaciones,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesarCalcularDepreciaciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesarCalcularDepreciaciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesarCalcularDepreciaciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesarCalcularDepreciaciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesarCalcularDepreciaciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesarCalcularDepreciaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesarCalcularDepreciaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesarCalcularDepreciaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesarCalcularDepreciaciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesarCalcularDepreciaciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesarCalcularDepreciaciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesarCalcularDepreciaciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesarCalcularDepreciaciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesarCalcularDepreciaciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesarCalcularDepreciaciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesarCalcularDepreciaciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesarCalcularDepreciaciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesarCalcularDepreciaciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesarCalcularDepreciaciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesarCalcularDepreciaciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesarCalcularDepreciaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesarCalcularDepreciaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesarCalcularDepreciaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesarCalcularDepreciaciones.add(this.jMenuItemDetalleCerrarProcesarCalcularDepreciaciones);
		
		this.jmenuDetalleAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemActualizarProcesarCalcularDepreciaciones);
		this.jmenuDetalleAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemEliminarProcesarCalcularDepreciaciones);
		this.jmenuDetalleAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemCancelarProcesarCalcularDepreciaciones);		
		
		//this.jmenuDetalleDatosProcesarCalcularDepreciaciones.add(this.jMenuItemDetalleAbrirOrderByProcesarCalcularDepreciaciones);				
		this.jmenuDetalleDatosProcesarCalcularDepreciaciones.add(this.jMenuItemDetalleMostarOcultarProcesarCalcularDepreciaciones);				
				
		//this.jmenuDetalleAccionesProcesarCalcularDepreciaciones.add(this.jMenuItemGuardarCambiosProcesarCalcularDepreciaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesarCalcularDepreciaciones.add(this.jmenuDetalleArchivoProcesarCalcularDepreciaciones);		
		this.jmenuBarDetalleProcesarCalcularDepreciaciones.add(this.jmenuDetalleAccionesProcesarCalcularDepreciaciones);		
		this.jmenuBarDetalleProcesarCalcularDepreciaciones.add(this.jmenuDetalleDatosProcesarCalcularDepreciaciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesarCalcularDepreciaciones);				
	}
	
	
	public void inicializarElementosCamposProcesarCalcularDepreciaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesarCalcularDepreciaciones = new JLabelMe();
		jLabelIdProcesarCalcularDepreciaciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesarCalcularDepreciaciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesarCalcularDepreciaciones.setToolTipText(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesarCalcularDepreciaciones= new GridBagLayout();

		this.jPanelidProcesarCalcularDepreciaciones.setLayout(this.gridaBagLayoutProcesarCalcularDepreciaciones);

		jLabelidProcesarCalcularDepreciaciones = new JLabel();
		jLabelidProcesarCalcularDepreciaciones.setText("Id");

		jLabelidProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesarCalcularDepreciaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesarCalcularDepreciaciones = new JLabelMe();
		this.jLabelid_anioProcesarCalcularDepreciaciones.setText(""+ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesarCalcularDepreciaciones.setToolTipText("Anio");
		this.jLabelid_anioProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesarCalcularDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesarCalcularDepreciaciones.setToolTipText(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesarCalcularDepreciaciones = new GridBagLayout();
		this.jPanelid_anioProcesarCalcularDepreciaciones.setLayout(this.gridaBagLayoutProcesarCalcularDepreciaciones);


		jComboBoxid_anioProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_anioProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesarCalcularDepreciaciones= new JButtonMe();
		this.jButtonid_anioProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonid_anioProcesarCalcularDepreciaciones.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesarCalcularDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesarCalcularDepreciaciones,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesarCalcularDepreciaciones"));

		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setText("U");
		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesarCalcularDepreciacionesBusqueda"));

		if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesarCalcularDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesarCalcularDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_anioProcesarCalcularDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarCalcularDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesarCalcularDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesarCalcularDepreciacionesUpdate.setText("U");
		this.jButtonid_anioProcesarCalcularDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesarCalcularDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesarCalcularDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesarCalcularDepreciacionesUpdate"));



					
		this.jLabelid_mesProcesarCalcularDepreciaciones = new JLabelMe();
		this.jLabelid_mesProcesarCalcularDepreciaciones.setText(""+ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProcesarCalcularDepreciaciones.setToolTipText("Mes");
		this.jLabelid_mesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProcesarCalcularDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProcesarCalcularDepreciaciones.setToolTipText(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProcesarCalcularDepreciaciones = new GridBagLayout();
		this.jPanelid_mesProcesarCalcularDepreciaciones.setLayout(this.gridaBagLayoutProcesarCalcularDepreciaciones);


		jComboBoxid_mesProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_mesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProcesarCalcularDepreciaciones= new JButtonMe();
		this.jButtonid_mesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonid_mesProcesarCalcularDepreciaciones.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProcesarCalcularDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesarCalcularDepreciaciones,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesarCalcularDepreciaciones"));

		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setText("U");
		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesarCalcularDepreciacionesBusqueda"));

		if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProcesarCalcularDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_mesProcesarCalcularDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_mesProcesarCalcularDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarCalcularDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesarCalcularDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesarCalcularDepreciacionesUpdate.setText("U");
		this.jButtonid_mesProcesarCalcularDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProcesarCalcularDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesarCalcularDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesarCalcularDepreciacionesUpdate"));



					
		this.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones = new JLabelMe();
		this.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setText(""+ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO+" : *");
		this.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setToolTipText("Detalle Grupo Activo Fijo");
		this.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setToolTipText(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		this.gridaBagLayoutProcesarCalcularDepreciaciones = new GridBagLayout();
		this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setLayout(this.gridaBagLayoutProcesarCalcularDepreciaciones);


		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones"));

		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));

		if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));



					
		this.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones = new JLabelMe();
		this.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setText(""+ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO+" : *");
		this.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setToolTipText("Sub Grupo Activo Fijo");
		this.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setToolTipText(ProcesarCalcularDepreciacionesConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO);
		this.gridaBagLayoutProcesarCalcularDepreciaciones = new GridBagLayout();
		this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setLayout(this.gridaBagLayoutProcesarCalcularDepreciaciones);


		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones= new JComboBoxMe();
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones= new JButtonMe();
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setText("Procesar");
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciaciones"));

		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda= new JButtonMe();
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setText("U");
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda"));

		if(this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda.setVisible(false);		}

		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate= new JButtonMe();
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setText("U");
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate"));



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
		//this.jInternalFrameDetalleProcesarCalcularDepreciaciones = new ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Procesar Calcular Depreciaciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesarCalcularDepreciaciones= new GridBagLayout();
		

		
		String sToolTipProcesarCalcularDepreciaciones="";
		sToolTipProcesarCalcularDepreciaciones=ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesarCalcularDepreciaciones+="(ActivosFijos.ProcesarCalcularDepreciaciones)";
		}
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesarCalcularDepreciaciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonModificarProcesarCalcularDepreciaciones = new JButtonMe();
        this.jButtonActualizarProcesarCalcularDepreciaciones = new JButtonMe();
        this.jButtonEliminarProcesarCalcularDepreciaciones = new JButtonMe();
        this.jButtonCancelarProcesarCalcularDepreciaciones = new JButtonMe();
        this.jButtonGuardarCambiosProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones = new JButtonMe();
		this.jButtonCerrarProcesarCalcularDepreciaciones = new JButtonMe();
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones = new JScrollPane();
				
		
		
		this.jPanelCamposProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Procesar Calcular Depreciaciones";
		
		if(!this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Calcular Depreciacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesarCalcularDepreciaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesarCalcularDepreciaciones.setName("jPanelCamposProcesarCalcularDepreciaciones"); 

		this.jPanelCamposOcultosProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesarCalcularDepreciaciones.setName("jPanelCamposOcultosProcesarCalcularDepreciaciones"); 

        this.jPanelAccionesProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesarCalcularDepreciaciones.setToolTipText("Acciones");
        this.jPanelAccionesProcesarCalcularDepreciaciones.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesarCalcularDepreciaciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesarCalcularDepreciaciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesarCalcularDepreciaciones.setText("Nuevo");
		this.jButtonModificarProcesarCalcularDepreciaciones.setText("Editar");
        this.jButtonActualizarProcesarCalcularDepreciaciones.setText("Actualizar");
        this.jButtonEliminarProcesarCalcularDepreciaciones.setText("Eliminar");
        this.jButtonCancelarProcesarCalcularDepreciaciones.setText("Cancelar");
        this.jButtonGuardarCambiosProcesarCalcularDepreciaciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.setText("Guardar");
		this.jButtonCerrarProcesarCalcularDepreciaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesarCalcularDepreciaciones,"nuevo_button","Nuevo",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesarCalcularDepreciaciones,"modificar_button","Editar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesarCalcularDepreciaciones,"actualizar_button","Actualizar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesarCalcularDepreciaciones,"eliminar_button","Eliminar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesarCalcularDepreciaciones,"cancelar_button","Cancelar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesarCalcularDepreciaciones,"guardarcambios_button","Guardar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones,"guardarcambiostabla_button","Guardar",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesarCalcularDepreciaciones,"cerrar_button","Salir",this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesarCalcularDepreciaciones.setToolTipText("Nuevo"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesarCalcularDepreciaciones.setToolTipText("Editar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesarCalcularDepreciaciones.setToolTipText("Actualizar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesarCalcularDepreciaciones.setToolTipText("Eliminar)"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesarCalcularDepreciaciones.setToolTipText("Cancelar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesarCalcularDepreciaciones.setToolTipText("Guardar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.setToolTipText("Guardar"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesarCalcularDepreciaciones.setToolTipText("Salir"+" "+ProcesarCalcularDepreciacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesarCalcularDepreciaciones";
		inputMap = this.jButtonNuevoProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesarCalcularDepreciaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesarCalcularDepreciaciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonActualizarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesarCalcularDepreciaciones"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonEliminarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesarCalcularDepreciaciones"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonCancelarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesarCalcularDepreciaciones"));
		
		//CERRAR		
		sMapKey = "CerrarProcesarCalcularDepreciaciones";
		inputMap = this.jButtonCerrarProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesarCalcularDepreciaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesarCalcularDepreciaciones";
		inputMap = this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesarCalcularDepreciaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesarCalcularDepreciaciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones.setToolTipText("Nuevo ProcesarCalcularDepreciaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones.setToolTipText("Sin Cerrar Ventana ProcesarCalcularDepreciaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setText("Accion");
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesarCalcularDepreciaciones = new JLabelMe();
		
		this.jLabelAccionesProcesarCalcularDepreciaciones.setText("Acciones");		
		this.jLabelAccionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesarCalcularDepreciaciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesarCalcularDepreciaciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesarCalcularDepreciaciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesarCalcularDepreciaciones = new GridBagLayout();
		
		this.jPanelCamposProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutCamposProcesarCalcularDepreciaciones);
		this.jPanelCamposOcultosProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutCamposOcultosProcesarCalcularDepreciaciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesarCalcularDepreciaciones.add(jLabelIdProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesarCalcularDepreciaciones.add(jLabelidProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);


	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesarCalcularDepreciaciones.add(jLabelid_anioProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 2;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesarCalcularDepreciaciones.add(jButtonid_anioProcesarCalcularDepreciacionesBusqueda, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 3;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesarCalcularDepreciaciones.add(jButtonid_anioProcesarCalcularDepreciacionesUpdate, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesarCalcularDepreciaciones.add(jComboBoxid_anioProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);


	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProcesarCalcularDepreciaciones.add(jLabelid_mesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 2;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesarCalcularDepreciaciones.add(jButtonid_mesProcesarCalcularDepreciacionesBusqueda, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 3;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesarCalcularDepreciaciones.add(jButtonid_mesProcesarCalcularDepreciacionesUpdate, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProcesarCalcularDepreciaciones.add(jComboBoxid_mesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);


	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jLabelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 2;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 3;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jButtonid_detalle_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jComboBoxid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);


	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jLabelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 2;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesBusqueda, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 3;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jButtonid_sub_grupo_activo_fijoProcesarCalcularDepreciacionesUpdate, this.gridBagConstraintsProcesarCalcularDepreciaciones);
	}

	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 1;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones.add(jComboBoxid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iYPanelCamposProcesarCalcularDepreciaciones;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iXPanelCamposProcesarCalcularDepreciaciones++;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarCalcularDepreciaciones.add(this.jPanelidProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(iXPanelCamposProcesarCalcularDepreciaciones % 1==0) {
		iXPanelCamposProcesarCalcularDepreciaciones=0;
		iYPanelCamposProcesarCalcularDepreciaciones++;
	}
	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iYPanelCamposProcesarCalcularDepreciaciones;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iXPanelCamposProcesarCalcularDepreciaciones++;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarCalcularDepreciaciones.add(this.jPanelid_anioProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(iXPanelCamposProcesarCalcularDepreciaciones % 1==0) {
		iXPanelCamposProcesarCalcularDepreciaciones=0;
		iYPanelCamposProcesarCalcularDepreciaciones++;
	}
	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iYPanelCamposProcesarCalcularDepreciaciones;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iXPanelCamposProcesarCalcularDepreciaciones++;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarCalcularDepreciaciones.add(this.jPanelid_mesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(iXPanelCamposProcesarCalcularDepreciaciones % 1==0) {
		iXPanelCamposProcesarCalcularDepreciaciones=0;
		iYPanelCamposProcesarCalcularDepreciaciones++;
	}
	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iYPanelCamposProcesarCalcularDepreciaciones;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iXPanelCamposProcesarCalcularDepreciaciones++;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarCalcularDepreciaciones.add(this.jPanelid_detalle_grupo_activo_fijoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(iXPanelCamposProcesarCalcularDepreciaciones % 1==0) {
		iXPanelCamposProcesarCalcularDepreciaciones=0;
		iYPanelCamposProcesarCalcularDepreciaciones++;
	}
	this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iYPanelCamposProcesarCalcularDepreciaciones;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iXPanelCamposProcesarCalcularDepreciaciones++;
	this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarCalcularDepreciaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarCalcularDepreciaciones.add(this.jPanelid_sub_grupo_activo_fijoProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);



	if(iXPanelCamposProcesarCalcularDepreciaciones % 1==0) {
		iXPanelCamposProcesarCalcularDepreciaciones=0;
		iYPanelCamposProcesarCalcularDepreciaciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesarCalcularDepreciaciones= new GridBagLayout();
		this.jPanelAccionesProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutAccionesProcesarCalcularDepreciaciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesarCalcularDepreciaciones= new GridBagLayout();
		this.jPanelAccionesFormularioProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutAccionesFormularioProcesarCalcularDepreciaciones);
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesarCalcularDepreciaciones.add(this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesarCalcularDepreciaciones.add(this.jButtonModificarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);							

		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesarCalcularDepreciaciones.add(this.jButtonEliminarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
			
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesarCalcularDepreciaciones.add(this.jButtonActualizarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);


		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesarCalcularDepreciaciones.add(this.jButtonGuardarCambiosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);	
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = 0;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesarCalcularDepreciaciones.add(this.jButtonCancelarProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesarCalcularDepreciaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesarCalcularDepreciaciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesarcalculardepreciacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();						
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;		
			//this.gridBagConstraintsProcesarCalcularDepreciaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesarCalcularDepreciaciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =0;
		this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesarCalcularDepreciaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesarCalcularDepreciacionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesarCalcularDepreciaciones = new ProcesarCalcularDepreciacionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Procesar Calcular Depreciaciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Procesar Calcular Depreciaciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Procesar Calcular Depreciaciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesarCalcularDepreciacionesModel procesarcalculardepreciacionesModel=new ProcesarCalcularDepreciacionesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesarCalcularDepreciacionesModel.ProcesarCalcularDepreciacionesFocusTraversalPolicy procesarcalculardepreciacionesFocusTraversalPolicy = procesarcalculardepreciacionesModel.new ProcesarCalcularDepreciacionesFocusTraversalPolicy(this);
			
			//procesarcalculardepreciacionesFocusTraversalPolicy.setprocesarcalculardepreciacionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesarcalculardepreciacionesModel);
			
			
			this.jContentPaneDetalleProcesarCalcularDepreciaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesarCalcularDepreciaciones = new GridBagLayout();	
			this.jContentPaneDetalleProcesarCalcularDepreciaciones.setLayout(gridaBagLayoutDetalleProcesarCalcularDepreciaciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesarCalcularDepreciaciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
				this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
					
				
				this.jContentPaneDetalleProcesarCalcularDepreciaciones.add(jTtoolBarDetalleProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);								
				
}
			
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones=   new JScrollPane(jContentPaneDetalleProcesarCalcularDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	        
			this.jContentPaneDetalleProcesarCalcularDepreciaciones.add(jPanelCamposProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);
			
			
			
			
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
						//&& procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesarcalculardepreciacionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesarCalcularDepreciaciones= new GridBagConstraints();
						this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
						this.jContentPaneDetalleProcesarCalcularDepreciaciones.add(this.jTabbedPaneRelacionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesarCalcularDepreciaciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesarCalcularDepreciaciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
					this.gridBagConstraintsProcesarCalcularDepreciaciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
					
				
					this.jContentPaneDetalleProcesarCalcularDepreciaciones.add(jPanelCamposOcultosProcesarCalcularDepreciaciones, gridBagConstraintsProcesarCalcularDepreciaciones);
				
					this.jPanelCamposOcultosProcesarCalcularDepreciaciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	        this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesarCalcularDepreciaciones.add(this.jPanelAccionesFormularioProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);							
			
			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
	        this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesarCalcularDepreciaciones.add(this.jPanelAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesarCalcularDepreciaciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones=   new JScrollPane(this.jPanelCamposProcesarCalcularDepreciaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesarCalcularDepreciaciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);			
			
			this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
			
			
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		
			
		this.gridBagConstraintsProcesarCalcularDepreciaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCalcularDepreciaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesarCalcularDepreciaciones, this.gridBagConstraintsProcesarCalcularDepreciaciones);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesarCalcularDepreciaciones.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesarCalcularDepreciaciones.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesarCalcularDepreciaciones.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesarCalcularDepreciaciones.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesarCalcularDepreciaciones.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesarCalcularDepreciaciones.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesarCalcularDepreciaciones;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesarCalcularDepreciaciones;
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
