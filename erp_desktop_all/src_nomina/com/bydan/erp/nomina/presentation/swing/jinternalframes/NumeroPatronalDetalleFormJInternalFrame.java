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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.NumeroPatronalConstantesFunciones;

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
public class NumeroPatronalDetalleFormJInternalFrame extends NumeroPatronalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNumeroPatronal;
	
	protected JMenuBar jmenuBarDetalleNumeroPatronal;
	
	protected JMenu jmenuDetalleNumeroPatronal;
	protected JMenu jmenuDetalleArchivoNumeroPatronal;
	protected JMenu jmenuDetalleAccionesNumeroPatronal;
	protected JMenu jmenuDetalleDatosNumeroPatronal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNumeroPatronal;	
	protected GridBagConstraints gridBagConstraintsNumeroPatronal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NumeroPatronalBeanSwingJInternalFrameAdditional jInternalFrameDetalleNumeroPatronal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";

	protected ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parroquia="";
	
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	
	

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;

	public EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=null;
	public EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEstructura=false;
	public EstructuraSessionBean estructuraSessionBean;

	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;
	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargo=false;
	public CargoSessionBean cargoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CantonSessionBean cantonSessionBean;
	public ParroquiaSessionBean parroquiaSessionBean;	
	
	public NumeroPatronalLogic numeropatronalLogic;
	
	public JScrollPane jScrollPanelDatosNumeroPatronal;
	public JScrollPane jScrollPanelDatosEdicionNumeroPatronal;
	public JScrollPane jScrollPanelDatosGeneralNumeroPatronal;
	
	protected JPanel jPanelCamposNumeroPatronal;    
	protected JPanel jPanelCamposOcultosNumeroPatronal;    	
	protected JPanel jPanelAccionesNumeroPatronal;
	protected JPanel jPanelAccionesFormularioNumeroPatronal;
    
	
	
	protected Integer iXPanelCamposNumeroPatronal=0;
	protected Integer iYPanelCamposNumeroPatronal=0;
	
	protected Integer iXPanelCamposOcultosNumeroPatronal=0;
	protected Integer iYPanelCamposOcultosNumeroPatronal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNumeroPatronal;
	public JButton jButtonModificarNumeroPatronal;
	public JButton jButtonActualizarNumeroPatronal;
    public JButton jButtonEliminarNumeroPatronal;
	public JButton jButtonCancelarNumeroPatronal;
    public JButton jButtonGuardarCambiosNumeroPatronal;
	public JButton jButtonGuardarCambiosTablaNumeroPatronal;
	protected JButton jButtonCerrarNumeroPatronal;
	
	
	protected JButton jButtonProcesarInformacionNumeroPatronal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNumeroPatronal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNumeroPatronal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNumeroPatronal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNumeroPatronal;
	protected JButton jButtonModificarToolBarNumeroPatronal;
	protected JButton jButtonActualizarToolBarNumeroPatronal;
    protected JButton jButtonEliminarToolBarNumeroPatronal;
	protected JButton jButtonCancelarToolBarNumeroPatronal;
    protected JButton jButtonGuardarCambiosToolBarNumeroPatronal;
	protected JButton jButtonGuardarCambiosTablaToolBarNumeroPatronal;
	protected JButton jButtonMostrarOcultarTablaToolBarNumeroPatronal;
	protected JButton jButtonCerrarToolBarNumeroPatronal;
	
	protected JButton jButtonProcesarInformacionToolBarNumeroPatronal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNumeroPatronal;
	protected JMenuItem jMenuItemModificarNumeroPatronal;
	protected JMenuItem jMenuItemActualizarNumeroPatronal;
    protected JMenuItem jMenuItemEliminarNumeroPatronal;
	protected JMenuItem jMenuItemCancelarNumeroPatronal;
    protected JMenuItem jMenuItemGuardarCambiosNumeroPatronal;
	protected JMenuItem jMenuItemGuardarCambiosTablaNumeroPatronal;
	protected JMenuItem jMenuItemCerrarNumeroPatronal;
	protected JMenuItem jMenuItemDetalleCerrarNumeroPatronal;
	protected JMenuItem jMenuItemDetalleMostarOcultarNumeroPatronal;
	
	protected JMenuItem jMenuItemProcesarInformacionNumeroPatronal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNumeroPatronal;
	protected JMenuItem jMenuItemMostrarOcultarNumeroPatronal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNumeroPatronal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNumeroPatronal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNumeroPatronal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNumeroPatronal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNumeroPatronal;
	public JLabel jLabelIdNumeroPatronal;
	public JLabel jLabelidNumeroPatronal;
	public JButton jButtonidNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelnumeroNumeroPatronal;
	public JLabel jLabelnumeroNumeroPatronal;
	public JTextField jTextFieldnumeroNumeroPatronal;
	public JButton jButtonnumeroNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_actividadNumeroPatronal;
	public JLabel jLabelcodigo_actividadNumeroPatronal;
	public JTextField jTextFieldcodigo_actividadNumeroPatronal;
	public JButton jButtoncodigo_actividadNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelapellidoNumeroPatronal;
	public JLabel jLabelapellidoNumeroPatronal;
	public JTextArea jTextAreaapellidoNumeroPatronal;
	public JScrollPane jscrollPaneapellidoNumeroPatronal;
	public JButton jButtonapellidoNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelnombreNumeroPatronal;
	public JLabel jLabelnombreNumeroPatronal;
	public JTextArea jTextAreanombreNumeroPatronal;
	public JScrollPane jscrollPanenombreNumeroPatronal;
	public JButton jButtonnombreNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelcedulaNumeroPatronal;
	public JLabel jLabelcedulaNumeroPatronal;
	public JTextField jTextFieldcedulaNumeroPatronal;
	public JButton jButtoncedulaNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoNumeroPatronal;
	public JLabel jLabeltelefonoNumeroPatronal;
	public JTextField jTextFieldtelefonoNumeroPatronal;
	public JButton jButtontelefonoNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNumeroPatronal;
	public JLabel jLabeldescripcionNumeroPatronal;
	public JTextArea jTextAreadescripcionNumeroPatronal;
	public JScrollPane jscrollPanedescripcionNumeroPatronal;
	public JButton jButtondescripcionNumeroPatronalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNumeroPatronal;
	public JLabel jLabelid_empresaNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNumeroPatronal;
	public JButton jButtonid_empresaNumeroPatronal= new JButtonMe();
	public JButton jButtonid_empresaNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_empresaNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaNumeroPatronal;
	public JLabel jLabelid_provinciaNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaNumeroPatronal;
	public JButton jButtonid_provinciaNumeroPatronal= new JButtonMe();
	public JButton jButtonid_provinciaNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_provinciaNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelid_cantonNumeroPatronal;
	public JLabel jLabelid_cantonNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonNumeroPatronal;
	public JButton jButtonid_cantonNumeroPatronal= new JButtonMe();
	public JButton jButtonid_cantonNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_cantonNumeroPatronalBusqueda= new JButtonMe();

	public JPanel jPanelid_parroquiaNumeroPatronal;
	public JLabel jLabelid_parroquiaNumeroPatronal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parroquiaNumeroPatronal;
	public JButton jButtonid_parroquiaNumeroPatronal= new JButtonMe();
	public JButton jButtonid_parroquiaNumeroPatronalUpdate= new JButtonMe();
	public JButton jButtonid_parroquiaNumeroPatronalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNumeroPatronal;
	
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
	public int iHeightFormulario=1210;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NumeroPatronalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNumeroPatronal=new JPanel();
				this.jPanelAccionesFormularioNumeroPatronal=new JPanel();
				this.jmenuBarDetalleNumeroPatronal=new JMenuBar();
				this.jTtoolBarDetalleNumeroPatronal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NumeroPatronalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroPatronalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NumeroPatronal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNumeroPatronal() {
		return this.jButtonActualizarToolBarNumeroPatronal;
	}
	
	public JButton getjButtonEliminarToolBarNumeroPatronal() {
		return this.jButtonEliminarToolBarNumeroPatronal;
	}
	
	public JButton getjButtonCancelarToolBarNumeroPatronal() {
		return this.jButtonCancelarToolBarNumeroPatronal;
	}		
	
	public JButton getjButtonProcesarInformacionNumeroPatronal() {
		return this.jButtonProcesarInformacionNumeroPatronal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNumeroPatronal)	{
		this.jButtonProcesarInformacionNumeroPatronal = jButtonProcesarInformacionNumeroPatronal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNumeroPatronal() {
		return this.jComboBoxTiposAccionesNumeroPatronal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNumeroPatronal(
			JComboBox jComboBoxTiposRelacionesNumeroPatronal) {
		this.jComboBoxTiposRelacionesNumeroPatronal = jComboBoxTiposRelacionesNumeroPatronal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNumeroPatronal(
			JComboBox jComboBoxTiposAccionesNumeroPatronal) {
		this.jComboBoxTiposAccionesNumeroPatronal = jComboBoxTiposAccionesNumeroPatronal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNumeroPatronal() {
		return this.jComboBoxTiposAccionesFormularioNumeroPatronal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNumeroPatronal(
			JComboBox jComboBoxTiposAccionesFormularioNumeroPatronal) {
		this.jComboBoxTiposAccionesFormularioNumeroPatronal = jComboBoxTiposAccionesFormularioNumeroPatronal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
		
		this.numeropatronalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.numeropatronalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.numeropatronalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		//this.estructuraSessionBean=new EstructuraSessionBean();
		//this.cargoSessionBean=new CargoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NumeroPatronalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Numero Patronal MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
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
	
		NumeroPatronalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNumeroPatronal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNumeroPatronal=new JButtonMe();
				this.jButtonModificarToolBarNumeroPatronal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNumeroPatronal,this.jTtoolBarDetalleNumeroPatronal,
							"actualizar","actualizar","Actualizar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNumeroPatronal,this.jTtoolBarDetalleNumeroPatronal,
							"eliminar","eliminar","Eliminar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNumeroPatronal,this.jTtoolBarDetalleNumeroPatronal,
							"cancelar","cancelar","Cancelar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNumeroPatronal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNumeroPatronal,this.jTtoolBarDetalleNumeroPatronal,
							"guardarcambios","guardarcambios","Guardar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNumeroPatronal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNumeroPatronal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNumeroPatronal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNumeroPatronal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNumeroPatronal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNumeroPatronal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNumeroPatronal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNumeroPatronal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNumeroPatronal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNumeroPatronal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNumeroPatronal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNumeroPatronal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNumeroPatronal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNumeroPatronal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNumeroPatronal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNumeroPatronal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNumeroPatronal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNumeroPatronal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNumeroPatronal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNumeroPatronal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNumeroPatronal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNumeroPatronal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNumeroPatronal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNumeroPatronal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNumeroPatronal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNumeroPatronal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNumeroPatronal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNumeroPatronal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNumeroPatronal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNumeroPatronal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNumeroPatronal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNumeroPatronal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNumeroPatronal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNumeroPatronal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNumeroPatronal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNumeroPatronal.add(this.jMenuItemDetalleCerrarNumeroPatronal);
		
		this.jmenuDetalleAccionesNumeroPatronal.add(this.jMenuItemActualizarNumeroPatronal);
		this.jmenuDetalleAccionesNumeroPatronal.add(this.jMenuItemEliminarNumeroPatronal);
		this.jmenuDetalleAccionesNumeroPatronal.add(this.jMenuItemCancelarNumeroPatronal);		
		
		//this.jmenuDetalleDatosNumeroPatronal.add(this.jMenuItemDetalleAbrirOrderByNumeroPatronal);				
		this.jmenuDetalleDatosNumeroPatronal.add(this.jMenuItemDetalleMostarOcultarNumeroPatronal);				
				
		//this.jmenuDetalleAccionesNumeroPatronal.add(this.jMenuItemGuardarCambiosNumeroPatronal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNumeroPatronal.add(this.jmenuDetalleArchivoNumeroPatronal);		
		this.jmenuBarDetalleNumeroPatronal.add(this.jmenuDetalleAccionesNumeroPatronal);		
		this.jmenuBarDetalleNumeroPatronal.add(this.jmenuDetalleDatosNumeroPatronal);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNumeroPatronal.add(this.jmenuDetalleNumeroPatronal);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNumeroPatronal);				
	}
	
	
	public void inicializarElementosCamposNumeroPatronal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNumeroPatronal = new JLabelMe();
		jLabelIdNumeroPatronal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNumeroPatronal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNumeroPatronal= new GridBagLayout();

		this.jPanelidNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);

		jLabelidNumeroPatronal = new JLabel();
		jLabelidNumeroPatronal.setText("Id");

		jLabelidNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroNumeroPatronal = new JLabelMe();
		this.jLabelnumeroNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroNumeroPatronal.setToolTipText("Numero");
		this.jLabelnumeroNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelnumeroNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextFieldnumeroNumeroPatronal= new JTextFieldMe();

		jTextFieldnumeroNumeroPatronal.setEnabled(false);
		jTextFieldnumeroNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonnumeroNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroNumeroPatronalBusqueda.setText("U");
		this.jButtonnumeroNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroNumeroPatronalBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_actividadNumeroPatronal = new JLabelMe();
		this.jLabelcodigo_actividadNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD+" : *");
		this.jLabelcodigo_actividadNumeroPatronal.setToolTipText("Codigo Actividad Economica");
		this.jLabelcodigo_actividadNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_actividadNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_actividadNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_actividadNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_actividadNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_actividadNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelcodigo_actividadNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextFieldcodigo_actividadNumeroPatronal= new JTextFieldMe();

		jTextFieldcodigo_actividadNumeroPatronal.setEnabled(false);
		jTextFieldcodigo_actividadNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_actividadNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_actividadNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_actividadNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_actividadNumeroPatronalBusqueda= new JButtonMe();
		this.jButtoncodigo_actividadNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_actividadNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_actividadNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_actividadNumeroPatronalBusqueda.setText("U");
		this.jButtoncodigo_actividadNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_actividadNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_actividadNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_actividadNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_actividadNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_actividadNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_actividadNumeroPatronalBusqueda.setVisible(false);		}


					
		this.jLabelapellidoNumeroPatronal = new JLabelMe();
		this.jLabelapellidoNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoNumeroPatronal.setToolTipText("Apellido");
		this.jLabelapellidoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelapellidoNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextAreaapellidoNumeroPatronal= new JTextAreaMe();
		jTextAreaapellidoNumeroPatronal.setEnabled(false);
		jTextAreaapellidoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoNumeroPatronal.setLineWrap(true);
		jTextAreaapellidoNumeroPatronal.setWrapStyleWord(true);
		jTextAreaapellidoNumeroPatronal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoNumeroPatronal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoNumeroPatronal = new JScrollPane(jTextAreaapellidoNumeroPatronal);
		jscrollPaneapellidoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonapellidoNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoNumeroPatronalBusqueda.setText("U");
		this.jButtonapellidoNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoNumeroPatronalBusqueda.setVisible(false);		}


					
		this.jLabelnombreNumeroPatronal = new JLabelMe();
		this.jLabelnombreNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreNumeroPatronal.setToolTipText("Nombre");
		this.jLabelnombreNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelnombreNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextAreanombreNumeroPatronal= new JTextAreaMe();
		jTextAreanombreNumeroPatronal.setEnabled(false);
		jTextAreanombreNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNumeroPatronal.setLineWrap(true);
		jTextAreanombreNumeroPatronal.setWrapStyleWord(true);
		jTextAreanombreNumeroPatronal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreNumeroPatronal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreNumeroPatronal = new JScrollPane(jTextAreanombreNumeroPatronal);
		jscrollPanenombreNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonnombreNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreNumeroPatronalBusqueda.setText("U");
		this.jButtonnombreNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreNumeroPatronalBusqueda.setVisible(false);		}


					
		this.jLabelcedulaNumeroPatronal = new JLabelMe();
		this.jLabelcedulaNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_CEDULA+" : *");
		this.jLabelcedulaNumeroPatronal.setToolTipText("Cedula");
		this.jLabelcedulaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcedulaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcedulaNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcedulaNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_CEDULA);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelcedulaNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextFieldcedulaNumeroPatronal= new JTextFieldMe();

		jTextFieldcedulaNumeroPatronal.setEnabled(false);
		jTextFieldcedulaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcedulaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncedulaNumeroPatronalBusqueda= new JButtonMe();
		this.jButtoncedulaNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncedulaNumeroPatronalBusqueda.setText("U");
		this.jButtoncedulaNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncedulaNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncedulaNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcedulaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcedulaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cedulaNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncedulaNumeroPatronalBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoNumeroPatronal = new JLabelMe();
		this.jLabeltelefonoNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoNumeroPatronal.setToolTipText("Telefono");
		this.jLabeltelefonoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPaneltelefonoNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextFieldtelefonoNumeroPatronal= new JTextFieldMe();

		jTextFieldtelefonoNumeroPatronal.setEnabled(false);
		jTextFieldtelefonoNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoNumeroPatronalBusqueda= new JButtonMe();
		this.jButtontelefonoNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoNumeroPatronalBusqueda.setText("U");
		this.jButtontelefonoNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoNumeroPatronalBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionNumeroPatronal = new JLabelMe();
		this.jLabeldescripcionNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionNumeroPatronal.setToolTipText("Descripcion");
		this.jLabeldescripcionNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPaneldescripcionNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jTextAreadescripcionNumeroPatronal= new JTextAreaMe();
		jTextAreadescripcionNumeroPatronal.setEnabled(false);
		jTextAreadescripcionNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNumeroPatronal.setLineWrap(true);
		jTextAreadescripcionNumeroPatronal.setWrapStyleWord(true);
		jTextAreadescripcionNumeroPatronal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNumeroPatronal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNumeroPatronal = new JScrollPane(jTextAreadescripcionNumeroPatronal);
		jscrollPanedescripcionNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionNumeroPatronalBusqueda= new JButtonMe();
		this.jButtondescripcionNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNumeroPatronalBusqueda.setText("U");
		this.jButtondescripcionNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNumeroPatronalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNumeroPatronal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNumeroPatronal = new JLabelMe();
		this.jLabelid_empresaNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNumeroPatronal.setToolTipText("Empresa");
		this.jLabelid_empresaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelid_empresaNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jComboBoxid_empresaNumeroPatronal= new JComboBoxMe();
		jComboBoxid_empresaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNumeroPatronal.setEnabled(false);

		this.jButtonid_empresaNumeroPatronal= new JButtonMe();
		this.jButtonid_empresaNumeroPatronal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNumeroPatronal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNumeroPatronal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNumeroPatronal.setText("Buscar");
		this.jButtonid_empresaNumeroPatronal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNumeroPatronal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNumeroPatronal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNumeroPatronal"));

		this.jButtonid_empresaNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonid_empresaNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNumeroPatronalBusqueda.setText("U");
		this.jButtonid_empresaNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNumeroPatronalBusqueda.setVisible(false);		}

		this.jButtonid_empresaNumeroPatronalUpdate= new JButtonMe();
		this.jButtonid_empresaNumeroPatronalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroPatronalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroPatronalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNumeroPatronalUpdate.setText("U");
		this.jButtonid_empresaNumeroPatronalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNumeroPatronalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNumeroPatronalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNumeroPatronalUpdate"));



					
		this.jLabelid_provinciaNumeroPatronal = new JLabelMe();
		this.jLabelid_provinciaNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaNumeroPatronal.setToolTipText("Provincia");
		this.jLabelid_provinciaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelid_provinciaNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jComboBoxid_provinciaNumeroPatronal= new JComboBoxMe();
		jComboBoxid_provinciaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaNumeroPatronal= new JButtonMe();
		this.jButtonid_provinciaNumeroPatronal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaNumeroPatronal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaNumeroPatronal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaNumeroPatronal.setText("Buscar");
		this.jButtonid_provinciaNumeroPatronal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaNumeroPatronal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaNumeroPatronal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaNumeroPatronal"));

		this.jButtonid_provinciaNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonid_provinciaNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaNumeroPatronalBusqueda.setText("U");
		this.jButtonid_provinciaNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaNumeroPatronalBusqueda.setVisible(false);		}

		this.jButtonid_provinciaNumeroPatronalUpdate= new JButtonMe();
		this.jButtonid_provinciaNumeroPatronalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaNumeroPatronalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaNumeroPatronalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaNumeroPatronalUpdate.setText("U");
		this.jButtonid_provinciaNumeroPatronalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaNumeroPatronalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaNumeroPatronalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaNumeroPatronalUpdate"));



					
		this.jLabelid_cantonNumeroPatronal = new JLabelMe();
		this.jLabelid_cantonNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_IDCANTON+" : *");
		this.jLabelid_cantonNumeroPatronal.setToolTipText("Canton");
		this.jLabelid_cantonNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cantonNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cantonNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cantonNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_IDCANTON);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelid_cantonNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jComboBoxid_cantonNumeroPatronal= new JComboBoxMe();
		jComboBoxid_cantonNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cantonNumeroPatronal= new JButtonMe();
		this.jButtonid_cantonNumeroPatronal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonNumeroPatronal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonNumeroPatronal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonNumeroPatronal.setText("Buscar");
		this.jButtonid_cantonNumeroPatronal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cantonNumeroPatronal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonNumeroPatronal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cantonNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonNumeroPatronal"));

		this.jButtonid_cantonNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonid_cantonNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonNumeroPatronalBusqueda.setText("U");
		this.jButtonid_cantonNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cantonNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cantonNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cantonNumeroPatronalBusqueda.setVisible(false);		}

		this.jButtonid_cantonNumeroPatronalUpdate= new JButtonMe();
		this.jButtonid_cantonNumeroPatronalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonNumeroPatronalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonNumeroPatronalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonNumeroPatronalUpdate.setText("U");
		this.jButtonid_cantonNumeroPatronalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cantonNumeroPatronalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonNumeroPatronalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cantonNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonNumeroPatronalUpdate"));



					
		this.jLabelid_parroquiaNumeroPatronal = new JLabelMe();
		this.jLabelid_parroquiaNumeroPatronal.setText(""+NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA+" : *");
		this.jLabelid_parroquiaNumeroPatronal.setToolTipText("Parroquia");
		this.jLabelid_parroquiaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parroquiaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parroquiaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parroquiaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parroquiaNumeroPatronal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parroquiaNumeroPatronal.setToolTipText(NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA);
		this.gridaBagLayoutNumeroPatronal = new GridBagLayout();
		this.jPanelid_parroquiaNumeroPatronal.setLayout(this.gridaBagLayoutNumeroPatronal);


		jComboBoxid_parroquiaNumeroPatronal= new JComboBoxMe();
		jComboBoxid_parroquiaNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parroquiaNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parroquiaNumeroPatronal= new JButtonMe();
		this.jButtonid_parroquiaNumeroPatronal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaNumeroPatronal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaNumeroPatronal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaNumeroPatronal.setText("Buscar");
		this.jButtonid_parroquiaNumeroPatronal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parroquiaNumeroPatronal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaNumeroPatronal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parroquiaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaNumeroPatronal"));

		this.jButtonid_parroquiaNumeroPatronalBusqueda= new JButtonMe();
		this.jButtonid_parroquiaNumeroPatronalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaNumeroPatronalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaNumeroPatronalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parroquiaNumeroPatronalBusqueda.setText("U");
		this.jButtonid_parroquiaNumeroPatronalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parroquiaNumeroPatronalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaNumeroPatronalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parroquiaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaNumeroPatronalBusqueda"));

		if(this.numeropatronalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parroquiaNumeroPatronalBusqueda.setVisible(false);		}

		this.jButtonid_parroquiaNumeroPatronalUpdate= new JButtonMe();
		this.jButtonid_parroquiaNumeroPatronalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaNumeroPatronalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaNumeroPatronalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parroquiaNumeroPatronalUpdate.setText("U");
		this.jButtonid_parroquiaNumeroPatronalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parroquiaNumeroPatronalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaNumeroPatronalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parroquiaNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaNumeroPatronalUpdate"));



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
		//this.jInternalFrameDetalleNumeroPatronal = new NumeroPatronalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Numero Patronal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNumeroPatronal= new GridBagLayout();
		

		
		String sToolTipNumeroPatronal="";
		sToolTipNumeroPatronal=NumeroPatronalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNumeroPatronal+="(Nomina.NumeroPatronal)";
		}
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			sToolTipNumeroPatronal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNumeroPatronal = new JButtonMe();
		this.jButtonModificarNumeroPatronal = new JButtonMe();
        this.jButtonActualizarNumeroPatronal = new JButtonMe();
        this.jButtonEliminarNumeroPatronal = new JButtonMe();
        this.jButtonCancelarNumeroPatronal = new JButtonMe();
        this.jButtonGuardarCambiosNumeroPatronal = new JButtonMe();
		this.jButtonGuardarCambiosTablaNumeroPatronal = new JButtonMe();
		this.jButtonCerrarNumeroPatronal = new JButtonMe();
		
		this.jScrollPanelDatosNumeroPatronal = new JScrollPane();   
        this.jScrollPanelDatosEdicionNumeroPatronal = new JScrollPane();
		this.jScrollPanelDatosGeneralNumeroPatronal = new JScrollPane();
				
		
		
		this.jPanelCamposNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Numero Patronal";
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Patronales" + this.sPath));
		} else {
			this.jScrollPanelDatosNumeroPatronal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNumeroPatronal.setName("jPanelCamposNumeroPatronal"); 

		this.jPanelCamposOcultosNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNumeroPatronal.setName("jPanelCamposOcultosNumeroPatronal"); 

        this.jPanelAccionesNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNumeroPatronal.setToolTipText("Acciones");
        this.jPanelAccionesNumeroPatronal.setName("Acciones"); 

		this.jPanelAccionesFormularioNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNumeroPatronal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNumeroPatronal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNumeroPatronal.setText("Nuevo");
		this.jButtonModificarNumeroPatronal.setText("Editar");
        this.jButtonActualizarNumeroPatronal.setText("Actualizar");
        this.jButtonEliminarNumeroPatronal.setText("Eliminar");
        this.jButtonCancelarNumeroPatronal.setText("Cancelar");
        this.jButtonGuardarCambiosNumeroPatronal.setText("Guardar");
		this.jButtonGuardarCambiosTablaNumeroPatronal.setText("Guardar");
		this.jButtonCerrarNumeroPatronal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNumeroPatronal,"nuevo_button","Nuevo",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNumeroPatronal,"modificar_button","Editar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNumeroPatronal,"actualizar_button","Actualizar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNumeroPatronal,"eliminar_button","Eliminar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNumeroPatronal,"cancelar_button","Cancelar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNumeroPatronal,"guardarcambios_button","Guardar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNumeroPatronal,"guardarcambiostabla_button","Guardar",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNumeroPatronal,"cerrar_button","Salir",this.numeropatronalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNumeroPatronal.setToolTipText("Nuevo"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNumeroPatronal.setToolTipText("Editar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNumeroPatronal.setToolTipText("Actualizar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNumeroPatronal.setToolTipText("Eliminar)"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNumeroPatronal.setToolTipText("Cancelar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNumeroPatronal.setToolTipText("Guardar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNumeroPatronal.setToolTipText("Guardar"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNumeroPatronal.setToolTipText("Salir"+" "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNumeroPatronal";
		inputMap = this.jButtonNuevoNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNumeroPatronal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNumeroPatronal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNumeroPatronal";
		inputMap = this.jButtonActualizarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNumeroPatronal"));
		
		//ELIMINAR
		sMapKey = "EliminarNumeroPatronal";
		inputMap = this.jButtonEliminarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNumeroPatronal"));
		
		//CANCELAR	
		sMapKey = "CancelarNumeroPatronal";
		inputMap = this.jButtonCancelarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNumeroPatronal"));
		
		//CERRAR		
		sMapKey = "CerrarNumeroPatronal";
		inputMap = this.jButtonCerrarNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNumeroPatronal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNumeroPatronal";
		inputMap = this.jButtonGuardarCambiosTablaNumeroPatronal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNumeroPatronal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNumeroPatronal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNumeroPatronal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNumeroPatronal.setToolTipText("Nuevo NumeroPatronal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNumeroPatronal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNumeroPatronal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNumeroPatronal.setToolTipText("Sin Cerrar Ventana NumeroPatronal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNumeroPatronal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNumeroPatronal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNumeroPatronal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNumeroPatronal.setText("Accion");
		this.jComboBoxTiposAccionesNumeroPatronal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNumeroPatronal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNumeroPatronal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNumeroPatronal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNumeroPatronal = new JLabelMe();
		
		this.jLabelAccionesNumeroPatronal.setText("Acciones");		
		this.jLabelAccionesNumeroPatronal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroPatronal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroPatronal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNumeroPatronal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNumeroPatronal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNumeroPatronal=new JTabbedPane();
		this.jTabbedPaneRelacionesNumeroPatronal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNumeroPatronal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNumeroPatronal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroPatronal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroPatronal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNumeroPatronal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNumeroPatronal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNumeroPatronal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNumeroPatronal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNumeroPatronal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNumeroPatronal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNumeroPatronal = new GridBagLayout();
		
		this.jPanelCamposNumeroPatronal.setLayout(gridaBagLayoutCamposNumeroPatronal);
		this.jPanelCamposOcultosNumeroPatronal.setLayout(gridaBagLayoutCamposOcultosNumeroPatronal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNumeroPatronal.add(jLabelIdNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNumeroPatronal.add(jLabelidNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNumeroPatronal.add(jLabelid_empresaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNumeroPatronal.add(jButtonid_empresaNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 3;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNumeroPatronal.add(jButtonid_empresaNumeroPatronalUpdate, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNumeroPatronal.add(jComboBoxid_empresaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaNumeroPatronal.add(jLabelid_provinciaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaNumeroPatronal.add(jButtonid_provinciaNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 3;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaNumeroPatronal.add(jButtonid_provinciaNumeroPatronalUpdate, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaNumeroPatronal.add(jComboBoxid_provinciaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cantonNumeroPatronal.add(jLabelid_cantonNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonNumeroPatronal.add(jButtonid_cantonNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 3;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonNumeroPatronal.add(jButtonid_cantonNumeroPatronalUpdate, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cantonNumeroPatronal.add(jComboBoxid_cantonNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parroquiaNumeroPatronal.add(jLabelid_parroquiaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parroquiaNumeroPatronal.add(jButtonid_parroquiaNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 3;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parroquiaNumeroPatronal.add(jButtonid_parroquiaNumeroPatronalUpdate, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parroquiaNumeroPatronal.add(jComboBoxid_parroquiaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroNumeroPatronal.add(jLabelnumeroNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroNumeroPatronal.add(jButtonnumeroNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroNumeroPatronal.add(jTextFieldnumeroNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_actividadNumeroPatronal.add(jLabelcodigo_actividadNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_actividadNumeroPatronal.add(jButtoncodigo_actividadNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_actividadNumeroPatronal.add(jTextFieldcodigo_actividadNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoNumeroPatronal.add(jLabelapellidoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoNumeroPatronal.add(jButtonapellidoNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoNumeroPatronal.add(jscrollPaneapellidoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreNumeroPatronal.add(jLabelnombreNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreNumeroPatronal.add(jButtonnombreNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreNumeroPatronal.add(jscrollPanenombreNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcedulaNumeroPatronal.add(jLabelcedulaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcedulaNumeroPatronal.add(jButtoncedulaNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcedulaNumeroPatronal.add(jTextFieldcedulaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoNumeroPatronal.add(jLabeltelefonoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoNumeroPatronal.add(jButtontelefonoNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoNumeroPatronal.add(jTextFieldtelefonoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 0;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionNumeroPatronal.add(jLabeldescripcionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		//this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = 2;
		this.gridBagConstraintsNumeroPatronal.ipadx = 0;
		this.gridBagConstraintsNumeroPatronal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNumeroPatronal.add(jButtondescripcionNumeroPatronalBusqueda, this.gridBagConstraintsNumeroPatronal);
	}

	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroPatronal.gridy = 0;
	this.gridBagConstraintsNumeroPatronal.gridx = 1;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionNumeroPatronal.add(jscrollPanedescripcionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelidNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelid_provinciaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelid_cantonNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelid_parroquiaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelnumeroNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelcodigo_actividadNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelapellidoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelnombreNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPanelcedulaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPaneltelefonoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroPatronal.add(this.jPaneldescripcionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposNumeroPatronal % 1==0) {
		iXPanelCamposNumeroPatronal=0;
		iYPanelCamposNumeroPatronal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroPatronal.gridy = iYPanelCamposOcultosNumeroPatronal;
	this.gridBagConstraintsNumeroPatronal.gridx = iXPanelCamposOcultosNumeroPatronal++;
	this.gridBagConstraintsNumeroPatronal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroPatronal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNumeroPatronal.add(this.jPanelid_empresaNumeroPatronal, this.gridBagConstraintsNumeroPatronal);



	if(iXPanelCamposOcultosNumeroPatronal % 1==0) {
		iXPanelCamposOcultosNumeroPatronal=0;
		iYPanelCamposOcultosNumeroPatronal++;
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
			
		GridBagLayout gridaBagLayoutAccionesNumeroPatronal= new GridBagLayout();
		this.jPanelAccionesNumeroPatronal.setLayout(gridaBagLayoutAccionesNumeroPatronal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNumeroPatronal= new GridBagLayout();
		this.jPanelAccionesFormularioNumeroPatronal.setLayout(gridaBagLayoutAccionesFormularioNumeroPatronal);
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNumeroPatronal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNumeroPatronal.add(this.jComboBoxTiposAccionesFormularioNumeroPatronal, this.gridBagConstraintsNumeroPatronal);

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNumeroPatronal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNumeroPatronal.add(this.jCheckBoxPostAccionNuevoNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNumeroPatronal.add(this.jCheckBoxPostAccionSinCerrarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNumeroPatronal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNumeroPatronal.add(this.jCheckBoxPostAccionSinMensajeNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccion++;
			
		this.jPanelAccionesNumeroPatronal.add(this.jButtonModificarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);							

		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroPatronal.gridy = 0;
		this.gridBagConstraintsNumeroPatronal.gridx =iPosXAccion++;
			
		this.jPanelAccionesNumeroPatronal.add(this.jButtonEliminarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
			
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = 0;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccion++;
		
		this.jPanelAccionesNumeroPatronal.add(this.jButtonActualizarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);


		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = 0;		
		this.gridBagConstraintsNumeroPatronal.gridx = iPosXAccion++;
		
		this.jPanelAccionesNumeroPatronal.add(this.jButtonGuardarCambiosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);	
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = 0;		
		this.gridBagConstraintsNumeroPatronal.gridx =iPosXAccion++;
		
		this.jPanelAccionesNumeroPatronal.add(this.jButtonCancelarNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNumeroPatronal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNumeroPatronal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();						
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNumeroPatronal.gridx = 0;		
			//this.gridBagConstraintsNumeroPatronal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNumeroPatronal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNumeroPatronal.gridx =0;
		this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNumeroPatronal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNumeroPatronal = new NumeroPatronalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Numero Patronal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Numero Patronal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Numero Patronal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NumeroPatronalModel numeropatronalModel=new NumeroPatronalModel(this);
			
			//SI USARA CLASE INTERNA
			//NumeroPatronalModel.NumeroPatronalFocusTraversalPolicy numeropatronalFocusTraversalPolicy = numeropatronalModel.new NumeroPatronalFocusTraversalPolicy(this);
			
			//numeropatronalFocusTraversalPolicy.setnumeropatronalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(numeropatronalModel);
			
			
			this.jContentPaneDetalleNumeroPatronal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNumeroPatronal = new GridBagLayout();	
			this.jContentPaneDetalleNumeroPatronal.setLayout(gridaBagLayoutDetalleNumeroPatronal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNumeroPatronal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNumeroPatronal.gridx = 0;
					
				
				this.jContentPaneDetalleNumeroPatronal.add(jTtoolBarDetalleNumeroPatronal, gridBagConstraintsNumeroPatronal);								
				
}
			
			this.jScrollPanelDatosEdicionNumeroPatronal=   new JScrollPane(jContentPaneDetalleNumeroPatronal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNumeroPatronal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroPatronal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroPatronal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNumeroPatronal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNumeroPatronal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroPatronal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroPatronal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNumeroPatronal.gridx = 0;
	        
			this.jContentPaneDetalleNumeroPatronal.add(jPanelCamposNumeroPatronal, gridBagConstraintsNumeroPatronal);
			
			
			
			
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
						&& numeropatronalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCargo(this.puedeCargarPorParteCargo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEstructura(this.puedeCargarPorParteEstructura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					
					if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNumeroPatronal= new GridBagConstraints();
						this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNumeroPatronal.gridx = 0;
						this.jContentPaneDetalleNumeroPatronal.add(this.jTabbedPaneRelacionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNumeroPatronal.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCargo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEstructura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNumeroPatronal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
					this.gridBagConstraintsNumeroPatronal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNumeroPatronal.gridx = 0;
					
				
					this.jContentPaneDetalleNumeroPatronal.add(jPanelCamposOcultosNumeroPatronal, gridBagConstraintsNumeroPatronal);
				
					this.jPanelCamposOcultosNumeroPatronal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsNumeroPatronal.gridx = 0;
	        this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNumeroPatronal.add(this.jPanelAccionesFormularioNumeroPatronal, this.gridBagConstraintsNumeroPatronal);							
			
			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
	        this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsNumeroPatronal.gridx = 0;
	        
			
			this.jContentPaneDetalleNumeroPatronal.add(this.jPanelAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNumeroPatronal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNumeroPatronal=   new JScrollPane(this.jPanelCamposNumeroPatronal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNumeroPatronal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroPatronal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroPatronal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNumeroPatronal.gridx = 0;
			this.gridBagConstraintsNumeroPatronal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNumeroPatronal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNumeroPatronal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNumeroPatronal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNumeroPatronal, this.gridBagConstraintsNumeroPatronal);			
			
			this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
			this.gridBagConstraintsNumeroPatronal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNumeroPatronal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
			
			
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		
			
		this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
		this.gridBagConstraintsNumeroPatronal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNumeroPatronal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNumeroPatronal, this.gridBagConstraintsNumeroPatronal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNumeroPatronal;//jContentPane;
		
		return jScrollPanelDatosEdicionNumeroPatronal;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCargo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargoSessionBean=new CargoSessionBean();
		this.cargoSessionBean.setConGuardarRelaciones(false);
		this.cargoSessionBean.setEsGuardarRelacionado(true);

		this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargoSessionBean.getEsGuardarRelacionado()) {

				CargoJInternalFrame.STIPO_TAMANIO_GENERAL=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargoSessionBean.setEsGuardarRelacionado(true);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargoBeanSwingJInternalFrame.setcargoSessionBean(this.cargoSessionBean);

				//this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				//this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNumeroPatronal.gridx = 0;
				//this.jContentPaneDetalleNumeroPatronal.add(this.cargoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNumeroPatronal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNumeroPatronal.add("Cargos",this.cargoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNumeroPatronal.setComponentAt(iIndexTab,this.cargoBeanSwingJInternalFrame.getContentPane());
				}

				//CargoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargoSessionBean.setEsGuardarRelacionado(false);
				this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargo) {
					this.jTabbedPaneRelacionesNumeroPatronal.add("Cargos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.estructuraSessionBean=new EstructuraSessionBean();
		this.estructuraSessionBean.setConGuardarRelaciones(false);
		this.estructuraSessionBean.setEsGuardarRelacionado(true);

		this.estructuraBeanSwingJInternalFrame=null;//new EstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.estructuraBeanSwingJInternalFramePopup=new EstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.estructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.estructuraSessionBean.getEsGuardarRelacionado()) {

				EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;
				EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.estructuraSessionBean.setEsGuardarRelacionado(true);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.estructuraBeanSwingJInternalFrame.setestructuraSessionBean(this.estructuraSessionBean);

				//this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				//this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNumeroPatronal.gridx = 0;
				//this.jContentPaneDetalleNumeroPatronal.add(this.estructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNumeroPatronal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNumeroPatronal.add("Estructuras",this.estructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNumeroPatronal.setComponentAt(iIndexTab,this.estructuraBeanSwingJInternalFrame.getContentPane());
				}

				//EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.estructuraSessionBean.setEsGuardarRelacionado(false);
				this.estructuraBeanSwingJInternalFrame=null;//new EstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.estructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEstructura) {
					this.jTabbedPaneRelacionesNumeroPatronal.add("Estructuras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NumeroPatronalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsNumeroPatronal = new GridBagConstraints();
				//this.gridBagConstraintsNumeroPatronal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNumeroPatronal.gridx = 0;
				//this.jContentPaneDetalleNumeroPatronal.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNumeroPatronal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNumeroPatronal.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNumeroPatronal.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesNumeroPatronal.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<NumeroPatronal> numeropatronals,NumeroPatronal numeropatronal,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.numeropatronalLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.setnumeropatronalsForeignKey(numeropatronals);
					datogeneralempleadoBeanSwingJInternalFrame.setnumeropatronalForeignKey(numeropatronal);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionNumeroPatronal(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidNumeroPatronalActual(numeropatronal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaNumeroPatronal(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_numero_patronalFK_IdNumeroPatronal(numeropatronal.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameNumeroPatronalForeignKey(numeropatronal,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdNumeroPatronal");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNumeroPatronal");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEstructuraBeanSwingJInternalFrame(List<NumeroPatronal> numeropatronals,NumeroPatronal numeropatronal,EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.numeropatronalLogic.getConnexion());

					estructuraBeanSwingJInternalFrame.setnumeropatronalsForeignKey(numeropatronals);
					estructuraBeanSwingJInternalFrame.setnumeropatronalForeignKey(numeropatronal);
					estructuraBeanSwingJInternalFrame.estructuraSessionBean.setisBusquedaDesdeForeignKeySesionNumeroPatronal(true);
					estructuraBeanSwingJInternalFrame.estructuraSessionBean.setlidNumeroPatronalActual(numeropatronal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					estructuraBeanSwingJInternalFrame.cargarCombosForeignKeyEstructura(estructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					estructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaNumeroPatronal(true);
					estructuraBeanSwingJInternalFrame.setid_numero_patronalFK_IdNumeroPatronal(numeropatronal.getId());

					if(!this.conCargarFormDetalle) {
						estructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					estructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameNumeroPatronalForeignKey(numeropatronal,1,false,true,true);
					estructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					estructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdNumeroPatronal");
					estructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNumeroPatronal");
					estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(true);
					estructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEstructura("n",estructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, estructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					estructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					estructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("relacionado");
					} else {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("no_relacionado");
					}

					estructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargoBeanSwingJInternalFrame(List<NumeroPatronal> numeropatronals,NumeroPatronal numeropatronal,CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.numeropatronalLogic.getConnexion());

					cargoBeanSwingJInternalFrame.setnumeropatronalsForeignKey(numeropatronals);
					cargoBeanSwingJInternalFrame.setnumeropatronalForeignKey(numeropatronal);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setisBusquedaDesdeForeignKeySesionNumeroPatronal(true);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setlidNumeroPatronalActual(numeropatronal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargoBeanSwingJInternalFrame.cargarCombosForeignKeyCargo(cargoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargoBeanSwingJInternalFrame.setVisibilidadBusquedasParaNumeroPatronal(true);
					cargoBeanSwingJInternalFrame.setid_numero_patronalFK_IdNumeroPatronal(numeropatronal.getId());

					if(!this.conCargarFormDetalle) {
						cargoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargoBeanSwingJInternalFrame.setSelectedItemCombosFrameNumeroPatronalForeignKey(numeropatronal,1,false,true,true);
					cargoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargoBeanSwingJInternalFrame.procesarBusqueda("FK_IdNumeroPatronal");
					cargoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNumeroPatronal");
					cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(true);
					cargoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargo("n",cargoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargoBeanSwingJInternalFrame.setAutoscrolls(true);
					cargoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("relacionado");
					} else {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");
					}

					cargoBeanSwingJInternalFrame.getjButtonRecargarInformacionCargo().setVisible(false);

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
