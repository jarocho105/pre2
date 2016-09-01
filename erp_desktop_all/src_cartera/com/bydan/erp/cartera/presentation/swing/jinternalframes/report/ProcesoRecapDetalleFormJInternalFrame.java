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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.ProcesoRecapConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class ProcesoRecapDetalleFormJInternalFrame extends ProcesoRecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoRecap;
	
	protected JMenuBar jmenuBarDetalleProcesoRecap;
	
	protected JMenu jmenuDetalleProcesoRecap;
	protected JMenu jmenuDetalleArchivoProcesoRecap;
	protected JMenu jmenuDetalleAccionesProcesoRecap;
	protected JMenu jmenuDetalleDatosProcesoRecap;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoRecap;	
	protected GridBagConstraints gridBagConstraintsProcesoRecap;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoRecapBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoRecap;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public ProcesoRecapSessionBean procesorecapSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public ProcesoRecapLogic procesorecapLogic;
	
	public JScrollPane jScrollPanelDatosProcesoRecap;
	public JScrollPane jScrollPanelDatosEdicionProcesoRecap;
	public JScrollPane jScrollPanelDatosGeneralProcesoRecap;
	
	protected JPanel jPanelCamposProcesoRecap;    
	protected JPanel jPanelCamposOcultosProcesoRecap;    	
	protected JPanel jPanelAccionesProcesoRecap;
	protected JPanel jPanelAccionesFormularioProcesoRecap;
    
	
	protected Integer iXPanelCamposProcesoRecapParam=0;
	protected Integer iYPanelCamposProcesoRecapParam=0;
	
	protected Integer iXPanelCamposProcesoRecap=0;
	protected Integer iYPanelCamposProcesoRecap=0;
	
	protected Integer iXPanelCamposOcultosProcesoRecap=0;
	protected Integer iYPanelCamposOcultosProcesoRecap=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
	
	protected GridBagLayout gridaBagLayoutProcesoRecapParam;
	protected GridBagConstraints gridBagConstraintsProcesoRecapParam;
	protected JPanel jPanelCamposProcesoRecapParam;
	//protected BindingGroup bindingGroupProcesoRecapParam;
	//@SuppressWarnings("rawtypes")
	//protected Binding bindingProcesoRecapParam;
	public JTabbedPane jTabbedPaneCamposProcesoRecapParametros;	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoRecap;
	public JButton jButtonModificarProcesoRecap;
	public JButton jButtonActualizarProcesoRecap;
    public JButton jButtonEliminarProcesoRecap;
	public JButton jButtonCancelarProcesoRecap;
    public JButton jButtonGuardarCambiosProcesoRecap;
	public JButton jButtonGuardarCambiosTablaProcesoRecap;
	protected JButton jButtonCerrarProcesoRecap;
	
	
	protected JButton jButtonProcesarInformacionProcesoRecap;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoRecap;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoRecap;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoRecap;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoRecap;
	protected JButton jButtonModificarToolBarProcesoRecap;
	protected JButton jButtonActualizarToolBarProcesoRecap;
    protected JButton jButtonEliminarToolBarProcesoRecap;
	protected JButton jButtonCancelarToolBarProcesoRecap;
    protected JButton jButtonGuardarCambiosToolBarProcesoRecap;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoRecap;
	protected JButton jButtonCerrarToolBarProcesoRecap;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoRecap;
	protected JMenuItem jMenuItemModificarProcesoRecap;
	protected JMenuItem jMenuItemActualizarProcesoRecap;
    protected JMenuItem jMenuItemEliminarProcesoRecap;
	protected JMenuItem jMenuItemCancelarProcesoRecap;
    protected JMenuItem jMenuItemGuardarCambiosProcesoRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoRecap;
	protected JMenuItem jMenuItemCerrarProcesoRecap;
	protected JMenuItem jMenuItemDetalleCerrarProcesoRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoRecap;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoRecap;
	protected JMenuItem jMenuItemMostrarOcultarProcesoRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoRecap;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoRecap;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoRecap;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoRecap;
	public JLabel jLabelIdProcesoRecap;
	public JLabel jLabelidProcesoRecap;
	public JButton jButtonidProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeProcesoRecap;
	public JLabel jLabelfecha_emision_desdeProcesoRecap;
	//public JFormattedTextField jDateChooserfecha_emision_desdeProcesoRecap;

	public JDateChooser jDateChooserfecha_emision_desdeProcesoRecap;
	public JButton jButtonfecha_emision_desdeProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaProcesoRecap;
	public JLabel jLabelfecha_emision_hastaProcesoRecap;
	//public JFormattedTextField jDateChooserfecha_emision_hastaProcesoRecap;

	public JDateChooser jDateChooserfecha_emision_hastaProcesoRecap;
	public JButton jButtonfecha_emision_hastaProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteProcesoRecap;
	public JLabel jLabelnombre_completo_clienteProcesoRecap;
	public JTextArea jTextAreanombre_completo_clienteProcesoRecap;
	public JScrollPane jscrollPanenombre_completo_clienteProcesoRecap;
	public JButton jButtonnombre_completo_clienteProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoProcesoRecap;
	public JLabel jLabelnumero_pre_impresoProcesoRecap;
	public JTextField jTextFieldnumero_pre_impresoProcesoRecap;
	public JButton jButtonnumero_pre_impresoProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionProcesoRecap;
	public JLabel jLabelnombre_transaccionProcesoRecap;
	public JTextArea jTextAreanombre_transaccionProcesoRecap;
	public JScrollPane jscrollPanenombre_transaccionProcesoRecap;
	public JButton jButtonnombre_transaccionProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionProcesoRecap;
	public JLabel jLabelfecha_emisionProcesoRecap;
	//public JFormattedTextField jDateChooserfecha_emisionProcesoRecap;

	public JDateChooser jDateChooserfecha_emisionProcesoRecap;
	public JButton jButtonfecha_emisionProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_localProcesoRecap;
	public JLabel jLabelmonto_mone_localProcesoRecap;
	public JTextField jTextFieldmonto_mone_localProcesoRecap;
	public JButton jButtonmonto_mone_localProcesoRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProcesoRecap;
	public JLabel jLabelid_empresaProcesoRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoRecap;
	public JButton jButtonid_empresaProcesoRecap= new JButtonMe();
	public JButton jButtonid_empresaProcesoRecapUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoRecap;
	public JLabel jLabelid_sucursalProcesoRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoRecap;
	public JButton jButtonid_sucursalProcesoRecap= new JButtonMe();
	public JButton jButtonid_sucursalProcesoRecapUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioProcesoRecap;
	public JLabel jLabelid_ejercicioProcesoRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProcesoRecap;
	public JButton jButtonid_ejercicioProcesoRecap= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoRecapUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProcesoRecapBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	public JPanel jPanelnumero_recapProcesoRecapParam;
	public JLabel jLabelnumero_recapProcesoRecapParam;
	public JTextField jTextFieldnumero_recapProcesoRecapParam;
	public JButton jButtonnumero_recapProcesoRecapParamBusqueda= new JButtonMe();

	public JPanel jPanelautorizacion_recapProcesoRecapParam;
	public JLabel jLabelautorizacion_recapProcesoRecapParam;
	public JTextField jTextFieldautorizacion_recapProcesoRecapParam;
	public JButton jButtonautorizacion_recapProcesoRecapParamBusqueda= new JButtonMe();

	public JPanel jPanelfecha_recapProcesoRecapParam;
	public JLabel jLabelfecha_recapProcesoRecapParam;
	//public JFormattedTextField jDateChooserfecha_recapProcesoRecapParam;

	public JDateChooser jDateChooserfecha_recapProcesoRecapParam;
	public JButton jButtonfecha_recapProcesoRecapParamBusqueda= new JButtonMe();

	
	
	public JPanel jPanelid_proceso_recapProcesoRecapParam;
	public JLabel jLabelid_proceso_recapProcesoRecapParam;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_proceso_recapProcesoRecapParam;
	public JButton jButtonid_proceso_recapProcesoRecapParam= new JButtonMe();
	public JButton jButtonid_proceso_recapProcesoRecapParamUpdate= new JButtonMe();
	public JButton jButtonid_proceso_recapProcesoRecapParamBusqueda= new JButtonMe();

	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoRecap;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoRecapDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoRecap=new JPanel();
				this.jPanelAccionesFormularioProcesoRecap=new JPanel();
				this.jmenuBarDetalleProcesoRecap=new JMenuBar();
				this.jTtoolBarDetalleProcesoRecap=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoRecapDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoRecap() {
		return this.jButtonActualizarToolBarProcesoRecap;
	}
	
	public JButton getjButtonEliminarToolBarProcesoRecap() {
		return this.jButtonEliminarToolBarProcesoRecap;
	}
	
	public JButton getjButtonCancelarToolBarProcesoRecap() {
		return this.jButtonCancelarToolBarProcesoRecap;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoRecap() {
		return this.jButtonProcesarInformacionProcesoRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoRecap)	{
		this.jButtonProcesarInformacionProcesoRecap = jButtonProcesarInformacionProcesoRecap;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoRecap() {
		return this.jComboBoxTiposAccionesProcesoRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoRecap(
			JComboBox jComboBoxTiposRelacionesProcesoRecap) {
		this.jComboBoxTiposRelacionesProcesoRecap = jComboBoxTiposRelacionesProcesoRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoRecap(
			JComboBox jComboBoxTiposAccionesProcesoRecap) {
		this.jComboBoxTiposAccionesProcesoRecap = jComboBoxTiposAccionesProcesoRecap;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoRecap() {
		return this.jComboBoxTiposAccionesFormularioProcesoRecap;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoRecap(
			JComboBox jComboBoxTiposAccionesFormularioProcesoRecap) {
		this.jComboBoxTiposAccionesFormularioProcesoRecap = jComboBoxTiposAccionesFormularioProcesoRecap;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesorecapSessionBean=new ProcesoRecapSessionBean();
		
		this.procesorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesorecapSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoRecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoRecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Recap MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoRecap= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoRecap=new JButtonMe();
				this.jButtonModificarToolBarProcesoRecap=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoRecap,this.jTtoolBarDetalleProcesoRecap,
							"actualizar","actualizar","Actualizar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoRecap,this.jTtoolBarDetalleProcesoRecap,
							"eliminar","eliminar","Eliminar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoRecap,this.jTtoolBarDetalleProcesoRecap,
							"cancelar","cancelar","Cancelar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoRecap,this.jTtoolBarDetalleProcesoRecap,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoRecap=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoRecap=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoRecap=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoRecap=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoRecap=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoRecap= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoRecap.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoRecap,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoRecap= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoRecap.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoRecap,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoRecap= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoRecap.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoRecap,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoRecap= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoRecap.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoRecap,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoRecap.add(this.jMenuItemDetalleCerrarProcesoRecap);
		
		this.jmenuDetalleAccionesProcesoRecap.add(this.jMenuItemActualizarProcesoRecap);
		this.jmenuDetalleAccionesProcesoRecap.add(this.jMenuItemEliminarProcesoRecap);
		this.jmenuDetalleAccionesProcesoRecap.add(this.jMenuItemCancelarProcesoRecap);		
		
		//this.jmenuDetalleDatosProcesoRecap.add(this.jMenuItemDetalleAbrirOrderByProcesoRecap);				
		this.jmenuDetalleDatosProcesoRecap.add(this.jMenuItemDetalleMostarOcultarProcesoRecap);				
				
		//this.jmenuDetalleAccionesProcesoRecap.add(this.jMenuItemGuardarCambiosProcesoRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoRecap.add(this.jmenuDetalleArchivoProcesoRecap);		
		this.jmenuBarDetalleProcesoRecap.add(this.jmenuDetalleAccionesProcesoRecap);		
		this.jmenuBarDetalleProcesoRecap.add(this.jmenuDetalleDatosProcesoRecap);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoRecap);				
	}
	
	
	public void inicializarElementosCamposProcesoRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoRecap = new JLabelMe();
		jLabelIdProcesoRecap.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoRecap = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoRecap= new GridBagLayout();

		this.jPanelidProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);

		jLabelidProcesoRecap = new JLabel();
		jLabelidProcesoRecap.setText("Id");

		jLabelidProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeProcesoRecap = new JLabelMe();
		this.jLabelfecha_emision_desdeProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeProcesoRecap.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelfecha_emision_desdeProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		//jFormattedTextFieldfecha_emision_desdeProcesoRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeProcesoRecap= new JDateChooser();
		jDateChooserfecha_emision_desdeProcesoRecap.setEnabled(false);
		jDateChooserfecha_emision_desdeProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeProcesoRecap.setDate(new Date());
		jDateChooserfecha_emision_desdeProcesoRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeProcesoRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeProcesoRecapBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setText("U");
		this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeProcesoRecapBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaProcesoRecap = new JLabelMe();
		this.jLabelfecha_emision_hastaProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaProcesoRecap.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelfecha_emision_hastaProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		//jFormattedTextFieldfecha_emision_hastaProcesoRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaProcesoRecap= new JDateChooser();
		jDateChooserfecha_emision_hastaProcesoRecap.setEnabled(false);
		jDateChooserfecha_emision_hastaProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaProcesoRecap.setDate(new Date());
		jDateChooserfecha_emision_hastaProcesoRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaProcesoRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaProcesoRecapBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setText("U");
		this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaProcesoRecapBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteProcesoRecap = new JLabelMe();
		this.jLabelnombre_completo_clienteProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteProcesoRecap.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelnombre_completo_clienteProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jTextAreanombre_completo_clienteProcesoRecap= new JTextAreaMe();
		jTextAreanombre_completo_clienteProcesoRecap.setEnabled(false);
		jTextAreanombre_completo_clienteProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteProcesoRecap.setLineWrap(true);
		jTextAreanombre_completo_clienteProcesoRecap.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteProcesoRecap.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteProcesoRecap.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteProcesoRecap = new JScrollPane(jTextAreanombre_completo_clienteProcesoRecap);
		jscrollPanenombre_completo_clienteProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteProcesoRecapBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setText("U");
		this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteProcesoRecapBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoProcesoRecap = new JLabelMe();
		this.jLabelnumero_pre_impresoProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoProcesoRecap.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelnumero_pre_impresoProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jTextFieldnumero_pre_impresoProcesoRecap= new JTextFieldMe();

		jTextFieldnumero_pre_impresoProcesoRecap.setEnabled(false);
		jTextFieldnumero_pre_impresoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoProcesoRecapBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setText("U");
		this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoProcesoRecapBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionProcesoRecap = new JLabelMe();
		this.jLabelnombre_transaccionProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionProcesoRecap.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelnombre_transaccionProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jTextAreanombre_transaccionProcesoRecap= new JTextAreaMe();
		jTextAreanombre_transaccionProcesoRecap.setEnabled(false);
		jTextAreanombre_transaccionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionProcesoRecap.setLineWrap(true);
		jTextAreanombre_transaccionProcesoRecap.setWrapStyleWord(true);
		jTextAreanombre_transaccionProcesoRecap.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionProcesoRecap.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionProcesoRecap = new JScrollPane(jTextAreanombre_transaccionProcesoRecap);
		jscrollPanenombre_transaccionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_transaccionProcesoRecapBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionProcesoRecapBusqueda.setText("U");
		this.jButtonnombre_transaccionProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionProcesoRecapBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionProcesoRecap = new JLabelMe();
		this.jLabelfecha_emisionProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionProcesoRecap.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelfecha_emisionProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		//jFormattedTextFieldfecha_emisionProcesoRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionProcesoRecap= new JDateChooser();
		jDateChooserfecha_emisionProcesoRecap.setEnabled(false);
		jDateChooserfecha_emisionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionProcesoRecap.setDate(new Date());
		jDateChooserfecha_emisionProcesoRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionProcesoRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionProcesoRecapBusqueda= new JButtonMe();
		this.jButtonfecha_emisionProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionProcesoRecapBusqueda.setText("U");
		this.jButtonfecha_emisionProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionProcesoRecapBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_localProcesoRecap = new JLabelMe();
		this.jLabelmonto_mone_localProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL+" : *");
		this.jLabelmonto_mone_localProcesoRecap.setToolTipText("Monto Mone Local");
		this.jLabelmonto_mone_localProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_localProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_localProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_localProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelmonto_mone_localProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jTextFieldmonto_mone_localProcesoRecap= new JTextFieldMe();
		jTextFieldmonto_mone_localProcesoRecap.setEnabled(false);
		jTextFieldmonto_mone_localProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_localProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_localProcesoRecap.setText("0.0");

		this.jButtonmonto_mone_localProcesoRecapBusqueda= new JButtonMe();
		this.jButtonmonto_mone_localProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_localProcesoRecapBusqueda.setText("U");
		this.jButtonmonto_mone_localProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_localProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_localProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_localProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_localProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_localProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_localProcesoRecapBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProcesoRecap = new JLabelMe();
		this.jLabelid_empresaProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoRecap.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelid_empresaProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jComboBoxid_empresaProcesoRecap= new JComboBoxMe();
		jComboBoxid_empresaProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoRecap.setEnabled(false);

		this.jButtonid_empresaProcesoRecap= new JButtonMe();
		this.jButtonid_empresaProcesoRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoRecap.setText("Buscar");
		this.jButtonid_empresaProcesoRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoRecap"));

		this.jButtonid_empresaProcesoRecapBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoRecapBusqueda.setText("U");
		this.jButtonid_empresaProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoRecapBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoRecapUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoRecapUpdate.setText("U");
		this.jButtonid_empresaProcesoRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoRecapUpdate"));



					
		this.jLabelid_sucursalProcesoRecap = new JLabelMe();
		this.jLabelid_sucursalProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoRecap.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelid_sucursalProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jComboBoxid_sucursalProcesoRecap= new JComboBoxMe();
		jComboBoxid_sucursalProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoRecap.setEnabled(false);

		this.jButtonid_sucursalProcesoRecap= new JButtonMe();
		this.jButtonid_sucursalProcesoRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoRecap.setText("Buscar");
		this.jButtonid_sucursalProcesoRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoRecap"));

		this.jButtonid_sucursalProcesoRecapBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoRecapBusqueda.setText("U");
		this.jButtonid_sucursalProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoRecapBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoRecapUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoRecapUpdate.setText("U");
		this.jButtonid_sucursalProcesoRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoRecapUpdate"));



					
		this.jLabelid_ejercicioProcesoRecap = new JLabelMe();
		this.jLabelid_ejercicioProcesoRecap.setText(""+ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProcesoRecap.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProcesoRecap.setToolTipText(ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProcesoRecap = new GridBagLayout();
		this.jPanelid_ejercicioProcesoRecap.setLayout(this.gridaBagLayoutProcesoRecap);


		jComboBoxid_ejercicioProcesoRecap= new JComboBoxMe();
		jComboBoxid_ejercicioProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProcesoRecap.setEnabled(false);

		this.jButtonid_ejercicioProcesoRecap= new JButtonMe();
		this.jButtonid_ejercicioProcesoRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProcesoRecap.setText("Buscar");
		this.jButtonid_ejercicioProcesoRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProcesoRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoRecap"));

		this.jButtonid_ejercicioProcesoRecapBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProcesoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoRecapBusqueda.setText("U");
		this.jButtonid_ejercicioProcesoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProcesoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoRecapBusqueda"));

		if(this.procesorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProcesoRecapBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProcesoRecapUpdate= new JButtonMe();
		this.jButtonid_ejercicioProcesoRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProcesoRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProcesoRecapUpdate.setText("U");
		this.jButtonid_ejercicioProcesoRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProcesoRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProcesoRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProcesoRecapUpdate"));



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
		//this.jInternalFrameDetalleProcesoRecap = new ProcesoRecapBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Recap DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoRecap= new GridBagLayout();
		

		
		String sToolTipProcesoRecap="";
		sToolTipProcesoRecap=ProcesoRecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoRecap+="(Cartera.ProcesoRecap)";
		}
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoRecap+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoRecap = new JButtonMe();
		this.jButtonModificarProcesoRecap = new JButtonMe();
        this.jButtonActualizarProcesoRecap = new JButtonMe();
        this.jButtonEliminarProcesoRecap = new JButtonMe();
        this.jButtonCancelarProcesoRecap = new JButtonMe();
        this.jButtonGuardarCambiosProcesoRecap = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoRecap = new JButtonMe();
		this.jButtonCerrarProcesoRecap = new JButtonMe();
		
		this.jScrollPanelDatosProcesoRecap = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoRecap = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoRecap = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Recap";
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoRecap.setName("jPanelCamposProcesoRecap"); 

		this.jPanelCamposOcultosProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoRecap.setName("jPanelCamposOcultosProcesoRecap"); 

        this.jPanelAccionesProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoRecap.setToolTipText("Acciones");
        this.jPanelAccionesProcesoRecap.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoRecap.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoRecap.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
	this.jTabbedPaneCamposProcesoRecapParametros = new JTabbedPane();
	this.jTabbedPaneCamposProcesoRecapParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("PARAMETROS"));
	this.gridaBagLayoutProcesoRecapParam= new GridBagLayout();
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.jPanelCamposProcesoRecapParam = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);

	this.jPanelCamposProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);
	this.jPanelCamposProcesoRecapParam.setBorder(javax.swing.BorderFactory.createTitledBorder("PARAMETROS"));
	this.jPanelCamposProcesoRecapParam.setName("jPanelCamposProcesoRecapParam");

	this.jTabbedPaneCamposProcesoRecapParametros.addTab("Proceso Recap Param", this.jPanelCamposProcesoRecapParam);
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoRecap.setText("Nuevo");
		this.jButtonModificarProcesoRecap.setText("Editar");
        this.jButtonActualizarProcesoRecap.setText("Actualizar");
        this.jButtonEliminarProcesoRecap.setText("Eliminar");
        this.jButtonCancelarProcesoRecap.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoRecap.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoRecap.setText("Guardar");
		this.jButtonCerrarProcesoRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoRecap,"nuevo_button","Nuevo",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoRecap,"modificar_button","Editar",this.procesorecapSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoRecap,"actualizar_button","Actualizar",this.procesorecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoRecap,"eliminar_button","Eliminar",this.procesorecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoRecap,"cancelar_button","Cancelar",this.procesorecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoRecap,"guardarcambios_button","Guardar",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoRecap,"guardarcambiostabla_button","Guardar",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoRecap,"cerrar_button","Salir",this.procesorecapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoRecap.setToolTipText("Nuevo"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoRecap.setToolTipText("Editar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoRecap.setToolTipText("Actualizar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoRecap.setToolTipText("Eliminar)"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoRecap.setToolTipText("Cancelar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoRecap.setToolTipText("Guardar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoRecap.setToolTipText("Guardar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoRecap.setToolTipText("Salir"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoRecap";
		inputMap = this.jButtonNuevoProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoRecap"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoRecap";
		inputMap = this.jButtonActualizarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoRecap"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoRecap";
		inputMap = this.jButtonEliminarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoRecap"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoRecap";
		inputMap = this.jButtonCancelarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoRecap"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoRecap";
		inputMap = this.jButtonCerrarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoRecap";
		inputMap = this.jButtonGuardarCambiosTablaProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoRecap"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoRecap.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoRecap.setToolTipText("Nuevo ProcesoRecap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoRecap.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoRecap.setToolTipText("Sin Cerrar Ventana ProcesoRecap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoRecap.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoRecap.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoRecap.setText("Accion");
		this.jComboBoxTiposAccionesProcesoRecap.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoRecap.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoRecap.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoRecap = new JLabelMe();
		
		this.jLabelAccionesProcesoRecap.setText("Acciones");		
		this.jLabelAccionesProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoRecap();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoRecap();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
					
		this.jLabelnumero_recapProcesoRecapParam = new JLabelMe();
		this.jLabelnumero_recapProcesoRecapParam.setText(""+"Numero Recap"+" : *");
		this.jLabelnumero_recapProcesoRecapParam.setToolTipText("Numero Recap");
		this.jLabelnumero_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelnumero_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		jTextFieldnumero_recapProcesoRecapParam= new JTextFieldMe();

		jTextFieldnumero_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_recapProcesoRecapParamBusqueda"));



					
		this.jLabelautorizacion_recapProcesoRecapParam = new JLabelMe();
		this.jLabelautorizacion_recapProcesoRecapParam.setText(""+"Autorizacion Recap"+" : *");
		this.jLabelautorizacion_recapProcesoRecapParam.setToolTipText("Autorizacion Recap");
		this.jLabelautorizacion_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelautorizacion_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelautorizacion_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacion_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacion_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelautorizacion_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		jTextFieldautorizacion_recapProcesoRecapParam= new JTextFieldMe();

		jTextFieldautorizacion_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacion_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacion_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacion_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacion_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacion_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacion_recapProcesoRecapParamBusqueda"));



					
		this.jLabelfecha_recapProcesoRecapParam = new JLabelMe();
		this.jLabelfecha_recapProcesoRecapParam.setText(""+"Fecha Recap"+" : *");
		this.jLabelfecha_recapProcesoRecapParam.setToolTipText("Fecha Recap");
		this.jLabelfecha_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelfecha_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		//jFormattedTextFieldfecha_recapProcesoRecapParam= new JFormattedTextFieldMe();

		jDateChooserfecha_recapProcesoRecapParam= new JDateChooser();
		jDateChooserfecha_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_recapProcesoRecapParam.setDate(new Date());
		jDateChooserfecha_recapProcesoRecapParam.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_recapProcesoRecapParam.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_recapProcesoRecapParamBusqueda"));



			
			
					
		this.jLabelid_proceso_recapProcesoRecapParam = new JLabelMe();
		this.jLabelid_proceso_recapProcesoRecapParam.setText(""+""+" :");
		this.jLabelid_proceso_recapProcesoRecapParam.setToolTipText("");
		this.jLabelid_proceso_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proceso_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proceso_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_proceso_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_proceso_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelid_proceso_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		jComboBoxid_proceso_recapProcesoRecapParam= new JComboBoxMe();
		jComboBoxid_proceso_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proceso_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proceso_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_proceso_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_proceso_recapProcesoRecapParam= new JButtonMe();
		this.jButtonid_proceso_recapProcesoRecapParam.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proceso_recapProcesoRecapParam.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proceso_recapProcesoRecapParam.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proceso_recapProcesoRecapParam.setText("Buscar");
		this.jButtonid_proceso_recapProcesoRecapParam.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_proceso_recapProcesoRecapParam.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proceso_recapProcesoRecapParam,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_proceso_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proceso_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proceso_recapProcesoRecapParam"));

		this.jButtonid_proceso_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proceso_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_proceso_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proceso_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proceso_recapProcesoRecapParamBusqueda"));

		this.jButtonid_proceso_recapProcesoRecapParamUpdate= new JButtonMe();
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proceso_recapProcesoRecapParamUpdate.setText("U");
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proceso_recapProcesoRecapParamUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_proceso_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proceso_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proceso_recapProcesoRecapParamUpdate"));


				
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoRecap=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoRecap.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoRecap = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoRecap = new GridBagLayout();
		
		this.jPanelCamposProcesoRecap.setLayout(gridaBagLayoutCamposProcesoRecap);
		this.jPanelCamposOcultosProcesoRecap.setLayout(gridaBagLayoutCamposOcultosProcesoRecap);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoRecap.add(jLabelIdProcesoRecap, this.gridBagConstraintsProcesoRecap);



	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoRecap.add(jLabelidProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoRecap.add(jLabelid_empresaProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoRecap.add(jButtonid_empresaProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 3;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoRecap.add(jButtonid_empresaProcesoRecapUpdate, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoRecap.add(jComboBoxid_empresaProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoRecap.add(jLabelid_sucursalProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoRecap.add(jButtonid_sucursalProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 3;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoRecap.add(jButtonid_sucursalProcesoRecapUpdate, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoRecap.add(jComboBoxid_sucursalProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioProcesoRecap.add(jLabelid_ejercicioProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoRecap.add(jButtonid_ejercicioProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 3;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProcesoRecap.add(jButtonid_ejercicioProcesoRecapUpdate, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioProcesoRecap.add(jComboBoxid_ejercicioProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeProcesoRecap.add(jLabelfecha_emision_desdeProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeProcesoRecap.add(jButtonfecha_emision_desdeProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeProcesoRecap.add(jDateChooserfecha_emision_desdeProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaProcesoRecap.add(jLabelfecha_emision_hastaProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaProcesoRecap.add(jButtonfecha_emision_hastaProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaProcesoRecap.add(jDateChooserfecha_emision_hastaProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteProcesoRecap.add(jLabelnombre_completo_clienteProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteProcesoRecap.add(jButtonnombre_completo_clienteProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteProcesoRecap.add(jscrollPanenombre_completo_clienteProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoProcesoRecap.add(jLabelnumero_pre_impresoProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoProcesoRecap.add(jButtonnumero_pre_impresoProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoProcesoRecap.add(jTextFieldnumero_pre_impresoProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionProcesoRecap.add(jLabelnombre_transaccionProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionProcesoRecap.add(jButtonnombre_transaccionProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionProcesoRecap.add(jscrollPanenombre_transaccionProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionProcesoRecap.add(jLabelfecha_emisionProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionProcesoRecap.add(jButtonfecha_emisionProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionProcesoRecap.add(jDateChooserfecha_emisionProcesoRecap, this.gridBagConstraintsProcesoRecap);


	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 0;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_mone_localProcesoRecap.add(jLabelmonto_mone_localProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 2;
		this.gridBagConstraintsProcesoRecap.ipadx = 0;
		this.gridBagConstraintsProcesoRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_localProcesoRecap.add(jButtonmonto_mone_localProcesoRecapBusqueda, this.gridBagConstraintsProcesoRecap);
	}

	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecap.gridy = 0;
	this.gridBagConstraintsProcesoRecap.gridx = 1;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_mone_localProcesoRecap.add(jTextFieldmonto_mone_localProcesoRecap, this.gridBagConstraintsProcesoRecap);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelidProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelfecha_emision_desdeProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelfecha_emision_hastaProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelnombre_completo_clienteProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelnumero_pre_impresoProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelnombre_transaccionProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelfecha_emisionProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecap.add(this.jPanelmonto_mone_localProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposProcesoRecap % 1==0) {
		iXPanelCamposProcesoRecap=0;
		iYPanelCamposProcesoRecap++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposOcultosProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposOcultosProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoRecap.add(this.jPanelid_empresaProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposOcultosProcesoRecap % 1==0) {
		iXPanelCamposOcultosProcesoRecap=0;
		iYPanelCamposOcultosProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposOcultosProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposOcultosProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoRecap.add(this.jPanelid_sucursalProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposOcultosProcesoRecap % 1==0) {
		iXPanelCamposOcultosProcesoRecap=0;
		iYPanelCamposOcultosProcesoRecap++;
	}
	this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecap.gridy = iYPanelCamposOcultosProcesoRecap;
	this.gridBagConstraintsProcesoRecap.gridx = iXPanelCamposOcultosProcesoRecap++;
	this.gridBagConstraintsProcesoRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoRecap.add(this.jPanelid_ejercicioProcesoRecap, this.gridBagConstraintsProcesoRecap);



	if(iXPanelCamposOcultosProcesoRecap % 1==0) {
		iXPanelCamposOcultosProcesoRecap=0;
		iYPanelCamposOcultosProcesoRecap++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_proceso_recapProcesoRecapParam.add(jLabelid_proceso_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proceso_recapProcesoRecapParam.add(jButtonid_proceso_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 3;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proceso_recapProcesoRecapParam.add(jButtonid_proceso_recapProcesoRecapParamUpdate, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_proceso_recapProcesoRecapParam.add(jComboBoxid_proceso_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_recapProcesoRecapParam.add(jLabelnumero_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_recapProcesoRecapParam.add(jButtonnumero_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_recapProcesoRecapParam.add(jTextFieldnumero_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacion_recapProcesoRecapParam.add(jLabelautorizacion_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacion_recapProcesoRecapParam.add(jButtonautorizacion_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacion_recapProcesoRecapParam.add(jTextFieldautorizacion_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_recapProcesoRecapParam.add(jLabelfecha_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_recapProcesoRecapParam.add(jButtonfecha_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_recapProcesoRecapParam.add(jDateChooserfecha_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


			//SUBPANELES EN PANEL CAMPOS				
			
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecapParam.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecapParam.gridy = iYPanelCamposProcesoRecapParam;
	this.gridBagConstraintsProcesoRecapParam.gridx = iXPanelCamposProcesoRecapParam++;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecapParam.add(this.jPanelnumero_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(iXPanelCamposProcesoRecapParam % 1==0) {
		iXPanelCamposProcesoRecapParam=0;
		iYPanelCamposProcesoRecapParam++;
	}
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecapParam.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecapParam.gridy = iYPanelCamposProcesoRecapParam;
	this.gridBagConstraintsProcesoRecapParam.gridx = iXPanelCamposProcesoRecapParam++;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecapParam.add(this.jPanelautorizacion_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(iXPanelCamposProcesoRecapParam % 1==0) {
		iXPanelCamposProcesoRecapParam=0;
		iYPanelCamposProcesoRecapParam++;
	}
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecapParam.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecapParam.gridy = iYPanelCamposProcesoRecapParam;
	this.gridBagConstraintsProcesoRecapParam.gridx = iXPanelCamposProcesoRecapParam++;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecapParam.add(this.jPanelfecha_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(iXPanelCamposProcesoRecapParam % 1==0) {
		iXPanelCamposProcesoRecapParam=0;
		iYPanelCamposProcesoRecapParam++;
	}
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoRecap= new GridBagLayout();
		this.jPanelAccionesProcesoRecap.setLayout(gridaBagLayoutAccionesProcesoRecap);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoRecap= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoRecap.setLayout(gridaBagLayoutAccionesFormularioProcesoRecap);
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoRecap.add(this.jComboBoxTiposAccionesFormularioProcesoRecap, this.gridBagConstraintsProcesoRecap);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoRecap.add(this.jButtonModificarProcesoRecap, this.gridBagConstraintsProcesoRecap);							

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoRecap.add(this.jButtonEliminarProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = 0;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoRecap.add(this.jButtonActualizarProcesoRecap, this.gridBagConstraintsProcesoRecap);


		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = 0;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoRecap.add(this.jButtonGuardarCambiosProcesoRecap, this.gridBagConstraintsProcesoRecap);	
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = 0;		
		this.gridBagConstraintsProcesoRecap.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoRecap.add(this.jButtonCancelarProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoRecap);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();						
			this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoRecap.gridx = 0;		
			//this.gridBagConstraintsProcesoRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoRecap.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoRecap.gridx =0;
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoRecap, this.gridBagConstraintsProcesoRecap);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoRecap = new ProcesoRecapBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Recap DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Recap DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Recap Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoRecapModel procesorecapModel=new ProcesoRecapModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoRecapModel.ProcesoRecapFocusTraversalPolicy procesorecapFocusTraversalPolicy = procesorecapModel.new ProcesoRecapFocusTraversalPolicy(this);
			
			//procesorecapFocusTraversalPolicy.setprocesorecapJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesorecapModel);
			
			
			this.jContentPaneDetalleProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoRecap = new GridBagLayout();	
			this.jContentPaneDetalleProcesoRecap.setLayout(gridaBagLayoutDetalleProcesoRecap);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoRecap = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
				this.gridBagConstraintsProcesoRecap.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoRecap.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoRecap.add(jTtoolBarDetalleProcesoRecap, gridBagConstraintsProcesoRecap);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoRecap=   new JScrollPane(jContentPaneDetalleProcesoRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoRecap.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoRecap.gridx = 0;
	        
			this.jContentPaneDetalleProcesoRecap.add(jPanelCamposProcesoRecap, gridBagConstraintsProcesoRecap);
			
			
			
			
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
						//&& procesorecapSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoRecap= new GridBagConstraints();
						this.gridBagConstraintsProcesoRecap.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoRecap.gridx = 0;
						this.jContentPaneDetalleProcesoRecap.add(this.jTabbedPaneRelacionesProcesoRecap, this.gridBagConstraintsProcesoRecap);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoRecap.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoRecap.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
					this.gridBagConstraintsProcesoRecap.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoRecap.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoRecap.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoRecap.add(jPanelCamposOcultosProcesoRecap, gridBagConstraintsProcesoRecap);
				
					this.jPanelCamposOcultosProcesoRecap.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoRecap.gridx = 0;
	        this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoRecap.add(this.jPanelAccionesFormularioProcesoRecap, this.gridBagConstraintsProcesoRecap);							
			
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
	        this.gridBagConstraintsProcesoRecap.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoRecap.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoRecap.add(this.jPanelAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoRecap);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoRecap=   new JScrollPane(this.jPanelCamposProcesoRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoRecap.gridx = 0;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoRecap.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoRecap, this.gridBagConstraintsProcesoRecap);			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoRecap;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoRecap;
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
