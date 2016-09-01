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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.FormatoNomiPreguntaNomiConstantesFunciones;

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
public class FormatoNomiPreguntaNomiDetalleFormJInternalFrame extends FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormatoNomiPreguntaNomi;
	
	protected JMenuBar jmenuBarDetalleFormatoNomiPreguntaNomi;
	
	protected JMenu jmenuDetalleFormatoNomiPreguntaNomi;
	protected JMenu jmenuDetalleArchivoFormatoNomiPreguntaNomi;
	protected JMenu jmenuDetalleAccionesFormatoNomiPreguntaNomi;
	protected JMenu jmenuDetalleDatosFormatoNomiPreguntaNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoNomiPreguntaNomi;	
	protected GridBagConstraints gridBagConstraintsFormatoNomiPreguntaNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormatoNomiPreguntaNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factornomi="";

	protected PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntanomi="";
	
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
	
	

	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;
	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCalificacionEmpleado=false;
	public CalificacionEmpleadoSessionBean calificacionempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public FactorNomiSessionBean factornomiSessionBean;
	public PreguntaNomiSessionBean preguntanomiSessionBean;	
	
	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic;
	
	public JScrollPane jScrollPanelDatosFormatoNomiPreguntaNomi;
	public JScrollPane jScrollPanelDatosEdicionFormatoNomiPreguntaNomi;
	public JScrollPane jScrollPanelDatosGeneralFormatoNomiPreguntaNomi;
	
	protected JPanel jPanelCamposFormatoNomiPreguntaNomi;    
	protected JPanel jPanelCamposOcultosFormatoNomiPreguntaNomi;    	
	protected JPanel jPanelAccionesFormatoNomiPreguntaNomi;
	protected JPanel jPanelAccionesFormularioFormatoNomiPreguntaNomi;
    
	
	
	protected Integer iXPanelCamposFormatoNomiPreguntaNomi=0;
	protected Integer iYPanelCamposFormatoNomiPreguntaNomi=0;
	
	protected Integer iXPanelCamposOcultosFormatoNomiPreguntaNomi=0;
	protected Integer iYPanelCamposOcultosFormatoNomiPreguntaNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormatoNomiPreguntaNomi;
	public JButton jButtonModificarFormatoNomiPreguntaNomi;
	public JButton jButtonActualizarFormatoNomiPreguntaNomi;
    public JButton jButtonEliminarFormatoNomiPreguntaNomi;
	public JButton jButtonCancelarFormatoNomiPreguntaNomi;
    public JButton jButtonGuardarCambiosFormatoNomiPreguntaNomi;
	public JButton jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi;
	protected JButton jButtonCerrarFormatoNomiPreguntaNomi;
	
	
	protected JButton jButtonProcesarInformacionFormatoNomiPreguntaNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonModificarToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonActualizarToolBarFormatoNomiPreguntaNomi;
    protected JButton jButtonEliminarToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonCancelarToolBarFormatoNomiPreguntaNomi;
    protected JButton jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonCerrarToolBarFormatoNomiPreguntaNomi;
	
	protected JButton jButtonProcesarInformacionToolBarFormatoNomiPreguntaNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemModificarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemActualizarFormatoNomiPreguntaNomi;
    protected JMenuItem jMenuItemEliminarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemCancelarFormatoNomiPreguntaNomi;
    protected JMenuItem jMenuItemGuardarCambiosFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemCerrarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemDetalleCerrarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemMostrarOcultarFormatoNomiPreguntaNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoNomiPreguntaNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoNomiPreguntaNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormatoNomiPreguntaNomi;
	public JLabel jLabelIdFormatoNomiPreguntaNomi;
	public JLabel jLabelidFormatoNomiPreguntaNomi;
	public JButton jButtonidFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelponderacionFormatoNomiPreguntaNomi;
	public JLabel jLabelponderacionFormatoNomiPreguntaNomi;
	public JTextField jTextFieldponderacionFormatoNomiPreguntaNomi;
	public JButton jButtonponderacionFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormatoNomiPreguntaNomi;
	public JLabel jLabelid_empresaFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormatoNomiPreguntaNomi;
	public JButton jButtonid_empresaFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_empresaFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFormatoNomiPreguntaNomi;
	public JLabel jLabelid_sucursalFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFormatoNomiPreguntaNomi;
	public JButton jButtonid_sucursalFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_sucursalFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomiFormatoNomiPreguntaNomi;
	public JLabel jLabelid_formato_nomiFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiFormatoNomiPreguntaNomi;
	public JButton jButtonid_formato_nomiFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_factor_nomiFormatoNomiPreguntaNomi;
	public JLabel jLabelid_factor_nomiFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factor_nomiFormatoNomiPreguntaNomi;
	public JButton jButtonid_factor_nomiFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_pregunta_nomiFormatoNomiPreguntaNomi;
	public JLabel jLabelid_pregunta_nomiFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi;
	public JButton jButtonid_pregunta_nomiFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormatoNomiPreguntaNomi;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormatoNomiPreguntaNomi=new JPanel();
				this.jPanelAccionesFormularioFormatoNomiPreguntaNomi=new JPanel();
				this.jmenuBarDetalleFormatoNomiPreguntaNomi=new JMenuBar();
				this.jTtoolBarDetalleFormatoNomiPreguntaNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormatoNomiPreguntaNomi() {
		return this.jButtonActualizarToolBarFormatoNomiPreguntaNomi;
	}
	
	public JButton getjButtonEliminarToolBarFormatoNomiPreguntaNomi() {
		return this.jButtonEliminarToolBarFormatoNomiPreguntaNomi;
	}
	
	public JButton getjButtonCancelarToolBarFormatoNomiPreguntaNomi() {
		return this.jButtonCancelarToolBarFormatoNomiPreguntaNomi;
	}		
	
	public JButton getjButtonProcesarInformacionFormatoNomiPreguntaNomi() {
		return this.jButtonProcesarInformacionFormatoNomiPreguntaNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoNomiPreguntaNomi)	{
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi = jButtonProcesarInformacionFormatoNomiPreguntaNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposRelacionesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi = jComboBoxTiposRelacionesFormatoNomiPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposAccionesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi = jComboBoxTiposAccionesFormatoNomiPreguntaNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi = jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		
		this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoNomiPreguntaNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato Nomi Pregunta Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
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
	
		FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormatoNomiPreguntaNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormatoNomiPreguntaNomi=new JButtonMe();
				this.jButtonModificarToolBarFormatoNomiPreguntaNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormatoNomiPreguntaNomi,this.jTtoolBarDetalleFormatoNomiPreguntaNomi,
							"actualizar","actualizar","Actualizar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormatoNomiPreguntaNomi,this.jTtoolBarDetalleFormatoNomiPreguntaNomi,
							"eliminar","eliminar","Eliminar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormatoNomiPreguntaNomi,this.jTtoolBarDetalleFormatoNomiPreguntaNomi,
							"cancelar","cancelar","Cancelar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi,this.jTtoolBarDetalleFormatoNomiPreguntaNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormatoNomiPreguntaNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormatoNomiPreguntaNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormatoNomiPreguntaNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormatoNomiPreguntaNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormatoNomiPreguntaNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoNomiPreguntaNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoNomiPreguntaNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoNomiPreguntaNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormatoNomiPreguntaNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormatoNomiPreguntaNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormatoNomiPreguntaNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormatoNomiPreguntaNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormatoNomiPreguntaNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormatoNomiPreguntaNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormatoNomiPreguntaNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormatoNomiPreguntaNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormatoNomiPreguntaNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormatoNomiPreguntaNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormatoNomiPreguntaNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormatoNomiPreguntaNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoNomiPreguntaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoNomiPreguntaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoNomiPreguntaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormatoNomiPreguntaNomi.add(this.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi);
		
		this.jmenuDetalleAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemActualizarFormatoNomiPreguntaNomi);
		this.jmenuDetalleAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemEliminarFormatoNomiPreguntaNomi);
		this.jmenuDetalleAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemCancelarFormatoNomiPreguntaNomi);		
		
		//this.jmenuDetalleDatosFormatoNomiPreguntaNomi.add(this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi);				
		this.jmenuDetalleDatosFormatoNomiPreguntaNomi.add(this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi);				
				
		//this.jmenuDetalleAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormatoNomiPreguntaNomi.add(this.jmenuDetalleArchivoFormatoNomiPreguntaNomi);		
		this.jmenuBarDetalleFormatoNomiPreguntaNomi.add(this.jmenuDetalleAccionesFormatoNomiPreguntaNomi);		
		this.jmenuBarDetalleFormatoNomiPreguntaNomi.add(this.jmenuDetalleDatosFormatoNomiPreguntaNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormatoNomiPreguntaNomi.add(this.jmenuDetalleFormatoNomiPreguntaNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormatoNomiPreguntaNomi);				
	}
	
	
	public void inicializarElementosCamposFormatoNomiPreguntaNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormatoNomiPreguntaNomi = new JLabelMe();
		jLabelIdFormatoNomiPreguntaNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormatoNomiPreguntaNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormatoNomiPreguntaNomi= new GridBagLayout();

		this.jPanelidFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);

		jLabelidFormatoNomiPreguntaNomi = new JLabel();
		jLabelidFormatoNomiPreguntaNomi.setText("Id");

		jLabelidFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelponderacionFormatoNomiPreguntaNomi = new JLabelMe();
		this.jLabelponderacionFormatoNomiPreguntaNomi.setText(""+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION+" : *");
		this.jLabelponderacionFormatoNomiPreguntaNomi.setToolTipText("Ponderacion");
		this.jLabelponderacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelponderacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelponderacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelponderacionFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelponderacionFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelponderacionFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION);
		this.gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		this.jPanelponderacionFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);


		jTextFieldponderacionFormatoNomiPreguntaNomi= new JTextFieldMe();
		jTextFieldponderacionFormatoNomiPreguntaNomi.setEnabled(false);
		jTextFieldponderacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldponderacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldponderacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldponderacionFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldponderacionFormatoNomiPreguntaNomi.setText("0.0");

		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setText("U");
		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldponderacionFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldponderacionFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ponderacionFormatoNomiPreguntaNomiBusqueda"));

		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormatoNomiPreguntaNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormatoNomiPreguntaNomi = new JLabelMe();
		this.jLabelid_empresaFormatoNomiPreguntaNomi.setText(""+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormatoNomiPreguntaNomi.setToolTipText("Empresa");
		this.jLabelid_empresaFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		this.jPanelid_empresaFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);


		jComboBoxid_empresaFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_empresaFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormatoNomiPreguntaNomi.setEnabled(false);

		this.jButtonid_empresaFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonid_empresaFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonid_empresaFormatoNomiPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormatoNomiPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiPreguntaNomi"));

		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setText("U");
		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiPreguntaNomiBusqueda"));

		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.setText("U");
		this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiPreguntaNomiUpdate"));



					
		this.jLabelid_sucursalFormatoNomiPreguntaNomi = new JLabelMe();
		this.jLabelid_sucursalFormatoNomiPreguntaNomi.setText(""+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFormatoNomiPreguntaNomi.setToolTipText("Sucursal");
		this.jLabelid_sucursalFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		this.jPanelid_sucursalFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);


		jComboBoxid_sucursalFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.setEnabled(false);

		this.jButtonid_sucursalFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonid_sucursalFormatoNomiPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFormatoNomiPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiPreguntaNomi"));

		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setText("U");
		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiPreguntaNomiBusqueda"));

		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.setText("U");
		this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiPreguntaNomiUpdate"));



					
		this.jLabelid_formato_nomiFormatoNomiPreguntaNomi = new JLabelMe();
		this.jLabelid_formato_nomiFormatoNomiPreguntaNomi.setText(""+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI+" : *");
		this.jLabelid_formato_nomiFormatoNomiPreguntaNomi.setToolTipText("Formato Nomi");
		this.jLabelid_formato_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomiFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomiFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		this.gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		this.jPanelid_formato_nomiFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);


		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiFormatoNomiPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiFormatoNomiPreguntaNomi"));

		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setText("U");
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiFormatoNomiPreguntaNomiBusqueda"));

		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.setText("U");
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiFormatoNomiPreguntaNomiUpdate"));



					
		this.jLabelid_factor_nomiFormatoNomiPreguntaNomi = new JLabelMe();
		this.jLabelid_factor_nomiFormatoNomiPreguntaNomi.setText(""+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI+" : *");
		this.jLabelid_factor_nomiFormatoNomiPreguntaNomi.setToolTipText("Factor Nomi");
		this.jLabelid_factor_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factor_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factor_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factor_nomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factor_nomiFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factor_nomiFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
		this.gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		this.jPanelid_factor_nomiFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);


		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factor_nomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiFormatoNomiPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiFormatoNomiPreguntaNomi"));

		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setText("U");
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiFormatoNomiPreguntaNomiBusqueda"));

		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.setText("U");
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiFormatoNomiPreguntaNomiUpdate"));



					
		this.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi = new JLabelMe();
		this.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi.setText(""+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI+" : *");
		this.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi.setToolTipText("Pregunta Nomi");
		this.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_nomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.setToolTipText(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
		this.gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.setLayout(this.gridaBagLayoutFormatoNomiPreguntaNomi);


		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_nomiFormatoNomiPreguntaNomi"));

		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setText("U");
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_nomiFormatoNomiPreguntaNomiBusqueda"));

		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.setVisible(false);		}

		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.setText("U");
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_nomiFormatoNomiPreguntaNomiUpdate"));



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
		//this.jInternalFrameDetalleFormatoNomiPreguntaNomi = new FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formato Nomi Pregunta Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoNomiPreguntaNomi= new GridBagLayout();
		

		
		String sToolTipFormatoNomiPreguntaNomi="";
		sToolTipFormatoNomiPreguntaNomi=FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoNomiPreguntaNomi+="(Nomina.FormatoNomiPreguntaNomi)";
		}
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoNomiPreguntaNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonModificarFormatoNomiPreguntaNomi = new JButtonMe();
        this.jButtonActualizarFormatoNomiPreguntaNomi = new JButtonMe();
        this.jButtonEliminarFormatoNomiPreguntaNomi = new JButtonMe();
        this.jButtonCancelarFormatoNomiPreguntaNomi = new JButtonMe();
        this.jButtonGuardarCambiosFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonCerrarFormatoNomiPreguntaNomi = new JButtonMe();
		
		this.jScrollPanelDatosFormatoNomiPreguntaNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi = new JScrollPane();
				
		
		
		this.jPanelCamposFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formato Nomi Pregunta Nomi";
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Pregunta Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoNomiPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormatoNomiPreguntaNomi.setName("jPanelCamposFormatoNomiPreguntaNomi"); 

		this.jPanelCamposOcultosFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormatoNomiPreguntaNomi.setName("jPanelCamposOcultosFormatoNomiPreguntaNomi"); 

        this.jPanelAccionesFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoNomiPreguntaNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormatoNomiPreguntaNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormatoNomiPreguntaNomi.setText("Nuevo");
		this.jButtonModificarFormatoNomiPreguntaNomi.setText("Editar");
        this.jButtonActualizarFormatoNomiPreguntaNomi.setText("Actualizar");
        this.jButtonEliminarFormatoNomiPreguntaNomi.setText("Eliminar");
        this.jButtonCancelarFormatoNomiPreguntaNomi.setText("Cancelar");
        this.jButtonGuardarCambiosFormatoNomiPreguntaNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.setText("Guardar");
		this.jButtonCerrarFormatoNomiPreguntaNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoNomiPreguntaNomi,"nuevo_button","Nuevo",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormatoNomiPreguntaNomi,"modificar_button","Editar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormatoNomiPreguntaNomi,"actualizar_button","Actualizar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormatoNomiPreguntaNomi,"eliminar_button","Eliminar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormatoNomiPreguntaNomi,"cancelar_button","Cancelar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormatoNomiPreguntaNomi,"guardarcambios_button","Guardar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi,"guardarcambiostabla_button","Guardar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoNomiPreguntaNomi,"cerrar_button","Salir",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormatoNomiPreguntaNomi.setToolTipText("Nuevo"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormatoNomiPreguntaNomi.setToolTipText("Editar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormatoNomiPreguntaNomi.setToolTipText("Actualizar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormatoNomiPreguntaNomi.setToolTipText("Eliminar)"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormatoNomiPreguntaNomi.setToolTipText("Cancelar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormatoNomiPreguntaNomi.setToolTipText("Guardar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.setToolTipText("Guardar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoNomiPreguntaNomi.setToolTipText("Salir"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoNomiPreguntaNomi";
		inputMap = this.jButtonNuevoFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoNomiPreguntaNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonActualizarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormatoNomiPreguntaNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonEliminarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormatoNomiPreguntaNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonCancelarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormatoNomiPreguntaNomi"));
		
		//CERRAR		
		sMapKey = "CerrarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonCerrarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoNomiPreguntaNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoNomiPreguntaNomi";
		inputMap = this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoNomiPreguntaNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi.setToolTipText("Nuevo FormatoNomiPreguntaNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi.setToolTipText("Sin Cerrar Ventana FormatoNomiPreguntaNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setText("Accion");
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormatoNomiPreguntaNomi = new JLabelMe();
		
		this.jLabelAccionesFormatoNomiPreguntaNomi.setText("Acciones");		
		this.jLabelAccionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormatoNomiPreguntaNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormatoNomiPreguntaNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormatoNomiPreguntaNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormatoNomiPreguntaNomi = new GridBagLayout();
		
		this.jPanelCamposFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutCamposFormatoNomiPreguntaNomi);
		this.jPanelCamposOcultosFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutCamposOcultosFormatoNomiPreguntaNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormatoNomiPreguntaNomi.add(jLabelIdFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormatoNomiPreguntaNomi.add(jLabelidFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormatoNomiPreguntaNomi.add(jLabelid_empresaFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoNomiPreguntaNomi.add(jButtonid_empresaFormatoNomiPreguntaNomiBusqueda, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoNomiPreguntaNomi.add(jButtonid_empresaFormatoNomiPreguntaNomiUpdate, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormatoNomiPreguntaNomi.add(jComboBoxid_empresaFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFormatoNomiPreguntaNomi.add(jLabelid_sucursalFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormatoNomiPreguntaNomi.add(jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormatoNomiPreguntaNomi.add(jButtonid_sucursalFormatoNomiPreguntaNomiUpdate, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFormatoNomiPreguntaNomi.add(jComboBoxid_sucursalFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomiFormatoNomiPreguntaNomi.add(jLabelid_formato_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiFormatoNomiPreguntaNomi.add(jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiFormatoNomiPreguntaNomi.add(jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomiFormatoNomiPreguntaNomi.add(jComboBoxid_formato_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factor_nomiFormatoNomiPreguntaNomi.add(jLabelid_factor_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factor_nomiFormatoNomiPreguntaNomi.add(jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factor_nomiFormatoNomiPreguntaNomi.add(jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factor_nomiFormatoNomiPreguntaNomi.add(jComboBoxid_factor_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.add(jLabelid_pregunta_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.add(jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.add(jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.add(jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelponderacionFormatoNomiPreguntaNomi.add(jLabelponderacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelponderacionFormatoNomiPreguntaNomi.add(jButtonponderacionFormatoNomiPreguntaNomiBusqueda, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	}

	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelponderacionFormatoNomiPreguntaNomi.add(jTextFieldponderacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiPreguntaNomi.add(this.jPanelidFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposFormatoNomiPreguntaNomi=0;
		iYPanelCamposFormatoNomiPreguntaNomi++;
	}
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiPreguntaNomi.add(this.jPanelid_formato_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposFormatoNomiPreguntaNomi=0;
		iYPanelCamposFormatoNomiPreguntaNomi++;
	}
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiPreguntaNomi.add(this.jPanelid_factor_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposFormatoNomiPreguntaNomi=0;
		iYPanelCamposFormatoNomiPreguntaNomi++;
	}
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiPreguntaNomi.add(this.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposFormatoNomiPreguntaNomi=0;
		iYPanelCamposFormatoNomiPreguntaNomi++;
	}
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiPreguntaNomi.add(this.jPanelponderacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposFormatoNomiPreguntaNomi=0;
		iYPanelCamposFormatoNomiPreguntaNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposOcultosFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposOcultosFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoNomiPreguntaNomi.add(this.jPanelid_empresaFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposOcultosFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposOcultosFormatoNomiPreguntaNomi=0;
		iYPanelCamposOcultosFormatoNomiPreguntaNomi++;
	}
	this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iYPanelCamposOcultosFormatoNomiPreguntaNomi;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iXPanelCamposOcultosFormatoNomiPreguntaNomi++;
	this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiPreguntaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoNomiPreguntaNomi.add(this.jPanelid_sucursalFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);



	if(iXPanelCamposOcultosFormatoNomiPreguntaNomi % 1==0) {
		iXPanelCamposOcultosFormatoNomiPreguntaNomi=0;
		iYPanelCamposOcultosFormatoNomiPreguntaNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormatoNomiPreguntaNomi= new GridBagLayout();
		this.jPanelAccionesFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutAccionesFormatoNomiPreguntaNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormatoNomiPreguntaNomi= new GridBagLayout();
		this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutAccionesFormularioFormatoNomiPreguntaNomi);
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.add(this.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.add(this.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.add(this.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoNomiPreguntaNomi.add(this.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormatoNomiPreguntaNomi.add(this.jButtonModificarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);							

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormatoNomiPreguntaNomi.add(this.jButtonEliminarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoNomiPreguntaNomi.add(this.jButtonActualizarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoNomiPreguntaNomi.add(this.jButtonGuardarCambiosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);	
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormatoNomiPreguntaNomi.add(this.jButtonCancelarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoNomiPreguntaNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();						
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;		
			//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormatoNomiPreguntaNomi = new FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formato Nomi Pregunta Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formato Nomi Pregunta Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Nomi Pregunta Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormatoNomiPreguntaNomiModel formatonomipreguntanomiModel=new FormatoNomiPreguntaNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//FormatoNomiPreguntaNomiModel.FormatoNomiPreguntaNomiFocusTraversalPolicy formatonomipreguntanomiFocusTraversalPolicy = formatonomipreguntanomiModel.new FormatoNomiPreguntaNomiFocusTraversalPolicy(this);
			
			//formatonomipreguntanomiFocusTraversalPolicy.setformatonomipreguntanomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formatonomipreguntanomiModel);
			
			
			this.jContentPaneDetalleFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormatoNomiPreguntaNomi = new GridBagLayout();	
			this.jContentPaneDetalleFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutDetalleFormatoNomiPreguntaNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoNomiPreguntaNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
					
				
				this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(jTtoolBarDetalleFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);								
				
}
			
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi=   new JScrollPane(jContentPaneDetalleFormatoNomiPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	        
			this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(jPanelCamposFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);
			
			
			
			
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
						&& formatonomipreguntanomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(this.puedeCargarPorParteCalificacionEmpleado,false,-1);
					
					if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormatoNomiPreguntaNomi= new GridBagConstraints();
						this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
						this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormatoNomiPreguntaNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
					this.gridBagConstraintsFormatoNomiPreguntaNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
					
				
					this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(jPanelCamposOcultosFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);
				
					this.jPanelCamposOcultosFormatoNomiPreguntaNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	        this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(this.jPanelAccionesFormularioFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);							
			
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
	        this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(this.jPanelAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormatoNomiPreguntaNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi=   new JScrollPane(this.jPanelCamposFormatoNomiPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionFormatoNomiPreguntaNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		this.calificacionempleadoSessionBean.setConGuardarRelaciones(false);
		this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.calificacionempleadoBeanSwingJInternalFramePopup=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.calificacionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {

				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.calificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.calificacionempleadoBeanSwingJInternalFrame.setcalificacionempleadoSessionBean(this.calificacionempleadoSessionBean);

				//this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
				//this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
				//this.jContentPaneDetalleFormatoNomiPreguntaNomi.add(this.calificacionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormatoNomiPreguntaNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.add("Calificacion Empleados",this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setComponentAt(iIndexTab,this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCalificacionEmpleado) {
					this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.add("Calificacion Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCalificacionEmpleadoBeanSwingJInternalFrame(List<FormatoNomiPreguntaNomi> formatonomipreguntanomis,FormatoNomiPreguntaNomi formatonomipreguntanomi,CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					calificacionempleadoBeanSwingJInternalFrame.getCalificacionEmpleadoLogic().setConnexion(this.formatonomipreguntanomiLogic.getConnexion());

					calificacionempleadoBeanSwingJInternalFrame.setformatonomipreguntanomisForeignKey(formatonomipreguntanomis);
					calificacionempleadoBeanSwingJInternalFrame.setformatonomipreguntanomiForeignKey(formatonomipreguntanomi);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi(true);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setlidFormatoNomiPreguntaNomiActual(formatonomipreguntanomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					calificacionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyCalificacionEmpleado(calificacionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					calificacionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormatoNomiPreguntaNomi(true);
					calificacionempleadoBeanSwingJInternalFrame.setid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi(formatonomipreguntanomi.getId());

					if(!this.conCargarFormDetalle) {
						calificacionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					calificacionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameFormatoNomiPreguntaNomiForeignKey(formatonomipreguntanomi,1,false,true,true);
					calificacionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					calificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormatoNomiPreguntaNomi");
					calificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormatoNomiPreguntaNomi");
					calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCalificacionEmpleado("n",calificacionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, calificacionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					calificacionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					calificacionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("relacionado");
					} else {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("no_relacionado");
					}

					calificacionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionCalificacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
