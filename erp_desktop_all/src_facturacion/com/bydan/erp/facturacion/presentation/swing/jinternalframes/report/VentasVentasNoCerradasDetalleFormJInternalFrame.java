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
import com.bydan.erp.facturacion.util.report.VentasVentasNoCerradasConstantesFunciones;

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
public class VentasVentasNoCerradasDetalleFormJInternalFrame extends VentasVentasNoCerradasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasVentasNoCerradas;
	
	protected JMenuBar jmenuBarDetalleVentasVentasNoCerradas;
	
	protected JMenu jmenuDetalleVentasVentasNoCerradas;
	protected JMenu jmenuDetalleArchivoVentasVentasNoCerradas;
	protected JMenu jmenuDetalleAccionesVentasVentasNoCerradas;
	protected JMenu jmenuDetalleDatosVentasVentasNoCerradas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasVentasNoCerradas;	
	protected GridBagConstraints gridBagConstraintsVentasVentasNoCerradas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasVentasNoCerradasBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasVentasNoCerradas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public VentasVentasNoCerradasSessionBean ventasventasnocerradasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public VentasVentasNoCerradasLogic ventasventasnocerradasLogic;
	
	public JScrollPane jScrollPanelDatosVentasVentasNoCerradas;
	public JScrollPane jScrollPanelDatosEdicionVentasVentasNoCerradas;
	public JScrollPane jScrollPanelDatosGeneralVentasVentasNoCerradas;
	
	protected JPanel jPanelCamposVentasVentasNoCerradas;    
	protected JPanel jPanelCamposOcultosVentasVentasNoCerradas;    	
	protected JPanel jPanelAccionesVentasVentasNoCerradas;
	protected JPanel jPanelAccionesFormularioVentasVentasNoCerradas;
    
	
	
	protected Integer iXPanelCamposVentasVentasNoCerradas=0;
	protected Integer iYPanelCamposVentasVentasNoCerradas=0;
	
	protected Integer iXPanelCamposOcultosVentasVentasNoCerradas=0;
	protected Integer iYPanelCamposOcultosVentasVentasNoCerradas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasVentasNoCerradas;
	public JButton jButtonModificarVentasVentasNoCerradas;
	public JButton jButtonActualizarVentasVentasNoCerradas;
    public JButton jButtonEliminarVentasVentasNoCerradas;
	public JButton jButtonCancelarVentasVentasNoCerradas;
    public JButton jButtonGuardarCambiosVentasVentasNoCerradas;
	public JButton jButtonGuardarCambiosTablaVentasVentasNoCerradas;
	protected JButton jButtonCerrarVentasVentasNoCerradas;
	
	
	protected JButton jButtonProcesarInformacionVentasVentasNoCerradas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasVentasNoCerradas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasVentasNoCerradas;
	protected JButton jButtonModificarToolBarVentasVentasNoCerradas;
	protected JButton jButtonActualizarToolBarVentasVentasNoCerradas;
    protected JButton jButtonEliminarToolBarVentasVentasNoCerradas;
	protected JButton jButtonCancelarToolBarVentasVentasNoCerradas;
    protected JButton jButtonGuardarCambiosToolBarVentasVentasNoCerradas;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasVentasNoCerradas;
	protected JButton jButtonCerrarToolBarVentasVentasNoCerradas;
	
	protected JButton jButtonProcesarInformacionToolBarVentasVentasNoCerradas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasVentasNoCerradas;
	protected JMenuItem jMenuItemModificarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemActualizarVentasVentasNoCerradas;
    protected JMenuItem jMenuItemEliminarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemCancelarVentasVentasNoCerradas;
    protected JMenuItem jMenuItemGuardarCambiosVentasVentasNoCerradas;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasVentasNoCerradas;
	protected JMenuItem jMenuItemCerrarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemDetalleCerrarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasVentasNoCerradas;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasVentasNoCerradas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas;
	protected JMenuItem jMenuItemMostrarOcultarVentasVentasNoCerradas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasVentasNoCerradas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasVentasNoCerradas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasVentasNoCerradas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasVentasNoCerradas;
	public JLabel jLabelIdVentasVentasNoCerradas;
	public JLabel jLabelidVentasVentasNoCerradas;
	public JButton jButtonidVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasVentasNoCerradas;
	public JLabel jLabelfecha_emision_desdeVentasVentasNoCerradas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasVentasNoCerradas;

	public JDateChooser jDateChooserfecha_emision_desdeVentasVentasNoCerradas;
	public JButton jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasVentasNoCerradas;
	public JLabel jLabelfecha_emision_hastaVentasVentasNoCerradas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasVentasNoCerradas;

	public JDateChooser jDateChooserfecha_emision_hastaVentasVentasNoCerradas;
	public JButton jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoVentasVentasNoCerradas;
	public JLabel jLabelcodigoVentasVentasNoCerradas;
	public JTextField jTextFieldcodigoVentasVentasNoCerradas;
	public JButton jButtoncodigoVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoVentasVentasNoCerradas;
	public JLabel jLabelnombre_completoVentasVentasNoCerradas;
	public JTextArea jTextAreanombre_completoVentasVentasNoCerradas;
	public JScrollPane jscrollPanenombre_completoVentasVentasNoCerradas;
	public JButton jButtonnombre_completoVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionVentasVentasNoCerradas;
	public JLabel jLabelfecha_emisionVentasVentasNoCerradas;
	//public JFormattedTextField jDateChooserfecha_emisionVentasVentasNoCerradas;

	public JDateChooser jDateChooserfecha_emisionVentasVentasNoCerradas;
	public JButton jButtonfecha_emisionVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoVentasVentasNoCerradas;
	public JLabel jLabelnumero_pre_impresoVentasVentasNoCerradas;
	public JTextField jTextFieldnumero_pre_impresoVentasVentasNoCerradas;
	public JButton jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoVentasVentasNoCerradas;
	public JLabel jLabelnumero_documentoVentasVentasNoCerradas;
	public JTextField jTextFieldnumero_documentoVentasVentasNoCerradas;
	public JButton jButtonnumero_documentoVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPaneltotalVentasVentasNoCerradas;
	public JLabel jLabeltotalVentasVentasNoCerradas;
	public JTextField jTextFieldtotalVentasVentasNoCerradas;
	public JButton jButtontotalVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelefectivoVentasVentasNoCerradas;
	public JLabel jLabelefectivoVentasVentasNoCerradas;
	public JTextField jTextFieldefectivoVentasVentasNoCerradas;
	public JButton jButtonefectivoVentasVentasNoCerradasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasVentasNoCerradas;
	public JLabel jLabelid_empresaVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasVentasNoCerradas;
	public JButton jButtonid_empresaVentasVentasNoCerradas= new JButtonMe();
	public JButton jButtonid_empresaVentasVentasNoCerradasUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasVentasNoCerradasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVentasVentasNoCerradas;
	public JLabel jLabelid_sucursalVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVentasVentasNoCerradas;
	public JButton jButtonid_sucursalVentasVentasNoCerradas= new JButtonMe();
	public JButton jButtonid_sucursalVentasVentasNoCerradasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVentasVentasNoCerradasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasVentasNoCerradas;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasVentasNoCerradasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasVentasNoCerradas=new JPanel();
				this.jPanelAccionesFormularioVentasVentasNoCerradas=new JPanel();
				this.jmenuBarDetalleVentasVentasNoCerradas=new JMenuBar();
				this.jTtoolBarDetalleVentasVentasNoCerradas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasVentasNoCerradasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasVentasNoCerradas() {
		return this.jButtonActualizarToolBarVentasVentasNoCerradas;
	}
	
	public JButton getjButtonEliminarToolBarVentasVentasNoCerradas() {
		return this.jButtonEliminarToolBarVentasVentasNoCerradas;
	}
	
	public JButton getjButtonCancelarToolBarVentasVentasNoCerradas() {
		return this.jButtonCancelarToolBarVentasVentasNoCerradas;
	}		
	
	public JButton getjButtonProcesarInformacionVentasVentasNoCerradas() {
		return this.jButtonProcesarInformacionVentasVentasNoCerradas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasVentasNoCerradas)	{
		this.jButtonProcesarInformacionVentasVentasNoCerradas = jButtonProcesarInformacionVentasVentasNoCerradas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasVentasNoCerradas() {
		return this.jComboBoxTiposAccionesVentasVentasNoCerradas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposRelacionesVentasVentasNoCerradas) {
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas = jComboBoxTiposRelacionesVentasVentasNoCerradas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposAccionesVentasVentasNoCerradas) {
		this.jComboBoxTiposAccionesVentasVentasNoCerradas = jComboBoxTiposAccionesVentasVentasNoCerradas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasVentasNoCerradas() {
		return this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasVentasNoCerradas(
			JComboBox jComboBoxTiposAccionesFormularioVentasVentasNoCerradas) {
		this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas = jComboBoxTiposAccionesFormularioVentasVentasNoCerradas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
		
		this.ventasventasnocerradasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasventasnocerradasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasVentasNoCerradasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasVentasNoCerradasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasVentasNoCerradasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Ventas No Cerradas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasVentasNoCerradasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasVentasNoCerradas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasVentasNoCerradas=new JButtonMe();
				this.jButtonModificarToolBarVentasVentasNoCerradas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasVentasNoCerradas,this.jTtoolBarDetalleVentasVentasNoCerradas,
							"actualizar","actualizar","Actualizar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasVentasNoCerradas,this.jTtoolBarDetalleVentasVentasNoCerradas,
							"eliminar","eliminar","Eliminar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasVentasNoCerradas,this.jTtoolBarDetalleVentasVentasNoCerradas,
							"cancelar","cancelar","Cancelar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasVentasNoCerradas,this.jTtoolBarDetalleVentasVentasNoCerradas,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasVentasNoCerradas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasVentasNoCerradas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasVentasNoCerradas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasVentasNoCerradas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasVentasNoCerradas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasVentasNoCerradas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasVentasNoCerradas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasVentasNoCerradas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasVentasNoCerradas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasVentasNoCerradas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasVentasNoCerradas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasVentasNoCerradas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasVentasNoCerradas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasVentasNoCerradas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasVentasNoCerradas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasVentasNoCerradas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasVentasNoCerradas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasVentasNoCerradas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasVentasNoCerradas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasVentasNoCerradas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasVentasNoCerradas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasVentasNoCerradas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasVentasNoCerradas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasVentasNoCerradas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasVentasNoCerradas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasVentasNoCerradas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasVentasNoCerradas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasVentasNoCerradas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasVentasNoCerradas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasVentasNoCerradas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasVentasNoCerradas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasVentasNoCerradas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasVentasNoCerradas.add(this.jMenuItemDetalleCerrarVentasVentasNoCerradas);
		
		this.jmenuDetalleAccionesVentasVentasNoCerradas.add(this.jMenuItemActualizarVentasVentasNoCerradas);
		this.jmenuDetalleAccionesVentasVentasNoCerradas.add(this.jMenuItemEliminarVentasVentasNoCerradas);
		this.jmenuDetalleAccionesVentasVentasNoCerradas.add(this.jMenuItemCancelarVentasVentasNoCerradas);		
		
		//this.jmenuDetalleDatosVentasVentasNoCerradas.add(this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas);				
		this.jmenuDetalleDatosVentasVentasNoCerradas.add(this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas);				
				
		//this.jmenuDetalleAccionesVentasVentasNoCerradas.add(this.jMenuItemGuardarCambiosVentasVentasNoCerradas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasVentasNoCerradas.add(this.jmenuDetalleArchivoVentasVentasNoCerradas);		
		this.jmenuBarDetalleVentasVentasNoCerradas.add(this.jmenuDetalleAccionesVentasVentasNoCerradas);		
		this.jmenuBarDetalleVentasVentasNoCerradas.add(this.jmenuDetalleDatosVentasVentasNoCerradas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasVentasNoCerradas);				
	}
	
	
	public void inicializarElementosCamposVentasVentasNoCerradas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasVentasNoCerradas = new JLabelMe();
		jLabelIdVentasVentasNoCerradas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasVentasNoCerradas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasVentasNoCerradas= new GridBagLayout();

		this.jPanelidVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);

		jLabelidVentasVentasNoCerradas = new JLabel();
		jLabelidVentasVentasNoCerradas.setText("Id");

		jLabelidVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasVentasNoCerradas = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasVentasNoCerradas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		//jFormattedTextFieldfecha_emision_desdeVentasVentasNoCerradas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasVentasNoCerradas= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasVentasNoCerradas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasVentasNoCerradas = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasVentasNoCerradas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		//jFormattedTextFieldfecha_emision_hastaVentasVentasNoCerradas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasVentasNoCerradas= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasVentasNoCerradas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoVentasVentasNoCerradas = new JLabelMe();
		this.jLabelcodigoVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoVentasVentasNoCerradas.setToolTipText("Codigo");
		this.jLabelcodigoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelcodigoVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jTextFieldcodigoVentasVentasNoCerradas= new JTextFieldMe();

		jTextFieldcodigoVentasVentasNoCerradas.setEnabled(false);
		jTextFieldcodigoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtoncodigoVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtoncodigoVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoVentasVentasNoCerradas = new JLabelMe();
		this.jLabelnombre_completoVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoVentasVentasNoCerradas.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelnombre_completoVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jTextAreanombre_completoVentasVentasNoCerradas= new JTextAreaMe();
		jTextAreanombre_completoVentasVentasNoCerradas.setEnabled(false);
		jTextAreanombre_completoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoVentasVentasNoCerradas.setLineWrap(true);
		jTextAreanombre_completoVentasVentasNoCerradas.setWrapStyleWord(true);
		jTextAreanombre_completoVentasVentasNoCerradas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoVentasVentasNoCerradas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoVentasVentasNoCerradas = new JScrollPane(jTextAreanombre_completoVentasVentasNoCerradas);
		jscrollPanenombre_completoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionVentasVentasNoCerradas = new JLabelMe();
		this.jLabelfecha_emisionVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionVentasVentasNoCerradas.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelfecha_emisionVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		//jFormattedTextFieldfecha_emisionVentasVentasNoCerradas= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionVentasVentasNoCerradas= new JDateChooser();
		jDateChooserfecha_emisionVentasVentasNoCerradas.setEnabled(false);
		jDateChooserfecha_emisionVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionVentasVentasNoCerradas.setDate(new Date());
		jDateChooserfecha_emisionVentasVentasNoCerradas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionVentasVentasNoCerradas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoVentasVentasNoCerradas = new JLabelMe();
		this.jLabelnumero_pre_impresoVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoVentasVentasNoCerradas.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelnumero_pre_impresoVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jTextFieldnumero_pre_impresoVentasVentasNoCerradas= new JTextFieldMe();

		jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setEnabled(false);
		jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoVentasVentasNoCerradas = new JLabelMe();
		this.jLabelnumero_documentoVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoVentasVentasNoCerradas.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelnumero_documentoVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jTextFieldnumero_documentoVentasVentasNoCerradas= new JTextFieldMe();

		jTextFieldnumero_documentoVentasVentasNoCerradas.setEnabled(false);
		jTextFieldnumero_documentoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabeltotalVentasVentasNoCerradas = new JLabelMe();
		this.jLabeltotalVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalVentasVentasNoCerradas.setToolTipText("Total");
		this.jLabeltotalVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPaneltotalVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jTextFieldtotalVentasVentasNoCerradas= new JTextFieldMe();
		jTextFieldtotalVentasVentasNoCerradas.setEnabled(false);
		jTextFieldtotalVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalVentasVentasNoCerradas.setText("0.0");

		this.jButtontotalVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtontotalVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtontotalVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalVentasVentasNoCerradasBusqueda.setVisible(false);		}


					
		this.jLabelefectivoVentasVentasNoCerradas = new JLabelMe();
		this.jLabelefectivoVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO+" : *");
		this.jLabelefectivoVentasVentasNoCerradas.setToolTipText("Efectivo");
		this.jLabelefectivoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelefectivoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelefectivoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelefectivoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelefectivoVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelefectivoVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_EFECTIVO);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelefectivoVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jTextFieldefectivoVentasVentasNoCerradas= new JTextFieldMe();
		jTextFieldefectivoVentasVentasNoCerradas.setEnabled(false);
		jTextFieldefectivoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldefectivoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldefectivoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldefectivoVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldefectivoVentasVentasNoCerradas.setText("0.0");

		this.jButtonefectivoVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonefectivoVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonefectivoVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonefectivoVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonefectivoVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonefectivoVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonefectivoVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonefectivoVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldefectivoVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldefectivoVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"efectivoVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonefectivoVentasVentasNoCerradasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasVentasNoCerradas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasVentasNoCerradas = new JLabelMe();
		this.jLabelid_empresaVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasVentasNoCerradas.setToolTipText("Empresa");
		this.jLabelid_empresaVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelid_empresaVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jComboBoxid_empresaVentasVentasNoCerradas= new JComboBoxMe();
		jComboBoxid_empresaVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasVentasNoCerradas.setEnabled(false);

		this.jButtonid_empresaVentasVentasNoCerradas= new JButtonMe();
		this.jButtonid_empresaVentasVentasNoCerradas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasVentasNoCerradas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasVentasNoCerradas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasVentasNoCerradas.setText("Buscar");
		this.jButtonid_empresaVentasVentasNoCerradas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasVentasNoCerradas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasVentasNoCerradas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasVentasNoCerradas"));

		this.jButtonid_empresaVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasVentasNoCerradasBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasVentasNoCerradasUpdate= new JButtonMe();
		this.jButtonid_empresaVentasVentasNoCerradasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasVentasNoCerradasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasVentasNoCerradasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasVentasNoCerradasUpdate.setText("U");
		this.jButtonid_empresaVentasVentasNoCerradasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasVentasNoCerradasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasVentasNoCerradasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasVentasNoCerradasUpdate"));



					
		this.jLabelid_sucursalVentasVentasNoCerradas = new JLabelMe();
		this.jLabelid_sucursalVentasVentasNoCerradas.setText(""+VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVentasVentasNoCerradas.setToolTipText("Sucursal");
		this.jLabelid_sucursalVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVentasVentasNoCerradas.setToolTipText(VentasVentasNoCerradasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		this.jPanelid_sucursalVentasVentasNoCerradas.setLayout(this.gridaBagLayoutVentasVentasNoCerradas);


		jComboBoxid_sucursalVentasVentasNoCerradas= new JComboBoxMe();
		jComboBoxid_sucursalVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVentasVentasNoCerradas.setEnabled(false);

		this.jButtonid_sucursalVentasVentasNoCerradas= new JButtonMe();
		this.jButtonid_sucursalVentasVentasNoCerradas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasVentasNoCerradas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasVentasNoCerradas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVentasVentasNoCerradas.setText("Buscar");
		this.jButtonid_sucursalVentasVentasNoCerradas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVentasVentasNoCerradas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasVentasNoCerradas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasVentasNoCerradas"));

		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda= new JButtonMe();
		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setText("U");
		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasVentasNoCerradasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasVentasNoCerradasBusqueda"));

		if(this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVentasVentasNoCerradasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVentasVentasNoCerradasUpdate= new JButtonMe();
		this.jButtonid_sucursalVentasVentasNoCerradasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasVentasNoCerradasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVentasVentasNoCerradasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVentasVentasNoCerradasUpdate.setText("U");
		this.jButtonid_sucursalVentasVentasNoCerradasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVentasVentasNoCerradasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVentasVentasNoCerradasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVentasVentasNoCerradas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVentasVentasNoCerradas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVentasVentasNoCerradasUpdate"));



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
		//this.jInternalFrameDetalleVentasVentasNoCerradas = new VentasVentasNoCerradasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Ventas No Cerradas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasVentasNoCerradas= new GridBagLayout();
		

		
		String sToolTipVentasVentasNoCerradas="";
		sToolTipVentasVentasNoCerradas=VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasVentasNoCerradas+="(Facturacion.VentasVentasNoCerradas)";
		}
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasVentasNoCerradas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasVentasNoCerradas = new JButtonMe();
		this.jButtonModificarVentasVentasNoCerradas = new JButtonMe();
        this.jButtonActualizarVentasVentasNoCerradas = new JButtonMe();
        this.jButtonEliminarVentasVentasNoCerradas = new JButtonMe();
        this.jButtonCancelarVentasVentasNoCerradas = new JButtonMe();
        this.jButtonGuardarCambiosVentasVentasNoCerradas = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas = new JButtonMe();
		this.jButtonCerrarVentasVentasNoCerradas = new JButtonMe();
		
		this.jScrollPanelDatosVentasVentasNoCerradas = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasVentasNoCerradas = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasVentasNoCerradas = new JScrollPane();
				
		
		
		this.jPanelCamposVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Ventas No Cerradas";
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Ventas No Cerradases" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasVentasNoCerradas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasVentasNoCerradas.setName("jPanelCamposVentasVentasNoCerradas"); 

		this.jPanelCamposOcultosVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasVentasNoCerradas.setName("jPanelCamposOcultosVentasVentasNoCerradas"); 

        this.jPanelAccionesVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasVentasNoCerradas.setToolTipText("Acciones");
        this.jPanelAccionesVentasVentasNoCerradas.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasVentasNoCerradas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasVentasNoCerradas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasVentasNoCerradas.setText("Nuevo");
		this.jButtonModificarVentasVentasNoCerradas.setText("Editar");
        this.jButtonActualizarVentasVentasNoCerradas.setText("Actualizar");
        this.jButtonEliminarVentasVentasNoCerradas.setText("Eliminar");
        this.jButtonCancelarVentasVentasNoCerradas.setText("Cancelar");
        this.jButtonGuardarCambiosVentasVentasNoCerradas.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.setText("Guardar");
		this.jButtonCerrarVentasVentasNoCerradas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasVentasNoCerradas,"nuevo_button","Nuevo",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasVentasNoCerradas,"modificar_button","Editar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasVentasNoCerradas,"actualizar_button","Actualizar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasVentasNoCerradas,"eliminar_button","Eliminar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasVentasNoCerradas,"cancelar_button","Cancelar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasVentasNoCerradas,"guardarcambios_button","Guardar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasVentasNoCerradas,"guardarcambiostabla_button","Guardar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasVentasNoCerradas,"cerrar_button","Salir",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasVentasNoCerradas.setToolTipText("Nuevo"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasVentasNoCerradas.setToolTipText("Editar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasVentasNoCerradas.setToolTipText("Actualizar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasVentasNoCerradas.setToolTipText("Eliminar)"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasVentasNoCerradas.setToolTipText("Cancelar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasVentasNoCerradas.setToolTipText("Guardar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.setToolTipText("Guardar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasVentasNoCerradas.setToolTipText("Salir"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasVentasNoCerradas";
		inputMap = this.jButtonNuevoVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasVentasNoCerradas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasVentasNoCerradas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasVentasNoCerradas";
		inputMap = this.jButtonActualizarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasVentasNoCerradas"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasVentasNoCerradas";
		inputMap = this.jButtonEliminarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasVentasNoCerradas"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasVentasNoCerradas";
		inputMap = this.jButtonCancelarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasVentasNoCerradas"));
		
		//CERRAR		
		sMapKey = "CerrarVentasVentasNoCerradas";
		inputMap = this.jButtonCerrarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasVentasNoCerradas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasVentasNoCerradas";
		inputMap = this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasVentasNoCerradas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasVentasNoCerradas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasVentasNoCerradas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasVentasNoCerradas.setToolTipText("Nuevo VentasVentasNoCerradas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas.setToolTipText("Sin Cerrar Ventana VentasVentasNoCerradas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasVentasNoCerradas.setText("Accion");
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasVentasNoCerradas = new JLabelMe();
		
		this.jLabelAccionesVentasVentasNoCerradas.setText("Acciones");		
		this.jLabelAccionesVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasVentasNoCerradas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasVentasNoCerradas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasVentasNoCerradas=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasVentasNoCerradas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasVentasNoCerradas = new GridBagLayout();
		
		this.jPanelCamposVentasVentasNoCerradas.setLayout(gridaBagLayoutCamposVentasVentasNoCerradas);
		this.jPanelCamposOcultosVentasVentasNoCerradas.setLayout(gridaBagLayoutCamposOcultosVentasVentasNoCerradas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasVentasNoCerradas.add(jLabelIdVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasVentasNoCerradas.add(jLabelidVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasVentasNoCerradas.add(jLabelid_empresaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasVentasNoCerradas.add(jButtonid_empresaVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 3;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasVentasNoCerradas.add(jButtonid_empresaVentasVentasNoCerradasUpdate, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasVentasNoCerradas.add(jComboBoxid_empresaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVentasVentasNoCerradas.add(jLabelid_sucursalVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasVentasNoCerradas.add(jButtonid_sucursalVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 3;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVentasVentasNoCerradas.add(jButtonid_sucursalVentasVentasNoCerradasUpdate, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVentasVentasNoCerradas.add(jComboBoxid_sucursalVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasVentasNoCerradas.add(jLabelfecha_emision_desdeVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasVentasNoCerradas.add(jButtonfecha_emision_desdeVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasVentasNoCerradas.add(jDateChooserfecha_emision_desdeVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasVentasNoCerradas.add(jLabelfecha_emision_hastaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasVentasNoCerradas.add(jButtonfecha_emision_hastaVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasVentasNoCerradas.add(jDateChooserfecha_emision_hastaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoVentasVentasNoCerradas.add(jLabelcodigoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoVentasVentasNoCerradas.add(jButtoncodigoVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoVentasVentasNoCerradas.add(jTextFieldcodigoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoVentasVentasNoCerradas.add(jLabelnombre_completoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoVentasVentasNoCerradas.add(jButtonnombre_completoVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoVentasVentasNoCerradas.add(jscrollPanenombre_completoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionVentasVentasNoCerradas.add(jLabelfecha_emisionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionVentasVentasNoCerradas.add(jButtonfecha_emisionVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionVentasVentasNoCerradas.add(jDateChooserfecha_emisionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoVentasVentasNoCerradas.add(jLabelnumero_pre_impresoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoVentasVentasNoCerradas.add(jButtonnumero_pre_impresoVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoVentasVentasNoCerradas.add(jTextFieldnumero_pre_impresoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoVentasVentasNoCerradas.add(jLabelnumero_documentoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoVentasVentasNoCerradas.add(jButtonnumero_documentoVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoVentasVentasNoCerradas.add(jTextFieldnumero_documentoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalVentasVentasNoCerradas.add(jLabeltotalVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalVentasVentasNoCerradas.add(jButtontotalVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalVentasVentasNoCerradas.add(jTextFieldtotalVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelefectivoVentasVentasNoCerradas.add(jLabelefectivoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 2;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(0, 0, 0, 0);
		this.jPanelefectivoVentasVentasNoCerradas.add(jButtonefectivoVentasVentasNoCerradasBusqueda, this.gridBagConstraintsVentasVentasNoCerradas);
	}

	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelefectivoVentasVentasNoCerradas.add(jTextFieldefectivoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelidVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelfecha_emision_desdeVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelfecha_emision_hastaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelcodigoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelnombre_completoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelfecha_emisionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelnumero_pre_impresoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelnumero_documentoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPaneltotalVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasVentasNoCerradas.add(this.jPanelefectivoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposVentasVentasNoCerradas % 1==0) {
		iXPanelCamposVentasVentasNoCerradas=0;
		iYPanelCamposVentasVentasNoCerradas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposOcultosVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposOcultosVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasVentasNoCerradas.add(this.jPanelid_empresaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposOcultosVentasVentasNoCerradas % 1==0) {
		iXPanelCamposOcultosVentasVentasNoCerradas=0;
		iYPanelCamposOcultosVentasVentasNoCerradas++;
	}
	this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasVentasNoCerradas.gridy = iYPanelCamposOcultosVentasVentasNoCerradas;
	this.gridBagConstraintsVentasVentasNoCerradas.gridx = iXPanelCamposOcultosVentasVentasNoCerradas++;
	this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasVentasNoCerradas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasVentasNoCerradas.add(this.jPanelid_sucursalVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);



	if(iXPanelCamposOcultosVentasVentasNoCerradas % 1==0) {
		iXPanelCamposOcultosVentasVentasNoCerradas=0;
		iYPanelCamposOcultosVentasVentasNoCerradas++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasVentasNoCerradas= new GridBagLayout();
		this.jPanelAccionesVentasVentasNoCerradas.setLayout(gridaBagLayoutAccionesVentasVentasNoCerradas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasVentasNoCerradas= new GridBagLayout();
		this.jPanelAccionesFormularioVentasVentasNoCerradas.setLayout(gridaBagLayoutAccionesFormularioVentasVentasNoCerradas);
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasVentasNoCerradas.add(this.jComboBoxTiposAccionesFormularioVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasVentasNoCerradas.add(this.jButtonModificarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);							

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasVentasNoCerradas.add(this.jButtonEliminarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasVentasNoCerradas.add(this.jButtonActualizarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasVentasNoCerradas.add(this.jButtonGuardarCambiosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);	
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasVentasNoCerradas.add(this.jButtonCancelarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasVentasNoCerradas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();						
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;		
			//this.gridBagConstraintsVentasVentasNoCerradas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =0;
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasVentasNoCerradas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasVentasNoCerradas = new VentasVentasNoCerradasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Ventas No Cerradas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Ventas No Cerradas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Ventas No Cerradas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasVentasNoCerradasModel ventasventasnocerradasModel=new VentasVentasNoCerradasModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasVentasNoCerradasModel.VentasVentasNoCerradasFocusTraversalPolicy ventasventasnocerradasFocusTraversalPolicy = ventasventasnocerradasModel.new VentasVentasNoCerradasFocusTraversalPolicy(this);
			
			//ventasventasnocerradasFocusTraversalPolicy.setventasventasnocerradasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventasventasnocerradasModel);
			
			
			this.jContentPaneDetalleVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasVentasNoCerradas = new GridBagLayout();	
			this.jContentPaneDetalleVentasVentasNoCerradas.setLayout(gridaBagLayoutDetalleVentasVentasNoCerradas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasVentasNoCerradas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
				this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
					
				
				this.jContentPaneDetalleVentasVentasNoCerradas.add(jTtoolBarDetalleVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);								
				
}
			
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas=   new JScrollPane(jContentPaneDetalleVentasVentasNoCerradas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	        
			this.jContentPaneDetalleVentasVentasNoCerradas.add(jPanelCamposVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);
			
			
			
			
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
						//&& ventasventasnocerradasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasVentasNoCerradas= new GridBagConstraints();
						this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
						this.jContentPaneDetalleVentasVentasNoCerradas.add(this.jTabbedPaneRelacionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasVentasNoCerradas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasVentasNoCerradas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
					this.gridBagConstraintsVentasVentasNoCerradas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
					
				
					this.jContentPaneDetalleVentasVentasNoCerradas.add(jPanelCamposOcultosVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);
				
					this.jPanelCamposOcultosVentasVentasNoCerradas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	        this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasVentasNoCerradas.add(this.jPanelAccionesFormularioVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);							
			
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
	        this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasVentasNoCerradas.add(this.jPanelAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasVentasNoCerradas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas=   new JScrollPane(this.jPanelCamposVentasVentasNoCerradas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasVentasNoCerradas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasVentasNoCerradas;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasVentasNoCerradas;
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
