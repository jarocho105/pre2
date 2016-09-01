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
import com.bydan.erp.nomina.util.FormatoNomiFactorNomiConstantesFunciones;

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
public class FormatoNomiFactorNomiDetalleFormJInternalFrame extends FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormatoNomiFactorNomi;
	
	protected JMenuBar jmenuBarDetalleFormatoNomiFactorNomi;
	
	protected JMenu jmenuDetalleFormatoNomiFactorNomi;
	protected JMenu jmenuDetalleArchivoFormatoNomiFactorNomi;
	protected JMenu jmenuDetalleAccionesFormatoNomiFactorNomi;
	protected JMenu jmenuDetalleDatosFormatoNomiFactorNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoNomiFactorNomi;	
	protected GridBagConstraints gridBagConstraintsFormatoNomiFactorNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormatoNomiFactorNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factornomi="";
	
	public FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean;
	
	

	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;
	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCalificacionEmpleado=false;
	public CalificacionEmpleadoSessionBean calificacionempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public FactorNomiSessionBean factornomiSessionBean;	
	
	public FormatoNomiFactorNomiLogic formatonomifactornomiLogic;
	
	public JScrollPane jScrollPanelDatosFormatoNomiFactorNomi;
	public JScrollPane jScrollPanelDatosEdicionFormatoNomiFactorNomi;
	public JScrollPane jScrollPanelDatosGeneralFormatoNomiFactorNomi;
	
	protected JPanel jPanelCamposFormatoNomiFactorNomi;    
	protected JPanel jPanelCamposOcultosFormatoNomiFactorNomi;    	
	protected JPanel jPanelAccionesFormatoNomiFactorNomi;
	protected JPanel jPanelAccionesFormularioFormatoNomiFactorNomi;
    
	
	
	protected Integer iXPanelCamposFormatoNomiFactorNomi=0;
	protected Integer iYPanelCamposFormatoNomiFactorNomi=0;
	
	protected Integer iXPanelCamposOcultosFormatoNomiFactorNomi=0;
	protected Integer iYPanelCamposOcultosFormatoNomiFactorNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormatoNomiFactorNomi;
	public JButton jButtonModificarFormatoNomiFactorNomi;
	public JButton jButtonActualizarFormatoNomiFactorNomi;
    public JButton jButtonEliminarFormatoNomiFactorNomi;
	public JButton jButtonCancelarFormatoNomiFactorNomi;
    public JButton jButtonGuardarCambiosFormatoNomiFactorNomi;
	public JButton jButtonGuardarCambiosTablaFormatoNomiFactorNomi;
	protected JButton jButtonCerrarFormatoNomiFactorNomi;
	
	
	protected JButton jButtonProcesarInformacionFormatoNomiFactorNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormatoNomiFactorNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoNomiFactorNomi;
	protected JButton jButtonModificarToolBarFormatoNomiFactorNomi;
	protected JButton jButtonActualizarToolBarFormatoNomiFactorNomi;
    protected JButton jButtonEliminarToolBarFormatoNomiFactorNomi;
	protected JButton jButtonCancelarToolBarFormatoNomiFactorNomi;
    protected JButton jButtonGuardarCambiosToolBarFormatoNomiFactorNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoNomiFactorNomi;
	protected JButton jButtonCerrarToolBarFormatoNomiFactorNomi;
	
	protected JButton jButtonProcesarInformacionToolBarFormatoNomiFactorNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemModificarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemActualizarFormatoNomiFactorNomi;
    protected JMenuItem jMenuItemEliminarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemCancelarFormatoNomiFactorNomi;
    protected JMenuItem jMenuItemGuardarCambiosFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemCerrarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemDetalleCerrarFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi;
	protected JMenuItem jMenuItemMostrarOcultarFormatoNomiFactorNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoNomiFactorNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoNomiFactorNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormatoNomiFactorNomi;
	public JLabel jLabelIdFormatoNomiFactorNomi;
	public JLabel jLabelidFormatoNomiFactorNomi;
	public JButton jButtonidFormatoNomiFactorNomiBusqueda= new JButtonMe();

	public JPanel jPanelponderacionFormatoNomiFactorNomi;
	public JLabel jLabelponderacionFormatoNomiFactorNomi;
	public JTextField jTextFieldponderacionFormatoNomiFactorNomi;
	public JButton jButtonponderacionFormatoNomiFactorNomiBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoFormatoNomiFactorNomi;
	public JLabel jLabelesta_activoFormatoNomiFactorNomi;
	public JCheckBox jCheckBoxesta_activoFormatoNomiFactorNomi;
	public JButton jButtonesta_activoFormatoNomiFactorNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormatoNomiFactorNomi;
	public JLabel jLabelid_empresaFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormatoNomiFactorNomi;
	public JButton jButtonid_empresaFormatoNomiFactorNomi= new JButtonMe();
	public JButton jButtonid_empresaFormatoNomiFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormatoNomiFactorNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFormatoNomiFactorNomi;
	public JLabel jLabelid_sucursalFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFormatoNomiFactorNomi;
	public JButton jButtonid_sucursalFormatoNomiFactorNomi= new JButtonMe();
	public JButton jButtonid_sucursalFormatoNomiFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFormatoNomiFactorNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomiFormatoNomiFactorNomi;
	public JLabel jLabelid_formato_nomiFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiFormatoNomiFactorNomi;
	public JButton jButtonid_formato_nomiFormatoNomiFactorNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiFormatoNomiFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_factor_nomiFormatoNomiFactorNomi;
	public JLabel jLabelid_factor_nomiFormatoNomiFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factor_nomiFormatoNomiFactorNomi;
	public JButton jButtonid_factor_nomiFormatoNomiFactorNomi= new JButtonMe();
	public JButton jButtonid_factor_nomiFormatoNomiFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormatoNomiFactorNomi;
	
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
	
	public FormatoNomiFactorNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormatoNomiFactorNomi=new JPanel();
				this.jPanelAccionesFormularioFormatoNomiFactorNomi=new JPanel();
				this.jmenuBarDetalleFormatoNomiFactorNomi=new JMenuBar();
				this.jTtoolBarDetalleFormatoNomiFactorNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormatoNomiFactorNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiFactorNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoNomiFactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormatoNomiFactorNomi() {
		return this.jButtonActualizarToolBarFormatoNomiFactorNomi;
	}
	
	public JButton getjButtonEliminarToolBarFormatoNomiFactorNomi() {
		return this.jButtonEliminarToolBarFormatoNomiFactorNomi;
	}
	
	public JButton getjButtonCancelarToolBarFormatoNomiFactorNomi() {
		return this.jButtonCancelarToolBarFormatoNomiFactorNomi;
	}		
	
	public JButton getjButtonProcesarInformacionFormatoNomiFactorNomi() {
		return this.jButtonProcesarInformacionFormatoNomiFactorNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoNomiFactorNomi)	{
		this.jButtonProcesarInformacionFormatoNomiFactorNomi = jButtonProcesarInformacionFormatoNomiFactorNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoNomiFactorNomi() {
		return this.jComboBoxTiposAccionesFormatoNomiFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposRelacionesFormatoNomiFactorNomi) {
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi = jComboBoxTiposRelacionesFormatoNomiFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposAccionesFormatoNomiFactorNomi) {
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi = jComboBoxTiposAccionesFormatoNomiFactorNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormatoNomiFactorNomi() {
		return this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormatoNomiFactorNomi(
			JComboBox jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi) {
		this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi = jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		
		this.formatonomifactornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatonomifactornomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoNomiFactorNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato Nomi Factor Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
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
	
		FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormatoNomiFactorNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormatoNomiFactorNomi=new JButtonMe();
				this.jButtonModificarToolBarFormatoNomiFactorNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormatoNomiFactorNomi,this.jTtoolBarDetalleFormatoNomiFactorNomi,
							"actualizar","actualizar","Actualizar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormatoNomiFactorNomi,this.jTtoolBarDetalleFormatoNomiFactorNomi,
							"eliminar","eliminar","Eliminar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormatoNomiFactorNomi,this.jTtoolBarDetalleFormatoNomiFactorNomi,
							"cancelar","cancelar","Cancelar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi,this.jTtoolBarDetalleFormatoNomiFactorNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormatoNomiFactorNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormatoNomiFactorNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormatoNomiFactorNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormatoNomiFactorNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormatoNomiFactorNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoNomiFactorNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoNomiFactorNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoNomiFactorNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormatoNomiFactorNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormatoNomiFactorNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormatoNomiFactorNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormatoNomiFactorNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormatoNomiFactorNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormatoNomiFactorNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormatoNomiFactorNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormatoNomiFactorNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormatoNomiFactorNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormatoNomiFactorNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormatoNomiFactorNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormatoNomiFactorNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormatoNomiFactorNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoNomiFactorNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoNomiFactorNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoNomiFactorNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoNomiFactorNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoNomiFactorNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormatoNomiFactorNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormatoNomiFactorNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormatoNomiFactorNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoNomiFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoNomiFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoNomiFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormatoNomiFactorNomi.add(this.jMenuItemDetalleCerrarFormatoNomiFactorNomi);
		
		this.jmenuDetalleAccionesFormatoNomiFactorNomi.add(this.jMenuItemActualizarFormatoNomiFactorNomi);
		this.jmenuDetalleAccionesFormatoNomiFactorNomi.add(this.jMenuItemEliminarFormatoNomiFactorNomi);
		this.jmenuDetalleAccionesFormatoNomiFactorNomi.add(this.jMenuItemCancelarFormatoNomiFactorNomi);		
		
		//this.jmenuDetalleDatosFormatoNomiFactorNomi.add(this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi);				
		this.jmenuDetalleDatosFormatoNomiFactorNomi.add(this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi);				
				
		//this.jmenuDetalleAccionesFormatoNomiFactorNomi.add(this.jMenuItemGuardarCambiosFormatoNomiFactorNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormatoNomiFactorNomi.add(this.jmenuDetalleArchivoFormatoNomiFactorNomi);		
		this.jmenuBarDetalleFormatoNomiFactorNomi.add(this.jmenuDetalleAccionesFormatoNomiFactorNomi);		
		this.jmenuBarDetalleFormatoNomiFactorNomi.add(this.jmenuDetalleDatosFormatoNomiFactorNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormatoNomiFactorNomi.add(this.jmenuDetalleFormatoNomiFactorNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormatoNomiFactorNomi);				
	}
	
	
	public void inicializarElementosCamposFormatoNomiFactorNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormatoNomiFactorNomi = new JLabelMe();
		jLabelIdFormatoNomiFactorNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormatoNomiFactorNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormatoNomiFactorNomi= new GridBagLayout();

		this.jPanelidFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);

		jLabelidFormatoNomiFactorNomi = new JLabel();
		jLabelidFormatoNomiFactorNomi.setText("Id");

		jLabelidFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelponderacionFormatoNomiFactorNomi = new JLabelMe();
		this.jLabelponderacionFormatoNomiFactorNomi.setText(""+FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION+" : *");
		this.jLabelponderacionFormatoNomiFactorNomi.setToolTipText("Ponderacion");
		this.jLabelponderacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelponderacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelponderacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelponderacionFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelponderacionFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelponderacionFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION);
		this.gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		this.jPanelponderacionFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);


		jTextFieldponderacionFormatoNomiFactorNomi= new JTextFieldMe();
		jTextFieldponderacionFormatoNomiFactorNomi.setEnabled(false);
		jTextFieldponderacionFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldponderacionFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldponderacionFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldponderacionFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldponderacionFormatoNomiFactorNomi.setText("0.0");

		this.jButtonponderacionFormatoNomiFactorNomiBusqueda= new JButtonMe();
		this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setText("U");
		this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonponderacionFormatoNomiFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldponderacionFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldponderacionFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ponderacionFormatoNomiFactorNomiBusqueda"));

		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonponderacionFormatoNomiFactorNomiBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoFormatoNomiFactorNomi = new JLabelMe();
		this.jLabelesta_activoFormatoNomiFactorNomi.setText(""+FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoFormatoNomiFactorNomi.setToolTipText("Esta Activo");
		this.jLabelesta_activoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		this.jPanelesta_activoFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);


		jCheckBoxesta_activoFormatoNomiFactorNomi= new JCheckBoxMe();
		jCheckBoxesta_activoFormatoNomiFactorNomi.setEnabled(false);

		jCheckBoxesta_activoFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda= new JButtonMe();
		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setText("U");
		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoFormatoNomiFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoFormatoNomiFactorNomiBusqueda"));

		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoFormatoNomiFactorNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormatoNomiFactorNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormatoNomiFactorNomi = new JLabelMe();
		this.jLabelid_empresaFormatoNomiFactorNomi.setText(""+FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormatoNomiFactorNomi.setToolTipText("Empresa");
		this.jLabelid_empresaFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		this.jPanelid_empresaFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);


		jComboBoxid_empresaFormatoNomiFactorNomi= new JComboBoxMe();
		jComboBoxid_empresaFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormatoNomiFactorNomi.setEnabled(false);

		this.jButtonid_empresaFormatoNomiFactorNomi= new JButtonMe();
		this.jButtonid_empresaFormatoNomiFactorNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomiFactorNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomiFactorNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomiFactorNomi.setText("Buscar");
		this.jButtonid_empresaFormatoNomiFactorNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormatoNomiFactorNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiFactorNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiFactorNomi"));

		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setText("U");
		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiFactorNomiBusqueda"));

		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormatoNomiFactorNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormatoNomiFactorNomiUpdate= new JButtonMe();
		this.jButtonid_empresaFormatoNomiFactorNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiFactorNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiFactorNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoNomiFactorNomiUpdate.setText("U");
		this.jButtonid_empresaFormatoNomiFactorNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormatoNomiFactorNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiFactorNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiFactorNomiUpdate"));



					
		this.jLabelid_sucursalFormatoNomiFactorNomi = new JLabelMe();
		this.jLabelid_sucursalFormatoNomiFactorNomi.setText(""+FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFormatoNomiFactorNomi.setToolTipText("Sucursal");
		this.jLabelid_sucursalFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		this.jPanelid_sucursalFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);


		jComboBoxid_sucursalFormatoNomiFactorNomi= new JComboBoxMe();
		jComboBoxid_sucursalFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFormatoNomiFactorNomi.setEnabled(false);

		this.jButtonid_sucursalFormatoNomiFactorNomi= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiFactorNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomiFactorNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomiFactorNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomiFactorNomi.setText("Buscar");
		this.jButtonid_sucursalFormatoNomiFactorNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFormatoNomiFactorNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiFactorNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiFactorNomi"));

		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setText("U");
		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiFactorNomiBusqueda"));

		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFormatoNomiFactorNomiUpdate= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiFactorNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiFactorNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiFactorNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormatoNomiFactorNomiUpdate.setText("U");
		this.jButtonid_sucursalFormatoNomiFactorNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFormatoNomiFactorNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiFactorNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiFactorNomiUpdate"));



					
		this.jLabelid_formato_nomiFormatoNomiFactorNomi = new JLabelMe();
		this.jLabelid_formato_nomiFormatoNomiFactorNomi.setText(""+FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI+" : *");
		this.jLabelid_formato_nomiFormatoNomiFactorNomi.setToolTipText("Formato Nomi");
		this.jLabelid_formato_nomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomiFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomiFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		this.gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		this.jPanelid_formato_nomiFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);


		jComboBoxid_formato_nomiFormatoNomiFactorNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomiFormatoNomiFactorNomi= new JButtonMe();
		this.jButtonid_formato_nomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiFormatoNomiFactorNomi.setText("Buscar");
		this.jButtonid_formato_nomiFormatoNomiFactorNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomiFormatoNomiFactorNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiFormatoNomiFactorNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiFormatoNomiFactorNomi"));

		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda= new JButtonMe();
		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setText("U");
		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiFormatoNomiFactorNomiBusqueda"));

		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate= new JButtonMe();
		this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.setText("U");
		this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiFormatoNomiFactorNomiUpdate"));



					
		this.jLabelid_factor_nomiFormatoNomiFactorNomi = new JLabelMe();
		this.jLabelid_factor_nomiFormatoNomiFactorNomi.setText(""+FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI+" : *");
		this.jLabelid_factor_nomiFormatoNomiFactorNomi.setToolTipText("Factor Nomi");
		this.jLabelid_factor_nomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factor_nomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_factor_nomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factor_nomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factor_nomiFormatoNomiFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factor_nomiFormatoNomiFactorNomi.setToolTipText(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI);
		this.gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		this.jPanelid_factor_nomiFormatoNomiFactorNomi.setLayout(this.gridaBagLayoutFormatoNomiFactorNomi);


		jComboBoxid_factor_nomiFormatoNomiFactorNomi= new JComboBoxMe();
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factor_nomiFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factor_nomiFormatoNomiFactorNomi= new JButtonMe();
		this.jButtonid_factor_nomiFormatoNomiFactorNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiFormatoNomiFactorNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiFormatoNomiFactorNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factor_nomiFormatoNomiFactorNomi.setText("Buscar");
		this.jButtonid_factor_nomiFormatoNomiFactorNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factor_nomiFormatoNomiFactorNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiFormatoNomiFactorNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiFormatoNomiFactorNomi"));

		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda= new JButtonMe();
		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setText("U");
		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiFormatoNomiFactorNomiBusqueda"));

		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.setVisible(false);		}

		this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate= new JButtonMe();
		this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.setText("U");
		this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factor_nomiFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factor_nomiFormatoNomiFactorNomiUpdate"));



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
		//this.jInternalFrameDetalleFormatoNomiFactorNomi = new FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formato Nomi Factor Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoNomiFactorNomi= new GridBagLayout();
		

		
		String sToolTipFormatoNomiFactorNomi="";
		sToolTipFormatoNomiFactorNomi=FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoNomiFactorNomi+="(Nomina.FormatoNomiFactorNomi)";
		}
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoNomiFactorNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonModificarFormatoNomiFactorNomi = new JButtonMe();
        this.jButtonActualizarFormatoNomiFactorNomi = new JButtonMe();
        this.jButtonEliminarFormatoNomiFactorNomi = new JButtonMe();
        this.jButtonCancelarFormatoNomiFactorNomi = new JButtonMe();
        this.jButtonGuardarCambiosFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi = new JButtonMe();
		this.jButtonCerrarFormatoNomiFactorNomi = new JButtonMe();
		
		this.jScrollPanelDatosFormatoNomiFactorNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormatoNomiFactorNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralFormatoNomiFactorNomi = new JScrollPane();
				
		
		
		this.jPanelCamposFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formato Nomi Factor Nomi";
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Factor Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoNomiFactorNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormatoNomiFactorNomi.setName("jPanelCamposFormatoNomiFactorNomi"); 

		this.jPanelCamposOcultosFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormatoNomiFactorNomi.setName("jPanelCamposOcultosFormatoNomiFactorNomi"); 

        this.jPanelAccionesFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoNomiFactorNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormatoNomiFactorNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormatoNomiFactorNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormatoNomiFactorNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormatoNomiFactorNomi.setText("Nuevo");
		this.jButtonModificarFormatoNomiFactorNomi.setText("Editar");
        this.jButtonActualizarFormatoNomiFactorNomi.setText("Actualizar");
        this.jButtonEliminarFormatoNomiFactorNomi.setText("Eliminar");
        this.jButtonCancelarFormatoNomiFactorNomi.setText("Cancelar");
        this.jButtonGuardarCambiosFormatoNomiFactorNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.setText("Guardar");
		this.jButtonCerrarFormatoNomiFactorNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoNomiFactorNomi,"nuevo_button","Nuevo",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormatoNomiFactorNomi,"modificar_button","Editar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormatoNomiFactorNomi,"actualizar_button","Actualizar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormatoNomiFactorNomi,"eliminar_button","Eliminar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormatoNomiFactorNomi,"cancelar_button","Cancelar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormatoNomiFactorNomi,"guardarcambios_button","Guardar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi,"guardarcambiostabla_button","Guardar",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoNomiFactorNomi,"cerrar_button","Salir",this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormatoNomiFactorNomi.setToolTipText("Nuevo"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormatoNomiFactorNomi.setToolTipText("Editar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormatoNomiFactorNomi.setToolTipText("Actualizar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormatoNomiFactorNomi.setToolTipText("Eliminar)"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormatoNomiFactorNomi.setToolTipText("Cancelar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormatoNomiFactorNomi.setToolTipText("Guardar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.setToolTipText("Guardar"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoNomiFactorNomi.setToolTipText("Salir"+" "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoNomiFactorNomi";
		inputMap = this.jButtonNuevoFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoNomiFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoNomiFactorNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormatoNomiFactorNomi";
		inputMap = this.jButtonActualizarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormatoNomiFactorNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarFormatoNomiFactorNomi";
		inputMap = this.jButtonEliminarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormatoNomiFactorNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarFormatoNomiFactorNomi";
		inputMap = this.jButtonCancelarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormatoNomiFactorNomi"));
		
		//CERRAR		
		sMapKey = "CerrarFormatoNomiFactorNomi";
		inputMap = this.jButtonCerrarFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoNomiFactorNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoNomiFactorNomi";
		inputMap = this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoNomiFactorNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi.setToolTipText("Nuevo FormatoNomiFactorNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi.setToolTipText("Sin Cerrar Ventana FormatoNomiFactorNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setText("Accion");
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormatoNomiFactorNomi = new JLabelMe();
		
		this.jLabelAccionesFormatoNomiFactorNomi.setText("Acciones");		
		this.jLabelAccionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormatoNomiFactorNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormatoNomiFactorNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormatoNomiFactorNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesFormatoNomiFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormatoNomiFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormatoNomiFactorNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormatoNomiFactorNomi = new GridBagLayout();
		
		this.jPanelCamposFormatoNomiFactorNomi.setLayout(gridaBagLayoutCamposFormatoNomiFactorNomi);
		this.jPanelCamposOcultosFormatoNomiFactorNomi.setLayout(gridaBagLayoutCamposOcultosFormatoNomiFactorNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormatoNomiFactorNomi.add(jLabelIdFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormatoNomiFactorNomi.add(jLabelidFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormatoNomiFactorNomi.add(jLabelid_empresaFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoNomiFactorNomi.add(jButtonid_empresaFormatoNomiFactorNomiBusqueda, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoNomiFactorNomi.add(jButtonid_empresaFormatoNomiFactorNomiUpdate, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormatoNomiFactorNomi.add(jComboBoxid_empresaFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFormatoNomiFactorNomi.add(jLabelid_sucursalFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormatoNomiFactorNomi.add(jButtonid_sucursalFormatoNomiFactorNomiBusqueda, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormatoNomiFactorNomi.add(jButtonid_sucursalFormatoNomiFactorNomiUpdate, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFormatoNomiFactorNomi.add(jComboBoxid_sucursalFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomiFormatoNomiFactorNomi.add(jLabelid_formato_nomiFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiFormatoNomiFactorNomi.add(jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiFormatoNomiFactorNomi.add(jButtonid_formato_nomiFormatoNomiFactorNomiUpdate, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomiFormatoNomiFactorNomi.add(jComboBoxid_formato_nomiFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factor_nomiFormatoNomiFactorNomi.add(jLabelid_factor_nomiFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factor_nomiFormatoNomiFactorNomi.add(jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factor_nomiFormatoNomiFactorNomi.add(jButtonid_factor_nomiFormatoNomiFactorNomiUpdate, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factor_nomiFormatoNomiFactorNomi.add(jComboBoxid_factor_nomiFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelponderacionFormatoNomiFactorNomi.add(jLabelponderacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelponderacionFormatoNomiFactorNomi.add(jButtonponderacionFormatoNomiFactorNomiBusqueda, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelponderacionFormatoNomiFactorNomi.add(jTextFieldponderacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoFormatoNomiFactorNomi.add(jLabelesta_activoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoFormatoNomiFactorNomi.add(jButtonesta_activoFormatoNomiFactorNomiBusqueda, this.gridBagConstraintsFormatoNomiFactorNomi);
	}

	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoFormatoNomiFactorNomi.add(jCheckBoxesta_activoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiFactorNomi.add(this.jPanelidFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposFormatoNomiFactorNomi=0;
		iYPanelCamposFormatoNomiFactorNomi++;
	}
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiFactorNomi.add(this.jPanelid_formato_nomiFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposFormatoNomiFactorNomi=0;
		iYPanelCamposFormatoNomiFactorNomi++;
	}
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiFactorNomi.add(this.jPanelid_factor_nomiFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposFormatoNomiFactorNomi=0;
		iYPanelCamposFormatoNomiFactorNomi++;
	}
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiFactorNomi.add(this.jPanelponderacionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposFormatoNomiFactorNomi=0;
		iYPanelCamposFormatoNomiFactorNomi++;
	}
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomiFactorNomi.add(this.jPanelesta_activoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposFormatoNomiFactorNomi=0;
		iYPanelCamposFormatoNomiFactorNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposOcultosFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposOcultosFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoNomiFactorNomi.add(this.jPanelid_empresaFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposOcultosFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposOcultosFormatoNomiFactorNomi=0;
		iYPanelCamposOcultosFormatoNomiFactorNomi++;
	}
	this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iYPanelCamposOcultosFormatoNomiFactorNomi;
	this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iXPanelCamposOcultosFormatoNomiFactorNomi++;
	this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomiFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoNomiFactorNomi.add(this.jPanelid_sucursalFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);



	if(iXPanelCamposOcultosFormatoNomiFactorNomi % 1==0) {
		iXPanelCamposOcultosFormatoNomiFactorNomi=0;
		iYPanelCamposOcultosFormatoNomiFactorNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormatoNomiFactorNomi= new GridBagLayout();
		this.jPanelAccionesFormatoNomiFactorNomi.setLayout(gridaBagLayoutAccionesFormatoNomiFactorNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormatoNomiFactorNomi= new GridBagLayout();
		this.jPanelAccionesFormularioFormatoNomiFactorNomi.setLayout(gridaBagLayoutAccionesFormularioFormatoNomiFactorNomi);
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoNomiFactorNomi.add(this.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoNomiFactorNomi.add(this.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoNomiFactorNomi.add(this.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoNomiFactorNomi.add(this.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormatoNomiFactorNomi.add(this.jButtonModificarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);							

		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormatoNomiFactorNomi.add(this.jButtonEliminarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoNomiFactorNomi.add(this.jButtonActualizarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);


		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoNomiFactorNomi.add(this.jButtonGuardarCambiosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);	
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormatoNomiFactorNomi.add(this.jButtonCancelarFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoNomiFactorNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoNomiFactorNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();						
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;		
			//this.gridBagConstraintsFormatoNomiFactorNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoNomiFactorNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =0;
		this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoNomiFactorNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormatoNomiFactorNomi = new FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formato Nomi Factor Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formato Nomi Factor Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Nomi Factor Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormatoNomiFactorNomiModel formatonomifactornomiModel=new FormatoNomiFactorNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//FormatoNomiFactorNomiModel.FormatoNomiFactorNomiFocusTraversalPolicy formatonomifactornomiFocusTraversalPolicy = formatonomifactornomiModel.new FormatoNomiFactorNomiFocusTraversalPolicy(this);
			
			//formatonomifactornomiFocusTraversalPolicy.setformatonomifactornomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formatonomifactornomiModel);
			
			
			this.jContentPaneDetalleFormatoNomiFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormatoNomiFactorNomi = new GridBagLayout();	
			this.jContentPaneDetalleFormatoNomiFactorNomi.setLayout(gridaBagLayoutDetalleFormatoNomiFactorNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoNomiFactorNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
					
				
				this.jContentPaneDetalleFormatoNomiFactorNomi.add(jTtoolBarDetalleFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);								
				
}
			
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi=   new JScrollPane(jContentPaneDetalleFormatoNomiFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	        
			this.jContentPaneDetalleFormatoNomiFactorNomi.add(jPanelCamposFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);
			
			
			
			
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
						&& formatonomifactornomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(this.puedeCargarPorParteCalificacionEmpleado,false,-1);
					
					if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormatoNomiFactorNomi= new GridBagConstraints();
						this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
						this.jContentPaneDetalleFormatoNomiFactorNomi.add(this.jTabbedPaneRelacionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormatoNomiFactorNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormatoNomiFactorNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
					this.gridBagConstraintsFormatoNomiFactorNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
					
				
					this.jContentPaneDetalleFormatoNomiFactorNomi.add(jPanelCamposOcultosFormatoNomiFactorNomi, gridBagConstraintsFormatoNomiFactorNomi);
				
					this.jPanelCamposOcultosFormatoNomiFactorNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	        this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormatoNomiFactorNomi.add(this.jPanelAccionesFormularioFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);							
			
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
	        this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleFormatoNomiFactorNomi.add(this.jPanelAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormatoNomiFactorNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi=   new JScrollPane(this.jPanelCamposFormatoNomiFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
			this.gridBagConstraintsFormatoNomiFactorNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormatoNomiFactorNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormatoNomiFactorNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);			
			
			this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
			
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		
			
		this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiFactorNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiFactorNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoNomiFactorNomi, this.gridBagConstraintsFormatoNomiFactorNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormatoNomiFactorNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionFormatoNomiFactorNomi;
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

				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.calificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.calificacionempleadoBeanSwingJInternalFrame.setcalificacionempleadoSessionBean(this.calificacionempleadoSessionBean);

				//this.gridBagConstraintsFormatoNomiFactorNomi = new GridBagConstraints();
				//this.gridBagConstraintsFormatoNomiFactorNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormatoNomiFactorNomi.gridx = 0;
				//this.jContentPaneDetalleFormatoNomiFactorNomi.add(this.calificacionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormatoNomiFactorNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormatoNomiFactorNomi.add("Calificacion Empleados",this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormatoNomiFactorNomi.setComponentAt(iIndexTab,this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCalificacionEmpleado) {
					this.jTabbedPaneRelacionesFormatoNomiFactorNomi.add("Calificacion Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCalificacionEmpleadoBeanSwingJInternalFrame(List<FormatoNomiFactorNomi> formatonomifactornomis,FormatoNomiFactorNomi formatonomifactornomi,CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					calificacionempleadoBeanSwingJInternalFrame.getCalificacionEmpleadoLogic().setConnexion(this.formatonomifactornomiLogic.getConnexion());

					calificacionempleadoBeanSwingJInternalFrame.setformatonomifactornomisForeignKey(formatonomifactornomis);
					calificacionempleadoBeanSwingJInternalFrame.setformatonomifactornomiForeignKey(formatonomifactornomi);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi(true);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setlidFormatoNomiFactorNomiActual(formatonomifactornomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					calificacionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyCalificacionEmpleado(calificacionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					calificacionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormatoNomiFactorNomi(true);
					calificacionempleadoBeanSwingJInternalFrame.setid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi(formatonomifactornomi.getId());

					if(!this.conCargarFormDetalle) {
						calificacionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					calificacionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameFormatoNomiFactorNomiForeignKey(formatonomifactornomi,1,false,true,true);
					calificacionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					calificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormatoNomiFactorNomi");
					calificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormatoNomiFactorNomi");
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
