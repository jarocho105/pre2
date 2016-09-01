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
import com.bydan.erp.nomina.util.TipoDiscapacidadConstantesFunciones;

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
public class TipoDiscapacidadDetalleFormJInternalFrame extends TipoDiscapacidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDiscapacidad;
	
	protected JMenuBar jmenuBarDetalleTipoDiscapacidad;
	
	protected JMenu jmenuDetalleTipoDiscapacidad;
	protected JMenu jmenuDetalleArchivoTipoDiscapacidad;
	protected JMenu jmenuDetalleAccionesTipoDiscapacidad;
	protected JMenu jmenuDetalleDatosTipoDiscapacidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDiscapacidad;	
	protected GridBagConstraints gridBagConstraintsTipoDiscapacidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDiscapacidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDiscapacidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDiscapacidadSessionBean tipodiscapacidadSessionBean;
	
	

	public EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFrame=null;
	public EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoDisca=false;
	public EmpleadoDiscaSessionBean empleadodiscaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDiscapacidadLogic tipodiscapacidadLogic;
	
	public JScrollPane jScrollPanelDatosTipoDiscapacidad;
	public JScrollPane jScrollPanelDatosEdicionTipoDiscapacidad;
	public JScrollPane jScrollPanelDatosGeneralTipoDiscapacidad;
	
	protected JPanel jPanelCamposTipoDiscapacidad;    
	protected JPanel jPanelCamposOcultosTipoDiscapacidad;    	
	protected JPanel jPanelAccionesTipoDiscapacidad;
	protected JPanel jPanelAccionesFormularioTipoDiscapacidad;
    
	
	
	protected Integer iXPanelCamposTipoDiscapacidad=0;
	protected Integer iYPanelCamposTipoDiscapacidad=0;
	
	protected Integer iXPanelCamposOcultosTipoDiscapacidad=0;
	protected Integer iYPanelCamposOcultosTipoDiscapacidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDiscapacidad;
	public JButton jButtonModificarTipoDiscapacidad;
	public JButton jButtonActualizarTipoDiscapacidad;
    public JButton jButtonEliminarTipoDiscapacidad;
	public JButton jButtonCancelarTipoDiscapacidad;
    public JButton jButtonGuardarCambiosTipoDiscapacidad;
	public JButton jButtonGuardarCambiosTablaTipoDiscapacidad;
	protected JButton jButtonCerrarTipoDiscapacidad;
	
	
	protected JButton jButtonProcesarInformacionTipoDiscapacidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDiscapacidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDiscapacidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDiscapacidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDiscapacidad;
	protected JButton jButtonModificarToolBarTipoDiscapacidad;
	protected JButton jButtonActualizarToolBarTipoDiscapacidad;
    protected JButton jButtonEliminarToolBarTipoDiscapacidad;
	protected JButton jButtonCancelarToolBarTipoDiscapacidad;
    protected JButton jButtonGuardarCambiosToolBarTipoDiscapacidad;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDiscapacidad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDiscapacidad;
	protected JButton jButtonCerrarToolBarTipoDiscapacidad;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDiscapacidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDiscapacidad;
	protected JMenuItem jMenuItemModificarTipoDiscapacidad;
	protected JMenuItem jMenuItemActualizarTipoDiscapacidad;
    protected JMenuItem jMenuItemEliminarTipoDiscapacidad;
	protected JMenuItem jMenuItemCancelarTipoDiscapacidad;
    protected JMenuItem jMenuItemGuardarCambiosTipoDiscapacidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDiscapacidad;
	protected JMenuItem jMenuItemCerrarTipoDiscapacidad;
	protected JMenuItem jMenuItemDetalleCerrarTipoDiscapacidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDiscapacidad;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDiscapacidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDiscapacidad;
	protected JMenuItem jMenuItemMostrarOcultarTipoDiscapacidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDiscapacidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDiscapacidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDiscapacidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDiscapacidad;
	public JLabel jLabelIdTipoDiscapacidad;
	public JLabel jLabelidTipoDiscapacidad;
	public JButton jButtonidTipoDiscapacidadBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDiscapacidad;
	public JLabel jLabelnombreTipoDiscapacidad;
	public JTextArea jTextAreanombreTipoDiscapacidad;
	public JScrollPane jscrollPanenombreTipoDiscapacidad;
	public JButton jButtonnombreTipoDiscapacidadBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_inicialTipoDiscapacidad;
	public JLabel jLabelporcentaje_inicialTipoDiscapacidad;
	public JTextField jTextFieldporcentaje_inicialTipoDiscapacidad;
	public JButton jButtonporcentaje_inicialTipoDiscapacidadBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_finalTipoDiscapacidad;
	public JLabel jLabelporcentaje_finalTipoDiscapacidad;
	public JTextField jTextFieldporcentaje_finalTipoDiscapacidad;
	public JButton jButtonporcentaje_finalTipoDiscapacidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDiscapacidad;
	public JLabel jLabelid_empresaTipoDiscapacidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDiscapacidad;
	public JButton jButtonid_empresaTipoDiscapacidad= new JButtonMe();
	public JButton jButtonid_empresaTipoDiscapacidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDiscapacidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDiscapacidad;
	
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
	
	public TipoDiscapacidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDiscapacidad=new JPanel();
				this.jPanelAccionesFormularioTipoDiscapacidad=new JPanel();
				this.jmenuBarDetalleTipoDiscapacidad=new JMenuBar();
				this.jTtoolBarDetalleTipoDiscapacidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDiscapacidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDiscapacidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDiscapacidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDiscapacidad() {
		return this.jButtonActualizarToolBarTipoDiscapacidad;
	}
	
	public JButton getjButtonEliminarToolBarTipoDiscapacidad() {
		return this.jButtonEliminarToolBarTipoDiscapacidad;
	}
	
	public JButton getjButtonCancelarToolBarTipoDiscapacidad() {
		return this.jButtonCancelarToolBarTipoDiscapacidad;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDiscapacidad() {
		return this.jButtonProcesarInformacionTipoDiscapacidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDiscapacidad)	{
		this.jButtonProcesarInformacionTipoDiscapacidad = jButtonProcesarInformacionTipoDiscapacidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDiscapacidad() {
		return this.jComboBoxTiposAccionesTipoDiscapacidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDiscapacidad(
			JComboBox jComboBoxTiposRelacionesTipoDiscapacidad) {
		this.jComboBoxTiposRelacionesTipoDiscapacidad = jComboBoxTiposRelacionesTipoDiscapacidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDiscapacidad(
			JComboBox jComboBoxTiposAccionesTipoDiscapacidad) {
		this.jComboBoxTiposAccionesTipoDiscapacidad = jComboBoxTiposAccionesTipoDiscapacidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDiscapacidad() {
		return this.jComboBoxTiposAccionesFormularioTipoDiscapacidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDiscapacidad(
			JComboBox jComboBoxTiposAccionesFormularioTipoDiscapacidad) {
		this.jComboBoxTiposAccionesFormularioTipoDiscapacidad = jComboBoxTiposAccionesFormularioTipoDiscapacidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
		
		this.tipodiscapacidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodiscapacidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodiscapacidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDiscapacidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Discapacidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDiscapacidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDiscapacidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDiscapacidad=new JButtonMe();
				this.jButtonModificarToolBarTipoDiscapacidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDiscapacidad,this.jTtoolBarDetalleTipoDiscapacidad,
							"actualizar","actualizar","Actualizar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDiscapacidad,this.jTtoolBarDetalleTipoDiscapacidad,
							"eliminar","eliminar","Eliminar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDiscapacidad,this.jTtoolBarDetalleTipoDiscapacidad,
							"cancelar","cancelar","Cancelar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDiscapacidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDiscapacidad,this.jTtoolBarDetalleTipoDiscapacidad,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDiscapacidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDiscapacidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDiscapacidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDiscapacidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDiscapacidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDiscapacidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDiscapacidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDiscapacidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDiscapacidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDiscapacidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDiscapacidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDiscapacidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDiscapacidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDiscapacidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDiscapacidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDiscapacidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDiscapacidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDiscapacidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDiscapacidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDiscapacidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDiscapacidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDiscapacidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDiscapacidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDiscapacidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDiscapacidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDiscapacidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDiscapacidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDiscapacidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDiscapacidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDiscapacidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDiscapacidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDiscapacidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDiscapacidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDiscapacidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDiscapacidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDiscapacidad.add(this.jMenuItemDetalleCerrarTipoDiscapacidad);
		
		this.jmenuDetalleAccionesTipoDiscapacidad.add(this.jMenuItemActualizarTipoDiscapacidad);
		this.jmenuDetalleAccionesTipoDiscapacidad.add(this.jMenuItemEliminarTipoDiscapacidad);
		this.jmenuDetalleAccionesTipoDiscapacidad.add(this.jMenuItemCancelarTipoDiscapacidad);		
		
		//this.jmenuDetalleDatosTipoDiscapacidad.add(this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad);				
		this.jmenuDetalleDatosTipoDiscapacidad.add(this.jMenuItemDetalleMostarOcultarTipoDiscapacidad);				
				
		//this.jmenuDetalleAccionesTipoDiscapacidad.add(this.jMenuItemGuardarCambiosTipoDiscapacidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDiscapacidad.add(this.jmenuDetalleArchivoTipoDiscapacidad);		
		this.jmenuBarDetalleTipoDiscapacidad.add(this.jmenuDetalleAccionesTipoDiscapacidad);		
		this.jmenuBarDetalleTipoDiscapacidad.add(this.jmenuDetalleDatosTipoDiscapacidad);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDiscapacidad.add(this.jmenuDetalleTipoDiscapacidad);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDiscapacidad);				
	}
	
	
	public void inicializarElementosCamposTipoDiscapacidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDiscapacidad = new JLabelMe();
		jLabelIdTipoDiscapacidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDiscapacidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDiscapacidad.setToolTipText(TipoDiscapacidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDiscapacidad= new GridBagLayout();

		this.jPanelidTipoDiscapacidad.setLayout(this.gridaBagLayoutTipoDiscapacidad);

		jLabelidTipoDiscapacidad = new JLabel();
		jLabelidTipoDiscapacidad.setText("Id");

		jLabelidTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoDiscapacidad = new JLabelMe();
		this.jLabelnombreTipoDiscapacidad.setText(""+TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDiscapacidad.setToolTipText("Nombre");
		this.jLabelnombreTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDiscapacidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDiscapacidad.setToolTipText(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDiscapacidad = new GridBagLayout();
		this.jPanelnombreTipoDiscapacidad.setLayout(this.gridaBagLayoutTipoDiscapacidad);


		jTextAreanombreTipoDiscapacidad= new JTextAreaMe();
		jTextAreanombreTipoDiscapacidad.setEnabled(false);
		jTextAreanombreTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDiscapacidad.setLineWrap(true);
		jTextAreanombreTipoDiscapacidad.setWrapStyleWord(true);
		jTextAreanombreTipoDiscapacidad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDiscapacidad.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDiscapacidad = new JScrollPane(jTextAreanombreTipoDiscapacidad);
		jscrollPanenombreTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDiscapacidadBusqueda= new JButtonMe();
		this.jButtonnombreTipoDiscapacidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDiscapacidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDiscapacidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDiscapacidadBusqueda.setText("U");
		this.jButtonnombreTipoDiscapacidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDiscapacidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDiscapacidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDiscapacidadBusqueda"));

		if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDiscapacidadBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_inicialTipoDiscapacidad = new JLabelMe();
		this.jLabelporcentaje_inicialTipoDiscapacidad.setText(""+TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL+" : *");
		this.jLabelporcentaje_inicialTipoDiscapacidad.setToolTipText("Porcentaje Inicial");
		this.jLabelporcentaje_inicialTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_inicialTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_inicialTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_inicialTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_inicialTipoDiscapacidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_inicialTipoDiscapacidad.setToolTipText(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL);
		this.gridaBagLayoutTipoDiscapacidad = new GridBagLayout();
		this.jPanelporcentaje_inicialTipoDiscapacidad.setLayout(this.gridaBagLayoutTipoDiscapacidad);


		jTextFieldporcentaje_inicialTipoDiscapacidad= new JTextFieldMe();
		jTextFieldporcentaje_inicialTipoDiscapacidad.setEnabled(false);
		jTextFieldporcentaje_inicialTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_inicialTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_inicialTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_inicialTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_inicialTipoDiscapacidad.setText("0.0");

		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda= new JButtonMe();
		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setText("U");
		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_inicialTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_inicialTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_inicialTipoDiscapacidadBusqueda"));

		if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_finalTipoDiscapacidad = new JLabelMe();
		this.jLabelporcentaje_finalTipoDiscapacidad.setText(""+TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL+" : *");
		this.jLabelporcentaje_finalTipoDiscapacidad.setToolTipText("Porcentaje Final");
		this.jLabelporcentaje_finalTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_finalTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_finalTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_finalTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_finalTipoDiscapacidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_finalTipoDiscapacidad.setToolTipText(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL);
		this.gridaBagLayoutTipoDiscapacidad = new GridBagLayout();
		this.jPanelporcentaje_finalTipoDiscapacidad.setLayout(this.gridaBagLayoutTipoDiscapacidad);


		jTextFieldporcentaje_finalTipoDiscapacidad= new JTextFieldMe();
		jTextFieldporcentaje_finalTipoDiscapacidad.setEnabled(false);
		jTextFieldporcentaje_finalTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_finalTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_finalTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_finalTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_finalTipoDiscapacidad.setText("0.0");

		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda= new JButtonMe();
		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setText("U");
		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_finalTipoDiscapacidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_finalTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_finalTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_finalTipoDiscapacidadBusqueda"));

		if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_finalTipoDiscapacidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDiscapacidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDiscapacidad = new JLabelMe();
		this.jLabelid_empresaTipoDiscapacidad.setText(""+TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDiscapacidad.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDiscapacidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDiscapacidad.setToolTipText(TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDiscapacidad = new GridBagLayout();
		this.jPanelid_empresaTipoDiscapacidad.setLayout(this.gridaBagLayoutTipoDiscapacidad);


		jComboBoxid_empresaTipoDiscapacidad= new JComboBoxMe();
		jComboBoxid_empresaTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDiscapacidad.setEnabled(false);

		this.jButtonid_empresaTipoDiscapacidad= new JButtonMe();
		this.jButtonid_empresaTipoDiscapacidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDiscapacidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDiscapacidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDiscapacidad.setText("Buscar");
		this.jButtonid_empresaTipoDiscapacidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDiscapacidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDiscapacidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDiscapacidad"));

		this.jButtonid_empresaTipoDiscapacidadBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDiscapacidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDiscapacidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDiscapacidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDiscapacidadBusqueda.setText("U");
		this.jButtonid_empresaTipoDiscapacidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDiscapacidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDiscapacidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDiscapacidadBusqueda"));

		if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDiscapacidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDiscapacidadUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDiscapacidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDiscapacidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDiscapacidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDiscapacidadUpdate.setText("U");
		this.jButtonid_empresaTipoDiscapacidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDiscapacidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDiscapacidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDiscapacidadUpdate"));



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
		//this.jInternalFrameDetalleTipoDiscapacidad = new TipoDiscapacidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Discapacidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDiscapacidad= new GridBagLayout();
		

		
		String sToolTipTipoDiscapacidad="";
		sToolTipTipoDiscapacidad=TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDiscapacidad+="(Nomina.TipoDiscapacidad)";
		}
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDiscapacidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDiscapacidad = new JButtonMe();
		this.jButtonModificarTipoDiscapacidad = new JButtonMe();
        this.jButtonActualizarTipoDiscapacidad = new JButtonMe();
        this.jButtonEliminarTipoDiscapacidad = new JButtonMe();
        this.jButtonCancelarTipoDiscapacidad = new JButtonMe();
        this.jButtonGuardarCambiosTipoDiscapacidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDiscapacidad = new JButtonMe();
		this.jButtonCerrarTipoDiscapacidad = new JButtonMe();
		
		this.jScrollPanelDatosTipoDiscapacidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDiscapacidad = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDiscapacidad = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Discapacidad";
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Discapacidades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDiscapacidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDiscapacidad.setName("jPanelCamposTipoDiscapacidad"); 

		this.jPanelCamposOcultosTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDiscapacidad.setName("jPanelCamposOcultosTipoDiscapacidad"); 

        this.jPanelAccionesTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDiscapacidad.setToolTipText("Acciones");
        this.jPanelAccionesTipoDiscapacidad.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDiscapacidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDiscapacidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDiscapacidad.setText("Nuevo");
		this.jButtonModificarTipoDiscapacidad.setText("Editar");
        this.jButtonActualizarTipoDiscapacidad.setText("Actualizar");
        this.jButtonEliminarTipoDiscapacidad.setText("Eliminar");
        this.jButtonCancelarTipoDiscapacidad.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDiscapacidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.setText("Guardar");
		this.jButtonCerrarTipoDiscapacidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDiscapacidad,"nuevo_button","Nuevo",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDiscapacidad,"modificar_button","Editar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDiscapacidad,"actualizar_button","Actualizar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDiscapacidad,"eliminar_button","Eliminar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDiscapacidad,"cancelar_button","Cancelar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDiscapacidad,"guardarcambios_button","Guardar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDiscapacidad,"guardarcambiostabla_button","Guardar",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDiscapacidad,"cerrar_button","Salir",this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDiscapacidad.setToolTipText("Nuevo"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDiscapacidad.setToolTipText("Editar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDiscapacidad.setToolTipText("Actualizar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDiscapacidad.setToolTipText("Eliminar)"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDiscapacidad.setToolTipText("Cancelar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDiscapacidad.setToolTipText("Guardar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.setToolTipText("Guardar"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDiscapacidad.setToolTipText("Salir"+" "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDiscapacidad";
		inputMap = this.jButtonNuevoTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDiscapacidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDiscapacidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDiscapacidad";
		inputMap = this.jButtonActualizarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDiscapacidad"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDiscapacidad";
		inputMap = this.jButtonEliminarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDiscapacidad"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDiscapacidad";
		inputMap = this.jButtonCancelarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDiscapacidad"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDiscapacidad";
		inputMap = this.jButtonCerrarTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDiscapacidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDiscapacidad";
		inputMap = this.jButtonGuardarCambiosTablaTipoDiscapacidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDiscapacidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDiscapacidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDiscapacidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDiscapacidad.setToolTipText("Nuevo TipoDiscapacidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDiscapacidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDiscapacidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDiscapacidad.setToolTipText("Sin Cerrar Ventana TipoDiscapacidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDiscapacidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDiscapacidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDiscapacidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDiscapacidad.setText("Accion");
		this.jComboBoxTiposAccionesTipoDiscapacidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDiscapacidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDiscapacidad = new JLabelMe();
		
		this.jLabelAccionesTipoDiscapacidad.setText("Acciones");		
		this.jLabelAccionesTipoDiscapacidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDiscapacidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDiscapacidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDiscapacidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDiscapacidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDiscapacidad=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDiscapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDiscapacidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDiscapacidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDiscapacidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDiscapacidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDiscapacidad = new GridBagLayout();
		
		this.jPanelCamposTipoDiscapacidad.setLayout(gridaBagLayoutCamposTipoDiscapacidad);
		this.jPanelCamposOcultosTipoDiscapacidad.setLayout(gridaBagLayoutCamposOcultosTipoDiscapacidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDiscapacidad.add(jLabelIdTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 1;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDiscapacidad.add(jLabelidTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDiscapacidad.add(jLabelid_empresaTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 2;
		this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
		this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDiscapacidad.add(jButtonid_empresaTipoDiscapacidadBusqueda, this.gridBagConstraintsTipoDiscapacidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 3;
		this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
		this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDiscapacidad.add(jButtonid_empresaTipoDiscapacidadUpdate, this.gridBagConstraintsTipoDiscapacidad);
	}

	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 1;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDiscapacidad.add(jComboBoxid_empresaTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDiscapacidad.add(jLabelnombreTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 2;
		this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
		this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDiscapacidad.add(jButtonnombreTipoDiscapacidadBusqueda, this.gridBagConstraintsTipoDiscapacidad);
	}

	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 1;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDiscapacidad.add(jscrollPanenombreTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_inicialTipoDiscapacidad.add(jLabelporcentaje_inicialTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 2;
		this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
		this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_inicialTipoDiscapacidad.add(jButtonporcentaje_inicialTipoDiscapacidadBusqueda, this.gridBagConstraintsTipoDiscapacidad);
	}

	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 1;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_inicialTipoDiscapacidad.add(jTextFieldporcentaje_inicialTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_finalTipoDiscapacidad.add(jLabelporcentaje_finalTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = 2;
		this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
		this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_finalTipoDiscapacidad.add(jButtonporcentaje_finalTipoDiscapacidadBusqueda, this.gridBagConstraintsTipoDiscapacidad);
	}

	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
	this.gridBagConstraintsTipoDiscapacidad.gridx = 1;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_finalTipoDiscapacidad.add(jTextFieldporcentaje_finalTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDiscapacidad.gridy = iYPanelCamposTipoDiscapacidad;
	this.gridBagConstraintsTipoDiscapacidad.gridx = iXPanelCamposTipoDiscapacidad++;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDiscapacidad.add(this.jPanelidTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(iXPanelCamposTipoDiscapacidad % 1==0) {
		iXPanelCamposTipoDiscapacidad=0;
		iYPanelCamposTipoDiscapacidad++;
	}
	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDiscapacidad.gridy = iYPanelCamposTipoDiscapacidad;
	this.gridBagConstraintsTipoDiscapacidad.gridx = iXPanelCamposTipoDiscapacidad++;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDiscapacidad.add(this.jPanelnombreTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(iXPanelCamposTipoDiscapacidad % 1==0) {
		iXPanelCamposTipoDiscapacidad=0;
		iYPanelCamposTipoDiscapacidad++;
	}
	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDiscapacidad.gridy = iYPanelCamposTipoDiscapacidad;
	this.gridBagConstraintsTipoDiscapacidad.gridx = iXPanelCamposTipoDiscapacidad++;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDiscapacidad.add(this.jPanelporcentaje_inicialTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(iXPanelCamposTipoDiscapacidad % 1==0) {
		iXPanelCamposTipoDiscapacidad=0;
		iYPanelCamposTipoDiscapacidad++;
	}
	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDiscapacidad.gridy = iYPanelCamposTipoDiscapacidad;
	this.gridBagConstraintsTipoDiscapacidad.gridx = iXPanelCamposTipoDiscapacidad++;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDiscapacidad.add(this.jPanelporcentaje_finalTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(iXPanelCamposTipoDiscapacidad % 1==0) {
		iXPanelCamposTipoDiscapacidad=0;
		iYPanelCamposTipoDiscapacidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDiscapacidad.gridy = iYPanelCamposOcultosTipoDiscapacidad;
	this.gridBagConstraintsTipoDiscapacidad.gridx = iXPanelCamposOcultosTipoDiscapacidad++;
	this.gridBagConstraintsTipoDiscapacidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDiscapacidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDiscapacidad.add(this.jPanelid_empresaTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);



	if(iXPanelCamposOcultosTipoDiscapacidad % 1==0) {
		iXPanelCamposOcultosTipoDiscapacidad=0;
		iYPanelCamposOcultosTipoDiscapacidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDiscapacidad= new GridBagLayout();
		this.jPanelAccionesTipoDiscapacidad.setLayout(gridaBagLayoutAccionesTipoDiscapacidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDiscapacidad= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDiscapacidad.setLayout(gridaBagLayoutAccionesFormularioTipoDiscapacidad);
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDiscapacidad.add(this.jComboBoxTiposAccionesFormularioTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDiscapacidad.add(this.jCheckBoxPostAccionNuevoTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDiscapacidad.add(this.jCheckBoxPostAccionSinCerrarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDiscapacidad.add(this.jCheckBoxPostAccionSinMensajeTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDiscapacidad.add(this.jButtonModificarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);							

		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;
		this.gridBagConstraintsTipoDiscapacidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDiscapacidad.add(this.jButtonEliminarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDiscapacidad.add(this.jButtonActualizarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);


		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDiscapacidad.add(this.jButtonGuardarCambiosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);	
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = 0;		
		this.gridBagConstraintsTipoDiscapacidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDiscapacidad.add(this.jButtonCancelarTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDiscapacidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDiscapacidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();						
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDiscapacidad.gridx = 0;		
			//this.gridBagConstraintsTipoDiscapacidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDiscapacidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDiscapacidad.gridx =0;
		this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDiscapacidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDiscapacidad = new TipoDiscapacidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Discapacidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Discapacidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Discapacidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDiscapacidadModel tipodiscapacidadModel=new TipoDiscapacidadModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDiscapacidadModel.TipoDiscapacidadFocusTraversalPolicy tipodiscapacidadFocusTraversalPolicy = tipodiscapacidadModel.new TipoDiscapacidadFocusTraversalPolicy(this);
			
			//tipodiscapacidadFocusTraversalPolicy.settipodiscapacidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodiscapacidadModel);
			
			
			this.jContentPaneDetalleTipoDiscapacidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDiscapacidad = new GridBagLayout();	
			this.jContentPaneDetalleTipoDiscapacidad.setLayout(gridaBagLayoutDetalleTipoDiscapacidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDiscapacidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
				this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDiscapacidad.add(jTtoolBarDetalleTipoDiscapacidad, gridBagConstraintsTipoDiscapacidad);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDiscapacidad=   new JScrollPane(jContentPaneDetalleTipoDiscapacidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDiscapacidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDiscapacidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDiscapacidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDiscapacidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDiscapacidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDiscapacidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDiscapacidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	        
			this.jContentPaneDetalleTipoDiscapacidad.add(jPanelCamposTipoDiscapacidad, gridBagConstraintsTipoDiscapacidad);
			
			
			
			
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
						&& tipodiscapacidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(this.puedeCargarPorParteEmpleadoDisca,false,-1);
					
					if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDiscapacidad= new GridBagConstraints();
						this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
						this.jContentPaneDetalleTipoDiscapacidad.add(this.jTabbedPaneRelacionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDiscapacidad.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDiscapacidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
					this.gridBagConstraintsTipoDiscapacidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDiscapacidad.add(jPanelCamposOcultosTipoDiscapacidad, gridBagConstraintsTipoDiscapacidad);
				
					this.jPanelCamposOcultosTipoDiscapacidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	        this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDiscapacidad.add(this.jPanelAccionesFormularioTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);							
			
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
	        this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDiscapacidad.add(this.jPanelAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDiscapacidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDiscapacidad=   new JScrollPane(this.jPanelCamposTipoDiscapacidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDiscapacidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDiscapacidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDiscapacidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
			this.gridBagConstraintsTipoDiscapacidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDiscapacidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDiscapacidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);			
			
			this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
			this.gridBagConstraintsTipoDiscapacidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
			
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		
			
		this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
		this.gridBagConstraintsTipoDiscapacidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDiscapacidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDiscapacidad, this.gridBagConstraintsTipoDiscapacidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDiscapacidad;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDiscapacidad;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		this.empleadodiscaSessionBean.setConGuardarRelaciones(false);
		this.empleadodiscaSessionBean.setEsGuardarRelacionado(true);

		this.empleadodiscaBeanSwingJInternalFrame=null;//new EmpleadoDiscaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadodiscaBeanSwingJInternalFramePopup=new EmpleadoDiscaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadodiscaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {

				EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDiscapacidadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadodiscaSessionBean.setEsGuardarRelacionado(true);

				this.empleadodiscaBeanSwingJInternalFrame=new EmpleadoDiscaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadodiscaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadodiscaBeanSwingJInternalFrame.setempleadodiscaSessionBean(this.empleadodiscaSessionBean);

				//this.gridBagConstraintsTipoDiscapacidad = new GridBagConstraints();
				//this.gridBagConstraintsTipoDiscapacidad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDiscapacidad.gridx = 0;
				//this.jContentPaneDetalleTipoDiscapacidad.add(this.empleadodiscaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDiscapacidad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDiscapacidad.add("Empleado Discas",this.empleadodiscaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDiscapacidad.setComponentAt(iIndexTab,this.empleadodiscaBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadodiscaSessionBean.setEsGuardarRelacionado(false);
				this.empleadodiscaBeanSwingJInternalFrame=null;//new EmpleadoDiscaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoDisca) {
					this.jTabbedPaneRelacionesTipoDiscapacidad.add("Empleado Discas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoDiscaBeanSwingJInternalFrame(List<TipoDiscapacidad> tipodiscapacidads,TipoDiscapacidad tipodiscapacidad,EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadodiscaBeanSwingJInternalFrame=new EmpleadoDiscaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadodiscaBeanSwingJInternalFrame.getEmpleadoDiscaLogic().setConnexion(this.tipodiscapacidadLogic.getConnexion());

					empleadodiscaBeanSwingJInternalFrame.settipodiscapacidadsForeignKey(tipodiscapacidads);
					empleadodiscaBeanSwingJInternalFrame.settipodiscapacidadForeignKey(tipodiscapacidad);
					empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setisBusquedaDesdeForeignKeySesionTipoDiscapacidad(true);
					empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setlidTipoDiscapacidadActual(tipodiscapacidad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadodiscaBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoDisca(empleadodiscaBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadodiscaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDiscapacidad(true);
					empleadodiscaBeanSwingJInternalFrame.setid_tipo_discapacidadFK_IdTipoDiscapacidad(tipodiscapacidad.getId());

					if(!this.conCargarFormDetalle) {
						empleadodiscaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadodiscaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoDiscapacidadForeignKey(tipodiscapacidad,1,false,true,true);
					empleadodiscaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadodiscaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDiscapacidad");
					empleadodiscaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDiscapacidad");
					empleadodiscaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoDisca(true);
					empleadodiscaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoDisca("n",empleadodiscaBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadodiscaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadodiscaBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadodiscaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadodiscaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoDisca("relacionado");
					} else {
						empleadodiscaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoDisca("no_relacionado");
					}

					empleadodiscaBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoDisca().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
