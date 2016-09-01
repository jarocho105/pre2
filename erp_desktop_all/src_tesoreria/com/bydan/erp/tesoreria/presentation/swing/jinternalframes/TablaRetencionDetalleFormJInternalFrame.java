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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TablaRetencionConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TablaRetencionDetalleFormJInternalFrame extends TablaRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTablaRetencion;
	
	protected JMenuBar jmenuBarDetalleTablaRetencion;
	
	protected JMenu jmenuDetalleTablaRetencion;
	protected JMenu jmenuDetalleArchivoTablaRetencion;
	protected JMenu jmenuDetalleAccionesTablaRetencion;
	protected JMenu jmenuDetalleDatosTablaRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTablaRetencion;	
	protected GridBagConstraints gridBagConstraintsTablaRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TablaRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTablaRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TablaRetencionSessionBean tablaretencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public TablaRetencionLogic tablaretencionLogic;
	
	public JScrollPane jScrollPanelDatosTablaRetencion;
	public JScrollPane jScrollPanelDatosEdicionTablaRetencion;
	public JScrollPane jScrollPanelDatosGeneralTablaRetencion;
	
	protected JPanel jPanelCamposTablaRetencion;    
	protected JPanel jPanelCamposOcultosTablaRetencion;    	
	protected JPanel jPanelAccionesTablaRetencion;
	protected JPanel jPanelAccionesFormularioTablaRetencion;
    
	
	
	protected Integer iXPanelCamposTablaRetencion=0;
	protected Integer iYPanelCamposTablaRetencion=0;
	
	protected Integer iXPanelCamposOcultosTablaRetencion=0;
	protected Integer iYPanelCamposOcultosTablaRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTablaRetencion;
	public JButton jButtonModificarTablaRetencion;
	public JButton jButtonActualizarTablaRetencion;
    public JButton jButtonEliminarTablaRetencion;
	public JButton jButtonCancelarTablaRetencion;
    public JButton jButtonGuardarCambiosTablaRetencion;
	public JButton jButtonGuardarCambiosTablaTablaRetencion;
	protected JButton jButtonCerrarTablaRetencion;
	
	
	protected JButton jButtonProcesarInformacionTablaRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTablaRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTablaRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTablaRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTablaRetencion;
	protected JButton jButtonModificarToolBarTablaRetencion;
	protected JButton jButtonActualizarToolBarTablaRetencion;
    protected JButton jButtonEliminarToolBarTablaRetencion;
	protected JButton jButtonCancelarToolBarTablaRetencion;
    protected JButton jButtonGuardarCambiosToolBarTablaRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarTablaRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarTablaRetencion;
	protected JButton jButtonCerrarToolBarTablaRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarTablaRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTablaRetencion;
	protected JMenuItem jMenuItemModificarTablaRetencion;
	protected JMenuItem jMenuItemActualizarTablaRetencion;
    protected JMenuItem jMenuItemEliminarTablaRetencion;
	protected JMenuItem jMenuItemCancelarTablaRetencion;
    protected JMenuItem jMenuItemGuardarCambiosTablaRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTablaRetencion;
	protected JMenuItem jMenuItemCerrarTablaRetencion;
	protected JMenuItem jMenuItemDetalleCerrarTablaRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTablaRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionTablaRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTablaRetencion;
	protected JMenuItem jMenuItemMostrarOcultarTablaRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTablaRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTablaRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTablaRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTablaRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTablaRetencion;
	public JLabel jLabelIdTablaRetencion;
	public JLabel jLabelidTablaRetencion;
	public JButton jButtonidTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTablaRetencion;
	public JLabel jLabelcodigoTablaRetencion;
	public JTextField jTextFieldcodigoTablaRetencion;
	public JButton jButtoncodigoTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTablaRetencion;
	public JLabel jLabelnombreTablaRetencion;
	public JTextArea jTextAreanombreTablaRetencion;
	public JScrollPane jscrollPanenombreTablaRetencion;
	public JButton jButtonnombreTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeTablaRetencion;
	public JLabel jLabelporcentajeTablaRetencion;
	public JTextField jTextFieldporcentajeTablaRetencion;
	public JButton jButtonporcentajeTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelmonto_minimoTablaRetencion;
	public JLabel jLabelmonto_minimoTablaRetencion;
	public JTextField jTextFieldmonto_minimoTablaRetencion;
	public JButton jButtonmonto_minimoTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_debitoTablaRetencion;
	public JLabel jLabeles_debitoTablaRetencion;
	public JCheckBox jCheckBoxes_debitoTablaRetencion;
	public JButton jButtones_debitoTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_retencion_fuenteTablaRetencion;
	public JLabel jLabeles_retencion_fuenteTablaRetencion;
	public JCheckBox jCheckBoxes_retencion_fuenteTablaRetencion;
	public JButton jButtones_retencion_fuenteTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcon_secuencialTablaRetencion;
	public JLabel jLabelcon_secuencialTablaRetencion;
	public JCheckBox jCheckBoxcon_secuencialTablaRetencion;
	public JButton jButtoncon_secuencialTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcon_sub_total_facturaTablaRetencion;
	public JLabel jLabelcon_sub_total_facturaTablaRetencion;
	public JCheckBox jCheckBoxcon_sub_total_facturaTablaRetencion;
	public JButton jButtoncon_sub_total_facturaTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcon_iva_facturaTablaRetencion;
	public JLabel jLabelcon_iva_facturaTablaRetencion;
	public JCheckBox jCheckBoxcon_iva_facturaTablaRetencion;
	public JButton jButtoncon_iva_facturaTablaRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTablaRetencion;
	public JLabel jLabelid_empresaTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTablaRetencion;
	public JButton jButtonid_empresaTablaRetencion= new JButtonMe();
	public JButton jButtonid_empresaTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionTablaRetencion;
	public JLabel jLabelid_tipo_retencionTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionTablaRetencion;
	public JButton jButtonid_tipo_retencionTablaRetencion= new JButtonMe();
	public JButton jButtonid_tipo_retencionTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionTablaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoTablaRetencion;
	public JLabel jLabelid_cuenta_contable_debitoTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoTablaRetencion;
	public JButton jButtonid_cuenta_contable_debitoTablaRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoTablaRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoTablaRetencionArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoTablaRetencion;
	public JLabel jLabelid_cuenta_contable_creditoTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoTablaRetencion;
	public JButton jButtonid_cuenta_contable_creditoTablaRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTablaRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTablaRetencionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTablaRetencion;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TablaRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTablaRetencion=new JPanel();
				this.jPanelAccionesFormularioTablaRetencion=new JPanel();
				this.jmenuBarDetalleTablaRetencion=new JMenuBar();
				this.jTtoolBarDetalleTablaRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TablaRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTablaRetencion() {
		return this.jButtonActualizarToolBarTablaRetencion;
	}
	
	public JButton getjButtonEliminarToolBarTablaRetencion() {
		return this.jButtonEliminarToolBarTablaRetencion;
	}
	
	public JButton getjButtonCancelarToolBarTablaRetencion() {
		return this.jButtonCancelarToolBarTablaRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionTablaRetencion() {
		return this.jButtonProcesarInformacionTablaRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTablaRetencion)	{
		this.jButtonProcesarInformacionTablaRetencion = jButtonProcesarInformacionTablaRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTablaRetencion() {
		return this.jComboBoxTiposAccionesTablaRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTablaRetencion(
			JComboBox jComboBoxTiposRelacionesTablaRetencion) {
		this.jComboBoxTiposRelacionesTablaRetencion = jComboBoxTiposRelacionesTablaRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTablaRetencion(
			JComboBox jComboBoxTiposAccionesTablaRetencion) {
		this.jComboBoxTiposAccionesTablaRetencion = jComboBoxTiposAccionesTablaRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTablaRetencion() {
		return this.jComboBoxTiposAccionesFormularioTablaRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTablaRetencion(
			JComboBox jComboBoxTiposAccionesFormularioTablaRetencion) {
		this.jComboBoxTiposAccionesFormularioTablaRetencion = jComboBoxTiposAccionesFormularioTablaRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tablaretencionSessionBean=new TablaRetencionSessionBean();
		
		this.tablaretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tablaretencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TablaRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TablaRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TablaRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tabla Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
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
	
		TablaRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTablaRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTablaRetencion=new JButtonMe();
				this.jButtonModificarToolBarTablaRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTablaRetencion,this.jTtoolBarDetalleTablaRetencion,
							"actualizar","actualizar","Actualizar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTablaRetencion,this.jTtoolBarDetalleTablaRetencion,
							"eliminar","eliminar","Eliminar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTablaRetencion,this.jTtoolBarDetalleTablaRetencion,
							"cancelar","cancelar","Cancelar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTablaRetencion,this.jTtoolBarDetalleTablaRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTablaRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTablaRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTablaRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTablaRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTablaRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTablaRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTablaRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTablaRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTablaRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTablaRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTablaRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTablaRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTablaRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTablaRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTablaRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTablaRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTablaRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTablaRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTablaRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTablaRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTablaRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTablaRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTablaRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTablaRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTablaRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTablaRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTablaRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTablaRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTablaRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTablaRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTablaRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTablaRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTablaRetencion.add(this.jMenuItemDetalleCerrarTablaRetencion);
		
		this.jmenuDetalleAccionesTablaRetencion.add(this.jMenuItemActualizarTablaRetencion);
		this.jmenuDetalleAccionesTablaRetencion.add(this.jMenuItemEliminarTablaRetencion);
		this.jmenuDetalleAccionesTablaRetencion.add(this.jMenuItemCancelarTablaRetencion);		
		
		//this.jmenuDetalleDatosTablaRetencion.add(this.jMenuItemDetalleAbrirOrderByTablaRetencion);				
		this.jmenuDetalleDatosTablaRetencion.add(this.jMenuItemDetalleMostarOcultarTablaRetencion);				
				
		//this.jmenuDetalleAccionesTablaRetencion.add(this.jMenuItemGuardarCambiosTablaRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTablaRetencion.add(this.jmenuDetalleArchivoTablaRetencion);		
		this.jmenuBarDetalleTablaRetencion.add(this.jmenuDetalleAccionesTablaRetencion);		
		this.jmenuBarDetalleTablaRetencion.add(this.jmenuDetalleDatosTablaRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTablaRetencion);				
	}
	
	
	public void inicializarElementosCamposTablaRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTablaRetencion = new JLabelMe();
		jLabelIdTablaRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTablaRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTablaRetencion= new GridBagLayout();

		this.jPanelidTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);

		jLabelidTablaRetencion = new JLabel();
		jLabelidTablaRetencion.setText("Id");

		jLabelidTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTablaRetencion = new JLabelMe();
		this.jLabelcodigoTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTablaRetencion.setToolTipText("Codigo");
		this.jLabelcodigoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelcodigoTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jTextFieldcodigoTablaRetencion= new JTextFieldMe();

		jTextFieldcodigoTablaRetencion.setEnabled(false);
		jTextFieldcodigoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTablaRetencionBusqueda= new JButtonMe();
		this.jButtoncodigoTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTablaRetencionBusqueda.setText("U");
		this.jButtoncodigoTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTablaRetencion = new JLabelMe();
		this.jLabelnombreTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTablaRetencion.setToolTipText("Nombre");
		this.jLabelnombreTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelnombreTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jTextAreanombreTablaRetencion= new JTextAreaMe();
		jTextAreanombreTablaRetencion.setEnabled(false);
		jTextAreanombreTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTablaRetencion.setLineWrap(true);
		jTextAreanombreTablaRetencion.setWrapStyleWord(true);
		jTextAreanombreTablaRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTablaRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTablaRetencion = new JScrollPane(jTextAreanombreTablaRetencion);
		jscrollPanenombreTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTablaRetencionBusqueda= new JButtonMe();
		this.jButtonnombreTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTablaRetencionBusqueda.setText("U");
		this.jButtonnombreTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeTablaRetencion = new JLabelMe();
		this.jLabelporcentajeTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeTablaRetencion.setToolTipText("Porcentaje");
		this.jLabelporcentajeTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelporcentajeTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jTextFieldporcentajeTablaRetencion= new JTextFieldMe();
		jTextFieldporcentajeTablaRetencion.setEnabled(false);
		jTextFieldporcentajeTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeTablaRetencion.setText("0.0");

		this.jButtonporcentajeTablaRetencionBusqueda= new JButtonMe();
		this.jButtonporcentajeTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeTablaRetencionBusqueda.setText("U");
		this.jButtonporcentajeTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelmonto_minimoTablaRetencion = new JLabelMe();
		this.jLabelmonto_minimoTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO+" : *");
		this.jLabelmonto_minimoTablaRetencion.setToolTipText("Monto Minimo");
		this.jLabelmonto_minimoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_minimoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_minimoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_minimoTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelmonto_minimoTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jTextFieldmonto_minimoTablaRetencion= new JTextFieldMe();
		jTextFieldmonto_minimoTablaRetencion.setEnabled(false);
		jTextFieldmonto_minimoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_minimoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_minimoTablaRetencion.setText("0.0");

		this.jButtonmonto_minimoTablaRetencionBusqueda= new JButtonMe();
		this.jButtonmonto_minimoTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_minimoTablaRetencionBusqueda.setText("U");
		this.jButtonmonto_minimoTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_minimoTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_minimoTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_minimoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_minimoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_minimoTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_minimoTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_debitoTablaRetencion = new JLabelMe();
		this.jLabeles_debitoTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_ESDEBITO+" : *");
		this.jLabeles_debitoTablaRetencion.setToolTipText("Es Debito");
		this.jLabeles_debitoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debitoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debitoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debitoTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_ESDEBITO);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPaneles_debitoTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jCheckBoxes_debitoTablaRetencion= new JCheckBoxMe();
		jCheckBoxes_debitoTablaRetencion.setEnabled(false);

		jCheckBoxes_debitoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debitoTablaRetencionBusqueda= new JButtonMe();
		this.jButtones_debitoTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debitoTablaRetencionBusqueda.setText("U");
		this.jButtones_debitoTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debitoTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debitoTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debitoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debitoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debitoTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debitoTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_retencion_fuenteTablaRetencion = new JLabelMe();
		this.jLabeles_retencion_fuenteTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE+" : *");
		this.jLabeles_retencion_fuenteTablaRetencion.setToolTipText("Es Retencion Fuente");
		this.jLabeles_retencion_fuenteTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_fuenteTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_fuenteTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_retencion_fuenteTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_retencion_fuenteTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_retencion_fuenteTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPaneles_retencion_fuenteTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jCheckBoxes_retencion_fuenteTablaRetencion= new JCheckBoxMe();
		jCheckBoxes_retencion_fuenteTablaRetencion.setEnabled(false);

		jCheckBoxes_retencion_fuenteTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_fuenteTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_fuenteTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_retencion_fuenteTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_retencion_fuenteTablaRetencionBusqueda= new JButtonMe();
		this.jButtones_retencion_fuenteTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_fuenteTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_fuenteTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_retencion_fuenteTablaRetencionBusqueda.setText("U");
		this.jButtones_retencion_fuenteTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_retencion_fuenteTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_retencion_fuenteTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_retencion_fuenteTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_retencion_fuenteTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_retencion_fuenteTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_retencion_fuenteTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcon_secuencialTablaRetencion = new JLabelMe();
		this.jLabelcon_secuencialTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL+" : *");
		this.jLabelcon_secuencialTablaRetencion.setToolTipText("Con Secuencial");
		this.jLabelcon_secuencialTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_secuencialTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_secuencialTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_secuencialTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_secuencialTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_secuencialTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelcon_secuencialTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jCheckBoxcon_secuencialTablaRetencion= new JCheckBoxMe();
		jCheckBoxcon_secuencialTablaRetencion.setEnabled(false);

		jCheckBoxcon_secuencialTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencialTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencialTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_secuencialTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_secuencialTablaRetencionBusqueda= new JButtonMe();
		this.jButtoncon_secuencialTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencialTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencialTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_secuencialTablaRetencionBusqueda.setText("U");
		this.jButtoncon_secuencialTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_secuencialTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_secuencialTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_secuencialTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_secuencialTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_secuencialTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_secuencialTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcon_sub_total_facturaTablaRetencion = new JLabelMe();
		this.jLabelcon_sub_total_facturaTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA+" : *");
		this.jLabelcon_sub_total_facturaTablaRetencion.setToolTipText("Con Sub Total Factura");
		this.jLabelcon_sub_total_facturaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_sub_total_facturaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_sub_total_facturaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_sub_total_facturaTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_sub_total_facturaTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_sub_total_facturaTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelcon_sub_total_facturaTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jCheckBoxcon_sub_total_facturaTablaRetencion= new JCheckBoxMe();
		jCheckBoxcon_sub_total_facturaTablaRetencion.setEnabled(false);

		jCheckBoxcon_sub_total_facturaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sub_total_facturaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sub_total_facturaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_sub_total_facturaTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda= new JButtonMe();
		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setText("U");
		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_sub_total_facturaTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_sub_total_facturaTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_sub_total_facturaTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_sub_total_facturaTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_sub_total_facturaTablaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcon_iva_facturaTablaRetencion = new JLabelMe();
		this.jLabelcon_iva_facturaTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA+" : *");
		this.jLabelcon_iva_facturaTablaRetencion.setToolTipText("Con Iva Factura");
		this.jLabelcon_iva_facturaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_iva_facturaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_iva_facturaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_iva_facturaTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_iva_facturaTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_iva_facturaTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelcon_iva_facturaTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jCheckBoxcon_iva_facturaTablaRetencion= new JCheckBoxMe();
		jCheckBoxcon_iva_facturaTablaRetencion.setEnabled(false);

		jCheckBoxcon_iva_facturaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iva_facturaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iva_facturaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_iva_facturaTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_iva_facturaTablaRetencionBusqueda= new JButtonMe();
		this.jButtoncon_iva_facturaTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iva_facturaTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iva_facturaTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_iva_facturaTablaRetencionBusqueda.setText("U");
		this.jButtoncon_iva_facturaTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_iva_facturaTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_iva_facturaTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_iva_facturaTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_iva_facturaTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_iva_facturaTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_iva_facturaTablaRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTablaRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTablaRetencion = new JLabelMe();
		this.jLabelid_empresaTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTablaRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelid_empresaTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jComboBoxid_empresaTablaRetencion= new JComboBoxMe();
		jComboBoxid_empresaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTablaRetencion.setEnabled(false);

		this.jButtonid_empresaTablaRetencion= new JButtonMe();
		this.jButtonid_empresaTablaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaRetencion.setText("Buscar");
		this.jButtonid_empresaTablaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTablaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaRetencion"));

		this.jButtonid_empresaTablaRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTablaRetencionBusqueda.setText("U");
		this.jButtonid_empresaTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTablaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTablaRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaTablaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTablaRetencionUpdate.setText("U");
		this.jButtonid_empresaTablaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTablaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaRetencionUpdate"));



					
		this.jLabelid_tipo_retencionTablaRetencion = new JLabelMe();
		this.jLabelid_tipo_retencionTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionTablaRetencion.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelid_tipo_retencionTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jComboBoxid_tipo_retencionTablaRetencion= new JComboBoxMe();
		jComboBoxid_tipo_retencionTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionTablaRetencion= new JButtonMe();
		this.jButtonid_tipo_retencionTablaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTablaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTablaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTablaRetencion.setText("Buscar");
		this.jButtonid_tipo_retencionTablaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionTablaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTablaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTablaRetencion"));

		this.jButtonid_tipo_retencionTablaRetencionBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionTablaRetencionBusqueda.setText("U");
		this.jButtonid_tipo_retencionTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionTablaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionTablaRetencionUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionTablaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTablaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTablaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionTablaRetencionUpdate.setText("U");
		this.jButtonid_tipo_retencionTablaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionTablaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTablaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTablaRetencionUpdate"));



					
		this.jLabelid_cuenta_contable_debitoTablaRetencion = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoTablaRetencion.setToolTipText("Cuenta Contable Debito");
		this.jLabelid_cuenta_contable_debitoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jComboBoxid_cuenta_contable_debitoTablaRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoTablaRetencion= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoTablaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoTablaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoTablaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoTablaRetencion.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoTablaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoTablaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTablaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTablaRetencion"));

		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTablaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTablaRetencionUpdate"));


		jButtonid_cuenta_contable_debitoTablaRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoTablaRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoTablaRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoTablaRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoTablaRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoTablaRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoTablaRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTablaRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTablaRetencionArbol"));



					
		this.jLabelid_cuenta_contable_creditoTablaRetencion = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoTablaRetencion.setText(""+TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" :");
		this.jLabelid_cuenta_contable_creditoTablaRetencion.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoTablaRetencion.setToolTipText(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutTablaRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoTablaRetencion.setLayout(this.gridaBagLayoutTablaRetencion);


		jComboBoxid_cuenta_contable_creditoTablaRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoTablaRetencion= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTablaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTablaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTablaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTablaRetencion.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoTablaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoTablaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTablaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTablaRetencion"));

		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTablaRetencionBusqueda"));

		if(this.tablaretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTablaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTablaRetencionUpdate"));


		jButtonid_cuenta_contable_creditoTablaRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoTablaRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTablaRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTablaRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTablaRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoTablaRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoTablaRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTablaRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTablaRetencionArbol"));



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
		//this.jInternalFrameDetalleTablaRetencion = new TablaRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tabla Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTablaRetencion= new GridBagLayout();
		

		
		String sToolTipTablaRetencion="";
		sToolTipTablaRetencion=TablaRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTablaRetencion+="(Tesoreria.TablaRetencion)";
		}
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTablaRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTablaRetencion = new JButtonMe();
		this.jButtonModificarTablaRetencion = new JButtonMe();
        this.jButtonActualizarTablaRetencion = new JButtonMe();
        this.jButtonEliminarTablaRetencion = new JButtonMe();
        this.jButtonCancelarTablaRetencion = new JButtonMe();
        this.jButtonGuardarCambiosTablaRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTablaRetencion = new JButtonMe();
		this.jButtonCerrarTablaRetencion = new JButtonMe();
		
		this.jScrollPanelDatosTablaRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTablaRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralTablaRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tabla Retencion";
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Retencions" + this.sPath));
		} else {
			this.jScrollPanelDatosTablaRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTablaRetencion.setName("jPanelCamposTablaRetencion"); 

		this.jPanelCamposOcultosTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTablaRetencion.setName("jPanelCamposOcultosTablaRetencion"); 

        this.jPanelAccionesTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTablaRetencion.setToolTipText("Acciones");
        this.jPanelAccionesTablaRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTablaRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTablaRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTablaRetencion.setText("Nuevo");
		this.jButtonModificarTablaRetencion.setText("Editar");
        this.jButtonActualizarTablaRetencion.setText("Actualizar");
        this.jButtonEliminarTablaRetencion.setText("Eliminar");
        this.jButtonCancelarTablaRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosTablaRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTablaRetencion.setText("Guardar");
		this.jButtonCerrarTablaRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTablaRetencion,"nuevo_button","Nuevo",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTablaRetencion,"modificar_button","Editar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTablaRetencion,"actualizar_button","Actualizar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTablaRetencion,"eliminar_button","Eliminar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTablaRetencion,"cancelar_button","Cancelar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencion,"guardarcambios_button","Guardar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTablaRetencion,"guardarcambiostabla_button","Guardar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTablaRetencion,"cerrar_button","Salir",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTablaRetencion.setToolTipText("Nuevo"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTablaRetencion.setToolTipText("Editar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTablaRetencion.setToolTipText("Actualizar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTablaRetencion.setToolTipText("Eliminar)"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTablaRetencion.setToolTipText("Cancelar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTablaRetencion.setToolTipText("Guardar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTablaRetencion.setToolTipText("Guardar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTablaRetencion.setToolTipText("Salir"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTablaRetencion";
		inputMap = this.jButtonNuevoTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTablaRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTablaRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTablaRetencion";
		inputMap = this.jButtonActualizarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTablaRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarTablaRetencion";
		inputMap = this.jButtonEliminarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTablaRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarTablaRetencion";
		inputMap = this.jButtonCancelarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTablaRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarTablaRetencion";
		inputMap = this.jButtonCerrarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTablaRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTablaRetencion";
		inputMap = this.jButtonGuardarCambiosTablaTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTablaRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTablaRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTablaRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTablaRetencion.setToolTipText("Nuevo TablaRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTablaRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTablaRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTablaRetencion.setToolTipText("Sin Cerrar Ventana TablaRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTablaRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTablaRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTablaRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTablaRetencion.setText("Accion");
		this.jComboBoxTiposAccionesTablaRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTablaRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTablaRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTablaRetencion = new JLabelMe();
		
		this.jLabelAccionesTablaRetencion.setText("Acciones");		
		this.jLabelAccionesTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTablaRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTablaRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTablaRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTablaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTablaRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTablaRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTablaRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTablaRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTablaRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTablaRetencion = new GridBagLayout();
		
		this.jPanelCamposTablaRetencion.setLayout(gridaBagLayoutCamposTablaRetencion);
		this.jPanelCamposOcultosTablaRetencion.setLayout(gridaBagLayoutCamposOcultosTablaRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTablaRetencion.add(jLabelIdTablaRetencion, this.gridBagConstraintsTablaRetencion);



	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTablaRetencion.add(jLabelidTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTablaRetencion.add(jLabelid_empresaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTablaRetencion.add(jButtonid_empresaTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 3;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTablaRetencion.add(jButtonid_empresaTablaRetencionUpdate, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTablaRetencion.add(jComboBoxid_empresaTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTablaRetencion.add(jLabelcodigoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTablaRetencion.add(jButtoncodigoTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTablaRetencion.add(jTextFieldcodigoTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTablaRetencion.add(jLabelnombreTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTablaRetencion.add(jButtonnombreTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTablaRetencion.add(jscrollPanenombreTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeTablaRetencion.add(jLabelporcentajeTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeTablaRetencion.add(jButtonporcentajeTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeTablaRetencion.add(jTextFieldporcentajeTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_minimoTablaRetencion.add(jLabelmonto_minimoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_minimoTablaRetencion.add(jButtonmonto_minimoTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_minimoTablaRetencion.add(jTextFieldmonto_minimoTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionTablaRetencion.add(jLabelid_tipo_retencionTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionTablaRetencion.add(jButtonid_tipo_retencionTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 3;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionTablaRetencion.add(jButtonid_tipo_retencionTablaRetencionUpdate, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionTablaRetencion.add(jComboBoxid_tipo_retencionTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoTablaRetencion.add(jLabelid_cuenta_contable_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 2;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoTablaRetencion.add(jButtonid_cuenta_contable_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 3;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoTablaRetencion.add(jButtonid_cuenta_contable_debitoTablaRetencionArbol, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 4;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoTablaRetencion.add(jButtonid_cuenta_contable_debitoTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 5;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoTablaRetencion.add(jButtonid_cuenta_contable_debitoTablaRetencionUpdate, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoTablaRetencion.add(jComboBoxid_cuenta_contable_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoTablaRetencion.add(jLabelid_cuenta_contable_creditoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 2;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoTablaRetencion.add(jButtonid_cuenta_contable_creditoTablaRetencion, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 3;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoTablaRetencion.add(jButtonid_cuenta_contable_creditoTablaRetencionArbol, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 4;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTablaRetencion.add(jButtonid_cuenta_contable_creditoTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 5;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTablaRetencion.add(jButtonid_cuenta_contable_creditoTablaRetencionUpdate, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoTablaRetencion.add(jComboBoxid_cuenta_contable_creditoTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debitoTablaRetencion.add(jLabeles_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debitoTablaRetencion.add(jButtones_debitoTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debitoTablaRetencion.add(jCheckBoxes_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_retencion_fuenteTablaRetencion.add(jLabeles_retencion_fuenteTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_retencion_fuenteTablaRetencion.add(jButtones_retencion_fuenteTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_retencion_fuenteTablaRetencion.add(jCheckBoxes_retencion_fuenteTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_secuencialTablaRetencion.add(jLabelcon_secuencialTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_secuencialTablaRetencion.add(jButtoncon_secuencialTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_secuencialTablaRetencion.add(jCheckBoxcon_secuencialTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_sub_total_facturaTablaRetencion.add(jLabelcon_sub_total_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_sub_total_facturaTablaRetencion.add(jButtoncon_sub_total_facturaTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_sub_total_facturaTablaRetencion.add(jCheckBoxcon_sub_total_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 0;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_iva_facturaTablaRetencion.add(jLabelcon_iva_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 2;
		this.gridBagConstraintsTablaRetencion.ipadx = 0;
		this.gridBagConstraintsTablaRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_iva_facturaTablaRetencion.add(jButtoncon_iva_facturaTablaRetencionBusqueda, this.gridBagConstraintsTablaRetencion);
	}

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaRetencion.gridy = 0;
	this.gridBagConstraintsTablaRetencion.gridx = 1;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_iva_facturaTablaRetencion.add(jCheckBoxcon_iva_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelidTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelcodigoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelnombreTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelporcentajeTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelmonto_minimoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelid_tipo_retencionTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelid_cuenta_contable_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelid_cuenta_contable_creditoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPaneles_debitoTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPaneles_retencion_fuenteTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelcon_secuencialTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}

	iXPanelCamposTablaRetencion=0;
	iYPanelCamposTablaRetencion++;


	if(!iXPanelCamposTablaRetencion.equals(0)) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}

	JLabelMe jLabelTitulocon_sub_total_facturaTablaRetencion = new JLabelMe();
	jLabelTitulocon_sub_total_facturaTablaRetencion.setText("Aplica a Ingreso de Retenciones");
	jLabelTitulocon_sub_total_facturaTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulocon_sub_total_facturaTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulocon_sub_total_facturaTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulocon_sub_total_facturaTablaRetencion);

	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	this.gridBagConstraintsTablaRetencion.gridwidth = 1;
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(jLabelTitulocon_sub_total_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}

	if(!iXPanelCamposTablaRetencion.equals(0)) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}


	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelcon_sub_total_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaRetencion.add(this.jPanelcon_iva_facturaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposTablaRetencion % 1==0) {
		iXPanelCamposTablaRetencion=0;
		iYPanelCamposTablaRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaRetencion.gridy = iYPanelCamposOcultosTablaRetencion;
	this.gridBagConstraintsTablaRetencion.gridx = iXPanelCamposOcultosTablaRetencion++;
	this.gridBagConstraintsTablaRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaRetencion.add(this.jPanelid_empresaTablaRetencion, this.gridBagConstraintsTablaRetencion);



	if(iXPanelCamposOcultosTablaRetencion % 1==0) {
		iXPanelCamposOcultosTablaRetencion=0;
		iYPanelCamposOcultosTablaRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTablaRetencion= new GridBagLayout();
		this.jPanelAccionesTablaRetencion.setLayout(gridaBagLayoutAccionesTablaRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTablaRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioTablaRetencion.setLayout(gridaBagLayoutAccionesFormularioTablaRetencion);
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTablaRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTablaRetencion.add(this.jComboBoxTiposAccionesFormularioTablaRetencion, this.gridBagConstraintsTablaRetencion);

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTablaRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTablaRetencion.add(this.jCheckBoxPostAccionNuevoTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTablaRetencion.add(this.jCheckBoxPostAccionSinCerrarTablaRetencion, this.gridBagConstraintsTablaRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTablaRetencion.add(this.jCheckBoxPostAccionSinMensajeTablaRetencion, this.gridBagConstraintsTablaRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTablaRetencion.add(this.jButtonModificarTablaRetencion, this.gridBagConstraintsTablaRetencion);							

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTablaRetencion.add(this.jButtonEliminarTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = 0;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTablaRetencion.add(this.jButtonActualizarTablaRetencion, this.gridBagConstraintsTablaRetencion);


		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = 0;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTablaRetencion.add(this.jButtonGuardarCambiosTablaRetencion, this.gridBagConstraintsTablaRetencion);	
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = 0;		
		this.gridBagConstraintsTablaRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTablaRetencion.add(this.jButtonCancelarTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTablaRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTablaRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();						
			this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaRetencion.gridx = 0;		
			//this.gridBagConstraintsTablaRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTablaRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTablaRetencion.gridx =0;
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTablaRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTablaRetencion, this.gridBagConstraintsTablaRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTablaRetencion = new TablaRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tabla Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tabla Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tabla Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TablaRetencionModel tablaretencionModel=new TablaRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//TablaRetencionModel.TablaRetencionFocusTraversalPolicy tablaretencionFocusTraversalPolicy = tablaretencionModel.new TablaRetencionFocusTraversalPolicy(this);
			
			//tablaretencionFocusTraversalPolicy.settablaretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tablaretencionModel);
			
			
			this.jContentPaneDetalleTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTablaRetencion = new GridBagLayout();	
			this.jContentPaneDetalleTablaRetencion.setLayout(gridaBagLayoutDetalleTablaRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTablaRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
				this.gridBagConstraintsTablaRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTablaRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleTablaRetencion.add(jTtoolBarDetalleTablaRetencion, gridBagConstraintsTablaRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionTablaRetencion=   new JScrollPane(jContentPaneDetalleTablaRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTablaRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTablaRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTablaRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTablaRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTablaRetencion.gridx = 0;
	        
			this.jContentPaneDetalleTablaRetencion.add(jPanelCamposTablaRetencion, gridBagConstraintsTablaRetencion);
			
			
			
			
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
						&& tablaretencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTablaRetencion= new GridBagConstraints();
						this.gridBagConstraintsTablaRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTablaRetencion.gridx = 0;
						this.jContentPaneDetalleTablaRetencion.add(this.jTabbedPaneRelacionesTablaRetencion, this.gridBagConstraintsTablaRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTablaRetencion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTablaRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
					this.gridBagConstraintsTablaRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTablaRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTablaRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleTablaRetencion.add(jPanelCamposOcultosTablaRetencion, gridBagConstraintsTablaRetencion);
				
					this.jPanelCamposOcultosTablaRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTablaRetencion.gridx = 0;
	        this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTablaRetencion.add(this.jPanelAccionesFormularioTablaRetencion, this.gridBagConstraintsTablaRetencion);							
			
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
	        this.gridBagConstraintsTablaRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTablaRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleTablaRetencion.add(this.jPanelAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTablaRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTablaRetencion=   new JScrollPane(this.jPanelCamposTablaRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTablaRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTablaRetencion.gridx = 0;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTablaRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTablaRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTablaRetencion, this.gridBagConstraintsTablaRetencion);			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTablaRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTablaRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionTablaRetencion;
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
