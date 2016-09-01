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
import com.bydan.erp.nomina.util.EmpleadoHerraConstantesFunciones;

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
public class EmpleadoHerraDetalleFormJInternalFrame extends EmpleadoHerraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoHerra;
	
	protected JMenuBar jmenuBarDetalleEmpleadoHerra;
	
	protected JMenu jmenuDetalleEmpleadoHerra;
	protected JMenu jmenuDetalleArchivoEmpleadoHerra;
	protected JMenu jmenuDetalleAccionesEmpleadoHerra;
	protected JMenu jmenuDetalleDatosEmpleadoHerra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoHerra;	
	protected GridBagConstraints gridBagConstraintsEmpleadoHerra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoHerraBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoHerra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected HerramientaBeanSwingJInternalFrame herramientaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_herramienta="";
	
	public EmpleadoHerraSessionBean empleadoherraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public HerramientaSessionBean herramientaSessionBean;	
	
	public EmpleadoHerraLogic empleadoherraLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoHerra;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoHerra;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoHerra;
	
	protected JPanel jPanelCamposEmpleadoHerra;    
	protected JPanel jPanelCamposOcultosEmpleadoHerra;    	
	protected JPanel jPanelAccionesEmpleadoHerra;
	protected JPanel jPanelAccionesFormularioEmpleadoHerra;
    
	
	
	protected Integer iXPanelCamposEmpleadoHerra=0;
	protected Integer iYPanelCamposEmpleadoHerra=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoHerra=0;
	protected Integer iYPanelCamposOcultosEmpleadoHerra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoHerra;
	public JButton jButtonModificarEmpleadoHerra;
	public JButton jButtonActualizarEmpleadoHerra;
    public JButton jButtonEliminarEmpleadoHerra;
	public JButton jButtonCancelarEmpleadoHerra;
    public JButton jButtonGuardarCambiosEmpleadoHerra;
	public JButton jButtonGuardarCambiosTablaEmpleadoHerra;
	protected JButton jButtonCerrarEmpleadoHerra;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoHerra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoHerra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoHerra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoHerra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoHerra;
	protected JButton jButtonModificarToolBarEmpleadoHerra;
	protected JButton jButtonActualizarToolBarEmpleadoHerra;
    protected JButton jButtonEliminarToolBarEmpleadoHerra;
	protected JButton jButtonCancelarToolBarEmpleadoHerra;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoHerra;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoHerra;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoHerra;
	protected JButton jButtonCerrarToolBarEmpleadoHerra;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoHerra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoHerra;
	protected JMenuItem jMenuItemModificarEmpleadoHerra;
	protected JMenuItem jMenuItemActualizarEmpleadoHerra;
    protected JMenuItem jMenuItemEliminarEmpleadoHerra;
	protected JMenuItem jMenuItemCancelarEmpleadoHerra;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoHerra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoHerra;
	protected JMenuItem jMenuItemCerrarEmpleadoHerra;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoHerra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoHerra;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoHerra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoHerra;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoHerra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoHerra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoHerra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoHerra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoHerra;
	public JLabel jLabelIdEmpleadoHerra;
	public JLabel jLabelidEmpleadoHerra;
	public JButton jButtonidEmpleadoHerraBusqueda= new JButtonMe();

	public JPanel jPanelcantidadEmpleadoHerra;
	public JLabel jLabelcantidadEmpleadoHerra;
	public JTextField jTextFieldcantidadEmpleadoHerra;
	public JButton jButtoncantidadEmpleadoHerraBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoEmpleadoHerra;
	public JLabel jLabelesta_activoEmpleadoHerra;
	public JCheckBox jCheckBoxesta_activoEmpleadoHerra;
	public JButton jButtonesta_activoEmpleadoHerraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoHerra;
	public JLabel jLabelid_empresaEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoHerra;
	public JButton jButtonid_empresaEmpleadoHerra= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoHerraUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoHerraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoHerra;
	public JLabel jLabelid_empleadoEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoHerra;
	public JButton jButtonid_empleadoEmpleadoHerra= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoHerraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoHerraBusqueda= new JButtonMe();

	public JPanel jPanelid_herramientaEmpleadoHerra;
	public JLabel jLabelid_herramientaEmpleadoHerra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_herramientaEmpleadoHerra;
	public JButton jButtonid_herramientaEmpleadoHerra= new JButtonMe();
	public JButton jButtonid_herramientaEmpleadoHerraUpdate= new JButtonMe();
	public JButton jButtonid_herramientaEmpleadoHerraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoHerra;
	
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
	
	public EmpleadoHerraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoHerra=new JPanel();
				this.jPanelAccionesFormularioEmpleadoHerra=new JPanel();
				this.jmenuBarDetalleEmpleadoHerra=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoHerra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoHerraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoHerraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoHerra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoHerra() {
		return this.jButtonActualizarToolBarEmpleadoHerra;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoHerra() {
		return this.jButtonEliminarToolBarEmpleadoHerra;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoHerra() {
		return this.jButtonCancelarToolBarEmpleadoHerra;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoHerra() {
		return this.jButtonProcesarInformacionEmpleadoHerra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoHerra)	{
		this.jButtonProcesarInformacionEmpleadoHerra = jButtonProcesarInformacionEmpleadoHerra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoHerra() {
		return this.jComboBoxTiposAccionesEmpleadoHerra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoHerra(
			JComboBox jComboBoxTiposRelacionesEmpleadoHerra) {
		this.jComboBoxTiposRelacionesEmpleadoHerra = jComboBoxTiposRelacionesEmpleadoHerra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoHerra(
			JComboBox jComboBoxTiposAccionesEmpleadoHerra) {
		this.jComboBoxTiposAccionesEmpleadoHerra = jComboBoxTiposAccionesEmpleadoHerra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoHerra() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoHerra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoHerra(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoHerra) {
		this.jComboBoxTiposAccionesFormularioEmpleadoHerra = jComboBoxTiposAccionesFormularioEmpleadoHerra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		
		this.empleadoherraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoherraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoherraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoHerraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Herra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoHerra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoHerra=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoHerra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoHerra,this.jTtoolBarDetalleEmpleadoHerra,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoHerra,this.jTtoolBarDetalleEmpleadoHerra,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoHerra,this.jTtoolBarDetalleEmpleadoHerra,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoHerra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoHerra,this.jTtoolBarDetalleEmpleadoHerra,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoHerra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoHerra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoHerra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoHerra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoHerra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoHerra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoHerra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoHerra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoHerra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoHerra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoHerra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoHerra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoHerra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoHerra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoHerra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoHerra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoHerra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoHerra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoHerra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoHerra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoHerra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoHerra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoHerra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoHerra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoHerra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoHerra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoHerra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoHerra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoHerra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoHerra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoHerra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoHerra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoHerra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoHerra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoHerra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoHerra.add(this.jMenuItemDetalleCerrarEmpleadoHerra);
		
		this.jmenuDetalleAccionesEmpleadoHerra.add(this.jMenuItemActualizarEmpleadoHerra);
		this.jmenuDetalleAccionesEmpleadoHerra.add(this.jMenuItemEliminarEmpleadoHerra);
		this.jmenuDetalleAccionesEmpleadoHerra.add(this.jMenuItemCancelarEmpleadoHerra);		
		
		//this.jmenuDetalleDatosEmpleadoHerra.add(this.jMenuItemDetalleAbrirOrderByEmpleadoHerra);				
		this.jmenuDetalleDatosEmpleadoHerra.add(this.jMenuItemDetalleMostarOcultarEmpleadoHerra);				
				
		//this.jmenuDetalleAccionesEmpleadoHerra.add(this.jMenuItemGuardarCambiosEmpleadoHerra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoHerra.add(this.jmenuDetalleArchivoEmpleadoHerra);		
		this.jmenuBarDetalleEmpleadoHerra.add(this.jmenuDetalleAccionesEmpleadoHerra);		
		this.jmenuBarDetalleEmpleadoHerra.add(this.jmenuDetalleDatosEmpleadoHerra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoHerra);				
	}
	
	
	public void inicializarElementosCamposEmpleadoHerra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoHerra = new JLabelMe();
		jLabelIdEmpleadoHerra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoHerra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoHerra.setToolTipText(EmpleadoHerraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoHerra= new GridBagLayout();

		this.jPanelidEmpleadoHerra.setLayout(this.gridaBagLayoutEmpleadoHerra);

		jLabelidEmpleadoHerra = new JLabel();
		jLabelidEmpleadoHerra.setText("Id");

		jLabelidEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadEmpleadoHerra = new JLabelMe();
		this.jLabelcantidadEmpleadoHerra.setText(""+EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadEmpleadoHerra.setToolTipText("Cantidad");
		this.jLabelcantidadEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadEmpleadoHerra.setToolTipText(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		this.jPanelcantidadEmpleadoHerra.setLayout(this.gridaBagLayoutEmpleadoHerra);


		jTextFieldcantidadEmpleadoHerra= new JTextFieldMe();
		jTextFieldcantidadEmpleadoHerra.setEnabled(false);
		jTextFieldcantidadEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadEmpleadoHerra.setText("0");

		this.jButtoncantidadEmpleadoHerraBusqueda= new JButtonMe();
		this.jButtoncantidadEmpleadoHerraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadEmpleadoHerraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadEmpleadoHerraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadEmpleadoHerraBusqueda.setText("U");
		this.jButtoncantidadEmpleadoHerraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadEmpleadoHerraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadEmpleadoHerraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadEmpleadoHerraBusqueda"));

		if(this.empleadoherraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadEmpleadoHerraBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoEmpleadoHerra = new JLabelMe();
		this.jLabelesta_activoEmpleadoHerra.setText(""+EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoEmpleadoHerra.setToolTipText("Esta Activo");
		this.jLabelesta_activoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoEmpleadoHerra.setToolTipText(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		this.jPanelesta_activoEmpleadoHerra.setLayout(this.gridaBagLayoutEmpleadoHerra);


		jCheckBoxesta_activoEmpleadoHerra= new JCheckBoxMe();
		jCheckBoxesta_activoEmpleadoHerra.setEnabled(false);

		jCheckBoxesta_activoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoEmpleadoHerraBusqueda= new JButtonMe();
		this.jButtonesta_activoEmpleadoHerraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEmpleadoHerraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEmpleadoHerraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoEmpleadoHerraBusqueda.setText("U");
		this.jButtonesta_activoEmpleadoHerraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoEmpleadoHerraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoEmpleadoHerraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoEmpleadoHerraBusqueda"));

		if(this.empleadoherraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoEmpleadoHerraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoHerra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoHerra = new JLabelMe();
		this.jLabelid_empresaEmpleadoHerra.setText(""+EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoHerra.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoHerra.setToolTipText(EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		this.jPanelid_empresaEmpleadoHerra.setLayout(this.gridaBagLayoutEmpleadoHerra);


		jComboBoxid_empresaEmpleadoHerra= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoHerra.setEnabled(false);

		this.jButtonid_empresaEmpleadoHerra= new JButtonMe();
		this.jButtonid_empresaEmpleadoHerra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoHerra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoHerra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoHerra.setText("Buscar");
		this.jButtonid_empresaEmpleadoHerra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoHerra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoHerra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoHerra"));

		this.jButtonid_empresaEmpleadoHerraBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoHerraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHerraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHerraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoHerraBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoHerraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoHerraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoHerraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoHerraBusqueda"));

		if(this.empleadoherraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoHerraBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoHerraUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoHerraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHerraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoHerraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoHerraUpdate.setText("U");
		this.jButtonid_empresaEmpleadoHerraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoHerraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoHerraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoHerraUpdate"));



					
		this.jLabelid_empleadoEmpleadoHerra = new JLabelMe();
		this.jLabelid_empleadoEmpleadoHerra.setText(""+EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoHerra.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoHerra.setToolTipText(EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoHerra.setLayout(this.gridaBagLayoutEmpleadoHerra);


		jComboBoxid_empleadoEmpleadoHerra= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoHerra= new JButtonMe();
		this.jButtonid_empleadoEmpleadoHerra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoHerra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoHerra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoHerra.setText("Buscar");
		this.jButtonid_empleadoEmpleadoHerra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoHerra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoHerra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoHerra"));

		this.jButtonid_empleadoEmpleadoHerraBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoHerraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHerraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHerraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoHerraBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoHerraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoHerraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoHerraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoHerraBusqueda"));

		if(this.empleadoherraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoHerraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoHerraUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoHerraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHerraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoHerraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoHerraUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoHerraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoHerraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoHerraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoHerraUpdate"));



					
		this.jLabelid_herramientaEmpleadoHerra = new JLabelMe();
		this.jLabelid_herramientaEmpleadoHerra.setText(""+EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA+" : *");
		this.jLabelid_herramientaEmpleadoHerra.setToolTipText("Herramienta");
		this.jLabelid_herramientaEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_herramientaEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_herramientaEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_herramientaEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_herramientaEmpleadoHerra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_herramientaEmpleadoHerra.setToolTipText(EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA);
		this.gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		this.jPanelid_herramientaEmpleadoHerra.setLayout(this.gridaBagLayoutEmpleadoHerra);


		jComboBoxid_herramientaEmpleadoHerra= new JComboBoxMe();
		jComboBoxid_herramientaEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_herramientaEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_herramientaEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_herramientaEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_herramientaEmpleadoHerra= new JButtonMe();
		this.jButtonid_herramientaEmpleadoHerra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_herramientaEmpleadoHerra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_herramientaEmpleadoHerra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_herramientaEmpleadoHerra.setText("Buscar");
		this.jButtonid_herramientaEmpleadoHerra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_herramientaEmpleadoHerra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_herramientaEmpleadoHerra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_herramientaEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_herramientaEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_herramientaEmpleadoHerra"));

		this.jButtonid_herramientaEmpleadoHerraBusqueda= new JButtonMe();
		this.jButtonid_herramientaEmpleadoHerraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_herramientaEmpleadoHerraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_herramientaEmpleadoHerraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_herramientaEmpleadoHerraBusqueda.setText("U");
		this.jButtonid_herramientaEmpleadoHerraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_herramientaEmpleadoHerraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_herramientaEmpleadoHerraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_herramientaEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_herramientaEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_herramientaEmpleadoHerraBusqueda"));

		if(this.empleadoherraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_herramientaEmpleadoHerraBusqueda.setVisible(false);		}

		this.jButtonid_herramientaEmpleadoHerraUpdate= new JButtonMe();
		this.jButtonid_herramientaEmpleadoHerraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_herramientaEmpleadoHerraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_herramientaEmpleadoHerraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_herramientaEmpleadoHerraUpdate.setText("U");
		this.jButtonid_herramientaEmpleadoHerraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_herramientaEmpleadoHerraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_herramientaEmpleadoHerraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_herramientaEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_herramientaEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_herramientaEmpleadoHerraUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoHerra = new EmpleadoHerraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Herra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoHerra= new GridBagLayout();
		

		
		String sToolTipEmpleadoHerra="";
		sToolTipEmpleadoHerra=EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoHerra+="(Nomina.EmpleadoHerra)";
		}
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoHerra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoHerra = new JButtonMe();
		this.jButtonModificarEmpleadoHerra = new JButtonMe();
        this.jButtonActualizarEmpleadoHerra = new JButtonMe();
        this.jButtonEliminarEmpleadoHerra = new JButtonMe();
        this.jButtonCancelarEmpleadoHerra = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoHerra = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoHerra = new JButtonMe();
		this.jButtonCerrarEmpleadoHerra = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoHerra = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoHerra = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoHerra = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Herra";
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Herras" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoHerra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoHerra.setName("jPanelCamposEmpleadoHerra"); 

		this.jPanelCamposOcultosEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoHerra.setName("jPanelCamposOcultosEmpleadoHerra"); 

        this.jPanelAccionesEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoHerra.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoHerra.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoHerra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoHerra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoHerra.setText("Nuevo");
		this.jButtonModificarEmpleadoHerra.setText("Editar");
        this.jButtonActualizarEmpleadoHerra.setText("Actualizar");
        this.jButtonEliminarEmpleadoHerra.setText("Eliminar");
        this.jButtonCancelarEmpleadoHerra.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoHerra.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoHerra.setText("Guardar");
		this.jButtonCerrarEmpleadoHerra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoHerra,"nuevo_button","Nuevo",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoHerra,"modificar_button","Editar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoHerra,"actualizar_button","Actualizar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoHerra,"eliminar_button","Eliminar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoHerra,"cancelar_button","Cancelar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoHerra,"guardarcambios_button","Guardar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoHerra,"guardarcambiostabla_button","Guardar",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoHerra,"cerrar_button","Salir",this.empleadoherraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoHerra.setToolTipText("Nuevo"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoHerra.setToolTipText("Editar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoHerra.setToolTipText("Actualizar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoHerra.setToolTipText("Eliminar)"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoHerra.setToolTipText("Cancelar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoHerra.setToolTipText("Guardar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoHerra.setToolTipText("Guardar"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoHerra.setToolTipText("Salir"+" "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoHerra";
		inputMap = this.jButtonNuevoEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoHerra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoHerra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoHerra";
		inputMap = this.jButtonActualizarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoHerra"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoHerra";
		inputMap = this.jButtonEliminarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoHerra"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoHerra";
		inputMap = this.jButtonCancelarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoHerra"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoHerra";
		inputMap = this.jButtonCerrarEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoHerra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoHerra";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoHerra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoHerra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoHerra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoHerra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoHerra.setToolTipText("Nuevo EmpleadoHerra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoHerra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoHerra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoHerra.setToolTipText("Sin Cerrar Ventana EmpleadoHerra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoHerra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoHerra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoHerra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoHerra.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoHerra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoHerra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoHerra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoHerra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoHerra = new JLabelMe();
		
		this.jLabelAccionesEmpleadoHerra.setText("Acciones");		
		this.jLabelAccionesEmpleadoHerra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHerra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoHerra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoHerra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoHerra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoHerra=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoHerra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoHerra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoHerra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHerra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoHerra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoHerra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoHerra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoHerra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoHerra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoHerra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoHerra = new GridBagLayout();
		
		this.jPanelCamposEmpleadoHerra.setLayout(gridaBagLayoutCamposEmpleadoHerra);
		this.jPanelCamposOcultosEmpleadoHerra.setLayout(gridaBagLayoutCamposOcultosEmpleadoHerra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoHerra.add(jLabelIdEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 1;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoHerra.add(jLabelidEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoHerra.add(jLabelid_empresaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 2;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoHerra.add(jButtonid_empresaEmpleadoHerraBusqueda, this.gridBagConstraintsEmpleadoHerra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 3;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoHerra.add(jButtonid_empresaEmpleadoHerraUpdate, this.gridBagConstraintsEmpleadoHerra);
	}

	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 1;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoHerra.add(jComboBoxid_empresaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoHerra.add(jLabelid_empleadoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 2;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmpleadoHerra.add(jButtonid_empleadoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 3;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoHerra.add(jButtonid_empleadoEmpleadoHerraBusqueda, this.gridBagConstraintsEmpleadoHerra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 4;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoHerra.add(jButtonid_empleadoEmpleadoHerraUpdate, this.gridBagConstraintsEmpleadoHerra);
	}

	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 1;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoHerra.add(jComboBoxid_empleadoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_herramientaEmpleadoHerra.add(jLabelid_herramientaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 2;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_herramientaEmpleadoHerra.add(jButtonid_herramientaEmpleadoHerraBusqueda, this.gridBagConstraintsEmpleadoHerra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 3;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_herramientaEmpleadoHerra.add(jButtonid_herramientaEmpleadoHerraUpdate, this.gridBagConstraintsEmpleadoHerra);
	}

	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 1;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_herramientaEmpleadoHerra.add(jComboBoxid_herramientaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadEmpleadoHerra.add(jLabelcantidadEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 2;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadEmpleadoHerra.add(jButtoncantidadEmpleadoHerraBusqueda, this.gridBagConstraintsEmpleadoHerra);
	}

	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 1;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadEmpleadoHerra.add(jTextFieldcantidadEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoEmpleadoHerra.add(jLabelesta_activoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = 2;
		this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
		this.gridBagConstraintsEmpleadoHerra.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoEmpleadoHerra.add(jButtonesta_activoEmpleadoHerraBusqueda, this.gridBagConstraintsEmpleadoHerra);
	}

	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoHerra.gridy = 0;
	this.gridBagConstraintsEmpleadoHerra.gridx = 1;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoEmpleadoHerra.add(jCheckBoxesta_activoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHerra.gridy = iYPanelCamposEmpleadoHerra;
	this.gridBagConstraintsEmpleadoHerra.gridx = iXPanelCamposEmpleadoHerra++;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHerra.add(this.jPanelidEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(iXPanelCamposEmpleadoHerra % 1==0) {
		iXPanelCamposEmpleadoHerra=0;
		iYPanelCamposEmpleadoHerra++;
	}
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHerra.gridy = iYPanelCamposEmpleadoHerra;
	this.gridBagConstraintsEmpleadoHerra.gridx = iXPanelCamposEmpleadoHerra++;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHerra.add(this.jPanelid_empleadoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(iXPanelCamposEmpleadoHerra % 1==0) {
		iXPanelCamposEmpleadoHerra=0;
		iYPanelCamposEmpleadoHerra++;
	}
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHerra.gridy = iYPanelCamposEmpleadoHerra;
	this.gridBagConstraintsEmpleadoHerra.gridx = iXPanelCamposEmpleadoHerra++;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHerra.add(this.jPanelid_herramientaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(iXPanelCamposEmpleadoHerra % 1==0) {
		iXPanelCamposEmpleadoHerra=0;
		iYPanelCamposEmpleadoHerra++;
	}
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHerra.gridy = iYPanelCamposEmpleadoHerra;
	this.gridBagConstraintsEmpleadoHerra.gridx = iXPanelCamposEmpleadoHerra++;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHerra.add(this.jPanelcantidadEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(iXPanelCamposEmpleadoHerra % 1==0) {
		iXPanelCamposEmpleadoHerra=0;
		iYPanelCamposEmpleadoHerra++;
	}
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHerra.gridy = iYPanelCamposEmpleadoHerra;
	this.gridBagConstraintsEmpleadoHerra.gridx = iXPanelCamposEmpleadoHerra++;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoHerra.add(this.jPanelesta_activoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(iXPanelCamposEmpleadoHerra % 1==0) {
		iXPanelCamposEmpleadoHerra=0;
		iYPanelCamposEmpleadoHerra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoHerra.gridy = iYPanelCamposOcultosEmpleadoHerra;
	this.gridBagConstraintsEmpleadoHerra.gridx = iXPanelCamposOcultosEmpleadoHerra++;
	this.gridBagConstraintsEmpleadoHerra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoHerra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoHerra.add(this.jPanelid_empresaEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);



	if(iXPanelCamposOcultosEmpleadoHerra % 1==0) {
		iXPanelCamposOcultosEmpleadoHerra=0;
		iYPanelCamposOcultosEmpleadoHerra++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoHerra= new GridBagLayout();
		this.jPanelAccionesEmpleadoHerra.setLayout(gridaBagLayoutAccionesEmpleadoHerra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoHerra= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoHerra.setLayout(gridaBagLayoutAccionesFormularioEmpleadoHerra);
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoHerra.add(this.jComboBoxTiposAccionesFormularioEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoHerra.add(this.jCheckBoxPostAccionNuevoEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoHerra.add(this.jCheckBoxPostAccionSinCerrarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoHerra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoHerra.add(this.jCheckBoxPostAccionSinMensajeEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoHerra.add(this.jButtonModificarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);							

		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;
		this.gridBagConstraintsEmpleadoHerra.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoHerra.add(this.jButtonEliminarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
			
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoHerra.add(this.jButtonActualizarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);


		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;		
		this.gridBagConstraintsEmpleadoHerra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoHerra.add(this.jButtonGuardarCambiosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);	
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = 0;		
		this.gridBagConstraintsEmpleadoHerra.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoHerra.add(this.jButtonCancelarEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoHerra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoHerra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;		
			//this.gridBagConstraintsEmpleadoHerra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoHerra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoHerra.gridx =0;
		this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoHerra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoHerra = new EmpleadoHerraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Herra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Herra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Herra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoHerraModel empleadoherraModel=new EmpleadoHerraModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoHerraModel.EmpleadoHerraFocusTraversalPolicy empleadoherraFocusTraversalPolicy = empleadoherraModel.new EmpleadoHerraFocusTraversalPolicy(this);
			
			//empleadoherraFocusTraversalPolicy.setempleadoherraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoherraModel);
			
			
			this.jContentPaneDetalleEmpleadoHerra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoHerra = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoHerra.setLayout(gridaBagLayoutDetalleEmpleadoHerra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoHerra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoHerra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoHerra.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoHerra.add(jTtoolBarDetalleEmpleadoHerra, gridBagConstraintsEmpleadoHerra);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoHerra=   new JScrollPane(jContentPaneDetalleEmpleadoHerra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoHerra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHerra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHerra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoHerra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoHerra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHerra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoHerra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoHerra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoHerra.add(jPanelCamposEmpleadoHerra, gridBagConstraintsEmpleadoHerra);
			
			
			
			
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
						&& empleadoherraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoHerra= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoHerra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoHerra.gridx = 0;
						this.jContentPaneDetalleEmpleadoHerra.add(this.jTabbedPaneRelacionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoHerra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoHerra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoHerra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoHerra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoHerra.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoHerra.add(jPanelCamposOcultosEmpleadoHerra, gridBagConstraintsEmpleadoHerra);
				
					this.jPanelCamposOcultosEmpleadoHerra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	        this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoHerra.add(this.jPanelAccionesFormularioEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);							
			
			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoHerra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoHerra.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoHerra.add(this.jPanelAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoHerra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoHerra=   new JScrollPane(this.jPanelCamposEmpleadoHerra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoHerra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHerra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoHerra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;
			this.gridBagConstraintsEmpleadoHerra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoHerra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoHerra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);			
			
			this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoHerra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoHerra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
			
			
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		
			
		this.gridBagConstraintsEmpleadoHerra = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoHerra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoHerra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoHerra, this.gridBagConstraintsEmpleadoHerra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoHerra;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoHerra;
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
