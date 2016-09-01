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
import com.bydan.erp.cartera.util.DireccionConstantesFunciones;

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
public class DireccionDetalleFormJInternalFrame extends DireccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDireccion;
	
	protected JMenuBar jmenuBarDetalleDireccion;
	
	protected JMenu jmenuDetalleDireccion;
	protected JMenu jmenuDetalleArchivoDireccion;
	protected JMenu jmenuDetalleAccionesDireccion;
	protected JMenu jmenuDetalleDatosDireccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDireccion;	
	protected GridBagConstraints gridBagConstraintsDireccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DireccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDireccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoDireccionBeanSwingJInternalFrame tipodireccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodireccion="";

	protected TipoViviendaBeanSwingJInternalFrame tipoviviendaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovivienda="";
	
	public DireccionSessionBean direccionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoDireccionSessionBean tipodireccionSessionBean;
	public TipoViviendaSessionBean tipoviviendaSessionBean;	
	
	public DireccionLogic direccionLogic;
	
	public JScrollPane jScrollPanelDatosDireccion;
	public JScrollPane jScrollPanelDatosEdicionDireccion;
	public JScrollPane jScrollPanelDatosGeneralDireccion;
	
	protected JPanel jPanelCamposDireccion;    
	protected JPanel jPanelCamposOcultosDireccion;    	
	protected JPanel jPanelAccionesDireccion;
	protected JPanel jPanelAccionesFormularioDireccion;
    
	
	
	protected Integer iXPanelCamposDireccion=0;
	protected Integer iYPanelCamposDireccion=0;
	
	protected Integer iXPanelCamposOcultosDireccion=0;
	protected Integer iYPanelCamposOcultosDireccion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDireccion;
	public JButton jButtonModificarDireccion;
	public JButton jButtonActualizarDireccion;
    public JButton jButtonEliminarDireccion;
	public JButton jButtonCancelarDireccion;
    public JButton jButtonGuardarCambiosDireccion;
	public JButton jButtonGuardarCambiosTablaDireccion;
	protected JButton jButtonCerrarDireccion;
	
	
	protected JButton jButtonProcesarInformacionDireccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDireccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDireccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDireccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDireccion;
	protected JButton jButtonModificarToolBarDireccion;
	protected JButton jButtonActualizarToolBarDireccion;
    protected JButton jButtonEliminarToolBarDireccion;
	protected JButton jButtonCancelarToolBarDireccion;
    protected JButton jButtonGuardarCambiosToolBarDireccion;
	protected JButton jButtonGuardarCambiosTablaToolBarDireccion;
	protected JButton jButtonMostrarOcultarTablaToolBarDireccion;
	protected JButton jButtonCerrarToolBarDireccion;
	
	protected JButton jButtonProcesarInformacionToolBarDireccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDireccion;
	protected JMenuItem jMenuItemModificarDireccion;
	protected JMenuItem jMenuItemActualizarDireccion;
    protected JMenuItem jMenuItemEliminarDireccion;
	protected JMenuItem jMenuItemCancelarDireccion;
    protected JMenuItem jMenuItemGuardarCambiosDireccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDireccion;
	protected JMenuItem jMenuItemCerrarDireccion;
	protected JMenuItem jMenuItemDetalleCerrarDireccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDireccion;
	
	protected JMenuItem jMenuItemProcesarInformacionDireccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDireccion;
	protected JMenuItem jMenuItemMostrarOcultarDireccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDireccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDireccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDireccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDireccion;
	public JLabel jLabelIdDireccion;
	public JLabel jLabelidDireccion;
	public JButton jButtonidDireccionBusqueda= new JButtonMe();

	public JPanel jPanelsectorDireccion;
	public JLabel jLabelsectorDireccion;
	public JTextArea jTextAreasectorDireccion;
	public JScrollPane jscrollPanesectorDireccion;
	public JButton jButtonsectorDireccionBusqueda= new JButtonMe();

	public JPanel jPanelbarrioDireccion;
	public JLabel jLabelbarrioDireccion;
	public JTextArea jTextAreabarrioDireccion;
	public JScrollPane jscrollPanebarrioDireccion;
	public JButton jButtonbarrioDireccionBusqueda= new JButtonMe();

	public JPanel jPanelcallesDireccion;
	public JLabel jLabelcallesDireccion;
	public JTextArea jTextAreacallesDireccion;
	public JScrollPane jscrollPanecallesDireccion;
	public JButton jButtoncallesDireccionBusqueda= new JButtonMe();

	public JPanel jPanelaseguradaDireccion;
	public JLabel jLabelaseguradaDireccion;
	public JTextArea jTextAreaaseguradaDireccion;
	public JScrollPane jscrollPaneaseguradaDireccion;
	public JButton jButtonaseguradaDireccionBusqueda= new JButtonMe();

	public JPanel jPaneldireccionDireccion;
	public JLabel jLabeldireccionDireccion;
	public JTextArea jTextAreadireccionDireccion;
	public JScrollPane jscrollPanedireccionDireccion;
	public JButton jButtondireccionDireccionBusqueda= new JButtonMe();

	public JPanel jPanelesactivoDireccion;
	public JLabel jLabelesactivoDireccion;
	public JCheckBox jCheckBoxesactivoDireccion;
	public JButton jButtonesactivoDireccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDireccion;
	public JLabel jLabelid_empresaDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDireccion;
	public JButton jButtonid_empresaDireccion= new JButtonMe();
	public JButton jButtonid_empresaDireccionUpdate= new JButtonMe();
	public JButton jButtonid_empresaDireccionBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDireccion;
	public JLabel jLabelid_clienteDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDireccion;
	public JButton jButtonid_clienteDireccion= new JButtonMe();
	public JButton jButtonid_clienteDireccionUpdate= new JButtonMe();
	public JButton jButtonid_clienteDireccionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_direccionDireccion;
	public JLabel jLabelid_tipo_direccionDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_direccionDireccion;
	public JButton jButtonid_tipo_direccionDireccion= new JButtonMe();
	public JButton jButtonid_tipo_direccionDireccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_direccionDireccionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_viviendaDireccion;
	public JLabel jLabelid_tipo_viviendaDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_viviendaDireccion;
	public JButton jButtonid_tipo_viviendaDireccion= new JButtonMe();
	public JButton jButtonid_tipo_viviendaDireccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_viviendaDireccionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDireccion;
	
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
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DireccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDireccion=new JPanel();
				this.jPanelAccionesFormularioDireccion=new JPanel();
				this.jmenuBarDetalleDireccion=new JMenuBar();
				this.jTtoolBarDetalleDireccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DireccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDireccion() {
		return this.jButtonActualizarToolBarDireccion;
	}
	
	public JButton getjButtonEliminarToolBarDireccion() {
		return this.jButtonEliminarToolBarDireccion;
	}
	
	public JButton getjButtonCancelarToolBarDireccion() {
		return this.jButtonCancelarToolBarDireccion;
	}		
	
	public JButton getjButtonProcesarInformacionDireccion() {
		return this.jButtonProcesarInformacionDireccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDireccion)	{
		this.jButtonProcesarInformacionDireccion = jButtonProcesarInformacionDireccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDireccion() {
		return this.jComboBoxTiposAccionesDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDireccion(
			JComboBox jComboBoxTiposRelacionesDireccion) {
		this.jComboBoxTiposRelacionesDireccion = jComboBoxTiposRelacionesDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDireccion(
			JComboBox jComboBoxTiposAccionesDireccion) {
		this.jComboBoxTiposAccionesDireccion = jComboBoxTiposAccionesDireccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDireccion() {
		return this.jComboBoxTiposAccionesFormularioDireccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDireccion(
			JComboBox jComboBoxTiposAccionesFormularioDireccion) {
		this.jComboBoxTiposAccionesFormularioDireccion = jComboBoxTiposAccionesFormularioDireccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.direccionSessionBean=new DireccionSessionBean();
		
		this.direccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.direccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.direccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DireccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DireccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Direccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
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
	
		DireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDireccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDireccion=new JButtonMe();
				this.jButtonModificarToolBarDireccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDireccion,this.jTtoolBarDetalleDireccion,
							"actualizar","actualizar","Actualizar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDireccion,this.jTtoolBarDetalleDireccion,
							"eliminar","eliminar","Eliminar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDireccion,this.jTtoolBarDetalleDireccion,
							"cancelar","cancelar","Cancelar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDireccion,this.jTtoolBarDetalleDireccion,
							"guardarcambios","guardarcambios","Guardar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDireccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDireccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDireccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDireccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDireccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDireccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDireccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDireccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDireccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDireccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDireccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDireccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDireccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDireccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDireccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDireccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDireccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDireccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDireccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDireccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDireccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDireccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDireccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDireccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDireccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDireccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDireccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDireccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDireccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDireccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDireccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDireccion.add(this.jMenuItemDetalleCerrarDireccion);
		
		this.jmenuDetalleAccionesDireccion.add(this.jMenuItemActualizarDireccion);
		this.jmenuDetalleAccionesDireccion.add(this.jMenuItemEliminarDireccion);
		this.jmenuDetalleAccionesDireccion.add(this.jMenuItemCancelarDireccion);		
		
		//this.jmenuDetalleDatosDireccion.add(this.jMenuItemDetalleAbrirOrderByDireccion);				
		this.jmenuDetalleDatosDireccion.add(this.jMenuItemDetalleMostarOcultarDireccion);				
				
		//this.jmenuDetalleAccionesDireccion.add(this.jMenuItemGuardarCambiosDireccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDireccion.add(this.jmenuDetalleArchivoDireccion);		
		this.jmenuBarDetalleDireccion.add(this.jmenuDetalleAccionesDireccion);		
		this.jmenuBarDetalleDireccion.add(this.jmenuDetalleDatosDireccion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDireccion);				
	}
	
	
	public void inicializarElementosCamposDireccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDireccion = new JLabelMe();
		jLabelIdDireccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDireccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDireccion= new GridBagLayout();

		this.jPanelidDireccion.setLayout(this.gridaBagLayoutDireccion);

		jLabelidDireccion = new JLabel();
		jLabelidDireccion.setText("Id");

		jLabelidDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsectorDireccion = new JLabelMe();
		this.jLabelsectorDireccion.setText(""+DireccionConstantesFunciones.LABEL_SECTOR+" : *");
		this.jLabelsectorDireccion.setToolTipText("Sector");
		this.jLabelsectorDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsectorDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsectorDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsectorDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsectorDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsectorDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_SECTOR);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelsectorDireccion.setLayout(this.gridaBagLayoutDireccion);


		jTextAreasectorDireccion= new JTextAreaMe();
		jTextAreasectorDireccion.setEnabled(false);
		jTextAreasectorDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasectorDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasectorDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasectorDireccion.setLineWrap(true);
		jTextAreasectorDireccion.setWrapStyleWord(true);
		jTextAreasectorDireccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasectorDireccion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreasectorDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesectorDireccion = new JScrollPane(jTextAreasectorDireccion);
		jscrollPanesectorDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanesectorDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanesectorDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonsectorDireccionBusqueda= new JButtonMe();
		this.jButtonsectorDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsectorDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsectorDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsectorDireccionBusqueda.setText("U");
		this.jButtonsectorDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsectorDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsectorDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasectorDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasectorDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sectorDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsectorDireccionBusqueda.setVisible(false);		}


					
		this.jLabelbarrioDireccion = new JLabelMe();
		this.jLabelbarrioDireccion.setText(""+DireccionConstantesFunciones.LABEL_BARRIO+" : *");
		this.jLabelbarrioDireccion.setToolTipText("Barrio");
		this.jLabelbarrioDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbarrioDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbarrioDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbarrioDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbarrioDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbarrioDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_BARRIO);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelbarrioDireccion.setLayout(this.gridaBagLayoutDireccion);


		jTextAreabarrioDireccion= new JTextAreaMe();
		jTextAreabarrioDireccion.setEnabled(false);
		jTextAreabarrioDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabarrioDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabarrioDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabarrioDireccion.setLineWrap(true);
		jTextAreabarrioDireccion.setWrapStyleWord(true);
		jTextAreabarrioDireccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabarrioDireccion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabarrioDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebarrioDireccion = new JScrollPane(jTextAreabarrioDireccion);
		jscrollPanebarrioDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebarrioDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebarrioDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbarrioDireccionBusqueda= new JButtonMe();
		this.jButtonbarrioDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbarrioDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbarrioDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbarrioDireccionBusqueda.setText("U");
		this.jButtonbarrioDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbarrioDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbarrioDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabarrioDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabarrioDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"barrioDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbarrioDireccionBusqueda.setVisible(false);		}


					
		this.jLabelcallesDireccion = new JLabelMe();
		this.jLabelcallesDireccion.setText(""+DireccionConstantesFunciones.LABEL_CALLES+" : *");
		this.jLabelcallesDireccion.setToolTipText("Calles");
		this.jLabelcallesDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcallesDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcallesDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcallesDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcallesDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcallesDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_CALLES);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelcallesDireccion.setLayout(this.gridaBagLayoutDireccion);


		jTextAreacallesDireccion= new JTextAreaMe();
		jTextAreacallesDireccion.setEnabled(false);
		jTextAreacallesDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacallesDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacallesDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacallesDireccion.setLineWrap(true);
		jTextAreacallesDireccion.setWrapStyleWord(true);
		jTextAreacallesDireccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacallesDireccion.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreacallesDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecallesDireccion = new JScrollPane(jTextAreacallesDireccion);
		jscrollPanecallesDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecallesDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecallesDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtoncallesDireccionBusqueda= new JButtonMe();
		this.jButtoncallesDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncallesDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncallesDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncallesDireccionBusqueda.setText("U");
		this.jButtoncallesDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncallesDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncallesDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacallesDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacallesDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"callesDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncallesDireccionBusqueda.setVisible(false);		}


					
		this.jLabelaseguradaDireccion = new JLabelMe();
		this.jLabelaseguradaDireccion.setText(""+DireccionConstantesFunciones.LABEL_ASEGURADA+" : *");
		this.jLabelaseguradaDireccion.setToolTipText("Asegurada");
		this.jLabelaseguradaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaseguradaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaseguradaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaseguradaDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaseguradaDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaseguradaDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_ASEGURADA);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelaseguradaDireccion.setLayout(this.gridaBagLayoutDireccion);


		jTextAreaaseguradaDireccion= new JTextAreaMe();
		jTextAreaaseguradaDireccion.setEnabled(false);
		jTextAreaaseguradaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaseguradaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaseguradaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaseguradaDireccion.setLineWrap(true);
		jTextAreaaseguradaDireccion.setWrapStyleWord(true);
		jTextAreaaseguradaDireccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaaseguradaDireccion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaaseguradaDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneaseguradaDireccion = new JScrollPane(jTextAreaaseguradaDireccion);
		jscrollPaneaseguradaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneaseguradaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneaseguradaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonaseguradaDireccionBusqueda= new JButtonMe();
		this.jButtonaseguradaDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaseguradaDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaseguradaDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaseguradaDireccionBusqueda.setText("U");
		this.jButtonaseguradaDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaseguradaDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaseguradaDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaaseguradaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaaseguradaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aseguradaDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaseguradaDireccionBusqueda.setVisible(false);		}


					
		this.jLabeldireccionDireccion = new JLabelMe();
		this.jLabeldireccionDireccion.setText(""+DireccionConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionDireccion.setToolTipText("Direccion");
		this.jLabeldireccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPaneldireccionDireccion.setLayout(this.gridaBagLayoutDireccion);


		jTextAreadireccionDireccion= new JTextAreaMe();
		jTextAreadireccionDireccion.setEnabled(false);
		jTextAreadireccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDireccion.setLineWrap(true);
		jTextAreadireccionDireccion.setWrapStyleWord(true);
		jTextAreadireccionDireccion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionDireccion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionDireccion = new JScrollPane(jTextAreadireccionDireccion);
		jscrollPanedireccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionDireccionBusqueda= new JButtonMe();
		this.jButtondireccionDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionDireccionBusqueda.setText("U");
		this.jButtondireccionDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionDireccionBusqueda.setVisible(false);		}


					
		this.jLabelesactivoDireccion = new JLabelMe();
		this.jLabelesactivoDireccion.setText(""+DireccionConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoDireccion.setToolTipText("Es Activo");
		this.jLabelesactivoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelesactivoDireccion.setLayout(this.gridaBagLayoutDireccion);


		jCheckBoxesactivoDireccion= new JCheckBoxMe();
		jCheckBoxesactivoDireccion.setEnabled(false);

		jCheckBoxesactivoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoDireccionBusqueda= new JButtonMe();
		this.jButtonesactivoDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoDireccionBusqueda.setText("U");
		this.jButtonesactivoDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoDireccionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDireccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDireccion = new JLabelMe();
		this.jLabelid_empresaDireccion.setText(""+DireccionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDireccion.setToolTipText("Empresa");
		this.jLabelid_empresaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelid_empresaDireccion.setLayout(this.gridaBagLayoutDireccion);


		jComboBoxid_empresaDireccion= new JComboBoxMe();
		jComboBoxid_empresaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDireccion.setEnabled(false);

		this.jButtonid_empresaDireccion= new JButtonMe();
		this.jButtonid_empresaDireccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDireccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDireccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDireccion.setText("Buscar");
		this.jButtonid_empresaDireccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDireccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDireccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDireccion"));

		this.jButtonid_empresaDireccionBusqueda= new JButtonMe();
		this.jButtonid_empresaDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDireccionBusqueda.setText("U");
		this.jButtonid_empresaDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDireccionBusqueda.setVisible(false);		}

		this.jButtonid_empresaDireccionUpdate= new JButtonMe();
		this.jButtonid_empresaDireccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDireccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDireccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDireccionUpdate.setText("U");
		this.jButtonid_empresaDireccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDireccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDireccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDireccionUpdate"));



					
		this.jLabelid_clienteDireccion = new JLabelMe();
		this.jLabelid_clienteDireccion.setText(""+DireccionConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDireccion.setToolTipText("Cliente");
		this.jLabelid_clienteDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelid_clienteDireccion.setLayout(this.gridaBagLayoutDireccion);


		jComboBoxid_clienteDireccion= new JComboBoxMe();
		jComboBoxid_clienteDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDireccion= new JButtonMe();
		this.jButtonid_clienteDireccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDireccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDireccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDireccion.setText("Buscar");
		this.jButtonid_clienteDireccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDireccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDireccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDireccion"));

		this.jButtonid_clienteDireccionBusqueda= new JButtonMe();
		this.jButtonid_clienteDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDireccionBusqueda.setText("U");
		this.jButtonid_clienteDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDireccionBusqueda.setVisible(false);		}

		this.jButtonid_clienteDireccionUpdate= new JButtonMe();
		this.jButtonid_clienteDireccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDireccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDireccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDireccionUpdate.setText("U");
		this.jButtonid_clienteDireccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDireccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDireccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDireccionUpdate"));



					
		this.jLabelid_tipo_direccionDireccion = new JLabelMe();
		this.jLabelid_tipo_direccionDireccion.setText(""+DireccionConstantesFunciones.LABEL_IDTIPODIRECCION+" : *");
		this.jLabelid_tipo_direccionDireccion.setToolTipText("Tipo Direccion");
		this.jLabelid_tipo_direccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_direccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_direccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_direccionDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_direccionDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_direccionDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_IDTIPODIRECCION);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelid_tipo_direccionDireccion.setLayout(this.gridaBagLayoutDireccion);


		jComboBoxid_tipo_direccionDireccion= new JComboBoxMe();
		jComboBoxid_tipo_direccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_direccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_direccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_direccionDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_direccionDireccion= new JButtonMe();
		this.jButtonid_tipo_direccionDireccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_direccionDireccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_direccionDireccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_direccionDireccion.setText("Buscar");
		this.jButtonid_tipo_direccionDireccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_direccionDireccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_direccionDireccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_direccionDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_direccionDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_direccionDireccion"));

		this.jButtonid_tipo_direccionDireccionBusqueda= new JButtonMe();
		this.jButtonid_tipo_direccionDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_direccionDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_direccionDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_direccionDireccionBusqueda.setText("U");
		this.jButtonid_tipo_direccionDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_direccionDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_direccionDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_direccionDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_direccionDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_direccionDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_direccionDireccionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_direccionDireccionUpdate= new JButtonMe();
		this.jButtonid_tipo_direccionDireccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_direccionDireccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_direccionDireccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_direccionDireccionUpdate.setText("U");
		this.jButtonid_tipo_direccionDireccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_direccionDireccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_direccionDireccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_direccionDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_direccionDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_direccionDireccionUpdate"));



					
		this.jLabelid_tipo_viviendaDireccion = new JLabelMe();
		this.jLabelid_tipo_viviendaDireccion.setText(""+DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA+" : *");
		this.jLabelid_tipo_viviendaDireccion.setToolTipText("Tipo Vivienda");
		this.jLabelid_tipo_viviendaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_viviendaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_viviendaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_viviendaDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_viviendaDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_viviendaDireccion.setToolTipText(DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA);
		this.gridaBagLayoutDireccion = new GridBagLayout();
		this.jPanelid_tipo_viviendaDireccion.setLayout(this.gridaBagLayoutDireccion);


		jComboBoxid_tipo_viviendaDireccion= new JComboBoxMe();
		jComboBoxid_tipo_viviendaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_viviendaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_viviendaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_viviendaDireccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_viviendaDireccion= new JButtonMe();
		this.jButtonid_tipo_viviendaDireccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_viviendaDireccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_viviendaDireccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_viviendaDireccion.setText("Buscar");
		this.jButtonid_tipo_viviendaDireccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_viviendaDireccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_viviendaDireccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_viviendaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_viviendaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_viviendaDireccion"));

		this.jButtonid_tipo_viviendaDireccionBusqueda= new JButtonMe();
		this.jButtonid_tipo_viviendaDireccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_viviendaDireccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_viviendaDireccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_viviendaDireccionBusqueda.setText("U");
		this.jButtonid_tipo_viviendaDireccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_viviendaDireccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_viviendaDireccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_viviendaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_viviendaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_viviendaDireccionBusqueda"));

		if(this.direccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_viviendaDireccionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_viviendaDireccionUpdate= new JButtonMe();
		this.jButtonid_tipo_viviendaDireccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_viviendaDireccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_viviendaDireccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_viviendaDireccionUpdate.setText("U");
		this.jButtonid_tipo_viviendaDireccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_viviendaDireccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_viviendaDireccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_viviendaDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_viviendaDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_viviendaDireccionUpdate"));



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
		//this.jInternalFrameDetalleDireccion = new DireccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Direccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDireccion= new GridBagLayout();
		

		
		String sToolTipDireccion="";
		sToolTipDireccion=DireccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDireccion+="(Cartera.Direccion)";
		}
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDireccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDireccion = new JButtonMe();
		this.jButtonModificarDireccion = new JButtonMe();
        this.jButtonActualizarDireccion = new JButtonMe();
        this.jButtonEliminarDireccion = new JButtonMe();
        this.jButtonCancelarDireccion = new JButtonMe();
        this.jButtonGuardarCambiosDireccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaDireccion = new JButtonMe();
		this.jButtonCerrarDireccion = new JButtonMe();
		
		this.jScrollPanelDatosDireccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionDireccion = new JScrollPane();
		this.jScrollPanelDatosGeneralDireccion = new JScrollPane();
				
		
		
		this.jPanelCamposDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Direccion";
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Direcciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDireccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDireccion.setName("jPanelCamposDireccion"); 

		this.jPanelCamposOcultosDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDireccion.setName("jPanelCamposOcultosDireccion"); 

        this.jPanelAccionesDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDireccion.setToolTipText("Acciones");
        this.jPanelAccionesDireccion.setName("Acciones"); 

		this.jPanelAccionesFormularioDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDireccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDireccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDireccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDireccion.setText("Nuevo");
		this.jButtonModificarDireccion.setText("Editar");
        this.jButtonActualizarDireccion.setText("Actualizar");
        this.jButtonEliminarDireccion.setText("Eliminar");
        this.jButtonCancelarDireccion.setText("Cancelar");
        this.jButtonGuardarCambiosDireccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaDireccion.setText("Guardar");
		this.jButtonCerrarDireccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDireccion,"nuevo_button","Nuevo",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDireccion,"modificar_button","Editar",this.direccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDireccion,"actualizar_button","Actualizar",this.direccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDireccion,"eliminar_button","Eliminar",this.direccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDireccion,"cancelar_button","Cancelar",this.direccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDireccion,"guardarcambios_button","Guardar",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDireccion,"guardarcambiostabla_button","Guardar",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDireccion,"cerrar_button","Salir",this.direccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDireccion.setToolTipText("Nuevo"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDireccion.setToolTipText("Editar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDireccion.setToolTipText("Actualizar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDireccion.setToolTipText("Eliminar)"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDireccion.setToolTipText("Cancelar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDireccion.setToolTipText("Guardar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDireccion.setToolTipText("Guardar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDireccion.setToolTipText("Salir"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDireccion";
		inputMap = this.jButtonNuevoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDireccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDireccion";
		inputMap = this.jButtonActualizarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDireccion"));
		
		//ELIMINAR
		sMapKey = "EliminarDireccion";
		inputMap = this.jButtonEliminarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDireccion"));
		
		//CANCELAR	
		sMapKey = "CancelarDireccion";
		inputMap = this.jButtonCancelarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDireccion"));
		
		//CERRAR		
		sMapKey = "CerrarDireccion";
		inputMap = this.jButtonCerrarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDireccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDireccion";
		inputMap = this.jButtonGuardarCambiosTablaDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDireccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDireccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDireccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDireccion.setToolTipText("Nuevo Direccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDireccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDireccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDireccion.setToolTipText("Sin Cerrar Ventana Direccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDireccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDireccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDireccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDireccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDireccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDireccion.setText("Accion");
		this.jComboBoxTiposAccionesDireccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDireccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDireccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDireccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDireccion = new JLabelMe();
		
		this.jLabelAccionesDireccion.setText("Acciones");		
		this.jLabelAccionesDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDireccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDireccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDireccion=new JTabbedPane();
		this.jTabbedPaneRelacionesDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDireccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDireccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDireccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDireccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDireccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDireccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDireccion = new GridBagLayout();
		
		this.jPanelCamposDireccion.setLayout(gridaBagLayoutCamposDireccion);
		this.jPanelCamposOcultosDireccion.setLayout(gridaBagLayoutCamposOcultosDireccion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDireccion.add(jLabelIdDireccion, this.gridBagConstraintsDireccion);



	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDireccion.add(jLabelidDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDireccion.add(jLabelid_empresaDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDireccion.add(jButtonid_empresaDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 3;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDireccion.add(jButtonid_empresaDireccionUpdate, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDireccion.add(jComboBoxid_empresaDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteDireccion.add(jLabelid_clienteDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 2;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDireccion.add(jButtonid_clienteDireccion, this.gridBagConstraintsDireccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 3;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDireccion.add(jButtonid_clienteDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 4;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDireccion.add(jButtonid_clienteDireccionUpdate, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteDireccion.add(jComboBoxid_clienteDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_direccionDireccion.add(jLabelid_tipo_direccionDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_direccionDireccion.add(jButtonid_tipo_direccionDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 3;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_direccionDireccion.add(jButtonid_tipo_direccionDireccionUpdate, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_direccionDireccion.add(jComboBoxid_tipo_direccionDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_viviendaDireccion.add(jLabelid_tipo_viviendaDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_viviendaDireccion.add(jButtonid_tipo_viviendaDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 3;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_viviendaDireccion.add(jButtonid_tipo_viviendaDireccionUpdate, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_viviendaDireccion.add(jComboBoxid_tipo_viviendaDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsectorDireccion.add(jLabelsectorDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsectorDireccion.add(jButtonsectorDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsectorDireccion.add(jscrollPanesectorDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbarrioDireccion.add(jLabelbarrioDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelbarrioDireccion.add(jButtonbarrioDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbarrioDireccion.add(jscrollPanebarrioDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcallesDireccion.add(jLabelcallesDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcallesDireccion.add(jButtoncallesDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcallesDireccion.add(jscrollPanecallesDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaseguradaDireccion.add(jLabelaseguradaDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelaseguradaDireccion.add(jButtonaseguradaDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaseguradaDireccion.add(jscrollPaneaseguradaDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionDireccion.add(jLabeldireccionDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionDireccion.add(jButtondireccionDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionDireccion.add(jscrollPanedireccionDireccion, this.gridBagConstraintsDireccion);


	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 0;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoDireccion.add(jLabelesactivoDireccion, this.gridBagConstraintsDireccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 2;
		this.gridBagConstraintsDireccion.ipadx = 0;
		this.gridBagConstraintsDireccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoDireccion.add(jButtonesactivoDireccionBusqueda, this.gridBagConstraintsDireccion);
	}

	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDireccion.gridy = 0;
	this.gridBagConstraintsDireccion.gridx = 1;
	this.gridBagConstraintsDireccion.ipadx = 0;
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoDireccion.add(jCheckBoxesactivoDireccion, this.gridBagConstraintsDireccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelidDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelid_clienteDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelid_tipo_direccionDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelid_tipo_viviendaDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelsectorDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelbarrioDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelcallesDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelaseguradaDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPaneldireccionDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDireccion.add(this.jPanelesactivoDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposDireccion % 1==0) {
		iXPanelCamposDireccion=0;
		iYPanelCamposDireccion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDireccion = new GridBagConstraints();
	this.gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDireccion.gridy = iYPanelCamposOcultosDireccion;
	this.gridBagConstraintsDireccion.gridx = iXPanelCamposOcultosDireccion++;
	this.gridBagConstraintsDireccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDireccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDireccion.add(this.jPanelid_empresaDireccion, this.gridBagConstraintsDireccion);



	if(iXPanelCamposOcultosDireccion % 1==0) {
		iXPanelCamposOcultosDireccion=0;
		iYPanelCamposOcultosDireccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesDireccion= new GridBagLayout();
		this.jPanelAccionesDireccion.setLayout(gridaBagLayoutAccionesDireccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDireccion= new GridBagLayout();
		this.jPanelAccionesFormularioDireccion.setLayout(gridaBagLayoutAccionesFormularioDireccion);
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDireccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDireccion.add(this.jComboBoxTiposAccionesFormularioDireccion, this.gridBagConstraintsDireccion);

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDireccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDireccion.add(this.jCheckBoxPostAccionNuevoDireccion, this.gridBagConstraintsDireccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.direccionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDireccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDireccion.add(this.jCheckBoxPostAccionSinCerrarDireccion, this.gridBagConstraintsDireccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.direccionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.direccionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDireccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDireccion.add(this.jCheckBoxPostAccionSinMensajeDireccion, this.gridBagConstraintsDireccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesDireccion.add(this.jButtonModificarDireccion, this.gridBagConstraintsDireccion);							

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesDireccion.add(this.jButtonEliminarDireccion, this.gridBagConstraintsDireccion);
		
			
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = 0;		
		this.gridBagConstraintsDireccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDireccion.add(this.jButtonActualizarDireccion, this.gridBagConstraintsDireccion);


		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = 0;		
		this.gridBagConstraintsDireccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDireccion.add(this.jButtonGuardarCambiosDireccion, this.gridBagConstraintsDireccion);	
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = 0;		
		this.gridBagConstraintsDireccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesDireccion.add(this.jButtonCancelarDireccion, this.gridBagConstraintsDireccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDireccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDireccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.direccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDireccion = new GridBagConstraints();						
			this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDireccion.gridx = 0;		
			//this.gridBagConstraintsDireccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDireccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDireccion.gridx =0;
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDireccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDireccion, this.gridBagConstraintsDireccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DireccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDireccion = new DireccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Direccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Direccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Direccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DireccionModel direccionModel=new DireccionModel(this);
			
			//SI USARA CLASE INTERNA
			//DireccionModel.DireccionFocusTraversalPolicy direccionFocusTraversalPolicy = direccionModel.new DireccionFocusTraversalPolicy(this);
			
			//direccionFocusTraversalPolicy.setdireccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(direccionModel);
			
			
			this.jContentPaneDetalleDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDireccion = new GridBagLayout();	
			this.jContentPaneDetalleDireccion.setLayout(gridaBagLayoutDetalleDireccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDireccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDireccion = new GridBagConstraints();
				this.gridBagConstraintsDireccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDireccion.gridx = 0;
					
				
				this.jContentPaneDetalleDireccion.add(jTtoolBarDetalleDireccion, gridBagConstraintsDireccion);								
				
}
			
			this.jScrollPanelDatosEdicionDireccion=   new JScrollPane(jContentPaneDetalleDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDireccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDireccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDireccion.gridx = 0;
	        
			this.jContentPaneDetalleDireccion.add(jPanelCamposDireccion, gridBagConstraintsDireccion);
			
			
			
			
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
						&& direccionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.direccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDireccion= new GridBagConstraints();
						this.gridBagConstraintsDireccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDireccion.gridx = 0;
						this.jContentPaneDetalleDireccion.add(this.jTabbedPaneRelacionesDireccion, this.gridBagConstraintsDireccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDireccion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDireccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDireccion = new GridBagConstraints();
					this.gridBagConstraintsDireccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDireccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDireccion.gridx = 0;
					
				
					this.jContentPaneDetalleDireccion.add(jPanelCamposOcultosDireccion, gridBagConstraintsDireccion);
				
					this.jPanelCamposOcultosDireccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDireccion.gridx = 0;
	        this.gridBagConstraintsDireccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDireccion.add(this.jPanelAccionesFormularioDireccion, this.gridBagConstraintsDireccion);							
			
			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
	        this.gridBagConstraintsDireccion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDireccion.gridx = 0;
	        
			
			this.jContentPaneDetalleDireccion.add(this.jPanelAccionesDireccion, this.gridBagConstraintsDireccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDireccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDireccion=   new JScrollPane(this.jPanelCamposDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDireccion.gridx = 0;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDireccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDireccion, this.gridBagConstraintsDireccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDireccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDireccion, this.gridBagConstraintsDireccion);			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDireccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDireccion, this.gridBagConstraintsDireccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDireccion, this.gridBagConstraintsDireccion);
			
			
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDireccion, this.gridBagConstraintsDireccion);
		
			
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDireccion, this.gridBagConstraintsDireccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDireccion;//jContentPane;
		
		return jScrollPanelDatosEdicionDireccion;
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
