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
import com.bydan.erp.nomina.util.EmpleadoDiscaConstantesFunciones;

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
public class EmpleadoDiscaDetalleFormJInternalFrame extends EmpleadoDiscaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoDisca;
	
	protected JMenuBar jmenuBarDetalleEmpleadoDisca;
	
	protected JMenu jmenuDetalleEmpleadoDisca;
	protected JMenu jmenuDetalleArchivoEmpleadoDisca;
	protected JMenu jmenuDetalleAccionesEmpleadoDisca;
	protected JMenu jmenuDetalleDatosEmpleadoDisca;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoDisca;	
	protected GridBagConstraints gridBagConstraintsEmpleadoDisca;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoDiscaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoDisca;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoDiscapacidadBeanSwingJInternalFrame tipodiscapacidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodiscapacidad="";
	
	public EmpleadoDiscaSessionBean empleadodiscaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoDiscapacidadSessionBean tipodiscapacidadSessionBean;	
	
	public EmpleadoDiscaLogic empleadodiscaLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoDisca;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoDisca;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoDisca;
	
	protected JPanel jPanelCamposEmpleadoDisca;    
	protected JPanel jPanelCamposOcultosEmpleadoDisca;    	
	protected JPanel jPanelAccionesEmpleadoDisca;
	protected JPanel jPanelAccionesFormularioEmpleadoDisca;
    
	
	
	protected Integer iXPanelCamposEmpleadoDisca=0;
	protected Integer iYPanelCamposEmpleadoDisca=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoDisca=0;
	protected Integer iYPanelCamposOcultosEmpleadoDisca=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoDisca;
	public JButton jButtonModificarEmpleadoDisca;
	public JButton jButtonActualizarEmpleadoDisca;
    public JButton jButtonEliminarEmpleadoDisca;
	public JButton jButtonCancelarEmpleadoDisca;
    public JButton jButtonGuardarCambiosEmpleadoDisca;
	public JButton jButtonGuardarCambiosTablaEmpleadoDisca;
	protected JButton jButtonCerrarEmpleadoDisca;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoDisca;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoDisca;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoDisca;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoDisca;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoDisca;
	protected JButton jButtonModificarToolBarEmpleadoDisca;
	protected JButton jButtonActualizarToolBarEmpleadoDisca;
    protected JButton jButtonEliminarToolBarEmpleadoDisca;
	protected JButton jButtonCancelarToolBarEmpleadoDisca;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoDisca;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoDisca;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoDisca;
	protected JButton jButtonCerrarToolBarEmpleadoDisca;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoDisca;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoDisca;
	protected JMenuItem jMenuItemModificarEmpleadoDisca;
	protected JMenuItem jMenuItemActualizarEmpleadoDisca;
    protected JMenuItem jMenuItemEliminarEmpleadoDisca;
	protected JMenuItem jMenuItemCancelarEmpleadoDisca;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoDisca;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoDisca;
	protected JMenuItem jMenuItemCerrarEmpleadoDisca;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoDisca;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoDisca;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoDisca;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoDisca;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoDisca;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoDisca;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoDisca;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoDisca;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoDisca;
	public JLabel jLabelIdEmpleadoDisca;
	public JLabel jLabelidEmpleadoDisca;
	public JButton jButtonidEmpleadoDiscaBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_inicialEmpleadoDisca;
	public JLabel jLabelporcentaje_inicialEmpleadoDisca;
	public JTextField jTextFieldporcentaje_inicialEmpleadoDisca;
	public JButton jButtonporcentaje_inicialEmpleadoDiscaBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_finalEmpleadoDisca;
	public JLabel jLabelporcentaje_finalEmpleadoDisca;
	public JTextField jTextFieldporcentaje_finalEmpleadoDisca;
	public JButton jButtonporcentaje_finalEmpleadoDiscaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEmpleadoDisca;
	public JLabel jLabeldescripcionEmpleadoDisca;
	public JTextArea jTextAreadescripcionEmpleadoDisca;
	public JScrollPane jscrollPanedescripcionEmpleadoDisca;
	public JButton jButtondescripcionEmpleadoDiscaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoDisca;
	public JLabel jLabelid_empresaEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoDisca;
	public JButton jButtonid_empresaEmpleadoDisca= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoDiscaUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoDiscaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoDisca;
	public JLabel jLabelid_empleadoEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoDisca;
	public JButton jButtonid_empleadoEmpleadoDisca= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoDiscaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoDiscaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_discapacidadEmpleadoDisca;
	public JLabel jLabelid_tipo_discapacidadEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_discapacidadEmpleadoDisca;
	public JButton jButtonid_tipo_discapacidadEmpleadoDisca= new JButtonMe();
	public JButton jButtonid_tipo_discapacidadEmpleadoDiscaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoDisca;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoDiscaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoDisca=new JPanel();
				this.jPanelAccionesFormularioEmpleadoDisca=new JPanel();
				this.jmenuBarDetalleEmpleadoDisca=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoDisca=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoDiscaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoDisca() {
		return this.jButtonActualizarToolBarEmpleadoDisca;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoDisca() {
		return this.jButtonEliminarToolBarEmpleadoDisca;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoDisca() {
		return this.jButtonCancelarToolBarEmpleadoDisca;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoDisca() {
		return this.jButtonProcesarInformacionEmpleadoDisca;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoDisca)	{
		this.jButtonProcesarInformacionEmpleadoDisca = jButtonProcesarInformacionEmpleadoDisca;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoDisca() {
		return this.jComboBoxTiposAccionesEmpleadoDisca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoDisca(
			JComboBox jComboBoxTiposRelacionesEmpleadoDisca) {
		this.jComboBoxTiposRelacionesEmpleadoDisca = jComboBoxTiposRelacionesEmpleadoDisca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoDisca(
			JComboBox jComboBoxTiposAccionesEmpleadoDisca) {
		this.jComboBoxTiposAccionesEmpleadoDisca = jComboBoxTiposAccionesEmpleadoDisca;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoDisca() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoDisca;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoDisca(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoDisca) {
		this.jComboBoxTiposAccionesFormularioEmpleadoDisca = jComboBoxTiposAccionesFormularioEmpleadoDisca;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		
		this.empleadodiscaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadodiscaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadodiscaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoDiscaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Disca MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoDisca= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoDisca=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoDisca=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoDisca,this.jTtoolBarDetalleEmpleadoDisca,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoDisca,this.jTtoolBarDetalleEmpleadoDisca,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoDisca,this.jTtoolBarDetalleEmpleadoDisca,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoDisca,this.jTtoolBarDetalleEmpleadoDisca,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoDisca=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoDisca=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoDisca=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoDisca=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoDisca=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoDisca= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoDisca.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoDisca,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoDisca= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoDisca.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoDisca,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoDisca= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoDisca.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoDisca,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoDisca= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoDisca.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoDisca,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoDisca= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoDisca.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoDisca,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoDisca= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoDisca.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoDisca,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoDisca= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoDisca.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoDisca,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoDisca= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoDisca.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoDisca,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoDisca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoDisca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoDisca,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoDisca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoDisca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoDisca,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoDisca.add(this.jMenuItemDetalleCerrarEmpleadoDisca);
		
		this.jmenuDetalleAccionesEmpleadoDisca.add(this.jMenuItemActualizarEmpleadoDisca);
		this.jmenuDetalleAccionesEmpleadoDisca.add(this.jMenuItemEliminarEmpleadoDisca);
		this.jmenuDetalleAccionesEmpleadoDisca.add(this.jMenuItemCancelarEmpleadoDisca);		
		
		//this.jmenuDetalleDatosEmpleadoDisca.add(this.jMenuItemDetalleAbrirOrderByEmpleadoDisca);				
		this.jmenuDetalleDatosEmpleadoDisca.add(this.jMenuItemDetalleMostarOcultarEmpleadoDisca);				
				
		//this.jmenuDetalleAccionesEmpleadoDisca.add(this.jMenuItemGuardarCambiosEmpleadoDisca);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoDisca.add(this.jmenuDetalleArchivoEmpleadoDisca);		
		this.jmenuBarDetalleEmpleadoDisca.add(this.jmenuDetalleAccionesEmpleadoDisca);		
		this.jmenuBarDetalleEmpleadoDisca.add(this.jmenuDetalleDatosEmpleadoDisca);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoDisca);				
	}
	
	
	public void inicializarElementosCamposEmpleadoDisca() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoDisca = new JLabelMe();
		jLabelIdEmpleadoDisca.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoDisca = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoDisca= new GridBagLayout();

		this.jPanelidEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);

		jLabelidEmpleadoDisca = new JLabel();
		jLabelidEmpleadoDisca.setText("Id");

		jLabelidEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentaje_inicialEmpleadoDisca = new JLabelMe();
		this.jLabelporcentaje_inicialEmpleadoDisca.setText(""+EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL+" : *");
		this.jLabelporcentaje_inicialEmpleadoDisca.setToolTipText("Porcentaje Inicial");
		this.jLabelporcentaje_inicialEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_inicialEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_inicialEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_inicialEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_inicialEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_inicialEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL);
		this.gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		this.jPanelporcentaje_inicialEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);


		jTextFieldporcentaje_inicialEmpleadoDisca= new JTextFieldMe();
		jTextFieldporcentaje_inicialEmpleadoDisca.setEnabled(false);
		jTextFieldporcentaje_inicialEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_inicialEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_inicialEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_inicialEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_inicialEmpleadoDisca.setText("0.0");

		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda= new JButtonMe();
		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setText("U");
		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_inicialEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_inicialEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_inicialEmpleadoDiscaBusqueda"));

		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_finalEmpleadoDisca = new JLabelMe();
		this.jLabelporcentaje_finalEmpleadoDisca.setText(""+EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL+" : *");
		this.jLabelporcentaje_finalEmpleadoDisca.setToolTipText("Porcentaje Final");
		this.jLabelporcentaje_finalEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_finalEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_finalEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_finalEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_finalEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_finalEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL);
		this.gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		this.jPanelporcentaje_finalEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);


		jTextFieldporcentaje_finalEmpleadoDisca= new JTextFieldMe();
		jTextFieldporcentaje_finalEmpleadoDisca.setEnabled(false);
		jTextFieldporcentaje_finalEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_finalEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_finalEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_finalEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_finalEmpleadoDisca.setText("0.0");

		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda= new JButtonMe();
		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setText("U");
		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_finalEmpleadoDiscaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_finalEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_finalEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_finalEmpleadoDiscaBusqueda"));

		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_finalEmpleadoDiscaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEmpleadoDisca = new JLabelMe();
		this.jLabeldescripcionEmpleadoDisca.setText(""+EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEmpleadoDisca.setToolTipText("Descripcion");
		this.jLabeldescripcionEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		this.jPaneldescripcionEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);


		jTextAreadescripcionEmpleadoDisca= new JTextAreaMe();
		jTextAreadescripcionEmpleadoDisca.setEnabled(false);
		jTextAreadescripcionEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoDisca.setLineWrap(true);
		jTextAreadescripcionEmpleadoDisca.setWrapStyleWord(true);
		jTextAreadescripcionEmpleadoDisca.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEmpleadoDisca.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEmpleadoDisca = new JScrollPane(jTextAreadescripcionEmpleadoDisca);
		jscrollPanedescripcionEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionEmpleadoDiscaBusqueda= new JButtonMe();
		this.jButtondescripcionEmpleadoDiscaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoDiscaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoDiscaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEmpleadoDiscaBusqueda.setText("U");
		this.jButtondescripcionEmpleadoDiscaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEmpleadoDiscaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEmpleadoDiscaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEmpleadoDiscaBusqueda"));

		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEmpleadoDiscaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoDisca() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoDisca = new JLabelMe();
		this.jLabelid_empresaEmpleadoDisca.setText(""+EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoDisca.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		this.jPanelid_empresaEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);


		jComboBoxid_empresaEmpleadoDisca= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoDisca.setEnabled(false);

		this.jButtonid_empresaEmpleadoDisca= new JButtonMe();
		this.jButtonid_empresaEmpleadoDisca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoDisca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoDisca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoDisca.setText("Buscar");
		this.jButtonid_empresaEmpleadoDisca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoDisca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoDisca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoDisca"));

		this.jButtonid_empresaEmpleadoDiscaBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoDiscaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoDiscaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoDiscaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoDiscaBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoDiscaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoDiscaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoDiscaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoDiscaBusqueda"));

		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoDiscaBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoDiscaUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoDiscaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoDiscaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoDiscaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoDiscaUpdate.setText("U");
		this.jButtonid_empresaEmpleadoDiscaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoDiscaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoDiscaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoDiscaUpdate"));



					
		this.jLabelid_empleadoEmpleadoDisca = new JLabelMe();
		this.jLabelid_empleadoEmpleadoDisca.setText(""+EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoDisca.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);


		jComboBoxid_empleadoEmpleadoDisca= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoDisca= new JButtonMe();
		this.jButtonid_empleadoEmpleadoDisca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoDisca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoDisca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoDisca.setText("Buscar");
		this.jButtonid_empleadoEmpleadoDisca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoDisca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoDisca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoDisca"));

		this.jButtonid_empleadoEmpleadoDiscaBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoDiscaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoDiscaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoDiscaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoDiscaBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoDiscaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoDiscaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoDiscaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoDiscaBusqueda"));

		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoDiscaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoDiscaUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoDiscaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoDiscaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoDiscaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoDiscaUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoDiscaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoDiscaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoDiscaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoDiscaUpdate"));



					
		this.jLabelid_tipo_discapacidadEmpleadoDisca = new JLabelMe();
		this.jLabelid_tipo_discapacidadEmpleadoDisca.setText(""+EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD+" : *");
		this.jLabelid_tipo_discapacidadEmpleadoDisca.setToolTipText("Tipo Discapacad");
		this.jLabelid_tipo_discapacidadEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_discapacidadEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_discapacidadEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_discapacidadEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_discapacidadEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_discapacidadEmpleadoDisca.setToolTipText(EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD);
		this.gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		this.jPanelid_tipo_discapacidadEmpleadoDisca.setLayout(this.gridaBagLayoutEmpleadoDisca);


		jComboBoxid_tipo_discapacidadEmpleadoDisca= new JComboBoxMe();
		jComboBoxid_tipo_discapacidadEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_discapacidadEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_discapacidadEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_discapacidadEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_discapacidadEmpleadoDisca= new JButtonMe();
		this.jButtonid_tipo_discapacidadEmpleadoDisca.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_discapacidadEmpleadoDisca.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_discapacidadEmpleadoDisca.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_discapacidadEmpleadoDisca.setText("Buscar");
		this.jButtonid_tipo_discapacidadEmpleadoDisca.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_discapacidadEmpleadoDisca.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_discapacidadEmpleadoDisca,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_discapacidadEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_discapacidadEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_discapacidadEmpleadoDisca"));

		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda= new JButtonMe();
		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setText("U");
		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_discapacidadEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_discapacidadEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_discapacidadEmpleadoDiscaBusqueda"));

		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate= new JButtonMe();
		this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.setText("U");
		this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_discapacidadEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_discapacidadEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_discapacidadEmpleadoDiscaUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoDisca = new EmpleadoDiscaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Disca DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoDisca= new GridBagLayout();
		

		
		String sToolTipEmpleadoDisca="";
		sToolTipEmpleadoDisca=EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoDisca+="(Nomina.EmpleadoDisca)";
		}
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoDisca+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoDisca = new JButtonMe();
		this.jButtonModificarEmpleadoDisca = new JButtonMe();
        this.jButtonActualizarEmpleadoDisca = new JButtonMe();
        this.jButtonEliminarEmpleadoDisca = new JButtonMe();
        this.jButtonCancelarEmpleadoDisca = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoDisca = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoDisca = new JButtonMe();
		this.jButtonCerrarEmpleadoDisca = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoDisca = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoDisca = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoDisca = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Disca";
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Discas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoDisca.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoDisca.setName("jPanelCamposEmpleadoDisca"); 

		this.jPanelCamposOcultosEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoDisca.setName("jPanelCamposOcultosEmpleadoDisca"); 

        this.jPanelAccionesEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoDisca.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoDisca.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoDisca.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoDisca.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoDisca.setText("Nuevo");
		this.jButtonModificarEmpleadoDisca.setText("Editar");
        this.jButtonActualizarEmpleadoDisca.setText("Actualizar");
        this.jButtonEliminarEmpleadoDisca.setText("Eliminar");
        this.jButtonCancelarEmpleadoDisca.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoDisca.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoDisca.setText("Guardar");
		this.jButtonCerrarEmpleadoDisca.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoDisca,"nuevo_button","Nuevo",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoDisca,"modificar_button","Editar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoDisca,"actualizar_button","Actualizar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoDisca,"eliminar_button","Eliminar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoDisca,"cancelar_button","Cancelar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoDisca,"guardarcambios_button","Guardar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoDisca,"guardarcambiostabla_button","Guardar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoDisca,"cerrar_button","Salir",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoDisca.setToolTipText("Nuevo"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoDisca.setToolTipText("Editar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoDisca.setToolTipText("Actualizar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoDisca.setToolTipText("Eliminar)"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoDisca.setToolTipText("Cancelar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoDisca.setToolTipText("Guardar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoDisca.setToolTipText("Guardar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoDisca.setToolTipText("Salir"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoDisca";
		inputMap = this.jButtonNuevoEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoDisca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoDisca"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoDisca";
		inputMap = this.jButtonActualizarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoDisca"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoDisca";
		inputMap = this.jButtonEliminarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoDisca"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoDisca";
		inputMap = this.jButtonCancelarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoDisca"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoDisca";
		inputMap = this.jButtonCerrarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoDisca"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoDisca";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoDisca"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoDisca = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoDisca.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoDisca.setToolTipText("Nuevo EmpleadoDisca");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoDisca = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoDisca.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoDisca.setToolTipText("Sin Cerrar Ventana EmpleadoDisca");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoDisca = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoDisca.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoDisca.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoDisca.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoDisca.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoDisca.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoDisca.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoDisca = new JLabelMe();
		
		this.jLabelAccionesEmpleadoDisca.setText("Acciones");		
		this.jLabelAccionesEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoDisca();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoDisca();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoDisca=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoDisca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoDisca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoDisca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoDisca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoDisca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoDisca.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoDisca = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoDisca = new GridBagLayout();
		
		this.jPanelCamposEmpleadoDisca.setLayout(gridaBagLayoutCamposEmpleadoDisca);
		this.jPanelCamposOcultosEmpleadoDisca.setLayout(gridaBagLayoutCamposOcultosEmpleadoDisca);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoDisca.add(jLabelIdEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoDisca.add(jLabelidEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoDisca.add(jLabelid_empresaEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 2;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoDisca.add(jButtonid_empresaEmpleadoDiscaBusqueda, this.gridBagConstraintsEmpleadoDisca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 3;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoDisca.add(jButtonid_empresaEmpleadoDiscaUpdate, this.gridBagConstraintsEmpleadoDisca);
	}

	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoDisca.add(jComboBoxid_empresaEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoDisca.add(jLabelid_empleadoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 2;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoDisca.add(jButtonid_empleadoEmpleadoDiscaBusqueda, this.gridBagConstraintsEmpleadoDisca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 3;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoDisca.add(jButtonid_empleadoEmpleadoDiscaUpdate, this.gridBagConstraintsEmpleadoDisca);
	}

	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoDisca.add(jComboBoxid_empleadoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_discapacidadEmpleadoDisca.add(jLabelid_tipo_discapacidadEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 2;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_discapacidadEmpleadoDisca.add(jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda, this.gridBagConstraintsEmpleadoDisca);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 3;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_discapacidadEmpleadoDisca.add(jButtonid_tipo_discapacidadEmpleadoDiscaUpdate, this.gridBagConstraintsEmpleadoDisca);
	}

	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_discapacidadEmpleadoDisca.add(jComboBoxid_tipo_discapacidadEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_inicialEmpleadoDisca.add(jLabelporcentaje_inicialEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 2;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_inicialEmpleadoDisca.add(jButtonporcentaje_inicialEmpleadoDiscaBusqueda, this.gridBagConstraintsEmpleadoDisca);
	}

	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_inicialEmpleadoDisca.add(jTextFieldporcentaje_inicialEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_finalEmpleadoDisca.add(jLabelporcentaje_finalEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 2;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_finalEmpleadoDisca.add(jButtonporcentaje_finalEmpleadoDiscaBusqueda, this.gridBagConstraintsEmpleadoDisca);
	}

	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_finalEmpleadoDisca.add(jTextFieldporcentaje_finalEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEmpleadoDisca.add(jLabeldescripcionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 2;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
		this.gridBagConstraintsEmpleadoDisca.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEmpleadoDisca.add(jButtondescripcionEmpleadoDiscaBusqueda, this.gridBagConstraintsEmpleadoDisca);
	}

	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoDisca.gridy = 0;
	this.gridBagConstraintsEmpleadoDisca.gridx = 1;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEmpleadoDisca.add(jscrollPanedescripcionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoDisca.add(this.jPanelidEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposEmpleadoDisca % 1==0) {
		iXPanelCamposEmpleadoDisca=0;
		iYPanelCamposEmpleadoDisca++;
	}
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoDisca.add(this.jPanelid_empleadoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposEmpleadoDisca % 1==0) {
		iXPanelCamposEmpleadoDisca=0;
		iYPanelCamposEmpleadoDisca++;
	}
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoDisca.add(this.jPanelid_tipo_discapacidadEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposEmpleadoDisca % 1==0) {
		iXPanelCamposEmpleadoDisca=0;
		iYPanelCamposEmpleadoDisca++;
	}
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoDisca.add(this.jPanelporcentaje_inicialEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposEmpleadoDisca % 1==0) {
		iXPanelCamposEmpleadoDisca=0;
		iYPanelCamposEmpleadoDisca++;
	}
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoDisca.add(this.jPanelporcentaje_finalEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposEmpleadoDisca % 1==0) {
		iXPanelCamposEmpleadoDisca=0;
		iYPanelCamposEmpleadoDisca++;
	}
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoDisca.add(this.jPaneldescripcionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposEmpleadoDisca % 1==0) {
		iXPanelCamposEmpleadoDisca=0;
		iYPanelCamposEmpleadoDisca++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoDisca.gridy = iYPanelCamposOcultosEmpleadoDisca;
	this.gridBagConstraintsEmpleadoDisca.gridx = iXPanelCamposOcultosEmpleadoDisca++;
	this.gridBagConstraintsEmpleadoDisca.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoDisca.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoDisca.add(this.jPanelid_empresaEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);



	if(iXPanelCamposOcultosEmpleadoDisca % 1==0) {
		iXPanelCamposOcultosEmpleadoDisca=0;
		iYPanelCamposOcultosEmpleadoDisca++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoDisca= new GridBagLayout();
		this.jPanelAccionesEmpleadoDisca.setLayout(gridaBagLayoutAccionesEmpleadoDisca);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoDisca= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoDisca.setLayout(gridaBagLayoutAccionesFormularioEmpleadoDisca);
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoDisca.add(this.jComboBoxTiposAccionesFormularioEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoDisca.add(this.jCheckBoxPostAccionNuevoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoDisca.add(this.jCheckBoxPostAccionSinCerrarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoDisca.add(this.jCheckBoxPostAccionSinMensajeEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoDisca.add(this.jButtonModificarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);							

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoDisca.add(this.jButtonEliminarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoDisca.add(this.jButtonActualizarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoDisca.add(this.jButtonGuardarCambiosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);	
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;		
		this.gridBagConstraintsEmpleadoDisca.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoDisca.add(this.jButtonCancelarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoDisca);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;		
			//this.gridBagConstraintsEmpleadoDisca.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoDisca.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoDisca.gridx =0;
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoDisca.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoDisca = new EmpleadoDiscaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Disca DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Disca DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Disca Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoDiscaModel empleadodiscaModel=new EmpleadoDiscaModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoDiscaModel.EmpleadoDiscaFocusTraversalPolicy empleadodiscaFocusTraversalPolicy = empleadodiscaModel.new EmpleadoDiscaFocusTraversalPolicy(this);
			
			//empleadodiscaFocusTraversalPolicy.setempleadodiscaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadodiscaModel);
			
			
			this.jContentPaneDetalleEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoDisca = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoDisca.setLayout(gridaBagLayoutDetalleEmpleadoDisca);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoDisca = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoDisca.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoDisca.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoDisca.add(jTtoolBarDetalleEmpleadoDisca, gridBagConstraintsEmpleadoDisca);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoDisca=   new JScrollPane(jContentPaneDetalleEmpleadoDisca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoDisca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoDisca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoDisca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoDisca=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoDisca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoDisca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoDisca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoDisca.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoDisca.add(jPanelCamposEmpleadoDisca, gridBagConstraintsEmpleadoDisca);
			
			
			
			
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
						&& empleadodiscaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoDisca= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoDisca.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoDisca.gridx = 0;
						this.jContentPaneDetalleEmpleadoDisca.add(this.jTabbedPaneRelacionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoDisca.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoDisca.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoDisca.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoDisca.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoDisca.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoDisca.add(jPanelCamposOcultosEmpleadoDisca, gridBagConstraintsEmpleadoDisca);
				
					this.jPanelCamposOcultosEmpleadoDisca.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	        this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoDisca.add(this.jPanelAccionesFormularioEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);							
			
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoDisca.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoDisca.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoDisca.add(this.jPanelAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoDisca);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoDisca=   new JScrollPane(this.jPanelCamposEmpleadoDisca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoDisca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoDisca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoDisca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoDisca.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoDisca;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoDisca;
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
