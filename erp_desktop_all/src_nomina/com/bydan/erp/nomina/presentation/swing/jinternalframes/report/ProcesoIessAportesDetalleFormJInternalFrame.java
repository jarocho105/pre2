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
import com.bydan.erp.nomina.util.report.ProcesoIessAportesConstantesFunciones;

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
public class ProcesoIessAportesDetalleFormJInternalFrame extends ProcesoIessAportesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoIessAportes;
	
	protected JMenuBar jmenuBarDetalleProcesoIessAportes;
	
	protected JMenu jmenuDetalleProcesoIessAportes;
	protected JMenu jmenuDetalleArchivoProcesoIessAportes;
	protected JMenu jmenuDetalleAccionesProcesoIessAportes;
	protected JMenu jmenuDetalleDatosProcesoIessAportes;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoIessAportes;	
	protected GridBagConstraints gridBagConstraintsProcesoIessAportes;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoIessAportesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoIessAportes;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoafiliacion="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";
	
	public ProcesoIessAportesSessionBean procesoiessaportesSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;	
	
	public ProcesoIessAportesLogic procesoiessaportesLogic;
	
	public JScrollPane jScrollPanelDatosProcesoIessAportes;
	public JScrollPane jScrollPanelDatosEdicionProcesoIessAportes;
	public JScrollPane jScrollPanelDatosGeneralProcesoIessAportes;
	
	protected JPanel jPanelCamposProcesoIessAportes;    
	protected JPanel jPanelCamposOcultosProcesoIessAportes;    	
	protected JPanel jPanelAccionesProcesoIessAportes;
	protected JPanel jPanelAccionesFormularioProcesoIessAportes;
    
	
	
	protected Integer iXPanelCamposProcesoIessAportes=0;
	protected Integer iYPanelCamposProcesoIessAportes=0;
	
	protected Integer iXPanelCamposOcultosProcesoIessAportes=0;
	protected Integer iYPanelCamposOcultosProcesoIessAportes=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoIessAportes;
	public JButton jButtonModificarProcesoIessAportes;
	public JButton jButtonActualizarProcesoIessAportes;
    public JButton jButtonEliminarProcesoIessAportes;
	public JButton jButtonCancelarProcesoIessAportes;
    public JButton jButtonGuardarCambiosProcesoIessAportes;
	public JButton jButtonGuardarCambiosTablaProcesoIessAportes;
	protected JButton jButtonCerrarProcesoIessAportes;
	
	
	protected JButton jButtonProcesarInformacionProcesoIessAportes;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoIessAportes;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoIessAportes;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoIessAportes;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoIessAportes;
	protected JButton jButtonModificarToolBarProcesoIessAportes;
	protected JButton jButtonActualizarToolBarProcesoIessAportes;
    protected JButton jButtonEliminarToolBarProcesoIessAportes;
	protected JButton jButtonCancelarToolBarProcesoIessAportes;
    protected JButton jButtonGuardarCambiosToolBarProcesoIessAportes;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoIessAportes;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoIessAportes;
	protected JButton jButtonCerrarToolBarProcesoIessAportes;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoIessAportes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoIessAportes;
	protected JMenuItem jMenuItemModificarProcesoIessAportes;
	protected JMenuItem jMenuItemActualizarProcesoIessAportes;
    protected JMenuItem jMenuItemEliminarProcesoIessAportes;
	protected JMenuItem jMenuItemCancelarProcesoIessAportes;
    protected JMenuItem jMenuItemGuardarCambiosProcesoIessAportes;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoIessAportes;
	protected JMenuItem jMenuItemCerrarProcesoIessAportes;
	protected JMenuItem jMenuItemDetalleCerrarProcesoIessAportes;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoIessAportes;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoIessAportes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoIessAportes;
	protected JMenuItem jMenuItemMostrarOcultarProcesoIessAportes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoIessAportes;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoIessAportes;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoIessAportes;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoIessAportes;
	public JLabel jLabelIdProcesoIessAportes;
	public JLabel jLabelidProcesoIessAportes;
	public JButton jButtonidProcesoIessAportesBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeProcesoIessAportes;
	public JLabel jLabelporcentajeProcesoIessAportes;
	public JTextField jTextFieldporcentajeProcesoIessAportes;
	public JButton jButtonporcentajeProcesoIessAportesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesoIessAportes;
	public JLabel jLabelid_anioProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesoIessAportes;
	public JButton jButtonid_anioProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_anioProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesoIessAportesBusqueda= new JButtonMe();

	public JPanel jPanelid_mesProcesoIessAportes;
	public JLabel jLabelid_mesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProcesoIessAportes;
	public JButton jButtonid_mesProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_mesProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_mesProcesoIessAportesBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_afiliacionProcesoIessAportes;
	public JLabel jLabelid_tipo_afiliacionProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_afiliacionProcesoIessAportes;
	public JButton jButtonid_tipo_afiliacionProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionProcesoIessAportesBusqueda= new JButtonMe();

	public JPanel jPanelid_numero_patronalProcesoIessAportes;
	public JLabel jLabelid_numero_patronalProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalProcesoIessAportes;
	public JButton jButtonid_numero_patronalProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_numero_patronalProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalProcesoIessAportesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoIessAportes;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoIessAportesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoIessAportes=new JPanel();
				this.jPanelAccionesFormularioProcesoIessAportes=new JPanel();
				this.jmenuBarDetalleProcesoIessAportes=new JMenuBar();
				this.jTtoolBarDetalleProcesoIessAportes=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoIessAportesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoIessAportes() {
		return this.jButtonActualizarToolBarProcesoIessAportes;
	}
	
	public JButton getjButtonEliminarToolBarProcesoIessAportes() {
		return this.jButtonEliminarToolBarProcesoIessAportes;
	}
	
	public JButton getjButtonCancelarToolBarProcesoIessAportes() {
		return this.jButtonCancelarToolBarProcesoIessAportes;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoIessAportes() {
		return this.jButtonProcesarInformacionProcesoIessAportes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoIessAportes)	{
		this.jButtonProcesarInformacionProcesoIessAportes = jButtonProcesarInformacionProcesoIessAportes;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoIessAportes() {
		return this.jComboBoxTiposAccionesProcesoIessAportes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoIessAportes(
			JComboBox jComboBoxTiposRelacionesProcesoIessAportes) {
		this.jComboBoxTiposRelacionesProcesoIessAportes = jComboBoxTiposRelacionesProcesoIessAportes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoIessAportes(
			JComboBox jComboBoxTiposAccionesProcesoIessAportes) {
		this.jComboBoxTiposAccionesProcesoIessAportes = jComboBoxTiposAccionesProcesoIessAportes;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoIessAportes() {
		return this.jComboBoxTiposAccionesFormularioProcesoIessAportes;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoIessAportes(
			JComboBox jComboBoxTiposAccionesFormularioProcesoIessAportes) {
		this.jComboBoxTiposAccionesFormularioProcesoIessAportes = jComboBoxTiposAccionesFormularioProcesoIessAportes;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
		
		this.procesoiessaportesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessaportesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoiessaportesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoIessAportesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoIessAportesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoIessAportesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Iess Aportes MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoIessAportesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoIessAportes= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoIessAportes=new JButtonMe();
				this.jButtonModificarToolBarProcesoIessAportes=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoIessAportes,this.jTtoolBarDetalleProcesoIessAportes,
							"actualizar","actualizar","Actualizar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoIessAportes,this.jTtoolBarDetalleProcesoIessAportes,
							"eliminar","eliminar","Eliminar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoIessAportes,this.jTtoolBarDetalleProcesoIessAportes,
							"cancelar","cancelar","Cancelar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoIessAportes,this.jTtoolBarDetalleProcesoIessAportes,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoIessAportes=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoIessAportes=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoIessAportes=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoIessAportes=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoIessAportes=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoIessAportes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoIessAportes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoIessAportes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoIessAportes= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoIessAportes.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoIessAportes,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoIessAportes= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoIessAportes.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoIessAportes,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoIessAportes= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoIessAportes.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoIessAportes,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoIessAportes= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoIessAportes.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoIessAportes,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoIessAportes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoIessAportes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoIessAportes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoIessAportes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoIessAportes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoIessAportes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoIessAportes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoIessAportes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoIessAportes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoIessAportes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoIessAportes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoIessAportes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoIessAportes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoIessAportes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoIessAportes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoIessAportes.add(this.jMenuItemDetalleCerrarProcesoIessAportes);
		
		this.jmenuDetalleAccionesProcesoIessAportes.add(this.jMenuItemActualizarProcesoIessAportes);
		this.jmenuDetalleAccionesProcesoIessAportes.add(this.jMenuItemEliminarProcesoIessAportes);
		this.jmenuDetalleAccionesProcesoIessAportes.add(this.jMenuItemCancelarProcesoIessAportes);		
		
		//this.jmenuDetalleDatosProcesoIessAportes.add(this.jMenuItemDetalleAbrirOrderByProcesoIessAportes);				
		this.jmenuDetalleDatosProcesoIessAportes.add(this.jMenuItemDetalleMostarOcultarProcesoIessAportes);				
				
		//this.jmenuDetalleAccionesProcesoIessAportes.add(this.jMenuItemGuardarCambiosProcesoIessAportes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoIessAportes.add(this.jmenuDetalleArchivoProcesoIessAportes);		
		this.jmenuBarDetalleProcesoIessAportes.add(this.jmenuDetalleAccionesProcesoIessAportes);		
		this.jmenuBarDetalleProcesoIessAportes.add(this.jmenuDetalleDatosProcesoIessAportes);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoIessAportes);				
	}
	
	
	public void inicializarElementosCamposProcesoIessAportes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoIessAportes = new JLabelMe();
		jLabelIdProcesoIessAportes.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoIessAportes = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoIessAportes.setToolTipText(ProcesoIessAportesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoIessAportes= new GridBagLayout();

		this.jPanelidProcesoIessAportes.setLayout(this.gridaBagLayoutProcesoIessAportes);

		jLabelidProcesoIessAportes = new JLabel();
		jLabelidProcesoIessAportes.setText("Id");

		jLabelidProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeProcesoIessAportes = new JLabelMe();
		this.jLabelporcentajeProcesoIessAportes.setText(""+ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeProcesoIessAportes.setToolTipText("Porcentaje");
		this.jLabelporcentajeProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeProcesoIessAportes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeProcesoIessAportes.setToolTipText(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		this.jPanelporcentajeProcesoIessAportes.setLayout(this.gridaBagLayoutProcesoIessAportes);


		jTextFieldporcentajeProcesoIessAportes= new JTextFieldMe();
		jTextFieldporcentajeProcesoIessAportes.setEnabled(false);
		jTextFieldporcentajeProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeProcesoIessAportes.setText("0.0");

		this.jButtonporcentajeProcesoIessAportesBusqueda= new JButtonMe();
		this.jButtonporcentajeProcesoIessAportesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProcesoIessAportesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProcesoIessAportesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeProcesoIessAportesBusqueda.setText("U");
		this.jButtonporcentajeProcesoIessAportesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeProcesoIessAportesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeProcesoIessAportesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeProcesoIessAportesBusqueda"));

		if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeProcesoIessAportesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoIessAportes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesoIessAportes = new JLabelMe();
		this.jLabelid_anioProcesoIessAportes.setText(""+ProcesoIessAportesConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesoIessAportes.setToolTipText("Anio");
		this.jLabelid_anioProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesoIessAportes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesoIessAportes.setToolTipText(ProcesoIessAportesConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		this.jPanelid_anioProcesoIessAportes.setLayout(this.gridaBagLayoutProcesoIessAportes);


		jComboBoxid_anioProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_anioProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesoIessAportes= new JButtonMe();
		this.jButtonid_anioProcesoIessAportes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessAportes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessAportes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoIessAportes.setText("Procesar");
		this.jButtonid_anioProcesoIessAportes.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesoIessAportes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessAportes,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessAportes"));

		this.jButtonid_anioProcesoIessAportesBusqueda= new JButtonMe();
		this.jButtonid_anioProcesoIessAportesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessAportesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessAportesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoIessAportesBusqueda.setText("U");
		this.jButtonid_anioProcesoIessAportesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesoIessAportesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessAportesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessAportesBusqueda"));

		if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesoIessAportesBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesoIessAportesUpdate= new JButtonMe();
		this.jButtonid_anioProcesoIessAportesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessAportesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoIessAportesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoIessAportesUpdate.setText("U");
		this.jButtonid_anioProcesoIessAportesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesoIessAportesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoIessAportesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoIessAportesUpdate"));



					
		this.jLabelid_mesProcesoIessAportes = new JLabelMe();
		this.jLabelid_mesProcesoIessAportes.setText(""+ProcesoIessAportesConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProcesoIessAportes.setToolTipText("Mes");
		this.jLabelid_mesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProcesoIessAportes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProcesoIessAportes.setToolTipText(ProcesoIessAportesConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		this.jPanelid_mesProcesoIessAportes.setLayout(this.gridaBagLayoutProcesoIessAportes);


		jComboBoxid_mesProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_mesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesProcesoIessAportes= new JButtonMe();
		this.jButtonid_mesProcesoIessAportes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoIessAportes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoIessAportes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProcesoIessAportes.setText("Procesar");
		this.jButtonid_mesProcesoIessAportes.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProcesoIessAportes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoIessAportes,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoIessAportes"));

		this.jButtonid_mesProcesoIessAportesBusqueda= new JButtonMe();
		this.jButtonid_mesProcesoIessAportesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessAportesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessAportesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoIessAportesBusqueda.setText("U");
		this.jButtonid_mesProcesoIessAportesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProcesoIessAportesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoIessAportesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoIessAportesBusqueda"));

		if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProcesoIessAportesBusqueda.setVisible(false);		}

		this.jButtonid_mesProcesoIessAportesUpdate= new JButtonMe();
		this.jButtonid_mesProcesoIessAportesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessAportesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProcesoIessAportesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProcesoIessAportesUpdate.setText("U");
		this.jButtonid_mesProcesoIessAportesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProcesoIessAportesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProcesoIessAportesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProcesoIessAportesUpdate"));



					
		this.jLabelid_tipo_afiliacionProcesoIessAportes = new JLabelMe();
		this.jLabelid_tipo_afiliacionProcesoIessAportes.setText(""+ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION+" : *");
		this.jLabelid_tipo_afiliacionProcesoIessAportes.setToolTipText("Tipo Afiliacion");
		this.jLabelid_tipo_afiliacionProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_afiliacionProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_afiliacionProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_afiliacionProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_afiliacionProcesoIessAportes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_afiliacionProcesoIessAportes.setToolTipText(ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION);
		this.gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		this.jPanelid_tipo_afiliacionProcesoIessAportes.setLayout(this.gridaBagLayoutProcesoIessAportes);


		jComboBoxid_tipo_afiliacionProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_tipo_afiliacionProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_afiliacionProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_afiliacionProcesoIessAportes= new JButtonMe();
		this.jButtonid_tipo_afiliacionProcesoIessAportes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_afiliacionProcesoIessAportes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_afiliacionProcesoIessAportes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_afiliacionProcesoIessAportes.setText("Procesar");
		this.jButtonid_tipo_afiliacionProcesoIessAportes.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_afiliacionProcesoIessAportes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_afiliacionProcesoIessAportes,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_afiliacionProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_afiliacionProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_afiliacionProcesoIessAportes"));

		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda= new JButtonMe();
		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setText("U");
		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_afiliacionProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_afiliacionProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_afiliacionProcesoIessAportesBusqueda"));

		if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate= new JButtonMe();
		this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.setText("U");
		this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_afiliacionProcesoIessAportesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_afiliacionProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_afiliacionProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_afiliacionProcesoIessAportesUpdate"));



					
		this.jLabelid_numero_patronalProcesoIessAportes = new JLabelMe();
		this.jLabelid_numero_patronalProcesoIessAportes.setText(""+ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL+" : *");
		this.jLabelid_numero_patronalProcesoIessAportes.setToolTipText("Numero Patronal");
		this.jLabelid_numero_patronalProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_numero_patronalProcesoIessAportes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_numero_patronalProcesoIessAportes.setToolTipText(ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		this.gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		this.jPanelid_numero_patronalProcesoIessAportes.setLayout(this.gridaBagLayoutProcesoIessAportes);


		jComboBoxid_numero_patronalProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_numero_patronalProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_numero_patronalProcesoIessAportes= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessAportes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessAportes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessAportes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalProcesoIessAportes.setText("Procesar");
		this.jButtonid_numero_patronalProcesoIessAportes.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_numero_patronalProcesoIessAportes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessAportes,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_numero_patronalProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessAportes"));

		this.jButtonid_numero_patronalProcesoIessAportesBusqueda= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setText("U");
		this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessAportesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_numero_patronalProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessAportesBusqueda"));

		if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_numero_patronalProcesoIessAportesBusqueda.setVisible(false);		}

		this.jButtonid_numero_patronalProcesoIessAportesUpdate= new JButtonMe();
		this.jButtonid_numero_patronalProcesoIessAportesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessAportesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalProcesoIessAportesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalProcesoIessAportesUpdate.setText("U");
		this.jButtonid_numero_patronalProcesoIessAportesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_numero_patronalProcesoIessAportesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalProcesoIessAportesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_numero_patronalProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalProcesoIessAportesUpdate"));



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
		//this.jInternalFrameDetalleProcesoIessAportes = new ProcesoIessAportesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Iess Aportes DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoIessAportes= new GridBagLayout();
		

		
		String sToolTipProcesoIessAportes="";
		sToolTipProcesoIessAportes=ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoIessAportes+="(Nomina.ProcesoIessAportes)";
		}
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoIessAportes+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoIessAportes = new JButtonMe();
		this.jButtonModificarProcesoIessAportes = new JButtonMe();
        this.jButtonActualizarProcesoIessAportes = new JButtonMe();
        this.jButtonEliminarProcesoIessAportes = new JButtonMe();
        this.jButtonCancelarProcesoIessAportes = new JButtonMe();
        this.jButtonGuardarCambiosProcesoIessAportes = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoIessAportes = new JButtonMe();
		this.jButtonCerrarProcesoIessAportes = new JButtonMe();
		
		this.jScrollPanelDatosProcesoIessAportes = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoIessAportes = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoIessAportes = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Iess Aportes";
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Aporteses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoIessAportes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoIessAportes.setName("jPanelCamposProcesoIessAportes"); 

		this.jPanelCamposOcultosProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoIessAportes.setName("jPanelCamposOcultosProcesoIessAportes"); 

        this.jPanelAccionesProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoIessAportes.setToolTipText("Acciones");
        this.jPanelAccionesProcesoIessAportes.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoIessAportes.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoIessAportes.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoIessAportes.setText("Nuevo");
		this.jButtonModificarProcesoIessAportes.setText("Editar");
        this.jButtonActualizarProcesoIessAportes.setText("Actualizar");
        this.jButtonEliminarProcesoIessAportes.setText("Eliminar");
        this.jButtonCancelarProcesoIessAportes.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoIessAportes.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoIessAportes.setText("Guardar");
		this.jButtonCerrarProcesoIessAportes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoIessAportes,"nuevo_button","Nuevo",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoIessAportes,"modificar_button","Editar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoIessAportes,"actualizar_button","Actualizar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoIessAportes,"eliminar_button","Eliminar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoIessAportes,"cancelar_button","Cancelar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoIessAportes,"guardarcambios_button","Guardar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoIessAportes,"guardarcambiostabla_button","Guardar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoIessAportes,"cerrar_button","Salir",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoIessAportes.setToolTipText("Nuevo"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoIessAportes.setToolTipText("Editar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoIessAportes.setToolTipText("Actualizar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoIessAportes.setToolTipText("Eliminar)"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoIessAportes.setToolTipText("Cancelar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoIessAportes.setToolTipText("Guardar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoIessAportes.setToolTipText("Guardar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoIessAportes.setToolTipText("Salir"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoIessAportes";
		inputMap = this.jButtonNuevoProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoIessAportes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoIessAportes"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoIessAportes";
		inputMap = this.jButtonActualizarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoIessAportes"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoIessAportes";
		inputMap = this.jButtonEliminarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoIessAportes"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoIessAportes";
		inputMap = this.jButtonCancelarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoIessAportes"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoIessAportes";
		inputMap = this.jButtonCerrarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoIessAportes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoIessAportes";
		inputMap = this.jButtonGuardarCambiosTablaProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoIessAportes"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoIessAportes = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoIessAportes.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoIessAportes.setToolTipText("Nuevo ProcesoIessAportes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoIessAportes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoIessAportes.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoIessAportes.setToolTipText("Sin Cerrar Ventana ProcesoIessAportes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoIessAportes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoIessAportes.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoIessAportes.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoIessAportes.setText("Accion");
		this.jComboBoxTiposAccionesProcesoIessAportes.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoIessAportes = new JLabelMe();
		
		this.jLabelAccionesProcesoIessAportes.setText("Acciones");		
		this.jLabelAccionesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoIessAportes();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoIessAportes();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoIessAportes=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoIessAportes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessAportes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessAportes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoIessAportes = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoIessAportes = new GridBagLayout();
		
		this.jPanelCamposProcesoIessAportes.setLayout(gridaBagLayoutCamposProcesoIessAportes);
		this.jPanelCamposOcultosProcesoIessAportes.setLayout(gridaBagLayoutCamposOcultosProcesoIessAportes);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoIessAportes.add(jLabelIdProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 1;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoIessAportes.add(jLabelidProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesoIessAportes.add(jLabelid_anioProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 2;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoIessAportes.add(jButtonid_anioProcesoIessAportesBusqueda, this.gridBagConstraintsProcesoIessAportes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 3;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoIessAportes.add(jButtonid_anioProcesoIessAportesUpdate, this.gridBagConstraintsProcesoIessAportes);
	}

	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 1;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesoIessAportes.add(jComboBoxid_anioProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesProcesoIessAportes.add(jLabelid_mesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 2;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoIessAportes.add(jButtonid_mesProcesoIessAportesBusqueda, this.gridBagConstraintsProcesoIessAportes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 3;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProcesoIessAportes.add(jButtonid_mesProcesoIessAportesUpdate, this.gridBagConstraintsProcesoIessAportes);
	}

	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 1;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesProcesoIessAportes.add(jComboBoxid_mesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_afiliacionProcesoIessAportes.add(jLabelid_tipo_afiliacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 2;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_afiliacionProcesoIessAportes.add(jButtonid_tipo_afiliacionProcesoIessAportesBusqueda, this.gridBagConstraintsProcesoIessAportes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 3;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_afiliacionProcesoIessAportes.add(jButtonid_tipo_afiliacionProcesoIessAportesUpdate, this.gridBagConstraintsProcesoIessAportes);
	}

	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 1;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_afiliacionProcesoIessAportes.add(jComboBoxid_tipo_afiliacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_numero_patronalProcesoIessAportes.add(jLabelid_numero_patronalProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 2;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalProcesoIessAportes.add(jButtonid_numero_patronalProcesoIessAportesBusqueda, this.gridBagConstraintsProcesoIessAportes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 3;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalProcesoIessAportes.add(jButtonid_numero_patronalProcesoIessAportesUpdate, this.gridBagConstraintsProcesoIessAportes);
	}

	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 1;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_numero_patronalProcesoIessAportes.add(jComboBoxid_numero_patronalProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeProcesoIessAportes.add(jLabelporcentajeProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 2;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
		this.gridBagConstraintsProcesoIessAportes.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeProcesoIessAportes.add(jButtonporcentajeProcesoIessAportesBusqueda, this.gridBagConstraintsProcesoIessAportes);
	}

	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoIessAportes.gridy = 0;
	this.gridBagConstraintsProcesoIessAportes.gridx = 1;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeProcesoIessAportes.add(jTextFieldporcentajeProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessAportes.gridy = iYPanelCamposProcesoIessAportes;
	this.gridBagConstraintsProcesoIessAportes.gridx = iXPanelCamposProcesoIessAportes++;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessAportes.add(this.jPanelidProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(iXPanelCamposProcesoIessAportes % 1==0) {
		iXPanelCamposProcesoIessAportes=0;
		iYPanelCamposProcesoIessAportes++;
	}
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessAportes.gridy = iYPanelCamposProcesoIessAportes;
	this.gridBagConstraintsProcesoIessAportes.gridx = iXPanelCamposProcesoIessAportes++;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessAportes.add(this.jPanelid_anioProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(iXPanelCamposProcesoIessAportes % 1==0) {
		iXPanelCamposProcesoIessAportes=0;
		iYPanelCamposProcesoIessAportes++;
	}
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessAportes.gridy = iYPanelCamposProcesoIessAportes;
	this.gridBagConstraintsProcesoIessAportes.gridx = iXPanelCamposProcesoIessAportes++;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessAportes.add(this.jPanelid_mesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(iXPanelCamposProcesoIessAportes % 1==0) {
		iXPanelCamposProcesoIessAportes=0;
		iYPanelCamposProcesoIessAportes++;
	}
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessAportes.gridy = iYPanelCamposProcesoIessAportes;
	this.gridBagConstraintsProcesoIessAportes.gridx = iXPanelCamposProcesoIessAportes++;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessAportes.add(this.jPanelid_tipo_afiliacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(iXPanelCamposProcesoIessAportes % 1==0) {
		iXPanelCamposProcesoIessAportes=0;
		iYPanelCamposProcesoIessAportes++;
	}
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessAportes.gridy = iYPanelCamposProcesoIessAportes;
	this.gridBagConstraintsProcesoIessAportes.gridx = iXPanelCamposProcesoIessAportes++;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessAportes.add(this.jPanelid_numero_patronalProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(iXPanelCamposProcesoIessAportes % 1==0) {
		iXPanelCamposProcesoIessAportes=0;
		iYPanelCamposProcesoIessAportes++;
	}
	this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoIessAportes.gridy = iYPanelCamposProcesoIessAportes;
	this.gridBagConstraintsProcesoIessAportes.gridx = iXPanelCamposProcesoIessAportes++;
	this.gridBagConstraintsProcesoIessAportes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoIessAportes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoIessAportes.add(this.jPanelporcentajeProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);



	if(iXPanelCamposProcesoIessAportes % 1==0) {
		iXPanelCamposProcesoIessAportes=0;
		iYPanelCamposProcesoIessAportes++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoIessAportes= new GridBagLayout();
		this.jPanelAccionesProcesoIessAportes.setLayout(gridaBagLayoutAccionesProcesoIessAportes);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoIessAportes= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoIessAportes.setLayout(gridaBagLayoutAccionesFormularioProcesoIessAportes);
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoIessAportes.add(this.jComboBoxTiposAccionesFormularioProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoIessAportes.add(this.jButtonModificarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);							

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoIessAportes.add(this.jButtonEliminarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoIessAportes.add(this.jButtonActualizarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoIessAportes.add(this.jButtonGuardarCambiosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);	
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;		
		this.gridBagConstraintsProcesoIessAportes.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoIessAportes.add(this.jButtonCancelarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoIessAportes);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();						
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;		
			//this.gridBagConstraintsProcesoIessAportes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoIessAportes.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessAportes.gridx =0;
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoIessAportes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoIessAportes = new ProcesoIessAportesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Iess Aportes DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Iess Aportes DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Iess Aportes Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoIessAportesModel procesoiessaportesModel=new ProcesoIessAportesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoIessAportesModel.ProcesoIessAportesFocusTraversalPolicy procesoiessaportesFocusTraversalPolicy = procesoiessaportesModel.new ProcesoIessAportesFocusTraversalPolicy(this);
			
			//procesoiessaportesFocusTraversalPolicy.setprocesoiessaportesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoiessaportesModel);
			
			
			this.jContentPaneDetalleProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoIessAportes = new GridBagLayout();	
			this.jContentPaneDetalleProcesoIessAportes.setLayout(gridaBagLayoutDetalleProcesoIessAportes);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoIessAportes = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
				this.gridBagConstraintsProcesoIessAportes.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoIessAportes.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoIessAportes.add(jTtoolBarDetalleProcesoIessAportes, gridBagConstraintsProcesoIessAportes);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoIessAportes=   new JScrollPane(jContentPaneDetalleProcesoIessAportes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoIessAportes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessAportes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessAportes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoIessAportes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoIessAportes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessAportes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessAportes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoIessAportes.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	        
			this.jContentPaneDetalleProcesoIessAportes.add(jPanelCamposProcesoIessAportes, gridBagConstraintsProcesoIessAportes);
			
			
			
			
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
						//&& procesoiessaportesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoIessAportes= new GridBagConstraints();
						this.gridBagConstraintsProcesoIessAportes.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoIessAportes.gridx = 0;
						this.jContentPaneDetalleProcesoIessAportes.add(this.jTabbedPaneRelacionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoIessAportes.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoIessAportes.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
					this.gridBagConstraintsProcesoIessAportes.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoIessAportes.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoIessAportes.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoIessAportes.add(jPanelCamposOcultosProcesoIessAportes, gridBagConstraintsProcesoIessAportes);
				
					this.jPanelCamposOcultosProcesoIessAportes.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	        this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoIessAportes.add(this.jPanelAccionesFormularioProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);							
			
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
	        this.gridBagConstraintsProcesoIessAportes.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoIessAportes.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoIessAportes.add(this.jPanelAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoIessAportes);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoIessAportes=   new JScrollPane(this.jPanelCamposProcesoIessAportes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoIessAportes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessAportes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoIessAportes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoIessAportes.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoIessAportes.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoIessAportes.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoIessAportes.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoIessAportes.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoIessAportes.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoIessAportes;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoIessAportes;
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
