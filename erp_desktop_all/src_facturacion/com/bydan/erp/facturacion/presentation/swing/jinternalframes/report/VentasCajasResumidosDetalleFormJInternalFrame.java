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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasCajasResumidosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasCajasResumidosDetalleFormJInternalFrame extends VentasCajasResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasCajasResumidos;
	
	protected JMenuBar jmenuBarDetalleVentasCajasResumidos;
	
	protected JMenu jmenuDetalleVentasCajasResumidos;
	protected JMenu jmenuDetalleArchivoVentasCajasResumidos;
	protected JMenu jmenuDetalleAccionesVentasCajasResumidos;
	protected JMenu jmenuDetalleDatosVentasCajasResumidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasCajasResumidos;	
	protected GridBagConstraints gridBagConstraintsVentasCajasResumidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasCajasResumidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasCajasResumidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public VentasCajasResumidosSessionBean ventascajasresumidosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public VentasCajasResumidosLogic ventascajasresumidosLogic;
	
	public JScrollPane jScrollPanelDatosVentasCajasResumidos;
	public JScrollPane jScrollPanelDatosEdicionVentasCajasResumidos;
	public JScrollPane jScrollPanelDatosGeneralVentasCajasResumidos;
	
	protected JPanel jPanelCamposVentasCajasResumidos;    
	protected JPanel jPanelCamposOcultosVentasCajasResumidos;    	
	protected JPanel jPanelAccionesVentasCajasResumidos;
	protected JPanel jPanelAccionesFormularioVentasCajasResumidos;
    
	
	
	protected Integer iXPanelCamposVentasCajasResumidos=0;
	protected Integer iYPanelCamposVentasCajasResumidos=0;
	
	protected Integer iXPanelCamposOcultosVentasCajasResumidos=0;
	protected Integer iYPanelCamposOcultosVentasCajasResumidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasCajasResumidos;
	public JButton jButtonModificarVentasCajasResumidos;
	public JButton jButtonActualizarVentasCajasResumidos;
    public JButton jButtonEliminarVentasCajasResumidos;
	public JButton jButtonCancelarVentasCajasResumidos;
    public JButton jButtonGuardarCambiosVentasCajasResumidos;
	public JButton jButtonGuardarCambiosTablaVentasCajasResumidos;
	protected JButton jButtonCerrarVentasCajasResumidos;
	
	
	protected JButton jButtonProcesarInformacionVentasCajasResumidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasCajasResumidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasCajasResumidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasCajasResumidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasCajasResumidos;
	protected JButton jButtonModificarToolBarVentasCajasResumidos;
	protected JButton jButtonActualizarToolBarVentasCajasResumidos;
    protected JButton jButtonEliminarToolBarVentasCajasResumidos;
	protected JButton jButtonCancelarToolBarVentasCajasResumidos;
    protected JButton jButtonGuardarCambiosToolBarVentasCajasResumidos;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasCajasResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasCajasResumidos;
	protected JButton jButtonCerrarToolBarVentasCajasResumidos;
	
	protected JButton jButtonProcesarInformacionToolBarVentasCajasResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasCajasResumidos;
	protected JMenuItem jMenuItemModificarVentasCajasResumidos;
	protected JMenuItem jMenuItemActualizarVentasCajasResumidos;
    protected JMenuItem jMenuItemEliminarVentasCajasResumidos;
	protected JMenuItem jMenuItemCancelarVentasCajasResumidos;
    protected JMenuItem jMenuItemGuardarCambiosVentasCajasResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasCajasResumidos;
	protected JMenuItem jMenuItemCerrarVentasCajasResumidos;
	protected JMenuItem jMenuItemDetalleCerrarVentasCajasResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasCajasResumidos;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasCajasResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasCajasResumidos;
	protected JMenuItem jMenuItemMostrarOcultarVentasCajasResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasCajasResumidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasCajasResumidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasCajasResumidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasCajasResumidos;
	public JLabel jLabelIdVentasCajasResumidos;
	public JLabel jLabelidVentasCajasResumidos;
	public JButton jButtonidVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasCajasResumidos;
	public JLabel jLabelfecha_emision_desdeVentasCajasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasCajasResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeVentasCajasResumidos;
	public JButton jButtonfecha_emision_desdeVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasCajasResumidos;
	public JLabel jLabelfecha_emision_hastaVentasCajasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasCajasResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaVentasCajasResumidos;
	public JButton jButtonfecha_emision_hastaVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoVentasCajasResumidos;
	public JLabel jLabelcodigoVentasCajasResumidos;
	public JTextField jTextFieldcodigoVentasCajasResumidos;
	public JButton jButtoncodigoVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoVentasCajasResumidos;
	public JLabel jLabelnombre_completoVentasCajasResumidos;
	public JTextArea jTextAreanombre_completoVentasCajasResumidos;
	public JScrollPane jscrollPanenombre_completoVentasCajasResumidos;
	public JButton jButtonnombre_completoVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionVentasCajasResumidos;
	public JLabel jLabelfecha_emisionVentasCajasResumidos;
	//public JFormattedTextField jDateChooserfecha_emisionVentasCajasResumidos;

	public JDateChooser jDateChooserfecha_emisionVentasCajasResumidos;
	public JButton jButtonfecha_emisionVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoVentasCajasResumidos;
	public JLabel jLabelnumero_pre_impresoVentasCajasResumidos;
	public JTextField jTextFieldnumero_pre_impresoVentasCajasResumidos;
	public JButton jButtonnumero_pre_impresoVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoVentasCajasResumidos;
	public JLabel jLabelnumero_documentoVentasCajasResumidos;
	public JTextField jTextFieldnumero_documentoVentasCajasResumidos;
	public JButton jButtonnumero_documentoVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltotalVentasCajasResumidos;
	public JLabel jLabeltotalVentasCajasResumidos;
	public JTextField jTextFieldtotalVentasCajasResumidos;
	public JButton jButtontotalVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelefectivoVentasCajasResumidos;
	public JLabel jLabelefectivoVentasCajasResumidos;
	public JTextField jTextFieldefectivoVentasCajasResumidos;
	public JButton jButtonefectivoVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPaneltarjetaVentasCajasResumidos;
	public JLabel jLabeltarjetaVentasCajasResumidos;
	public JTextField jTextFieldtarjetaVentasCajasResumidos;
	public JButton jButtontarjetaVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelcreditoVentasCajasResumidos;
	public JLabel jLabelcreditoVentasCajasResumidos;
	public JTextField jTextFieldcreditoVentasCajasResumidos;
	public JButton jButtoncreditoVentasCajasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasCajasResumidos;
	public JLabel jLabelid_empresaVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasCajasResumidos;
	public JButton jButtonid_empresaVentasCajasResumidos= new JButtonMe();
	public JButton jButtonid_empresaVentasCajasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasCajasResumidosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVentasCajasResumidos;
	public JLabel jLabelid_sucursalVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVentasCajasResumidos;
	public JButton jButtonid_sucursalVentasCajasResumidos= new JButtonMe();
	public JButton jButtonid_sucursalVentasCajasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVentasCajasResumidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasCajasResumidos;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasCajasResumidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasCajasResumidos=new JPanel();
				this.jPanelAccionesFormularioVentasCajasResumidos=new JPanel();
				this.jmenuBarDetalleVentasCajasResumidos=new JMenuBar();
				this.jTtoolBarDetalleVentasCajasResumidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasCajasResumidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasCajasResumidos() {
		return this.jButtonActualizarToolBarVentasCajasResumidos;
	}
	
	public JButton getjButtonEliminarToolBarVentasCajasResumidos() {
		return this.jButtonEliminarToolBarVentasCajasResumidos;
	}
	
	public JButton getjButtonCancelarToolBarVentasCajasResumidos() {
		return this.jButtonCancelarToolBarVentasCajasResumidos;
	}		
	
	public JButton getjButtonProcesarInformacionVentasCajasResumidos() {
		return this.jButtonProcesarInformacionVentasCajasResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasCajasResumidos)	{
		this.jButtonProcesarInformacionVentasCajasResumidos = jButtonProcesarInformacionVentasCajasResumidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasCajasResumidos() {
		return this.jComboBoxTiposAccionesVentasCajasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasCajasResumidos(
			JComboBox jComboBoxTiposRelacionesVentasCajasResumidos) {
		this.jComboBoxTiposRelacionesVentasCajasResumidos = jComboBoxTiposRelacionesVentasCajasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasCajasResumidos(
			JComboBox jComboBoxTiposAccionesVentasCajasResumidos) {
		this.jComboBoxTiposAccionesVentasCajasResumidos = jComboBoxTiposAccionesVentasCajasResumidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasCajasResumidos() {
		return this.jComboBoxTiposAccionesFormularioVentasCajasResumidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasCajasResumidos(
			JComboBox jComboBoxTiposAccionesFormularioVentasCajasResumidos) {
		this.jComboBoxTiposAccionesFormularioVentasCajasResumidos = jComboBoxTiposAccionesFormularioVentasCajasResumidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
		
		this.ventascajasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventascajasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventascajasresumidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasCajasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasCajasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasCajasResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Cajas Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasCajasResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasCajasResumidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasCajasResumidos=new JButtonMe();
				this.jButtonModificarToolBarVentasCajasResumidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasCajasResumidos,this.jTtoolBarDetalleVentasCajasResumidos,
							"actualizar","actualizar","Actualizar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasCajasResumidos,this.jTtoolBarDetalleVentasCajasResumidos,
							"eliminar","eliminar","Eliminar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasCajasResumidos,this.jTtoolBarDetalleVentasCajasResumidos,
							"cancelar","cancelar","Cancelar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasCajasResumidos,this.jTtoolBarDetalleVentasCajasResumidos,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasCajasResumidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasCajasResumidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasCajasResumidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasCajasResumidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasCajasResumidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasCajasResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasCajasResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasCajasResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasCajasResumidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasCajasResumidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasCajasResumidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasCajasResumidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasCajasResumidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasCajasResumidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasCajasResumidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasCajasResumidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasCajasResumidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasCajasResumidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasCajasResumidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasCajasResumidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasCajasResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasCajasResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasCajasResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasCajasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasCajasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasCajasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasCajasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasCajasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasCajasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasCajasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasCajasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasCajasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasCajasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasCajasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasCajasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasCajasResumidos.add(this.jMenuItemDetalleCerrarVentasCajasResumidos);
		
		this.jmenuDetalleAccionesVentasCajasResumidos.add(this.jMenuItemActualizarVentasCajasResumidos);
		this.jmenuDetalleAccionesVentasCajasResumidos.add(this.jMenuItemEliminarVentasCajasResumidos);
		this.jmenuDetalleAccionesVentasCajasResumidos.add(this.jMenuItemCancelarVentasCajasResumidos);		
		
		//this.jmenuDetalleDatosVentasCajasResumidos.add(this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos);				
		this.jmenuDetalleDatosVentasCajasResumidos.add(this.jMenuItemDetalleMostarOcultarVentasCajasResumidos);				
				
		//this.jmenuDetalleAccionesVentasCajasResumidos.add(this.jMenuItemGuardarCambiosVentasCajasResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasCajasResumidos.add(this.jmenuDetalleArchivoVentasCajasResumidos);		
		this.jmenuBarDetalleVentasCajasResumidos.add(this.jmenuDetalleAccionesVentasCajasResumidos);		
		this.jmenuBarDetalleVentasCajasResumidos.add(this.jmenuDetalleDatosVentasCajasResumidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasCajasResumidos);				
	}
	
	
	public void inicializarElementosCamposVentasCajasResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasCajasResumidos = new JLabelMe();
		jLabelIdVentasCajasResumidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasCajasResumidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasCajasResumidos= new GridBagLayout();

		this.jPanelidVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);

		jLabelidVentasCajasResumidos = new JLabel();
		jLabelidVentasCajasResumidos.setText("Id");

		jLabelidVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasCajasResumidos = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasCajasResumidos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		//jFormattedTextFieldfecha_emision_desdeVentasCajasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasCajasResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasCajasResumidos.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasCajasResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasCajasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasCajasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasCajasResumidos = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasCajasResumidos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		//jFormattedTextFieldfecha_emision_hastaVentasCajasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasCajasResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasCajasResumidos.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasCajasResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasCajasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasCajasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoVentasCajasResumidos = new JLabelMe();
		this.jLabelcodigoVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoVentasCajasResumidos.setToolTipText("Codigo");
		this.jLabelcodigoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelcodigoVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldcodigoVentasCajasResumidos= new JTextFieldMe();

		jTextFieldcodigoVentasCajasResumidos.setEnabled(false);
		jTextFieldcodigoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtoncodigoVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoVentasCajasResumidosBusqueda.setText("U");
		this.jButtoncodigoVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoVentasCajasResumidos = new JLabelMe();
		this.jLabelnombre_completoVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoVentasCajasResumidos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelnombre_completoVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextAreanombre_completoVentasCajasResumidos= new JTextAreaMe();
		jTextAreanombre_completoVentasCajasResumidos.setEnabled(false);
		jTextAreanombre_completoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasCajasResumidos.setLineWrap(true);
		jTextAreanombre_completoVentasCajasResumidos.setWrapStyleWord(true);
		jTextAreanombre_completoVentasCajasResumidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoVentasCajasResumidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoVentasCajasResumidos = new JScrollPane(jTextAreanombre_completoVentasCajasResumidos);
		jscrollPanenombre_completoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonnombre_completoVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoVentasCajasResumidosBusqueda.setText("U");
		this.jButtonnombre_completoVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionVentasCajasResumidos = new JLabelMe();
		this.jLabelfecha_emisionVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionVentasCajasResumidos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelfecha_emisionVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		//jFormattedTextFieldfecha_emisionVentasCajasResumidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionVentasCajasResumidos= new JDateChooser();
		jDateChooserfecha_emisionVentasCajasResumidos.setEnabled(false);
		jDateChooserfecha_emisionVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionVentasCajasResumidos.setDate(new Date());
		jDateChooserfecha_emisionVentasCajasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionVentasCajasResumidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setText("U");
		this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoVentasCajasResumidos = new JLabelMe();
		this.jLabelnumero_pre_impresoVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoVentasCajasResumidos.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelnumero_pre_impresoVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldnumero_pre_impresoVentasCajasResumidos= new JTextFieldMe();

		jTextFieldnumero_pre_impresoVentasCajasResumidos.setEnabled(false);
		jTextFieldnumero_pre_impresoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setText("U");
		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoVentasCajasResumidos = new JLabelMe();
		this.jLabelnumero_documentoVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoVentasCajasResumidos.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelnumero_documentoVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldnumero_documentoVentasCajasResumidos= new JTextFieldMe();

		jTextFieldnumero_documentoVentasCajasResumidos.setEnabled(false);
		jTextFieldnumero_documentoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setText("U");
		this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltotalVentasCajasResumidos = new JLabelMe();
		this.jLabeltotalVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalVentasCajasResumidos.setToolTipText("Total");
		this.jLabeltotalVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPaneltotalVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldtotalVentasCajasResumidos= new JTextFieldMe();
		jTextFieldtotalVentasCajasResumidos.setEnabled(false);
		jTextFieldtotalVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalVentasCajasResumidos.setText("0.0");

		this.jButtontotalVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtontotalVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalVentasCajasResumidosBusqueda.setText("U");
		this.jButtontotalVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelefectivoVentasCajasResumidos = new JLabelMe();
		this.jLabelefectivoVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO+" : *");
		this.jLabelefectivoVentasCajasResumidos.setToolTipText("Efectivo");
		this.jLabelefectivoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelefectivoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelefectivoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelefectivoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelefectivoVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelefectivoVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_EFECTIVO);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelefectivoVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldefectivoVentasCajasResumidos= new JTextFieldMe();
		jTextFieldefectivoVentasCajasResumidos.setEnabled(false);
		jTextFieldefectivoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldefectivoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldefectivoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldefectivoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldefectivoVentasCajasResumidos.setText("0.0");

		this.jButtonefectivoVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonefectivoVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonefectivoVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonefectivoVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonefectivoVentasCajasResumidosBusqueda.setText("U");
		this.jButtonefectivoVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonefectivoVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonefectivoVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldefectivoVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldefectivoVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"efectivoVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonefectivoVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabeltarjetaVentasCajasResumidos = new JLabelMe();
		this.jLabeltarjetaVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_TARJETA+" : *");
		this.jLabeltarjetaVentasCajasResumidos.setToolTipText("Tarjeta");
		this.jLabeltarjetaVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltarjetaVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltarjetaVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltarjetaVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltarjetaVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltarjetaVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_TARJETA);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPaneltarjetaVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldtarjetaVentasCajasResumidos= new JTextFieldMe();
		jTextFieldtarjetaVentasCajasResumidos.setEnabled(false);
		jTextFieldtarjetaVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjetaVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjetaVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtarjetaVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtarjetaVentasCajasResumidos.setText("0.0");

		this.jButtontarjetaVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtontarjetaVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjetaVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjetaVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontarjetaVentasCajasResumidosBusqueda.setText("U");
		this.jButtontarjetaVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontarjetaVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontarjetaVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtarjetaVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtarjetaVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tarjetaVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontarjetaVentasCajasResumidosBusqueda.setVisible(false);		}


					
		this.jLabelcreditoVentasCajasResumidos = new JLabelMe();
		this.jLabelcreditoVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_CREDITO+" : *");
		this.jLabelcreditoVentasCajasResumidos.setToolTipText("Credito");
		this.jLabelcreditoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcreditoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcreditoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcreditoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcreditoVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcreditoVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_CREDITO);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelcreditoVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jTextFieldcreditoVentasCajasResumidos= new JTextFieldMe();
		jTextFieldcreditoVentasCajasResumidos.setEnabled(false);
		jTextFieldcreditoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcreditoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcreditoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcreditoVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcreditoVentasCajasResumidos.setText("0.0");

		this.jButtoncreditoVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtoncreditoVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncreditoVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncreditoVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncreditoVentasCajasResumidosBusqueda.setText("U");
		this.jButtoncreditoVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncreditoVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncreditoVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcreditoVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcreditoVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"creditoVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncreditoVentasCajasResumidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasCajasResumidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasCajasResumidos = new JLabelMe();
		this.jLabelid_empresaVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasCajasResumidos.setToolTipText("Empresa");
		this.jLabelid_empresaVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelid_empresaVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jComboBoxid_empresaVentasCajasResumidos= new JComboBoxMe();
		jComboBoxid_empresaVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasCajasResumidos.setEnabled(false);

		this.jButtonid_empresaVentasCajasResumidos= new JButtonMe();
		this.jButtonid_empresaVentasCajasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasCajasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasCajasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasCajasResumidos.setText("Buscar");
		this.jButtonid_empresaVentasCajasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasCajasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasCajasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasCajasResumidos"));

		this.jButtonid_empresaVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasCajasResumidosBusqueda.setText("U");
		this.jButtonid_empresaVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasCajasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasCajasResumidosUpdate= new JButtonMe();
		this.jButtonid_empresaVentasCajasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCajasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasCajasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasCajasResumidosUpdate.setText("U");
		this.jButtonid_empresaVentasCajasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasCajasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasCajasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasCajasResumidosUpdate"));



					
		this.jLabelid_sucursalVentasCajasResumidos = new JLabelMe();
		this.jLabelid_sucursalVentasCajasResumidos.setText(""+VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVentasCajasResumidos.setToolTipText("Sucursal");
		this.jLabelid_sucursalVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVentasCajasResumidos.setToolTipText(VentasCajasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		this.jPanelid_sucursalVentasCajasResumidos.setLayout(this.gridaBagLayoutVentasCajasResumidos);


		jComboBoxid_sucursalVentasCajasResumidos= new JComboBoxMe();
		jComboBoxid_sucursalVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVentasCajasResumidos.setEnabled(false);

		this.jButtonid_sucursalVentasCajasResumidos= new JButtonMe();
		this.jButtonid_sucursalVentasCajasResumidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasCajasResumidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasCajasResumidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasCajasResumidos.setText("Buscar");
		this.jButtonid_sucursalVentasCajasResumidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVentasCajasResumidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasCajasResumidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasCajasResumidos"));

		this.jButtonid_sucursalVentasCajasResumidosBusqueda= new JButtonMe();
		this.jButtonid_sucursalVentasCajasResumidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasCajasResumidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasCajasResumidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasCajasResumidosBusqueda.setText("U");
		this.jButtonid_sucursalVentasCajasResumidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVentasCajasResumidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasCajasResumidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasCajasResumidosBusqueda"));

		if(this.ventascajasresumidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVentasCajasResumidosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVentasCajasResumidosUpdate= new JButtonMe();
		this.jButtonid_sucursalVentasCajasResumidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasCajasResumidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasCajasResumidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasCajasResumidosUpdate.setText("U");
		this.jButtonid_sucursalVentasCajasResumidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVentasCajasResumidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasCajasResumidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVentasCajasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasCajasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasCajasResumidosUpdate"));



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
		//this.jInternalFrameDetalleVentasCajasResumidos = new VentasCajasResumidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Cajas Resumidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasCajasResumidos= new GridBagLayout();
		

		
		String sToolTipVentasCajasResumidos="";
		sToolTipVentasCajasResumidos=VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasCajasResumidos+="(Facturacion.VentasCajasResumidos)";
		}
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasCajasResumidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasCajasResumidos = new JButtonMe();
		this.jButtonModificarVentasCajasResumidos = new JButtonMe();
        this.jButtonActualizarVentasCajasResumidos = new JButtonMe();
        this.jButtonEliminarVentasCajasResumidos = new JButtonMe();
        this.jButtonCancelarVentasCajasResumidos = new JButtonMe();
        this.jButtonGuardarCambiosVentasCajasResumidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasCajasResumidos = new JButtonMe();
		this.jButtonCerrarVentasCajasResumidos = new JButtonMe();
		
		this.jScrollPanelDatosVentasCajasResumidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasCajasResumidos = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasCajasResumidos = new JScrollPane();
				
		
		
		this.jPanelCamposVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Cajas Resumidos";
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Cajas Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasCajasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasCajasResumidos.setName("jPanelCamposVentasCajasResumidos"); 

		this.jPanelCamposOcultosVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasCajasResumidos.setName("jPanelCamposOcultosVentasCajasResumidos"); 

        this.jPanelAccionesVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasCajasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesVentasCajasResumidos.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasCajasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasCajasResumidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasCajasResumidos.setText("Nuevo");
		this.jButtonModificarVentasCajasResumidos.setText("Editar");
        this.jButtonActualizarVentasCajasResumidos.setText("Actualizar");
        this.jButtonEliminarVentasCajasResumidos.setText("Eliminar");
        this.jButtonCancelarVentasCajasResumidos.setText("Cancelar");
        this.jButtonGuardarCambiosVentasCajasResumidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.setText("Guardar");
		this.jButtonCerrarVentasCajasResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasCajasResumidos,"nuevo_button","Nuevo",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasCajasResumidos,"modificar_button","Editar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasCajasResumidos,"actualizar_button","Actualizar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasCajasResumidos,"eliminar_button","Eliminar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasCajasResumidos,"cancelar_button","Cancelar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasCajasResumidos,"guardarcambios_button","Guardar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasCajasResumidos,"guardarcambiostabla_button","Guardar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasCajasResumidos,"cerrar_button","Salir",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasCajasResumidos.setToolTipText("Nuevo"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasCajasResumidos.setToolTipText("Editar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasCajasResumidos.setToolTipText("Actualizar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasCajasResumidos.setToolTipText("Eliminar)"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasCajasResumidos.setToolTipText("Cancelar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasCajasResumidos.setToolTipText("Guardar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.setToolTipText("Guardar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasCajasResumidos.setToolTipText("Salir"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasCajasResumidos";
		inputMap = this.jButtonNuevoVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasCajasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasCajasResumidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasCajasResumidos";
		inputMap = this.jButtonActualizarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasCajasResumidos"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasCajasResumidos";
		inputMap = this.jButtonEliminarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasCajasResumidos"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasCajasResumidos";
		inputMap = this.jButtonCancelarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasCajasResumidos"));
		
		//CERRAR		
		sMapKey = "CerrarVentasCajasResumidos";
		inputMap = this.jButtonCerrarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasCajasResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasCajasResumidos";
		inputMap = this.jButtonGuardarCambiosTablaVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasCajasResumidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasCajasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasCajasResumidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasCajasResumidos.setToolTipText("Nuevo VentasCajasResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasCajasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasCajasResumidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasCajasResumidos.setToolTipText("Sin Cerrar Ventana VentasCajasResumidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasCajasResumidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasCajasResumidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasCajasResumidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasCajasResumidos.setText("Accion");
		this.jComboBoxTiposAccionesVentasCajasResumidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasCajasResumidos = new JLabelMe();
		
		this.jLabelAccionesVentasCajasResumidos.setText("Acciones");		
		this.jLabelAccionesVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasCajasResumidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasCajasResumidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasCajasResumidos=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCajasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasCajasResumidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasCajasResumidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasCajasResumidos = new GridBagLayout();
		
		this.jPanelCamposVentasCajasResumidos.setLayout(gridaBagLayoutCamposVentasCajasResumidos);
		this.jPanelCamposOcultosVentasCajasResumidos.setLayout(gridaBagLayoutCamposOcultosVentasCajasResumidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasCajasResumidos.add(jLabelIdVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasCajasResumidos.add(jLabelidVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasCajasResumidos.add(jLabelid_empresaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasCajasResumidos.add(jButtonid_empresaVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 3;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasCajasResumidos.add(jButtonid_empresaVentasCajasResumidosUpdate, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasCajasResumidos.add(jComboBoxid_empresaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVentasCajasResumidos.add(jLabelid_sucursalVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasCajasResumidos.add(jButtonid_sucursalVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 3;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasCajasResumidos.add(jButtonid_sucursalVentasCajasResumidosUpdate, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVentasCajasResumidos.add(jComboBoxid_sucursalVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasCajasResumidos.add(jLabelfecha_emision_desdeVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasCajasResumidos.add(jButtonfecha_emision_desdeVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasCajasResumidos.add(jDateChooserfecha_emision_desdeVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasCajasResumidos.add(jLabelfecha_emision_hastaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasCajasResumidos.add(jButtonfecha_emision_hastaVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasCajasResumidos.add(jDateChooserfecha_emision_hastaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoVentasCajasResumidos.add(jLabelcodigoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoVentasCajasResumidos.add(jButtoncodigoVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoVentasCajasResumidos.add(jTextFieldcodigoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoVentasCajasResumidos.add(jLabelnombre_completoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoVentasCajasResumidos.add(jButtonnombre_completoVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoVentasCajasResumidos.add(jscrollPanenombre_completoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionVentasCajasResumidos.add(jLabelfecha_emisionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionVentasCajasResumidos.add(jButtonfecha_emisionVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionVentasCajasResumidos.add(jDateChooserfecha_emisionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoVentasCajasResumidos.add(jLabelnumero_pre_impresoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoVentasCajasResumidos.add(jButtonnumero_pre_impresoVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoVentasCajasResumidos.add(jTextFieldnumero_pre_impresoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoVentasCajasResumidos.add(jLabelnumero_documentoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoVentasCajasResumidos.add(jButtonnumero_documentoVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoVentasCajasResumidos.add(jTextFieldnumero_documentoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalVentasCajasResumidos.add(jLabeltotalVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalVentasCajasResumidos.add(jButtontotalVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalVentasCajasResumidos.add(jTextFieldtotalVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelefectivoVentasCajasResumidos.add(jLabelefectivoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelefectivoVentasCajasResumidos.add(jButtonefectivoVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelefectivoVentasCajasResumidos.add(jTextFieldefectivoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltarjetaVentasCajasResumidos.add(jLabeltarjetaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltarjetaVentasCajasResumidos.add(jButtontarjetaVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltarjetaVentasCajasResumidos.add(jTextFieldtarjetaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcreditoVentasCajasResumidos.add(jLabelcreditoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 2;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
		this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcreditoVentasCajasResumidos.add(jButtoncreditoVentasCajasResumidosBusqueda, this.gridBagConstraintsVentasCajasResumidos);
	}

	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
	this.gridBagConstraintsVentasCajasResumidos.gridx = 1;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcreditoVentasCajasResumidos.add(jTextFieldcreditoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelidVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelfecha_emision_desdeVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelfecha_emision_hastaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelcodigoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelnombre_completoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelfecha_emisionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelnumero_pre_impresoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelnumero_documentoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPaneltotalVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelefectivoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPaneltarjetaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasCajasResumidos.add(this.jPanelcreditoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposVentasCajasResumidos % 2==0) {
		iXPanelCamposVentasCajasResumidos=0;
		iYPanelCamposVentasCajasResumidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposOcultosVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposOcultosVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasCajasResumidos.add(this.jPanelid_empresaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposOcultosVentasCajasResumidos % 2==0) {
		iXPanelCamposOcultosVentasCajasResumidos=0;
		iYPanelCamposOcultosVentasCajasResumidos++;
	}
	this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasCajasResumidos.gridy = iYPanelCamposOcultosVentasCajasResumidos;
	this.gridBagConstraintsVentasCajasResumidos.gridx = iXPanelCamposOcultosVentasCajasResumidos++;
	this.gridBagConstraintsVentasCajasResumidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasCajasResumidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasCajasResumidos.add(this.jPanelid_sucursalVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);



	if(iXPanelCamposOcultosVentasCajasResumidos % 2==0) {
		iXPanelCamposOcultosVentasCajasResumidos=0;
		iYPanelCamposOcultosVentasCajasResumidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasCajasResumidos= new GridBagLayout();
		this.jPanelAccionesVentasCajasResumidos.setLayout(gridaBagLayoutAccionesVentasCajasResumidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasCajasResumidos= new GridBagLayout();
		this.jPanelAccionesFormularioVentasCajasResumidos.setLayout(gridaBagLayoutAccionesFormularioVentasCajasResumidos);
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasCajasResumidos.add(this.jComboBoxTiposAccionesFormularioVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasCajasResumidos.add(this.jButtonModificarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);							

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasCajasResumidos.add(this.jButtonEliminarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasCajasResumidos.add(this.jButtonActualizarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasCajasResumidos.add(this.jButtonGuardarCambiosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);	
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;		
		this.gridBagConstraintsVentasCajasResumidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasCajasResumidos.add(this.jButtonCancelarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasCajasResumidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();						
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;		
			//this.gridBagConstraintsVentasCajasResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasCajasResumidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasCajasResumidos.gridx =0;
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasCajasResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasCajasResumidos = new VentasCajasResumidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Cajas Resumidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Cajas Resumidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Cajas Resumidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasCajasResumidosModel ventascajasresumidosModel=new VentasCajasResumidosModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasCajasResumidosModel.VentasCajasResumidosFocusTraversalPolicy ventascajasresumidosFocusTraversalPolicy = ventascajasresumidosModel.new VentasCajasResumidosFocusTraversalPolicy(this);
			
			//ventascajasresumidosFocusTraversalPolicy.setventascajasresumidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventascajasresumidosModel);
			
			
			this.jContentPaneDetalleVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasCajasResumidos = new GridBagLayout();	
			this.jContentPaneDetalleVentasCajasResumidos.setLayout(gridaBagLayoutDetalleVentasCajasResumidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasCajasResumidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
				this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
					
				
				this.jContentPaneDetalleVentasCajasResumidos.add(jTtoolBarDetalleVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);								
				
}
			
			this.jScrollPanelDatosEdicionVentasCajasResumidos=   new JScrollPane(jContentPaneDetalleVentasCajasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasCajasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCajasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCajasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasCajasResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasCajasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCajasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCajasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	        
			this.jContentPaneDetalleVentasCajasResumidos.add(jPanelCamposVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);
			
			
			
			
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
						//&& ventascajasresumidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventascajasresumidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasCajasResumidos= new GridBagConstraints();
						this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
						this.jContentPaneDetalleVentasCajasResumidos.add(this.jTabbedPaneRelacionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasCajasResumidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasCajasResumidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
					this.gridBagConstraintsVentasCajasResumidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
					
				
					this.jContentPaneDetalleVentasCajasResumidos.add(jPanelCamposOcultosVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);
				
					this.jPanelCamposOcultosVentasCajasResumidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	        this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasCajasResumidos.add(this.jPanelAccionesFormularioVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);							
			
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
	        this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasCajasResumidos.add(this.jPanelAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasCajasResumidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasCajasResumidos=   new JScrollPane(this.jPanelCamposVentasCajasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasCajasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCajasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasCajasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasCajasResumidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasCajasResumidos;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasCajasResumidos;
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
