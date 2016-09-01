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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.AutorizarRequisicionesConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class AutorizarRequisicionesDetalleFormJInternalFrame extends AutorizarRequisicionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAutorizarRequisiciones;
	
	protected JMenuBar jmenuBarDetalleAutorizarRequisiciones;
	
	protected JMenu jmenuDetalleAutorizarRequisiciones;
	protected JMenu jmenuDetalleArchivoAutorizarRequisiciones;
	protected JMenu jmenuDetalleAccionesAutorizarRequisiciones;
	protected JMenu jmenuDetalleDatosAutorizarRequisiciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutorizarRequisiciones;	
	protected GridBagConstraints gridBagConstraintsAutorizarRequisiciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AutorizarRequisicionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleAutorizarRequisiciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public AutorizarRequisicionesSessionBean autorizarrequisicionesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public AutorizarRequisicionesLogic autorizarrequisicionesLogic;
	
	public JScrollPane jScrollPanelDatosAutorizarRequisiciones;
	public JScrollPane jScrollPanelDatosEdicionAutorizarRequisiciones;
	public JScrollPane jScrollPanelDatosGeneralAutorizarRequisiciones;
	
	protected JPanel jPanelCamposAutorizarRequisiciones;    
	protected JPanel jPanelCamposOcultosAutorizarRequisiciones;    	
	protected JPanel jPanelAccionesAutorizarRequisiciones;
	protected JPanel jPanelAccionesFormularioAutorizarRequisiciones;
    
	
	
	protected Integer iXPanelCamposAutorizarRequisiciones=0;
	protected Integer iYPanelCamposAutorizarRequisiciones=0;
	
	protected Integer iXPanelCamposOcultosAutorizarRequisiciones=0;
	protected Integer iYPanelCamposOcultosAutorizarRequisiciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAutorizarRequisiciones;
	public JButton jButtonModificarAutorizarRequisiciones;
	public JButton jButtonActualizarAutorizarRequisiciones;
    public JButton jButtonEliminarAutorizarRequisiciones;
	public JButton jButtonCancelarAutorizarRequisiciones;
    public JButton jButtonGuardarCambiosAutorizarRequisiciones;
	public JButton jButtonGuardarCambiosTablaAutorizarRequisiciones;
	protected JButton jButtonCerrarAutorizarRequisiciones;
	
	
	protected JButton jButtonProcesarInformacionAutorizarRequisiciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAutorizarRequisiciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAutorizarRequisiciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAutorizarRequisiciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutorizarRequisiciones;
	protected JButton jButtonModificarToolBarAutorizarRequisiciones;
	protected JButton jButtonActualizarToolBarAutorizarRequisiciones;
    protected JButton jButtonEliminarToolBarAutorizarRequisiciones;
	protected JButton jButtonCancelarToolBarAutorizarRequisiciones;
    protected JButton jButtonGuardarCambiosToolBarAutorizarRequisiciones;
	protected JButton jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones;
	protected JButton jButtonMostrarOcultarTablaToolBarAutorizarRequisiciones;
	protected JButton jButtonCerrarToolBarAutorizarRequisiciones;
	
	protected JButton jButtonProcesarInformacionToolBarAutorizarRequisiciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutorizarRequisiciones;
	protected JMenuItem jMenuItemModificarAutorizarRequisiciones;
	protected JMenuItem jMenuItemActualizarAutorizarRequisiciones;
    protected JMenuItem jMenuItemEliminarAutorizarRequisiciones;
	protected JMenuItem jMenuItemCancelarAutorizarRequisiciones;
    protected JMenuItem jMenuItemGuardarCambiosAutorizarRequisiciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutorizarRequisiciones;
	protected JMenuItem jMenuItemCerrarAutorizarRequisiciones;
	protected JMenuItem jMenuItemDetalleCerrarAutorizarRequisiciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutorizarRequisiciones;
	
	protected JMenuItem jMenuItemProcesarInformacionAutorizarRequisiciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutorizarRequisiciones;
	protected JMenuItem jMenuItemMostrarOcultarAutorizarRequisiciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutorizarRequisiciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutorizarRequisiciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAutorizarRequisiciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAutorizarRequisiciones;
	public JLabel jLabelIdAutorizarRequisiciones;
	public JLabel jLabelidAutorizarRequisiciones;
	public JButton jButtonidAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeAutorizarRequisiciones;
	public JLabel jLabelfecha_desdeAutorizarRequisiciones;
	//public JFormattedTextField jDateChooserfecha_desdeAutorizarRequisiciones;

	public JDateChooser jDateChooserfecha_desdeAutorizarRequisiciones;
	public JButton jButtonfecha_desdeAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaAutorizarRequisiciones;
	public JLabel jLabelfecha_hastaAutorizarRequisiciones;
	//public JFormattedTextField jDateChooserfecha_hastaAutorizarRequisiciones;

	public JDateChooser jDateChooserfecha_hastaAutorizarRequisiciones;
	public JButton jButtonfecha_hastaAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_requisicionAutorizarRequisiciones;
	public JLabel jLabelcodigo_tipo_requisicionAutorizarRequisiciones;
	public JTextField jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones;
	public JButton jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAutorizarRequisiciones;
	public JLabel jLabelcodigoAutorizarRequisiciones;
	public JTextField jTextFieldcodigoAutorizarRequisiciones;
	public JButton jButtoncodigoAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelfechaAutorizarRequisiciones;
	public JLabel jLabelfechaAutorizarRequisiciones;
	//public JFormattedTextField jDateChooserfechaAutorizarRequisiciones;

	public JDateChooser jDateChooserfechaAutorizarRequisiciones;
	public JButton jButtonfechaAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteAutorizarRequisiciones;
	public JLabel jLabelnombre_completo_clienteAutorizarRequisiciones;
	public JTextArea jTextAreanombre_completo_clienteAutorizarRequisiciones;
	public JScrollPane jscrollPanenombre_completo_clienteAutorizarRequisiciones;
	public JButton jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaAutorizarRequisiciones;
	public JLabel jLabelnombre_bodegaAutorizarRequisiciones;
	public JTextArea jTextAreanombre_bodegaAutorizarRequisiciones;
	public JScrollPane jscrollPanenombre_bodegaAutorizarRequisiciones;
	public JButton jButtonnombre_bodegaAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoAutorizarRequisiciones;
	public JLabel jLabelnombre_productoAutorizarRequisiciones;
	public JTextArea jTextAreanombre_productoAutorizarRequisiciones;
	public JScrollPane jscrollPanenombre_productoAutorizarRequisiciones;
	public JButton jButtonnombre_productoAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelcantidadAutorizarRequisiciones;
	public JLabel jLabelcantidadAutorizarRequisiciones;
	public JTextField jTextFieldcantidadAutorizarRequisiciones;
	public JButton jButtoncantidadAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autorizaAutorizarRequisiciones;
	public JLabel jLabelfecha_autorizaAutorizarRequisiciones;
	//public JFormattedTextField jDateChooserfecha_autorizaAutorizarRequisiciones;

	public JDateChooser jDateChooserfecha_autorizaAutorizarRequisiciones;
	public JButton jButtonfecha_autorizaAutorizarRequisicionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAutorizarRequisiciones;
	public JLabel jLabelid_empresaAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAutorizarRequisiciones;
	public JButton jButtonid_empresaAutorizarRequisiciones= new JButtonMe();
	public JButton jButtonid_empresaAutorizarRequisicionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaAutorizarRequisicionesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAutorizarRequisiciones;
	public JLabel jLabelid_sucursalAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAutorizarRequisiciones;
	public JButton jButtonid_sucursalAutorizarRequisiciones= new JButtonMe();
	public JButton jButtonid_sucursalAutorizarRequisicionesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAutorizarRequisicionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAutorizarRequisiciones;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AutorizarRequisicionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAutorizarRequisiciones=new JPanel();
				this.jPanelAccionesFormularioAutorizarRequisiciones=new JPanel();
				this.jmenuBarDetalleAutorizarRequisiciones=new JMenuBar();
				this.jTtoolBarDetalleAutorizarRequisiciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AutorizarRequisicionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAutorizarRequisiciones() {
		return this.jButtonActualizarToolBarAutorizarRequisiciones;
	}
	
	public JButton getjButtonEliminarToolBarAutorizarRequisiciones() {
		return this.jButtonEliminarToolBarAutorizarRequisiciones;
	}
	
	public JButton getjButtonCancelarToolBarAutorizarRequisiciones() {
		return this.jButtonCancelarToolBarAutorizarRequisiciones;
	}		
	
	public JButton getjButtonProcesarInformacionAutorizarRequisiciones() {
		return this.jButtonProcesarInformacionAutorizarRequisiciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutorizarRequisiciones)	{
		this.jButtonProcesarInformacionAutorizarRequisiciones = jButtonProcesarInformacionAutorizarRequisiciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutorizarRequisiciones() {
		return this.jComboBoxTiposAccionesAutorizarRequisiciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutorizarRequisiciones(
			JComboBox jComboBoxTiposRelacionesAutorizarRequisiciones) {
		this.jComboBoxTiposRelacionesAutorizarRequisiciones = jComboBoxTiposRelacionesAutorizarRequisiciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutorizarRequisiciones(
			JComboBox jComboBoxTiposAccionesAutorizarRequisiciones) {
		this.jComboBoxTiposAccionesAutorizarRequisiciones = jComboBoxTiposAccionesAutorizarRequisiciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAutorizarRequisiciones() {
		return this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAutorizarRequisiciones(
			JComboBox jComboBoxTiposAccionesFormularioAutorizarRequisiciones) {
		this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones = jComboBoxTiposAccionesFormularioAutorizarRequisiciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
		
		this.autorizarrequisicionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autorizarrequisicionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutorizarRequisicionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutorizarRequisicionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutorizarRequisicionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autorizar Requisiciones MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
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
	
		AutorizarRequisicionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutorizarRequisiciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAutorizarRequisiciones=new JButtonMe();
				this.jButtonModificarToolBarAutorizarRequisiciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAutorizarRequisiciones,this.jTtoolBarDetalleAutorizarRequisiciones,
							"actualizar","actualizar","Actualizar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAutorizarRequisiciones,this.jTtoolBarDetalleAutorizarRequisiciones,
							"eliminar","eliminar","Eliminar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAutorizarRequisiciones,this.jTtoolBarDetalleAutorizarRequisiciones,
							"cancelar","cancelar","Cancelar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAutorizarRequisiciones,this.jTtoolBarDetalleAutorizarRequisiciones,
							"guardarcambios","guardarcambios","Guardar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAutorizarRequisiciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAutorizarRequisiciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAutorizarRequisiciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAutorizarRequisiciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAutorizarRequisiciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutorizarRequisiciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutorizarRequisiciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutorizarRequisiciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAutorizarRequisiciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAutorizarRequisiciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAutorizarRequisiciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAutorizarRequisiciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAutorizarRequisiciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAutorizarRequisiciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAutorizarRequisiciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAutorizarRequisiciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAutorizarRequisiciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAutorizarRequisiciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAutorizarRequisiciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAutorizarRequisiciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAutorizarRequisiciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutorizarRequisiciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutorizarRequisiciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutorizarRequisiciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutorizarRequisiciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutorizarRequisiciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAutorizarRequisiciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAutorizarRequisiciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAutorizarRequisiciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutorizarRequisiciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutorizarRequisiciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutorizarRequisiciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAutorizarRequisiciones.add(this.jMenuItemDetalleCerrarAutorizarRequisiciones);
		
		this.jmenuDetalleAccionesAutorizarRequisiciones.add(this.jMenuItemActualizarAutorizarRequisiciones);
		this.jmenuDetalleAccionesAutorizarRequisiciones.add(this.jMenuItemEliminarAutorizarRequisiciones);
		this.jmenuDetalleAccionesAutorizarRequisiciones.add(this.jMenuItemCancelarAutorizarRequisiciones);		
		
		//this.jmenuDetalleDatosAutorizarRequisiciones.add(this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones);				
		this.jmenuDetalleDatosAutorizarRequisiciones.add(this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones);				
				
		//this.jmenuDetalleAccionesAutorizarRequisiciones.add(this.jMenuItemGuardarCambiosAutorizarRequisiciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAutorizarRequisiciones.add(this.jmenuDetalleArchivoAutorizarRequisiciones);		
		this.jmenuBarDetalleAutorizarRequisiciones.add(this.jmenuDetalleAccionesAutorizarRequisiciones);		
		this.jmenuBarDetalleAutorizarRequisiciones.add(this.jmenuDetalleDatosAutorizarRequisiciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAutorizarRequisiciones);				
	}
	
	
	public void inicializarElementosCamposAutorizarRequisiciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAutorizarRequisiciones = new JLabelMe();
		jLabelIdAutorizarRequisiciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAutorizarRequisiciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAutorizarRequisiciones= new GridBagLayout();

		this.jPanelidAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);

		jLabelidAutorizarRequisiciones = new JLabel();
		jLabelidAutorizarRequisiciones.setText("Id");

		jLabelidAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeAutorizarRequisiciones = new JLabelMe();
		this.jLabelfecha_desdeAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeAutorizarRequisiciones.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelfecha_desdeAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		//jFormattedTextFieldfecha_desdeAutorizarRequisiciones= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeAutorizarRequisiciones= new JDateChooser();
		jDateChooserfecha_desdeAutorizarRequisiciones.setEnabled(false);
		jDateChooserfecha_desdeAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeAutorizarRequisiciones.setDate(new Date());
		jDateChooserfecha_desdeAutorizarRequisiciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeAutorizarRequisiciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaAutorizarRequisiciones = new JLabelMe();
		this.jLabelfecha_hastaAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaAutorizarRequisiciones.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelfecha_hastaAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		//jFormattedTextFieldfecha_hastaAutorizarRequisiciones= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaAutorizarRequisiciones= new JDateChooser();
		jDateChooserfecha_hastaAutorizarRequisiciones.setEnabled(false);
		jDateChooserfecha_hastaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaAutorizarRequisiciones.setDate(new Date());
		jDateChooserfecha_hastaAutorizarRequisiciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaAutorizarRequisiciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_requisicionAutorizarRequisiciones = new JLabelMe();
		this.jLabelcodigo_tipo_requisicionAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION+" : *");
		this.jLabelcodigo_tipo_requisicionAutorizarRequisiciones.setToolTipText("Codigo Tipo Requisicion");
		this.jLabelcodigo_tipo_requisicionAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_requisicionAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_requisicionAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_requisicionAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones= new JTextFieldMe();

		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setEnabled(false);
		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setText("U");
		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_requisicionAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoAutorizarRequisiciones = new JLabelMe();
		this.jLabelcodigoAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoAutorizarRequisiciones.setToolTipText("Codigo");
		this.jLabelcodigoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelcodigoAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jTextFieldcodigoAutorizarRequisiciones= new JTextFieldMe();

		jTextFieldcodigoAutorizarRequisiciones.setEnabled(false);
		jTextFieldcodigoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtoncodigoAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAutorizarRequisicionesBusqueda.setText("U");
		this.jButtoncodigoAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelfechaAutorizarRequisiciones = new JLabelMe();
		this.jLabelfechaAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAutorizarRequisiciones.setToolTipText("Fecha");
		this.jLabelfechaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelfechaAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		//jFormattedTextFieldfechaAutorizarRequisiciones= new JFormattedTextFieldMe();

		jDateChooserfechaAutorizarRequisiciones= new JDateChooser();
		jDateChooserfechaAutorizarRequisiciones.setEnabled(false);
		jDateChooserfechaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAutorizarRequisiciones.setDate(new Date());
		jDateChooserfechaAutorizarRequisiciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAutorizarRequisiciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonfechaAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonfechaAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteAutorizarRequisiciones = new JLabelMe();
		this.jLabelnombre_completo_clienteAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteAutorizarRequisiciones.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelnombre_completo_clienteAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jTextAreanombre_completo_clienteAutorizarRequisiciones= new JTextAreaMe();
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setEnabled(false);
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setLineWrap(true);
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteAutorizarRequisiciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteAutorizarRequisiciones = new JScrollPane(jTextAreanombre_completo_clienteAutorizarRequisiciones);
		jscrollPanenombre_completo_clienteAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaAutorizarRequisiciones = new JLabelMe();
		this.jLabelnombre_bodegaAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaAutorizarRequisiciones.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelnombre_bodegaAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jTextAreanombre_bodegaAutorizarRequisiciones= new JTextAreaMe();
		jTextAreanombre_bodegaAutorizarRequisiciones.setEnabled(false);
		jTextAreanombre_bodegaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaAutorizarRequisiciones.setLineWrap(true);
		jTextAreanombre_bodegaAutorizarRequisiciones.setWrapStyleWord(true);
		jTextAreanombre_bodegaAutorizarRequisiciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaAutorizarRequisiciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaAutorizarRequisiciones = new JScrollPane(jTextAreanombre_bodegaAutorizarRequisiciones);
		jscrollPanenombre_bodegaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoAutorizarRequisiciones = new JLabelMe();
		this.jLabelnombre_productoAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoAutorizarRequisiciones.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelnombre_productoAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jTextAreanombre_productoAutorizarRequisiciones= new JTextAreaMe();
		jTextAreanombre_productoAutorizarRequisiciones.setEnabled(false);
		jTextAreanombre_productoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoAutorizarRequisiciones.setLineWrap(true);
		jTextAreanombre_productoAutorizarRequisiciones.setWrapStyleWord(true);
		jTextAreanombre_productoAutorizarRequisiciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoAutorizarRequisiciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoAutorizarRequisiciones = new JScrollPane(jTextAreanombre_productoAutorizarRequisiciones);
		jscrollPanenombre_productoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelcantidadAutorizarRequisiciones = new JLabelMe();
		this.jLabelcantidadAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadAutorizarRequisiciones.setToolTipText("Cantidad");
		this.jLabelcantidadAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelcantidadAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jTextFieldcantidadAutorizarRequisiciones= new JTextFieldMe();
		jTextFieldcantidadAutorizarRequisiciones.setEnabled(false);
		jTextFieldcantidadAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadAutorizarRequisiciones.setText("0");

		this.jButtoncantidadAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtoncantidadAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadAutorizarRequisicionesBusqueda.setText("U");
		this.jButtoncantidadAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadAutorizarRequisicionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autorizaAutorizarRequisiciones = new JLabelMe();
		this.jLabelfecha_autorizaAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA+" : *");
		this.jLabelfecha_autorizaAutorizarRequisiciones.setToolTipText("Fecha Autoriza");
		this.jLabelfecha_autorizaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_autorizaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_autorizaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autorizaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autorizaAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autorizaAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelfecha_autorizaAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		//jFormattedTextFieldfecha_autorizaAutorizarRequisiciones= new JFormattedTextFieldMe();

		jDateChooserfecha_autorizaAutorizarRequisiciones= new JDateChooser();
		jDateChooserfecha_autorizaAutorizarRequisiciones.setEnabled(false);
		jDateChooserfecha_autorizaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autorizaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autorizaAutorizarRequisiciones.setDate(new Date());
		jDateChooserfecha_autorizaAutorizarRequisiciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autorizaAutorizarRequisiciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autorizaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autorizaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autorizaAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAutorizarRequisiciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAutorizarRequisiciones = new JLabelMe();
		this.jLabelid_empresaAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAutorizarRequisiciones.setToolTipText("Empresa");
		this.jLabelid_empresaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelid_empresaAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jComboBoxid_empresaAutorizarRequisiciones= new JComboBoxMe();
		jComboBoxid_empresaAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAutorizarRequisiciones.setEnabled(false);

		this.jButtonid_empresaAutorizarRequisiciones= new JButtonMe();
		this.jButtonid_empresaAutorizarRequisiciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutorizarRequisiciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutorizarRequisiciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutorizarRequisiciones.setText("Buscar");
		this.jButtonid_empresaAutorizarRequisiciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAutorizarRequisiciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutorizarRequisiciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutorizarRequisiciones"));

		this.jButtonid_empresaAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonid_empresaAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonid_empresaAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAutorizarRequisicionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaAutorizarRequisicionesUpdate= new JButtonMe();
		this.jButtonid_empresaAutorizarRequisicionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutorizarRequisicionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutorizarRequisicionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutorizarRequisicionesUpdate.setText("U");
		this.jButtonid_empresaAutorizarRequisicionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAutorizarRequisicionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutorizarRequisicionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutorizarRequisicionesUpdate"));



					
		this.jLabelid_sucursalAutorizarRequisiciones = new JLabelMe();
		this.jLabelid_sucursalAutorizarRequisiciones.setText(""+AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAutorizarRequisiciones.setToolTipText("Sucursal");
		this.jLabelid_sucursalAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAutorizarRequisiciones.setToolTipText(AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		this.jPanelid_sucursalAutorizarRequisiciones.setLayout(this.gridaBagLayoutAutorizarRequisiciones);


		jComboBoxid_sucursalAutorizarRequisiciones= new JComboBoxMe();
		jComboBoxid_sucursalAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAutorizarRequisiciones.setEnabled(false);

		this.jButtonid_sucursalAutorizarRequisiciones= new JButtonMe();
		this.jButtonid_sucursalAutorizarRequisiciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutorizarRequisiciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutorizarRequisiciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutorizarRequisiciones.setText("Buscar");
		this.jButtonid_sucursalAutorizarRequisiciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAutorizarRequisiciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutorizarRequisiciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutorizarRequisiciones"));

		this.jButtonid_sucursalAutorizarRequisicionesBusqueda= new JButtonMe();
		this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setText("U");
		this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutorizarRequisicionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutorizarRequisicionesBusqueda"));

		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAutorizarRequisicionesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAutorizarRequisicionesUpdate= new JButtonMe();
		this.jButtonid_sucursalAutorizarRequisicionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutorizarRequisicionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutorizarRequisicionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutorizarRequisicionesUpdate.setText("U");
		this.jButtonid_sucursalAutorizarRequisicionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAutorizarRequisicionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutorizarRequisicionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutorizarRequisicionesUpdate"));



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
		//this.jInternalFrameDetalleAutorizarRequisiciones = new AutorizarRequisicionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Autorizar Requisiciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutorizarRequisiciones= new GridBagLayout();
		

		
		String sToolTipAutorizarRequisiciones="";
		sToolTipAutorizarRequisiciones=AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutorizarRequisiciones+="(Inventario.AutorizarRequisiciones)";
		}
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutorizarRequisiciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAutorizarRequisiciones = new JButtonMe();
		this.jButtonModificarAutorizarRequisiciones = new JButtonMe();
        this.jButtonActualizarAutorizarRequisiciones = new JButtonMe();
        this.jButtonEliminarAutorizarRequisiciones = new JButtonMe();
        this.jButtonCancelarAutorizarRequisiciones = new JButtonMe();
        this.jButtonGuardarCambiosAutorizarRequisiciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones = new JButtonMe();
		this.jButtonCerrarAutorizarRequisiciones = new JButtonMe();
		
		this.jScrollPanelDatosAutorizarRequisiciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionAutorizarRequisiciones = new JScrollPane();
		this.jScrollPanelDatosGeneralAutorizarRequisiciones = new JScrollPane();
				
		
		
		this.jPanelCamposAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Autorizar Requisiciones";
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizar Requisicioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosAutorizarRequisiciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAutorizarRequisiciones.setName("jPanelCamposAutorizarRequisiciones"); 

		this.jPanelCamposOcultosAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAutorizarRequisiciones.setName("jPanelCamposOcultosAutorizarRequisiciones"); 

        this.jPanelAccionesAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutorizarRequisiciones.setToolTipText("Acciones");
        this.jPanelAccionesAutorizarRequisiciones.setName("Acciones"); 

		this.jPanelAccionesFormularioAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAutorizarRequisiciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAutorizarRequisiciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAutorizarRequisiciones.setText("Nuevo");
		this.jButtonModificarAutorizarRequisiciones.setText("Editar");
        this.jButtonActualizarAutorizarRequisiciones.setText("Actualizar");
        this.jButtonEliminarAutorizarRequisiciones.setText("Eliminar");
        this.jButtonCancelarAutorizarRequisiciones.setText("Cancelar");
        this.jButtonGuardarCambiosAutorizarRequisiciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.setText("Guardar");
		this.jButtonCerrarAutorizarRequisiciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutorizarRequisiciones,"nuevo_button","Nuevo",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAutorizarRequisiciones,"modificar_button","Editar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAutorizarRequisiciones,"actualizar_button","Actualizar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAutorizarRequisiciones,"eliminar_button","Eliminar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAutorizarRequisiciones,"cancelar_button","Cancelar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAutorizarRequisiciones,"guardarcambios_button","Guardar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutorizarRequisiciones,"guardarcambiostabla_button","Guardar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutorizarRequisiciones,"cerrar_button","Salir",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAutorizarRequisiciones.setToolTipText("Nuevo"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAutorizarRequisiciones.setToolTipText("Editar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAutorizarRequisiciones.setToolTipText("Actualizar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAutorizarRequisiciones.setToolTipText("Eliminar)"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAutorizarRequisiciones.setToolTipText("Cancelar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAutorizarRequisiciones.setToolTipText("Guardar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.setToolTipText("Guardar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutorizarRequisiciones.setToolTipText("Salir"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutorizarRequisiciones";
		inputMap = this.jButtonNuevoAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutorizarRequisiciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutorizarRequisiciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAutorizarRequisiciones";
		inputMap = this.jButtonActualizarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAutorizarRequisiciones"));
		
		//ELIMINAR
		sMapKey = "EliminarAutorizarRequisiciones";
		inputMap = this.jButtonEliminarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAutorizarRequisiciones"));
		
		//CANCELAR	
		sMapKey = "CancelarAutorizarRequisiciones";
		inputMap = this.jButtonCancelarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAutorizarRequisiciones"));
		
		//CERRAR		
		sMapKey = "CerrarAutorizarRequisiciones";
		inputMap = this.jButtonCerrarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutorizarRequisiciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutorizarRequisiciones";
		inputMap = this.jButtonGuardarCambiosTablaAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutorizarRequisiciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAutorizarRequisiciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAutorizarRequisiciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAutorizarRequisiciones.setToolTipText("Nuevo AutorizarRequisiciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAutorizarRequisiciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAutorizarRequisiciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAutorizarRequisiciones.setToolTipText("Sin Cerrar Ventana AutorizarRequisiciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAutorizarRequisiciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAutorizarRequisiciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAutorizarRequisiciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutorizarRequisiciones.setText("Accion");
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAutorizarRequisiciones = new JLabelMe();
		
		this.jLabelAccionesAutorizarRequisiciones.setText("Acciones");		
		this.jLabelAccionesAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAutorizarRequisiciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAutorizarRequisiciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAutorizarRequisiciones=new JTabbedPane();
		this.jTabbedPaneRelacionesAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAutorizarRequisiciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAutorizarRequisiciones = new GridBagLayout();
		
		this.jPanelCamposAutorizarRequisiciones.setLayout(gridaBagLayoutCamposAutorizarRequisiciones);
		this.jPanelCamposOcultosAutorizarRequisiciones.setLayout(gridaBagLayoutCamposOcultosAutorizarRequisiciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAutorizarRequisiciones.add(jLabelIdAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAutorizarRequisiciones.add(jLabelidAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAutorizarRequisiciones.add(jLabelid_empresaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutorizarRequisiciones.add(jButtonid_empresaAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 3;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutorizarRequisiciones.add(jButtonid_empresaAutorizarRequisicionesUpdate, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAutorizarRequisiciones.add(jComboBoxid_empresaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAutorizarRequisiciones.add(jLabelid_sucursalAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutorizarRequisiciones.add(jButtonid_sucursalAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 3;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutorizarRequisiciones.add(jButtonid_sucursalAutorizarRequisicionesUpdate, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAutorizarRequisiciones.add(jComboBoxid_sucursalAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeAutorizarRequisiciones.add(jLabelfecha_desdeAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeAutorizarRequisiciones.add(jButtonfecha_desdeAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeAutorizarRequisiciones.add(jDateChooserfecha_desdeAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaAutorizarRequisiciones.add(jLabelfecha_hastaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaAutorizarRequisiciones.add(jButtonfecha_hastaAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaAutorizarRequisiciones.add(jDateChooserfecha_hastaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones.add(jLabelcodigo_tipo_requisicionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones.add(jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones.add(jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoAutorizarRequisiciones.add(jLabelcodigoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAutorizarRequisiciones.add(jButtoncodigoAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoAutorizarRequisiciones.add(jTextFieldcodigoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAutorizarRequisiciones.add(jLabelfechaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAutorizarRequisiciones.add(jButtonfechaAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAutorizarRequisiciones.add(jDateChooserfechaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteAutorizarRequisiciones.add(jLabelnombre_completo_clienteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteAutorizarRequisiciones.add(jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteAutorizarRequisiciones.add(jscrollPanenombre_completo_clienteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaAutorizarRequisiciones.add(jLabelnombre_bodegaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaAutorizarRequisiciones.add(jButtonnombre_bodegaAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaAutorizarRequisiciones.add(jscrollPanenombre_bodegaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoAutorizarRequisiciones.add(jLabelnombre_productoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoAutorizarRequisiciones.add(jButtonnombre_productoAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoAutorizarRequisiciones.add(jscrollPanenombre_productoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadAutorizarRequisiciones.add(jLabelcantidadAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadAutorizarRequisiciones.add(jButtoncantidadAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadAutorizarRequisiciones.add(jTextFieldcantidadAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_autorizaAutorizarRequisiciones.add(jLabelfecha_autorizaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 2;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
		this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autorizaAutorizarRequisiciones.add(jButtonfecha_autorizaAutorizarRequisicionesBusqueda, this.gridBagConstraintsAutorizarRequisiciones);
	}

	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = 1;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_autorizaAutorizarRequisiciones.add(jDateChooserfecha_autorizaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelidAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelfecha_desdeAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelfecha_hastaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelcodigo_tipo_requisicionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelcodigoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelfechaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelnombre_completo_clienteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelnombre_bodegaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelnombre_productoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelcantidadAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutorizarRequisiciones.add(this.jPanelfecha_autorizaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposAutorizarRequisiciones % 2==0) {
		iXPanelCamposAutorizarRequisiciones=0;
		iYPanelCamposAutorizarRequisiciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposOcultosAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposOcultosAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutorizarRequisiciones.add(this.jPanelid_empresaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposOcultosAutorizarRequisiciones % 2==0) {
		iXPanelCamposOcultosAutorizarRequisiciones=0;
		iYPanelCamposOcultosAutorizarRequisiciones++;
	}
	this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutorizarRequisiciones.gridy = iYPanelCamposOcultosAutorizarRequisiciones;
	this.gridBagConstraintsAutorizarRequisiciones.gridx = iXPanelCamposOcultosAutorizarRequisiciones++;
	this.gridBagConstraintsAutorizarRequisiciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutorizarRequisiciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutorizarRequisiciones.add(this.jPanelid_sucursalAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);



	if(iXPanelCamposOcultosAutorizarRequisiciones % 2==0) {
		iXPanelCamposOcultosAutorizarRequisiciones=0;
		iYPanelCamposOcultosAutorizarRequisiciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesAutorizarRequisiciones= new GridBagLayout();
		this.jPanelAccionesAutorizarRequisiciones.setLayout(gridaBagLayoutAccionesAutorizarRequisiciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAutorizarRequisiciones= new GridBagLayout();
		this.jPanelAccionesFormularioAutorizarRequisiciones.setLayout(gridaBagLayoutAccionesFormularioAutorizarRequisiciones);
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutorizarRequisiciones.add(this.jComboBoxTiposAccionesFormularioAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesAutorizarRequisiciones.add(this.jButtonModificarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);							

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesAutorizarRequisiciones.add(this.jButtonEliminarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
			
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutorizarRequisiciones.add(this.jButtonActualizarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);


		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutorizarRequisiciones.add(this.jButtonGuardarCambiosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);	
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesAutorizarRequisiciones.add(this.jButtonCancelarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutorizarRequisiciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();						
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;		
			//this.gridBagConstraintsAutorizarRequisiciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutorizarRequisiciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutorizarRequisiciones.gridx =0;
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutorizarRequisiciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAutorizarRequisiciones = new AutorizarRequisicionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Autorizar Requisiciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Autorizar Requisiciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autorizar Requisiciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AutorizarRequisicionesModel autorizarrequisicionesModel=new AutorizarRequisicionesModel(this);
			
			//SI USARA CLASE INTERNA
			//AutorizarRequisicionesModel.AutorizarRequisicionesFocusTraversalPolicy autorizarrequisicionesFocusTraversalPolicy = autorizarrequisicionesModel.new AutorizarRequisicionesFocusTraversalPolicy(this);
			
			//autorizarrequisicionesFocusTraversalPolicy.setautorizarrequisicionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(autorizarrequisicionesModel);
			
			
			this.jContentPaneDetalleAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAutorizarRequisiciones = new GridBagLayout();	
			this.jContentPaneDetalleAutorizarRequisiciones.setLayout(gridaBagLayoutDetalleAutorizarRequisiciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutorizarRequisiciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
				this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
					
				
				this.jContentPaneDetalleAutorizarRequisiciones.add(jTtoolBarDetalleAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);								
				
}
			
			this.jScrollPanelDatosEdicionAutorizarRequisiciones=   new JScrollPane(jContentPaneDetalleAutorizarRequisiciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAutorizarRequisiciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	        
			this.jContentPaneDetalleAutorizarRequisiciones.add(jPanelCamposAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);
			
			
			
			
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
						//&& autorizarrequisicionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAutorizarRequisiciones= new GridBagConstraints();
						this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
						this.jContentPaneDetalleAutorizarRequisiciones.add(this.jTabbedPaneRelacionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAutorizarRequisiciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAutorizarRequisiciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
					this.gridBagConstraintsAutorizarRequisiciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
					
				
					this.jContentPaneDetalleAutorizarRequisiciones.add(jPanelCamposOcultosAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);
				
					this.jPanelCamposOcultosAutorizarRequisiciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	        this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAutorizarRequisiciones.add(this.jPanelAccionesFormularioAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);							
			
			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
	        this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
	        
			
			this.jContentPaneDetalleAutorizarRequisiciones.add(this.jPanelAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAutorizarRequisiciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAutorizarRequisiciones=   new JScrollPane(this.jPanelCamposAutorizarRequisiciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAutorizarRequisiciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			
			
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
			
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAutorizarRequisiciones;//jContentPane;
		
		return jScrollPanelDatosEdicionAutorizarRequisiciones;
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
