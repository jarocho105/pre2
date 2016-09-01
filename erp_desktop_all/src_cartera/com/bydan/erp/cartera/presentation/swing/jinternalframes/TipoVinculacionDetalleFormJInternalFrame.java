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
import com.bydan.erp.cartera.util.TipoVinculacionConstantesFunciones;

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
public class TipoVinculacionDetalleFormJInternalFrame extends TipoVinculacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoVinculacion;
	
	protected JMenuBar jmenuBarDetalleTipoVinculacion;
	
	protected JMenu jmenuDetalleTipoVinculacion;
	protected JMenu jmenuDetalleArchivoTipoVinculacion;
	protected JMenu jmenuDetalleAccionesTipoVinculacion;
	protected JMenu jmenuDetalleDatosTipoVinculacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVinculacion;	
	protected GridBagConstraints gridBagConstraintsTipoVinculacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoVinculacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoVinculacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoVinculacionSessionBean tipovinculacionSessionBean;
	
	

	public InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFrame=null;
	public InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionEconomica=false;
	public InformacionEconomicaSessionBean informacioneconomicaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoVinculacionLogic tipovinculacionLogic;
	
	public JScrollPane jScrollPanelDatosTipoVinculacion;
	public JScrollPane jScrollPanelDatosEdicionTipoVinculacion;
	public JScrollPane jScrollPanelDatosGeneralTipoVinculacion;
	
	protected JPanel jPanelCamposTipoVinculacion;    
	protected JPanel jPanelCamposOcultosTipoVinculacion;    	
	protected JPanel jPanelAccionesTipoVinculacion;
	protected JPanel jPanelAccionesFormularioTipoVinculacion;
    
	
	
	protected Integer iXPanelCamposTipoVinculacion=0;
	protected Integer iYPanelCamposTipoVinculacion=0;
	
	protected Integer iXPanelCamposOcultosTipoVinculacion=0;
	protected Integer iYPanelCamposOcultosTipoVinculacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoVinculacion;
	public JButton jButtonModificarTipoVinculacion;
	public JButton jButtonActualizarTipoVinculacion;
    public JButton jButtonEliminarTipoVinculacion;
	public JButton jButtonCancelarTipoVinculacion;
    public JButton jButtonGuardarCambiosTipoVinculacion;
	public JButton jButtonGuardarCambiosTablaTipoVinculacion;
	protected JButton jButtonCerrarTipoVinculacion;
	
	
	protected JButton jButtonProcesarInformacionTipoVinculacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoVinculacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoVinculacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoVinculacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVinculacion;
	protected JButton jButtonModificarToolBarTipoVinculacion;
	protected JButton jButtonActualizarToolBarTipoVinculacion;
    protected JButton jButtonEliminarToolBarTipoVinculacion;
	protected JButton jButtonCancelarToolBarTipoVinculacion;
    protected JButton jButtonGuardarCambiosToolBarTipoVinculacion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoVinculacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVinculacion;
	protected JButton jButtonCerrarToolBarTipoVinculacion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoVinculacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVinculacion;
	protected JMenuItem jMenuItemModificarTipoVinculacion;
	protected JMenuItem jMenuItemActualizarTipoVinculacion;
    protected JMenuItem jMenuItemEliminarTipoVinculacion;
	protected JMenuItem jMenuItemCancelarTipoVinculacion;
    protected JMenuItem jMenuItemGuardarCambiosTipoVinculacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVinculacion;
	protected JMenuItem jMenuItemCerrarTipoVinculacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoVinculacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVinculacion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoVinculacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVinculacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoVinculacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVinculacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVinculacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVinculacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoVinculacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoVinculacion;
	public JLabel jLabelIdTipoVinculacion;
	public JLabel jLabelidTipoVinculacion;
	public JButton jButtonidTipoVinculacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoVinculacion;
	public JLabel jLabelcodigoTipoVinculacion;
	public JTextField jTextFieldcodigoTipoVinculacion;
	public JButton jButtoncodigoTipoVinculacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoVinculacion;
	public JLabel jLabelnombreTipoVinculacion;
	public JTextArea jTextAreanombreTipoVinculacion;
	public JScrollPane jscrollPanenombreTipoVinculacion;
	public JButton jButtonnombreTipoVinculacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoVinculacion;
	public JLabel jLabelid_empresaTipoVinculacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoVinculacion;
	public JButton jButtonid_empresaTipoVinculacion= new JButtonMe();
	public JButton jButtonid_empresaTipoVinculacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoVinculacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoVinculacion;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoVinculacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoVinculacion=new JPanel();
				this.jPanelAccionesFormularioTipoVinculacion=new JPanel();
				this.jmenuBarDetalleTipoVinculacion=new JMenuBar();
				this.jTtoolBarDetalleTipoVinculacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoVinculacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoVinculacion() {
		return this.jButtonActualizarToolBarTipoVinculacion;
	}
	
	public JButton getjButtonEliminarToolBarTipoVinculacion() {
		return this.jButtonEliminarToolBarTipoVinculacion;
	}
	
	public JButton getjButtonCancelarToolBarTipoVinculacion() {
		return this.jButtonCancelarToolBarTipoVinculacion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoVinculacion() {
		return this.jButtonProcesarInformacionTipoVinculacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVinculacion)	{
		this.jButtonProcesarInformacionTipoVinculacion = jButtonProcesarInformacionTipoVinculacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVinculacion() {
		return this.jComboBoxTiposAccionesTipoVinculacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVinculacion(
			JComboBox jComboBoxTiposRelacionesTipoVinculacion) {
		this.jComboBoxTiposRelacionesTipoVinculacion = jComboBoxTiposRelacionesTipoVinculacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVinculacion(
			JComboBox jComboBoxTiposAccionesTipoVinculacion) {
		this.jComboBoxTiposAccionesTipoVinculacion = jComboBoxTiposAccionesTipoVinculacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoVinculacion() {
		return this.jComboBoxTiposAccionesFormularioTipoVinculacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoVinculacion(
			JComboBox jComboBoxTiposAccionesFormularioTipoVinculacion) {
		this.jComboBoxTiposAccionesFormularioTipoVinculacion = jComboBoxTiposAccionesFormularioTipoVinculacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
		
		this.tipovinculacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovinculacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovinculacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVinculacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Vinculacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoVinculacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoVinculacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoVinculacion=new JButtonMe();
				this.jButtonModificarToolBarTipoVinculacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoVinculacion,this.jTtoolBarDetalleTipoVinculacion,
							"actualizar","actualizar","Actualizar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoVinculacion,this.jTtoolBarDetalleTipoVinculacion,
							"eliminar","eliminar","Eliminar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoVinculacion,this.jTtoolBarDetalleTipoVinculacion,
							"cancelar","cancelar","Cancelar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoVinculacion,this.jTtoolBarDetalleTipoVinculacion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoVinculacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoVinculacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoVinculacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoVinculacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoVinculacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVinculacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVinculacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVinculacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoVinculacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoVinculacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoVinculacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoVinculacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoVinculacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoVinculacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoVinculacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoVinculacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoVinculacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoVinculacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoVinculacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoVinculacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoVinculacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVinculacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVinculacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVinculacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVinculacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVinculacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoVinculacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoVinculacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoVinculacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVinculacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVinculacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVinculacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVinculacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVinculacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVinculacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoVinculacion.add(this.jMenuItemDetalleCerrarTipoVinculacion);
		
		this.jmenuDetalleAccionesTipoVinculacion.add(this.jMenuItemActualizarTipoVinculacion);
		this.jmenuDetalleAccionesTipoVinculacion.add(this.jMenuItemEliminarTipoVinculacion);
		this.jmenuDetalleAccionesTipoVinculacion.add(this.jMenuItemCancelarTipoVinculacion);		
		
		//this.jmenuDetalleDatosTipoVinculacion.add(this.jMenuItemDetalleAbrirOrderByTipoVinculacion);				
		this.jmenuDetalleDatosTipoVinculacion.add(this.jMenuItemDetalleMostarOcultarTipoVinculacion);				
				
		//this.jmenuDetalleAccionesTipoVinculacion.add(this.jMenuItemGuardarCambiosTipoVinculacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoVinculacion.add(this.jmenuDetalleArchivoTipoVinculacion);		
		this.jmenuBarDetalleTipoVinculacion.add(this.jmenuDetalleAccionesTipoVinculacion);		
		this.jmenuBarDetalleTipoVinculacion.add(this.jmenuDetalleDatosTipoVinculacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoVinculacion.add(this.jmenuDetalleTipoVinculacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoVinculacion);				
	}
	
	
	public void inicializarElementosCamposTipoVinculacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoVinculacion = new JLabelMe();
		jLabelIdTipoVinculacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoVinculacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoVinculacion.setToolTipText(TipoVinculacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoVinculacion= new GridBagLayout();

		this.jPanelidTipoVinculacion.setLayout(this.gridaBagLayoutTipoVinculacion);

		jLabelidTipoVinculacion = new JLabel();
		jLabelidTipoVinculacion.setText("Id");

		jLabelidTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoVinculacion = new JLabelMe();
		this.jLabelcodigoTipoVinculacion.setText(""+TipoVinculacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoVinculacion.setToolTipText("Codigo");
		this.jLabelcodigoTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoVinculacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoVinculacion.setToolTipText(TipoVinculacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoVinculacion = new GridBagLayout();
		this.jPanelcodigoTipoVinculacion.setLayout(this.gridaBagLayoutTipoVinculacion);


		jTextFieldcodigoTipoVinculacion= new JTextFieldMe();

		jTextFieldcodigoTipoVinculacion.setEnabled(false);
		jTextFieldcodigoTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoVinculacionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoVinculacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVinculacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVinculacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoVinculacionBusqueda.setText("U");
		this.jButtoncodigoTipoVinculacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoVinculacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoVinculacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoVinculacionBusqueda"));

		if(this.tipovinculacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoVinculacionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoVinculacion = new JLabelMe();
		this.jLabelnombreTipoVinculacion.setText(""+TipoVinculacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoVinculacion.setToolTipText("Nombre");
		this.jLabelnombreTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoVinculacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoVinculacion.setToolTipText(TipoVinculacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoVinculacion = new GridBagLayout();
		this.jPanelnombreTipoVinculacion.setLayout(this.gridaBagLayoutTipoVinculacion);


		jTextAreanombreTipoVinculacion= new JTextAreaMe();
		jTextAreanombreTipoVinculacion.setEnabled(false);
		jTextAreanombreTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVinculacion.setLineWrap(true);
		jTextAreanombreTipoVinculacion.setWrapStyleWord(true);
		jTextAreanombreTipoVinculacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoVinculacion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoVinculacion = new JScrollPane(jTextAreanombreTipoVinculacion);
		jscrollPanenombreTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoVinculacionBusqueda= new JButtonMe();
		this.jButtonnombreTipoVinculacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVinculacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVinculacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoVinculacionBusqueda.setText("U");
		this.jButtonnombreTipoVinculacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoVinculacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoVinculacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoVinculacionBusqueda"));

		if(this.tipovinculacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoVinculacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoVinculacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoVinculacion = new JLabelMe();
		this.jLabelid_empresaTipoVinculacion.setText(""+TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoVinculacion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoVinculacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoVinculacion.setToolTipText(TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoVinculacion = new GridBagLayout();
		this.jPanelid_empresaTipoVinculacion.setLayout(this.gridaBagLayoutTipoVinculacion);


		jComboBoxid_empresaTipoVinculacion= new JComboBoxMe();
		jComboBoxid_empresaTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoVinculacion.setEnabled(false);

		this.jButtonid_empresaTipoVinculacion= new JButtonMe();
		this.jButtonid_empresaTipoVinculacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVinculacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVinculacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVinculacion.setText("Buscar");
		this.jButtonid_empresaTipoVinculacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoVinculacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVinculacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVinculacion"));

		this.jButtonid_empresaTipoVinculacionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoVinculacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVinculacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVinculacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoVinculacionBusqueda.setText("U");
		this.jButtonid_empresaTipoVinculacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoVinculacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVinculacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVinculacionBusqueda"));

		if(this.tipovinculacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoVinculacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoVinculacionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoVinculacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVinculacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVinculacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoVinculacionUpdate.setText("U");
		this.jButtonid_empresaTipoVinculacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoVinculacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVinculacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVinculacionUpdate"));



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
		//this.jInternalFrameDetalleTipoVinculacion = new TipoVinculacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Vinculacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVinculacion= new GridBagLayout();
		

		
		String sToolTipTipoVinculacion="";
		sToolTipTipoVinculacion=TipoVinculacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVinculacion+="(Cartera.TipoVinculacion)";
		}
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVinculacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoVinculacion = new JButtonMe();
		this.jButtonModificarTipoVinculacion = new JButtonMe();
        this.jButtonActualizarTipoVinculacion = new JButtonMe();
        this.jButtonEliminarTipoVinculacion = new JButtonMe();
        this.jButtonCancelarTipoVinculacion = new JButtonMe();
        this.jButtonGuardarCambiosTipoVinculacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoVinculacion = new JButtonMe();
		this.jButtonCerrarTipoVinculacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoVinculacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoVinculacion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoVinculacion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Vinculacion";
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Vinculaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVinculacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoVinculacion.setName("jPanelCamposTipoVinculacion"); 

		this.jPanelCamposOcultosTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoVinculacion.setName("jPanelCamposOcultosTipoVinculacion"); 

        this.jPanelAccionesTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVinculacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoVinculacion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoVinculacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoVinculacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoVinculacion.setText("Nuevo");
		this.jButtonModificarTipoVinculacion.setText("Editar");
        this.jButtonActualizarTipoVinculacion.setText("Actualizar");
        this.jButtonEliminarTipoVinculacion.setText("Eliminar");
        this.jButtonCancelarTipoVinculacion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoVinculacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoVinculacion.setText("Guardar");
		this.jButtonCerrarTipoVinculacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVinculacion,"nuevo_button","Nuevo",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoVinculacion,"modificar_button","Editar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoVinculacion,"actualizar_button","Actualizar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoVinculacion,"eliminar_button","Eliminar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoVinculacion,"cancelar_button","Cancelar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoVinculacion,"guardarcambios_button","Guardar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVinculacion,"guardarcambiostabla_button","Guardar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVinculacion,"cerrar_button","Salir",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoVinculacion.setToolTipText("Nuevo"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoVinculacion.setToolTipText("Editar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoVinculacion.setToolTipText("Actualizar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoVinculacion.setToolTipText("Eliminar)"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoVinculacion.setToolTipText("Cancelar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoVinculacion.setToolTipText("Guardar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoVinculacion.setToolTipText("Guardar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVinculacion.setToolTipText("Salir"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVinculacion";
		inputMap = this.jButtonNuevoTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVinculacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVinculacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoVinculacion";
		inputMap = this.jButtonActualizarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoVinculacion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoVinculacion";
		inputMap = this.jButtonEliminarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoVinculacion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoVinculacion";
		inputMap = this.jButtonCancelarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoVinculacion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoVinculacion";
		inputMap = this.jButtonCerrarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVinculacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVinculacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVinculacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoVinculacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoVinculacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoVinculacion.setToolTipText("Nuevo TipoVinculacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoVinculacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoVinculacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoVinculacion.setToolTipText("Sin Cerrar Ventana TipoVinculacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoVinculacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoVinculacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoVinculacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVinculacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoVinculacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoVinculacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoVinculacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoVinculacion = new JLabelMe();
		
		this.jLabelAccionesTipoVinculacion.setText("Acciones");		
		this.jLabelAccionesTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoVinculacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoVinculacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoVinculacion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoVinculacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoVinculacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVinculacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVinculacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoVinculacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVinculacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVinculacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoVinculacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoVinculacion = new GridBagLayout();
		
		this.jPanelCamposTipoVinculacion.setLayout(gridaBagLayoutCamposTipoVinculacion);
		this.jPanelCamposOcultosTipoVinculacion.setLayout(gridaBagLayoutCamposOcultosTipoVinculacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 0;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoVinculacion.add(jLabelIdTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 1;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoVinculacion.add(jLabelidTipoVinculacion, this.gridBagConstraintsTipoVinculacion);


	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 0;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoVinculacion.add(jLabelid_empresaTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx = 2;
		this.gridBagConstraintsTipoVinculacion.ipadx = 0;
		this.gridBagConstraintsTipoVinculacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoVinculacion.add(jButtonid_empresaTipoVinculacionBusqueda, this.gridBagConstraintsTipoVinculacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx = 3;
		this.gridBagConstraintsTipoVinculacion.ipadx = 0;
		this.gridBagConstraintsTipoVinculacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoVinculacion.add(jButtonid_empresaTipoVinculacionUpdate, this.gridBagConstraintsTipoVinculacion);
	}

	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 1;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoVinculacion.add(jComboBoxid_empresaTipoVinculacion, this.gridBagConstraintsTipoVinculacion);


	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 0;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoVinculacion.add(jLabelcodigoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx = 2;
		this.gridBagConstraintsTipoVinculacion.ipadx = 0;
		this.gridBagConstraintsTipoVinculacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoVinculacion.add(jButtoncodigoTipoVinculacionBusqueda, this.gridBagConstraintsTipoVinculacion);
	}

	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 1;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoVinculacion.add(jTextFieldcodigoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);


	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 0;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoVinculacion.add(jLabelnombreTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx = 2;
		this.gridBagConstraintsTipoVinculacion.ipadx = 0;
		this.gridBagConstraintsTipoVinculacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoVinculacion.add(jButtonnombreTipoVinculacionBusqueda, this.gridBagConstraintsTipoVinculacion);
	}

	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVinculacion.gridy = 0;
	this.gridBagConstraintsTipoVinculacion.gridx = 1;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoVinculacion.add(jscrollPanenombreTipoVinculacion, this.gridBagConstraintsTipoVinculacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVinculacion.gridy = iYPanelCamposTipoVinculacion;
	this.gridBagConstraintsTipoVinculacion.gridx = iXPanelCamposTipoVinculacion++;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVinculacion.add(this.jPanelidTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(iXPanelCamposTipoVinculacion % 1==0) {
		iXPanelCamposTipoVinculacion=0;
		iYPanelCamposTipoVinculacion++;
	}
	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVinculacion.gridy = iYPanelCamposTipoVinculacion;
	this.gridBagConstraintsTipoVinculacion.gridx = iXPanelCamposTipoVinculacion++;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVinculacion.add(this.jPanelcodigoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(iXPanelCamposTipoVinculacion % 1==0) {
		iXPanelCamposTipoVinculacion=0;
		iYPanelCamposTipoVinculacion++;
	}
	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVinculacion.gridy = iYPanelCamposTipoVinculacion;
	this.gridBagConstraintsTipoVinculacion.gridx = iXPanelCamposTipoVinculacion++;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVinculacion.add(this.jPanelnombreTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(iXPanelCamposTipoVinculacion % 1==0) {
		iXPanelCamposTipoVinculacion=0;
		iYPanelCamposTipoVinculacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVinculacion.gridy = iYPanelCamposOcultosTipoVinculacion;
	this.gridBagConstraintsTipoVinculacion.gridx = iXPanelCamposOcultosTipoVinculacion++;
	this.gridBagConstraintsTipoVinculacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVinculacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoVinculacion.add(this.jPanelid_empresaTipoVinculacion, this.gridBagConstraintsTipoVinculacion);



	if(iXPanelCamposOcultosTipoVinculacion % 1==0) {
		iXPanelCamposOcultosTipoVinculacion=0;
		iYPanelCamposOcultosTipoVinculacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoVinculacion= new GridBagLayout();
		this.jPanelAccionesTipoVinculacion.setLayout(gridaBagLayoutAccionesTipoVinculacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoVinculacion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoVinculacion.setLayout(gridaBagLayoutAccionesFormularioTipoVinculacion);
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVinculacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVinculacion.add(this.jComboBoxTiposAccionesFormularioTipoVinculacion, this.gridBagConstraintsTipoVinculacion);

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVinculacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVinculacion.add(this.jCheckBoxPostAccionNuevoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVinculacion.add(this.jCheckBoxPostAccionSinCerrarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVinculacion.add(this.jCheckBoxPostAccionSinMensajeTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoVinculacion.add(this.jButtonModificarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);							

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoVinculacion.add(this.jButtonEliminarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
			
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = 0;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVinculacion.add(this.jButtonActualizarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);


		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = 0;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVinculacion.add(this.jButtonGuardarCambiosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);	
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = 0;		
		this.gridBagConstraintsTipoVinculacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoVinculacion.add(this.jButtonCancelarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVinculacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVinculacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVinculacion.gridx = 0;		
			//this.gridBagConstraintsTipoVinculacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVinculacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVinculacion.gridx =0;
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVinculacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoVinculacion = new TipoVinculacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Vinculacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Vinculacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Vinculacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoVinculacionModel tipovinculacionModel=new TipoVinculacionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoVinculacionModel.TipoVinculacionFocusTraversalPolicy tipovinculacionFocusTraversalPolicy = tipovinculacionModel.new TipoVinculacionFocusTraversalPolicy(this);
			
			//tipovinculacionFocusTraversalPolicy.settipovinculacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipovinculacionModel);
			
			
			this.jContentPaneDetalleTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoVinculacion = new GridBagLayout();	
			this.jContentPaneDetalleTipoVinculacion.setLayout(gridaBagLayoutDetalleTipoVinculacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVinculacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
				this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoVinculacion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoVinculacion.add(jTtoolBarDetalleTipoVinculacion, gridBagConstraintsTipoVinculacion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoVinculacion=   new JScrollPane(jContentPaneDetalleTipoVinculacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVinculacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVinculacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVinculacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoVinculacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVinculacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVinculacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVinculacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoVinculacion.gridx = 0;
	        
			this.jContentPaneDetalleTipoVinculacion.add(jPanelCamposTipoVinculacion, gridBagConstraintsTipoVinculacion);
			
			
			
			
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
						&& tipovinculacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameInformacionEconomica(this.puedeCargarPorParteInformacionEconomica,false,-1);
					
					if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoVinculacion= new GridBagConstraints();
						this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoVinculacion.gridx = 0;
						this.jContentPaneDetalleTipoVinculacion.add(this.jTabbedPaneRelacionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoVinculacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameInformacionEconomica(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoVinculacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
					this.gridBagConstraintsTipoVinculacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoVinculacion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoVinculacion.add(jPanelCamposOcultosTipoVinculacion, gridBagConstraintsTipoVinculacion);
				
					this.jPanelCamposOcultosTipoVinculacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoVinculacion.gridx = 0;
	        this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoVinculacion.add(this.jPanelAccionesFormularioTipoVinculacion, this.gridBagConstraintsTipoVinculacion);							
			
			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
	        this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoVinculacion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoVinculacion.add(this.jPanelAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoVinculacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoVinculacion=   new JScrollPane(this.jPanelCamposTipoVinculacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVinculacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVinculacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVinculacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoVinculacion.gridx = 0;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoVinculacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVinculacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVinculacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
			
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
			
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoVinculacion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoVinculacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameInformacionEconomica(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		this.informacioneconomicaSessionBean.setConGuardarRelaciones(false);
		this.informacioneconomicaSessionBean.setEsGuardarRelacionado(true);

		this.informacioneconomicaBeanSwingJInternalFrame=null;//new InformacionEconomicaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.informacioneconomicaBeanSwingJInternalFramePopup=new InformacionEconomicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.informacioneconomicaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {

				InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacioneconomicaSessionBean.setEsGuardarRelacionado(true);

				this.informacioneconomicaBeanSwingJInternalFrame=new InformacionEconomicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacioneconomicaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacioneconomicaBeanSwingJInternalFrame.setinformacioneconomicaSessionBean(this.informacioneconomicaSessionBean);

				//this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoVinculacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoVinculacion.gridx = 0;
				//this.jContentPaneDetalleTipoVinculacion.add(this.informacioneconomicaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoVinculacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoVinculacion.add("Informacion Economicas",this.informacioneconomicaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoVinculacion.setComponentAt(iIndexTab,this.informacioneconomicaBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacioneconomicaSessionBean.setEsGuardarRelacionado(false);
				this.informacioneconomicaBeanSwingJInternalFrame=null;//new InformacionEconomicaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionEconomica) {
					this.jTabbedPaneRelacionesTipoVinculacion.add("Informacion Economicas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarInformacionEconomicaBeanSwingJInternalFrame(List<TipoVinculacion> tipovinculacions,TipoVinculacion tipovinculacion,InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacioneconomicaBeanSwingJInternalFrame=new InformacionEconomicaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacioneconomicaBeanSwingJInternalFrame.getInformacionEconomicaLogic().setConnexion(this.tipovinculacionLogic.getConnexion());

					informacioneconomicaBeanSwingJInternalFrame.settipovinculacionsForeignKey(tipovinculacions);
					informacioneconomicaBeanSwingJInternalFrame.settipovinculacionForeignKey(tipovinculacion);
					informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setisBusquedaDesdeForeignKeySesionTipoVinculacion(true);
					informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setlidTipoVinculacionActual(tipovinculacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacioneconomicaBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionEconomica(informacioneconomicaBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacioneconomicaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoVinculacion(true);
					informacioneconomicaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacioneconomicaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoVinculacion");
					informacioneconomicaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoVinculacion");
					informacioneconomicaBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionEconomica(true);
					informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesInformacionEconomica("n",informacioneconomicaBeanSwingJInternalFrame.isGuardarCambiosEnLote, informacioneconomicaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					informacioneconomicaBeanSwingJInternalFrame.setAutoscrolls(true);
					informacioneconomicaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionEconomica("relacionado");
					} else {
						informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionEconomica("no_relacionado");
					}

					informacioneconomicaBeanSwingJInternalFrame.getjButtonRecargarInformacionInformacionEconomica().setVisible(false);

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
