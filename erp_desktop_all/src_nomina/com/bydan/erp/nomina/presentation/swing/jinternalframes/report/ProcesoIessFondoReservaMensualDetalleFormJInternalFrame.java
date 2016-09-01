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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaMensualConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoIessFondoReservaMensualDetalleFormJInternalFrame extends ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoIessFondoReservaMensual;
	
	protected JMenuBar jmenuBarDetalleProcesoIessFondoReservaMensual;
	
	protected JMenu jmenuDetalleProcesoIessFondoReservaMensual;
	protected JMenu jmenuDetalleArchivoProcesoIessFondoReservaMensual;
	protected JMenu jmenuDetalleAccionesProcesoIessFondoReservaMensual;
	protected JMenu jmenuDetalleDatosProcesoIessFondoReservaMensual;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoIessFondoReservaMensual;	
	protected GridBagConstraints gridBagConstraintsProcesoIessFondoReservaMensual;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoIessFondoReservaMensual;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected TipoProcesoNominaBeanSwingJInternalFrame tipoprocesonominaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesonomina="";
	
	public ProcesoIessFondoReservaMensualSessionBean procesoiessfondoreservamensualSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public TipoProcesoNominaSessionBean tipoprocesonominaSessionBean;	
	
	public ProcesoIessFondoReservaMensualLogic procesoiessfondoreservamensualLogic;
	
	public JScrollPane jScrollPanelDatosProcesoIessFondoReservaMensual;
	public JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReservaMensual;
	public JScrollPane jScrollPanelDatosGeneralProcesoIessFondoReservaMensual;
	
	protected JPanel jPanelCamposProcesoIessFondoReservaMensual;    
	protected JPanel jPanelCamposOcultosProcesoIessFondoReservaMensual;    	
	protected JPanel jPanelAccionesProcesoIessFondoReservaMensual;
	protected JPanel jPanelAccionesFormularioProcesoIessFondoReservaMensual;
    
	
	
	protected Integer iXPanelCamposProcesoIessFondoReservaMensual=0;
	protected Integer iYPanelCamposProcesoIessFondoReservaMensual=0;
	
	protected Integer iXPanelCamposOcultosProcesoIessFondoReservaMensual=0;
	protected Integer iYPanelCamposOcultosProcesoIessFondoReservaMensual=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoIessFondoReservaMensual;
	public JButton jButtonModificarProcesoIessFondoReservaMensual;
	public JButton jButtonActualizarProcesoIessFondoReservaMensual;
    public JButton jButtonEliminarProcesoIessFondoReservaMensual;
	public JButton jButtonCancelarProcesoIessFondoReservaMensual;
    public JButton jButtonGuardarCambiosProcesoIessFondoReservaMensual;
	public JButton jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual;
	protected JButton jButtonCerrarProcesoIessFondoReservaMensual;
	
	
	protected JButton jButtonProcesarInformacionProcesoIessFondoReservaMensual;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonModificarToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonActualizarToolBarProcesoIessFondoReservaMensual;
    protected JButton jButtonEliminarToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonCancelarToolBarProcesoIessFondoReservaMensual;
    protected JButton jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonCerrarToolBarProcesoIessFondoReservaMensual;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoIessFondoReservaMensual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemModificarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemActualizarProcesoIessFondoReservaMensual;
    protected JMenuItem jMenuItemEliminarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemCancelarProcesoIessFondoReservaMensual;
    protected JMenuItem jMenuItemGuardarCambiosProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemCerrarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemDetalleCerrarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemMostrarOcultarProcesoIessFondoReservaMensual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoIessFondoReservaMensual;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoIessFondoReservaMensual;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoIessFondoReservaMensual;
	public JLabel jLabelIdProcesoIessFondoReservaMensual;
	public JLabel jLabelidProcesoIessFondoReservaMensual;
	public JButton jButtonidProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesoIessFondoReservaMensual;
	public JLabel jLabelid_anioProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesoIessFondoReservaMensual;
	public JButton jButtonid_anioProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_anioProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_mesProcesoIessFondoReservaMensual;
	public JLabel jLabelid_mesProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProcesoIessFondoReservaMensual;
	public JButton jButtonid_mesProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_mesProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_mesProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_numero_patronalProcesoIessFondoReservaMensual;
	public JLabel jLabelid_numero_patronalProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalProcesoIessFondoReservaMensual;
	public JButton jButtonid_numero_patronalProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual;
	public JLabel jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual;
	public JButton jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoIessFondoReservaMensual;
	
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
	
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoIessFondoReservaMensual=new JPanel();
				this.jPanelAccionesFormularioProcesoIessFondoReservaMensual=new JPanel();
				this.jmenuBarDetalleProcesoIessFondoReservaMensual=new JMenuBar();
				this.jTtoolBarDetalleProcesoIessFondoReservaMensual=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoIessFondoReservaMensual() {
		return this.jButtonActualizarToolBarProcesoIessFondoReservaMensual;
	}
	
	public JButton getjButtonEliminarToolBarProcesoIessFondoReservaMensual() {
		return this.jButtonEliminarToolBarProcesoIessFondoReservaMensual;
	}
	
	public JButton getjButtonCancelarToolBarProcesoIessFondoReservaMensual() {
		return this.jButtonCancelarToolBarProcesoIessFondoReservaMensual;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoIessFondoReservaMensual() {
		return this.jButtonProcesarInformacionProcesoIessFondoReservaMensual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoIessFondoReservaMensual)	{
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual = jButtonProcesarInformacionProcesoIessFondoReservaMensual;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposRelacionesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual = jComboBoxTiposRelacionesProcesoIessFondoReservaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposAccionesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual = jComboBoxTiposAccionesProcesoIessFondoReservaMensual;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual = jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
		
		this.procesoiessfondoreservamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessfondoreservamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoIessFondoReservaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoIessFondoReservaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoIessFondoReservaMensualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Iess Fondo Reserva Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoIessFondoReservaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoIessFondoReservaMensual= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoIessFondoReservaMensual=new JButtonMe();
				this.jButtonModificarToolBarProcesoIessFondoReservaMensual=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoIessFondoReservaMensual,this.jTtoolBarDetalleProcesoIessFondoReservaMensual,
							"actualizar","actualizar","Actualizar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoIessFondoReservaMensual,this.jTtoolBarDetalleProcesoIessFondoReservaMensual,
							"eliminar","eliminar","Eliminar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoIessFondoReservaMensual,this.jTtoolBarDetalleProcesoIessFondoReservaMensual,
							"cancelar","cancelar","Cancelar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual,this.jTtoolBarDetalleProcesoIessFondoReservaMensual,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoIessFondoReservaMensual=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoIessFondoReservaMensual=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoIessFondoReservaMensual=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoIessFondoReservaMensual=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoIessFondoReservaMensual=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoIessFondoReservaMensual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoIessFondoReservaMensual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoIessFondoReservaMensual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoIessFondoReservaMensual= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoIessFondoReservaMensual.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoIessFondoReservaMensual,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoIessFondoReservaMensual= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoIessFondoReservaMensual.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoIessFondoReservaMensual,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoIessFondoReservaMensual= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoIessFondoReservaMensual.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoIessFondoReservaMensual,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoIessFondoReservaMensual= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoIessFondoReservaMensual.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoIessFondoReservaMensual,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoIessFondoReservaMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoIessFondoReservaMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoIessFondoReservaMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoIessFondoReservaMensual.add(this.jMenuItemDetalleCerrarProcesoIessFondoReservaMensual);
		
		this.jmenuDetalleAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemActualizarProcesoIessFondoReservaMensual);
		this.jmenuDetalleAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemEliminarProcesoIessFondoReservaMensual);
		this.jmenuDetalleAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemCancelarProcesoIessFondoReservaMensual);		
		
		//this.jmenuDetalleDatosProcesoIessFondoReservaMensual.add(this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual);				
		this.jmenuDetalleDatosProcesoIessFondoReservaMensual.add(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual);				
				
		//this.jmenuDetalleAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoIessFondoReservaMensual.add(this.jmenuDetalleArchivoProcesoIessFondoReservaMensual);		
		this.jmenuBarDetalleProcesoIessFondoReservaMensual.add(this.jmenuDetalleAccionesProcesoIessFondoReservaMensual);		
		this.jmenuBarDetalleProcesoIessFondoReservaMensual.add(this.jmenuDetalleDatosProcesoIessFondoReservaMensual);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoIessFondoReservaMensual);				
	}
	
	
	public void inicializarElementosCamposProcesoIessFondoReservaMensual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoIessFondoReservaMensual = new JLabelMe();
		jLabelIdProcesoIessFondoReservaMensual.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoIessFondoReservaMensual = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoIessFondoReservaMensual.setToolTipText(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoIessFondoReservaMensual= new GridBagLayout();

		this.jPanelidProcesoIessFondoReservaMensual.setLayout(this.gridaBagLayoutProcesoIessFondoReservaMensual);

		jLabelidProcesoIessFondoReservaMensual = new JLabel();
		jLabelidProcesoIessFondoReservaMensual.setText("Id");

		jLabelidProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoIessFondoReservaMensual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesoIessFondoReservaMensual = new JLabelMe();
		this.jLabelid_anioProcesoIessFondoReservaMensual.setText(""+ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesoIessFondoReservaMensual.setToolTipText("Anio");
		this.jLabelid_anioProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesoIessFondoReservaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesoIessFondoReservaMensual.setToolTipText(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesoIessFondoReservaMensual = new GridBagLayout();
		this.jPanelid_anioProcesoIessFondoReservaMensual.setLayout(this.gridaBagLayoutProcesoIessFondoReservaMensual);


		jComboBoxid_anioProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_anioProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesoIessFondoReservaMensual= new JButtonMe();
		this.jButtonid_anioProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonid_anioProcesoIessFondoReservaMensual.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesoIessFondoReservaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessFondoReservaMensual,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessFondoReservaMensual"));

		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda= new JButtonMe();
		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setText("U");
		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessFondoReservaMensualBusqueda"));

		if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesoIessFondoReservaMensualBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesoIessFondoReservaMensualUpdate= new JButtonMe();
		this.jButtonid_anioProcesoIessFondoReservaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessFondoReservaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoIessFondoReservaMensualUpdate.setText("U");
		this.jButtonid_anioProcesoIessFondoReservaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesoIessFondoReservaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessFondoReservaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessFondoReservaMensualUpdate"));



					
		this.jLabelid_mesProcesoIessFondoReservaMensual = new JLabelMe();
		this.jLabelid_mesProcesoIessFondoReservaMensual.setText(""+ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProcesoIessFondoReservaMensual.setToolTipText("Mes");
		this.jLabelid_mesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProcesoIessFondoReservaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProcesoIessFondoReservaMensual.setToolTipText(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProcesoIessFondoReservaMensual = new GridBagLayout();
		this.jPanelid_mesProcesoIessFondoReservaMensual.setLayout(this.gridaBagLayoutProcesoIessFondoReservaMensual);


		jComboBoxid_mesProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_mesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProcesoIessFondoReservaMensual= new JButtonMe();
		this.jButtonid_mesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonid_mesProcesoIessFondoReservaMensual.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProcesoIessFondoReservaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoIessFondoReservaMensual,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoIessFondoReservaMensual"));

		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda= new JButtonMe();
		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setText("U");
		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoIessFondoReservaMensualBusqueda"));

		if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProcesoIessFondoReservaMensualBusqueda.setVisible(false);		}

		this.jButtonid_mesProcesoIessFondoReservaMensualUpdate= new JButtonMe();
		this.jButtonid_mesProcesoIessFondoReservaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessFondoReservaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessFondoReservaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoIessFondoReservaMensualUpdate.setText("U");
		this.jButtonid_mesProcesoIessFondoReservaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProcesoIessFondoReservaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoIessFondoReservaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoIessFondoReservaMensualUpdate"));



					
		this.jLabelid_numero_patronalProcesoIessFondoReservaMensual = new JLabelMe();
		this.jLabelid_numero_patronalProcesoIessFondoReservaMensual.setText(""+ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL+" : *");
		this.jLabelid_numero_patronalProcesoIessFondoReservaMensual.setToolTipText("Numero Patronal");
		this.jLabelid_numero_patronalProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_numero_patronalProcesoIessFondoReservaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_numero_patronalProcesoIessFondoReservaMensual.setToolTipText(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		this.gridaBagLayoutProcesoIessFondoReservaMensual = new GridBagLayout();
		this.jPanelid_numero_patronalProcesoIessFondoReservaMensual.setLayout(this.gridaBagLayoutProcesoIessFondoReservaMensual);


		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessFondoReservaMensual,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessFondoReservaMensual"));

		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setText("U");
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessFondoReservaMensualBusqueda"));

		if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda.setVisible(false);		}

		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.setText("U");
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessFondoReservaMensualUpdate"));



					
		this.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual = new JLabelMe();
		this.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setText(""+ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA+" : *");
		this.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setToolTipText("Tipo Proceso Nomina");
		this.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setToolTipText(ProcesoIessFondoReservaMensualConstantesFunciones.LABEL_IDTIPOPROCESONOMINA);
		this.gridaBagLayoutProcesoIessFondoReservaMensual = new GridBagLayout();
		this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setLayout(this.gridaBagLayoutProcesoIessFondoReservaMensual);


		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual= new JButtonMe();
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensual,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensual"));

		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setText("U");
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda"));

		if(this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.setText("U");
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate"));



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
		//this.jInternalFrameDetalleProcesoIessFondoReservaMensual = new ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Iess Fondo Reserva Mensual DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoIessFondoReservaMensual= new GridBagLayout();
		

		
		String sToolTipProcesoIessFondoReservaMensual="";
		sToolTipProcesoIessFondoReservaMensual=ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoIessFondoReservaMensual+="(Nomina.ProcesoIessFondoReservaMensual)";
		}
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoIessFondoReservaMensual+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonModificarProcesoIessFondoReservaMensual = new JButtonMe();
        this.jButtonActualizarProcesoIessFondoReservaMensual = new JButtonMe();
        this.jButtonEliminarProcesoIessFondoReservaMensual = new JButtonMe();
        this.jButtonCancelarProcesoIessFondoReservaMensual = new JButtonMe();
        this.jButtonGuardarCambiosProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonCerrarProcesoIessFondoReservaMensual = new JButtonMe();
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Iess Fondo Reserva Mensual";
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reserva Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoIessFondoReservaMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoIessFondoReservaMensual.setName("jPanelCamposProcesoIessFondoReservaMensual"); 

		this.jPanelCamposOcultosProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoIessFondoReservaMensual.setName("jPanelCamposOcultosProcesoIessFondoReservaMensual"); 

        this.jPanelAccionesProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoIessFondoReservaMensual.setToolTipText("Acciones");
        this.jPanelAccionesProcesoIessFondoReservaMensual.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoIessFondoReservaMensual.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoIessFondoReservaMensual.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoIessFondoReservaMensual.setText("Nuevo");
		this.jButtonModificarProcesoIessFondoReservaMensual.setText("Editar");
        this.jButtonActualizarProcesoIessFondoReservaMensual.setText("Actualizar");
        this.jButtonEliminarProcesoIessFondoReservaMensual.setText("Eliminar");
        this.jButtonCancelarProcesoIessFondoReservaMensual.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoIessFondoReservaMensual.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.setText("Guardar");
		this.jButtonCerrarProcesoIessFondoReservaMensual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoIessFondoReservaMensual,"nuevo_button","Nuevo",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoIessFondoReservaMensual,"modificar_button","Editar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoIessFondoReservaMensual,"actualizar_button","Actualizar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoIessFondoReservaMensual,"eliminar_button","Eliminar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoIessFondoReservaMensual,"cancelar_button","Cancelar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoIessFondoReservaMensual,"guardarcambios_button","Guardar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual,"guardarcambiostabla_button","Guardar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoIessFondoReservaMensual,"cerrar_button","Salir",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoIessFondoReservaMensual.setToolTipText("Nuevo"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoIessFondoReservaMensual.setToolTipText("Editar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoIessFondoReservaMensual.setToolTipText("Actualizar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoIessFondoReservaMensual.setToolTipText("Eliminar)"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoIessFondoReservaMensual.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoIessFondoReservaMensual.setToolTipText("Guardar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.setToolTipText("Guardar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoIessFondoReservaMensual.setToolTipText("Salir"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoIessFondoReservaMensual";
		inputMap = this.jButtonNuevoProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoIessFondoReservaMensual"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonActualizarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoIessFondoReservaMensual"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonEliminarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoIessFondoReservaMensual"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonCancelarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoIessFondoReservaMensual"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonCerrarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoIessFondoReservaMensual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoIessFondoReservaMensual";
		inputMap = this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoIessFondoReservaMensual"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual.setToolTipText("Nuevo ProcesoIessFondoReservaMensual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual.setToolTipText("Sin Cerrar Ventana ProcesoIessFondoReservaMensual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setText("Accion");
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoIessFondoReservaMensual = new JLabelMe();
		
		this.jLabelAccionesProcesoIessFondoReservaMensual.setText("Acciones");		
		this.jLabelAccionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoIessFondoReservaMensual();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoIessFondoReservaMensual();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoIessFondoReservaMensual = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoIessFondoReservaMensual = new GridBagLayout();
		
		this.jPanelCamposProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutCamposProcesoIessFondoReservaMensual);
		this.jPanelCamposOcultosProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutCamposOcultosProcesoIessFondoReservaMensual);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoIessFondoReservaMensual.add(jLabelIdProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoIessFondoReservaMensual.add(jLabelidProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);


	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesoIessFondoReservaMensual.add(jLabelid_anioProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 2;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoIessFondoReservaMensual.add(jButtonid_anioProcesoIessFondoReservaMensualBusqueda, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 3;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoIessFondoReservaMensual.add(jButtonid_anioProcesoIessFondoReservaMensualUpdate, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesoIessFondoReservaMensual.add(jComboBoxid_anioProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);


	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProcesoIessFondoReservaMensual.add(jLabelid_mesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 2;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoIessFondoReservaMensual.add(jButtonid_mesProcesoIessFondoReservaMensualBusqueda, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 3;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoIessFondoReservaMensual.add(jButtonid_mesProcesoIessFondoReservaMensualUpdate, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProcesoIessFondoReservaMensual.add(jComboBoxid_mesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);


	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_numero_patronalProcesoIessFondoReservaMensual.add(jLabelid_numero_patronalProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 2;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalProcesoIessFondoReservaMensual.add(jButtonid_numero_patronalProcesoIessFondoReservaMensualBusqueda, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 3;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalProcesoIessFondoReservaMensual.add(jButtonid_numero_patronalProcesoIessFondoReservaMensualUpdate, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_numero_patronalProcesoIessFondoReservaMensual.add(jComboBoxid_numero_patronalProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);


	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.add(jLabelid_tipo_proceso_nominaProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 2;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.add(jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualBusqueda, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 3;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.add(jButtonid_tipo_proceso_nominaProcesoIessFondoReservaMensualUpdate, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	}

	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual.add(jComboBoxid_tipo_proceso_nominaProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iYPanelCamposProcesoIessFondoReservaMensual;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iXPanelCamposProcesoIessFondoReservaMensual++;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReservaMensual.add(this.jPanelidProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(iXPanelCamposProcesoIessFondoReservaMensual % 1==0) {
		iXPanelCamposProcesoIessFondoReservaMensual=0;
		iYPanelCamposProcesoIessFondoReservaMensual++;
	}
	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iYPanelCamposProcesoIessFondoReservaMensual;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iXPanelCamposProcesoIessFondoReservaMensual++;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReservaMensual.add(this.jPanelid_anioProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(iXPanelCamposProcesoIessFondoReservaMensual % 1==0) {
		iXPanelCamposProcesoIessFondoReservaMensual=0;
		iYPanelCamposProcesoIessFondoReservaMensual++;
	}
	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iYPanelCamposProcesoIessFondoReservaMensual;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iXPanelCamposProcesoIessFondoReservaMensual++;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReservaMensual.add(this.jPanelid_mesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(iXPanelCamposProcesoIessFondoReservaMensual % 1==0) {
		iXPanelCamposProcesoIessFondoReservaMensual=0;
		iYPanelCamposProcesoIessFondoReservaMensual++;
	}
	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iYPanelCamposProcesoIessFondoReservaMensual;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iXPanelCamposProcesoIessFondoReservaMensual++;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReservaMensual.add(this.jPanelid_numero_patronalProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(iXPanelCamposProcesoIessFondoReservaMensual % 1==0) {
		iXPanelCamposProcesoIessFondoReservaMensual=0;
		iYPanelCamposProcesoIessFondoReservaMensual++;
	}
	this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iYPanelCamposProcesoIessFondoReservaMensual;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iXPanelCamposProcesoIessFondoReservaMensual++;
	this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessFondoReservaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessFondoReservaMensual.add(this.jPanelid_tipo_proceso_nominaProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);



	if(iXPanelCamposProcesoIessFondoReservaMensual % 1==0) {
		iXPanelCamposProcesoIessFondoReservaMensual=0;
		iYPanelCamposProcesoIessFondoReservaMensual++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoIessFondoReservaMensual= new GridBagLayout();
		this.jPanelAccionesProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutAccionesProcesoIessFondoReservaMensual);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoIessFondoReservaMensual= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutAccionesFormularioProcesoIessFondoReservaMensual);
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoIessFondoReservaMensual.add(this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoIessFondoReservaMensual.add(this.jButtonModificarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);							

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoIessFondoReservaMensual.add(this.jButtonEliminarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
			
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoIessFondoReservaMensual.add(this.jButtonActualizarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);


		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoIessFondoReservaMensual.add(this.jButtonGuardarCambiosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);	
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoIessFondoReservaMensual.add(this.jButtonCancelarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoIessFondoReservaMensual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoIessFondoReservaMensual);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();						
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;		
			//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoIessFondoReservaMensual = new ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Iess Fondo Reserva Mensual DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Iess Fondo Reserva Mensual DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Iess Fondo Reserva Mensual Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoIessFondoReservaMensualModel procesoiessfondoreservamensualModel=new ProcesoIessFondoReservaMensualModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoIessFondoReservaMensualModel.ProcesoIessFondoReservaMensualFocusTraversalPolicy procesoiessfondoreservamensualFocusTraversalPolicy = procesoiessfondoreservamensualModel.new ProcesoIessFondoReservaMensualFocusTraversalPolicy(this);
			
			//procesoiessfondoreservamensualFocusTraversalPolicy.setprocesoiessfondoreservamensualJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoiessfondoreservamensualModel);
			
			
			this.jContentPaneDetalleProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoIessFondoReservaMensual = new GridBagLayout();	
			this.jContentPaneDetalleProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutDetalleProcesoIessFondoReservaMensual);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoIessFondoReservaMensual = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
				this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoIessFondoReservaMensual.add(jTtoolBarDetalleProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual=   new JScrollPane(jContentPaneDetalleProcesoIessFondoReservaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	        
			this.jContentPaneDetalleProcesoIessFondoReservaMensual.add(jPanelCamposProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);
			
			
			
			
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
						//&& procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoIessFondoReservaMensual= new GridBagConstraints();
						this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
						this.jContentPaneDetalleProcesoIessFondoReservaMensual.add(this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoIessFondoReservaMensual.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
					this.gridBagConstraintsProcesoIessFondoReservaMensual.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoIessFondoReservaMensual.add(jPanelCamposOcultosProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);
				
					this.jPanelCamposOcultosProcesoIessFondoReservaMensual.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	        this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoIessFondoReservaMensual.add(this.jPanelAccionesFormularioProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);							
			
			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
	        this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoIessFondoReservaMensual.add(this.jPanelAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoIessFondoReservaMensual);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual=   new JScrollPane(this.jPanelCamposProcesoIessFondoReservaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
			
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoIessFondoReservaMensual.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoIessFondoReservaMensual;
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
