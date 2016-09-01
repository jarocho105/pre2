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
import com.bydan.erp.nomina.util.EmpleadoEnferConstantesFunciones;

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
public class EmpleadoEnferDetalleFormJInternalFrame extends EmpleadoEnferBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoEnfer;
	
	protected JMenuBar jmenuBarDetalleEmpleadoEnfer;
	
	protected JMenu jmenuDetalleEmpleadoEnfer;
	protected JMenu jmenuDetalleArchivoEmpleadoEnfer;
	protected JMenu jmenuDetalleAccionesEmpleadoEnfer;
	protected JMenu jmenuDetalleDatosEmpleadoEnfer;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoEnfer;	
	protected GridBagConstraints gridBagConstraintsEmpleadoEnfer;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoEnferBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoEnfer;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_enfermedad="";
	
	public EmpleadoEnferSessionBean empleadoenferSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EnfermedadSessionBean enfermedadSessionBean;	
	
	public EmpleadoEnferLogic empleadoenferLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoEnfer;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoEnfer;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoEnfer;
	
	protected JPanel jPanelCamposEmpleadoEnfer;    
	protected JPanel jPanelCamposOcultosEmpleadoEnfer;    	
	protected JPanel jPanelAccionesEmpleadoEnfer;
	protected JPanel jPanelAccionesFormularioEmpleadoEnfer;
    
	
	
	protected Integer iXPanelCamposEmpleadoEnfer=0;
	protected Integer iYPanelCamposEmpleadoEnfer=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoEnfer=0;
	protected Integer iYPanelCamposOcultosEmpleadoEnfer=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoEnfer;
	public JButton jButtonModificarEmpleadoEnfer;
	public JButton jButtonActualizarEmpleadoEnfer;
    public JButton jButtonEliminarEmpleadoEnfer;
	public JButton jButtonCancelarEmpleadoEnfer;
    public JButton jButtonGuardarCambiosEmpleadoEnfer;
	public JButton jButtonGuardarCambiosTablaEmpleadoEnfer;
	protected JButton jButtonCerrarEmpleadoEnfer;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoEnfer;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoEnfer;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoEnfer;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoEnfer;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoEnfer;
	protected JButton jButtonModificarToolBarEmpleadoEnfer;
	protected JButton jButtonActualizarToolBarEmpleadoEnfer;
    protected JButton jButtonEliminarToolBarEmpleadoEnfer;
	protected JButton jButtonCancelarToolBarEmpleadoEnfer;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoEnfer;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoEnfer;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoEnfer;
	protected JButton jButtonCerrarToolBarEmpleadoEnfer;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoEnfer;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoEnfer;
	protected JMenuItem jMenuItemModificarEmpleadoEnfer;
	protected JMenuItem jMenuItemActualizarEmpleadoEnfer;
    protected JMenuItem jMenuItemEliminarEmpleadoEnfer;
	protected JMenuItem jMenuItemCancelarEmpleadoEnfer;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoEnfer;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoEnfer;
	protected JMenuItem jMenuItemCerrarEmpleadoEnfer;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoEnfer;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoEnfer;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoEnfer;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoEnfer;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoEnfer;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoEnfer;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoEnfer;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoEnfer;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoEnfer;
	public JLabel jLabelIdEmpleadoEnfer;
	public JLabel jLabelidEmpleadoEnfer;
	public JButton jButtonidEmpleadoEnferBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEmpleadoEnfer;
	public JLabel jLabeldescripcionEmpleadoEnfer;
	public JTextArea jTextAreadescripcionEmpleadoEnfer;
	public JScrollPane jscrollPanedescripcionEmpleadoEnfer;
	public JButton jButtondescripcionEmpleadoEnferBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoEnfer;
	public JLabel jLabelid_empresaEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoEnfer;
	public JButton jButtonid_empresaEmpleadoEnfer= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoEnferUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoEnferBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoEnfer;
	public JLabel jLabelid_empleadoEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoEnfer;
	public JButton jButtonid_empleadoEmpleadoEnfer= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoEnferUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoEnferBusqueda= new JButtonMe();

	public JPanel jPanelid_enfermedadEmpleadoEnfer;
	public JLabel jLabelid_enfermedadEmpleadoEnfer;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_enfermedadEmpleadoEnfer;
	public JButton jButtonid_enfermedadEmpleadoEnfer= new JButtonMe();
	public JButton jButtonid_enfermedadEmpleadoEnferUpdate= new JButtonMe();
	public JButton jButtonid_enfermedadEmpleadoEnferBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoEnfer;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoEnferDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoEnfer=new JPanel();
				this.jPanelAccionesFormularioEmpleadoEnfer=new JPanel();
				this.jmenuBarDetalleEmpleadoEnfer=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoEnfer=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoEnferDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEnferDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoEnfer No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoEnfer() {
		return this.jButtonActualizarToolBarEmpleadoEnfer;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoEnfer() {
		return this.jButtonEliminarToolBarEmpleadoEnfer;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoEnfer() {
		return this.jButtonCancelarToolBarEmpleadoEnfer;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoEnfer() {
		return this.jButtonProcesarInformacionEmpleadoEnfer;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoEnfer)	{
		this.jButtonProcesarInformacionEmpleadoEnfer = jButtonProcesarInformacionEmpleadoEnfer;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoEnfer() {
		return this.jComboBoxTiposAccionesEmpleadoEnfer;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoEnfer(
			JComboBox jComboBoxTiposRelacionesEmpleadoEnfer) {
		this.jComboBoxTiposRelacionesEmpleadoEnfer = jComboBoxTiposRelacionesEmpleadoEnfer;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoEnfer(
			JComboBox jComboBoxTiposAccionesEmpleadoEnfer) {
		this.jComboBoxTiposAccionesEmpleadoEnfer = jComboBoxTiposAccionesEmpleadoEnfer;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoEnfer() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoEnfer;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoEnfer(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoEnfer) {
		this.jComboBoxTiposAccionesFormularioEmpleadoEnfer = jComboBoxTiposAccionesFormularioEmpleadoEnfer;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		
		this.empleadoenferSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoenferSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoenferSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoEnferJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Enfer MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoEnfer= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoEnfer=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoEnfer=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoEnfer,this.jTtoolBarDetalleEmpleadoEnfer,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoEnfer,this.jTtoolBarDetalleEmpleadoEnfer,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoEnfer,this.jTtoolBarDetalleEmpleadoEnfer,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoEnfer=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoEnfer,this.jTtoolBarDetalleEmpleadoEnfer,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoEnfer=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoEnfer=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoEnfer=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoEnfer=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoEnfer=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoEnfer= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoEnfer.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoEnfer,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoEnfer= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoEnfer.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoEnfer,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoEnfer= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoEnfer.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoEnfer,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoEnfer= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoEnfer.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoEnfer,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoEnfer= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoEnfer.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoEnfer,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoEnfer= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoEnfer.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoEnfer,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoEnfer= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoEnfer.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoEnfer,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoEnfer= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoEnfer.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoEnfer,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoEnfer= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoEnfer.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoEnfer,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoEnfer= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoEnfer.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoEnfer,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoEnfer.add(this.jMenuItemDetalleCerrarEmpleadoEnfer);
		
		this.jmenuDetalleAccionesEmpleadoEnfer.add(this.jMenuItemActualizarEmpleadoEnfer);
		this.jmenuDetalleAccionesEmpleadoEnfer.add(this.jMenuItemEliminarEmpleadoEnfer);
		this.jmenuDetalleAccionesEmpleadoEnfer.add(this.jMenuItemCancelarEmpleadoEnfer);		
		
		//this.jmenuDetalleDatosEmpleadoEnfer.add(this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer);				
		this.jmenuDetalleDatosEmpleadoEnfer.add(this.jMenuItemDetalleMostarOcultarEmpleadoEnfer);				
				
		//this.jmenuDetalleAccionesEmpleadoEnfer.add(this.jMenuItemGuardarCambiosEmpleadoEnfer);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoEnfer.add(this.jmenuDetalleArchivoEmpleadoEnfer);		
		this.jmenuBarDetalleEmpleadoEnfer.add(this.jmenuDetalleAccionesEmpleadoEnfer);		
		this.jmenuBarDetalleEmpleadoEnfer.add(this.jmenuDetalleDatosEmpleadoEnfer);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoEnfer);				
	}
	
	
	public void inicializarElementosCamposEmpleadoEnfer() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoEnfer = new JLabelMe();
		jLabelIdEmpleadoEnfer.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoEnfer = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoEnfer.setToolTipText(EmpleadoEnferConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoEnfer= new GridBagLayout();

		this.jPanelidEmpleadoEnfer.setLayout(this.gridaBagLayoutEmpleadoEnfer);

		jLabelidEmpleadoEnfer = new JLabel();
		jLabelidEmpleadoEnfer.setText("Id");

		jLabelidEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionEmpleadoEnfer = new JLabelMe();
		this.jLabeldescripcionEmpleadoEnfer.setText(""+EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEmpleadoEnfer.setToolTipText("Descripcion");
		this.jLabeldescripcionEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEmpleadoEnfer=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEmpleadoEnfer.setToolTipText(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEmpleadoEnfer = new GridBagLayout();
		this.jPaneldescripcionEmpleadoEnfer.setLayout(this.gridaBagLayoutEmpleadoEnfer);


		jTextAreadescripcionEmpleadoEnfer= new JTextAreaMe();
		jTextAreadescripcionEmpleadoEnfer.setEnabled(false);
		jTextAreadescripcionEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEnfer.setLineWrap(true);
		jTextAreadescripcionEmpleadoEnfer.setWrapStyleWord(true);
		jTextAreadescripcionEmpleadoEnfer.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEmpleadoEnfer.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEmpleadoEnfer = new JScrollPane(jTextAreadescripcionEmpleadoEnfer);
		jscrollPanedescripcionEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEmpleadoEnferBusqueda= new JButtonMe();
		this.jButtondescripcionEmpleadoEnferBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoEnferBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoEnferBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEmpleadoEnferBusqueda.setText("U");
		this.jButtondescripcionEmpleadoEnferBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEmpleadoEnferBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEmpleadoEnferBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEmpleadoEnferBusqueda"));

		if(this.empleadoenferSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEmpleadoEnferBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoEnfer() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoEnfer = new JLabelMe();
		this.jLabelid_empresaEmpleadoEnfer.setText(""+EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoEnfer.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoEnfer=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoEnfer.setToolTipText(EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoEnfer = new GridBagLayout();
		this.jPanelid_empresaEmpleadoEnfer.setLayout(this.gridaBagLayoutEmpleadoEnfer);


		jComboBoxid_empresaEmpleadoEnfer= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoEnfer.setEnabled(false);

		this.jButtonid_empresaEmpleadoEnfer= new JButtonMe();
		this.jButtonid_empresaEmpleadoEnfer.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEnfer.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEnfer.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEnfer.setText("Buscar");
		this.jButtonid_empresaEmpleadoEnfer.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoEnfer.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEnfer,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEnfer"));

		this.jButtonid_empresaEmpleadoEnferBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoEnferBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEnferBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEnferBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoEnferBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoEnferBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoEnferBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEnferBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEnferBusqueda"));

		if(this.empleadoenferSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoEnferBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoEnferUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoEnferUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEnferUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEnferUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoEnferUpdate.setText("U");
		this.jButtonid_empresaEmpleadoEnferUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoEnferUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEnferUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEnferUpdate"));



					
		this.jLabelid_empleadoEmpleadoEnfer = new JLabelMe();
		this.jLabelid_empleadoEmpleadoEnfer.setText(""+EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoEnfer.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoEnfer=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoEnfer.setToolTipText(EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoEnfer = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoEnfer.setLayout(this.gridaBagLayoutEmpleadoEnfer);


		jComboBoxid_empleadoEmpleadoEnfer= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoEnfer= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEnfer.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEnfer.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEnfer.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEnfer.setText("Buscar");
		this.jButtonid_empleadoEmpleadoEnfer.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoEnfer.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEnfer,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEnfer"));

		this.jButtonid_empleadoEmpleadoEnferBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEnferBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEnferBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEnferBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoEnferBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoEnferBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoEnferBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEnferBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEnferBusqueda"));

		if(this.empleadoenferSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoEnferBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoEnferUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEnferUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEnferUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEnferUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoEnferUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoEnferUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoEnferUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEnferUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEnferUpdate"));



					
		this.jLabelid_enfermedadEmpleadoEnfer = new JLabelMe();
		this.jLabelid_enfermedadEmpleadoEnfer.setText(""+EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD+" : *");
		this.jLabelid_enfermedadEmpleadoEnfer.setToolTipText("Enfermedad");
		this.jLabelid_enfermedadEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_enfermedadEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_enfermedadEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_enfermedadEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_enfermedadEmpleadoEnfer=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_enfermedadEmpleadoEnfer.setToolTipText(EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD);
		this.gridaBagLayoutEmpleadoEnfer = new GridBagLayout();
		this.jPanelid_enfermedadEmpleadoEnfer.setLayout(this.gridaBagLayoutEmpleadoEnfer);


		jComboBoxid_enfermedadEmpleadoEnfer= new JComboBoxMe();
		jComboBoxid_enfermedadEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_enfermedadEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_enfermedadEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_enfermedadEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_enfermedadEmpleadoEnfer= new JButtonMe();
		this.jButtonid_enfermedadEmpleadoEnfer.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_enfermedadEmpleadoEnfer.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_enfermedadEmpleadoEnfer.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_enfermedadEmpleadoEnfer.setText("Buscar");
		this.jButtonid_enfermedadEmpleadoEnfer.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_enfermedadEmpleadoEnfer.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_enfermedadEmpleadoEnfer,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_enfermedadEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_enfermedadEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_enfermedadEmpleadoEnfer"));

		this.jButtonid_enfermedadEmpleadoEnferBusqueda= new JButtonMe();
		this.jButtonid_enfermedadEmpleadoEnferBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_enfermedadEmpleadoEnferBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_enfermedadEmpleadoEnferBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_enfermedadEmpleadoEnferBusqueda.setText("U");
		this.jButtonid_enfermedadEmpleadoEnferBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_enfermedadEmpleadoEnferBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_enfermedadEmpleadoEnferBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_enfermedadEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_enfermedadEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_enfermedadEmpleadoEnferBusqueda"));

		if(this.empleadoenferSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_enfermedadEmpleadoEnferBusqueda.setVisible(false);		}

		this.jButtonid_enfermedadEmpleadoEnferUpdate= new JButtonMe();
		this.jButtonid_enfermedadEmpleadoEnferUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_enfermedadEmpleadoEnferUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_enfermedadEmpleadoEnferUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_enfermedadEmpleadoEnferUpdate.setText("U");
		this.jButtonid_enfermedadEmpleadoEnferUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_enfermedadEmpleadoEnferUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_enfermedadEmpleadoEnferUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_enfermedadEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_enfermedadEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_enfermedadEmpleadoEnferUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoEnfer = new EmpleadoEnferBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Enfer DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoEnfer= new GridBagLayout();
		

		
		String sToolTipEmpleadoEnfer="";
		sToolTipEmpleadoEnfer=EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoEnfer+="(Nomina.EmpleadoEnfer)";
		}
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoEnfer+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoEnfer = new JButtonMe();
		this.jButtonModificarEmpleadoEnfer = new JButtonMe();
        this.jButtonActualizarEmpleadoEnfer = new JButtonMe();
        this.jButtonEliminarEmpleadoEnfer = new JButtonMe();
        this.jButtonCancelarEmpleadoEnfer = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoEnfer = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoEnfer = new JButtonMe();
		this.jButtonCerrarEmpleadoEnfer = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoEnfer = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoEnfer = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoEnfer = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Enfer";
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Enferes" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoEnfer.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoEnfer.setName("jPanelCamposEmpleadoEnfer"); 

		this.jPanelCamposOcultosEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoEnfer.setName("jPanelCamposOcultosEmpleadoEnfer"); 

        this.jPanelAccionesEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoEnfer.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoEnfer.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoEnfer.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoEnfer.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoEnfer.setText("Nuevo");
		this.jButtonModificarEmpleadoEnfer.setText("Editar");
        this.jButtonActualizarEmpleadoEnfer.setText("Actualizar");
        this.jButtonEliminarEmpleadoEnfer.setText("Eliminar");
        this.jButtonCancelarEmpleadoEnfer.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoEnfer.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.setText("Guardar");
		this.jButtonCerrarEmpleadoEnfer.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoEnfer,"nuevo_button","Nuevo",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoEnfer,"modificar_button","Editar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoEnfer,"actualizar_button","Actualizar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoEnfer,"eliminar_button","Eliminar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoEnfer,"cancelar_button","Cancelar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoEnfer,"guardarcambios_button","Guardar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoEnfer,"guardarcambiostabla_button","Guardar",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoEnfer,"cerrar_button","Salir",this.empleadoenferSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoEnfer.setToolTipText("Nuevo"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoEnfer.setToolTipText("Editar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoEnfer.setToolTipText("Actualizar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoEnfer.setToolTipText("Eliminar)"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoEnfer.setToolTipText("Cancelar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoEnfer.setToolTipText("Guardar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.setToolTipText("Guardar"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoEnfer.setToolTipText("Salir"+" "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoEnfer";
		inputMap = this.jButtonNuevoEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoEnfer.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoEnfer"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoEnfer";
		inputMap = this.jButtonActualizarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoEnfer"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoEnfer";
		inputMap = this.jButtonEliminarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoEnfer"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoEnfer";
		inputMap = this.jButtonCancelarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoEnfer"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoEnfer";
		inputMap = this.jButtonCerrarEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoEnfer"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoEnfer";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoEnfer.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoEnfer"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoEnfer = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoEnfer.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoEnfer.setToolTipText("Nuevo EmpleadoEnfer");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoEnfer = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoEnfer.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoEnfer.setToolTipText("Sin Cerrar Ventana EmpleadoEnfer");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoEnfer = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoEnfer.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoEnfer.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoEnfer.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoEnfer.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoEnfer = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoEnfer = new JLabelMe();
		
		this.jLabelAccionesEmpleadoEnfer.setText("Acciones");		
		this.jLabelAccionesEmpleadoEnfer.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEnfer.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEnfer.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoEnfer();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoEnfer();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoEnfer=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoEnfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoEnfer,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoEnfer.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEnfer.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEnfer.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoEnfer, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoEnfer = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoEnfer = new GridBagLayout();
		
		this.jPanelCamposEmpleadoEnfer.setLayout(gridaBagLayoutCamposEmpleadoEnfer);
		this.jPanelCamposOcultosEmpleadoEnfer.setLayout(gridaBagLayoutCamposOcultosEmpleadoEnfer);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoEnfer.add(jLabelIdEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 1;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoEnfer.add(jLabelidEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);


	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoEnfer.add(jLabelid_empresaEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 2;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoEnfer.add(jButtonid_empresaEmpleadoEnferBusqueda, this.gridBagConstraintsEmpleadoEnfer);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 3;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoEnfer.add(jButtonid_empresaEmpleadoEnferUpdate, this.gridBagConstraintsEmpleadoEnfer);
	}

	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 1;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoEnfer.add(jComboBoxid_empresaEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);


	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoEnfer.add(jLabelid_empleadoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 2;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmpleadoEnfer.add(jButtonid_empleadoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 3;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoEnfer.add(jButtonid_empleadoEmpleadoEnferBusqueda, this.gridBagConstraintsEmpleadoEnfer);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 4;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoEnfer.add(jButtonid_empleadoEmpleadoEnferUpdate, this.gridBagConstraintsEmpleadoEnfer);
	}

	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 1;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoEnfer.add(jComboBoxid_empleadoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);


	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_enfermedadEmpleadoEnfer.add(jLabelid_enfermedadEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 2;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_enfermedadEmpleadoEnfer.add(jButtonid_enfermedadEmpleadoEnferBusqueda, this.gridBagConstraintsEmpleadoEnfer);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 3;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_enfermedadEmpleadoEnfer.add(jButtonid_enfermedadEmpleadoEnferUpdate, this.gridBagConstraintsEmpleadoEnfer);
	}

	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 1;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_enfermedadEmpleadoEnfer.add(jComboBoxid_enfermedadEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);


	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEmpleadoEnfer.add(jLabeldescripcionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = 2;
		this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
		this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEmpleadoEnfer.add(jButtondescripcionEmpleadoEnferBusqueda, this.gridBagConstraintsEmpleadoEnfer);
	}

	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
	this.gridBagConstraintsEmpleadoEnfer.gridx = 1;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEmpleadoEnfer.add(jscrollPanedescripcionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEnfer.gridy = iYPanelCamposEmpleadoEnfer;
	this.gridBagConstraintsEmpleadoEnfer.gridx = iXPanelCamposEmpleadoEnfer++;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEnfer.add(this.jPanelidEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(iXPanelCamposEmpleadoEnfer % 1==0) {
		iXPanelCamposEmpleadoEnfer=0;
		iYPanelCamposEmpleadoEnfer++;
	}
	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEnfer.gridy = iYPanelCamposEmpleadoEnfer;
	this.gridBagConstraintsEmpleadoEnfer.gridx = iXPanelCamposEmpleadoEnfer++;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEnfer.add(this.jPanelid_empleadoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(iXPanelCamposEmpleadoEnfer % 1==0) {
		iXPanelCamposEmpleadoEnfer=0;
		iYPanelCamposEmpleadoEnfer++;
	}
	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEnfer.gridy = iYPanelCamposEmpleadoEnfer;
	this.gridBagConstraintsEmpleadoEnfer.gridx = iXPanelCamposEmpleadoEnfer++;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEnfer.add(this.jPanelid_enfermedadEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(iXPanelCamposEmpleadoEnfer % 1==0) {
		iXPanelCamposEmpleadoEnfer=0;
		iYPanelCamposEmpleadoEnfer++;
	}
	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEnfer.gridy = iYPanelCamposEmpleadoEnfer;
	this.gridBagConstraintsEmpleadoEnfer.gridx = iXPanelCamposEmpleadoEnfer++;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEnfer.add(this.jPaneldescripcionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(iXPanelCamposEmpleadoEnfer % 1==0) {
		iXPanelCamposEmpleadoEnfer=0;
		iYPanelCamposEmpleadoEnfer++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEnfer.gridy = iYPanelCamposOcultosEmpleadoEnfer;
	this.gridBagConstraintsEmpleadoEnfer.gridx = iXPanelCamposOcultosEmpleadoEnfer++;
	this.gridBagConstraintsEmpleadoEnfer.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEnfer.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoEnfer.add(this.jPanelid_empresaEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);



	if(iXPanelCamposOcultosEmpleadoEnfer % 1==0) {
		iXPanelCamposOcultosEmpleadoEnfer=0;
		iYPanelCamposOcultosEmpleadoEnfer++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoEnfer= new GridBagLayout();
		this.jPanelAccionesEmpleadoEnfer.setLayout(gridaBagLayoutAccionesEmpleadoEnfer);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoEnfer= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoEnfer.setLayout(gridaBagLayoutAccionesFormularioEmpleadoEnfer);
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoEnfer.add(this.jComboBoxTiposAccionesFormularioEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoEnfer.add(this.jCheckBoxPostAccionNuevoEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoEnfer.add(this.jCheckBoxPostAccionSinCerrarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoEnfer.add(this.jCheckBoxPostAccionSinMensajeEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoEnfer.add(this.jButtonModificarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);							

		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;
		this.gridBagConstraintsEmpleadoEnfer.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoEnfer.add(this.jButtonEliminarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
			
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEnfer.add(this.jButtonActualizarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);


		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEnfer.add(this.jButtonGuardarCambiosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);	
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = 0;		
		this.gridBagConstraintsEmpleadoEnfer.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEnfer.add(this.jButtonCancelarEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoEnfer = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoEnfer);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;		
			//this.gridBagConstraintsEmpleadoEnfer.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoEnfer.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEnfer.gridx =0;
		this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoEnfer.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoEnfer = new EmpleadoEnferBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Enfer DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Enfer DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Enfer Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoEnferModel empleadoenferModel=new EmpleadoEnferModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoEnferModel.EmpleadoEnferFocusTraversalPolicy empleadoenferFocusTraversalPolicy = empleadoenferModel.new EmpleadoEnferFocusTraversalPolicy(this);
			
			//empleadoenferFocusTraversalPolicy.setempleadoenferJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoenferModel);
			
			
			this.jContentPaneDetalleEmpleadoEnfer = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoEnfer = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoEnfer.setLayout(gridaBagLayoutDetalleEmpleadoEnfer);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoEnfer = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoEnfer.add(jTtoolBarDetalleEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoEnfer=   new JScrollPane(jContentPaneDetalleEmpleadoEnfer,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoEnfer.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEnfer.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEnfer.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoEnfer=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoEnfer.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEnfer.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEnfer.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoEnfer.add(jPanelCamposEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);
			
			
			
			
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
						&& empleadoenferSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoEnfer= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
						this.jContentPaneDetalleEmpleadoEnfer.add(this.jTabbedPaneRelacionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoEnfer.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoEnfer.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoEnfer.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoEnfer.add(jPanelCamposOcultosEmpleadoEnfer, gridBagConstraintsEmpleadoEnfer);
				
					this.jPanelCamposOcultosEmpleadoEnfer.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	        this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoEnfer.add(this.jPanelAccionesFormularioEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);							
			
			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoEnfer.add(this.jPanelAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoEnfer);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoEnfer=   new JScrollPane(this.jPanelCamposEmpleadoEnfer,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoEnfer.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEnfer.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEnfer.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
			this.gridBagConstraintsEmpleadoEnfer.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoEnfer.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoEnfer.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);			
			
			this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEnfer.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
			
			
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		
			
		this.gridBagConstraintsEmpleadoEnfer = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEnfer.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEnfer.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoEnfer, this.gridBagConstraintsEmpleadoEnfer);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoEnfer;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoEnfer;
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
