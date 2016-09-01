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
import com.bydan.erp.nomina.util.EmpleadoEMailConstantesFunciones;

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
public class EmpleadoEMailDetalleFormJInternalFrame extends EmpleadoEMailBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoEMail;
	
	protected JMenuBar jmenuBarDetalleEmpleadoEMail;
	
	protected JMenu jmenuDetalleEmpleadoEMail;
	protected JMenu jmenuDetalleArchivoEmpleadoEMail;
	protected JMenu jmenuDetalleAccionesEmpleadoEMail;
	protected JMenu jmenuDetalleDatosEmpleadoEMail;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoEMail;	
	protected GridBagConstraints gridBagConstraintsEmpleadoEMail;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoEMailBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoEMail;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public EmpleadoEMailSessionBean empleadoemailSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public EmpleadoEMailLogic empleadoemailLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoEMail;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoEMail;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoEMail;
	
	protected JPanel jPanelCamposEmpleadoEMail;    
	protected JPanel jPanelCamposOcultosEmpleadoEMail;    	
	protected JPanel jPanelAccionesEmpleadoEMail;
	protected JPanel jPanelAccionesFormularioEmpleadoEMail;
    
	
	
	protected Integer iXPanelCamposEmpleadoEMail=0;
	protected Integer iYPanelCamposEmpleadoEMail=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoEMail=0;
	protected Integer iYPanelCamposOcultosEmpleadoEMail=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoEMail;
	public JButton jButtonModificarEmpleadoEMail;
	public JButton jButtonActualizarEmpleadoEMail;
    public JButton jButtonEliminarEmpleadoEMail;
	public JButton jButtonCancelarEmpleadoEMail;
    public JButton jButtonGuardarCambiosEmpleadoEMail;
	public JButton jButtonGuardarCambiosTablaEmpleadoEMail;
	protected JButton jButtonCerrarEmpleadoEMail;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoEMail;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoEMail;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoEMail;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoEMail;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoEMail;
	protected JButton jButtonModificarToolBarEmpleadoEMail;
	protected JButton jButtonActualizarToolBarEmpleadoEMail;
    protected JButton jButtonEliminarToolBarEmpleadoEMail;
	protected JButton jButtonCancelarToolBarEmpleadoEMail;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoEMail;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoEMail;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoEMail;
	protected JButton jButtonCerrarToolBarEmpleadoEMail;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoEMail;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoEMail;
	protected JMenuItem jMenuItemModificarEmpleadoEMail;
	protected JMenuItem jMenuItemActualizarEmpleadoEMail;
    protected JMenuItem jMenuItemEliminarEmpleadoEMail;
	protected JMenuItem jMenuItemCancelarEmpleadoEMail;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoEMail;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoEMail;
	protected JMenuItem jMenuItemCerrarEmpleadoEMail;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoEMail;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoEMail;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoEMail;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoEMail;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoEMail;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoEMail;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoEMail;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoEMail;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoEMail;
	public JLabel jLabelIdEmpleadoEMail;
	public JLabel jLabelidEmpleadoEMail;
	public JButton jButtonidEmpleadoEMailBusqueda= new JButtonMe();

	public JPanel jPanele_mailEmpleadoEMail;
	public JLabel jLabele_mailEmpleadoEMail;
	public JTextArea jTextAreae_mailEmpleadoEMail;
	public JScrollPane jscrollPanee_mailEmpleadoEMail;
	public JButton jButtone_mailEmpleadoEMailBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEmpleadoEMail;
	public JLabel jLabeldescripcionEmpleadoEMail;
	public JTextArea jTextAreadescripcionEmpleadoEMail;
	public JScrollPane jscrollPanedescripcionEmpleadoEMail;
	public JButton jButtondescripcionEmpleadoEMailBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoEmpleadoEMail;
	public JLabel jLabelesta_activoEmpleadoEMail;
	public JCheckBox jCheckBoxesta_activoEmpleadoEMail;
	public JButton jButtonesta_activoEmpleadoEMailBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoEMail;
	public JLabel jLabelid_empresaEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoEMail;
	public JButton jButtonid_empresaEmpleadoEMail= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoEMailUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoEMailBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoEMail;
	public JLabel jLabelid_empleadoEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoEMail;
	public JButton jButtonid_empleadoEmpleadoEMail= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoEMailUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoEMailBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoEMail;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoEMailDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoEMail=new JPanel();
				this.jPanelAccionesFormularioEmpleadoEMail=new JPanel();
				this.jmenuBarDetalleEmpleadoEMail=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoEMail=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoEMailDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoEMail() {
		return this.jButtonActualizarToolBarEmpleadoEMail;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoEMail() {
		return this.jButtonEliminarToolBarEmpleadoEMail;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoEMail() {
		return this.jButtonCancelarToolBarEmpleadoEMail;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoEMail() {
		return this.jButtonProcesarInformacionEmpleadoEMail;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoEMail)	{
		this.jButtonProcesarInformacionEmpleadoEMail = jButtonProcesarInformacionEmpleadoEMail;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoEMail() {
		return this.jComboBoxTiposAccionesEmpleadoEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoEMail(
			JComboBox jComboBoxTiposRelacionesEmpleadoEMail) {
		this.jComboBoxTiposRelacionesEmpleadoEMail = jComboBoxTiposRelacionesEmpleadoEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoEMail(
			JComboBox jComboBoxTiposAccionesEmpleadoEMail) {
		this.jComboBoxTiposAccionesEmpleadoEMail = jComboBoxTiposAccionesEmpleadoEMail;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoEMail() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoEMail;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoEMail(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoEMail) {
		this.jComboBoxTiposAccionesFormularioEmpleadoEMail = jComboBoxTiposAccionesFormularioEmpleadoEMail;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		
		this.empleadoemailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoemailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoemailSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoEMailJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Email MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoEMailJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoEMail= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoEMail=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoEMail=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoEMail,this.jTtoolBarDetalleEmpleadoEMail,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoEMail,this.jTtoolBarDetalleEmpleadoEMail,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoEMail,this.jTtoolBarDetalleEmpleadoEMail,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoEMail,this.jTtoolBarDetalleEmpleadoEMail,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoEMail=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoEMail=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoEMail=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoEMail=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoEMail=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoEMail= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoEMail.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoEMail,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoEMail= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoEMail.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoEMail,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoEMail= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoEMail.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoEMail,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoEMail= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoEMail.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoEMail,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoEMail= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoEMail.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoEMail,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoEMail= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoEMail.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoEMail,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoEMail= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoEMail.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoEMail,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoEMail= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoEMail.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoEMail,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoEMail,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoEMail,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoEMail.add(this.jMenuItemDetalleCerrarEmpleadoEMail);
		
		this.jmenuDetalleAccionesEmpleadoEMail.add(this.jMenuItemActualizarEmpleadoEMail);
		this.jmenuDetalleAccionesEmpleadoEMail.add(this.jMenuItemEliminarEmpleadoEMail);
		this.jmenuDetalleAccionesEmpleadoEMail.add(this.jMenuItemCancelarEmpleadoEMail);		
		
		//this.jmenuDetalleDatosEmpleadoEMail.add(this.jMenuItemDetalleAbrirOrderByEmpleadoEMail);				
		this.jmenuDetalleDatosEmpleadoEMail.add(this.jMenuItemDetalleMostarOcultarEmpleadoEMail);				
				
		//this.jmenuDetalleAccionesEmpleadoEMail.add(this.jMenuItemGuardarCambiosEmpleadoEMail);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoEMail.add(this.jmenuDetalleArchivoEmpleadoEMail);		
		this.jmenuBarDetalleEmpleadoEMail.add(this.jmenuDetalleAccionesEmpleadoEMail);		
		this.jmenuBarDetalleEmpleadoEMail.add(this.jmenuDetalleDatosEmpleadoEMail);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoEMail);				
	}
	
	
	public void inicializarElementosCamposEmpleadoEMail() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoEMail = new JLabelMe();
		jLabelIdEmpleadoEMail.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoEMail = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoEMail.setToolTipText(EmpleadoEMailConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoEMail= new GridBagLayout();

		this.jPanelidEmpleadoEMail.setLayout(this.gridaBagLayoutEmpleadoEMail);

		jLabelidEmpleadoEMail = new JLabel();
		jLabelidEmpleadoEMail.setText("Id");

		jLabelidEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabele_mailEmpleadoEMail = new JLabelMe();
		this.jLabele_mailEmpleadoEMail.setText(""+EmpleadoEMailConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabele_mailEmpleadoEMail.setToolTipText("E Mail");
		this.jLabele_mailEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mailEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mailEmpleadoEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mailEmpleadoEMail.setToolTipText(EmpleadoEMailConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		this.jPanele_mailEmpleadoEMail.setLayout(this.gridaBagLayoutEmpleadoEMail);


		jTextAreae_mailEmpleadoEMail= new JTextAreaMe();
		jTextAreae_mailEmpleadoEMail.setEnabled(false);
		jTextAreae_mailEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailEmpleadoEMail.setLineWrap(true);
		jTextAreae_mailEmpleadoEMail.setWrapStyleWord(true);
		jTextAreae_mailEmpleadoEMail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreae_mailEmpleadoEMail.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreae_mailEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanee_mailEmpleadoEMail = new JScrollPane(jTextAreae_mailEmpleadoEMail);
		jscrollPanee_mailEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtone_mailEmpleadoEMailBusqueda= new JButtonMe();
		this.jButtone_mailEmpleadoEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailEmpleadoEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailEmpleadoEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mailEmpleadoEMailBusqueda.setText("U");
		this.jButtone_mailEmpleadoEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mailEmpleadoEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mailEmpleadoEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreae_mailEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreae_mailEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mailEmpleadoEMailBusqueda"));

		if(this.empleadoemailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mailEmpleadoEMailBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEmpleadoEMail = new JLabelMe();
		this.jLabeldescripcionEmpleadoEMail.setText(""+EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionEmpleadoEMail.setToolTipText("Descripcion");
		this.jLabeldescripcionEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEmpleadoEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEmpleadoEMail.setToolTipText(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		this.jPaneldescripcionEmpleadoEMail.setLayout(this.gridaBagLayoutEmpleadoEMail);


		jTextAreadescripcionEmpleadoEMail= new JTextAreaMe();
		jTextAreadescripcionEmpleadoEMail.setEnabled(false);
		jTextAreadescripcionEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEmpleadoEMail.setLineWrap(true);
		jTextAreadescripcionEmpleadoEMail.setWrapStyleWord(true);
		jTextAreadescripcionEmpleadoEMail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEmpleadoEMail.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEmpleadoEMail = new JScrollPane(jTextAreadescripcionEmpleadoEMail);
		jscrollPanedescripcionEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEmpleadoEMailBusqueda= new JButtonMe();
		this.jButtondescripcionEmpleadoEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEmpleadoEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEmpleadoEMailBusqueda.setText("U");
		this.jButtondescripcionEmpleadoEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEmpleadoEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEmpleadoEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEmpleadoEMailBusqueda"));

		if(this.empleadoemailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEmpleadoEMailBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoEmpleadoEMail = new JLabelMe();
		this.jLabelesta_activoEmpleadoEMail.setText(""+EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoEmpleadoEMail.setToolTipText("Esta Activo");
		this.jLabelesta_activoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoEmpleadoEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoEmpleadoEMail.setToolTipText(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		this.jPanelesta_activoEmpleadoEMail.setLayout(this.gridaBagLayoutEmpleadoEMail);


		jCheckBoxesta_activoEmpleadoEMail= new JCheckBoxMe();
		jCheckBoxesta_activoEmpleadoEMail.setEnabled(false);

		jCheckBoxesta_activoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoEmpleadoEMailBusqueda= new JButtonMe();
		this.jButtonesta_activoEmpleadoEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEmpleadoEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEmpleadoEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoEmpleadoEMailBusqueda.setText("U");
		this.jButtonesta_activoEmpleadoEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoEmpleadoEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoEmpleadoEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoEmpleadoEMailBusqueda"));

		if(this.empleadoemailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoEmpleadoEMailBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoEMail() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoEMail = new JLabelMe();
		this.jLabelid_empresaEmpleadoEMail.setText(""+EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoEMail.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoEMail.setToolTipText(EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		this.jPanelid_empresaEmpleadoEMail.setLayout(this.gridaBagLayoutEmpleadoEMail);


		jComboBoxid_empresaEmpleadoEMail= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoEMail.setEnabled(false);

		this.jButtonid_empresaEmpleadoEMail= new JButtonMe();
		this.jButtonid_empresaEmpleadoEMail.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEMail.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEMail.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoEMail.setText("Buscar");
		this.jButtonid_empresaEmpleadoEMail.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoEMail.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEMail,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEMail"));

		this.jButtonid_empresaEmpleadoEMailBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoEMailBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEMailBusqueda"));

		if(this.empleadoemailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoEMailBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoEMailUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoEMailUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEMailUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoEMailUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoEMailUpdate.setText("U");
		this.jButtonid_empresaEmpleadoEMailUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoEMailUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoEMailUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoEMailUpdate"));



					
		this.jLabelid_empleadoEmpleadoEMail = new JLabelMe();
		this.jLabelid_empleadoEmpleadoEMail.setText(""+EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoEMail.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoEMail.setToolTipText(EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoEMail.setLayout(this.gridaBagLayoutEmpleadoEMail);


		jComboBoxid_empleadoEmpleadoEMail= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoEMail= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEMail.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEMail.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEMail.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoEMail.setText("Buscar");
		this.jButtonid_empleadoEmpleadoEMail.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoEMail.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEMail,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEMail"));

		this.jButtonid_empleadoEmpleadoEMailBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoEMailBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEMailBusqueda"));

		if(this.empleadoemailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoEMailBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoEMailUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoEMailUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEMailUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoEMailUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoEMailUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoEMailUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoEMailUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoEMailUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoEMailUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoEMail = new EmpleadoEMailBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Email DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoEMail= new GridBagLayout();
		

		
		String sToolTipEmpleadoEMail="";
		sToolTipEmpleadoEMail=EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoEMail+="(Nomina.EmpleadoEMail)";
		}
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoEMail+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoEMail = new JButtonMe();
		this.jButtonModificarEmpleadoEMail = new JButtonMe();
        this.jButtonActualizarEmpleadoEMail = new JButtonMe();
        this.jButtonEliminarEmpleadoEMail = new JButtonMe();
        this.jButtonCancelarEmpleadoEMail = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoEMail = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoEMail = new JButtonMe();
		this.jButtonCerrarEmpleadoEMail = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoEMail = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoEMail = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoEMail = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Email";
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Emails" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoEMail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoEMail.setName("jPanelCamposEmpleadoEMail"); 

		this.jPanelCamposOcultosEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoEMail.setName("jPanelCamposOcultosEmpleadoEMail"); 

        this.jPanelAccionesEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoEMail.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoEMail.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoEMail.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoEMail.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoEMail.setText("Nuevo");
		this.jButtonModificarEmpleadoEMail.setText("Editar");
        this.jButtonActualizarEmpleadoEMail.setText("Actualizar");
        this.jButtonEliminarEmpleadoEMail.setText("Eliminar");
        this.jButtonCancelarEmpleadoEMail.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoEMail.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoEMail.setText("Guardar");
		this.jButtonCerrarEmpleadoEMail.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoEMail,"nuevo_button","Nuevo",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoEMail,"modificar_button","Editar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoEMail,"actualizar_button","Actualizar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoEMail,"eliminar_button","Eliminar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoEMail,"cancelar_button","Cancelar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoEMail,"guardarcambios_button","Guardar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoEMail,"guardarcambiostabla_button","Guardar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoEMail,"cerrar_button","Salir",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoEMail.setToolTipText("Nuevo"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoEMail.setToolTipText("Editar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoEMail.setToolTipText("Actualizar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoEMail.setToolTipText("Eliminar)"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoEMail.setToolTipText("Cancelar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoEMail.setToolTipText("Guardar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoEMail.setToolTipText("Guardar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoEMail.setToolTipText("Salir"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoEMail";
		inputMap = this.jButtonNuevoEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoEMail"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoEMail";
		inputMap = this.jButtonActualizarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoEMail"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoEMail";
		inputMap = this.jButtonEliminarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoEMail"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoEMail";
		inputMap = this.jButtonCancelarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoEMail"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoEMail";
		inputMap = this.jButtonCerrarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoEMail"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoEMail";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoEMail"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoEMail = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoEMail.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoEMail.setToolTipText("Nuevo EmpleadoEMail");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoEMail = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoEMail.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoEMail.setToolTipText("Sin Cerrar Ventana EmpleadoEMail");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoEMail = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoEMail.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoEMail.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoEMail.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoEMail.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoEMail.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoEMail.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoEMail = new JLabelMe();
		
		this.jLabelAccionesEmpleadoEMail.setText("Acciones");		
		this.jLabelAccionesEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoEMail();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoEMail();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoEMail=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoEMail.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoEMail.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoEMail.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoEMail = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoEMail = new GridBagLayout();
		
		this.jPanelCamposEmpleadoEMail.setLayout(gridaBagLayoutCamposEmpleadoEMail);
		this.jPanelCamposOcultosEmpleadoEMail.setLayout(gridaBagLayoutCamposOcultosEmpleadoEMail);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoEMail.add(jLabelIdEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 1;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoEMail.add(jLabelidEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoEMail.add(jLabelid_empresaEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 2;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoEMail.add(jButtonid_empresaEmpleadoEMailBusqueda, this.gridBagConstraintsEmpleadoEMail);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 3;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoEMail.add(jButtonid_empresaEmpleadoEMailUpdate, this.gridBagConstraintsEmpleadoEMail);
	}

	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 1;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoEMail.add(jComboBoxid_empresaEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoEMail.add(jLabelid_empleadoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 2;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoEmpleadoEMail.add(jButtonid_empleadoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 3;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoEMail.add(jButtonid_empleadoEmpleadoEMailBusqueda, this.gridBagConstraintsEmpleadoEMail);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 4;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoEMail.add(jButtonid_empleadoEmpleadoEMailUpdate, this.gridBagConstraintsEmpleadoEMail);
	}

	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 1;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoEMail.add(jComboBoxid_empleadoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mailEmpleadoEMail.add(jLabele_mailEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 2;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mailEmpleadoEMail.add(jButtone_mailEmpleadoEMailBusqueda, this.gridBagConstraintsEmpleadoEMail);
	}

	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 1;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mailEmpleadoEMail.add(jscrollPanee_mailEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEmpleadoEMail.add(jLabeldescripcionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 2;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEmpleadoEMail.add(jButtondescripcionEmpleadoEMailBusqueda, this.gridBagConstraintsEmpleadoEMail);
	}

	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 1;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEmpleadoEMail.add(jscrollPanedescripcionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoEmpleadoEMail.add(jLabelesta_activoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 2;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
		this.gridBagConstraintsEmpleadoEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoEmpleadoEMail.add(jButtonesta_activoEmpleadoEMailBusqueda, this.gridBagConstraintsEmpleadoEMail);
	}

	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoEMail.gridy = 0;
	this.gridBagConstraintsEmpleadoEMail.gridx = 1;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoEmpleadoEMail.add(jCheckBoxesta_activoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEMail.gridy = iYPanelCamposEmpleadoEMail;
	this.gridBagConstraintsEmpleadoEMail.gridx = iXPanelCamposEmpleadoEMail++;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEMail.add(this.jPanelidEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(iXPanelCamposEmpleadoEMail % 1==0) {
		iXPanelCamposEmpleadoEMail=0;
		iYPanelCamposEmpleadoEMail++;
	}
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEMail.gridy = iYPanelCamposEmpleadoEMail;
	this.gridBagConstraintsEmpleadoEMail.gridx = iXPanelCamposEmpleadoEMail++;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEMail.add(this.jPanelid_empleadoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(iXPanelCamposEmpleadoEMail % 1==0) {
		iXPanelCamposEmpleadoEMail=0;
		iYPanelCamposEmpleadoEMail++;
	}
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEMail.gridy = iYPanelCamposEmpleadoEMail;
	this.gridBagConstraintsEmpleadoEMail.gridx = iXPanelCamposEmpleadoEMail++;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEMail.add(this.jPanele_mailEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(iXPanelCamposEmpleadoEMail % 1==0) {
		iXPanelCamposEmpleadoEMail=0;
		iYPanelCamposEmpleadoEMail++;
	}
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEMail.gridy = iYPanelCamposEmpleadoEMail;
	this.gridBagConstraintsEmpleadoEMail.gridx = iXPanelCamposEmpleadoEMail++;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEMail.add(this.jPaneldescripcionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(iXPanelCamposEmpleadoEMail % 1==0) {
		iXPanelCamposEmpleadoEMail=0;
		iYPanelCamposEmpleadoEMail++;
	}
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEMail.gridy = iYPanelCamposEmpleadoEMail;
	this.gridBagConstraintsEmpleadoEMail.gridx = iXPanelCamposEmpleadoEMail++;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoEMail.add(this.jPanelesta_activoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(iXPanelCamposEmpleadoEMail % 1==0) {
		iXPanelCamposEmpleadoEMail=0;
		iYPanelCamposEmpleadoEMail++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoEMail.gridy = iYPanelCamposOcultosEmpleadoEMail;
	this.gridBagConstraintsEmpleadoEMail.gridx = iXPanelCamposOcultosEmpleadoEMail++;
	this.gridBagConstraintsEmpleadoEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoEMail.add(this.jPanelid_empresaEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);



	if(iXPanelCamposOcultosEmpleadoEMail % 1==0) {
		iXPanelCamposOcultosEmpleadoEMail=0;
		iYPanelCamposOcultosEmpleadoEMail++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoEMail= new GridBagLayout();
		this.jPanelAccionesEmpleadoEMail.setLayout(gridaBagLayoutAccionesEmpleadoEMail);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoEMail= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoEMail.setLayout(gridaBagLayoutAccionesFormularioEmpleadoEMail);
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoEMail.add(this.jComboBoxTiposAccionesFormularioEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoEMail.add(this.jCheckBoxPostAccionNuevoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoEMail.add(this.jCheckBoxPostAccionSinCerrarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoEMail.add(this.jCheckBoxPostAccionSinMensajeEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoEMail.add(this.jButtonModificarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);							

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoEMail.add(this.jButtonEliminarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
			
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEMail.add(this.jButtonActualizarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);


		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEMail.add(this.jButtonGuardarCambiosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);	
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;		
		this.gridBagConstraintsEmpleadoEMail.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoEMail.add(this.jButtonCancelarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoEMail);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;		
			//this.gridBagConstraintsEmpleadoEMail.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoEMail.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEMail.gridx =0;
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoEMail.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoEMail = new EmpleadoEMailBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Email DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Email DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Email Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoEMailModel empleadoemailModel=new EmpleadoEMailModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoEMailModel.EmpleadoEMailFocusTraversalPolicy empleadoemailFocusTraversalPolicy = empleadoemailModel.new EmpleadoEMailFocusTraversalPolicy(this);
			
			//empleadoemailFocusTraversalPolicy.setempleadoemailJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoemailModel);
			
			
			this.jContentPaneDetalleEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoEMail = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoEMail.setLayout(gridaBagLayoutDetalleEmpleadoEMail);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoEMail = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEMail.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoEMail.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoEMail.add(jTtoolBarDetalleEmpleadoEMail, gridBagConstraintsEmpleadoEMail);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoEMail=   new JScrollPane(jContentPaneDetalleEmpleadoEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoEMail=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoEMail.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoEMail.add(jPanelCamposEmpleadoEMail, gridBagConstraintsEmpleadoEMail);
			
			
			
			
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
						&& empleadoemailSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoEMail= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoEMail.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoEMail.gridx = 0;
						this.jContentPaneDetalleEmpleadoEMail.add(this.jTabbedPaneRelacionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoEMail.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoEMail.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoEMail.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoEMail.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoEMail.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoEMail.add(jPanelCamposOcultosEmpleadoEMail, gridBagConstraintsEmpleadoEMail);
				
					this.jPanelCamposOcultosEmpleadoEMail.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	        this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoEMail.add(this.jPanelAccionesFormularioEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);							
			
			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoEMail.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoEMail.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoEMail.add(this.jPanelAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoEMail);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoEMail=   new JScrollPane(this.jPanelCamposEmpleadoEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoEMail.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
			
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
			
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoEMail;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoEMail;
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
