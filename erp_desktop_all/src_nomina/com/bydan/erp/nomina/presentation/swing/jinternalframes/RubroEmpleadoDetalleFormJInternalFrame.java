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
import com.bydan.erp.nomina.util.RubroEmpleadoConstantesFunciones;

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
public class RubroEmpleadoDetalleFormJInternalFrame extends RubroEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRubroEmpleado;
	
	protected JMenuBar jmenuBarDetalleRubroEmpleado;
	
	protected JMenu jmenuDetalleRubroEmpleado;
	protected JMenu jmenuDetalleArchivoRubroEmpleado;
	protected JMenu jmenuDetalleAccionesRubroEmpleado;
	protected JMenu jmenuDetalleDatosRubroEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEmpleado;	
	protected GridBagConstraints gridBagConstraintsRubroEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RubroEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleRubroEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected EstadoRubroBeanSwingJInternalFrame estadorubroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadorubro="";
	
	public RubroEmpleadoSessionBean rubroempleadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public EstadoRubroSessionBean estadorubroSessionBean;	
	
	public RubroEmpleadoLogic rubroempleadoLogic;
	
	public JScrollPane jScrollPanelDatosRubroEmpleado;
	public JScrollPane jScrollPanelDatosEdicionRubroEmpleado;
	public JScrollPane jScrollPanelDatosGeneralRubroEmpleado;
	
	protected JPanel jPanelCamposRubroEmpleado;    
	protected JPanel jPanelCamposOcultosRubroEmpleado;    	
	protected JPanel jPanelAccionesRubroEmpleado;
	protected JPanel jPanelAccionesFormularioRubroEmpleado;
    
	
	
	protected Integer iXPanelCamposRubroEmpleado=0;
	protected Integer iYPanelCamposRubroEmpleado=0;
	
	protected Integer iXPanelCamposOcultosRubroEmpleado=0;
	protected Integer iYPanelCamposOcultosRubroEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRubroEmpleado;
	public JButton jButtonModificarRubroEmpleado;
	public JButton jButtonActualizarRubroEmpleado;
    public JButton jButtonEliminarRubroEmpleado;
	public JButton jButtonCancelarRubroEmpleado;
    public JButton jButtonGuardarCambiosRubroEmpleado;
	public JButton jButtonGuardarCambiosTablaRubroEmpleado;
	protected JButton jButtonCerrarRubroEmpleado;
	
	
	protected JButton jButtonProcesarInformacionRubroEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRubroEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRubroEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRubroEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEmpleado;
	protected JButton jButtonModificarToolBarRubroEmpleado;
	protected JButton jButtonActualizarToolBarRubroEmpleado;
    protected JButton jButtonEliminarToolBarRubroEmpleado;
	protected JButton jButtonCancelarToolBarRubroEmpleado;
    protected JButton jButtonGuardarCambiosToolBarRubroEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarRubroEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEmpleado;
	protected JButton jButtonCerrarToolBarRubroEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarRubroEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEmpleado;
	protected JMenuItem jMenuItemModificarRubroEmpleado;
	protected JMenuItem jMenuItemActualizarRubroEmpleado;
    protected JMenuItem jMenuItemEliminarRubroEmpleado;
	protected JMenuItem jMenuItemCancelarRubroEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosRubroEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEmpleado;
	protected JMenuItem jMenuItemCerrarRubroEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarRubroEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionRubroEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarRubroEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRubroEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRubroEmpleado;
	public JLabel jLabelIdRubroEmpleado;
	public JLabel jLabelidRubroEmpleado;
	public JButton jButtonidRubroEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalorRubroEmpleado;
	public JLabel jLabelvalorRubroEmpleado;
	public JTextField jTextFieldvalorRubroEmpleado;
	public JButton jButtonvalorRubroEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRubroEmpleado;
	public JLabel jLabelid_empresaRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRubroEmpleado;
	public JButton jButtonid_empresaRubroEmpleado= new JButtonMe();
	public JButton jButtonid_empresaRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaRubroEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoRubroEmpleado;
	public JLabel jLabelid_empleadoRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoRubroEmpleado;
	public JButton jButtonid_empleadoRubroEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoRubroEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaRubroEmpleado;
	public JLabel jLabelid_rubro_empleaRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaRubroEmpleado;
	public JButton jButtonid_rubro_empleaRubroEmpleado= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubroEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_rubroRubroEmpleado;
	public JLabel jLabelid_estado_rubroRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_rubroRubroEmpleado;
	public JButton jButtonid_estado_rubroRubroEmpleado= new JButtonMe();
	public JButton jButtonid_estado_rubroRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_rubroRubroEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRubroEmpleado;
	
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
	
	public RubroEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRubroEmpleado=new JPanel();
				this.jPanelAccionesFormularioRubroEmpleado=new JPanel();
				this.jmenuBarDetalleRubroEmpleado=new JMenuBar();
				this.jTtoolBarDetalleRubroEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RubroEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRubroEmpleado() {
		return this.jButtonActualizarToolBarRubroEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarRubroEmpleado() {
		return this.jButtonEliminarToolBarRubroEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarRubroEmpleado() {
		return this.jButtonCancelarToolBarRubroEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionRubroEmpleado() {
		return this.jButtonProcesarInformacionRubroEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEmpleado)	{
		this.jButtonProcesarInformacionRubroEmpleado = jButtonProcesarInformacionRubroEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEmpleado() {
		return this.jComboBoxTiposAccionesRubroEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEmpleado(
			JComboBox jComboBoxTiposRelacionesRubroEmpleado) {
		this.jComboBoxTiposRelacionesRubroEmpleado = jComboBoxTiposRelacionesRubroEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEmpleado(
			JComboBox jComboBoxTiposAccionesRubroEmpleado) {
		this.jComboBoxTiposAccionesRubroEmpleado = jComboBoxTiposAccionesRubroEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRubroEmpleado() {
		return this.jComboBoxTiposAccionesFormularioRubroEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRubroEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioRubroEmpleado) {
		this.jComboBoxTiposAccionesFormularioRubroEmpleado = jComboBoxTiposAccionesFormularioRubroEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		
		this.rubroempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRubroEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRubroEmpleado=new JButtonMe();
				this.jButtonModificarToolBarRubroEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRubroEmpleado,this.jTtoolBarDetalleRubroEmpleado,
							"actualizar","actualizar","Actualizar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRubroEmpleado,this.jTtoolBarDetalleRubroEmpleado,
							"eliminar","eliminar","Eliminar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRubroEmpleado,this.jTtoolBarDetalleRubroEmpleado,
							"cancelar","cancelar","Cancelar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRubroEmpleado,this.jTtoolBarDetalleRubroEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRubroEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRubroEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRubroEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRubroEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRubroEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRubroEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRubroEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRubroEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRubroEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRubroEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRubroEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRubroEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRubroEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRubroEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRubroEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRubroEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRubroEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRubroEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRubroEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRubroEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRubroEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRubroEmpleado.add(this.jMenuItemDetalleCerrarRubroEmpleado);
		
		this.jmenuDetalleAccionesRubroEmpleado.add(this.jMenuItemActualizarRubroEmpleado);
		this.jmenuDetalleAccionesRubroEmpleado.add(this.jMenuItemEliminarRubroEmpleado);
		this.jmenuDetalleAccionesRubroEmpleado.add(this.jMenuItemCancelarRubroEmpleado);		
		
		//this.jmenuDetalleDatosRubroEmpleado.add(this.jMenuItemDetalleAbrirOrderByRubroEmpleado);				
		this.jmenuDetalleDatosRubroEmpleado.add(this.jMenuItemDetalleMostarOcultarRubroEmpleado);				
				
		//this.jmenuDetalleAccionesRubroEmpleado.add(this.jMenuItemGuardarCambiosRubroEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRubroEmpleado.add(this.jmenuDetalleArchivoRubroEmpleado);		
		this.jmenuBarDetalleRubroEmpleado.add(this.jmenuDetalleAccionesRubroEmpleado);		
		this.jmenuBarDetalleRubroEmpleado.add(this.jmenuDetalleDatosRubroEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRubroEmpleado);				
	}
	
	
	public void inicializarElementosCamposRubroEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRubroEmpleado = new JLabelMe();
		jLabelIdRubroEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRubroEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRubroEmpleado.setToolTipText(RubroEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRubroEmpleado= new GridBagLayout();

		this.jPanelidRubroEmpleado.setLayout(this.gridaBagLayoutRubroEmpleado);

		jLabelidRubroEmpleado = new JLabel();
		jLabelidRubroEmpleado.setText("Id");

		jLabelidRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorRubroEmpleado = new JLabelMe();
		this.jLabelvalorRubroEmpleado.setText(""+RubroEmpleadoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRubroEmpleado.setToolTipText("Valor");
		this.jLabelvalorRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRubroEmpleado.setToolTipText(RubroEmpleadoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRubroEmpleado = new GridBagLayout();
		this.jPanelvalorRubroEmpleado.setLayout(this.gridaBagLayoutRubroEmpleado);


		jTextFieldvalorRubroEmpleado= new JTextFieldMe();
		jTextFieldvalorRubroEmpleado.setEnabled(false);
		jTextFieldvalorRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRubroEmpleado.setText("0.0");

		this.jButtonvalorRubroEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalorRubroEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRubroEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRubroEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRubroEmpleadoBusqueda.setText("U");
		this.jButtonvalorRubroEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRubroEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRubroEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRubroEmpleadoBusqueda"));

		if(this.rubroempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRubroEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRubroEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRubroEmpleado = new JLabelMe();
		this.jLabelid_empresaRubroEmpleado.setText(""+RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRubroEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRubroEmpleado.setToolTipText(RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRubroEmpleado = new GridBagLayout();
		this.jPanelid_empresaRubroEmpleado.setLayout(this.gridaBagLayoutRubroEmpleado);


		jComboBoxid_empresaRubroEmpleado= new JComboBoxMe();
		jComboBoxid_empresaRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRubroEmpleado.setEnabled(false);

		this.jButtonid_empresaRubroEmpleado= new JButtonMe();
		this.jButtonid_empresaRubroEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmpleado.setText("Buscar");
		this.jButtonid_empresaRubroEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRubroEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleado"));

		this.jButtonid_empresaRubroEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaRubroEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaRubroEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRubroEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleadoBusqueda"));

		if(this.rubroempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRubroEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaRubroEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaRubroEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEmpleadoUpdate.setText("U");
		this.jButtonid_empresaRubroEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRubroEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleadoUpdate"));



					
		this.jLabelid_empleadoRubroEmpleado = new JLabelMe();
		this.jLabelid_empleadoRubroEmpleado.setText(""+RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoRubroEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoRubroEmpleado.setToolTipText(RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutRubroEmpleado = new GridBagLayout();
		this.jPanelid_empleadoRubroEmpleado.setLayout(this.gridaBagLayoutRubroEmpleado);


		jComboBoxid_empleadoRubroEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoRubroEmpleado= new JButtonMe();
		this.jButtonid_empleadoRubroEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRubroEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRubroEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRubroEmpleado.setText("Buscar");
		this.jButtonid_empleadoRubroEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoRubroEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRubroEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRubroEmpleado"));

		this.jButtonid_empleadoRubroEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoRubroEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRubroEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRubroEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRubroEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoRubroEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoRubroEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRubroEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRubroEmpleadoBusqueda"));

		if(this.rubroempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoRubroEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoRubroEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoRubroEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRubroEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRubroEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRubroEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoRubroEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoRubroEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRubroEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRubroEmpleadoUpdate"));



					
		this.jLabelid_rubro_empleaRubroEmpleado = new JLabelMe();
		this.jLabelid_rubro_empleaRubroEmpleado.setText(""+RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaRubroEmpleado.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaRubroEmpleado.setToolTipText(RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutRubroEmpleado = new GridBagLayout();
		this.jPanelid_rubro_empleaRubroEmpleado.setLayout(this.gridaBagLayoutRubroEmpleado);


		jComboBoxid_rubro_empleaRubroEmpleado= new JComboBoxMe();
		jComboBoxid_rubro_empleaRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaRubroEmpleado= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEmpleado.setText("Buscar");
		this.jButtonid_rubro_empleaRubroEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaRubroEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEmpleado"));

		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setText("U");
		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEmpleadoBusqueda"));

		if(this.rubroempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaRubroEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaRubroEmpleadoUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubroEmpleadoUpdate.setText("U");
		this.jButtonid_rubro_empleaRubroEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaRubroEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEmpleadoUpdate"));



					
		this.jLabelid_estado_rubroRubroEmpleado = new JLabelMe();
		this.jLabelid_estado_rubroRubroEmpleado.setText(""+RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO+" : *");
		this.jLabelid_estado_rubroRubroEmpleado.setToolTipText("Estado Rubro");
		this.jLabelid_estado_rubroRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_rubroRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_rubroRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_rubroRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_rubroRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_rubroRubroEmpleado.setToolTipText(RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO);
		this.gridaBagLayoutRubroEmpleado = new GridBagLayout();
		this.jPanelid_estado_rubroRubroEmpleado.setLayout(this.gridaBagLayoutRubroEmpleado);


		jComboBoxid_estado_rubroRubroEmpleado= new JComboBoxMe();
		jComboBoxid_estado_rubroRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_rubroRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_rubroRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_rubroRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_rubroRubroEmpleado= new JButtonMe();
		this.jButtonid_estado_rubroRubroEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_rubroRubroEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_rubroRubroEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_rubroRubroEmpleado.setText("Buscar");
		this.jButtonid_estado_rubroRubroEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_rubroRubroEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_rubroRubroEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_rubroRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_rubroRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_rubroRubroEmpleado"));

		this.jButtonid_estado_rubroRubroEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setText("U");
		this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_rubroRubroEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_rubroRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_rubroRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_rubroRubroEmpleadoBusqueda"));

		if(this.rubroempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_rubroRubroEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estado_rubroRubroEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estado_rubroRubroEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_rubroRubroEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_rubroRubroEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_rubroRubroEmpleadoUpdate.setText("U");
		this.jButtonid_estado_rubroRubroEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_rubroRubroEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_rubroRubroEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_rubroRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_rubroRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_rubroRubroEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleRubroEmpleado = new RubroEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rubro Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEmpleado= new GridBagLayout();
		

		
		String sToolTipRubroEmpleado="";
		sToolTipRubroEmpleado=RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEmpleado+="(Nomina.RubroEmpleado)";
		}
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRubroEmpleado = new JButtonMe();
		this.jButtonModificarRubroEmpleado = new JButtonMe();
        this.jButtonActualizarRubroEmpleado = new JButtonMe();
        this.jButtonEliminarRubroEmpleado = new JButtonMe();
        this.jButtonCancelarRubroEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosRubroEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaRubroEmpleado = new JButtonMe();
		this.jButtonCerrarRubroEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosRubroEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionRubroEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralRubroEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Empleado";
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRubroEmpleado.setName("jPanelCamposRubroEmpleado"); 

		this.jPanelCamposOcultosRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRubroEmpleado.setName("jPanelCamposOcultosRubroEmpleado"); 

        this.jPanelAccionesRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesRubroEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRubroEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRubroEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRubroEmpleado.setText("Nuevo");
		this.jButtonModificarRubroEmpleado.setText("Editar");
        this.jButtonActualizarRubroEmpleado.setText("Actualizar");
        this.jButtonEliminarRubroEmpleado.setText("Eliminar");
        this.jButtonCancelarRubroEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosRubroEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaRubroEmpleado.setText("Guardar");
		this.jButtonCerrarRubroEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEmpleado,"nuevo_button","Nuevo",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRubroEmpleado,"modificar_button","Editar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRubroEmpleado,"actualizar_button","Actualizar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRubroEmpleado,"eliminar_button","Eliminar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRubroEmpleado,"cancelar_button","Cancelar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRubroEmpleado,"guardarcambios_button","Guardar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEmpleado,"guardarcambiostabla_button","Guardar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEmpleado,"cerrar_button","Salir",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRubroEmpleado.setToolTipText("Nuevo"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRubroEmpleado.setToolTipText("Editar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRubroEmpleado.setToolTipText("Actualizar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRubroEmpleado.setToolTipText("Eliminar)"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRubroEmpleado.setToolTipText("Cancelar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRubroEmpleado.setToolTipText("Guardar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRubroEmpleado.setToolTipText("Guardar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEmpleado.setToolTipText("Salir"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEmpleado";
		inputMap = this.jButtonNuevoRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRubroEmpleado";
		inputMap = this.jButtonActualizarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRubroEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarRubroEmpleado";
		inputMap = this.jButtonEliminarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRubroEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarRubroEmpleado";
		inputMap = this.jButtonCancelarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRubroEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarRubroEmpleado";
		inputMap = this.jButtonCerrarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRubroEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRubroEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRubroEmpleado.setToolTipText("Nuevo RubroEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRubroEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRubroEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRubroEmpleado.setToolTipText("Sin Cerrar Ventana RubroEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRubroEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRubroEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRubroEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesRubroEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRubroEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRubroEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRubroEmpleado = new JLabelMe();
		
		this.jLabelAccionesRubroEmpleado.setText("Acciones");		
		this.jLabelAccionesRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRubroEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRubroEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRubroEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRubroEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRubroEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRubroEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRubroEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRubroEmpleado = new GridBagLayout();
		
		this.jPanelCamposRubroEmpleado.setLayout(gridaBagLayoutCamposRubroEmpleado);
		this.jPanelCamposOcultosRubroEmpleado.setLayout(gridaBagLayoutCamposOcultosRubroEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 0;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRubroEmpleado.add(jLabelIdRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 1;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRubroEmpleado.add(jLabelidRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 0;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRubroEmpleado.add(jLabelid_empresaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 2;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEmpleado.add(jButtonid_empresaRubroEmpleadoBusqueda, this.gridBagConstraintsRubroEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 3;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEmpleado.add(jButtonid_empresaRubroEmpleadoUpdate, this.gridBagConstraintsRubroEmpleado);
	}

	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 1;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRubroEmpleado.add(jComboBoxid_empresaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 0;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoRubroEmpleado.add(jLabelid_empleadoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 2;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRubroEmpleado.add(jButtonid_empleadoRubroEmpleadoBusqueda, this.gridBagConstraintsRubroEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 3;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRubroEmpleado.add(jButtonid_empleadoRubroEmpleadoUpdate, this.gridBagConstraintsRubroEmpleado);
	}

	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 1;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoRubroEmpleado.add(jComboBoxid_empleadoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 0;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaRubroEmpleado.add(jLabelid_rubro_empleaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 2;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubroEmpleado.add(jButtonid_rubro_empleaRubroEmpleadoBusqueda, this.gridBagConstraintsRubroEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 3;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubroEmpleado.add(jButtonid_rubro_empleaRubroEmpleadoUpdate, this.gridBagConstraintsRubroEmpleado);
	}

	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 1;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaRubroEmpleado.add(jComboBoxid_rubro_empleaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 0;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_rubroRubroEmpleado.add(jLabelid_estado_rubroRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 2;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_rubroRubroEmpleado.add(jButtonid_estado_rubroRubroEmpleadoBusqueda, this.gridBagConstraintsRubroEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 3;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_rubroRubroEmpleado.add(jButtonid_estado_rubroRubroEmpleadoUpdate, this.gridBagConstraintsRubroEmpleado);
	}

	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 1;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_rubroRubroEmpleado.add(jComboBoxid_estado_rubroRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 0;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorRubroEmpleado.add(jLabelvalorRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 2;
		this.gridBagConstraintsRubroEmpleado.ipadx = 0;
		this.gridBagConstraintsRubroEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRubroEmpleado.add(jButtonvalorRubroEmpleadoBusqueda, this.gridBagConstraintsRubroEmpleado);
	}

	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleado.gridy = 0;
	this.gridBagConstraintsRubroEmpleado.gridx = 1;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorRubroEmpleado.add(jTextFieldvalorRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleado.gridy = iYPanelCamposRubroEmpleado;
	this.gridBagConstraintsRubroEmpleado.gridx = iXPanelCamposRubroEmpleado++;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleado.add(this.jPanelidRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(iXPanelCamposRubroEmpleado % 1==0) {
		iXPanelCamposRubroEmpleado=0;
		iYPanelCamposRubroEmpleado++;
	}
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleado.gridy = iYPanelCamposRubroEmpleado;
	this.gridBagConstraintsRubroEmpleado.gridx = iXPanelCamposRubroEmpleado++;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleado.add(this.jPanelid_empleadoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(iXPanelCamposRubroEmpleado % 1==0) {
		iXPanelCamposRubroEmpleado=0;
		iYPanelCamposRubroEmpleado++;
	}
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleado.gridy = iYPanelCamposRubroEmpleado;
	this.gridBagConstraintsRubroEmpleado.gridx = iXPanelCamposRubroEmpleado++;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleado.add(this.jPanelid_rubro_empleaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(iXPanelCamposRubroEmpleado % 1==0) {
		iXPanelCamposRubroEmpleado=0;
		iYPanelCamposRubroEmpleado++;
	}
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleado.gridy = iYPanelCamposRubroEmpleado;
	this.gridBagConstraintsRubroEmpleado.gridx = iXPanelCamposRubroEmpleado++;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleado.add(this.jPanelid_estado_rubroRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(iXPanelCamposRubroEmpleado % 1==0) {
		iXPanelCamposRubroEmpleado=0;
		iYPanelCamposRubroEmpleado++;
	}
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleado.gridy = iYPanelCamposRubroEmpleado;
	this.gridBagConstraintsRubroEmpleado.gridx = iXPanelCamposRubroEmpleado++;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleado.add(this.jPanelvalorRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(iXPanelCamposRubroEmpleado % 1==0) {
		iXPanelCamposRubroEmpleado=0;
		iYPanelCamposRubroEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleado.gridy = iYPanelCamposOcultosRubroEmpleado;
	this.gridBagConstraintsRubroEmpleado.gridx = iXPanelCamposOcultosRubroEmpleado++;
	this.gridBagConstraintsRubroEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubroEmpleado.add(this.jPanelid_empresaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);



	if(iXPanelCamposOcultosRubroEmpleado % 1==0) {
		iXPanelCamposOcultosRubroEmpleado=0;
		iYPanelCamposOcultosRubroEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesRubroEmpleado= new GridBagLayout();
		this.jPanelAccionesRubroEmpleado.setLayout(gridaBagLayoutAccionesRubroEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRubroEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioRubroEmpleado.setLayout(gridaBagLayoutAccionesFormularioRubroEmpleado);
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEmpleado.add(this.jComboBoxTiposAccionesFormularioRubroEmpleado, this.gridBagConstraintsRubroEmpleado);

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEmpleado.add(this.jCheckBoxPostAccionNuevoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEmpleado.add(this.jCheckBoxPostAccionSinCerrarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEmpleado.add(this.jCheckBoxPostAccionSinMensajeRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesRubroEmpleado.add(this.jButtonModificarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);							

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesRubroEmpleado.add(this.jButtonEliminarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = 0;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEmpleado.add(this.jButtonActualizarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = 0;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEmpleado.add(this.jButtonGuardarCambiosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);	
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = 0;		
		this.gridBagConstraintsRubroEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesRubroEmpleado.add(this.jButtonCancelarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmpleado.gridx = 0;		
			//this.gridBagConstraintsRubroEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEmpleado.gridx =0;
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRubroEmpleado = new RubroEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rubro Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rubro Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RubroEmpleadoModel rubroempleadoModel=new RubroEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//RubroEmpleadoModel.RubroEmpleadoFocusTraversalPolicy rubroempleadoFocusTraversalPolicy = rubroempleadoModel.new RubroEmpleadoFocusTraversalPolicy(this);
			
			//rubroempleadoFocusTraversalPolicy.setrubroempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rubroempleadoModel);
			
			
			this.jContentPaneDetalleRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRubroEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleRubroEmpleado.setLayout(gridaBagLayoutDetalleRubroEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
				this.gridBagConstraintsRubroEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRubroEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleRubroEmpleado.add(jTtoolBarDetalleRubroEmpleado, gridBagConstraintsRubroEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionRubroEmpleado=   new JScrollPane(jContentPaneDetalleRubroEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRubroEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRubroEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRubroEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleRubroEmpleado.add(jPanelCamposRubroEmpleado, gridBagConstraintsRubroEmpleado);
			
			
			
			
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
						&& rubroempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRubroEmpleado= new GridBagConstraints();
						this.gridBagConstraintsRubroEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRubroEmpleado.gridx = 0;
						this.jContentPaneDetalleRubroEmpleado.add(this.jTabbedPaneRelacionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRubroEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRubroEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
					this.gridBagConstraintsRubroEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRubroEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRubroEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleRubroEmpleado.add(jPanelCamposOcultosRubroEmpleado, gridBagConstraintsRubroEmpleado);
				
					this.jPanelCamposOcultosRubroEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRubroEmpleado.gridx = 0;
	        this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRubroEmpleado.add(this.jPanelAccionesFormularioRubroEmpleado, this.gridBagConstraintsRubroEmpleado);							
			
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsRubroEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRubroEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleRubroEmpleado.add(this.jPanelAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRubroEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRubroEmpleado=   new JScrollPane(this.jPanelCamposRubroEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmpleado.gridx = 0;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRubroEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRubroEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionRubroEmpleado;
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
