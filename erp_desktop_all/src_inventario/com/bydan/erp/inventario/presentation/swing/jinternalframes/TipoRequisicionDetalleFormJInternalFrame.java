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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoRequisicionConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoRequisicionDetalleFormJInternalFrame extends TipoRequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRequisicion;
	
	protected JMenuBar jmenuBarDetalleTipoRequisicion;
	
	protected JMenu jmenuDetalleTipoRequisicion;
	protected JMenu jmenuDetalleArchivoTipoRequisicion;
	protected JMenu jmenuDetalleAccionesTipoRequisicion;
	protected JMenu jmenuDetalleDatosTipoRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRequisicion;	
	protected GridBagConstraints gridBagConstraintsTipoRequisicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRequisicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRequisicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoPeriodoBeanSwingJInternalFrame tipoperiodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoperiodo="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";
	
	public TipoRequisicionSessionBean tiporequisicionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoPeriodoSessionBean tipoperiodoSessionBean;
	public DiaSessionBean diaSessionBean;	
	
	public TipoRequisicionLogic tiporequisicionLogic;
	
	public JScrollPane jScrollPanelDatosTipoRequisicion;
	public JScrollPane jScrollPanelDatosEdicionTipoRequisicion;
	public JScrollPane jScrollPanelDatosGeneralTipoRequisicion;
	
	protected JPanel jPanelCamposTipoRequisicion;    
	protected JPanel jPanelCamposOcultosTipoRequisicion;    	
	protected JPanel jPanelAccionesTipoRequisicion;
	protected JPanel jPanelAccionesFormularioTipoRequisicion;
    
	
	
	protected Integer iXPanelCamposTipoRequisicion=0;
	protected Integer iYPanelCamposTipoRequisicion=0;
	
	protected Integer iXPanelCamposOcultosTipoRequisicion=0;
	protected Integer iYPanelCamposOcultosTipoRequisicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRequisicion;
	public JButton jButtonModificarTipoRequisicion;
	public JButton jButtonActualizarTipoRequisicion;
    public JButton jButtonEliminarTipoRequisicion;
	public JButton jButtonCancelarTipoRequisicion;
    public JButton jButtonGuardarCambiosTipoRequisicion;
	public JButton jButtonGuardarCambiosTablaTipoRequisicion;
	protected JButton jButtonCerrarTipoRequisicion;
	
	
	protected JButton jButtonProcesarInformacionTipoRequisicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRequisicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRequisicion;
	protected JButton jButtonModificarToolBarTipoRequisicion;
	protected JButton jButtonActualizarToolBarTipoRequisicion;
    protected JButton jButtonEliminarToolBarTipoRequisicion;
	protected JButton jButtonCancelarToolBarTipoRequisicion;
    protected JButton jButtonGuardarCambiosToolBarTipoRequisicion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRequisicion;
	protected JButton jButtonCerrarToolBarTipoRequisicion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRequisicion;
	protected JMenuItem jMenuItemModificarTipoRequisicion;
	protected JMenuItem jMenuItemActualizarTipoRequisicion;
    protected JMenuItem jMenuItemEliminarTipoRequisicion;
	protected JMenuItem jMenuItemCancelarTipoRequisicion;
    protected JMenuItem jMenuItemGuardarCambiosTipoRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRequisicion;
	protected JMenuItem jMenuItemCerrarTipoRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRequisicion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRequisicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRequisicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRequisicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRequisicion;
	public JLabel jLabelIdTipoRequisicion;
	public JLabel jLabelidTipoRequisicion;
	public JButton jButtonidTipoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRequisicion;
	public JLabel jLabelcodigoTipoRequisicion;
	public JTextField jTextFieldcodigoTipoRequisicion;
	public JButton jButtoncodigoTipoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRequisicion;
	public JLabel jLabelnombreTipoRequisicion;
	public JTextField jTextFieldnombreTipoRequisicion;
	public JButton jButtonnombreTipoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelhoraTipoRequisicion;
	public JLabel jLabelhoraTipoRequisicion;
	public JSpinner jSpinnerhoraTipoRequisicion= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraTipoRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRequisicion;
	public JLabel jLabelid_empresaTipoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRequisicion;
	public JButton jButtonid_empresaTipoRequisicion= new JButtonMe();
	public JButton jButtonid_empresaTipoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_periodoTipoRequisicion;
	public JLabel jLabelid_tipo_periodoTipoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_periodoTipoRequisicion;
	public JButton jButtonid_tipo_periodoTipoRequisicion= new JButtonMe();
	public JButton jButtonid_tipo_periodoTipoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_periodoTipoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_diaTipoRequisicion;
	public JLabel jLabelid_diaTipoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_diaTipoRequisicion;
	public JButton jButtonid_diaTipoRequisicion= new JButtonMe();
	public JButton jButtonid_diaTipoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_diaTipoRequisicionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRequisicion;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRequisicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRequisicion=new JPanel();
				this.jPanelAccionesFormularioTipoRequisicion=new JPanel();
				this.jmenuBarDetalleTipoRequisicion=new JMenuBar();
				this.jTtoolBarDetalleTipoRequisicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRequisicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRequisicion() {
		return this.jButtonActualizarToolBarTipoRequisicion;
	}
	
	public JButton getjButtonEliminarToolBarTipoRequisicion() {
		return this.jButtonEliminarToolBarTipoRequisicion;
	}
	
	public JButton getjButtonCancelarToolBarTipoRequisicion() {
		return this.jButtonCancelarToolBarTipoRequisicion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRequisicion() {
		return this.jButtonProcesarInformacionTipoRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRequisicion)	{
		this.jButtonProcesarInformacionTipoRequisicion = jButtonProcesarInformacionTipoRequisicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRequisicion() {
		return this.jComboBoxTiposAccionesTipoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRequisicion(
			JComboBox jComboBoxTiposRelacionesTipoRequisicion) {
		this.jComboBoxTiposRelacionesTipoRequisicion = jComboBoxTiposRelacionesTipoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRequisicion(
			JComboBox jComboBoxTiposAccionesTipoRequisicion) {
		this.jComboBoxTiposAccionesTipoRequisicion = jComboBoxTiposAccionesTipoRequisicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRequisicion() {
		return this.jComboBoxTiposAccionesFormularioTipoRequisicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRequisicion(
			JComboBox jComboBoxTiposAccionesFormularioTipoRequisicion) {
		this.jComboBoxTiposAccionesFormularioTipoRequisicion = jComboBoxTiposAccionesFormularioTipoRequisicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
		
		this.tiporequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporequisicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Requesicion MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRequisicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRequisicion=new JButtonMe();
				this.jButtonModificarToolBarTipoRequisicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRequisicion,this.jTtoolBarDetalleTipoRequisicion,
							"actualizar","actualizar","Actualizar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRequisicion,this.jTtoolBarDetalleTipoRequisicion,
							"eliminar","eliminar","Eliminar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRequisicion,this.jTtoolBarDetalleTipoRequisicion,
							"cancelar","cancelar","Cancelar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRequisicion,this.jTtoolBarDetalleTipoRequisicion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRequisicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRequisicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRequisicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRequisicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRequisicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRequisicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRequisicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRequisicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRequisicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRequisicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRequisicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRequisicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRequisicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRequisicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRequisicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRequisicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRequisicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRequisicion.add(this.jMenuItemDetalleCerrarTipoRequisicion);
		
		this.jmenuDetalleAccionesTipoRequisicion.add(this.jMenuItemActualizarTipoRequisicion);
		this.jmenuDetalleAccionesTipoRequisicion.add(this.jMenuItemEliminarTipoRequisicion);
		this.jmenuDetalleAccionesTipoRequisicion.add(this.jMenuItemCancelarTipoRequisicion);		
		
		//this.jmenuDetalleDatosTipoRequisicion.add(this.jMenuItemDetalleAbrirOrderByTipoRequisicion);				
		this.jmenuDetalleDatosTipoRequisicion.add(this.jMenuItemDetalleMostarOcultarTipoRequisicion);				
				
		//this.jmenuDetalleAccionesTipoRequisicion.add(this.jMenuItemGuardarCambiosTipoRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRequisicion.add(this.jmenuDetalleArchivoTipoRequisicion);		
		this.jmenuBarDetalleTipoRequisicion.add(this.jmenuDetalleAccionesTipoRequisicion);		
		this.jmenuBarDetalleTipoRequisicion.add(this.jmenuDetalleDatosTipoRequisicion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRequisicion);				
	}
	
	
	public void inicializarElementosCamposTipoRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRequisicion = new JLabelMe();
		jLabelIdTipoRequisicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRequisicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRequisicion= new GridBagLayout();

		this.jPanelidTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);

		jLabelidTipoRequisicion = new JLabel();
		jLabelidTipoRequisicion.setText("Id");

		jLabelidTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRequisicion = new JLabelMe();
		this.jLabelcodigoTipoRequisicion.setText(""+TipoRequisicionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRequisicion.setToolTipText("Codigo");
		this.jLabelcodigoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRequisicion = new GridBagLayout();
		this.jPanelcodigoTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);


		jTextFieldcodigoTipoRequisicion= new JTextFieldMe();

		jTextFieldcodigoTipoRequisicion.setEnabled(false);
		jTextFieldcodigoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRequisicionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRequisicionBusqueda.setText("U");
		this.jButtoncodigoTipoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRequisicionBusqueda"));

		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRequisicionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRequisicion = new JLabelMe();
		this.jLabelnombreTipoRequisicion.setText(""+TipoRequisicionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRequisicion.setToolTipText("Nombre");
		this.jLabelnombreTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRequisicion = new GridBagLayout();
		this.jPanelnombreTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);


		jTextFieldnombreTipoRequisicion= new JTextFieldMe();

		jTextFieldnombreTipoRequisicion.setEnabled(false);
		jTextFieldnombreTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoRequisicionBusqueda= new JButtonMe();
		this.jButtonnombreTipoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRequisicionBusqueda.setText("U");
		this.jButtonnombreTipoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRequisicionBusqueda"));

		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRequisicionBusqueda.setVisible(false);		}


					
		this.jLabelhoraTipoRequisicion = new JLabelMe();
		this.jLabelhoraTipoRequisicion.setText(""+TipoRequisicionConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraTipoRequisicion.setToolTipText("Hora");
		this.jLabelhoraTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutTipoRequisicion = new GridBagLayout();
		this.jPanelhoraTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);


		//jFormattedTextFieldhoraTipoRequisicion= new JFormattedTextFieldMe();

		jSpinnerhoraTipoRequisicion= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraTipoRequisicion.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraTipoRequisicion = new JSpinner.DateEditor(jSpinnerhoraTipoRequisicion, "HH:mm:ss");

		jSpinnerhoraTipoRequisicion.setEditor(timeEditorhoraTipoRequisicion);

		jSpinnerhoraTipoRequisicion.setValue(new Date());

		jSpinnerhoraTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraTipoRequisicion.setValue(new Date());
		//jSpinnerhoraTipoRequisicion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraTipoRequisicion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraTipoRequisicionBusqueda= new JButtonMe();
		this.jButtonhoraTipoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraTipoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraTipoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraTipoRequisicionBusqueda.setText("U");
		this.jButtonhoraTipoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraTipoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraTipoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaTipoRequisicionBusqueda"));

		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraTipoRequisicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRequisicion = new JLabelMe();
		this.jLabelid_empresaTipoRequisicion.setText(""+TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRequisicion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRequisicion = new GridBagLayout();
		this.jPanelid_empresaTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);


		jComboBoxid_empresaTipoRequisicion= new JComboBoxMe();
		jComboBoxid_empresaTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRequisicion.setEnabled(false);

		this.jButtonid_empresaTipoRequisicion= new JButtonMe();
		this.jButtonid_empresaTipoRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRequisicion.setText("Buscar");
		this.jButtonid_empresaTipoRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRequisicion"));

		this.jButtonid_empresaTipoRequisicionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRequisicionBusqueda.setText("U");
		this.jButtonid_empresaTipoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRequisicionBusqueda"));

		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoRequisicionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRequisicionUpdate.setText("U");
		this.jButtonid_empresaTipoRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRequisicionUpdate"));



					
		this.jLabelid_tipo_periodoTipoRequisicion = new JLabelMe();
		this.jLabelid_tipo_periodoTipoRequisicion.setText(""+TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO+" : *");
		this.jLabelid_tipo_periodoTipoRequisicion.setToolTipText("Tipo Periodo");
		this.jLabelid_tipo_periodoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_periodoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_periodoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_periodoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_periodoTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_periodoTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO);
		this.gridaBagLayoutTipoRequisicion = new GridBagLayout();
		this.jPanelid_tipo_periodoTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);


		jComboBoxid_tipo_periodoTipoRequisicion= new JComboBoxMe();
		jComboBoxid_tipo_periodoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_periodoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_periodoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_periodoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_periodoTipoRequisicion= new JButtonMe();
		this.jButtonid_tipo_periodoTipoRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_periodoTipoRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_periodoTipoRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_periodoTipoRequisicion.setText("Buscar");
		this.jButtonid_tipo_periodoTipoRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_periodoTipoRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_periodoTipoRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_periodoTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_periodoTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_periodoTipoRequisicion"));

		this.jButtonid_tipo_periodoTipoRequisicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setText("U");
		this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_periodoTipoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_periodoTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_periodoTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_periodoTipoRequisicionBusqueda"));

		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_periodoTipoRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_periodoTipoRequisicionUpdate= new JButtonMe();
		this.jButtonid_tipo_periodoTipoRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_periodoTipoRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_periodoTipoRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_periodoTipoRequisicionUpdate.setText("U");
		this.jButtonid_tipo_periodoTipoRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_periodoTipoRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_periodoTipoRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_periodoTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_periodoTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_periodoTipoRequisicionUpdate"));



					
		this.jLabelid_diaTipoRequisicion = new JLabelMe();
		this.jLabelid_diaTipoRequisicion.setText(""+TipoRequisicionConstantesFunciones.LABEL_IDDIA+" : *");
		this.jLabelid_diaTipoRequisicion.setToolTipText("Dia");
		this.jLabelid_diaTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_diaTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_diaTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_diaTipoRequisicion.setToolTipText(TipoRequisicionConstantesFunciones.LABEL_IDDIA);
		this.gridaBagLayoutTipoRequisicion = new GridBagLayout();
		this.jPanelid_diaTipoRequisicion.setLayout(this.gridaBagLayoutTipoRequisicion);


		jComboBoxid_diaTipoRequisicion= new JComboBoxMe();
		jComboBoxid_diaTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_diaTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_diaTipoRequisicion= new JButtonMe();
		this.jButtonid_diaTipoRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaTipoRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaTipoRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaTipoRequisicion.setText("Buscar");
		this.jButtonid_diaTipoRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_diaTipoRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaTipoRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_diaTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaTipoRequisicion"));

		this.jButtonid_diaTipoRequisicionBusqueda= new JButtonMe();
		this.jButtonid_diaTipoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaTipoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaTipoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaTipoRequisicionBusqueda.setText("U");
		this.jButtonid_diaTipoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_diaTipoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaTipoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_diaTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaTipoRequisicionBusqueda"));

		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_diaTipoRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_diaTipoRequisicionUpdate= new JButtonMe();
		this.jButtonid_diaTipoRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaTipoRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaTipoRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaTipoRequisicionUpdate.setText("U");
		this.jButtonid_diaTipoRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_diaTipoRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaTipoRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_diaTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaTipoRequisicionUpdate"));



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
		//this.jInternalFrameDetalleTipoRequisicion = new TipoRequisicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Requesicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRequisicion= new GridBagLayout();
		

		
		String sToolTipTipoRequisicion="";
		sToolTipTipoRequisicion=TipoRequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRequisicion+="(Inventario.TipoRequisicion)";
		}
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRequisicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRequisicion = new JButtonMe();
		this.jButtonModificarTipoRequisicion = new JButtonMe();
        this.jButtonActualizarTipoRequisicion = new JButtonMe();
        this.jButtonEliminarTipoRequisicion = new JButtonMe();
        this.jButtonCancelarTipoRequisicion = new JButtonMe();
        this.jButtonGuardarCambiosTipoRequisicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRequisicion = new JButtonMe();
		this.jButtonCerrarTipoRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoRequisicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRequisicion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRequisicion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Requesicion";
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Requesiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRequisicion.setName("jPanelCamposTipoRequisicion"); 

		this.jPanelCamposOcultosTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRequisicion.setName("jPanelCamposOcultosTipoRequisicion"); 

        this.jPanelAccionesTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoRequisicion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRequisicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRequisicion.setText("Nuevo");
		this.jButtonModificarTipoRequisicion.setText("Editar");
        this.jButtonActualizarTipoRequisicion.setText("Actualizar");
        this.jButtonEliminarTipoRequisicion.setText("Eliminar");
        this.jButtonCancelarTipoRequisicion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRequisicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRequisicion.setText("Guardar");
		this.jButtonCerrarTipoRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRequisicion,"nuevo_button","Nuevo",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRequisicion,"modificar_button","Editar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRequisicion,"actualizar_button","Actualizar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRequisicion,"eliminar_button","Eliminar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRequisicion,"cancelar_button","Cancelar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRequisicion,"guardarcambios_button","Guardar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRequisicion,"guardarcambiostabla_button","Guardar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRequisicion,"cerrar_button","Salir",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRequisicion.setToolTipText("Nuevo"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRequisicion.setToolTipText("Editar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRequisicion.setToolTipText("Actualizar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRequisicion.setToolTipText("Eliminar)"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRequisicion.setToolTipText("Cancelar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRequisicion.setToolTipText("Guardar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRequisicion.setToolTipText("Guardar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRequisicion.setToolTipText("Salir"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRequisicion";
		inputMap = this.jButtonNuevoTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRequisicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRequisicion";
		inputMap = this.jButtonActualizarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRequisicion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRequisicion";
		inputMap = this.jButtonEliminarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRequisicion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRequisicion";
		inputMap = this.jButtonCancelarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRequisicion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRequisicion";
		inputMap = this.jButtonCerrarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRequisicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRequisicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRequisicion.setToolTipText("Nuevo TipoRequisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRequisicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRequisicion.setToolTipText("Sin Cerrar Ventana TipoRequisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRequisicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRequisicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoRequisicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRequisicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRequisicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRequisicion = new JLabelMe();
		
		this.jLabelAccionesTipoRequisicion.setText("Acciones");		
		this.jLabelAccionesTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRequisicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRequisicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRequisicion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRequisicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRequisicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRequisicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRequisicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRequisicion = new GridBagLayout();
		
		this.jPanelCamposTipoRequisicion.setLayout(gridaBagLayoutCamposTipoRequisicion);
		this.jPanelCamposOcultosTipoRequisicion.setLayout(gridaBagLayoutCamposOcultosTipoRequisicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRequisicion.add(jLabelIdTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRequisicion.add(jLabelidTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRequisicion.add(jLabelid_empresaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 2;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRequisicion.add(jButtonid_empresaTipoRequisicionBusqueda, this.gridBagConstraintsTipoRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 3;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRequisicion.add(jButtonid_empresaTipoRequisicionUpdate, this.gridBagConstraintsTipoRequisicion);
	}

	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRequisicion.add(jComboBoxid_empresaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRequisicion.add(jLabelcodigoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 2;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRequisicion.add(jButtoncodigoTipoRequisicionBusqueda, this.gridBagConstraintsTipoRequisicion);
	}

	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRequisicion.add(jTextFieldcodigoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRequisicion.add(jLabelnombreTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 2;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRequisicion.add(jButtonnombreTipoRequisicionBusqueda, this.gridBagConstraintsTipoRequisicion);
	}

	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRequisicion.add(jTextFieldnombreTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_periodoTipoRequisicion.add(jLabelid_tipo_periodoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 2;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_periodoTipoRequisicion.add(jButtonid_tipo_periodoTipoRequisicionBusqueda, this.gridBagConstraintsTipoRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 3;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_periodoTipoRequisicion.add(jButtonid_tipo_periodoTipoRequisicionUpdate, this.gridBagConstraintsTipoRequisicion);
	}

	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_periodoTipoRequisicion.add(jComboBoxid_tipo_periodoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_diaTipoRequisicion.add(jLabelid_diaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 2;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaTipoRequisicion.add(jButtonid_diaTipoRequisicionBusqueda, this.gridBagConstraintsTipoRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 3;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaTipoRequisicion.add(jButtonid_diaTipoRequisicionUpdate, this.gridBagConstraintsTipoRequisicion);
	}

	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_diaTipoRequisicion.add(jComboBoxid_diaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 0;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoraTipoRequisicion.add(jLabelhoraTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 2;
		this.gridBagConstraintsTipoRequisicion.ipadx = 0;
		this.gridBagConstraintsTipoRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraTipoRequisicion.add(jButtonhoraTipoRequisicionBusqueda, this.gridBagConstraintsTipoRequisicion);
	}

	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRequisicion.gridy = 0;
	this.gridBagConstraintsTipoRequisicion.gridx = 1;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoraTipoRequisicion.add(jSpinnerhoraTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRequisicion.add(this.jPanelidTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposTipoRequisicion % 1==0) {
		iXPanelCamposTipoRequisicion=0;
		iYPanelCamposTipoRequisicion++;
	}
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRequisicion.add(this.jPanelcodigoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposTipoRequisicion % 1==0) {
		iXPanelCamposTipoRequisicion=0;
		iYPanelCamposTipoRequisicion++;
	}
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRequisicion.add(this.jPanelnombreTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposTipoRequisicion % 1==0) {
		iXPanelCamposTipoRequisicion=0;
		iYPanelCamposTipoRequisicion++;
	}
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRequisicion.add(this.jPanelid_tipo_periodoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposTipoRequisicion % 1==0) {
		iXPanelCamposTipoRequisicion=0;
		iYPanelCamposTipoRequisicion++;
	}
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRequisicion.add(this.jPanelid_diaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposTipoRequisicion % 1==0) {
		iXPanelCamposTipoRequisicion=0;
		iYPanelCamposTipoRequisicion++;
	}
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRequisicion.add(this.jPanelhoraTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposTipoRequisicion % 1==0) {
		iXPanelCamposTipoRequisicion=0;
		iYPanelCamposTipoRequisicion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRequisicion.gridy = iYPanelCamposOcultosTipoRequisicion;
	this.gridBagConstraintsTipoRequisicion.gridx = iXPanelCamposOcultosTipoRequisicion++;
	this.gridBagConstraintsTipoRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRequisicion.add(this.jPanelid_empresaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);



	if(iXPanelCamposOcultosTipoRequisicion % 1==0) {
		iXPanelCamposOcultosTipoRequisicion=0;
		iYPanelCamposOcultosTipoRequisicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRequisicion= new GridBagLayout();
		this.jPanelAccionesTipoRequisicion.setLayout(gridaBagLayoutAccionesTipoRequisicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRequisicion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRequisicion.setLayout(gridaBagLayoutAccionesFormularioTipoRequisicion);
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRequisicion.add(this.jComboBoxTiposAccionesFormularioTipoRequisicion, this.gridBagConstraintsTipoRequisicion);

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRequisicion.add(this.jCheckBoxPostAccionNuevoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRequisicion.add(this.jCheckBoxPostAccionSinCerrarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRequisicion.add(this.jCheckBoxPostAccionSinMensajeTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRequisicion.add(this.jButtonModificarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);							

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRequisicion.add(this.jButtonEliminarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
			
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = 0;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRequisicion.add(this.jButtonActualizarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);


		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = 0;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRequisicion.add(this.jButtonGuardarCambiosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);	
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = 0;		
		this.gridBagConstraintsTipoRequisicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRequisicion.add(this.jButtonCancelarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRequisicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRequisicion.gridx = 0;		
			//this.gridBagConstraintsTipoRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRequisicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRequisicion.gridx =0;
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRequisicion = new TipoRequisicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Requesicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Requesicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Requesicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRequisicionModel tiporequisicionModel=new TipoRequisicionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRequisicionModel.TipoRequisicionFocusTraversalPolicy tiporequisicionFocusTraversalPolicy = tiporequisicionModel.new TipoRequisicionFocusTraversalPolicy(this);
			
			//tiporequisicionFocusTraversalPolicy.settiporequisicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporequisicionModel);
			
			
			this.jContentPaneDetalleTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRequisicion = new GridBagLayout();	
			this.jContentPaneDetalleTipoRequisicion.setLayout(gridaBagLayoutDetalleTipoRequisicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRequisicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsTipoRequisicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRequisicion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRequisicion.add(jTtoolBarDetalleTipoRequisicion, gridBagConstraintsTipoRequisicion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRequisicion=   new JScrollPane(jContentPaneDetalleTipoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRequisicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRequisicion.gridx = 0;
	        
			this.jContentPaneDetalleTipoRequisicion.add(jPanelCamposTipoRequisicion, gridBagConstraintsTipoRequisicion);
			
			
			
			
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
						&& tiporequisicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRequisicion= new GridBagConstraints();
						this.gridBagConstraintsTipoRequisicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRequisicion.gridx = 0;
						this.jContentPaneDetalleTipoRequisicion.add(this.jTabbedPaneRelacionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRequisicion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRequisicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
					this.gridBagConstraintsTipoRequisicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRequisicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRequisicion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRequisicion.add(jPanelCamposOcultosTipoRequisicion, gridBagConstraintsTipoRequisicion);
				
					this.jPanelCamposOcultosTipoRequisicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoRequisicion.gridx = 0;
	        this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRequisicion.add(this.jPanelAccionesFormularioTipoRequisicion, this.gridBagConstraintsTipoRequisicion);							
			
			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
	        this.gridBagConstraintsTipoRequisicion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoRequisicion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRequisicion.add(this.jPanelAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRequisicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRequisicion=   new JScrollPane(this.jPanelCamposTipoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRequisicion.gridx = 0;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRequisicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
			
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
			
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRequisicion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRequisicion;
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
