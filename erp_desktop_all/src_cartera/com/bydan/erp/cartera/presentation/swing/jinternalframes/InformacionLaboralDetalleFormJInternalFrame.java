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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.InformacionLaboralConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class InformacionLaboralDetalleFormJInternalFrame extends InformacionLaboralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleInformacionLaboral;
	
	protected JMenuBar jmenuBarDetalleInformacionLaboral;
	
	protected JMenu jmenuDetalleInformacionLaboral;
	protected JMenu jmenuDetalleArchivoInformacionLaboral;
	protected JMenu jmenuDetalleAccionesInformacionLaboral;
	protected JMenu jmenuDetalleDatosInformacionLaboral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformacionLaboral;	
	protected GridBagConstraints gridBagConstraintsInformacionLaboral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected InformacionLaboralBeanSwingJInternalFrameAdditional jInternalFrameDetalleInformacionLaboral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoEmpresaBeanSwingJInternalFrame tipoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoempresa="";

	protected TipoRelaLaboBeanSwingJInternalFrame tiporelalaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporelalabo="";

	protected TipoAreaLaboBeanSwingJInternalFrame tipoarealaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoarealabo="";

	protected TipoCargoLaboBeanSwingJInternalFrame tipocargolaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargolabo="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public InformacionLaboralSessionBean informacionlaboralSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoEmpresaSessionBean tipoempresaSessionBean;
	public TipoRelaLaboSessionBean tiporelalaboSessionBean;
	public TipoAreaLaboSessionBean tipoarealaboSessionBean;
	public TipoCargoLaboSessionBean tipocargolaboSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public InformacionLaboralLogic informacionlaboralLogic;
	
	public JScrollPane jScrollPanelDatosInformacionLaboral;
	public JScrollPane jScrollPanelDatosEdicionInformacionLaboral;
	public JScrollPane jScrollPanelDatosGeneralInformacionLaboral;
	
	protected JPanel jPanelCamposInformacionLaboral;    
	protected JPanel jPanelCamposOcultosInformacionLaboral;    	
	protected JPanel jPanelAccionesInformacionLaboral;
	protected JPanel jPanelAccionesFormularioInformacionLaboral;
    
	
	
	protected Integer iXPanelCamposInformacionLaboral=0;
	protected Integer iYPanelCamposInformacionLaboral=0;
	
	protected Integer iXPanelCamposOcultosInformacionLaboral=0;
	protected Integer iYPanelCamposOcultosInformacionLaboral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoInformacionLaboral;
	public JButton jButtonModificarInformacionLaboral;
	public JButton jButtonActualizarInformacionLaboral;
    public JButton jButtonEliminarInformacionLaboral;
	public JButton jButtonCancelarInformacionLaboral;
    public JButton jButtonGuardarCambiosInformacionLaboral;
	public JButton jButtonGuardarCambiosTablaInformacionLaboral;
	protected JButton jButtonCerrarInformacionLaboral;
	
	
	protected JButton jButtonProcesarInformacionInformacionLaboral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoInformacionLaboral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarInformacionLaboral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeInformacionLaboral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformacionLaboral;
	protected JButton jButtonModificarToolBarInformacionLaboral;
	protected JButton jButtonActualizarToolBarInformacionLaboral;
    protected JButton jButtonEliminarToolBarInformacionLaboral;
	protected JButton jButtonCancelarToolBarInformacionLaboral;
    protected JButton jButtonGuardarCambiosToolBarInformacionLaboral;
	protected JButton jButtonGuardarCambiosTablaToolBarInformacionLaboral;
	protected JButton jButtonMostrarOcultarTablaToolBarInformacionLaboral;
	protected JButton jButtonCerrarToolBarInformacionLaboral;
	
	protected JButton jButtonProcesarInformacionToolBarInformacionLaboral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformacionLaboral;
	protected JMenuItem jMenuItemModificarInformacionLaboral;
	protected JMenuItem jMenuItemActualizarInformacionLaboral;
    protected JMenuItem jMenuItemEliminarInformacionLaboral;
	protected JMenuItem jMenuItemCancelarInformacionLaboral;
    protected JMenuItem jMenuItemGuardarCambiosInformacionLaboral;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformacionLaboral;
	protected JMenuItem jMenuItemCerrarInformacionLaboral;
	protected JMenuItem jMenuItemDetalleCerrarInformacionLaboral;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformacionLaboral;
	
	protected JMenuItem jMenuItemProcesarInformacionInformacionLaboral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformacionLaboral;
	protected JMenuItem jMenuItemMostrarOcultarInformacionLaboral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformacionLaboral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformacionLaboral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformacionLaboral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioInformacionLaboral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidInformacionLaboral;
	public JLabel jLabelIdInformacionLaboral;
	public JLabel jLabelidInformacionLaboral;
	public JButton jButtonidInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPaneltiempoaInformacionLaboral;
	public JLabel jLabeltiempoaInformacionLaboral;
	public JTextField jTextFieldtiempoaInformacionLaboral;
	public JButton jButtontiempoaInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPaneltiempomInformacionLaboral;
	public JLabel jLabeltiempomInformacionLaboral;
	public JTextField jTextFieldtiempomInformacionLaboral;
	public JButton jButtontiempomInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelnombreempresaInformacionLaboral;
	public JLabel jLabelnombreempresaInformacionLaboral;
	public JTextArea jTextAreanombreempresaInformacionLaboral;
	public JScrollPane jscrollPanenombreempresaInformacionLaboral;
	public JButton jButtonnombreempresaInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPaneldireccionInformacionLaboral;
	public JLabel jLabeldireccionInformacionLaboral;
	public JTextArea jTextAreadireccionInformacionLaboral;
	public JScrollPane jscrollPanedireccionInformacionLaboral;
	public JButton jButtondireccionInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelnombrereferenciaInformacionLaboral;
	public JLabel jLabelnombrereferenciaInformacionLaboral;
	public JTextArea jTextAreanombrereferenciaInformacionLaboral;
	public JScrollPane jscrollPanenombrereferenciaInformacionLaboral;
	public JButton jButtonnombrereferenciaInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoInformacionLaboral;
	public JLabel jLabeltelefonoInformacionLaboral;
	public JTextArea jTextAreatelefonoInformacionLaboral;
	public JScrollPane jscrollPanetelefonoInformacionLaboral;
	public JButton jButtontelefonoInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPaneltelefonocodigoareaInformacionLaboral;
	public JLabel jLabeltelefonocodigoareaInformacionLaboral;
	public JTextField jTextFieldtelefonocodigoareaInformacionLaboral;
	public JButton jButtontelefonocodigoareaInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPaneltelefonomovilInformacionLaboral;
	public JLabel jLabeltelefonomovilInformacionLaboral;
	public JTextArea jTextAreatelefonomovilInformacionLaboral;
	public JScrollPane jscrollPanetelefonomovilInformacionLaboral;
	public JButton jButtontelefonomovilInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelemailInformacionLaboral;
	public JLabel jLabelemailInformacionLaboral;
	public JTextArea jTextAreaemailInformacionLaboral;
	public JScrollPane jscrollPaneemailInformacionLaboral;
	public JButton jButtonemailInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelesactivoInformacionLaboral;
	public JLabel jLabelesactivoInformacionLaboral;
	public JCheckBox jCheckBoxesactivoInformacionLaboral;
	public JButton jButtonesactivoInformacionLaboralBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteInformacionLaboral;
	public JLabel jLabelidclienteInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteInformacionLaboral;
	public JButton jButtonidclienteInformacionLaboral= new JButtonMe();
	public JButton jButtonidclienteInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidclienteInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelidvalorempresaInformacionLaboral;
	public JLabel jLabelidvalorempresaInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorempresaInformacionLaboral;
	public JButton jButtonidvalorempresaInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorempresaInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorempresaInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclienterelacionlaboralInformacionLaboral;
	public JLabel jLabelidvalorclienterelacionlaboralInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclienterelacionlaboralInformacionLaboral;
	public JButton jButtonidvalorclienterelacionlaboralInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientearealaboralInformacionLaboral;
	public JLabel jLabelidvalorclientearealaboralInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientearealaboralInformacionLaboral;
	public JButton jButtonidvalorclientearealaboralInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorclientearealaboralInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorclientearealaboralInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientecargolaboralInformacionLaboral;
	public JLabel jLabelidvalorclientecargolaboralInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientecargolaboralInformacionLaboral;
	public JButton jButtonidvalorclientecargolaboralInformacionLaboral= new JButtonMe();
	public JButton jButtonidvalorclientecargolaboralInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidvalorclientecargolaboralInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelid_paisInformacionLaboral;
	public JLabel jLabelid_paisInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisInformacionLaboral;
	public JButton jButtonid_paisInformacionLaboral= new JButtonMe();
	public JButton jButtonid_paisInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonid_paisInformacionLaboralBusqueda= new JButtonMe();

	public JPanel jPanelidciudadInformacionLaboral;
	public JLabel jLabelidciudadInformacionLaboral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadInformacionLaboral;
	public JButton jButtonidciudadInformacionLaboral= new JButtonMe();
	public JButton jButtonidciudadInformacionLaboralUpdate= new JButtonMe();
	public JButton jButtonidciudadInformacionLaboralBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesInformacionLaboral;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public InformacionLaboralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposInformacionLaboral=new JPanel();
				this.jPanelAccionesFormularioInformacionLaboral=new JPanel();
				this.jmenuBarDetalleInformacionLaboral=new JMenuBar();
				this.jTtoolBarDetalleInformacionLaboral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public InformacionLaboralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionLaboralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformacionLaboral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarInformacionLaboral() {
		return this.jButtonActualizarToolBarInformacionLaboral;
	}
	
	public JButton getjButtonEliminarToolBarInformacionLaboral() {
		return this.jButtonEliminarToolBarInformacionLaboral;
	}
	
	public JButton getjButtonCancelarToolBarInformacionLaboral() {
		return this.jButtonCancelarToolBarInformacionLaboral;
	}		
	
	public JButton getjButtonProcesarInformacionInformacionLaboral() {
		return this.jButtonProcesarInformacionInformacionLaboral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformacionLaboral)	{
		this.jButtonProcesarInformacionInformacionLaboral = jButtonProcesarInformacionInformacionLaboral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformacionLaboral() {
		return this.jComboBoxTiposAccionesInformacionLaboral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformacionLaboral(
			JComboBox jComboBoxTiposRelacionesInformacionLaboral) {
		this.jComboBoxTiposRelacionesInformacionLaboral = jComboBoxTiposRelacionesInformacionLaboral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformacionLaboral(
			JComboBox jComboBoxTiposAccionesInformacionLaboral) {
		this.jComboBoxTiposAccionesInformacionLaboral = jComboBoxTiposAccionesInformacionLaboral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioInformacionLaboral() {
		return this.jComboBoxTiposAccionesFormularioInformacionLaboral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioInformacionLaboral(
			JComboBox jComboBoxTiposAccionesFormularioInformacionLaboral) {
		this.jComboBoxTiposAccionesFormularioInformacionLaboral = jComboBoxTiposAccionesFormularioInformacionLaboral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		
		this.informacionlaboralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacionlaboralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informacionlaboralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformacionLaboralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informacion Laboral MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
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
	
		InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleInformacionLaboral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarInformacionLaboral=new JButtonMe();
				this.jButtonModificarToolBarInformacionLaboral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarInformacionLaboral,this.jTtoolBarDetalleInformacionLaboral,
							"actualizar","actualizar","Actualizar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarInformacionLaboral,this.jTtoolBarDetalleInformacionLaboral,
							"eliminar","eliminar","Eliminar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarInformacionLaboral,this.jTtoolBarDetalleInformacionLaboral,
							"cancelar","cancelar","Cancelar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarInformacionLaboral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarInformacionLaboral,this.jTtoolBarDetalleInformacionLaboral,
							"guardarcambios","guardarcambios","Guardar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleInformacionLaboral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleInformacionLaboral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoInformacionLaboral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesInformacionLaboral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosInformacionLaboral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformacionLaboral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformacionLaboral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformacionLaboral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarInformacionLaboral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarInformacionLaboral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarInformacionLaboral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarInformacionLaboral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarInformacionLaboral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarInformacionLaboral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarInformacionLaboral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarInformacionLaboral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarInformacionLaboral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarInformacionLaboral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarInformacionLaboral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarInformacionLaboral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosInformacionLaboral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformacionLaboral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformacionLaboral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformacionLaboral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformacionLaboral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformacionLaboral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarInformacionLaboral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarInformacionLaboral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarInformacionLaboral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformacionLaboral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformacionLaboral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformacionLaboral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformacionLaboral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformacionLaboral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformacionLaboral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoInformacionLaboral.add(this.jMenuItemDetalleCerrarInformacionLaboral);
		
		this.jmenuDetalleAccionesInformacionLaboral.add(this.jMenuItemActualizarInformacionLaboral);
		this.jmenuDetalleAccionesInformacionLaboral.add(this.jMenuItemEliminarInformacionLaboral);
		this.jmenuDetalleAccionesInformacionLaboral.add(this.jMenuItemCancelarInformacionLaboral);		
		
		//this.jmenuDetalleDatosInformacionLaboral.add(this.jMenuItemDetalleAbrirOrderByInformacionLaboral);				
		this.jmenuDetalleDatosInformacionLaboral.add(this.jMenuItemDetalleMostarOcultarInformacionLaboral);				
				
		//this.jmenuDetalleAccionesInformacionLaboral.add(this.jMenuItemGuardarCambiosInformacionLaboral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleInformacionLaboral.add(this.jmenuDetalleArchivoInformacionLaboral);		
		this.jmenuBarDetalleInformacionLaboral.add(this.jmenuDetalleAccionesInformacionLaboral);		
		this.jmenuBarDetalleInformacionLaboral.add(this.jmenuDetalleDatosInformacionLaboral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleInformacionLaboral);				
	}
	
	
	public void inicializarElementosCamposInformacionLaboral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdInformacionLaboral = new JLabelMe();
		jLabelIdInformacionLaboral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidInformacionLaboral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutInformacionLaboral= new GridBagLayout();

		this.jPanelidInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);

		jLabelidInformacionLaboral = new JLabel();
		jLabelidInformacionLaboral.setText("Id");

		jLabelidInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltiempoaInformacionLaboral = new JLabelMe();
		this.jLabeltiempoaInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_TIEMPOA+" : *");
		this.jLabeltiempoaInformacionLaboral.setToolTipText("Tiempo A");
		this.jLabeltiempoaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiempoaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiempoaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltiempoaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltiempoaInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltiempoaInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_TIEMPOA);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPaneltiempoaInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextFieldtiempoaInformacionLaboral= new JTextFieldMe();
		jTextFieldtiempoaInformacionLaboral.setEnabled(false);
		jTextFieldtiempoaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtiempoaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtiempoaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtiempoaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtiempoaInformacionLaboral.setText("0");

		this.jButtontiempoaInformacionLaboralBusqueda= new JButtonMe();
		this.jButtontiempoaInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiempoaInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiempoaInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontiempoaInformacionLaboralBusqueda.setText("U");
		this.jButtontiempoaInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontiempoaInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontiempoaInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtiempoaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtiempoaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tiempoaInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontiempoaInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabeltiempomInformacionLaboral = new JLabelMe();
		this.jLabeltiempomInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_TIEMPOM+" : *");
		this.jLabeltiempomInformacionLaboral.setToolTipText("Tiempo M");
		this.jLabeltiempomInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiempomInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiempomInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltiempomInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltiempomInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltiempomInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_TIEMPOM);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPaneltiempomInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextFieldtiempomInformacionLaboral= new JTextFieldMe();
		jTextFieldtiempomInformacionLaboral.setEnabled(false);
		jTextFieldtiempomInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtiempomInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtiempomInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtiempomInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtiempomInformacionLaboral.setText("0");

		this.jButtontiempomInformacionLaboralBusqueda= new JButtonMe();
		this.jButtontiempomInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiempomInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiempomInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontiempomInformacionLaboralBusqueda.setText("U");
		this.jButtontiempomInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontiempomInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontiempomInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtiempomInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtiempomInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tiempomInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontiempomInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabelnombreempresaInformacionLaboral = new JLabelMe();
		this.jLabelnombreempresaInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombreempresaInformacionLaboral.setToolTipText("Nombre Empresa");
		this.jLabelnombreempresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreempresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreempresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreempresaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreempresaInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreempresaInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelnombreempresaInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextAreanombreempresaInformacionLaboral= new JTextAreaMe();
		jTextAreanombreempresaInformacionLaboral.setEnabled(false);
		jTextAreanombreempresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreempresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreempresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreempresaInformacionLaboral.setLineWrap(true);
		jTextAreanombreempresaInformacionLaboral.setWrapStyleWord(true);
		jTextAreanombreempresaInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreempresaInformacionLaboral.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreempresaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreempresaInformacionLaboral = new JScrollPane(jTextAreanombreempresaInformacionLaboral);
		jscrollPanenombreempresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreempresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreempresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreempresaInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonnombreempresaInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreempresaInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreempresaInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreempresaInformacionLaboralBusqueda.setText("U");
		this.jButtonnombreempresaInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreempresaInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreempresaInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreempresaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreempresaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreempresaInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreempresaInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabeldireccionInformacionLaboral = new JLabelMe();
		this.jLabeldireccionInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionInformacionLaboral.setToolTipText("Direccion");
		this.jLabeldireccionInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPaneldireccionInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextAreadireccionInformacionLaboral= new JTextAreaMe();
		jTextAreadireccionInformacionLaboral.setEnabled(false);
		jTextAreadireccionInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionInformacionLaboral.setLineWrap(true);
		jTextAreadireccionInformacionLaboral.setWrapStyleWord(true);
		jTextAreadireccionInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionInformacionLaboral.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionInformacionLaboral = new JScrollPane(jTextAreadireccionInformacionLaboral);
		jscrollPanedireccionInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionInformacionLaboralBusqueda= new JButtonMe();
		this.jButtondireccionInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionInformacionLaboralBusqueda.setText("U");
		this.jButtondireccionInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabelnombrereferenciaInformacionLaboral = new JLabelMe();
		this.jLabelnombrereferenciaInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA+" : *");
		this.jLabelnombrereferenciaInformacionLaboral.setToolTipText("Nombre Referencia");
		this.jLabelnombrereferenciaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombrereferenciaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombrereferenciaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrereferenciaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrereferenciaInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrereferenciaInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_NOMBREREFERENCIA);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelnombrereferenciaInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextAreanombrereferenciaInformacionLaboral= new JTextAreaMe();
		jTextAreanombrereferenciaInformacionLaboral.setEnabled(false);
		jTextAreanombrereferenciaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrereferenciaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrereferenciaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrereferenciaInformacionLaboral.setLineWrap(true);
		jTextAreanombrereferenciaInformacionLaboral.setWrapStyleWord(true);
		jTextAreanombrereferenciaInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrereferenciaInformacionLaboral.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombrereferenciaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrereferenciaInformacionLaboral = new JScrollPane(jTextAreanombrereferenciaInformacionLaboral);
		jscrollPanenombrereferenciaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrereferenciaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrereferenciaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrereferenciaInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonnombrereferenciaInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrereferenciaInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrereferenciaInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrereferenciaInformacionLaboralBusqueda.setText("U");
		this.jButtonnombrereferenciaInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrereferenciaInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrereferenciaInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrereferenciaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrereferenciaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrereferenciaInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrereferenciaInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoInformacionLaboral = new JLabelMe();
		this.jLabeltelefonoInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoInformacionLaboral.setToolTipText("Telefono");
		this.jLabeltelefonoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPaneltelefonoInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextAreatelefonoInformacionLaboral= new JTextAreaMe();
		jTextAreatelefonoInformacionLaboral.setEnabled(false);
		jTextAreatelefonoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoInformacionLaboral.setLineWrap(true);
		jTextAreatelefonoInformacionLaboral.setWrapStyleWord(true);
		jTextAreatelefonoInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoInformacionLaboral.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoInformacionLaboral = new JScrollPane(jTextAreatelefonoInformacionLaboral);
		jscrollPanetelefonoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonoInformacionLaboralBusqueda= new JButtonMe();
		this.jButtontelefonoInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoInformacionLaboralBusqueda.setText("U");
		this.jButtontelefonoInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabeltelefonocodigoareaInformacionLaboral = new JLabelMe();
		this.jLabeltelefonocodigoareaInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA+" : *");
		this.jLabeltelefonocodigoareaInformacionLaboral.setToolTipText("Telefono Codigo Area");
		this.jLabeltelefonocodigoareaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltelefonocodigoareaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonocodigoareaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonocodigoareaInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonocodigoareaInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPaneltelefonocodigoareaInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextFieldtelefonocodigoareaInformacionLaboral= new JTextFieldMe();

		jTextFieldtelefonocodigoareaInformacionLaboral.setEnabled(false);
		jTextFieldtelefonocodigoareaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonocodigoareaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonocodigoareaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonocodigoareaInformacionLaboralBusqueda= new JButtonMe();
		this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setText("U");
		this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonocodigoareaInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonocodigoareaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonocodigoareaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonocodigoareaInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonocodigoareaInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabeltelefonomovilInformacionLaboral = new JLabelMe();
		this.jLabeltelefonomovilInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL+" : *");
		this.jLabeltelefonomovilInformacionLaboral.setToolTipText("Telefono Movil");
		this.jLabeltelefonomovilInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonomovilInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonomovilInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonomovilInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonomovilInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_TELEFONOMOVIL);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPaneltelefonomovilInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextAreatelefonomovilInformacionLaboral= new JTextAreaMe();
		jTextAreatelefonomovilInformacionLaboral.setEnabled(false);
		jTextAreatelefonomovilInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonomovilInformacionLaboral.setLineWrap(true);
		jTextAreatelefonomovilInformacionLaboral.setWrapStyleWord(true);
		jTextAreatelefonomovilInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonomovilInformacionLaboral.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonomovilInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonomovilInformacionLaboral = new JScrollPane(jTextAreatelefonomovilInformacionLaboral);
		jscrollPanetelefonomovilInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefonomovilInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefonomovilInformacionLaboralBusqueda= new JButtonMe();
		this.jButtontelefonomovilInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonomovilInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonomovilInformacionLaboralBusqueda.setText("U");
		this.jButtontelefonomovilInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonomovilInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonomovilInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonomovilInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonomovilInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonomovilInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonomovilInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabelemailInformacionLaboral = new JLabelMe();
		this.jLabelemailInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabelemailInformacionLaboral.setToolTipText("Email");
		this.jLabelemailInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelemailInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jTextAreaemailInformacionLaboral= new JTextAreaMe();
		jTextAreaemailInformacionLaboral.setEnabled(false);
		jTextAreaemailInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailInformacionLaboral.setLineWrap(true);
		jTextAreaemailInformacionLaboral.setWrapStyleWord(true);
		jTextAreaemailInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailInformacionLaboral.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaemailInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailInformacionLaboral = new JScrollPane(jTextAreaemailInformacionLaboral);
		jscrollPaneemailInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneemailInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonemailInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonemailInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailInformacionLaboralBusqueda.setText("U");
		this.jButtonemailInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailInformacionLaboralBusqueda.setVisible(false);		}


					
		this.jLabelesactivoInformacionLaboral = new JLabelMe();
		this.jLabelesactivoInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoInformacionLaboral.setToolTipText("Es Activo");
		this.jLabelesactivoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelesactivoInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jCheckBoxesactivoInformacionLaboral= new JCheckBoxMe();
		jCheckBoxesactivoInformacionLaboral.setEnabled(false);

		jCheckBoxesactivoInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonesactivoInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoInformacionLaboralBusqueda.setText("U");
		this.jButtonesactivoInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoInformacionLaboralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysInformacionLaboral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelidclienteInformacionLaboral = new JLabelMe();
		this.jLabelidclienteInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteInformacionLaboral.setToolTipText("Cliente");
		this.jLabelidclienteInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelidclienteInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxidclienteInformacionLaboral= new JComboBoxMe();
		jComboBoxidclienteInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteInformacionLaboral= new JButtonMe();
		this.jButtonidclienteInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionLaboral.setText("Buscar");
		this.jButtonidclienteInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionLaboral"));

		this.jButtonidclienteInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonidclienteInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteInformacionLaboralBusqueda.setText("U");
		this.jButtonidclienteInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonidclienteInformacionLaboralUpdate= new JButtonMe();
		this.jButtonidclienteInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteInformacionLaboralUpdate.setText("U");
		this.jButtonidclienteInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionLaboralUpdate"));



					
		this.jLabelidvalorempresaInformacionLaboral = new JLabelMe();
		this.jLabelidvalorempresaInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA+" : *");
		this.jLabelidvalorempresaInformacionLaboral.setToolTipText("Tipo Empresa");
		this.jLabelidvalorempresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorempresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorempresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorempresaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorempresaInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorempresaInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDTIPOEMPRESA);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelidvalorempresaInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxidvalorempresaInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorempresaInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorempresaInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorempresaInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorempresaInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorempresaInformacionLaboral= new JButtonMe();
		this.jButtonidvalorempresaInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorempresaInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorempresaInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorempresaInformacionLaboral.setText("Buscar");
		this.jButtonidvalorempresaInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorempresaInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorempresaInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorempresaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorempresaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorempresaInformacionLaboral"));

		this.jButtonidvalorempresaInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonidvalorempresaInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorempresaInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorempresaInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorempresaInformacionLaboralBusqueda.setText("U");
		this.jButtonidvalorempresaInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorempresaInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorempresaInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorempresaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorempresaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorempresaInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorempresaInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonidvalorempresaInformacionLaboralUpdate= new JButtonMe();
		this.jButtonidvalorempresaInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorempresaInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorempresaInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorempresaInformacionLaboralUpdate.setText("U");
		this.jButtonidvalorempresaInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorempresaInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorempresaInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorempresaInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorempresaInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorempresaInformacionLaboralUpdate"));



					
		this.jLabelidvalorclienterelacionlaboralInformacionLaboral = new JLabelMe();
		this.jLabelidvalorclienterelacionlaboralInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO+" : *");
		this.jLabelidvalorclienterelacionlaboralInformacionLaboral.setToolTipText("Tipo Rela Labo");
		this.jLabelidvalorclienterelacionlaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclienterelacionlaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclienterelacionlaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclienterelacionlaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclienterelacionlaboralInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclienterelacionlaboralInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDTIPORELALABO);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelidvalorclienterelacionlaboralInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxidvalorclienterelacionlaboralInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclienterelacionlaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclienterelacionlaboralInformacionLaboral= new JButtonMe();
		this.jButtonidvalorclienterelacionlaboralInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboral.setText("Buscar");
		this.jButtonidvalorclienterelacionlaboralInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclienterelacionlaboralInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienterelacionlaboralInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienterelacionlaboralInformacionLaboral"));

		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setText("U");
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienterelacionlaboralInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate= new JButtonMe();
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.setText("U");
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclienterelacionlaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclienterelacionlaboralInformacionLaboralUpdate"));



					
		this.jLabelidvalorclientearealaboralInformacionLaboral = new JLabelMe();
		this.jLabelidvalorclientearealaboralInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO+" : *");
		this.jLabelidvalorclientearealaboralInformacionLaboral.setToolTipText("Tipo Area Labo");
		this.jLabelidvalorclientearealaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclientearealaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclientearealaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientearealaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientearealaboralInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientearealaboralInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDTIPOAREALABO);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelidvalorclientearealaboralInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxidvalorclientearealaboralInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorclientearealaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientearealaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientearealaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientearealaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientearealaboralInformacionLaboral= new JButtonMe();
		this.jButtonidvalorclientearealaboralInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientearealaboralInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientearealaboralInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientearealaboralInformacionLaboral.setText("Buscar");
		this.jButtonidvalorclientearealaboralInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientearealaboralInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientearealaboralInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientearealaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientearealaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientearealaboralInformacionLaboral"));

		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setText("U");
		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientearealaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientearealaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientearealaboralInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientearealaboralInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonidvalorclientearealaboralInformacionLaboralUpdate= new JButtonMe();
		this.jButtonidvalorclientearealaboralInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientearealaboralInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientearealaboralInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientearealaboralInformacionLaboralUpdate.setText("U");
		this.jButtonidvalorclientearealaboralInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientearealaboralInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientearealaboralInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientearealaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientearealaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientearealaboralInformacionLaboralUpdate"));



					
		this.jLabelidvalorclientecargolaboralInformacionLaboral = new JLabelMe();
		this.jLabelidvalorclientecargolaboralInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO+" : *");
		this.jLabelidvalorclientecargolaboralInformacionLaboral.setToolTipText("Tipo Cargo Labo");
		this.jLabelidvalorclientecargolaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientecargolaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientecargolaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientecargolaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientecargolaboralInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientecargolaboralInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDTIPOCARGOLABO);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelidvalorclientecargolaboralInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxidvalorclientecargolaboralInformacionLaboral= new JComboBoxMe();
		jComboBoxidvalorclientecargolaboralInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecargolaboralInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecargolaboralInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientecargolaboralInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientecargolaboralInformacionLaboral= new JButtonMe();
		this.jButtonidvalorclientecargolaboralInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecargolaboralInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecargolaboralInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecargolaboralInformacionLaboral.setText("Buscar");
		this.jButtonidvalorclientecargolaboralInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientecargolaboralInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecargolaboralInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientecargolaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecargolaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecargolaboralInformacionLaboral"));

		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setText("U");
		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientecargolaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecargolaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecargolaboralInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientecargolaboralInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate= new JButtonMe();
		this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.setText("U");
		this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecargolaboralInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientecargolaboralInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecargolaboralInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecargolaboralInformacionLaboralUpdate"));



					
		this.jLabelid_paisInformacionLaboral = new JLabelMe();
		this.jLabelid_paisInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisInformacionLaboral.setToolTipText("Pais");
		this.jLabelid_paisInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelid_paisInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxid_paisInformacionLaboral= new JComboBoxMe();
		jComboBoxid_paisInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisInformacionLaboral= new JButtonMe();
		this.jButtonid_paisInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisInformacionLaboral.setText("Buscar");
		this.jButtonid_paisInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisInformacionLaboral"));

		this.jButtonid_paisInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonid_paisInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisInformacionLaboralBusqueda.setText("U");
		this.jButtonid_paisInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonid_paisInformacionLaboralUpdate= new JButtonMe();
		this.jButtonid_paisInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisInformacionLaboralUpdate.setText("U");
		this.jButtonid_paisInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisInformacionLaboralUpdate"));



					
		this.jLabelidciudadInformacionLaboral = new JLabelMe();
		this.jLabelidciudadInformacionLaboral.setText(""+InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelidciudadInformacionLaboral.setToolTipText("Ciudad");
		this.jLabelidciudadInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidciudadInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidciudadInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidciudadInformacionLaboral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidciudadInformacionLaboral.setToolTipText(InformacionLaboralConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutInformacionLaboral = new GridBagLayout();
		this.jPanelidciudadInformacionLaboral.setLayout(this.gridaBagLayoutInformacionLaboral);


		jComboBoxidciudadInformacionLaboral= new JComboBoxMe();
		jComboBoxidciudadInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidciudadInformacionLaboral= new JButtonMe();
		this.jButtonidciudadInformacionLaboral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadInformacionLaboral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadInformacionLaboral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidciudadInformacionLaboral.setText("Buscar");
		this.jButtonidciudadInformacionLaboral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidciudadInformacionLaboral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadInformacionLaboral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidciudadInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadInformacionLaboral"));

		this.jButtonidciudadInformacionLaboralBusqueda= new JButtonMe();
		this.jButtonidciudadInformacionLaboralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadInformacionLaboralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadInformacionLaboralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadInformacionLaboralBusqueda.setText("U");
		this.jButtonidciudadInformacionLaboralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidciudadInformacionLaboralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadInformacionLaboralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidciudadInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadInformacionLaboralBusqueda"));

		if(this.informacionlaboralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidciudadInformacionLaboralBusqueda.setVisible(false);		}

		this.jButtonidciudadInformacionLaboralUpdate= new JButtonMe();
		this.jButtonidciudadInformacionLaboralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadInformacionLaboralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidciudadInformacionLaboralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidciudadInformacionLaboralUpdate.setText("U");
		this.jButtonidciudadInformacionLaboralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidciudadInformacionLaboralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidciudadInformacionLaboralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidciudadInformacionLaboral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidciudadInformacionLaboral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idciudadInformacionLaboralUpdate"));



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
		//this.jInternalFrameDetalleInformacionLaboral = new InformacionLaboralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Informacion Laboral DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformacionLaboral= new GridBagLayout();
		

		
		String sToolTipInformacionLaboral="";
		sToolTipInformacionLaboral=InformacionLaboralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformacionLaboral+="(Cartera.InformacionLaboral)";
		}
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformacionLaboral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoInformacionLaboral = new JButtonMe();
		this.jButtonModificarInformacionLaboral = new JButtonMe();
        this.jButtonActualizarInformacionLaboral = new JButtonMe();
        this.jButtonEliminarInformacionLaboral = new JButtonMe();
        this.jButtonCancelarInformacionLaboral = new JButtonMe();
        this.jButtonGuardarCambiosInformacionLaboral = new JButtonMe();
		this.jButtonGuardarCambiosTablaInformacionLaboral = new JButtonMe();
		this.jButtonCerrarInformacionLaboral = new JButtonMe();
		
		this.jScrollPanelDatosInformacionLaboral = new JScrollPane();   
        this.jScrollPanelDatosEdicionInformacionLaboral = new JScrollPane();
		this.jScrollPanelDatosGeneralInformacionLaboral = new JScrollPane();
				
		
		
		this.jPanelCamposInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Informacion Laboral";
		
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Laborales" + this.sPath));
		} else {
			this.jScrollPanelDatosInformacionLaboral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposInformacionLaboral.setName("jPanelCamposInformacionLaboral"); 

		this.jPanelCamposOcultosInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosInformacionLaboral.setName("jPanelCamposOcultosInformacionLaboral"); 

        this.jPanelAccionesInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformacionLaboral.setToolTipText("Acciones");
        this.jPanelAccionesInformacionLaboral.setName("Acciones"); 

		this.jPanelAccionesFormularioInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioInformacionLaboral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioInformacionLaboral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoInformacionLaboral.setText("Nuevo");
		this.jButtonModificarInformacionLaboral.setText("Editar");
        this.jButtonActualizarInformacionLaboral.setText("Actualizar");
        this.jButtonEliminarInformacionLaboral.setText("Eliminar");
        this.jButtonCancelarInformacionLaboral.setText("Cancelar");
        this.jButtonGuardarCambiosInformacionLaboral.setText("Guardar");
		this.jButtonGuardarCambiosTablaInformacionLaboral.setText("Guardar");
		this.jButtonCerrarInformacionLaboral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformacionLaboral,"nuevo_button","Nuevo",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarInformacionLaboral,"modificar_button","Editar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarInformacionLaboral,"actualizar_button","Actualizar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarInformacionLaboral,"eliminar_button","Eliminar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarInformacionLaboral,"cancelar_button","Cancelar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosInformacionLaboral,"guardarcambios_button","Guardar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformacionLaboral,"guardarcambiostabla_button","Guardar",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformacionLaboral,"cerrar_button","Salir",this.informacionlaboralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoInformacionLaboral.setToolTipText("Nuevo"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarInformacionLaboral.setToolTipText("Editar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarInformacionLaboral.setToolTipText("Actualizar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarInformacionLaboral.setToolTipText("Eliminar)"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarInformacionLaboral.setToolTipText("Cancelar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosInformacionLaboral.setToolTipText("Guardar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaInformacionLaboral.setToolTipText("Guardar"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformacionLaboral.setToolTipText("Salir"+" "+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformacionLaboral";
		inputMap = this.jButtonNuevoInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformacionLaboral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformacionLaboral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarInformacionLaboral";
		inputMap = this.jButtonActualizarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarInformacionLaboral"));
		
		//ELIMINAR
		sMapKey = "EliminarInformacionLaboral";
		inputMap = this.jButtonEliminarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarInformacionLaboral"));
		
		//CANCELAR	
		sMapKey = "CancelarInformacionLaboral";
		inputMap = this.jButtonCancelarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarInformacionLaboral"));
		
		//CERRAR		
		sMapKey = "CerrarInformacionLaboral";
		inputMap = this.jButtonCerrarInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformacionLaboral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformacionLaboral";
		inputMap = this.jButtonGuardarCambiosTablaInformacionLaboral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformacionLaboral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformacionLaboral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoInformacionLaboral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoInformacionLaboral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoInformacionLaboral.setToolTipText("Nuevo InformacionLaboral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarInformacionLaboral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarInformacionLaboral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarInformacionLaboral.setToolTipText("Sin Cerrar Ventana InformacionLaboral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeInformacionLaboral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeInformacionLaboral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeInformacionLaboral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformacionLaboral.setText("Accion");
		this.jComboBoxTiposAccionesInformacionLaboral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioInformacionLaboral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioInformacionLaboral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioInformacionLaboral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesInformacionLaboral = new JLabelMe();
		
		this.jLabelAccionesInformacionLaboral.setText("Acciones");		
		this.jLabelAccionesInformacionLaboral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionLaboral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionLaboral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposInformacionLaboral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysInformacionLaboral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesInformacionLaboral=new JTabbedPane();
		this.jTabbedPaneRelacionesInformacionLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesInformacionLaboral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesInformacionLaboral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionLaboral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionLaboral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformacionLaboral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioInformacionLaboral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformacionLaboral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformacionLaboral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioInformacionLaboral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposInformacionLaboral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosInformacionLaboral = new GridBagLayout();
		
		this.jPanelCamposInformacionLaboral.setLayout(gridaBagLayoutCamposInformacionLaboral);
		this.jPanelCamposOcultosInformacionLaboral.setLayout(gridaBagLayoutCamposOcultosInformacionLaboral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidInformacionLaboral.add(jLabelIdInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidInformacionLaboral.add(jLabelidInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteInformacionLaboral.add(jLabelidclienteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 2;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteInformacionLaboral.add(jButtonidclienteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteInformacionLaboral.add(jButtonidclienteInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 4;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteInformacionLaboral.add(jButtonidclienteInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteInformacionLaboral.add(jComboBoxidclienteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorempresaInformacionLaboral.add(jLabelidvalorempresaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorempresaInformacionLaboral.add(jButtonidvalorempresaInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorempresaInformacionLaboral.add(jButtonidvalorempresaInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorempresaInformacionLaboral.add(jComboBoxidvalorempresaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclienterelacionlaboralInformacionLaboral.add(jLabelidvalorclienterelacionlaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclienterelacionlaboralInformacionLaboral.add(jButtonidvalorclienterelacionlaboralInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclienterelacionlaboralInformacionLaboral.add(jButtonidvalorclienterelacionlaboralInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclienterelacionlaboralInformacionLaboral.add(jComboBoxidvalorclienterelacionlaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientearealaboralInformacionLaboral.add(jLabelidvalorclientearealaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientearealaboralInformacionLaboral.add(jButtonidvalorclientearealaboralInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientearealaboralInformacionLaboral.add(jButtonidvalorclientearealaboralInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientearealaboralInformacionLaboral.add(jComboBoxidvalorclientearealaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientecargolaboralInformacionLaboral.add(jLabelidvalorclientecargolaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientecargolaboralInformacionLaboral.add(jButtonidvalorclientecargolaboralInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientecargolaboralInformacionLaboral.add(jButtonidvalorclientecargolaboralInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientecargolaboralInformacionLaboral.add(jComboBoxidvalorclientecargolaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisInformacionLaboral.add(jLabelid_paisInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisInformacionLaboral.add(jButtonid_paisInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisInformacionLaboral.add(jButtonid_paisInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisInformacionLaboral.add(jComboBoxid_paisInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidciudadInformacionLaboral.add(jLabelidciudadInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadInformacionLaboral.add(jButtonidciudadInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 3;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelidciudadInformacionLaboral.add(jButtonidciudadInformacionLaboralUpdate, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidciudadInformacionLaboral.add(jComboBoxidciudadInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltiempoaInformacionLaboral.add(jLabeltiempoaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPaneltiempoaInformacionLaboral.add(jButtontiempoaInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltiempoaInformacionLaboral.add(jTextFieldtiempoaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltiempomInformacionLaboral.add(jLabeltiempomInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPaneltiempomInformacionLaboral.add(jButtontiempomInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltiempomInformacionLaboral.add(jTextFieldtiempomInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreempresaInformacionLaboral.add(jLabelnombreempresaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreempresaInformacionLaboral.add(jButtonnombreempresaInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreempresaInformacionLaboral.add(jscrollPanenombreempresaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionInformacionLaboral.add(jLabeldireccionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionInformacionLaboral.add(jButtondireccionInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionInformacionLaboral.add(jscrollPanedireccionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrereferenciaInformacionLaboral.add(jLabelnombrereferenciaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrereferenciaInformacionLaboral.add(jButtonnombrereferenciaInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrereferenciaInformacionLaboral.add(jscrollPanenombrereferenciaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoInformacionLaboral.add(jLabeltelefonoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoInformacionLaboral.add(jButtontelefonoInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoInformacionLaboral.add(jscrollPanetelefonoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonocodigoareaInformacionLaboral.add(jLabeltelefonocodigoareaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonocodigoareaInformacionLaboral.add(jButtontelefonocodigoareaInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonocodigoareaInformacionLaboral.add(jTextFieldtelefonocodigoareaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonomovilInformacionLaboral.add(jLabeltelefonomovilInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonomovilInformacionLaboral.add(jButtontelefonomovilInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonomovilInformacionLaboral.add(jscrollPanetelefonomovilInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailInformacionLaboral.add(jLabelemailInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailInformacionLaboral.add(jButtonemailInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailInformacionLaboral.add(jscrollPaneemailInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 0;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoInformacionLaboral.add(jLabelesactivoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		//this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = 2;
		this.gridBagConstraintsInformacionLaboral.ipadx = 0;
		this.gridBagConstraintsInformacionLaboral.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoInformacionLaboral.add(jButtonesactivoInformacionLaboralBusqueda, this.gridBagConstraintsInformacionLaboral);
	}

	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionLaboral.gridy = 0;
	this.gridBagConstraintsInformacionLaboral.gridx = 1;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoInformacionLaboral.add(jCheckBoxesactivoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidclienteInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidvalorempresaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidvalorclienterelacionlaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidvalorclientearealaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidvalorclientecargolaboralInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelid_paisInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelidciudadInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPaneltiempoaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPaneltiempomInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelnombreempresaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPaneldireccionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelnombrereferenciaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPaneltelefonoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPaneltelefonocodigoareaInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPaneltelefonomovilInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelemailInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
	}
	this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionLaboral.gridy = iYPanelCamposInformacionLaboral;
	this.gridBagConstraintsInformacionLaboral.gridx = iXPanelCamposInformacionLaboral++;
	this.gridBagConstraintsInformacionLaboral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionLaboral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionLaboral.add(this.jPanelesactivoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);



	if(iXPanelCamposInformacionLaboral % 2==0) {
		iXPanelCamposInformacionLaboral=0;
		iYPanelCamposInformacionLaboral++;
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
			
		GridBagLayout gridaBagLayoutAccionesInformacionLaboral= new GridBagLayout();
		this.jPanelAccionesInformacionLaboral.setLayout(gridaBagLayoutAccionesInformacionLaboral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioInformacionLaboral= new GridBagLayout();
		this.jPanelAccionesFormularioInformacionLaboral.setLayout(gridaBagLayoutAccionesFormularioInformacionLaboral);
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformacionLaboral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformacionLaboral.add(this.jComboBoxTiposAccionesFormularioInformacionLaboral, this.gridBagConstraintsInformacionLaboral);

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformacionLaboral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformacionLaboral.add(this.jCheckBoxPostAccionNuevoInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioInformacionLaboral.add(this.jCheckBoxPostAccionSinCerrarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.informacionlaboralSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.informacionlaboralSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsInformacionLaboral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioInformacionLaboral.add(this.jCheckBoxPostAccionSinMensajeInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccion++;
			
		this.jPanelAccionesInformacionLaboral.add(this.jButtonModificarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);							

		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionLaboral.gridy = 0;
		this.gridBagConstraintsInformacionLaboral.gridx =iPosXAccion++;
			
		this.jPanelAccionesInformacionLaboral.add(this.jButtonEliminarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
			
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = 0;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformacionLaboral.add(this.jButtonActualizarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);


		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = 0;		
		this.gridBagConstraintsInformacionLaboral.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformacionLaboral.add(this.jButtonGuardarCambiosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);	
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = 0;		
		this.gridBagConstraintsInformacionLaboral.gridx =iPosXAccion++;
		
		this.jPanelAccionesInformacionLaboral.add(this.jButtonCancelarInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformacionLaboral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformacionLaboral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();						
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionLaboral.gridx = 0;		
			//this.gridBagConstraintsInformacionLaboral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformacionLaboral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformacionLaboral.gridx =0;
		this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformacionLaboral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(InformacionLaboralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleInformacionLaboral = new InformacionLaboralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Informacion Laboral DATOS");
			
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
			
	        //this.setTitle("[FOR] - Informacion Laboral DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informacion Laboral Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			InformacionLaboralModel informacionlaboralModel=new InformacionLaboralModel(this);
			
			//SI USARA CLASE INTERNA
			//InformacionLaboralModel.InformacionLaboralFocusTraversalPolicy informacionlaboralFocusTraversalPolicy = informacionlaboralModel.new InformacionLaboralFocusTraversalPolicy(this);
			
			//informacionlaboralFocusTraversalPolicy.setinformacionlaboralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(informacionlaboralModel);
			
			
			this.jContentPaneDetalleInformacionLaboral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleInformacionLaboral = new GridBagLayout();	
			this.jContentPaneDetalleInformacionLaboral.setLayout(gridaBagLayoutDetalleInformacionLaboral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformacionLaboral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
				this.gridBagConstraintsInformacionLaboral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsInformacionLaboral.gridx = 0;
					
				
				this.jContentPaneDetalleInformacionLaboral.add(jTtoolBarDetalleInformacionLaboral, gridBagConstraintsInformacionLaboral);								
				
}
			
			this.jScrollPanelDatosEdicionInformacionLaboral=   new JScrollPane(jContentPaneDetalleInformacionLaboral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformacionLaboral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionLaboral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionLaboral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralInformacionLaboral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformacionLaboral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionLaboral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionLaboral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsInformacionLaboral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsInformacionLaboral.gridx = 0;
	        
			this.jContentPaneDetalleInformacionLaboral.add(jPanelCamposInformacionLaboral, gridBagConstraintsInformacionLaboral);
			
			
			
			
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
						&& informacionlaboralSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.informacionlaboralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsInformacionLaboral= new GridBagConstraints();
						this.gridBagConstraintsInformacionLaboral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsInformacionLaboral.gridx = 0;
						this.jContentPaneDetalleInformacionLaboral.add(this.jTabbedPaneRelacionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesInformacionLaboral.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosInformacionLaboral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
					this.gridBagConstraintsInformacionLaboral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsInformacionLaboral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsInformacionLaboral.gridx = 0;
					
				
					this.jContentPaneDetalleInformacionLaboral.add(jPanelCamposOcultosInformacionLaboral, gridBagConstraintsInformacionLaboral);
				
					this.jPanelCamposOcultosInformacionLaboral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsInformacionLaboral.gridx = 0;
	        this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleInformacionLaboral.add(this.jPanelAccionesFormularioInformacionLaboral, this.gridBagConstraintsInformacionLaboral);							
			
			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
	        this.gridBagConstraintsInformacionLaboral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsInformacionLaboral.gridx = 0;
	        
			
			this.jContentPaneDetalleInformacionLaboral.add(this.jPanelAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionInformacionLaboral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionInformacionLaboral=   new JScrollPane(this.jPanelCamposInformacionLaboral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformacionLaboral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionLaboral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionLaboral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsInformacionLaboral.gridx = 0;
			this.gridBagConstraintsInformacionLaboral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsInformacionLaboral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsInformacionLaboral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformacionLaboral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioInformacionLaboral, this.gridBagConstraintsInformacionLaboral);			
			
			this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
			this.gridBagConstraintsInformacionLaboral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformacionLaboral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
			
			
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		
			
		this.gridBagConstraintsInformacionLaboral = new GridBagConstraints();
		this.gridBagConstraintsInformacionLaboral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformacionLaboral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformacionLaboral, this.gridBagConstraintsInformacionLaboral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralInformacionLaboral;//jContentPane;
		
		return jScrollPanelDatosEdicionInformacionLaboral;
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
