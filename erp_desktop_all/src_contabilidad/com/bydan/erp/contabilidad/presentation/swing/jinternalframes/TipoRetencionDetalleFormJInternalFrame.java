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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoRetencionConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoRetencionDetalleFormJInternalFrame extends TipoRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRetencion;
	
	protected JMenuBar jmenuBarDetalleTipoRetencion;
	
	protected JMenu jmenuDetalleTipoRetencion;
	protected JMenu jmenuDetalleArchivoTipoRetencion;
	protected JMenu jmenuDetalleAccionesTipoRetencion;
	protected JMenu jmenuDetalleDatosTipoRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRetencion;	
	protected GridBagConstraints gridBagConstraintsTipoRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TipoRetencionSessionBean tiporetencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public TipoRetencionLogic tiporetencionLogic;
	
	public JScrollPane jScrollPanelDatosTipoRetencion;
	public JScrollPane jScrollPanelDatosEdicionTipoRetencion;
	public JScrollPane jScrollPanelDatosGeneralTipoRetencion;
	
	protected JPanel jPanelCamposTipoRetencion;    
	protected JPanel jPanelCamposOcultosTipoRetencion;    	
	protected JPanel jPanelAccionesTipoRetencion;
	protected JPanel jPanelAccionesFormularioTipoRetencion;
    
	
	
	protected Integer iXPanelCamposTipoRetencion=0;
	protected Integer iYPanelCamposTipoRetencion=0;
	
	protected Integer iXPanelCamposOcultosTipoRetencion=0;
	protected Integer iYPanelCamposOcultosTipoRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRetencion;
	public JButton jButtonModificarTipoRetencion;
	public JButton jButtonActualizarTipoRetencion;
    public JButton jButtonEliminarTipoRetencion;
	public JButton jButtonCancelarTipoRetencion;
    public JButton jButtonGuardarCambiosTipoRetencion;
	public JButton jButtonGuardarCambiosTablaTipoRetencion;
	protected JButton jButtonCerrarTipoRetencion;
	
	
	protected JButton jButtonProcesarInformacionTipoRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRetencion;
	protected JButton jButtonModificarToolBarTipoRetencion;
	protected JButton jButtonActualizarToolBarTipoRetencion;
    protected JButton jButtonEliminarToolBarTipoRetencion;
	protected JButton jButtonCancelarToolBarTipoRetencion;
    protected JButton jButtonGuardarCambiosToolBarTipoRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRetencion;
	protected JButton jButtonCerrarToolBarTipoRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRetencion;
	protected JMenuItem jMenuItemModificarTipoRetencion;
	protected JMenuItem jMenuItemActualizarTipoRetencion;
    protected JMenuItem jMenuItemEliminarTipoRetencion;
	protected JMenuItem jMenuItemCancelarTipoRetencion;
    protected JMenuItem jMenuItemGuardarCambiosTipoRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRetencion;
	protected JMenuItem jMenuItemCerrarTipoRetencion;
	protected JMenuItem jMenuItemDetalleCerrarTipoRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRetencion;
	protected JMenuItem jMenuItemMostrarOcultarTipoRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRetencion;
	public JLabel jLabelIdTipoRetencion;
	public JTextFieldMe jTextFieldidTipoRetencion;
	public JButton jButtonidTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRetencion;
	public JLabel jLabelnombreTipoRetencion;
	public JTextArea jTextAreanombreTipoRetencion;
	public JScrollPane jscrollPanenombreTipoRetencion;
	public JButton jButtonnombreTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRetencion;
	public JLabel jLabelcodigoTipoRetencion;
	public JTextField jTextFieldcodigoTipoRetencion;
	public JButton jButtoncodigoTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeTipoRetencion;
	public JLabel jLabelporcentajeTipoRetencion;
	public JTextField jTextFieldporcentajeTipoRetencion;
	public JButton jButtonporcentajeTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelmonto_minimoTipoRetencion;
	public JLabel jLabelmonto_minimoTipoRetencion;
	public JTextField jTextFieldmonto_minimoTipoRetencion;
	public JButton jButtonmonto_minimoTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_retencion_ivaTipoRetencion;
	public JLabel jLabeles_retencion_ivaTipoRetencion;
	public JCheckBox jCheckBoxes_retencion_ivaTipoRetencion;
	public JButton jButtones_retencion_ivaTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_debitoTipoRetencion;
	public JLabel jLabeles_debitoTipoRetencion;
	public JCheckBox jCheckBoxes_debitoTipoRetencion;
	public JButton jButtones_debitoTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_con_iva_facturaTipoRetencion;
	public JLabel jLabeles_con_iva_facturaTipoRetencion;
	public JCheckBox jCheckBoxes_con_iva_facturaTipoRetencion;
	public JButton jButtones_con_iva_facturaTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_con_sub_total_facturaTipoRetencion;
	public JLabel jLabeles_con_sub_total_facturaTipoRetencion;
	public JCheckBox jCheckBoxes_con_sub_total_facturaTipoRetencion;
	public JButton jButtones_con_sub_total_facturaTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPaneles_con_secuencialTipoRetencion;
	public JLabel jLabeles_con_secuencialTipoRetencion;
	public JCheckBox jCheckBoxes_con_secuencialTipoRetencion;
	public JButton jButtones_con_secuencialTipoRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRetencion;
	public JLabel jLabelid_empresaTipoRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRetencion;
	public JButton jButtonid_empresaTipoRetencion= new JButtonMe();
	public JButton jButtonid_empresaTipoRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableTipoRetencion;
	public JLabel jLabelid_cuenta_contableTipoRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableTipoRetencion;
	public JButton jButtonid_cuenta_contableTipoRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoRetencionArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoTipoRetencion;
	public JLabel jLabelid_cuenta_contable_creditoTipoRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoTipoRetencion;
	public JButton jButtonid_cuenta_contable_creditoTipoRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRetencion;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRetencion=new JPanel();
				this.jPanelAccionesFormularioTipoRetencion=new JPanel();
				this.jmenuBarDetalleTipoRetencion=new JMenuBar();
				this.jTtoolBarDetalleTipoRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRetencion() {
		return this.jButtonActualizarToolBarTipoRetencion;
	}
	
	public JButton getjButtonEliminarToolBarTipoRetencion() {
		return this.jButtonEliminarToolBarTipoRetencion;
	}
	
	public JButton getjButtonCancelarToolBarTipoRetencion() {
		return this.jButtonCancelarToolBarTipoRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRetencion() {
		return this.jButtonProcesarInformacionTipoRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRetencion)	{
		this.jButtonProcesarInformacionTipoRetencion = jButtonProcesarInformacionTipoRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRetencion() {
		return this.jComboBoxTiposAccionesTipoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRetencion(
			JComboBox jComboBoxTiposRelacionesTipoRetencion) {
		this.jComboBoxTiposRelacionesTipoRetencion = jComboBoxTiposRelacionesTipoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRetencion(
			JComboBox jComboBoxTiposAccionesTipoRetencion) {
		this.jComboBoxTiposAccionesTipoRetencion = jComboBoxTiposAccionesTipoRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRetencion() {
		return this.jComboBoxTiposAccionesFormularioTipoRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRetencion(
			JComboBox jComboBoxTiposAccionesFormularioTipoRetencion) {
		this.jComboBoxTiposAccionesFormularioTipoRetencion = jComboBoxTiposAccionesFormularioTipoRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporetencionSessionBean=new TipoRetencionSessionBean();
		
		this.tiporetencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporetencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Retencion  MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRetencion=new JButtonMe();
				this.jButtonModificarToolBarTipoRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRetencion,this.jTtoolBarDetalleTipoRetencion,
							"actualizar","actualizar","Actualizar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRetencion,this.jTtoolBarDetalleTipoRetencion,
							"eliminar","eliminar","Eliminar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRetencion,this.jTtoolBarDetalleTipoRetencion,
							"cancelar","cancelar","Cancelar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRetencion,this.jTtoolBarDetalleTipoRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRetencion.add(this.jMenuItemDetalleCerrarTipoRetencion);
		
		this.jmenuDetalleAccionesTipoRetencion.add(this.jMenuItemActualizarTipoRetencion);
		this.jmenuDetalleAccionesTipoRetencion.add(this.jMenuItemEliminarTipoRetencion);
		this.jmenuDetalleAccionesTipoRetencion.add(this.jMenuItemCancelarTipoRetencion);		
		
		//this.jmenuDetalleDatosTipoRetencion.add(this.jMenuItemDetalleAbrirOrderByTipoRetencion);				
		this.jmenuDetalleDatosTipoRetencion.add(this.jMenuItemDetalleMostarOcultarTipoRetencion);				
				
		//this.jmenuDetalleAccionesTipoRetencion.add(this.jMenuItemGuardarCambiosTipoRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRetencion.add(this.jmenuDetalleArchivoTipoRetencion);		
		this.jmenuBarDetalleTipoRetencion.add(this.jmenuDetalleAccionesTipoRetencion);		
		this.jmenuBarDetalleTipoRetencion.add(this.jmenuDetalleDatosTipoRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRetencion);				
	}
	
	
	public void inicializarElementosCamposTipoRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRetencion = new JLabelMe();
		jLabelIdTipoRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRetencion= new GridBagLayout();

		this.jPanelidTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);

		jTextFieldidTipoRetencion = new JTextFieldMe();
		jTextFieldidTipoRetencion.setText("Id");

		jTextFieldidTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoRetencion = new JLabelMe();
		this.jLabelnombreTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRetencion.setToolTipText("Nombre");
		this.jLabelnombreTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelnombreTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jTextAreanombreTipoRetencion= new JTextAreaMe();
		jTextAreanombreTipoRetencion.setEnabled(false);
		jTextAreanombreTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencion.setLineWrap(true);
		jTextAreanombreTipoRetencion.setWrapStyleWord(true);
		jTextAreanombreTipoRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRetencion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRetencion = new JScrollPane(jTextAreanombreTipoRetencion);
		jscrollPanenombreTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoRetencionBusqueda= new JButtonMe();
		this.jButtonnombreTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRetencionBusqueda.setText("U");
		this.jButtonnombreTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcodigoTipoRetencion = new JLabelMe();
		this.jLabelcodigoTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRetencion.setToolTipText("Codigo Sri");
		this.jLabelcodigoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelcodigoTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jTextFieldcodigoTipoRetencion= new JTextFieldMe();

		jTextFieldcodigoTipoRetencion.setEnabled(false);
		jTextFieldcodigoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRetencionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRetencionBusqueda.setText("U");
		this.jButtoncodigoTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeTipoRetencion = new JLabelMe();
		this.jLabelporcentajeTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeTipoRetencion.setToolTipText("Porcentaje");
		this.jLabelporcentajeTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelporcentajeTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jTextFieldporcentajeTipoRetencion= new JTextFieldMe();
		jTextFieldporcentajeTipoRetencion.setEnabled(false);
		jTextFieldporcentajeTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeTipoRetencion.setText("0.0");

		this.jButtonporcentajeTipoRetencionBusqueda= new JButtonMe();
		this.jButtonporcentajeTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeTipoRetencionBusqueda.setText("U");
		this.jButtonporcentajeTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabelmonto_minimoTipoRetencion = new JLabelMe();
		this.jLabelmonto_minimoTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO+" : *");
		this.jLabelmonto_minimoTipoRetencion.setToolTipText("Monto Minimo");
		this.jLabelmonto_minimoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_minimoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_minimoTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_minimoTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelmonto_minimoTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jTextFieldmonto_minimoTipoRetencion= new JTextFieldMe();
		jTextFieldmonto_minimoTipoRetencion.setEnabled(false);
		jTextFieldmonto_minimoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_minimoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_minimoTipoRetencion.setText("0.0");

		this.jButtonmonto_minimoTipoRetencionBusqueda= new JButtonMe();
		this.jButtonmonto_minimoTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_minimoTipoRetencionBusqueda.setText("U");
		this.jButtonmonto_minimoTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_minimoTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_minimoTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_minimoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_minimoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_minimoTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_minimoTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_retencion_ivaTipoRetencion = new JLabelMe();
		this.jLabeles_retencion_ivaTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA+" : *");
		this.jLabeles_retencion_ivaTipoRetencion.setToolTipText("Es Retencion Iva");
		this.jLabeles_retencion_ivaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_ivaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_ivaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_retencion_ivaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_retencion_ivaTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_retencion_ivaTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPaneles_retencion_ivaTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jCheckBoxes_retencion_ivaTipoRetencion= new JCheckBoxMe();
		jCheckBoxes_retencion_ivaTipoRetencion.setEnabled(false);

		jCheckBoxes_retencion_ivaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_ivaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_ivaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_retencion_ivaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_retencion_ivaTipoRetencionBusqueda= new JButtonMe();
		this.jButtones_retencion_ivaTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_ivaTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_ivaTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_retencion_ivaTipoRetencionBusqueda.setText("U");
		this.jButtones_retencion_ivaTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_retencion_ivaTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_retencion_ivaTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_retencion_ivaTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_retencion_ivaTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_retencion_ivaTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_retencion_ivaTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_debitoTipoRetencion = new JLabelMe();
		this.jLabeles_debitoTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_ESDEBITO+" : *");
		this.jLabeles_debitoTipoRetencion.setToolTipText("Es Debito");
		this.jLabeles_debitoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debitoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debitoTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debitoTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_ESDEBITO);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPaneles_debitoTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jCheckBoxes_debitoTipoRetencion= new JCheckBoxMe();
		jCheckBoxes_debitoTipoRetencion.setEnabled(false);

		jCheckBoxes_debitoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debitoTipoRetencionBusqueda= new JButtonMe();
		this.jButtones_debitoTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debitoTipoRetencionBusqueda.setText("U");
		this.jButtones_debitoTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debitoTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debitoTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debitoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debitoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debitoTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debitoTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_con_iva_facturaTipoRetencion = new JLabelMe();
		this.jLabeles_con_iva_facturaTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA+" : *");
		this.jLabeles_con_iva_facturaTipoRetencion.setToolTipText("Con Iva Factura");
		this.jLabeles_con_iva_facturaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_con_iva_facturaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_con_iva_facturaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_con_iva_facturaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_con_iva_facturaTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_con_iva_facturaTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPaneles_con_iva_facturaTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jCheckBoxes_con_iva_facturaTipoRetencion= new JCheckBoxMe();
		jCheckBoxes_con_iva_facturaTipoRetencion.setEnabled(false);

		jCheckBoxes_con_iva_facturaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_iva_facturaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_iva_facturaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_con_iva_facturaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_con_iva_facturaTipoRetencionBusqueda= new JButtonMe();
		this.jButtones_con_iva_facturaTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_iva_facturaTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_iva_facturaTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_con_iva_facturaTipoRetencionBusqueda.setText("U");
		this.jButtones_con_iva_facturaTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_con_iva_facturaTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_con_iva_facturaTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_con_iva_facturaTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_con_iva_facturaTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_con_iva_facturaTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_con_iva_facturaTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_con_sub_total_facturaTipoRetencion = new JLabelMe();
		this.jLabeles_con_sub_total_facturaTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA+" : *");
		this.jLabeles_con_sub_total_facturaTipoRetencion.setToolTipText("Con Sub Total Factura");
		this.jLabeles_con_sub_total_facturaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeles_con_sub_total_facturaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeles_con_sub_total_facturaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_con_sub_total_facturaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_con_sub_total_facturaTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_con_sub_total_facturaTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPaneles_con_sub_total_facturaTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jCheckBoxes_con_sub_total_facturaTipoRetencion= new JCheckBoxMe();
		jCheckBoxes_con_sub_total_facturaTipoRetencion.setEnabled(false);

		jCheckBoxes_con_sub_total_facturaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_sub_total_facturaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_sub_total_facturaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_con_sub_total_facturaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda= new JButtonMe();
		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setText("U");
		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_con_sub_total_facturaTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_con_sub_total_facturaTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_con_sub_total_facturaTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_con_sub_total_facturaTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_con_sub_total_facturaTipoRetencionBusqueda.setVisible(false);		}


					
		this.jLabeles_con_secuencialTipoRetencion = new JLabelMe();
		this.jLabeles_con_secuencialTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL+" : *");
		this.jLabeles_con_secuencialTipoRetencion.setToolTipText("Con Secuencial");
		this.jLabeles_con_secuencialTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_con_secuencialTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_con_secuencialTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_con_secuencialTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_con_secuencialTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_con_secuencialTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPaneles_con_secuencialTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jCheckBoxes_con_secuencialTipoRetencion= new JCheckBoxMe();
		jCheckBoxes_con_secuencialTipoRetencion.setEnabled(false);

		jCheckBoxes_con_secuencialTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_secuencialTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_secuencialTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_con_secuencialTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_con_secuencialTipoRetencionBusqueda= new JButtonMe();
		this.jButtones_con_secuencialTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_secuencialTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_secuencialTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_con_secuencialTipoRetencionBusqueda.setText("U");
		this.jButtones_con_secuencialTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_con_secuencialTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_con_secuencialTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_con_secuencialTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_con_secuencialTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_con_secuencialTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_con_secuencialTipoRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRetencion = new JLabelMe();
		this.jLabelid_empresaTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelid_empresaTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jComboBoxid_empresaTipoRetencion= new JComboBoxMe();
		jComboBoxid_empresaTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRetencion.setEnabled(false);

		this.jButtonid_empresaTipoRetencion= new JButtonMe();
		this.jButtonid_empresaTipoRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRetencion.setText("Buscar");
		this.jButtonid_empresaTipoRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRetencion"));

		this.jButtonid_empresaTipoRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRetencionBusqueda.setText("U");
		this.jButtonid_empresaTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRetencionUpdate.setText("U");
		this.jButtonid_empresaTipoRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRetencionUpdate"));



					
		this.jLabelid_cuenta_contableTipoRetencion = new JLabelMe();
		this.jLabelid_cuenta_contableTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableTipoRetencion.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contableTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jComboBoxid_cuenta_contableTipoRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contableTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableTipoRetencion= new JButtonMe();
		this.jButtonid_cuenta_contableTipoRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoRetencion.setText("Buscar");
		this.jButtonid_cuenta_contableTipoRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableTipoRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencion"));

		this.jButtonid_cuenta_contableTipoRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contableTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableTipoRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableTipoRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableTipoRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contableTipoRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableTipoRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionUpdate"));


		jButtonid_cuenta_contableTipoRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contableTipoRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contableTipoRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableTipoRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionArbol"));



					
		this.jLabelid_cuenta_contable_creditoTipoRetencion = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoTipoRetencion.setText(""+TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoTipoRetencion.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoTipoRetencion.setToolTipText(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutTipoRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoTipoRetencion.setLayout(this.gridaBagLayoutTipoRetencion);


		jComboBoxid_cuenta_contable_creditoTipoRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoTipoRetencion= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoRetencion.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoTipoRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoTipoRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencion"));

		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionBusqueda"));

		if(this.tiporetencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionUpdate"));


		jButtonid_cuenta_contable_creditoTipoRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoTipoRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoTipoRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoTipoRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionArbol"));



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
		//this.jInternalFrameDetalleTipoRetencion = new TipoRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Retencion  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRetencion= new GridBagLayout();
		

		
		String sToolTipTipoRetencion="";
		sToolTipTipoRetencion=TipoRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRetencion+="(Contabilidad.TipoRetencion)";
		}
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRetencion = new JButtonMe();
		this.jButtonModificarTipoRetencion = new JButtonMe();
        this.jButtonActualizarTipoRetencion = new JButtonMe();
        this.jButtonEliminarTipoRetencion = new JButtonMe();
        this.jButtonCancelarTipoRetencion = new JButtonMe();
        this.jButtonGuardarCambiosTipoRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRetencion = new JButtonMe();
		this.jButtonCerrarTipoRetencion = new JButtonMe();
		
		this.jScrollPanelDatosTipoRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Retencion ";
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRetencion.setName("jPanelCamposTipoRetencion"); 

		this.jPanelCamposOcultosTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRetencion.setName("jPanelCamposOcultosTipoRetencion"); 

        this.jPanelAccionesTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesTipoRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRetencion.setText("Nuevo");
		this.jButtonModificarTipoRetencion.setText("Editar");
        this.jButtonActualizarTipoRetencion.setText("Actualizar");
        this.jButtonEliminarTipoRetencion.setText("Eliminar");
        this.jButtonCancelarTipoRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRetencion.setText("Guardar");
		this.jButtonCerrarTipoRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRetencion,"nuevo_button","Nuevo",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRetencion,"modificar_button","Editar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRetencion,"actualizar_button","Actualizar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRetencion,"eliminar_button","Eliminar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRetencion,"cancelar_button","Cancelar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRetencion,"guardarcambios_button","Guardar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRetencion,"guardarcambiostabla_button","Guardar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRetencion,"cerrar_button","Salir",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRetencion.setToolTipText("Nuevo"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRetencion.setToolTipText("Editar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRetencion.setToolTipText("Actualizar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRetencion.setToolTipText("Eliminar)"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRetencion.setToolTipText("Cancelar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRetencion.setToolTipText("Guardar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRetencion.setToolTipText("Guardar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRetencion.setToolTipText("Salir"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRetencion";
		inputMap = this.jButtonNuevoTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRetencion";
		inputMap = this.jButtonActualizarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRetencion";
		inputMap = this.jButtonEliminarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRetencion";
		inputMap = this.jButtonCancelarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRetencion";
		inputMap = this.jButtonCerrarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRetencion";
		inputMap = this.jButtonGuardarCambiosTablaTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRetencion.setToolTipText("Nuevo TipoRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRetencion.setToolTipText("Sin Cerrar Ventana TipoRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRetencion.setText("Accion");
		this.jComboBoxTiposAccionesTipoRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRetencion = new JLabelMe();
		
		this.jLabelAccionesTipoRetencion.setText("Acciones");		
		this.jLabelAccionesTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRetencion = new GridBagLayout();
		
		this.jPanelCamposTipoRetencion.setLayout(gridaBagLayoutCamposTipoRetencion);
		this.jPanelCamposOcultosTipoRetencion.setLayout(gridaBagLayoutCamposOcultosTipoRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRetencion.add(jLabelIdTipoRetencion, this.gridBagConstraintsTipoRetencion);



	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRetencion.add(jTextFieldidTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRetencion.add(jLabelid_empresaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRetencion.add(jButtonid_empresaTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 3;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRetencion.add(jButtonid_empresaTipoRetencionUpdate, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRetencion.add(jComboBoxid_empresaTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRetencion.add(jLabelnombreTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRetencion.add(jButtonnombreTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRetencion.add(jscrollPanenombreTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRetencion.add(jLabelcodigoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRetencion.add(jButtoncodigoTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRetencion.add(jTextFieldcodigoTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeTipoRetencion.add(jLabelporcentajeTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeTipoRetencion.add(jButtonporcentajeTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeTipoRetencion.add(jTextFieldporcentajeTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_minimoTipoRetencion.add(jLabelmonto_minimoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_minimoTipoRetencion.add(jButtonmonto_minimoTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_minimoTipoRetencion.add(jTextFieldmonto_minimoTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableTipoRetencion.add(jLabelid_cuenta_contableTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 2;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTipoRetencion.add(jButtonid_cuenta_contableTipoRetencion, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 3;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTipoRetencion.add(jButtonid_cuenta_contableTipoRetencionArbol, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 4;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoRetencion.add(jButtonid_cuenta_contableTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 5;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoRetencion.add(jButtonid_cuenta_contableTipoRetencionUpdate, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableTipoRetencion.add(jComboBoxid_cuenta_contableTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoTipoRetencion.add(jLabelid_cuenta_contable_creditoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 2;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoTipoRetencion.add(jButtonid_cuenta_contable_creditoTipoRetencion, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 3;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoTipoRetencion.add(jButtonid_cuenta_contable_creditoTipoRetencionArbol, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 4;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTipoRetencion.add(jButtonid_cuenta_contable_creditoTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 5;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTipoRetencion.add(jButtonid_cuenta_contable_creditoTipoRetencionUpdate, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoTipoRetencion.add(jComboBoxid_cuenta_contable_creditoTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_retencion_ivaTipoRetencion.add(jLabeles_retencion_ivaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_retencion_ivaTipoRetencion.add(jButtones_retencion_ivaTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_retencion_ivaTipoRetencion.add(jCheckBoxes_retencion_ivaTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debitoTipoRetencion.add(jLabeles_debitoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debitoTipoRetencion.add(jButtones_debitoTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debitoTipoRetencion.add(jCheckBoxes_debitoTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_con_iva_facturaTipoRetencion.add(jLabeles_con_iva_facturaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_con_iva_facturaTipoRetencion.add(jButtones_con_iva_facturaTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_con_iva_facturaTipoRetencion.add(jCheckBoxes_con_iva_facturaTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_con_sub_total_facturaTipoRetencion.add(jLabeles_con_sub_total_facturaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_con_sub_total_facturaTipoRetencion.add(jButtones_con_sub_total_facturaTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_con_sub_total_facturaTipoRetencion.add(jCheckBoxes_con_sub_total_facturaTipoRetencion, this.gridBagConstraintsTipoRetencion);


	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 0;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_con_secuencialTipoRetencion.add(jLabeles_con_secuencialTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 2;
		this.gridBagConstraintsTipoRetencion.ipadx = 0;
		this.gridBagConstraintsTipoRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_con_secuencialTipoRetencion.add(jButtones_con_secuencialTipoRetencionBusqueda, this.gridBagConstraintsTipoRetencion);
	}

	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencion.gridy = 0;
	this.gridBagConstraintsTipoRetencion.gridx = 1;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_con_secuencialTipoRetencion.add(jCheckBoxes_con_secuencialTipoRetencion, this.gridBagConstraintsTipoRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelidTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelnombreTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelcodigoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelporcentajeTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelmonto_minimoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelid_cuenta_contableTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPanelid_cuenta_contable_creditoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPaneles_retencion_ivaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPaneles_debitoTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPaneles_con_iva_facturaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPaneles_con_sub_total_facturaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencion.add(this.jPaneles_con_secuencialTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposTipoRetencion % 1==0) {
		iXPanelCamposTipoRetencion=0;
		iYPanelCamposTipoRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencion.gridy = iYPanelCamposOcultosTipoRetencion;
	this.gridBagConstraintsTipoRetencion.gridx = iXPanelCamposOcultosTipoRetencion++;
	this.gridBagConstraintsTipoRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRetencion.add(this.jPanelid_empresaTipoRetencion, this.gridBagConstraintsTipoRetencion);



	if(iXPanelCamposOcultosTipoRetencion % 1==0) {
		iXPanelCamposOcultosTipoRetencion=0;
		iYPanelCamposOcultosTipoRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRetencion= new GridBagLayout();
		this.jPanelAccionesTipoRetencion.setLayout(gridaBagLayoutAccionesTipoRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRetencion.setLayout(gridaBagLayoutAccionesFormularioTipoRetencion);
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRetencion.add(this.jComboBoxTiposAccionesFormularioTipoRetencion, this.gridBagConstraintsTipoRetencion);

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRetencion.add(this.jCheckBoxPostAccionNuevoTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporetencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRetencion.add(this.jCheckBoxPostAccionSinCerrarTipoRetencion, this.gridBagConstraintsTipoRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporetencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRetencion.add(this.jCheckBoxPostAccionSinMensajeTipoRetencion, this.gridBagConstraintsTipoRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRetencion.add(this.jButtonModificarTipoRetencion, this.gridBagConstraintsTipoRetencion);							

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRetencion.add(this.jButtonEliminarTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = 0;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRetencion.add(this.jButtonActualizarTipoRetencion, this.gridBagConstraintsTipoRetencion);


		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = 0;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRetencion.add(this.jButtonGuardarCambiosTipoRetencion, this.gridBagConstraintsTipoRetencion);	
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = 0;		
		this.gridBagConstraintsTipoRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRetencion.add(this.jButtonCancelarTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();						
			this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencion.gridx = 0;		
			//this.gridBagConstraintsTipoRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencion.gridx =0;
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRetencion, this.gridBagConstraintsTipoRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRetencion = new TipoRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Retencion  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Retencion  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Retencion  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRetencionModel tiporetencionModel=new TipoRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRetencionModel.TipoRetencionFocusTraversalPolicy tiporetencionFocusTraversalPolicy = tiporetencionModel.new TipoRetencionFocusTraversalPolicy(this);
			
			//tiporetencionFocusTraversalPolicy.settiporetencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporetencionModel);
			
			
			this.jContentPaneDetalleTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRetencion = new GridBagLayout();	
			this.jContentPaneDetalleTipoRetencion.setLayout(gridaBagLayoutDetalleTipoRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRetencion.add(jTtoolBarDetalleTipoRetencion, gridBagConstraintsTipoRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRetencion=   new JScrollPane(jContentPaneDetalleTipoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRetencion.gridx = 0;
	        
			this.jContentPaneDetalleTipoRetencion.add(jPanelCamposTipoRetencion, gridBagConstraintsTipoRetencion);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tiporetencionSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRetencion= new GridBagConstraints();
						this.gridBagConstraintsTipoRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRetencion.gridx = 0;
						this.jContentPaneDetalleTipoRetencion.add(this.jTabbedPaneRelacionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRetencion.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
					this.gridBagConstraintsTipoRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRetencion.add(jPanelCamposOcultosTipoRetencion, gridBagConstraintsTipoRetencion);
				
					this.jPanelCamposOcultosTipoRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoRetencion.gridx = 0;
	        this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRetencion.add(this.jPanelAccionesFormularioTipoRetencion, this.gridBagConstraintsTipoRetencion);							
			
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
	        this.gridBagConstraintsTipoRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRetencion.add(this.jPanelAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRetencion=   new JScrollPane(this.jPanelCamposTipoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencion.gridx = 0;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRetencion, this.gridBagConstraintsTipoRetencion);			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRetencion;
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
