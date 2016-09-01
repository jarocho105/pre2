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
import com.bydan.erp.nomina.util.VariableNomiConstantesFunciones;

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
public class VariableNomiDetalleFormJInternalFrame extends VariableNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVariableNomi;
	
	protected JMenuBar jmenuBarDetalleVariableNomi;
	
	protected JMenu jmenuDetalleVariableNomi;
	protected JMenu jmenuDetalleArchivoVariableNomi;
	protected JMenu jmenuDetalleAccionesVariableNomi;
	protected JMenu jmenuDetalleDatosVariableNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVariableNomi;	
	protected GridBagConstraints gridBagConstraintsVariableNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VariableNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleVariableNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoVariableNomiBeanSwingJInternalFrame tipovariablenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovariablenomi="";

	protected TipoValorVariableNomiBeanSwingJInternalFrame tipovalorvariablenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovalorvariablenomi="";
	
	public VariableNomiSessionBean variablenomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoVariableNomiSessionBean tipovariablenomiSessionBean;
	public TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean;	
	
	public VariableNomiLogic variablenomiLogic;
	
	public JScrollPane jScrollPanelDatosVariableNomi;
	public JScrollPane jScrollPanelDatosEdicionVariableNomi;
	public JScrollPane jScrollPanelDatosGeneralVariableNomi;
	
	protected JPanel jPanelCamposVariableNomi;    
	protected JPanel jPanelCamposOcultosVariableNomi;    	
	protected JPanel jPanelAccionesVariableNomi;
	protected JPanel jPanelAccionesFormularioVariableNomi;
    
	
	
	protected Integer iXPanelCamposVariableNomi=0;
	protected Integer iYPanelCamposVariableNomi=0;
	
	protected Integer iXPanelCamposOcultosVariableNomi=0;
	protected Integer iYPanelCamposOcultosVariableNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVariableNomi;
	public JButton jButtonModificarVariableNomi;
	public JButton jButtonActualizarVariableNomi;
    public JButton jButtonEliminarVariableNomi;
	public JButton jButtonCancelarVariableNomi;
    public JButton jButtonGuardarCambiosVariableNomi;
	public JButton jButtonGuardarCambiosTablaVariableNomi;
	protected JButton jButtonCerrarVariableNomi;
	
	
	protected JButton jButtonProcesarInformacionVariableNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVariableNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVariableNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVariableNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVariableNomi;
	protected JButton jButtonModificarToolBarVariableNomi;
	protected JButton jButtonActualizarToolBarVariableNomi;
    protected JButton jButtonEliminarToolBarVariableNomi;
	protected JButton jButtonCancelarToolBarVariableNomi;
    protected JButton jButtonGuardarCambiosToolBarVariableNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarVariableNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarVariableNomi;
	protected JButton jButtonCerrarToolBarVariableNomi;
	
	protected JButton jButtonProcesarInformacionToolBarVariableNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVariableNomi;
	protected JMenuItem jMenuItemModificarVariableNomi;
	protected JMenuItem jMenuItemActualizarVariableNomi;
    protected JMenuItem jMenuItemEliminarVariableNomi;
	protected JMenuItem jMenuItemCancelarVariableNomi;
    protected JMenuItem jMenuItemGuardarCambiosVariableNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaVariableNomi;
	protected JMenuItem jMenuItemCerrarVariableNomi;
	protected JMenuItem jMenuItemDetalleCerrarVariableNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarVariableNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionVariableNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVariableNomi;
	protected JMenuItem jMenuItemMostrarOcultarVariableNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVariableNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVariableNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVariableNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVariableNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVariableNomi;
	public JLabel jLabelIdVariableNomi;
	public JLabel jLabelidVariableNomi;
	public JButton jButtonidVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoVariableNomi;
	public JLabel jLabelcodigoVariableNomi;
	public JTextField jTextFieldcodigoVariableNomi;
	public JButton jButtoncodigoVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreVariableNomi;
	public JLabel jLabelnombreVariableNomi;
	public JTextArea jTextAreanombreVariableNomi;
	public JScrollPane jscrollPanenombreVariableNomi;
	public JButton jButtonnombreVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelsql1VariableNomi;
	public JLabel jLabelsql1VariableNomi;
	public JTextArea jTextAreasql1VariableNomi;
	public JScrollPane jscrollPanesql1VariableNomi;
	public JButton jButtonsql1VariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelsql2VariableNomi;
	public JLabel jLabelsql2VariableNomi;
	public JTextArea jTextAreasql2VariableNomi;
	public JScrollPane jscrollPanesql2VariableNomi;
	public JButton jButtonsql2VariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelsql3VariableNomi;
	public JLabel jLabelsql3VariableNomi;
	public JTextArea jTextAreasql3VariableNomi;
	public JScrollPane jscrollPanesql3VariableNomi;
	public JButton jButtonsql3VariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelvalorVariableNomi;
	public JLabel jLabelvalorVariableNomi;
	public JTextField jTextFieldvalorVariableNomi;
	public JButton jButtonvalorVariableNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVariableNomi;
	public JLabel jLabelid_empresaVariableNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVariableNomi;
	public JButton jButtonid_empresaVariableNomi= new JButtonMe();
	public JButton jButtonid_empresaVariableNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloVariableNomi;
	public JLabel jLabelid_moduloVariableNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloVariableNomi;
	public JButton jButtonid_moduloVariableNomi= new JButtonMe();
	public JButton jButtonid_moduloVariableNomiUpdate= new JButtonMe();
	public JButton jButtonid_moduloVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_variable_nomiVariableNomi;
	public JLabel jLabelid_tipo_variable_nomiVariableNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_variable_nomiVariableNomi;
	public JButton jButtonid_tipo_variable_nomiVariableNomi= new JButtonMe();
	public JButton jButtonid_tipo_variable_nomiVariableNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_variable_nomiVariableNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_valor_variable_nomiVariableNomi;
	public JLabel jLabelid_tipo_valor_variable_nomiVariableNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valor_variable_nomiVariableNomi;
	public JButton jButtonid_tipo_valor_variable_nomiVariableNomi= new JButtonMe();
	public JButton jButtonid_tipo_valor_variable_nomiVariableNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVariableNomi;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VariableNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVariableNomi=new JPanel();
				this.jPanelAccionesFormularioVariableNomi=new JPanel();
				this.jmenuBarDetalleVariableNomi=new JMenuBar();
				this.jTtoolBarDetalleVariableNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VariableNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VariableNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VariableNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVariableNomi() {
		return this.jButtonActualizarToolBarVariableNomi;
	}
	
	public JButton getjButtonEliminarToolBarVariableNomi() {
		return this.jButtonEliminarToolBarVariableNomi;
	}
	
	public JButton getjButtonCancelarToolBarVariableNomi() {
		return this.jButtonCancelarToolBarVariableNomi;
	}		
	
	public JButton getjButtonProcesarInformacionVariableNomi() {
		return this.jButtonProcesarInformacionVariableNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVariableNomi)	{
		this.jButtonProcesarInformacionVariableNomi = jButtonProcesarInformacionVariableNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVariableNomi() {
		return this.jComboBoxTiposAccionesVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVariableNomi(
			JComboBox jComboBoxTiposRelacionesVariableNomi) {
		this.jComboBoxTiposRelacionesVariableNomi = jComboBoxTiposRelacionesVariableNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVariableNomi(
			JComboBox jComboBoxTiposAccionesVariableNomi) {
		this.jComboBoxTiposAccionesVariableNomi = jComboBoxTiposAccionesVariableNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVariableNomi() {
		return this.jComboBoxTiposAccionesFormularioVariableNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVariableNomi(
			JComboBox jComboBoxTiposAccionesFormularioVariableNomi) {
		this.jComboBoxTiposAccionesFormularioVariableNomi = jComboBoxTiposAccionesFormularioVariableNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.variablenomiSessionBean=new VariableNomiSessionBean();
		
		this.variablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.variablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.variablenomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VariableNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VariableNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Variable Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
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
	
		VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVariableNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVariableNomi=new JButtonMe();
				this.jButtonModificarToolBarVariableNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVariableNomi,this.jTtoolBarDetalleVariableNomi,
							"actualizar","actualizar","Actualizar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVariableNomi,this.jTtoolBarDetalleVariableNomi,
							"eliminar","eliminar","Eliminar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVariableNomi,this.jTtoolBarDetalleVariableNomi,
							"cancelar","cancelar","Cancelar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVariableNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVariableNomi,this.jTtoolBarDetalleVariableNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVariableNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVariableNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVariableNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVariableNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVariableNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVariableNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVariableNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVariableNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVariableNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVariableNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVariableNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVariableNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVariableNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVariableNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVariableNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVariableNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVariableNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVariableNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVariableNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVariableNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVariableNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVariableNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVariableNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVariableNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVariableNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVariableNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVariableNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVariableNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVariableNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVariableNomi.add(this.jMenuItemDetalleCerrarVariableNomi);
		
		this.jmenuDetalleAccionesVariableNomi.add(this.jMenuItemActualizarVariableNomi);
		this.jmenuDetalleAccionesVariableNomi.add(this.jMenuItemEliminarVariableNomi);
		this.jmenuDetalleAccionesVariableNomi.add(this.jMenuItemCancelarVariableNomi);		
		
		//this.jmenuDetalleDatosVariableNomi.add(this.jMenuItemDetalleAbrirOrderByVariableNomi);				
		this.jmenuDetalleDatosVariableNomi.add(this.jMenuItemDetalleMostarOcultarVariableNomi);				
				
		//this.jmenuDetalleAccionesVariableNomi.add(this.jMenuItemGuardarCambiosVariableNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVariableNomi.add(this.jmenuDetalleArchivoVariableNomi);		
		this.jmenuBarDetalleVariableNomi.add(this.jmenuDetalleAccionesVariableNomi);		
		this.jmenuBarDetalleVariableNomi.add(this.jmenuDetalleDatosVariableNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVariableNomi);				
	}
	
	
	public void inicializarElementosCamposVariableNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVariableNomi = new JLabelMe();
		jLabelIdVariableNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVariableNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVariableNomi= new GridBagLayout();

		this.jPanelidVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);

		jLabelidVariableNomi = new JLabel();
		jLabelidVariableNomi.setText("Id");

		jLabelidVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoVariableNomi = new JLabelMe();
		this.jLabelcodigoVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoVariableNomi.setToolTipText("Codigo");
		this.jLabelcodigoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelcodigoVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jTextFieldcodigoVariableNomi= new JTextFieldMe();

		jTextFieldcodigoVariableNomi.setEnabled(false);
		jTextFieldcodigoVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoVariableNomiBusqueda= new JButtonMe();
		this.jButtoncodigoVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoVariableNomiBusqueda.setText("U");
		this.jButtoncodigoVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoVariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreVariableNomi = new JLabelMe();
		this.jLabelnombreVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreVariableNomi.setToolTipText("Nombre");
		this.jLabelnombreVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelnombreVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jTextAreanombreVariableNomi= new JTextAreaMe();
		jTextAreanombreVariableNomi.setEnabled(false);
		jTextAreanombreVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVariableNomi.setLineWrap(true);
		jTextAreanombreVariableNomi.setWrapStyleWord(true);
		jTextAreanombreVariableNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreVariableNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreVariableNomi = new JScrollPane(jTextAreanombreVariableNomi);
		jscrollPanenombreVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreVariableNomiBusqueda= new JButtonMe();
		this.jButtonnombreVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreVariableNomiBusqueda.setText("U");
		this.jButtonnombreVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreVariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelsql1VariableNomi = new JLabelMe();
		this.jLabelsql1VariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_SQL1+" :");
		this.jLabelsql1VariableNomi.setToolTipText("Sql1");
		this.jLabelsql1VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsql1VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsql1VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsql1VariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsql1VariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsql1VariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_SQL1);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelsql1VariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jTextAreasql1VariableNomi= new JTextAreaMe();
		jTextAreasql1VariableNomi.setEnabled(false);
		jTextAreasql1VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql1VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql1VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql1VariableNomi.setLineWrap(true);
		jTextAreasql1VariableNomi.setWrapStyleWord(true);
		jTextAreasql1VariableNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasql1VariableNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasql1VariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesql1VariableNomi = new JScrollPane(jTextAreasql1VariableNomi);
		jscrollPanesql1VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesql1VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesql1VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsql1VariableNomiBusqueda= new JButtonMe();
		this.jButtonsql1VariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsql1VariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsql1VariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsql1VariableNomiBusqueda.setText("U");
		this.jButtonsql1VariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsql1VariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsql1VariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasql1VariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasql1VariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sql1VariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsql1VariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelsql2VariableNomi = new JLabelMe();
		this.jLabelsql2VariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_SQL2+" :");
		this.jLabelsql2VariableNomi.setToolTipText("Sql2");
		this.jLabelsql2VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsql2VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsql2VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsql2VariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsql2VariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsql2VariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_SQL2);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelsql2VariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jTextAreasql2VariableNomi= new JTextAreaMe();
		jTextAreasql2VariableNomi.setEnabled(false);
		jTextAreasql2VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql2VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql2VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql2VariableNomi.setLineWrap(true);
		jTextAreasql2VariableNomi.setWrapStyleWord(true);
		jTextAreasql2VariableNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasql2VariableNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasql2VariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesql2VariableNomi = new JScrollPane(jTextAreasql2VariableNomi);
		jscrollPanesql2VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesql2VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesql2VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsql2VariableNomiBusqueda= new JButtonMe();
		this.jButtonsql2VariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsql2VariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsql2VariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsql2VariableNomiBusqueda.setText("U");
		this.jButtonsql2VariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsql2VariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsql2VariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasql2VariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasql2VariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sql2VariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsql2VariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelsql3VariableNomi = new JLabelMe();
		this.jLabelsql3VariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_SQL3+" :");
		this.jLabelsql3VariableNomi.setToolTipText("Sql3");
		this.jLabelsql3VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsql3VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsql3VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsql3VariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsql3VariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsql3VariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_SQL3);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelsql3VariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jTextAreasql3VariableNomi= new JTextAreaMe();
		jTextAreasql3VariableNomi.setEnabled(false);
		jTextAreasql3VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql3VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql3VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasql3VariableNomi.setLineWrap(true);
		jTextAreasql3VariableNomi.setWrapStyleWord(true);
		jTextAreasql3VariableNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasql3VariableNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasql3VariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesql3VariableNomi = new JScrollPane(jTextAreasql3VariableNomi);
		jscrollPanesql3VariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesql3VariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesql3VariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsql3VariableNomiBusqueda= new JButtonMe();
		this.jButtonsql3VariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsql3VariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsql3VariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsql3VariableNomiBusqueda.setText("U");
		this.jButtonsql3VariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsql3VariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsql3VariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasql3VariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasql3VariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sql3VariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsql3VariableNomiBusqueda.setVisible(false);		}


					
		this.jLabelvalorVariableNomi = new JLabelMe();
		this.jLabelvalorVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorVariableNomi.setToolTipText("Valor");
		this.jLabelvalorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelvalorVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jTextFieldvalorVariableNomi= new JTextFieldMe();
		jTextFieldvalorVariableNomi.setEnabled(false);
		jTextFieldvalorVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorVariableNomi.setText("0.0");

		this.jButtonvalorVariableNomiBusqueda= new JButtonMe();
		this.jButtonvalorVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorVariableNomiBusqueda.setText("U");
		this.jButtonvalorVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorVariableNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVariableNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVariableNomi = new JLabelMe();
		this.jLabelid_empresaVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVariableNomi.setToolTipText("Empresa");
		this.jLabelid_empresaVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelid_empresaVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jComboBoxid_empresaVariableNomi= new JComboBoxMe();
		jComboBoxid_empresaVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVariableNomi.setEnabled(false);

		this.jButtonid_empresaVariableNomi= new JButtonMe();
		this.jButtonid_empresaVariableNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVariableNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVariableNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVariableNomi.setText("Buscar");
		this.jButtonid_empresaVariableNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVariableNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVariableNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVariableNomi"));

		this.jButtonid_empresaVariableNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVariableNomiBusqueda.setText("U");
		this.jButtonid_empresaVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVariableNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaVariableNomiUpdate= new JButtonMe();
		this.jButtonid_empresaVariableNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVariableNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVariableNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVariableNomiUpdate.setText("U");
		this.jButtonid_empresaVariableNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVariableNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVariableNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVariableNomiUpdate"));



					
		this.jLabelid_moduloVariableNomi = new JLabelMe();
		this.jLabelid_moduloVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloVariableNomi.setToolTipText("Modulo");
		this.jLabelid_moduloVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelid_moduloVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jComboBoxid_moduloVariableNomi= new JComboBoxMe();
		jComboBoxid_moduloVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloVariableNomi.setEnabled(false);

		this.jButtonid_moduloVariableNomi= new JButtonMe();
		this.jButtonid_moduloVariableNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloVariableNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloVariableNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloVariableNomi.setText("Buscar");
		this.jButtonid_moduloVariableNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloVariableNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloVariableNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloVariableNomi"));

		this.jButtonid_moduloVariableNomiBusqueda= new JButtonMe();
		this.jButtonid_moduloVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloVariableNomiBusqueda.setText("U");
		this.jButtonid_moduloVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloVariableNomiBusqueda.setVisible(false);		}

		this.jButtonid_moduloVariableNomiUpdate= new JButtonMe();
		this.jButtonid_moduloVariableNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloVariableNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloVariableNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloVariableNomiUpdate.setText("U");
		this.jButtonid_moduloVariableNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloVariableNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloVariableNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloVariableNomiUpdate"));



					
		this.jLabelid_tipo_variable_nomiVariableNomi = new JLabelMe();
		this.jLabelid_tipo_variable_nomiVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI+" : *");
		this.jLabelid_tipo_variable_nomiVariableNomi.setToolTipText("Tipo Variable");
		this.jLabelid_tipo_variable_nomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_variable_nomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_variable_nomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_variable_nomiVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_variable_nomiVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_variable_nomiVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelid_tipo_variable_nomiVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jComboBoxid_tipo_variable_nomiVariableNomi= new JComboBoxMe();
		jComboBoxid_tipo_variable_nomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_variable_nomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_variable_nomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_variable_nomiVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_variable_nomiVariableNomi= new JButtonMe();
		this.jButtonid_tipo_variable_nomiVariableNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_variable_nomiVariableNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_variable_nomiVariableNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_variable_nomiVariableNomi.setText("Buscar");
		this.jButtonid_tipo_variable_nomiVariableNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_variable_nomiVariableNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_variable_nomiVariableNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_variable_nomiVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_variable_nomiVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_variable_nomiVariableNomi"));

		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda= new JButtonMe();
		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setText("U");
		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_variable_nomiVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_variable_nomiVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_variable_nomiVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_variable_nomiVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_variable_nomiVariableNomiBusqueda.setVisible(false);		}

		this.jButtonid_tipo_variable_nomiVariableNomiUpdate= new JButtonMe();
		this.jButtonid_tipo_variable_nomiVariableNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_variable_nomiVariableNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_variable_nomiVariableNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_variable_nomiVariableNomiUpdate.setText("U");
		this.jButtonid_tipo_variable_nomiVariableNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_variable_nomiVariableNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_variable_nomiVariableNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_variable_nomiVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_variable_nomiVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_variable_nomiVariableNomiUpdate"));



					
		this.jLabelid_tipo_valor_variable_nomiVariableNomi = new JLabelMe();
		this.jLabelid_tipo_valor_variable_nomiVariableNomi.setText(""+VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI+" : *");
		this.jLabelid_tipo_valor_variable_nomiVariableNomi.setToolTipText("Tipo Valor Variable");
		this.jLabelid_tipo_valor_variable_nomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valor_variable_nomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valor_variable_nomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valor_variable_nomiVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_valor_variable_nomiVariableNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_valor_variable_nomiVariableNomi.setToolTipText(VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI);
		this.gridaBagLayoutVariableNomi = new GridBagLayout();
		this.jPanelid_tipo_valor_variable_nomiVariableNomi.setLayout(this.gridaBagLayoutVariableNomi);


		jComboBoxid_tipo_valor_variable_nomiVariableNomi= new JComboBoxMe();
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valor_variable_nomiVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_valor_variable_nomiVariableNomi= new JButtonMe();
		this.jButtonid_tipo_valor_variable_nomiVariableNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valor_variable_nomiVariableNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valor_variable_nomiVariableNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valor_variable_nomiVariableNomi.setText("Buscar");
		this.jButtonid_tipo_valor_variable_nomiVariableNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_valor_variable_nomiVariableNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valor_variable_nomiVariableNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valor_variable_nomiVariableNomi"));

		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda= new JButtonMe();
		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setText("U");
		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valor_variable_nomiVariableNomiBusqueda"));

		if(this.variablenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.setVisible(false);		}

		this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate= new JButtonMe();
		this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.setText("U");
		this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valor_variable_nomiVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valor_variable_nomiVariableNomiUpdate"));



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
		//this.jInternalFrameDetalleVariableNomi = new VariableNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Variable Nomina DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVariableNomi= new GridBagLayout();
		

		
		String sToolTipVariableNomi="";
		sToolTipVariableNomi=VariableNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVariableNomi+="(Nomina.VariableNomi)";
		}
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipVariableNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVariableNomi = new JButtonMe();
		this.jButtonModificarVariableNomi = new JButtonMe();
        this.jButtonActualizarVariableNomi = new JButtonMe();
        this.jButtonEliminarVariableNomi = new JButtonMe();
        this.jButtonCancelarVariableNomi = new JButtonMe();
        this.jButtonGuardarCambiosVariableNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaVariableNomi = new JButtonMe();
		this.jButtonCerrarVariableNomi = new JButtonMe();
		
		this.jScrollPanelDatosVariableNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionVariableNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralVariableNomi = new JScrollPane();
				
		
		
		this.jPanelCamposVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Variable Nomina";
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Variable Nominas" + this.sPath));
		} else {
			this.jScrollPanelDatosVariableNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVariableNomi.setName("jPanelCamposVariableNomi"); 

		this.jPanelCamposOcultosVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVariableNomi.setName("jPanelCamposOcultosVariableNomi"); 

        this.jPanelAccionesVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesVariableNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVariableNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVariableNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVariableNomi.setText("Nuevo");
		this.jButtonModificarVariableNomi.setText("Editar");
        this.jButtonActualizarVariableNomi.setText("Actualizar");
        this.jButtonEliminarVariableNomi.setText("Eliminar");
        this.jButtonCancelarVariableNomi.setText("Cancelar");
        this.jButtonGuardarCambiosVariableNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaVariableNomi.setText("Guardar");
		this.jButtonCerrarVariableNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVariableNomi,"nuevo_button","Nuevo",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVariableNomi,"modificar_button","Editar",this.variablenomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVariableNomi,"actualizar_button","Actualizar",this.variablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVariableNomi,"eliminar_button","Eliminar",this.variablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVariableNomi,"cancelar_button","Cancelar",this.variablenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVariableNomi,"guardarcambios_button","Guardar",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVariableNomi,"guardarcambiostabla_button","Guardar",this.variablenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVariableNomi,"cerrar_button","Salir",this.variablenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVariableNomi.setToolTipText("Nuevo"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVariableNomi.setToolTipText("Editar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVariableNomi.setToolTipText("Actualizar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVariableNomi.setToolTipText("Eliminar)"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVariableNomi.setToolTipText("Cancelar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVariableNomi.setToolTipText("Guardar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVariableNomi.setToolTipText("Guardar"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVariableNomi.setToolTipText("Salir"+" "+VariableNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVariableNomi";
		inputMap = this.jButtonNuevoVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVariableNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVariableNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVariableNomi";
		inputMap = this.jButtonActualizarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVariableNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarVariableNomi";
		inputMap = this.jButtonEliminarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVariableNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarVariableNomi";
		inputMap = this.jButtonCancelarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVariableNomi"));
		
		//CERRAR		
		sMapKey = "CerrarVariableNomi";
		inputMap = this.jButtonCerrarVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVariableNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVariableNomi";
		inputMap = this.jButtonGuardarCambiosTablaVariableNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVariableNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVariableNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVariableNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVariableNomi.setToolTipText("Nuevo VariableNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVariableNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVariableNomi.setToolTipText("Sin Cerrar Ventana VariableNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVariableNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVariableNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVariableNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVariableNomi.setText("Accion");
		this.jComboBoxTiposAccionesVariableNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVariableNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVariableNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVariableNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVariableNomi = new JLabelMe();
		
		this.jLabelAccionesVariableNomi.setText("Acciones");		
		this.jLabelAccionesVariableNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVariableNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVariableNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVariableNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVariableNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVariableNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesVariableNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVariableNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVariableNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVariableNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVariableNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVariableNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVariableNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVariableNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVariableNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVariableNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVariableNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVariableNomi = new GridBagLayout();
		
		this.jPanelCamposVariableNomi.setLayout(gridaBagLayoutCamposVariableNomi);
		this.jPanelCamposOcultosVariableNomi.setLayout(gridaBagLayoutCamposOcultosVariableNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVariableNomi.add(jLabelIdVariableNomi, this.gridBagConstraintsVariableNomi);



	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVariableNomi.add(jLabelidVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVariableNomi.add(jLabelid_empresaVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVariableNomi.add(jButtonid_empresaVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 3;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVariableNomi.add(jButtonid_empresaVariableNomiUpdate, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVariableNomi.add(jComboBoxid_empresaVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloVariableNomi.add(jLabelid_moduloVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloVariableNomi.add(jButtonid_moduloVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 3;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloVariableNomi.add(jButtonid_moduloVariableNomiUpdate, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloVariableNomi.add(jComboBoxid_moduloVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_variable_nomiVariableNomi.add(jLabelid_tipo_variable_nomiVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_variable_nomiVariableNomi.add(jButtonid_tipo_variable_nomiVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 3;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_variable_nomiVariableNomi.add(jButtonid_tipo_variable_nomiVariableNomiUpdate, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_variable_nomiVariableNomi.add(jComboBoxid_tipo_variable_nomiVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_valor_variable_nomiVariableNomi.add(jLabelid_tipo_valor_variable_nomiVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valor_variable_nomiVariableNomi.add(jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 3;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valor_variable_nomiVariableNomi.add(jButtonid_tipo_valor_variable_nomiVariableNomiUpdate, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_valor_variable_nomiVariableNomi.add(jComboBoxid_tipo_valor_variable_nomiVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoVariableNomi.add(jLabelcodigoVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoVariableNomi.add(jButtoncodigoVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoVariableNomi.add(jTextFieldcodigoVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreVariableNomi.add(jLabelnombreVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreVariableNomi.add(jButtonnombreVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreVariableNomi.add(jscrollPanenombreVariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsql1VariableNomi.add(jLabelsql1VariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelsql1VariableNomi.add(jButtonsql1VariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsql1VariableNomi.add(jscrollPanesql1VariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsql2VariableNomi.add(jLabelsql2VariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelsql2VariableNomi.add(jButtonsql2VariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsql2VariableNomi.add(jscrollPanesql2VariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsql3VariableNomi.add(jLabelsql3VariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelsql3VariableNomi.add(jButtonsql3VariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsql3VariableNomi.add(jscrollPanesql3VariableNomi, this.gridBagConstraintsVariableNomi);


	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 0;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorVariableNomi.add(jLabelvalorVariableNomi, this.gridBagConstraintsVariableNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		//this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = 2;
		this.gridBagConstraintsVariableNomi.ipadx = 0;
		this.gridBagConstraintsVariableNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorVariableNomi.add(jButtonvalorVariableNomiBusqueda, this.gridBagConstraintsVariableNomi);
	}

	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVariableNomi.gridy = 0;
	this.gridBagConstraintsVariableNomi.gridx = 1;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorVariableNomi.add(jTextFieldvalorVariableNomi, this.gridBagConstraintsVariableNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelidVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelid_tipo_variable_nomiVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelid_tipo_valor_variable_nomiVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelcodigoVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelnombreVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelsql1VariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelsql2VariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelsql3VariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVariableNomi.add(this.jPanelvalorVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposVariableNomi % 1==0) {
		iXPanelCamposVariableNomi=0;
		iYPanelCamposVariableNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposOcultosVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposOcultosVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVariableNomi.add(this.jPanelid_empresaVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposOcultosVariableNomi % 1==0) {
		iXPanelCamposOcultosVariableNomi=0;
		iYPanelCamposOcultosVariableNomi++;
	}
	this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVariableNomi.gridy = iYPanelCamposOcultosVariableNomi;
	this.gridBagConstraintsVariableNomi.gridx = iXPanelCamposOcultosVariableNomi++;
	this.gridBagConstraintsVariableNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVariableNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVariableNomi.add(this.jPanelid_moduloVariableNomi, this.gridBagConstraintsVariableNomi);



	if(iXPanelCamposOcultosVariableNomi % 1==0) {
		iXPanelCamposOcultosVariableNomi=0;
		iYPanelCamposOcultosVariableNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesVariableNomi= new GridBagLayout();
		this.jPanelAccionesVariableNomi.setLayout(gridaBagLayoutAccionesVariableNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVariableNomi= new GridBagLayout();
		this.jPanelAccionesFormularioVariableNomi.setLayout(gridaBagLayoutAccionesFormularioVariableNomi);
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVariableNomi.add(this.jComboBoxTiposAccionesFormularioVariableNomi, this.gridBagConstraintsVariableNomi);

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVariableNomi.add(this.jCheckBoxPostAccionNuevoVariableNomi, this.gridBagConstraintsVariableNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVariableNomi.add(this.jCheckBoxPostAccionSinCerrarVariableNomi, this.gridBagConstraintsVariableNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVariableNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVariableNomi.add(this.jCheckBoxPostAccionSinMensajeVariableNomi, this.gridBagConstraintsVariableNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesVariableNomi.add(this.jButtonModificarVariableNomi, this.gridBagConstraintsVariableNomi);							

		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVariableNomi.gridy = 0;
		this.gridBagConstraintsVariableNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesVariableNomi.add(this.jButtonEliminarVariableNomi, this.gridBagConstraintsVariableNomi);
		
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = 0;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesVariableNomi.add(this.jButtonActualizarVariableNomi, this.gridBagConstraintsVariableNomi);


		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = 0;		
		this.gridBagConstraintsVariableNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesVariableNomi.add(this.jButtonGuardarCambiosVariableNomi, this.gridBagConstraintsVariableNomi);	
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = 0;		
		this.gridBagConstraintsVariableNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesVariableNomi.add(this.jButtonCancelarVariableNomi, this.gridBagConstraintsVariableNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVariableNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVariableNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();						
			this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVariableNomi.gridx = 0;		
			//this.gridBagConstraintsVariableNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVariableNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVariableNomi.gridx =0;
		this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVariableNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVariableNomi, this.gridBagConstraintsVariableNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVariableNomi = new VariableNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Variable Nomina DATOS");
			
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
			
	        //this.setTitle("[FOR] - Variable Nomina DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Variable Nomina Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VariableNomiModel variablenomiModel=new VariableNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//VariableNomiModel.VariableNomiFocusTraversalPolicy variablenomiFocusTraversalPolicy = variablenomiModel.new VariableNomiFocusTraversalPolicy(this);
			
			//variablenomiFocusTraversalPolicy.setvariablenomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(variablenomiModel);
			
			
			this.jContentPaneDetalleVariableNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVariableNomi = new GridBagLayout();	
			this.jContentPaneDetalleVariableNomi.setLayout(gridaBagLayoutDetalleVariableNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVariableNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVariableNomi = new GridBagConstraints();
				this.gridBagConstraintsVariableNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVariableNomi.gridx = 0;
					
				
				this.jContentPaneDetalleVariableNomi.add(jTtoolBarDetalleVariableNomi, gridBagConstraintsVariableNomi);								
				
}
			
			this.jScrollPanelDatosEdicionVariableNomi=   new JScrollPane(jContentPaneDetalleVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVariableNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVariableNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVariableNomi.gridx = 0;
	        
			this.jContentPaneDetalleVariableNomi.add(jPanelCamposVariableNomi, gridBagConstraintsVariableNomi);
			
			
			
			
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
						&& variablenomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVariableNomi= new GridBagConstraints();
						this.gridBagConstraintsVariableNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVariableNomi.gridx = 0;
						this.jContentPaneDetalleVariableNomi.add(this.jTabbedPaneRelacionesVariableNomi, this.gridBagConstraintsVariableNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVariableNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVariableNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVariableNomi = new GridBagConstraints();
					this.gridBagConstraintsVariableNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVariableNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVariableNomi.gridx = 0;
					
				
					this.jContentPaneDetalleVariableNomi.add(jPanelCamposOcultosVariableNomi, gridBagConstraintsVariableNomi);
				
					this.jPanelCamposOcultosVariableNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVariableNomi.gridx = 0;
	        this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVariableNomi.add(this.jPanelAccionesFormularioVariableNomi, this.gridBagConstraintsVariableNomi);							
			
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
	        this.gridBagConstraintsVariableNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVariableNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleVariableNomi.add(this.jPanelAccionesVariableNomi, this.gridBagConstraintsVariableNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVariableNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVariableNomi=   new JScrollPane(this.jPanelCamposVariableNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVariableNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVariableNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVariableNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVariableNomi.gridx = 0;
			this.gridBagConstraintsVariableNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVariableNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVariableNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVariableNomi, this.gridBagConstraintsVariableNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVariableNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVariableNomi, this.gridBagConstraintsVariableNomi);			
			
			this.gridBagConstraintsVariableNomi = new GridBagConstraints();
			this.gridBagConstraintsVariableNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVariableNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVariableNomi, this.gridBagConstraintsVariableNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVariableNomi, this.gridBagConstraintsVariableNomi);
			
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVariableNomi, this.gridBagConstraintsVariableNomi);
		
			
		this.gridBagConstraintsVariableNomi = new GridBagConstraints();
		this.gridBagConstraintsVariableNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVariableNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVariableNomi, this.gridBagConstraintsVariableNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVariableNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionVariableNomi;
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
