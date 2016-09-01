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
import com.bydan.erp.nomina.util.Telefono_NMConstantesFunciones;

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
public class Telefono_NMDetalleFormJInternalFrame extends Telefono_NMBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTelefono_NM;
	
	protected JMenuBar jmenuBarDetalleTelefono_NM;
	
	protected JMenu jmenuDetalleTelefono_NM;
	protected JMenu jmenuDetalleArchivoTelefono_NM;
	protected JMenu jmenuDetalleAccionesTelefono_NM;
	protected JMenu jmenuDetalleDatosTelefono_NM;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTelefono_NM;	
	protected GridBagConstraints gridBagConstraintsTelefono_NM;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected Telefono_NMBeanSwingJInternalFrameAdditional jInternalFrameDetalleTelefono_NM;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public Telefono_NMSessionBean telefono_nmSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public Telefono_NMLogic telefono_nmLogic;
	
	public JScrollPane jScrollPanelDatosTelefono_NM;
	public JScrollPane jScrollPanelDatosEdicionTelefono_NM;
	public JScrollPane jScrollPanelDatosGeneralTelefono_NM;
	
	protected JPanel jPanelCamposTelefono_NM;    
	protected JPanel jPanelCamposOcultosTelefono_NM;    	
	protected JPanel jPanelAccionesTelefono_NM;
	protected JPanel jPanelAccionesFormularioTelefono_NM;
    
	
	
	protected Integer iXPanelCamposTelefono_NM=0;
	protected Integer iYPanelCamposTelefono_NM=0;
	
	protected Integer iXPanelCamposOcultosTelefono_NM=0;
	protected Integer iYPanelCamposOcultosTelefono_NM=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTelefono_NM;
	public JButton jButtonModificarTelefono_NM;
	public JButton jButtonActualizarTelefono_NM;
    public JButton jButtonEliminarTelefono_NM;
	public JButton jButtonCancelarTelefono_NM;
    public JButton jButtonGuardarCambiosTelefono_NM;
	public JButton jButtonGuardarCambiosTablaTelefono_NM;
	protected JButton jButtonCerrarTelefono_NM;
	
	
	protected JButton jButtonProcesarInformacionTelefono_NM;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTelefono_NM;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTelefono_NM;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTelefono_NM;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTelefono_NM;
	protected JButton jButtonModificarToolBarTelefono_NM;
	protected JButton jButtonActualizarToolBarTelefono_NM;
    protected JButton jButtonEliminarToolBarTelefono_NM;
	protected JButton jButtonCancelarToolBarTelefono_NM;
    protected JButton jButtonGuardarCambiosToolBarTelefono_NM;
	protected JButton jButtonGuardarCambiosTablaToolBarTelefono_NM;
	protected JButton jButtonMostrarOcultarTablaToolBarTelefono_NM;
	protected JButton jButtonCerrarToolBarTelefono_NM;
	
	protected JButton jButtonProcesarInformacionToolBarTelefono_NM;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTelefono_NM;
	protected JMenuItem jMenuItemModificarTelefono_NM;
	protected JMenuItem jMenuItemActualizarTelefono_NM;
    protected JMenuItem jMenuItemEliminarTelefono_NM;
	protected JMenuItem jMenuItemCancelarTelefono_NM;
    protected JMenuItem jMenuItemGuardarCambiosTelefono_NM;
	protected JMenuItem jMenuItemGuardarCambiosTablaTelefono_NM;
	protected JMenuItem jMenuItemCerrarTelefono_NM;
	protected JMenuItem jMenuItemDetalleCerrarTelefono_NM;
	protected JMenuItem jMenuItemDetalleMostarOcultarTelefono_NM;
	
	protected JMenuItem jMenuItemProcesarInformacionTelefono_NM;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTelefono_NM;
	protected JMenuItem jMenuItemMostrarOcultarTelefono_NM;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTelefono_NM;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTelefono_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTelefono_NM;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTelefono_NM;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTelefono_NM;
	public JLabel jLabelIdTelefono_NM;
	public JLabel jLabelidTelefono_NM;
	public JButton jButtonidTelefono_NMBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoTelefono_NM;
	public JLabel jLabeltelefonoTelefono_NM;
	public JTextField jTextFieldtelefonoTelefono_NM;
	public JButton jButtontelefonoTelefono_NMBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTelefono_NM;
	public JLabel jLabelid_empresaTelefono_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTelefono_NM;
	public JButton jButtonid_empresaTelefono_NM= new JButtonMe();
	public JButton jButtonid_empresaTelefono_NMUpdate= new JButtonMe();
	public JButton jButtonid_empresaTelefono_NMBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoTelefono_NM;
	public JLabel jLabelid_empleadoTelefono_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoTelefono_NM;
	public JButton jButtonid_empleadoTelefono_NM= new JButtonMe();
	public JButton jButtonid_empleadoTelefono_NMUpdate= new JButtonMe();
	public JButton jButtonid_empleadoTelefono_NMBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTelefono_NM;
	
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
	
	public Telefono_NMDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTelefono_NM=new JPanel();
				this.jPanelAccionesFormularioTelefono_NM=new JPanel();
				this.jmenuBarDetalleTelefono_NM=new JMenuBar();
				this.jTtoolBarDetalleTelefono_NM=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public Telefono_NMDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTelefono_NM() {
		return this.jButtonActualizarToolBarTelefono_NM;
	}
	
	public JButton getjButtonEliminarToolBarTelefono_NM() {
		return this.jButtonEliminarToolBarTelefono_NM;
	}
	
	public JButton getjButtonCancelarToolBarTelefono_NM() {
		return this.jButtonCancelarToolBarTelefono_NM;
	}		
	
	public JButton getjButtonProcesarInformacionTelefono_NM() {
		return this.jButtonProcesarInformacionTelefono_NM;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTelefono_NM)	{
		this.jButtonProcesarInformacionTelefono_NM = jButtonProcesarInformacionTelefono_NM;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTelefono_NM() {
		return this.jComboBoxTiposAccionesTelefono_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTelefono_NM(
			JComboBox jComboBoxTiposRelacionesTelefono_NM) {
		this.jComboBoxTiposRelacionesTelefono_NM = jComboBoxTiposRelacionesTelefono_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTelefono_NM(
			JComboBox jComboBoxTiposAccionesTelefono_NM) {
		this.jComboBoxTiposAccionesTelefono_NM = jComboBoxTiposAccionesTelefono_NM;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTelefono_NM() {
		return this.jComboBoxTiposAccionesFormularioTelefono_NM;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTelefono_NM(
			JComboBox jComboBoxTiposAccionesFormularioTelefono_NM) {
		this.jComboBoxTiposAccionesFormularioTelefono_NM = jComboBoxTiposAccionesFormularioTelefono_NM;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.telefono_nmSessionBean=new Telefono_NMSessionBean();
		
		this.telefono_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefono_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.telefono_nmSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Telefono_NMJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Telefono_ N M MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
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
	
		Telefono_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTelefono_NM= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTelefono_NM=new JButtonMe();
				this.jButtonModificarToolBarTelefono_NM=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTelefono_NM,this.jTtoolBarDetalleTelefono_NM,
							"actualizar","actualizar","Actualizar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTelefono_NM,this.jTtoolBarDetalleTelefono_NM,
							"eliminar","eliminar","Eliminar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTelefono_NM,this.jTtoolBarDetalleTelefono_NM,
							"cancelar","cancelar","Cancelar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTelefono_NM,this.jTtoolBarDetalleTelefono_NM,
							"guardarcambios","guardarcambios","Guardar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTelefono_NM=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTelefono_NM=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTelefono_NM=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTelefono_NM=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTelefono_NM=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTelefono_NM= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTelefono_NM.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTelefono_NM,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTelefono_NM= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTelefono_NM.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTelefono_NM,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTelefono_NM= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTelefono_NM.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTelefono_NM,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTelefono_NM= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTelefono_NM.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTelefono_NM,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTelefono_NM= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTelefono_NM.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTelefono_NM,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTelefono_NM= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTelefono_NM.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTelefono_NM,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTelefono_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTelefono_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTelefono_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTelefono_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTelefono_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTelefono_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTelefono_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTelefono_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTelefono_NM,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTelefono_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTelefono_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTelefono_NM,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTelefono_NM.add(this.jMenuItemDetalleCerrarTelefono_NM);
		
		this.jmenuDetalleAccionesTelefono_NM.add(this.jMenuItemActualizarTelefono_NM);
		this.jmenuDetalleAccionesTelefono_NM.add(this.jMenuItemEliminarTelefono_NM);
		this.jmenuDetalleAccionesTelefono_NM.add(this.jMenuItemCancelarTelefono_NM);		
		
		//this.jmenuDetalleDatosTelefono_NM.add(this.jMenuItemDetalleAbrirOrderByTelefono_NM);				
		this.jmenuDetalleDatosTelefono_NM.add(this.jMenuItemDetalleMostarOcultarTelefono_NM);				
				
		//this.jmenuDetalleAccionesTelefono_NM.add(this.jMenuItemGuardarCambiosTelefono_NM);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTelefono_NM.add(this.jmenuDetalleArchivoTelefono_NM);		
		this.jmenuBarDetalleTelefono_NM.add(this.jmenuDetalleAccionesTelefono_NM);		
		this.jmenuBarDetalleTelefono_NM.add(this.jmenuDetalleDatosTelefono_NM);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTelefono_NM);				
	}
	
	
	public void inicializarElementosCamposTelefono_NM() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTelefono_NM = new JLabelMe();
		jLabelIdTelefono_NM.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTelefono_NM = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTelefono_NM.setToolTipText(Telefono_NMConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTelefono_NM= new GridBagLayout();

		this.jPanelidTelefono_NM.setLayout(this.gridaBagLayoutTelefono_NM);

		jLabelidTelefono_NM = new JLabel();
		jLabelidTelefono_NM.setText("Id");

		jLabelidTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltelefonoTelefono_NM = new JLabelMe();
		this.jLabeltelefonoTelefono_NM.setText(""+Telefono_NMConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoTelefono_NM.setToolTipText("Telefono");
		this.jLabeltelefonoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoTelefono_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoTelefono_NM.setToolTipText(Telefono_NMConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutTelefono_NM = new GridBagLayout();
		this.jPaneltelefonoTelefono_NM.setLayout(this.gridaBagLayoutTelefono_NM);


		jTextFieldtelefonoTelefono_NM= new JTextFieldMe();

		jTextFieldtelefonoTelefono_NM.setEnabled(false);
		jTextFieldtelefonoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoTelefono_NMBusqueda= new JButtonMe();
		this.jButtontelefonoTelefono_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoTelefono_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoTelefono_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoTelefono_NMBusqueda.setText("U");
		this.jButtontelefonoTelefono_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoTelefono_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoTelefono_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoTelefono_NMBusqueda"));

		if(this.telefono_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoTelefono_NMBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTelefono_NM() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTelefono_NM = new JLabelMe();
		this.jLabelid_empresaTelefono_NM.setText(""+Telefono_NMConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTelefono_NM.setToolTipText("Empresa");
		this.jLabelid_empresaTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTelefono_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTelefono_NM.setToolTipText(Telefono_NMConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTelefono_NM = new GridBagLayout();
		this.jPanelid_empresaTelefono_NM.setLayout(this.gridaBagLayoutTelefono_NM);


		jComboBoxid_empresaTelefono_NM= new JComboBoxMe();
		jComboBoxid_empresaTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTelefono_NM.setEnabled(false);

		this.jButtonid_empresaTelefono_NM= new JButtonMe();
		this.jButtonid_empresaTelefono_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTelefono_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTelefono_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTelefono_NM.setText("Buscar");
		this.jButtonid_empresaTelefono_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTelefono_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTelefono_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTelefono_NM"));

		this.jButtonid_empresaTelefono_NMBusqueda= new JButtonMe();
		this.jButtonid_empresaTelefono_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefono_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefono_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTelefono_NMBusqueda.setText("U");
		this.jButtonid_empresaTelefono_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTelefono_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTelefono_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTelefono_NMBusqueda"));

		if(this.telefono_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTelefono_NMBusqueda.setVisible(false);		}

		this.jButtonid_empresaTelefono_NMUpdate= new JButtonMe();
		this.jButtonid_empresaTelefono_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefono_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefono_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTelefono_NMUpdate.setText("U");
		this.jButtonid_empresaTelefono_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTelefono_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTelefono_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTelefono_NMUpdate"));



					
		this.jLabelid_empleadoTelefono_NM = new JLabelMe();
		this.jLabelid_empleadoTelefono_NM.setText(""+Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoTelefono_NM.setToolTipText("Empleado");
		this.jLabelid_empleadoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoTelefono_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoTelefono_NM.setToolTipText(Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutTelefono_NM = new GridBagLayout();
		this.jPanelid_empleadoTelefono_NM.setLayout(this.gridaBagLayoutTelefono_NM);


		jComboBoxid_empleadoTelefono_NM= new JComboBoxMe();
		jComboBoxid_empleadoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoTelefono_NM= new JButtonMe();
		this.jButtonid_empleadoTelefono_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTelefono_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTelefono_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTelefono_NM.setText("Buscar");
		this.jButtonid_empleadoTelefono_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoTelefono_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTelefono_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTelefono_NM"));

		this.jButtonid_empleadoTelefono_NMBusqueda= new JButtonMe();
		this.jButtonid_empleadoTelefono_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTelefono_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTelefono_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoTelefono_NMBusqueda.setText("U");
		this.jButtonid_empleadoTelefono_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoTelefono_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTelefono_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTelefono_NMBusqueda"));

		if(this.telefono_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoTelefono_NMBusqueda.setVisible(false);		}

		this.jButtonid_empleadoTelefono_NMUpdate= new JButtonMe();
		this.jButtonid_empleadoTelefono_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTelefono_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTelefono_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoTelefono_NMUpdate.setText("U");
		this.jButtonid_empleadoTelefono_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoTelefono_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTelefono_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTelefono_NMUpdate"));



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
		//this.jInternalFrameDetalleTelefono_NM = new Telefono_NMBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Telefono_ N M DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTelefono_NM= new GridBagLayout();
		

		
		String sToolTipTelefono_NM="";
		sToolTipTelefono_NM=Telefono_NMConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTelefono_NM+="(Nomina.Telefono_NM)";
		}
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			sToolTipTelefono_NM+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTelefono_NM = new JButtonMe();
		this.jButtonModificarTelefono_NM = new JButtonMe();
        this.jButtonActualizarTelefono_NM = new JButtonMe();
        this.jButtonEliminarTelefono_NM = new JButtonMe();
        this.jButtonCancelarTelefono_NM = new JButtonMe();
        this.jButtonGuardarCambiosTelefono_NM = new JButtonMe();
		this.jButtonGuardarCambiosTablaTelefono_NM = new JButtonMe();
		this.jButtonCerrarTelefono_NM = new JButtonMe();
		
		this.jScrollPanelDatosTelefono_NM = new JScrollPane();   
        this.jScrollPanelDatosEdicionTelefono_NM = new JScrollPane();
		this.jScrollPanelDatosGeneralTelefono_NM = new JScrollPane();
				
		
		
		this.jPanelCamposTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Telefono_ N M";
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono_ N Mes" + this.sPath));
		} else {
			this.jScrollPanelDatosTelefono_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTelefono_NM.setName("jPanelCamposTelefono_NM"); 

		this.jPanelCamposOcultosTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTelefono_NM.setName("jPanelCamposOcultosTelefono_NM"); 

        this.jPanelAccionesTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTelefono_NM.setToolTipText("Acciones");
        this.jPanelAccionesTelefono_NM.setName("Acciones"); 

		this.jPanelAccionesFormularioTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTelefono_NM.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTelefono_NM.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTelefono_NM.setText("Nuevo");
		this.jButtonModificarTelefono_NM.setText("Editar");
        this.jButtonActualizarTelefono_NM.setText("Actualizar");
        this.jButtonEliminarTelefono_NM.setText("Eliminar");
        this.jButtonCancelarTelefono_NM.setText("Cancelar");
        this.jButtonGuardarCambiosTelefono_NM.setText("Guardar");
		this.jButtonGuardarCambiosTablaTelefono_NM.setText("Guardar");
		this.jButtonCerrarTelefono_NM.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTelefono_NM,"nuevo_button","Nuevo",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTelefono_NM,"modificar_button","Editar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTelefono_NM,"actualizar_button","Actualizar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTelefono_NM,"eliminar_button","Eliminar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTelefono_NM,"cancelar_button","Cancelar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTelefono_NM,"guardarcambios_button","Guardar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTelefono_NM,"guardarcambiostabla_button","Guardar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTelefono_NM,"cerrar_button","Salir",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTelefono_NM.setToolTipText("Nuevo"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTelefono_NM.setToolTipText("Editar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTelefono_NM.setToolTipText("Actualizar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTelefono_NM.setToolTipText("Eliminar)"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTelefono_NM.setToolTipText("Cancelar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTelefono_NM.setToolTipText("Guardar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTelefono_NM.setToolTipText("Guardar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTelefono_NM.setToolTipText("Salir"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTelefono_NM";
		inputMap = this.jButtonNuevoTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTelefono_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTelefono_NM"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTelefono_NM";
		inputMap = this.jButtonActualizarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTelefono_NM"));
		
		//ELIMINAR
		sMapKey = "EliminarTelefono_NM";
		inputMap = this.jButtonEliminarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTelefono_NM"));
		
		//CANCELAR	
		sMapKey = "CancelarTelefono_NM";
		inputMap = this.jButtonCancelarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTelefono_NM"));
		
		//CERRAR		
		sMapKey = "CerrarTelefono_NM";
		inputMap = this.jButtonCerrarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTelefono_NM"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTelefono_NM";
		inputMap = this.jButtonGuardarCambiosTablaTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTelefono_NM"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTelefono_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTelefono_NM.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTelefono_NM.setToolTipText("Nuevo Telefono_NM");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTelefono_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTelefono_NM.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTelefono_NM.setToolTipText("Sin Cerrar Ventana Telefono_NM");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTelefono_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTelefono_NM.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTelefono_NM.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTelefono_NM.setText("Accion");
		this.jComboBoxTiposAccionesTelefono_NM.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTelefono_NM.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTelefono_NM.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTelefono_NM = new JLabelMe();
		
		this.jLabelAccionesTelefono_NM.setText("Acciones");		
		this.jLabelAccionesTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTelefono_NM();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTelefono_NM();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTelefono_NM=new JTabbedPane();
		this.jTabbedPaneRelacionesTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTelefono_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTelefono_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTelefono_NM.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTelefono_NM.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTelefono_NM.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTelefono_NM = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTelefono_NM = new GridBagLayout();
		
		this.jPanelCamposTelefono_NM.setLayout(gridaBagLayoutCamposTelefono_NM);
		this.jPanelCamposOcultosTelefono_NM.setLayout(gridaBagLayoutCamposOcultosTelefono_NM);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 0;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTelefono_NM.add(jLabelIdTelefono_NM, this.gridBagConstraintsTelefono_NM);



	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 1;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTelefono_NM.add(jLabelidTelefono_NM, this.gridBagConstraintsTelefono_NM);


	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 0;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTelefono_NM.add(jLabelid_empresaTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = 2;
		this.gridBagConstraintsTelefono_NM.ipadx = 0;
		this.gridBagConstraintsTelefono_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTelefono_NM.add(jButtonid_empresaTelefono_NMBusqueda, this.gridBagConstraintsTelefono_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = 3;
		this.gridBagConstraintsTelefono_NM.ipadx = 0;
		this.gridBagConstraintsTelefono_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTelefono_NM.add(jButtonid_empresaTelefono_NMUpdate, this.gridBagConstraintsTelefono_NM);
	}

	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 1;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTelefono_NM.add(jComboBoxid_empresaTelefono_NM, this.gridBagConstraintsTelefono_NM);


	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 0;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoTelefono_NM.add(jLabelid_empleadoTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 2;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoTelefono_NM.add(jButtonid_empleadoTelefono_NM, this.gridBagConstraintsTelefono_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = 3;
		this.gridBagConstraintsTelefono_NM.ipadx = 0;
		this.gridBagConstraintsTelefono_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoTelefono_NM.add(jButtonid_empleadoTelefono_NMBusqueda, this.gridBagConstraintsTelefono_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = 4;
		this.gridBagConstraintsTelefono_NM.ipadx = 0;
		this.gridBagConstraintsTelefono_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoTelefono_NM.add(jButtonid_empleadoTelefono_NMUpdate, this.gridBagConstraintsTelefono_NM);
	}

	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 1;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoTelefono_NM.add(jComboBoxid_empleadoTelefono_NM, this.gridBagConstraintsTelefono_NM);


	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 0;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoTelefono_NM.add(jLabeltelefonoTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = 2;
		this.gridBagConstraintsTelefono_NM.ipadx = 0;
		this.gridBagConstraintsTelefono_NM.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoTelefono_NM.add(jButtontelefonoTelefono_NMBusqueda, this.gridBagConstraintsTelefono_NM);
	}

	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono_NM.gridy = 0;
	this.gridBagConstraintsTelefono_NM.gridx = 1;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoTelefono_NM.add(jTextFieldtelefonoTelefono_NM, this.gridBagConstraintsTelefono_NM);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono_NM.gridy = iYPanelCamposTelefono_NM;
	this.gridBagConstraintsTelefono_NM.gridx = iXPanelCamposTelefono_NM++;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono_NM.add(this.jPanelidTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(iXPanelCamposTelefono_NM % 1==0) {
		iXPanelCamposTelefono_NM=0;
		iYPanelCamposTelefono_NM++;
	}
	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono_NM.gridy = iYPanelCamposTelefono_NM;
	this.gridBagConstraintsTelefono_NM.gridx = iXPanelCamposTelefono_NM++;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono_NM.add(this.jPanelid_empleadoTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(iXPanelCamposTelefono_NM % 1==0) {
		iXPanelCamposTelefono_NM=0;
		iYPanelCamposTelefono_NM++;
	}
	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono_NM.gridy = iYPanelCamposTelefono_NM;
	this.gridBagConstraintsTelefono_NM.gridx = iXPanelCamposTelefono_NM++;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono_NM.add(this.jPaneltelefonoTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(iXPanelCamposTelefono_NM % 1==0) {
		iXPanelCamposTelefono_NM=0;
		iYPanelCamposTelefono_NM++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono_NM.gridy = iYPanelCamposOcultosTelefono_NM;
	this.gridBagConstraintsTelefono_NM.gridx = iXPanelCamposOcultosTelefono_NM++;
	this.gridBagConstraintsTelefono_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTelefono_NM.add(this.jPanelid_empresaTelefono_NM, this.gridBagConstraintsTelefono_NM);



	if(iXPanelCamposOcultosTelefono_NM % 1==0) {
		iXPanelCamposOcultosTelefono_NM=0;
		iYPanelCamposOcultosTelefono_NM++;
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
			
		GridBagLayout gridaBagLayoutAccionesTelefono_NM= new GridBagLayout();
		this.jPanelAccionesTelefono_NM.setLayout(gridaBagLayoutAccionesTelefono_NM);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTelefono_NM= new GridBagLayout();
		this.jPanelAccionesFormularioTelefono_NM.setLayout(gridaBagLayoutAccionesFormularioTelefono_NM);
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTelefono_NM.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTelefono_NM.add(this.jComboBoxTiposAccionesFormularioTelefono_NM, this.gridBagConstraintsTelefono_NM);

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTelefono_NM.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTelefono_NM.add(this.jCheckBoxPostAccionNuevoTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTelefono_NM.add(this.jCheckBoxPostAccionSinCerrarTelefono_NM, this.gridBagConstraintsTelefono_NM);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTelefono_NM.add(this.jCheckBoxPostAccionSinMensajeTelefono_NM, this.gridBagConstraintsTelefono_NM);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXAccion++;
			
		this.jPanelAccionesTelefono_NM.add(this.jButtonModificarTelefono_NM, this.gridBagConstraintsTelefono_NM);							

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx =iPosXAccion++;
			
		this.jPanelAccionesTelefono_NM.add(this.jButtonEliminarTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
			
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = 0;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXAccion++;
		
		this.jPanelAccionesTelefono_NM.add(this.jButtonActualizarTelefono_NM, this.gridBagConstraintsTelefono_NM);


		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = 0;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXAccion++;
		
		this.jPanelAccionesTelefono_NM.add(this.jButtonGuardarCambiosTelefono_NM, this.gridBagConstraintsTelefono_NM);	
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = 0;		
		this.gridBagConstraintsTelefono_NM.gridx =iPosXAccion++;
		
		this.jPanelAccionesTelefono_NM.add(this.jButtonCancelarTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTelefono_NM = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTelefono_NM);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();						
			this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefono_NM.gridx = 0;		
			//this.gridBagConstraintsTelefono_NM.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTelefono_NM.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTelefono_NM.gridx =0;
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTelefono_NM.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTelefono_NM, this.gridBagConstraintsTelefono_NM);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTelefono_NM = new Telefono_NMBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Telefono_ N M DATOS");
			
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
			
	        //this.setTitle("[FOR] - Telefono_ N M DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Telefono_ N M Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			Telefono_NMModel telefono_nmModel=new Telefono_NMModel(this);
			
			//SI USARA CLASE INTERNA
			//Telefono_NMModel.Telefono_NMFocusTraversalPolicy telefono_nmFocusTraversalPolicy = telefono_nmModel.new Telefono_NMFocusTraversalPolicy(this);
			
			//telefono_nmFocusTraversalPolicy.settelefono_nmJInternalFrame(this);
			
			this.setFocusTraversalPolicy(telefono_nmModel);
			
			
			this.jContentPaneDetalleTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTelefono_NM = new GridBagLayout();	
			this.jContentPaneDetalleTelefono_NM.setLayout(gridaBagLayoutDetalleTelefono_NM);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTelefono_NM = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
				this.gridBagConstraintsTelefono_NM.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTelefono_NM.gridx = 0;
					
				
				this.jContentPaneDetalleTelefono_NM.add(jTtoolBarDetalleTelefono_NM, gridBagConstraintsTelefono_NM);								
				
}
			
			this.jScrollPanelDatosEdicionTelefono_NM=   new JScrollPane(jContentPaneDetalleTelefono_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTelefono_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTelefono_NM=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTelefono_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTelefono_NM.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTelefono_NM.gridx = 0;
	        
			this.jContentPaneDetalleTelefono_NM.add(jPanelCamposTelefono_NM, gridBagConstraintsTelefono_NM);
			
			
			
			
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
						&& telefono_nmSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTelefono_NM= new GridBagConstraints();
						this.gridBagConstraintsTelefono_NM.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTelefono_NM.gridx = 0;
						this.jContentPaneDetalleTelefono_NM.add(this.jTabbedPaneRelacionesTelefono_NM, this.gridBagConstraintsTelefono_NM);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTelefono_NM.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTelefono_NM.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
					this.gridBagConstraintsTelefono_NM.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTelefono_NM.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTelefono_NM.gridx = 0;
					
				
					this.jContentPaneDetalleTelefono_NM.add(jPanelCamposOcultosTelefono_NM, gridBagConstraintsTelefono_NM);
				
					this.jPanelCamposOcultosTelefono_NM.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTelefono_NM.gridx = 0;
	        this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTelefono_NM.add(this.jPanelAccionesFormularioTelefono_NM, this.gridBagConstraintsTelefono_NM);							
			
			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
	        this.gridBagConstraintsTelefono_NM.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTelefono_NM.gridx = 0;
	        
			
			this.jContentPaneDetalleTelefono_NM.add(this.jPanelAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTelefono_NM);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTelefono_NM=   new JScrollPane(this.jPanelCamposTelefono_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTelefono_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTelefono_NM.gridx = 0;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTelefono_NM.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTelefono_NM.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTelefono_NM, this.gridBagConstraintsTelefono_NM);			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTelefono_NM.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
			
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
			
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTelefono_NM;//jContentPane;
		
		return jScrollPanelDatosEdicionTelefono_NM;
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
