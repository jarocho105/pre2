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
import com.bydan.erp.nomina.util.ProfesionEmpleaConstantesFunciones;

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
public class ProfesionEmpleaDetalleFormJInternalFrame extends ProfesionEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProfesionEmplea;
	
	protected JMenuBar jmenuBarDetalleProfesionEmplea;
	
	protected JMenu jmenuDetalleProfesionEmplea;
	protected JMenu jmenuDetalleArchivoProfesionEmplea;
	protected JMenu jmenuDetalleAccionesProfesionEmplea;
	protected JMenu jmenuDetalleDatosProfesionEmplea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProfesionEmplea;	
	protected GridBagConstraints gridBagConstraintsProfesionEmplea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProfesionEmpleaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProfesionEmplea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_profesion="";
	
	public ProfesionEmpleaSessionBean profesionempleaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public ProfesionSessionBean profesionSessionBean;	
	
	public ProfesionEmpleaLogic profesionempleaLogic;
	
	public JScrollPane jScrollPanelDatosProfesionEmplea;
	public JScrollPane jScrollPanelDatosEdicionProfesionEmplea;
	public JScrollPane jScrollPanelDatosGeneralProfesionEmplea;
	
	protected JPanel jPanelCamposProfesionEmplea;    
	protected JPanel jPanelCamposOcultosProfesionEmplea;    	
	protected JPanel jPanelAccionesProfesionEmplea;
	protected JPanel jPanelAccionesFormularioProfesionEmplea;
    
	
	
	protected Integer iXPanelCamposProfesionEmplea=0;
	protected Integer iYPanelCamposProfesionEmplea=0;
	
	protected Integer iXPanelCamposOcultosProfesionEmplea=0;
	protected Integer iYPanelCamposOcultosProfesionEmplea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProfesionEmplea;
	public JButton jButtonModificarProfesionEmplea;
	public JButton jButtonActualizarProfesionEmplea;
    public JButton jButtonEliminarProfesionEmplea;
	public JButton jButtonCancelarProfesionEmplea;
    public JButton jButtonGuardarCambiosProfesionEmplea;
	public JButton jButtonGuardarCambiosTablaProfesionEmplea;
	protected JButton jButtonCerrarProfesionEmplea;
	
	
	protected JButton jButtonProcesarInformacionProfesionEmplea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProfesionEmplea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProfesionEmplea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProfesionEmplea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProfesionEmplea;
	protected JButton jButtonModificarToolBarProfesionEmplea;
	protected JButton jButtonActualizarToolBarProfesionEmplea;
    protected JButton jButtonEliminarToolBarProfesionEmplea;
	protected JButton jButtonCancelarToolBarProfesionEmplea;
    protected JButton jButtonGuardarCambiosToolBarProfesionEmplea;
	protected JButton jButtonGuardarCambiosTablaToolBarProfesionEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarProfesionEmplea;
	protected JButton jButtonCerrarToolBarProfesionEmplea;
	
	protected JButton jButtonProcesarInformacionToolBarProfesionEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProfesionEmplea;
	protected JMenuItem jMenuItemModificarProfesionEmplea;
	protected JMenuItem jMenuItemActualizarProfesionEmplea;
    protected JMenuItem jMenuItemEliminarProfesionEmplea;
	protected JMenuItem jMenuItemCancelarProfesionEmplea;
    protected JMenuItem jMenuItemGuardarCambiosProfesionEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaProfesionEmplea;
	protected JMenuItem jMenuItemCerrarProfesionEmplea;
	protected JMenuItem jMenuItemDetalleCerrarProfesionEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarProfesionEmplea;
	
	protected JMenuItem jMenuItemProcesarInformacionProfesionEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProfesionEmplea;
	protected JMenuItem jMenuItemMostrarOcultarProfesionEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProfesionEmplea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProfesionEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProfesionEmplea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProfesionEmplea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProfesionEmplea;
	public JLabel jLabelIdProfesionEmplea;
	public JLabel jLabelidProfesionEmplea;
	public JButton jButtonidProfesionEmpleaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProfesionEmplea;
	public JLabel jLabelid_empresaProfesionEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProfesionEmplea;
	public JButton jButtonid_empresaProfesionEmplea= new JButtonMe();
	public JButton jButtonid_empresaProfesionEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_empresaProfesionEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoProfesionEmplea;
	public JLabel jLabelid_empleadoProfesionEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoProfesionEmplea;
	public JButton jButtonid_empleadoProfesionEmplea= new JButtonMe();
	public JButton jButtonid_empleadoProfesionEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoProfesionEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelid_profesionProfesionEmplea;
	public JLabel jLabelid_profesionProfesionEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_profesionProfesionEmplea;
	public JButton jButtonid_profesionProfesionEmplea= new JButtonMe();
	public JButton jButtonid_profesionProfesionEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_profesionProfesionEmpleaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProfesionEmplea;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProfesionEmpleaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProfesionEmplea=new JPanel();
				this.jPanelAccionesFormularioProfesionEmplea=new JPanel();
				this.jmenuBarDetalleProfesionEmplea=new JMenuBar();
				this.jTtoolBarDetalleProfesionEmplea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProfesionEmpleaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionEmpleaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProfesionEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProfesionEmplea() {
		return this.jButtonActualizarToolBarProfesionEmplea;
	}
	
	public JButton getjButtonEliminarToolBarProfesionEmplea() {
		return this.jButtonEliminarToolBarProfesionEmplea;
	}
	
	public JButton getjButtonCancelarToolBarProfesionEmplea() {
		return this.jButtonCancelarToolBarProfesionEmplea;
	}		
	
	public JButton getjButtonProcesarInformacionProfesionEmplea() {
		return this.jButtonProcesarInformacionProfesionEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProfesionEmplea)	{
		this.jButtonProcesarInformacionProfesionEmplea = jButtonProcesarInformacionProfesionEmplea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProfesionEmplea() {
		return this.jComboBoxTiposAccionesProfesionEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProfesionEmplea(
			JComboBox jComboBoxTiposRelacionesProfesionEmplea) {
		this.jComboBoxTiposRelacionesProfesionEmplea = jComboBoxTiposRelacionesProfesionEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProfesionEmplea(
			JComboBox jComboBoxTiposAccionesProfesionEmplea) {
		this.jComboBoxTiposAccionesProfesionEmplea = jComboBoxTiposAccionesProfesionEmplea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProfesionEmplea() {
		return this.jComboBoxTiposAccionesFormularioProfesionEmplea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProfesionEmplea(
			JComboBox jComboBoxTiposAccionesFormularioProfesionEmplea) {
		this.jComboBoxTiposAccionesFormularioProfesionEmplea = jComboBoxTiposAccionesFormularioProfesionEmplea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		
		this.profesionempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.profesionempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.profesionempleaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProfesionEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Profesion Emplea MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProfesionEmplea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProfesionEmplea=new JButtonMe();
				this.jButtonModificarToolBarProfesionEmplea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProfesionEmplea,this.jTtoolBarDetalleProfesionEmplea,
							"actualizar","actualizar","Actualizar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProfesionEmplea,this.jTtoolBarDetalleProfesionEmplea,
							"eliminar","eliminar","Eliminar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProfesionEmplea,this.jTtoolBarDetalleProfesionEmplea,
							"cancelar","cancelar","Cancelar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProfesionEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProfesionEmplea,this.jTtoolBarDetalleProfesionEmplea,
							"guardarcambios","guardarcambios","Guardar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProfesionEmplea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProfesionEmplea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProfesionEmplea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProfesionEmplea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProfesionEmplea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProfesionEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProfesionEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProfesionEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProfesionEmplea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProfesionEmplea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProfesionEmplea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProfesionEmplea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProfesionEmplea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProfesionEmplea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProfesionEmplea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProfesionEmplea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProfesionEmplea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProfesionEmplea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProfesionEmplea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProfesionEmplea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProfesionEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProfesionEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProfesionEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProfesionEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProfesionEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProfesionEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProfesionEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProfesionEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProfesionEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProfesionEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProfesionEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProfesionEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProfesionEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProfesionEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProfesionEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProfesionEmplea.add(this.jMenuItemDetalleCerrarProfesionEmplea);
		
		this.jmenuDetalleAccionesProfesionEmplea.add(this.jMenuItemActualizarProfesionEmplea);
		this.jmenuDetalleAccionesProfesionEmplea.add(this.jMenuItemEliminarProfesionEmplea);
		this.jmenuDetalleAccionesProfesionEmplea.add(this.jMenuItemCancelarProfesionEmplea);		
		
		//this.jmenuDetalleDatosProfesionEmplea.add(this.jMenuItemDetalleAbrirOrderByProfesionEmplea);				
		this.jmenuDetalleDatosProfesionEmplea.add(this.jMenuItemDetalleMostarOcultarProfesionEmplea);				
				
		//this.jmenuDetalleAccionesProfesionEmplea.add(this.jMenuItemGuardarCambiosProfesionEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProfesionEmplea.add(this.jmenuDetalleArchivoProfesionEmplea);		
		this.jmenuBarDetalleProfesionEmplea.add(this.jmenuDetalleAccionesProfesionEmplea);		
		this.jmenuBarDetalleProfesionEmplea.add(this.jmenuDetalleDatosProfesionEmplea);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProfesionEmplea);				
	}
	
	
	public void inicializarElementosCamposProfesionEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProfesionEmplea = new JLabelMe();
		jLabelIdProfesionEmplea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProfesionEmplea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProfesionEmplea.setToolTipText(ProfesionEmpleaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProfesionEmplea= new GridBagLayout();

		this.jPanelidProfesionEmplea.setLayout(this.gridaBagLayoutProfesionEmplea);

		jLabelidProfesionEmplea = new JLabel();
		jLabelidProfesionEmplea.setText("Id");

		jLabelidProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProfesionEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProfesionEmplea = new JLabelMe();
		this.jLabelid_empresaProfesionEmplea.setText(""+ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProfesionEmplea.setToolTipText("Empresa");
		this.jLabelid_empresaProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProfesionEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProfesionEmplea.setToolTipText(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProfesionEmplea = new GridBagLayout();
		this.jPanelid_empresaProfesionEmplea.setLayout(this.gridaBagLayoutProfesionEmplea);


		jComboBoxid_empresaProfesionEmplea= new JComboBoxMe();
		jComboBoxid_empresaProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProfesionEmplea.setEnabled(false);

		this.jButtonid_empresaProfesionEmplea= new JButtonMe();
		this.jButtonid_empresaProfesionEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProfesionEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProfesionEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProfesionEmplea.setText("Buscar");
		this.jButtonid_empresaProfesionEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProfesionEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProfesionEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProfesionEmplea"));

		this.jButtonid_empresaProfesionEmpleaBusqueda= new JButtonMe();
		this.jButtonid_empresaProfesionEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProfesionEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProfesionEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProfesionEmpleaBusqueda.setText("U");
		this.jButtonid_empresaProfesionEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProfesionEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProfesionEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProfesionEmpleaBusqueda"));

		if(this.profesionempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProfesionEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_empresaProfesionEmpleaUpdate= new JButtonMe();
		this.jButtonid_empresaProfesionEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProfesionEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProfesionEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProfesionEmpleaUpdate.setText("U");
		this.jButtonid_empresaProfesionEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProfesionEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProfesionEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProfesionEmpleaUpdate"));



					
		this.jLabelid_empleadoProfesionEmplea = new JLabelMe();
		this.jLabelid_empleadoProfesionEmplea.setText(""+ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoProfesionEmplea.setToolTipText("Empleado");
		this.jLabelid_empleadoProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoProfesionEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoProfesionEmplea.setToolTipText(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutProfesionEmplea = new GridBagLayout();
		this.jPanelid_empleadoProfesionEmplea.setLayout(this.gridaBagLayoutProfesionEmplea);


		jComboBoxid_empleadoProfesionEmplea= new JComboBoxMe();
		jComboBoxid_empleadoProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoProfesionEmplea= new JButtonMe();
		this.jButtonid_empleadoProfesionEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProfesionEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProfesionEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProfesionEmplea.setText("Buscar");
		this.jButtonid_empleadoProfesionEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoProfesionEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProfesionEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProfesionEmplea"));

		this.jButtonid_empleadoProfesionEmpleaBusqueda= new JButtonMe();
		this.jButtonid_empleadoProfesionEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProfesionEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProfesionEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProfesionEmpleaBusqueda.setText("U");
		this.jButtonid_empleadoProfesionEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoProfesionEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProfesionEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProfesionEmpleaBusqueda"));

		if(this.profesionempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoProfesionEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoProfesionEmpleaUpdate= new JButtonMe();
		this.jButtonid_empleadoProfesionEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProfesionEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProfesionEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProfesionEmpleaUpdate.setText("U");
		this.jButtonid_empleadoProfesionEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoProfesionEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProfesionEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProfesionEmpleaUpdate"));



					
		this.jLabelid_profesionProfesionEmplea = new JLabelMe();
		this.jLabelid_profesionProfesionEmplea.setText(""+ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION+" : *");
		this.jLabelid_profesionProfesionEmplea.setToolTipText("Profesion");
		this.jLabelid_profesionProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_profesionProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_profesionProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_profesionProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_profesionProfesionEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_profesionProfesionEmplea.setToolTipText(ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION);
		this.gridaBagLayoutProfesionEmplea = new GridBagLayout();
		this.jPanelid_profesionProfesionEmplea.setLayout(this.gridaBagLayoutProfesionEmplea);


		jComboBoxid_profesionProfesionEmplea= new JComboBoxMe();
		jComboBoxid_profesionProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_profesionProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_profesionProfesionEmplea= new JButtonMe();
		this.jButtonid_profesionProfesionEmplea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionProfesionEmplea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionProfesionEmplea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionProfesionEmplea.setText("Buscar");
		this.jButtonid_profesionProfesionEmplea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_profesionProfesionEmplea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionProfesionEmplea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_profesionProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionProfesionEmplea"));

		this.jButtonid_profesionProfesionEmpleaBusqueda= new JButtonMe();
		this.jButtonid_profesionProfesionEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionProfesionEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionProfesionEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_profesionProfesionEmpleaBusqueda.setText("U");
		this.jButtonid_profesionProfesionEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_profesionProfesionEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionProfesionEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_profesionProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionProfesionEmpleaBusqueda"));

		if(this.profesionempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_profesionProfesionEmpleaBusqueda.setVisible(false);		}

		this.jButtonid_profesionProfesionEmpleaUpdate= new JButtonMe();
		this.jButtonid_profesionProfesionEmpleaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionProfesionEmpleaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionProfesionEmpleaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_profesionProfesionEmpleaUpdate.setText("U");
		this.jButtonid_profesionProfesionEmpleaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_profesionProfesionEmpleaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionProfesionEmpleaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_profesionProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionProfesionEmpleaUpdate"));



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
		//this.jInternalFrameDetalleProfesionEmplea = new ProfesionEmpleaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Profesion Emplea DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProfesionEmplea= new GridBagLayout();
		

		
		String sToolTipProfesionEmplea="";
		sToolTipProfesionEmplea=ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProfesionEmplea+="(Nomina.ProfesionEmplea)";
		}
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProfesionEmplea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProfesionEmplea = new JButtonMe();
		this.jButtonModificarProfesionEmplea = new JButtonMe();
        this.jButtonActualizarProfesionEmplea = new JButtonMe();
        this.jButtonEliminarProfesionEmplea = new JButtonMe();
        this.jButtonCancelarProfesionEmplea = new JButtonMe();
        this.jButtonGuardarCambiosProfesionEmplea = new JButtonMe();
		this.jButtonGuardarCambiosTablaProfesionEmplea = new JButtonMe();
		this.jButtonCerrarProfesionEmplea = new JButtonMe();
		
		this.jScrollPanelDatosProfesionEmplea = new JScrollPane();   
        this.jScrollPanelDatosEdicionProfesionEmplea = new JScrollPane();
		this.jScrollPanelDatosGeneralProfesionEmplea = new JScrollPane();
				
		
		
		this.jPanelCamposProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Profesion Emplea";
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesion Empleas" + this.sPath));
		} else {
			this.jScrollPanelDatosProfesionEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProfesionEmplea.setName("jPanelCamposProfesionEmplea"); 

		this.jPanelCamposOcultosProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProfesionEmplea.setName("jPanelCamposOcultosProfesionEmplea"); 

        this.jPanelAccionesProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProfesionEmplea.setToolTipText("Acciones");
        this.jPanelAccionesProfesionEmplea.setName("Acciones"); 

		this.jPanelAccionesFormularioProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProfesionEmplea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProfesionEmplea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProfesionEmplea.setText("Nuevo");
		this.jButtonModificarProfesionEmplea.setText("Editar");
        this.jButtonActualizarProfesionEmplea.setText("Actualizar");
        this.jButtonEliminarProfesionEmplea.setText("Eliminar");
        this.jButtonCancelarProfesionEmplea.setText("Cancelar");
        this.jButtonGuardarCambiosProfesionEmplea.setText("Guardar");
		this.jButtonGuardarCambiosTablaProfesionEmplea.setText("Guardar");
		this.jButtonCerrarProfesionEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProfesionEmplea,"nuevo_button","Nuevo",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProfesionEmplea,"modificar_button","Editar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProfesionEmplea,"actualizar_button","Actualizar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProfesionEmplea,"eliminar_button","Eliminar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProfesionEmplea,"cancelar_button","Cancelar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProfesionEmplea,"guardarcambios_button","Guardar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProfesionEmplea,"guardarcambiostabla_button","Guardar",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProfesionEmplea,"cerrar_button","Salir",this.profesionempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProfesionEmplea.setToolTipText("Nuevo"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProfesionEmplea.setToolTipText("Editar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProfesionEmplea.setToolTipText("Actualizar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProfesionEmplea.setToolTipText("Eliminar)"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProfesionEmplea.setToolTipText("Cancelar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProfesionEmplea.setToolTipText("Guardar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProfesionEmplea.setToolTipText("Guardar"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProfesionEmplea.setToolTipText("Salir"+" "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProfesionEmplea";
		inputMap = this.jButtonNuevoProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProfesionEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProfesionEmplea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProfesionEmplea";
		inputMap = this.jButtonActualizarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProfesionEmplea"));
		
		//ELIMINAR
		sMapKey = "EliminarProfesionEmplea";
		inputMap = this.jButtonEliminarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProfesionEmplea"));
		
		//CANCELAR	
		sMapKey = "CancelarProfesionEmplea";
		inputMap = this.jButtonCancelarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProfesionEmplea"));
		
		//CERRAR		
		sMapKey = "CerrarProfesionEmplea";
		inputMap = this.jButtonCerrarProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProfesionEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProfesionEmplea";
		inputMap = this.jButtonGuardarCambiosTablaProfesionEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProfesionEmplea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProfesionEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProfesionEmplea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProfesionEmplea.setToolTipText("Nuevo ProfesionEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProfesionEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProfesionEmplea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProfesionEmplea.setToolTipText("Sin Cerrar Ventana ProfesionEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProfesionEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProfesionEmplea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProfesionEmplea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProfesionEmplea.setText("Accion");
		this.jComboBoxTiposAccionesProfesionEmplea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProfesionEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProfesionEmplea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProfesionEmplea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProfesionEmplea = new JLabelMe();
		
		this.jLabelAccionesProfesionEmplea.setText("Acciones");		
		this.jLabelAccionesProfesionEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesionEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesionEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProfesionEmplea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProfesionEmplea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProfesionEmplea=new JTabbedPane();
		this.jTabbedPaneRelacionesProfesionEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProfesionEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProfesionEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesionEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesionEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProfesionEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProfesionEmplea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProfesionEmplea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProfesionEmplea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProfesionEmplea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProfesionEmplea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProfesionEmplea = new GridBagLayout();
		
		this.jPanelCamposProfesionEmplea.setLayout(gridaBagLayoutCamposProfesionEmplea);
		this.jPanelCamposOcultosProfesionEmplea.setLayout(gridaBagLayoutCamposOcultosProfesionEmplea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 0;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProfesionEmplea.add(jLabelIdProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 1;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProfesionEmplea.add(jLabelidProfesionEmplea, this.gridBagConstraintsProfesionEmplea);


	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 0;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProfesionEmplea.add(jLabelid_empresaProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 2;
		this.gridBagConstraintsProfesionEmplea.ipadx = 0;
		this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProfesionEmplea.add(jButtonid_empresaProfesionEmpleaBusqueda, this.gridBagConstraintsProfesionEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 3;
		this.gridBagConstraintsProfesionEmplea.ipadx = 0;
		this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProfesionEmplea.add(jButtonid_empresaProfesionEmpleaUpdate, this.gridBagConstraintsProfesionEmplea);
	}

	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 1;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProfesionEmplea.add(jComboBoxid_empresaProfesionEmplea, this.gridBagConstraintsProfesionEmplea);


	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 0;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoProfesionEmplea.add(jLabelid_empleadoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 2;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoProfesionEmplea.add(jButtonid_empleadoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 3;
		this.gridBagConstraintsProfesionEmplea.ipadx = 0;
		this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProfesionEmplea.add(jButtonid_empleadoProfesionEmpleaBusqueda, this.gridBagConstraintsProfesionEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 4;
		this.gridBagConstraintsProfesionEmplea.ipadx = 0;
		this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProfesionEmplea.add(jButtonid_empleadoProfesionEmpleaUpdate, this.gridBagConstraintsProfesionEmplea);
	}

	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 1;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoProfesionEmplea.add(jComboBoxid_empleadoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);


	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 0;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_profesionProfesionEmplea.add(jLabelid_profesionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 2;
		this.gridBagConstraintsProfesionEmplea.ipadx = 0;
		this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_profesionProfesionEmplea.add(jButtonid_profesionProfesionEmpleaBusqueda, this.gridBagConstraintsProfesionEmplea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		//this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = 3;
		this.gridBagConstraintsProfesionEmplea.ipadx = 0;
		this.gridBagConstraintsProfesionEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_profesionProfesionEmplea.add(jButtonid_profesionProfesionEmpleaUpdate, this.gridBagConstraintsProfesionEmplea);
	}

	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesionEmplea.gridy = 0;
	this.gridBagConstraintsProfesionEmplea.gridx = 1;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_profesionProfesionEmplea.add(jComboBoxid_profesionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesionEmplea.gridy = iYPanelCamposProfesionEmplea;
	this.gridBagConstraintsProfesionEmplea.gridx = iXPanelCamposProfesionEmplea++;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProfesionEmplea.add(this.jPanelidProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(iXPanelCamposProfesionEmplea % 1==0) {
		iXPanelCamposProfesionEmplea=0;
		iYPanelCamposProfesionEmplea++;
	}
	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesionEmplea.gridy = iYPanelCamposProfesionEmplea;
	this.gridBagConstraintsProfesionEmplea.gridx = iXPanelCamposProfesionEmplea++;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProfesionEmplea.add(this.jPanelid_empleadoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(iXPanelCamposProfesionEmplea % 1==0) {
		iXPanelCamposProfesionEmplea=0;
		iYPanelCamposProfesionEmplea++;
	}
	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesionEmplea.gridy = iYPanelCamposProfesionEmplea;
	this.gridBagConstraintsProfesionEmplea.gridx = iXPanelCamposProfesionEmplea++;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProfesionEmplea.add(this.jPanelid_profesionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(iXPanelCamposProfesionEmplea % 1==0) {
		iXPanelCamposProfesionEmplea=0;
		iYPanelCamposProfesionEmplea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesionEmplea.gridy = iYPanelCamposOcultosProfesionEmplea;
	this.gridBagConstraintsProfesionEmplea.gridx = iXPanelCamposOcultosProfesionEmplea++;
	this.gridBagConstraintsProfesionEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesionEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProfesionEmplea.add(this.jPanelid_empresaProfesionEmplea, this.gridBagConstraintsProfesionEmplea);



	if(iXPanelCamposOcultosProfesionEmplea % 1==0) {
		iXPanelCamposOcultosProfesionEmplea=0;
		iYPanelCamposOcultosProfesionEmplea++;
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
			
		GridBagLayout gridaBagLayoutAccionesProfesionEmplea= new GridBagLayout();
		this.jPanelAccionesProfesionEmplea.setLayout(gridaBagLayoutAccionesProfesionEmplea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProfesionEmplea= new GridBagLayout();
		this.jPanelAccionesFormularioProfesionEmplea.setLayout(gridaBagLayoutAccionesFormularioProfesionEmplea);
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProfesionEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProfesionEmplea.add(this.jComboBoxTiposAccionesFormularioProfesionEmplea, this.gridBagConstraintsProfesionEmplea);

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProfesionEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProfesionEmplea.add(this.jCheckBoxPostAccionNuevoProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProfesionEmplea.add(this.jCheckBoxPostAccionSinCerrarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProfesionEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProfesionEmplea.add(this.jCheckBoxPostAccionSinMensajeProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccion++;
			
		this.jPanelAccionesProfesionEmplea.add(this.jButtonModificarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);							

		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesionEmplea.gridy = 0;
		this.gridBagConstraintsProfesionEmplea.gridx =iPosXAccion++;
			
		this.jPanelAccionesProfesionEmplea.add(this.jButtonEliminarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
			
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = 0;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesProfesionEmplea.add(this.jButtonActualizarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);


		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = 0;		
		this.gridBagConstraintsProfesionEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesProfesionEmplea.add(this.jButtonGuardarCambiosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);	
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = 0;		
		this.gridBagConstraintsProfesionEmplea.gridx =iPosXAccion++;
		
		this.jPanelAccionesProfesionEmplea.add(this.jButtonCancelarProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProfesionEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProfesionEmplea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();						
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProfesionEmplea.gridx = 0;		
			//this.gridBagConstraintsProfesionEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProfesionEmplea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProfesionEmplea.gridx =0;
		this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProfesionEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProfesionEmplea = new ProfesionEmpleaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Profesion Emplea DATOS");
			
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
			
	        //this.setTitle("[FOR] - Profesion Emplea DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Profesion Emplea Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProfesionEmpleaModel profesionempleaModel=new ProfesionEmpleaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProfesionEmpleaModel.ProfesionEmpleaFocusTraversalPolicy profesionempleaFocusTraversalPolicy = profesionempleaModel.new ProfesionEmpleaFocusTraversalPolicy(this);
			
			//profesionempleaFocusTraversalPolicy.setprofesionempleaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(profesionempleaModel);
			
			
			this.jContentPaneDetalleProfesionEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProfesionEmplea = new GridBagLayout();	
			this.jContentPaneDetalleProfesionEmplea.setLayout(gridaBagLayoutDetalleProfesionEmplea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProfesionEmplea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
				this.gridBagConstraintsProfesionEmplea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProfesionEmplea.gridx = 0;
					
				
				this.jContentPaneDetalleProfesionEmplea.add(jTtoolBarDetalleProfesionEmplea, gridBagConstraintsProfesionEmplea);								
				
}
			
			this.jScrollPanelDatosEdicionProfesionEmplea=   new JScrollPane(jContentPaneDetalleProfesionEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProfesionEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesionEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesionEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProfesionEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProfesionEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesionEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesionEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProfesionEmplea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProfesionEmplea.gridx = 0;
	        
			this.jContentPaneDetalleProfesionEmplea.add(jPanelCamposProfesionEmplea, gridBagConstraintsProfesionEmplea);
			
			
			
			
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
						&& profesionempleaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProfesionEmplea= new GridBagConstraints();
						this.gridBagConstraintsProfesionEmplea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProfesionEmplea.gridx = 0;
						this.jContentPaneDetalleProfesionEmplea.add(this.jTabbedPaneRelacionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProfesionEmplea.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProfesionEmplea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
					this.gridBagConstraintsProfesionEmplea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProfesionEmplea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProfesionEmplea.gridx = 0;
					
				
					this.jContentPaneDetalleProfesionEmplea.add(jPanelCamposOcultosProfesionEmplea, gridBagConstraintsProfesionEmplea);
				
					this.jPanelCamposOcultosProfesionEmplea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProfesionEmplea.gridx = 0;
	        this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProfesionEmplea.add(this.jPanelAccionesFormularioProfesionEmplea, this.gridBagConstraintsProfesionEmplea);							
			
			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
	        this.gridBagConstraintsProfesionEmplea.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProfesionEmplea.gridx = 0;
	        
			
			this.jContentPaneDetalleProfesionEmplea.add(this.jPanelAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProfesionEmplea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProfesionEmplea=   new JScrollPane(this.jPanelCamposProfesionEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProfesionEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesionEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesionEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProfesionEmplea.gridx = 0;
			this.gridBagConstraintsProfesionEmplea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProfesionEmplea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProfesionEmplea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProfesionEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProfesionEmplea, this.gridBagConstraintsProfesionEmplea);			
			
			this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
			this.gridBagConstraintsProfesionEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProfesionEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
			
			
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		
			
		this.gridBagConstraintsProfesionEmplea = new GridBagConstraints();
		this.gridBagConstraintsProfesionEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProfesionEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProfesionEmplea, this.gridBagConstraintsProfesionEmplea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProfesionEmplea;//jContentPane;
		
		return jScrollPanelDatosEdicionProfesionEmplea;
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
